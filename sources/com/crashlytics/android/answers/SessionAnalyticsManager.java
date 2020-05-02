package com.crashlytics.android.answers;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.crashlytics.android.answers.BackgroundManager;
import com.crashlytics.android.answers.SessionEvent;
import i.c.d.p.e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import l.a.a.a.b;
import l.a.a.a.c;
import l.a.a.a.f;
import l.a.a.a.k;
import l.a.a.a.o.b.o;
import l.a.a.a.o.b.s;
import l.a.a.a.o.e.a;

public class SessionAnalyticsManager implements BackgroundManager.Listener {
    public static final String EXECUTOR_SERVICE = "Answers Events Handler";
    public static final String ON_CRASH_ERROR_MSG = "onCrash called from main thread!!!";
    public final BackgroundManager backgroundManager;
    public final AnswersEventsHandler eventsHandler;
    public final long installedAt;
    public final b lifecycleManager;
    public final AnswersPreferenceManager preferenceManager;

    public SessionAnalyticsManager(AnswersEventsHandler answersEventsHandler, b bVar, BackgroundManager backgroundManager2, AnswersPreferenceManager answersPreferenceManager, long j2) {
        this.eventsHandler = answersEventsHandler;
        this.lifecycleManager = bVar;
        this.backgroundManager = backgroundManager2;
        this.preferenceManager = answersPreferenceManager;
        this.installedAt = j2;
    }

    public static SessionAnalyticsManager build(k kVar, Context context, s sVar, String str, String str2, long j2) {
        Context context2 = context;
        s sVar2 = sVar;
        SessionMetadataCollector sessionMetadataCollector = new SessionMetadataCollector(context, sVar, str, str2);
        AnswersFilesManagerProvider answersFilesManagerProvider = new AnswersFilesManagerProvider(context, new l.a.a.a.o.f.b(kVar));
        a aVar = new a(f.a());
        b bVar = new b(context);
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new o(EXECUTOR_SERVICE, new AtomicLong(1)));
        e.a(EXECUTOR_SERVICE, (ExecutorService) newSingleThreadScheduledExecutor);
        BackgroundManager backgroundManager2 = new BackgroundManager(newSingleThreadScheduledExecutor);
        return new SessionAnalyticsManager(new AnswersEventsHandler(kVar, context, answersFilesManagerProvider, sessionMetadataCollector, aVar, newSingleThreadScheduledExecutor, new FirebaseAnalyticsApiAdapter(context)), bVar, backgroundManager2, AnswersPreferenceManager.build(context), j2);
    }

    public void disable() {
        b.a aVar = this.lifecycleManager.f5030b;
        if (aVar != null) {
            for (Application.ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : aVar.a) {
                aVar.f5031b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }
        this.eventsHandler.disable();
    }

    public void enable() {
        this.eventsHandler.enable();
        this.lifecycleManager.a(new AnswersLifecycleCallbacks(this, this.backgroundManager));
        this.backgroundManager.registerListener(this);
        if (isFirstLaunch()) {
            onInstall(this.installedAt);
            this.preferenceManager.setAnalyticsLaunched();
        }
    }

    public boolean isFirstLaunch() {
        return !this.preferenceManager.hasAnalyticsLaunched();
    }

    public void onBackground() {
        if (f.a().a(Answers.TAG, 3)) {
            Log.d(Answers.TAG, "Flush events when app is backgrounded", (Throwable) null);
        }
        this.eventsHandler.flushEvents();
    }

    public void onCrash(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (f.a().a(Answers.TAG, 3)) {
                Log.d(Answers.TAG, "Logged crash", (Throwable) null);
            }
            this.eventsHandler.processEventSync(SessionEvent.crashEventBuilder(str, str2));
            return;
        }
        throw new IllegalStateException(ON_CRASH_ERROR_MSG);
    }

    public void onCustom(CustomEvent customEvent) {
        String str = "Logged custom event: " + customEvent;
        if (f.a().a(Answers.TAG, 3)) {
            Log.d(Answers.TAG, str, (Throwable) null);
        }
        this.eventsHandler.processEventAsync(SessionEvent.customEventBuilder(customEvent));
    }

    public void onError(String str) {
    }

    public void onInstall(long j2) {
        if (f.a().a(Answers.TAG, 3)) {
            Log.d(Answers.TAG, "Logged install", (Throwable) null);
        }
        this.eventsHandler.processEventAsyncAndFlush(SessionEvent.installEventBuilder(j2));
    }

    public void onLifecycle(Activity activity, SessionEvent.Type type) {
        c a = f.a();
        StringBuilder a2 = i.a.a.a.a.a("Logged lifecycle event: ");
        a2.append(type.name());
        String sb = a2.toString();
        if (a.a(Answers.TAG, 3)) {
            Log.d(Answers.TAG, sb, (Throwable) null);
        }
        this.eventsHandler.processEventAsync(SessionEvent.lifecycleEventBuilder(type, activity));
    }

    public void onPredefined(PredefinedEvent predefinedEvent) {
        String str = "Logged predefined event: " + predefinedEvent;
        if (f.a().a(Answers.TAG, 3)) {
            Log.d(Answers.TAG, str, (Throwable) null);
        }
        this.eventsHandler.processEventAsync(SessionEvent.predefinedEventBuilder(predefinedEvent));
    }

    public void setAnalyticsSettingsData(l.a.a.a.o.g.b bVar, String str) {
        this.backgroundManager.setFlushOnBackground(bVar.f5165i);
        this.eventsHandler.setAnalyticsSettingsData(bVar, str);
    }
}
