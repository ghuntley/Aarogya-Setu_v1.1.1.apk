package i.c.d.k;

import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import i.c.d.f.e;
import i.c.d.f.h;
import i.c.d.i.d;
import i.c.d.j.c;
import i.c.d.p.g;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class u implements h {
    public static final h a = new u();

    public final Object a(e eVar) {
        FirebaseApp firebaseApp = (FirebaseApp) eVar.a(FirebaseApp.class);
        firebaseApp.a();
        return new FirebaseInstanceId(firebaseApp, new s(firebaseApp.a), s0.a(), s0.a(), (d) eVar.a(d.class), (g) eVar.a(g.class), (c) eVar.a(c.class), (i.c.d.m.g) eVar.a(i.c.d.m.g.class));
    }
}
