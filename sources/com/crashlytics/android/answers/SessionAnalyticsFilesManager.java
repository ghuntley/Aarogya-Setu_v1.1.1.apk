package com.crashlytics.android.answers;

import android.content.Context;
import i.a.a.a.a;
import java.util.UUID;
import l.a.a.a.o.b.k;
import l.a.a.a.o.b.v;
import l.a.a.a.o.d.b;
import l.a.a.a.o.d.c;

public class SessionAnalyticsFilesManager extends b<SessionEvent> {
    public static final String SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION = ".tap";
    public static final String SESSION_ANALYTICS_TO_SEND_FILE_PREFIX = "sa";
    public l.a.a.a.o.g.b analyticsSettingsData;

    public SessionAnalyticsFilesManager(Context context, SessionEventTransform sessionEventTransform, k kVar, c cVar) {
        super(context, sessionEventTransform, kVar, cVar, 100);
    }

    public String generateUniqueRollOverFileName() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder a = a.a(SESSION_ANALYTICS_TO_SEND_FILE_PREFIX, b.ROLL_OVER_FILE_NAME_SEPARATOR);
        a.append(randomUUID.toString());
        a.append(b.ROLL_OVER_FILE_NAME_SEPARATOR);
        if (((v) this.currentTimeProvider) != null) {
            a.append(System.currentTimeMillis());
            a.append(SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION);
            return a.toString();
        }
        throw null;
    }

    public int getMaxByteSizePerFile() {
        l.a.a.a.o.g.b bVar = this.analyticsSettingsData;
        return bVar == null ? super.getMaxByteSizePerFile() : bVar.c;
    }

    public int getMaxFilesToKeep() {
        l.a.a.a.o.g.b bVar = this.analyticsSettingsData;
        return bVar == null ? super.getMaxFilesToKeep() : bVar.d;
    }

    public void setAnalyticsSettingsData(l.a.a.a.o.g.b bVar) {
        this.analyticsSettingsData = bVar;
    }
}
