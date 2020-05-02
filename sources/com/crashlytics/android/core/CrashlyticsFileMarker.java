package com.crashlytics.android.core;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import l.a.a.a.c;
import l.a.a.a.f;
import l.a.a.a.o.f.a;
import l.a.a.a.o.f.b;

public class CrashlyticsFileMarker {
    public final a fileStore;
    public final String markerName;

    public CrashlyticsFileMarker(String str, a aVar) {
        this.markerName = str;
        this.fileStore = aVar;
    }

    private File getMarkerFile() {
        return new File(((b) this.fileStore).a(), this.markerName);
    }

    public boolean create() {
        try {
            return getMarkerFile().createNewFile();
        } catch (IOException e) {
            c a = f.a();
            StringBuilder a2 = i.a.a.a.a.a("Error creating marker: ");
            a2.append(this.markerName);
            String sb = a2.toString();
            if (a.a(CrashlyticsCore.TAG, 6)) {
                Log.e(CrashlyticsCore.TAG, sb, e);
            }
            return false;
        }
    }

    public boolean isPresent() {
        return getMarkerFile().exists();
    }

    public boolean remove() {
        return getMarkerFile().delete();
    }
}
