package com.crashlytics.android;

import android.content.Context;
import com.crashlytics.android.CrashlyticsInitProvider;
import l.a.a.a.o.b.l;

public class ManifestEnabledCheckStrategy implements CrashlyticsInitProvider.EnabledCheckStrategy {
    public boolean isCrashlyticsEnabled(Context context) {
        return l.a(context).c;
    }
}
