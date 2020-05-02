package i.c.d.k;

import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class w0 implements Runnable {
    public final FirebaseInstanceId e;

    public w0(FirebaseInstanceId firebaseInstanceId) {
        this.e = firebaseInstanceId;
    }

    public final void run() {
        FirebaseInstanceId firebaseInstanceId = this.e;
        if (firebaseInstanceId.f705i.a()) {
            firebaseInstanceId.d();
        }
    }
}
