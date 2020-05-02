package i.c.a.b.i.a;

import android.os.Bundle;
import android.text.TextUtils;
import i.a.a.a.a;
import i.c.a.b.d.l.q;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class j {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3722b;
    public final String c;
    public final long d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final l f3723f;

    public j(s5 s5Var, String str, String str2, String str3, long j2, long j3, l lVar) {
        q.b(str2);
        q.b(str3);
        q.a(lVar);
        this.a = str2;
        this.f3722b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j2;
        this.e = j3;
        if (j3 != 0 && j3 > j2) {
            s5Var.n().f3761i.a("Event created with reverse previous/current timestamps. appId, name", m4.a(str2), m4.a(str3));
        }
        this.f3723f = lVar;
    }

    public final j a(s5 s5Var, long j2) {
        return new j(s5Var, this.c, this.a, this.f3722b, this.d, j2, this.f3723f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.f3722b;
        String valueOf = String.valueOf(this.f3723f);
        StringBuilder sb = new StringBuilder(valueOf.length() + a.a(str2, a.a(str, 33)));
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public j(s5 s5Var, String str, String str2, String str3, long j2, long j3, Bundle bundle) {
        l lVar;
        q.b(str2);
        q.b(str3);
        this.a = str2;
        this.f3722b = str3;
        this.c = TextUtils.isEmpty(str) ? null : str;
        this.d = j2;
        this.e = j3;
        if (j3 != 0 && j3 > j2) {
            s5Var.n().f3761i.a("Event created with reverse previous/current timestamps. appId", m4.a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            lVar = new l(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    s5Var.n().f3758f.a("Param name can't be null");
                    it.remove();
                } else {
                    Object a2 = s5Var.p().a(str4, bundle2.get(str4));
                    if (a2 == null) {
                        s5Var.n().f3761i.a("Param value can't be null", s5Var.q().b(str4));
                        it.remove();
                    } else {
                        s5Var.p().a(bundle2, str4, a2);
                    }
                }
            }
            lVar = new l(bundle2);
        }
        this.f3723f = lVar;
    }
}
