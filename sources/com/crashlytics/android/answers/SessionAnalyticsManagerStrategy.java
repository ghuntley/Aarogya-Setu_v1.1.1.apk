package com.crashlytics.android.answers;

import com.crashlytics.android.answers.SessionEvent;
import l.a.a.a.o.d.e;
import l.a.a.a.o.g.b;

public interface SessionAnalyticsManagerStrategy extends e {
    void deleteAllEvents();

    void processEvent(SessionEvent.Builder builder);

    void sendEvents();

    void setAnalyticsSettingsData(b bVar, String str);
}
