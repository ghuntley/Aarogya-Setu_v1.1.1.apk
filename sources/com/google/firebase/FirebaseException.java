package com.google.firebase;

import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class FirebaseException extends Exception {
    @Deprecated
    public FirebaseException() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        q.a(str, (Object) "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str, Throwable th) {
        super(str, th);
        q.a(str, (Object) "Detail message must not be empty");
    }
}
