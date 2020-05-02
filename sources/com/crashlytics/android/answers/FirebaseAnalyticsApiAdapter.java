package com.crashlytics.android.answers;

import android.content.Context;
import android.util.Log;
import l.a.a.a.f;

public class FirebaseAnalyticsApiAdapter {
    public final Context context;
    public EventLogger eventLogger;
    public final FirebaseAnalyticsEventMapper eventMapper;

    public FirebaseAnalyticsApiAdapter(Context context2) {
        this(context2, new FirebaseAnalyticsEventMapper());
    }

    public EventLogger getFirebaseAnalytics() {
        if (this.eventLogger == null) {
            this.eventLogger = AppMeasurementEventLogger.getEventLogger(this.context);
        }
        return this.eventLogger;
    }

    public void processEvent(SessionEvent sessionEvent) {
        EventLogger firebaseAnalytics = getFirebaseAnalytics();
        if (firebaseAnalytics != null) {
            FirebaseAnalyticsEvent mapEvent = this.eventMapper.mapEvent(sessionEvent);
            if (mapEvent == null) {
                String str = "Fabric event was not mappable to Firebase event: " + sessionEvent;
                if (f.a().a(Answers.TAG, 3)) {
                    Log.d(Answers.TAG, str, (Throwable) null);
                    return;
                }
                return;
            }
            firebaseAnalytics.logEvent(mapEvent.getEventName(), mapEvent.getEventParams());
            if (LevelEndEvent.TYPE.equals(sessionEvent.predefinedType)) {
                firebaseAnalytics.logEvent("post_score", mapEvent.getEventParams());
            }
        } else if (f.a().a(Answers.TAG, 3)) {
            Log.d(Answers.TAG, "Firebase analytics logging was enabled, but not available...", (Throwable) null);
        }
    }

    public FirebaseAnalyticsApiAdapter(Context context2, FirebaseAnalyticsEventMapper firebaseAnalyticsEventMapper) {
        this.context = context2;
        this.eventMapper = firebaseAnalyticsEventMapper;
    }
}
