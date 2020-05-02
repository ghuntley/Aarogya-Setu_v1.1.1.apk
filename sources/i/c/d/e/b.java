package i.c.d.e;

import android.os.Bundle;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.e;
import i.c.a.b.g.g.f;
import i.c.a.b.g.g.g;
import i.c.a.b.g.g.h;
import i.c.a.b.g.g.i;
import i.c.a.b.g.g.j;
import i.c.a.b.g.g.k;
import i.c.a.b.g.g.k8;
import i.c.a.b.g.g.l;
import i.c.a.b.g.g.n;
import i.c.a.b.g.g.o;
import i.c.a.b.g.g.rc;
import i.c.a.b.g.g.s;
import i.c.a.b.g.g.tc;
import i.c.a.b.i.a.r6;
import i.c.a.b.i.a.s7;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.3.0 */
public final class b implements s7 {
    public final /* synthetic */ rc a;

    public b(rc rcVar) {
        this.a = rcVar;
    }

    public final void a(String str, String str2, Object obj) {
        this.a.a(str, str2, obj, true);
    }

    public final void b(String str, String str2, Bundle bundle) {
        this.a.a(str, str2, bundle, true, true, (Long) null);
    }

    public final String c() {
        rc rcVar = this.a;
        if (rcVar != null) {
            k8 k8Var = new k8();
            rcVar.c.execute(new g(rcVar, k8Var));
            return k8Var.a(50);
        }
        throw null;
    }

    public final String d() {
        rc rcVar = this.a;
        if (rcVar != null) {
            k8 k8Var = new k8();
            rcVar.c.execute(new h(rcVar, k8Var));
            return k8Var.a(500);
        }
        throw null;
    }

    public final long e() {
        rc rcVar = this.a;
        if (rcVar != null) {
            k8 k8Var = new k8();
            rcVar.c.execute(new j(rcVar, k8Var));
            Long l2 = (Long) k8.a(k8Var.b(500), Long.class);
            if (l2 != null) {
                return l2.longValue();
            }
            long nanoTime = System.nanoTime();
            if (((c) rcVar.f3433b) != null) {
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i2 = rcVar.e + 1;
                rcVar.e = i2;
                return nextLong + ((long) i2);
            }
            throw null;
        }
        throw null;
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        rc rcVar = this.a;
        if (rcVar != null) {
            k8 k8Var = new k8();
            rcVar.c.execute(new k(rcVar, str, str2, z, k8Var));
            Bundle b2 = k8Var.b(5000);
            if (b2 == null || b2.size() == 0) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap(b2.size());
            for (String str3 : b2.keySet()) {
                Object obj = b2.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        throw null;
    }

    public final String b() {
        rc rcVar = this.a;
        if (rcVar != null) {
            k8 k8Var = new k8();
            rcVar.c.execute(new l(rcVar, k8Var));
            return k8Var.a(500);
        }
        throw null;
    }

    public final void c(String str) {
        rc rcVar = this.a;
        if (rcVar != null) {
            rcVar.c.execute(new f(rcVar, str));
            return;
        }
        throw null;
    }

    public final int b(String str) {
        rc rcVar = this.a;
        if (rcVar != null) {
            k8 k8Var = new k8();
            rcVar.c.execute(new n(rcVar, str, k8Var));
            Integer num = (Integer) k8.a(k8Var.b(10000), Integer.class);
            if (num == null) {
                return 25;
            }
            return num.intValue();
        }
        throw null;
    }

    public final void a(r6 r6Var) {
        rc rcVar = this.a;
        if (rcVar != null) {
            q.a(r6Var);
            rcVar.c.execute(new o(rcVar, r6Var));
            return;
        }
        throw null;
    }

    public final String a() {
        rc rcVar = this.a;
        if (rcVar != null) {
            k8 k8Var = new k8();
            rcVar.c.execute(new i(rcVar, k8Var));
            return k8Var.a(500);
        }
        throw null;
    }

    public final void a(String str) {
        rc rcVar = this.a;
        if (rcVar != null) {
            rcVar.c.execute(new e(rcVar, str));
            return;
        }
        throw null;
    }

    public final void a(Bundle bundle) {
        rc rcVar = this.a;
        if (rcVar != null) {
            rcVar.c.execute(new s(rcVar, bundle));
            return;
        }
        throw null;
    }

    public final void a(String str, String str2, Bundle bundle) {
        rc rcVar = this.a;
        if (rcVar != null) {
            rcVar.c.execute(new tc(rcVar, str, str2, bundle));
            return;
        }
        throw null;
    }

    public final List<Bundle> a(String str, String str2) {
        rc rcVar = this.a;
        if (rcVar != null) {
            k8 k8Var = new k8();
            rcVar.c.execute(new i.c.a.b.g.g.c(rcVar, str, str2, k8Var));
            List<Bundle> list = (List) k8.a(k8Var.b(5000), List.class);
            return list == null ? Collections.emptyList() : list;
        }
        throw null;
    }
}
