package com.crashlytics.android.answers;

import android.content.Context;
import android.util.Log;
import com.crashlytics.android.answers.SessionEvent;
import i.a.a.a.a;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l.a.a.a.k;
import l.a.a.a.o.b.g;
import l.a.a.a.o.b.i;
import l.a.a.a.o.d.f;
import l.a.a.a.o.d.h;
import l.a.a.a.o.e.c;
import l.a.a.a.o.g.b;

public class EnabledSessionAnalyticsManagerStrategy implements SessionAnalyticsManagerStrategy {
    public static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
    public g apiKey = new g();
    public final Context context;
    public boolean customEventsEnabled = true;
    public EventFilter eventFilter = new KeepAllEventFilter();
    public final ScheduledExecutorService executorService;
    public final SessionAnalyticsFilesManager filesManager;
    public f filesSender;
    public final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
    public boolean forwardToFirebaseAnalyticsEnabled = false;
    public final c httpRequestFactory;
    public boolean includePurchaseEventsInForwardedEvents = false;
    public final k kit;
    public final SessionEventMetadata metadata;
    public boolean predefinedEventsEnabled = true;
    public final AtomicReference<ScheduledFuture<?>> rolloverFutureRef = new AtomicReference<>();
    public volatile int rolloverIntervalSeconds = -1;

    public EnabledSessionAnalyticsManagerStrategy(k kVar, Context context2, ScheduledExecutorService scheduledExecutorService, SessionAnalyticsFilesManager sessionAnalyticsFilesManager, c cVar, SessionEventMetadata sessionEventMetadata, FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter2) {
        this.kit = kVar;
        this.context = context2;
        this.executorService = scheduledExecutorService;
        this.filesManager = sessionAnalyticsFilesManager;
        this.httpRequestFactory = cVar;
        this.metadata = sessionEventMetadata;
        this.firebaseAnalyticsApiAdapter = firebaseAnalyticsApiAdapter2;
    }

    public void cancelTimeBasedFileRollOver() {
        if (this.rolloverFutureRef.get() != null) {
            i.b(this.context, "Cancelling time-based rollover because no events are currently being generated.");
            this.rolloverFutureRef.get().cancel(false);
            this.rolloverFutureRef.set((Object) null);
        }
    }

    public void deleteAllEvents() {
        this.filesManager.deleteAllEventsFiles();
    }

    public void processEvent(SessionEvent.Builder builder) {
        SessionEvent build = builder.build(this.metadata);
        if (!this.customEventsEnabled && SessionEvent.Type.CUSTOM.equals(build.type)) {
            String str = "Custom events tracking disabled - skipping event: " + build;
            if (l.a.a.a.f.a().a(Answers.TAG, 3)) {
                Log.d(Answers.TAG, str, (Throwable) null);
            }
        } else if (!this.predefinedEventsEnabled && SessionEvent.Type.PREDEFINED.equals(build.type)) {
            String str2 = "Predefined events tracking disabled - skipping event: " + build;
            if (l.a.a.a.f.a().a(Answers.TAG, 3)) {
                Log.d(Answers.TAG, str2, (Throwable) null);
            }
        } else if (this.eventFilter.skipEvent(build)) {
            String str3 = "Skipping filtered event: " + build;
            if (l.a.a.a.f.a().a(Answers.TAG, 3)) {
                Log.d(Answers.TAG, str3, (Throwable) null);
            }
        } else {
            try {
                this.filesManager.writeEvent(build);
            } catch (IOException e) {
                String str4 = "Failed to write event: " + build;
                if (l.a.a.a.f.a().a(Answers.TAG, 6)) {
                    Log.e(Answers.TAG, str4, e);
                }
            }
            scheduleTimeBasedRollOverIfNeeded();
            boolean z = SessionEvent.Type.CUSTOM.equals(build.type) || SessionEvent.Type.PREDEFINED.equals(build.type);
            boolean equals = PurchaseEvent.TYPE.equals(build.predefinedType);
            if (this.forwardToFirebaseAnalyticsEnabled && z) {
                if (!equals || this.includePurchaseEventsInForwardedEvents) {
                    try {
                        this.firebaseAnalyticsApiAdapter.processEvent(build);
                    } catch (Exception e2) {
                        String str5 = "Failed to map event to Firebase: " + build;
                        if (l.a.a.a.f.a().a(Answers.TAG, 6)) {
                            Log.e(Answers.TAG, str5, e2);
                        }
                    }
                }
            }
        }
    }

    public boolean rollFileOver() {
        try {
            return this.filesManager.rollFileOver();
        } catch (IOException unused) {
            i.c(this.context, "Failed to roll file over.");
            return false;
        }
    }

    public void scheduleTimeBasedFileRollOver(long j2, long j3) {
        if (this.rolloverFutureRef.get() == null) {
            h hVar = new h(this.context, this);
            Context context2 = this.context;
            i.b(context2, "Scheduling time based file roll over every " + j3 + " seconds");
            try {
                this.rolloverFutureRef.set(this.executorService.scheduleAtFixedRate(hVar, j2, j3, TimeUnit.SECONDS));
            } catch (RejectedExecutionException unused) {
                i.c(this.context, "Failed to schedule time based file roll over");
            }
        }
    }

    public void scheduleTimeBasedRollOverIfNeeded() {
        if (this.rolloverIntervalSeconds != -1) {
            scheduleTimeBasedFileRollOver((long) this.rolloverIntervalSeconds, (long) this.rolloverIntervalSeconds);
        }
    }

    public void sendEvents() {
        if (this.filesSender == null) {
            i.b(this.context, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        i.b(this.context, "Sending all files");
        List<File> batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
        int i2 = 0;
        while (true) {
            try {
                if (batchOfFilesToSend.size() <= 0) {
                    break;
                }
                i.b(this.context, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(batchOfFilesToSend.size())}));
                boolean send = this.filesSender.send(batchOfFilesToSend);
                if (send) {
                    i2 += batchOfFilesToSend.size();
                    this.filesManager.deleteSentFiles(batchOfFilesToSend);
                }
                if (!send) {
                    break;
                }
                batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
            } catch (Exception e) {
                Context context2 = this.context;
                StringBuilder a = a.a("Failed to send batch of analytics files to server: ");
                a.append(e.getMessage());
                i.c(context2, a.toString());
            }
        }
        if (i2 == 0) {
            this.filesManager.deleteOldestInRollOverIfOverMax();
        }
    }

    public void setAnalyticsSettingsData(b bVar, String str) {
        String str2;
        String str3;
        this.filesSender = AnswersRetryFilesSender.build(new SessionAnalyticsFilesSender(this.kit, str, bVar.a, this.httpRequestFactory, this.apiKey.c(this.context)));
        this.filesManager.setAnalyticsSettingsData(bVar);
        this.forwardToFirebaseAnalyticsEnabled = bVar.e;
        this.includePurchaseEventsInForwardedEvents = bVar.f5162f;
        l.a.a.a.c a = l.a.a.a.f.a();
        StringBuilder a2 = a.a("Firebase analytics forwarding ");
        String str4 = "enabled";
        a2.append(this.forwardToFirebaseAnalyticsEnabled ? str4 : "disabled");
        String sb = a2.toString();
        if (a.a(Answers.TAG, 3)) {
            Log.d(Answers.TAG, sb, (Throwable) null);
        }
        l.a.a.a.c a3 = l.a.a.a.f.a();
        StringBuilder a4 = a.a("Firebase analytics including purchase events ");
        if (this.includePurchaseEventsInForwardedEvents) {
            str2 = str4;
        } else {
            str2 = "disabled";
        }
        a4.append(str2);
        String sb2 = a4.toString();
        if (a3.a(Answers.TAG, 3)) {
            Log.d(Answers.TAG, sb2, (Throwable) null);
        }
        this.customEventsEnabled = bVar.f5163g;
        l.a.a.a.c a5 = l.a.a.a.f.a();
        StringBuilder a6 = a.a("Custom event tracking ");
        if (this.customEventsEnabled) {
            str3 = str4;
        } else {
            str3 = "disabled";
        }
        a6.append(str3);
        String sb3 = a6.toString();
        if (a5.a(Answers.TAG, 3)) {
            Log.d(Answers.TAG, sb3, (Throwable) null);
        }
        this.predefinedEventsEnabled = bVar.f5164h;
        l.a.a.a.c a7 = l.a.a.a.f.a();
        StringBuilder a8 = a.a("Predefined event tracking ");
        if (!this.predefinedEventsEnabled) {
            str4 = "disabled";
        }
        a8.append(str4);
        String sb4 = a8.toString();
        if (a7.a(Answers.TAG, 3)) {
            Log.d(Answers.TAG, sb4, (Throwable) null);
        }
        if (bVar.f5166j > 1) {
            if (l.a.a.a.f.a().a(Answers.TAG, 3)) {
                Log.d(Answers.TAG, "Event sampling enabled", (Throwable) null);
            }
            this.eventFilter = new SamplingEventFilter(bVar.f5166j);
        }
        this.rolloverIntervalSeconds = bVar.f5161b;
        scheduleTimeBasedFileRollOver(0, (long) this.rolloverIntervalSeconds);
    }
}
