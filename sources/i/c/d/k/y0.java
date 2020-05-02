package i.c.d.k;

import com.google.firebase.iid.FirebaseInstanceId;
import i.c.a.b.d.l.q;
import i.c.a.b.l.a;
import i.c.a.b.l.g;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class y0 implements a {
    public final FirebaseInstanceId a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4719b;
    public final String c;

    public y0(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.a = firebaseInstanceId;
        this.f4719b = str;
        this.c = str2;
    }

    public final Object a(g gVar) {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String str = this.f4719b;
        String str2 = this.c;
        String f2 = firebaseInstanceId.f();
        d0 a2 = FirebaseInstanceId.f699k.a("", str, str2);
        if (!firebaseInstanceId.a(a2)) {
            return q.b(new e(f2, a2.a));
        }
        return firebaseInstanceId.e.a(str, str2, new z0(firebaseInstanceId, f2, str, str2));
    }
}
