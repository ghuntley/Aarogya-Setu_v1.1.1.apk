package com.crashlytics.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import l.a.a.a.o.f.c;
import l.a.a.a.o.f.d;

@SuppressLint({"CommitPrefEdits"})
public class PreferenceManager {
    public static final String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
    public static final String PREF_MIGRATION_COMPLETE = "preferences_migration_complete";
    public static final boolean SHOULD_ALWAYS_SEND_REPORTS_DEFAULT = false;
    public final CrashlyticsCore kit;
    public final c preferenceStore;

    public PreferenceManager(c cVar, CrashlyticsCore crashlyticsCore) {
        this.preferenceStore = cVar;
        this.kit = crashlyticsCore;
    }

    public static PreferenceManager create(c cVar, CrashlyticsCore crashlyticsCore) {
        return new PreferenceManager(cVar, crashlyticsCore);
    }

    public void setShouldAlwaysSendReports(boolean z) {
        c cVar = this.preferenceStore;
        SharedPreferences.Editor putBoolean = ((d) cVar).a().putBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, z);
        if (((d) cVar) != null) {
            putBoolean.apply();
            return;
        }
        throw null;
    }

    public boolean shouldAlwaysSendReports() {
        if (!((d) this.preferenceStore).a.contains(PREF_MIGRATION_COMPLETE)) {
            Context context = this.kit.getContext();
            String name = CrashlyticsCore.class.getName();
            if (context != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(name, 0);
                if (!((d) this.preferenceStore).a.contains(PREF_ALWAYS_SEND_REPORTS_KEY) && sharedPreferences.contains(PREF_ALWAYS_SEND_REPORTS_KEY)) {
                    boolean z = sharedPreferences.getBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, false);
                    d dVar = (d) this.preferenceStore;
                    SharedPreferences.Editor putBoolean = dVar.a().putBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, z);
                    if (dVar != null) {
                        putBoolean.apply();
                    } else {
                        throw null;
                    }
                }
                d dVar2 = (d) this.preferenceStore;
                SharedPreferences.Editor putBoolean2 = dVar2.a().putBoolean(PREF_MIGRATION_COMPLETE, true);
                if (dVar2 != null) {
                    putBoolean2.apply();
                } else {
                    throw null;
                }
            } else {
                throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
            }
        }
        return ((d) this.preferenceStore).a.getBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, false);
    }
}
