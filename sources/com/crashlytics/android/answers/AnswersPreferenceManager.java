package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import l.a.a.a.o.f.c;
import l.a.a.a.o.f.d;

public class AnswersPreferenceManager {
    public static final String PREFKEY_ANALYTICS_LAUNCHED = "analytics_launched";
    public static final String PREF_STORE_NAME = "settings";
    public final c prefStore;

    public AnswersPreferenceManager(c cVar) {
        this.prefStore = cVar;
    }

    public static AnswersPreferenceManager build(Context context) {
        return new AnswersPreferenceManager(new d(context, PREF_STORE_NAME));
    }

    @SuppressLint({"CommitPrefEdits"})
    public boolean hasAnalyticsLaunched() {
        return ((d) this.prefStore).a.getBoolean(PREFKEY_ANALYTICS_LAUNCHED, false);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void setAnalyticsLaunched() {
        c cVar = this.prefStore;
        SharedPreferences.Editor putBoolean = ((d) cVar).a().putBoolean(PREFKEY_ANALYTICS_LAUNCHED, true);
        if (((d) cVar) != null) {
            putBoolean.apply();
            return;
        }
        throw null;
    }
}
