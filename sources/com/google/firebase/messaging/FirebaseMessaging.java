package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import i.c.a.a.g;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public class FirebaseMessaging {
    @SuppressLint({"FirebaseUnknownNullness"})
    public static g a;

    static {
        Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, g gVar) {
        firebaseApp.a();
        a = gVar;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseApp.a();
            firebaseMessaging = (FirebaseMessaging) firebaseApp.d.a(cls);
        }
        return firebaseMessaging;
    }
}
