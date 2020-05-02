package i.c.d.k;

import com.google.firebase.iid.FirebaseInstanceId;
import i.c.d.i.a;
import i.c.d.i.b;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class c1 implements b {
    public final FirebaseInstanceId.a a;

    public c1(FirebaseInstanceId.a aVar) {
        this.a = aVar;
    }

    public final void a(a aVar) {
        FirebaseInstanceId.a aVar2 = this.a;
        synchronized (aVar2) {
            if (aVar2.a()) {
                FirebaseInstanceId.this.d();
            }
        }
    }
}
