package com.google.firebase.remoteconfig;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    public final int e;

    public FirebaseRemoteConfigServerException(int i2, String str) {
        super(str);
        this.e = i2;
    }

    public FirebaseRemoteConfigServerException(int i2, String str, Throwable th) {
        super(str, th);
        this.e = i2;
    }
}
