package com.crashlytics.android.beta;

import android.util.Log;
import java.util.Collections;
import java.util.Map;
import l.a.a.a.f;
import l.a.a.a.k;
import l.a.a.a.o.b.n;
import l.a.a.a.o.b.s;

public class Beta extends k<Boolean> implements n {
    public static final String TAG = "Beta";

    public static Beta getInstance() {
        return (Beta) f.a(Beta.class);
    }

    public Map<s.a, String> getDeviceIdentifiers() {
        return Collections.emptyMap();
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:beta";
    }

    public String getVersion() {
        return "1.2.10.27";
    }

    public Boolean doInBackground() {
        if (f.a().a(TAG, 3)) {
            Log.d(TAG, "Beta kit initializing...", (Throwable) null);
        }
        return true;
    }
}
