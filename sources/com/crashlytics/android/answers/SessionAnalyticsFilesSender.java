package com.crashlytics.android.answers;

import android.util.Log;
import i.c.d.p.e;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;
import java.util.List;
import l.a.a.a.k;
import l.a.a.a.o.b.a;
import l.a.a.a.o.d.f;
import l.a.a.a.o.e.b;
import l.a.a.a.o.e.c;

public class SessionAnalyticsFilesSender extends a implements f {
    public static final String FILE_CONTENT_TYPE = "application/vnd.crashlytics.android.events";
    public static final String FILE_PARAM_NAME = "session_analytics_file_";
    public final String apiKey;

    public SessionAnalyticsFilesSender(k kVar, String str, String str2, c cVar, String str3) {
        super(kVar, str, str2, cVar, b.POST);
        this.apiKey = str3;
    }

    public boolean send(List<File> list) {
        HttpRequest httpRequest = getHttpRequest();
        httpRequest.d().setRequestProperty(a.HEADER_CLIENT_TYPE, a.ANDROID_CLIENT_TYPE);
        httpRequest.d().setRequestProperty(a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        httpRequest.d().setRequestProperty(a.HEADER_API_KEY, this.apiKey);
        int i2 = 0;
        for (File next : list) {
            httpRequest.a(i.a.a.a.a.b(FILE_PARAM_NAME, i2), next.getName(), FILE_CONTENT_TYPE, next);
            i2++;
        }
        l.a.a.a.c a = l.a.a.a.f.a();
        StringBuilder a2 = i.a.a.a.a.a("Sending ");
        a2.append(list.size());
        a2.append(" analytics files to ");
        a2.append(getUrl());
        String sb = a2.toString();
        if (a.a(Answers.TAG, 3)) {
            Log.d(Answers.TAG, sb, (Throwable) null);
        }
        int c = httpRequest.c();
        l.a.a.a.c a3 = l.a.a.a.f.a();
        String b2 = i.a.a.a.a.b("Response code for analytics file send is ", c);
        if (a3.a(Answers.TAG, 3)) {
            Log.d(Answers.TAG, b2, (Throwable) null);
        }
        if (e.c(c) == 0) {
            return true;
        }
        return false;
    }
}
