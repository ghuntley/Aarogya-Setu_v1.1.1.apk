package com.crashlytics.android.core;

import android.content.Context;
import l.a.a.a.o.b.i;

public class ResourceUnityVersionProvider implements UnityVersionProvider {
    public final Context context;
    public final UnityVersionProvider fallback;
    public boolean hasRead = false;
    public String unityVersion;

    public ResourceUnityVersionProvider(Context context2, UnityVersionProvider unityVersionProvider) {
        this.context = context2;
        this.fallback = unityVersionProvider;
    }

    public String getUnityVersion() {
        if (!this.hasRead) {
            this.unityVersion = i.k(this.context);
            this.hasRead = true;
        }
        String str = this.unityVersion;
        if (str != null) {
            return str;
        }
        UnityVersionProvider unityVersionProvider = this.fallback;
        if (unityVersionProvider != null) {
            return unityVersionProvider.getUnityVersion();
        }
        return null;
    }
}
