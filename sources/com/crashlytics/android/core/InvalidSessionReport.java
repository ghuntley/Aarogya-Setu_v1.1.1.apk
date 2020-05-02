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

public class InvalidSessionReport implements Report {
    public final Map<String, String> customHeaders = new HashMap(ReportUploader.HEADER_INVALID_CLS_FILE);
    public final File[] files;
    public final String identifier;

    public InvalidSessionReport(String str, File[] fileArr) {
        this.files = fileArr;
        this.identifier = str;
    }

    public Map<String, String> getCustomHeaders() {
        return Collections.unmodifiableMap(this.customHeaders);
    }

    public File getFile() {
        return this.files[0];
    }

    public String getFileName() {
        return this.files[0].getName();
    }

    public File[] getFiles() {
        return this.files;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public Report.Type getType() {
        return Report.Type.JAVA;
    }

    public void remove() {
        for (File file : this.files) {
            c a = f.a();
            StringBuilder a2 = a.a("Removing invalid report file at ");
            a2.append(file.getPath());
            String sb = a2.toString();
            if (a.a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, sb, (Throwable) null);
            }
            file.delete();
        }
    }
}
