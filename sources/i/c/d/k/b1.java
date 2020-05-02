package i.c.d.k;

import com.google.firebase.iid.FirebaseInstanceId;
import i.c.a.b.d.l.q;
import i.c.a.b.l.f;
import i.c.a.b.l.g;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class b1 implements f {
    public final FirebaseInstanceId a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4681b;
    public final String c;
    public final String d;

    public b1(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.a = firebaseInstanceId;
        this.f4681b = str;
        this.c = str2;
        this.d = str3;
    }

    public final g a(Object obj) {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String str = this.f4681b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = (String) obj;
        FirebaseInstanceId.f699k.a("", str, str2, str4, firebaseInstanceId.c.b());
        return q.b(new e(str3, str4));
    }
}
