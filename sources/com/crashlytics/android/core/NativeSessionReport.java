package com.crashlytics.android.core;

import android.util.Log;
import com.crashlytics.android.core.Report;
import i.a.a.a.a;
import java.io.File;
import java.util.Map;
import l.a.a.a.c;
import l.a.a.a.f;

public class NativeSessionReport implements Report {
    public final File reportDirectory;

    public NativeSessionReport(File file) {
        this.reportDirectory = file;
    }

    public Map<String, String> getCustomHeaders() {
        return null;
    }

    public File getFile() {
        return null;
    }

    public String getFileName() {
        return null;
    }

    public File[] getFiles() {
        return this.reportDirectory.listFiles();
    }

    public String getIdentifier() {
        return this.reportDirectory.getName();
    }

    public Report.Type getType() {
        return Report.Type.NATIVE;
    }

    public void remove() {
        for (File file : getFiles()) {
            c a = f.a();
            StringBuilder a2 = a.a("Removing native report file at ");
            a2.append(file.getPath());
            String sb = a2.toString();
            if (a.a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, sb, (Throwable) null);
            }
            file.delete();
        }
        c a3 = f.a();
        StringBuilder a4 = a.a("Removing native report directory at ");
        a4.append(this.reportDirectory);
        String sb2 = a4.toString();
        if (a3.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, sb2, (Throwable) null);
        }
        this.reportDirectory.delete();
    }
}
