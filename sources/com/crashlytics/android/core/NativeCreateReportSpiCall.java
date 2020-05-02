package com.crashlytics.android.core;

import android.util.Log;
import i.c.d.p.e;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;
import l.a.a.a.f;
import l.a.a.a.k;
import l.a.a.a.o.b.a;
import l.a.a.a.o.e.b;
import l.a.a.a.o.e.c;

public class NativeCreateReportSpiCall extends a implements CreateReportSpiCall {
    public static final String APP_META_FILE_MULTIPART_PARAM = "app_meta_file";
    public static final String BINARY_IMAGES_FILE_MULTIPART_PARAM = "binary_images_file";
    public static final String DEVICE_META_FILE_MULTIPART_PARAM = "device_meta_file";
    public static final String GZIP_FILE_CONTENT_TYPE = "application/octet-stream";
    public static final String KEYS_FILE_MULTIPART_PARAM = "keys_file";
    public static final String LOGS_FILE_MULTIPART_PARAM = "logs_file";
    public static final String METADATA_FILE_MULTIPART_PARAM = "crash_meta_file";
    public static final String MINIDUMP_FILE_MULTIPART_PARAM = "minidump_file";
    public static final String OS_META_FILE_MULTIPART_PARAM = "os_meta_file";
    public static final String REPORT_IDENTIFIER_PARAM = "report_id";
    public static final String SESSION_META_FILE_MULTIPART_PARAM = "session_meta_file";
    public static final String USER_META_FILE_MULTIPART_PARAM = "user_meta_file";

    public NativeCreateReportSpiCall(k kVar, String str, String str2, c cVar) {
        super(kVar, str, str2, cVar, b.POST);
    }

    private HttpRequest applyHeadersTo(HttpRequest httpRequest, String str) {
        StringBuilder a = i.a.a.a.a.a(a.CRASHLYTICS_USER_AGENT);
        a.append(this.kit.getVersion());
        httpRequest.d().setRequestProperty(a.HEADER_USER_AGENT, a.toString());
        httpRequest.d().setRequestProperty(a.HEADER_CLIENT_TYPE, a.ANDROID_CLIENT_TYPE);
        httpRequest.d().setRequestProperty(a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        httpRequest.d().setRequestProperty(a.HEADER_API_KEY, str);
        return httpRequest;
    }

    private HttpRequest applyMultipartDataTo(HttpRequest httpRequest, Report report) {
        httpRequest.c(REPORT_IDENTIFIER_PARAM, report.getIdentifier());
        for (File file : report.getFiles()) {
            if (file.getName().equals("minidump")) {
                httpRequest.a(MINIDUMP_FILE_MULTIPART_PARAM, file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("metadata")) {
                httpRequest.a(METADATA_FILE_MULTIPART_PARAM, file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("binaryImages")) {
                httpRequest.a(BINARY_IMAGES_FILE_MULTIPART_PARAM, file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("session")) {
                httpRequest.a(SESSION_META_FILE_MULTIPART_PARAM, file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("app")) {
                httpRequest.a(APP_META_FILE_MULTIPART_PARAM, file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("device")) {
                httpRequest.a(DEVICE_META_FILE_MULTIPART_PARAM, file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("os")) {
                httpRequest.a(OS_META_FILE_MULTIPART_PARAM, file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals(MetaDataStore.USERDATA_SUFFIX)) {
                httpRequest.a(USER_META_FILE_MULTIPART_PARAM, file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals("logs")) {
                httpRequest.a(LOGS_FILE_MULTIPART_PARAM, file.getName(), "application/octet-stream", file);
            } else if (file.getName().equals(MetaDataStore.KEYDATA_SUFFIX)) {
                httpRequest.a(KEYS_FILE_MULTIPART_PARAM, file.getName(), "application/octet-stream", file);
            }
        }
        return httpRequest;
    }

    public boolean invoke(CreateReportRequest createReportRequest) {
        HttpRequest applyMultipartDataTo = applyMultipartDataTo(applyHeadersTo(getHttpRequest(), createReportRequest.apiKey), createReportRequest.report);
        l.a.a.a.c a = f.a();
        StringBuilder a2 = i.a.a.a.a.a("Sending report to: ");
        a2.append(getUrl());
        String sb = a2.toString();
        if (a.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, sb, (Throwable) null);
        }
        int c = applyMultipartDataTo.c();
        l.a.a.a.c a3 = f.a();
        String b2 = i.a.a.a.a.b("Result was: ", c);
        if (a3.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, b2, (Throwable) null);
        }
        return e.c(c) == 0;
    }
}
