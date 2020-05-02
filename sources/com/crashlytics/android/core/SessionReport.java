package com.crashlytics.android.core;

import android.util.Log;
import com.crashlytics.android.core.Report;
import i.a.a.a.a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l.a.a.a.c;
import l.a.a.a.f;

public class SessionReport implements Report {
    public final Map<String, String> customHeaders;
    public final File file;
    public final File[] files;

    public SessionReport(File file2) {
        this(file2, Collections.emptyMap());
    }

    public Map<String, String> getCustomHeaders() {
        return Collections.unmodifiableMap(this.customHeaders);
    }

    public File getFile() {
        return this.file;
    }

    public String getFileName() {
        return getFile().getName();
    }

    public File[] getFiles() {
        return this.files;
    }

    public String getIdentifier() {
        String fileName = getFileName();
        return fileName.substring(0, fileName.lastIndexOf(46));
    }

    public Report.Type getType() {
        return Report.Type.JAVA;
    }

    public void remove() {
        c a = f.a();
        StringBuilder a2 = a.a("Removing report at ");
        a2.append(this.file.getPath());
        String sb = a2.toString();
        if (a.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, sb, (Throwable) null);
        }
        this.file.delete();
    }

    public SessionReport(File file2, Map<String, String> map) {
        this.file = file2;
        this.files = new File[]{file2};
        this.customHeaders = new HashMap(map);
        if (this.file.length() == 0) {
            this.customHeaders.putAll(ReportUploader.HEADER_INVALID_CLS_FILE);
        }
    }
}
