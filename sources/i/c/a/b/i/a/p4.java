package i.c.a.b.i.a;

import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import i.a.a.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class p4 implements Runnable {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3823f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3824g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f3825h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f3826i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m4 f3827j;

    public p4(m4 m4Var, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.f3827j = m4Var;
        this.e = i2;
        this.f3823f = str;
        this.f3824g = obj;
        this.f3825h = obj2;
        this.f3826i = obj3;
    }

    public final void run() {
        x4 i2 = this.f3827j.a.i();
        if (i2.s()) {
            m4 m4Var = this.f3827j;
            if (m4Var.c == 0) {
                if (m4Var.a.f3861g.p()) {
                    m4 m4Var2 = this.f3827j;
                    oa oaVar = m4Var2.a.f3860f;
                    m4Var2.c = 'C';
                } else {
                    m4 m4Var3 = this.f3827j;
                    oa oaVar2 = m4Var3.a.f3860f;
                    m4Var3.c = 'c';
                }
            }
            m4 m4Var4 = this.f3827j;
            if (m4Var4.d < 0) {
                m4Var4.a.f3861g.o();
                m4Var4.d = 25001;
            }
            char charAt = "01VDIWEA?".charAt(this.e);
            m4 m4Var5 = this.f3827j;
            char c = m4Var5.c;
            long j2 = m4Var5.d;
            boolean z = true;
            String a = m4.a(true, this.f3823f, this.f3824g, this.f3825h, this.f3826i);
            StringBuilder sb = new StringBuilder(a.a(a, 24));
            sb.append("2");
            sb.append(charAt);
            sb.append(c);
            sb.append(j2);
            sb.append(":");
            sb.append(a);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f3823f.substring(0, 1024);
            }
            b5 b5Var = i2.d;
            b5Var.e.c();
            if (b5Var.e.t().getLong(b5Var.a, 0) == 0) {
                b5Var.a();
            }
            if (sb2 == null) {
                sb2 = "";
            }
            long j3 = b5Var.e.t().getLong(b5Var.f3594b, 0);
            if (j3 <= 0) {
                SharedPreferences.Editor edit = b5Var.e.t().edit();
                edit.putString(b5Var.c, sb2);
                edit.putLong(b5Var.f3594b, 1);
                edit.apply();
                return;
            }
            long j4 = j3 + 1;
            if ((b5Var.e.f().u().nextLong() & RecyclerView.FOREVER_NS) >= RecyclerView.FOREVER_NS / j4) {
                z = false;
            }
            SharedPreferences.Editor edit2 = b5Var.e.t().edit();
            if (z) {
                edit2.putString(b5Var.c, sb2);
            }
            edit2.putLong(b5Var.f3594b, j4);
            edit2.apply();
            return;
        }
        this.f3827j.a(6, "Persisted config not initialized. Not logging error/warn");
    }
}
