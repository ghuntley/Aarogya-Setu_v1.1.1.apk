package com.crashlytics.android.core;

import android.util.Log;
import i.c.d.p.e;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;
import java.util.Map;
import l.a.a.a.f;
import l.a.a.a.k;
import l.a.a.a.o.b.a;
import l.a.a.a.o.e.b;
import l.a.a.a.o.e.c;

public class DefaultCreateReportSpiCall extends a implements CreateReportSpiCall {
    public static final String FILE_CONTENT_TYPE = "application/octet-stream";
    public static final String FILE_PARAM = "report[file]";
    public static final String IDENTIFIER_PARAM = "report[identifier]";
    public static final String MULTI_FILE_PARAM = "report[file";

    public DefaultCreateReportSpiCall(k kVar, String str, String str2, c cVar) {
        super(kVar, str, str2, cVar, b.POST);
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, CreateReportRequest createReportRequest) {
        httpRequest.d().setRequestProperty(a.HEADER_API_KEY, createReportRequest.apiKey);
        httpRequest.d().setRequestProperty(a.HEADER_CLIENT_TYPE, a.ANDROID_CLIENT_TYPE);
        httpRequest.d().setRequestProperty(a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        for (Map.Entry next : createReportRequest.report.getCustomHeaders().entrySet()) {
            httpRequest.b((String) next.getKey(), (String) next.getValue());
        }
        return httpRequest;
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, Report report) {
        HttpRequest httpRequest2 = httpRequest;
        httpRequest2.c(IDENTIFIER_PARAM, report.getIdentifier());
        if (report.getFiles().length == 1) {
            l.a.a.a.c a = f.a();
            StringBuilder a2 = i.a.a.a.a.a("Adding single file ");
            a2.append(report.getFileName());
            a2.append(" to report ");
            a2.append(report.getIdentifier());
            String sb = a2.toString();
            if (a.a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, sb, (Throwable) null);
            }
            httpRequest2.a(FILE_PARAM, report.getFileName(), "application/octet-stream", report.getFile());
            return httpRequest2;
        }
        int i2 = 0;
        for (File file : report.getFiles()) {
            l.a.a.a.c a3 = f.a();
            StringBuilder a4 = i.a.a.a.a.a("Adding file ");
            a4.append(file.getName());
            a4.append(" to report ");
            a4.append(report.getIdentifier());
            String sb2 = a4.toString();
            if (a3.a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, sb2, (Throwable) null);
            }
            httpRequest2.a(MULTI_FILE_PARAM + i2 + "]", file.getName(), "application/octet-stream", file);
            i2++;
        }
        return httpRequest2;
    }

    public boolean invoke(CreateReportRequest createReportRequest) {
        HttpRequest applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest), createReportRequest.report);
        l.a.a.a.c a = f.a();
        StringBuilder a2 = i.a.a.a.a.a("Sending report to: ");
        a2.append(getUrl());
        String sb = a2.toString();
        if (a.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, sb, (Throwable) null);
        }
        int c = applyMultipartDataTo.c();
        l.a.a.a.c a3 = f.a();
        StringBuilder a4 = i.a.a.a.a.a("Create report request ID: ");
        a4.append(applyMultipartDataTo.a(a.HEADER_REQUEST_ID));
        String sb2 = a4.toString();
        if (a3.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, sb2, (Throwable) null);
        }
        l.a.a.a.c a5 = f.a();
        String b2 = i.a.a.a.a.b("Result was: ", c);
        if (a5.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, b2, (Throwable) null);
        }
        return e.c(c) == 0;
    }

    public DefaultCreateReportSpiCall(k kVar, String str, String str2, c cVar, b bVar) {
        super(kVar, str, str2, cVar, bVar);
    }
}
