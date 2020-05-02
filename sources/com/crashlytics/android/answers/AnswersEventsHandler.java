package com.crashlytics.android.answers;

import android.content.Context;
import android.util.Log;
import com.crashlytics.android.answers.SessionEvent;
import java.util.concurrent.ScheduledExecutorService;
import l.a.a.a.f;
import l.a.a.a.k;
import l.a.a.a.o.d.d;
import l.a.a.a.o.e.c;
import l.a.a.a.o.g.b;

public class AnswersEventsHandler implements d {
    public final Context context;
    public final ScheduledExecutorService executor;
    public final AnswersFilesManagerProvider filesManagerProvider;
    public final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
    public final k kit;
    public final SessionMetadataCollector metadataCollector;
    public final c requestFactory;
    public SessionAnalyticsManagerStrategy strategy = new DisabledSessionAnalyticsManagerStrategy();

    public AnswersEventsHandler(k kVar, Context context2, AnswersFilesManagerProvider answersFilesManagerProvider, SessionMetadataCollector sessionMetadataCollector, c cVar, ScheduledExecutorService scheduledExecutorService, FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter2) {
        this.kit = kVar;
        this.context = context2;
        this.filesManagerProvider = answersFilesManagerProvider;
        this.metadataCollector = sessionMetadataCollector;
        this.requestFactory = cVar;
        this.executor = scheduledExecutorService;
        this.firebaseAnalyticsApiAdapter = firebaseAnalyticsApiAdapter2;
    }

    private void executeAsync(Runnable runnable) {
        try {
            this.executor.submit(runnable);
        } catch (Exception e) {
            if (f.a().a(Answers.TAG, 6)) {
                Log.e(Answers.TAG, "Failed to submit events task", e);
            }
        }
    }

    private void executeSync(Runnable runnable) {
        try {
            this.executor.submit(runnable).get();
        } catch (Exception e) {
            if (f.a().a(Answers.TAG, 6)) {
                Log.e(Answers.TAG, "Failed to run events task", e);
            }
        }
    }

    public void disable() {
        executeAsync(new Runnable() {
            public void run() {
                try {
                    SessionAnalyticsManagerStrategy sessionAnalyticsManagerStrategy = AnswersEventsHandler.this.strategy;
                    AnswersEventsHandler.this.strategy = new DisabledSessionAnalyticsManagerStrategy();
                    sessionAnalyticsManagerStrategy.deleteAllEvents();
                } catch (Exception e) {
                    if (f.a().a(Answers.TAG, 6)) {
                        Log.e(Answers.TAG, "Failed to disable events", e);
                    }
                }
            }
        });
    }

    public void enable() {
        executeAsync(new Runnable() {
            public void run() {
                try {
                    SessionEventMetadata metadata = AnswersEventsHandler.this.metadataCollector.getMetadata();
                    SessionAnalyticsFilesManager analyticsFilesManager = AnswersEventsHandler.this.filesManagerProvider.getAnalyticsFilesManager();
                    analyticsFilesManager.registerRollOverListener(AnswersEventsHandler.this);
                    AnswersEventsHandler.this.strategy = new EnabledSessionAnalyticsManagerStrategy(AnswersEventsHandler.this.kit, AnswersEventsHandler.this.context, AnswersEventsHandler.this.executor, analyticsFilesManager, AnswersEventsHandler.this.requestFactory, metadata, AnswersEventsHandler.this.firebaseAnalyticsApiAdapter);
                } catch (Exception e) {
                    if (f.a().a(Answers.TAG, 6)) {
                        Log.e(Answers.TAG, "Failed to enable events", e);
                    }
                }
            }
        });
    }

    public void flushEvents() {
        executeAsync(new Runnable() {
            public void run() {
                try {
                    AnswersEventsHandler.this.strategy.rollFileOver();
                } catch (Exception e) {
                    if (f.a().a(Answers.TAG, 6)) {
                        Log.e(Answers.TAG, "Failed to flush events", e);
                    }
                }
            }
        });
    }

    public void onRollOver(String str) {
        executeAsync(new Runnable() {
            public void run() {
                try {
                    AnswersEventsHandler.this.strategy.sendEvents();
                } catch (Exception e) {
                    if (f.a().a(Answers.TAG, 6)) {
                        Log.e(Answers.TAG, "Failed to send events files", e);
                    }
                }
            }
        });
    }

    public void processEvent(final SessionEvent.Builder builder, boolean z, final boolean z2) {
        AnonymousClass6 r0 = new Runnable() {
            public void run() {
                try {
                    AnswersEventsHandler.this.strategy.processEvent(builder);
                    if (z2) {
                        AnswersEventsHandler.this.strategy.rollFileOver();
                    }
                } catch (Exception e) {
                    if (f.a().a(Answers.TAG, 6)) {
                        Log.e(Answers.TAG, "Failed to process event", e);
                    }
                }
            }
        };
        if (z) {
            executeSync(r0);
        } else {
            executeAsync(r0);
        }
    }

    public void processEventAsync(SessionEvent.Builder builder) {
        processEvent(builder, false, false);
    }

    public void processEventAsyncAndFlush(SessionEvent.Builder builder) {
        processEvent(builder, false, true);
    }

    public void processEventSync(SessionEvent.Builder builder) {
        processEvent(builder, true, false);
    }

    public void setAnalyticsSettingsData(final b bVar, final String str) {
        executeAsync(new Runnable() {
            public void run() {
                try {
                    AnswersEventsHandler.this.strategy.setAnalyticsSettingsData(bVar, str);
                } catch (Exception e) {
                    if (f.a().a(Answers.TAG, 6)) {
                        Log.e(Answers.TAG, "Failed to set analytics settings data", e);
                    }
                }
            }
        });
    }
}
