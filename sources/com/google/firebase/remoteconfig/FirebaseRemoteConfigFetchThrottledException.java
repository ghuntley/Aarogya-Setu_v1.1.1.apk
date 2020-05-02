package com.google.firebase.remoteconfig;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigFetchException {
    public FirebaseRemoteConfigFetchThrottledException(long j2) {
        super("Fetch was throttled.");
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j2) {
        super(str);
    }
}
