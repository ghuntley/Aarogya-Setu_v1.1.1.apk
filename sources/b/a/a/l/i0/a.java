package b.a.a.l.i0;

import android.os.Build;
import n.b;
import n.m.c.g;
import n.m.c.h;
import n.m.c.i;
import n.m.c.k;
import n.o.e;

/* compiled from: AuthSpFactory.kt */
public final class a {
    public static final /* synthetic */ e[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f430b = i.c.d.p.e.a(C0012a.e);
    public static final a c = new a();

    /* renamed from: b.a.a.l.i0.a$a  reason: collision with other inner class name */
    /* compiled from: AuthSpFactory.kt */
    public static final class C0012a extends g implements n.m.b.a<b> {
        public static final C0012a e = new C0012a();

        public C0012a() {
            super(0);
        }

        public Object invoke() {
            if (Build.VERSION.SDK_INT >= 23) {
                return new c();
            }
            return new d();
        }
    }

    static {
        i iVar = new i(k.a(a.class), "instance", "getInstance()Lnic/goi/aarogyasetu/utility/authsp/AuthSpHelper;");
        k.a((h) iVar);
        a = new e[]{iVar};
    }
}
