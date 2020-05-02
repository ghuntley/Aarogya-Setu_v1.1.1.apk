package i.c.a.b.i.a;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import i.c.a.b.d.k.h.h;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.b;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.j9;
import i.c.a.b.g.g.o1;
import i.c.a.b.g.g.pc;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public class s5 implements m6 {
    public static volatile s5 G;
    public volatile Boolean A;
    public Boolean B;
    public Boolean C;
    public int D;
    public AtomicInteger E = new AtomicInteger(0);
    public final long F;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3859b;
    public final String c;
    public final String d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final oa f3860f;

    /* renamed from: g  reason: collision with root package name */
    public final pa f3861g;

    /* renamed from: h  reason: collision with root package name */
    public final x4 f3862h;

    /* renamed from: i  reason: collision with root package name */
    public final m4 f3863i;

    /* renamed from: j  reason: collision with root package name */
    public final m5 f3864j;

    /* renamed from: k  reason: collision with root package name */
    public final g9 f3865k;

    /* renamed from: l  reason: collision with root package name */
    public final ca f3866l;

    /* renamed from: m  reason: collision with root package name */
    public final k4 f3867m;

    /* renamed from: n  reason: collision with root package name */
    public final b f3868n;

    /* renamed from: o  reason: collision with root package name */
    public final y7 f3869o;

    /* renamed from: p  reason: collision with root package name */
    public final t6 f3870p;

    /* renamed from: q  reason: collision with root package name */
    public final z f3871q;
    public final r7 r;
    public i4 s;
    public z7 t;
    public g u;
    public j4 v;
    public e5 w;
    public boolean x = false;
    public Boolean y;
    public long z;

    public s5(u6 u6Var) {
        Bundle bundle;
        boolean z2 = false;
        q.a(u6Var);
        oa oaVar = new oa();
        this.f3860f = oaVar;
        q.e = oaVar;
        this.a = u6Var.a;
        this.f3859b = u6Var.f3907b;
        this.c = u6Var.c;
        this.d = u6Var.d;
        this.e = u6Var.f3910h;
        this.A = u6Var.e;
        pc pcVar = u6Var.f3909g;
        if (!(pcVar == null || (bundle = pcVar.f3407k) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = pcVar.f3407k.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        o1.a(this.a);
        c cVar = c.a;
        this.f3868n = cVar;
        if (cVar != null) {
            this.F = System.currentTimeMillis();
            this.f3861g = new pa(this);
            x4 x4Var = new x4(this);
            x4Var.p();
            this.f3862h = x4Var;
            m4 m4Var = new m4(this);
            m4Var.p();
            this.f3863i = m4Var;
            ca caVar = new ca(this);
            caVar.p();
            this.f3866l = caVar;
            k4 k4Var = new k4(this);
            k4Var.p();
            this.f3867m = k4Var;
            this.f3871q = new z(this);
            y7 y7Var = new y7(this);
            y7Var.x();
            this.f3869o = y7Var;
            t6 t6Var = new t6(this);
            t6Var.x();
            this.f3870p = t6Var;
            g9 g9Var = new g9(this);
            g9Var.x();
            this.f3865k = g9Var;
            r7 r7Var = new r7(this);
            r7Var.p();
            this.r = r7Var;
            m5 m5Var = new m5(this);
            m5Var.p();
            this.f3864j = m5Var;
            pc pcVar2 = u6Var.f3909g;
            if (!(pcVar2 == null || pcVar2.f3402f == 0)) {
                z2 = true;
            }
            boolean z3 = !z2;
            if (this.a.getApplicationContext() instanceof Application) {
                t6 o2 = o();
                if (o2.a.a.getApplicationContext() instanceof Application) {
                    Application application = (Application) o2.a.a.getApplicationContext();
                    if (o2.c == null) {
                        o2.c = new q7(o2, (v6) null);
                    }
                    if (z3) {
                        application.unregisterActivityLifecycleCallbacks(o2.c);
                        application.registerActivityLifecycleCallbacks(o2.c);
                        o2.n().f3766n.a("Registered activity lifecycle callback");
                    }
                }
            } else {
                n().f3761i.a("Application context is not an Application");
            }
            m5 m5Var2 = this.f3864j;
            u5 u5Var = new u5(this, u6Var);
            m5Var2.o();
            q.a(u5Var);
            m5Var2.a((q5<?>) new q5(m5Var2, u5Var, "Task exception on worker thread"));
            return;
        }
        throw null;
    }

    public static void a(c3 c3Var) {
        if (c3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!c3Var.f3606b) {
            String valueOf = String.valueOf(c3Var.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean b() {
        if (j9.b() && this.f3861g.a(o.Y0)) {
            return c() == 0;
        }
        k().c();
        if (!this.x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        } else if (this.f3861g.q()) {
            return false;
        } else {
            Boolean bool = this.C;
            if (bool != null && bool.booleanValue()) {
                return false;
            }
            Boolean u2 = i().u();
            if (u2 != null) {
                return u2.booleanValue();
            }
            Boolean r2 = this.f3861g.r();
            if (r2 != null) {
                return r2.booleanValue();
            }
            Boolean bool2 = this.B;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            if (h.b()) {
                return false;
            }
            if (!this.f3861g.a(o.b0) || this.A == null) {
                return true;
            }
            return this.A.booleanValue();
        }
    }

    public final int c() {
        k().c();
        if (this.f3861g.q()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean u2 = i().u();
        if (u2 == null) {
            Boolean r2 = this.f3861g.r();
            if (r2 == null) {
                Boolean bool2 = this.B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (h.b()) {
                    return 6;
                } else {
                    if (!this.f3861g.a(o.b0) || this.A == null || this.A.booleanValue()) {
                        return 0;
                    }
                    return 7;
                }
            } else if (r2.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (u2.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    public final void d() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r7.z) > 1000) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (android.text.TextUtils.isEmpty(r0.f3730l) == false) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r7 = this;
            boolean r0 = r7.x
            if (r0 == 0) goto L_0x00d3
            i.c.a.b.i.a.m5 r0 = r7.k()
            r0.c()
            java.lang.Boolean r0 = r7.y
            r1 = 0
            if (r0 == 0) goto L_0x0037
            long r2 = r7.z
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0037
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00cb
            i.c.a.b.d.o.b r0 = r7.f3868n
            i.c.a.b.d.o.c r0 = (i.c.a.b.d.o.c) r0
            if (r0 == 0) goto L_0x0036
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r7.z
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cb
            goto L_0x0037
        L_0x0036:
            throw r1
        L_0x0037:
            i.c.a.b.d.o.b r0 = r7.f3868n
            i.c.a.b.d.o.c r0 = (i.c.a.b.d.o.c) r0
            if (r0 == 0) goto L_0x00d2
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.z = r0
            i.c.a.b.i.a.ca r0 = r7.p()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.c(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0083
            i.c.a.b.i.a.ca r0 = r7.p()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.c(r3)
            if (r0 == 0) goto L_0x0083
            android.content.Context r0 = r7.a
            i.c.a.b.d.p.b r0 = i.c.a.b.d.p.c.b(r0)
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0081
            i.c.a.b.i.a.pa r0 = r7.f3861g
            boolean r0 = r0.t()
            if (r0 != 0) goto L_0x0081
            android.content.Context r0 = r7.a
            boolean r0 = i.c.a.b.i.a.j5.a(r0)
            if (r0 == 0) goto L_0x0083
            android.content.Context r0 = r7.a
            boolean r0 = i.c.a.b.i.a.ca.a((android.content.Context) r0)
            if (r0 == 0) goto L_0x0083
        L_0x0081:
            r0 = 1
            goto L_0x0084
        L_0x0083:
            r0 = 0
        L_0x0084:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.y = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00cb
            i.c.a.b.i.a.ca r0 = r7.p()
            i.c.a.b.i.a.j4 r3 = r7.v()
            r3.w()
            java.lang.String r3 = r3.f3729k
            i.c.a.b.i.a.j4 r4 = r7.v()
            r4.w()
            java.lang.String r4 = r4.f3730l
            i.c.a.b.i.a.j4 r5 = r7.v()
            r5.w()
            java.lang.String r5 = r5.f3731m
            boolean r0 = r0.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5)
            if (r0 != 0) goto L_0x00c4
            i.c.a.b.i.a.j4 r0 = r7.v()
            r0.w()
            java.lang.String r0 = r0.f3730l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c5
        L_0x00c4:
            r1 = 1
        L_0x00c5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.y = r0
        L_0x00cb:
            java.lang.Boolean r0 = r7.y
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00d2:
            throw r1
        L_0x00d3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.s5.e():boolean");
    }

    public final r7 f() {
        a((n6) this.r);
        return this.r;
    }

    public final pa g() {
        return this.f3861g;
    }

    public final Context h() {
        return this.a;
    }

    public final x4 i() {
        a((k6) this.f3862h);
        return this.f3862h;
    }

    public final oa j() {
        return this.f3860f;
    }

    public final m5 k() {
        a((n6) this.f3864j);
        return this.f3864j;
    }

    public final b l() {
        return this.f3868n;
    }

    public final g9 m() {
        a((c3) this.f3865k);
        return this.f3865k;
    }

    public final m4 n() {
        a((n6) this.f3863i);
        return this.f3863i;
    }

    public final t6 o() {
        a((c3) this.f3870p);
        return this.f3870p;
    }

    public final ca p() {
        a((k6) this.f3866l);
        return this.f3866l;
    }

    public final k4 q() {
        a((k6) this.f3867m);
        return this.f3867m;
    }

    public final boolean r() {
        return TextUtils.isEmpty(this.f3859b);
    }

    public final y7 s() {
        a((c3) this.f3869o);
        return this.f3869o;
    }

    public final z7 t() {
        a((c3) this.t);
        return this.t;
    }

    public final g u() {
        a((n6) this.u);
        return this.u;
    }

    public final j4 v() {
        a((c3) this.v);
        return this.v;
    }

    public final z w() {
        z zVar = this.f3871q;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public static s5 a(Context context, Bundle bundle) {
        return a(context, new pc(0, 0, true, (String) null, (String) null, (String) null, bundle));
    }

    public static s5 a(Context context, pc pcVar) {
        Bundle bundle;
        if (pcVar != null && (pcVar.f3405i == null || pcVar.f3406j == null)) {
            pcVar = new pc(pcVar.e, pcVar.f3402f, pcVar.f3403g, pcVar.f3404h, (String) null, (String) null, pcVar.f3407k);
        }
        q.a(context);
        q.a(context.getApplicationContext());
        if (G == null) {
            synchronized (s5.class) {
                if (G == null) {
                    G = new s5(new u6(context, pcVar));
                }
            }
        } else if (!(pcVar == null || (bundle = pcVar.f3407k) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            G.A = Boolean.valueOf(pcVar.f3407k.getBoolean("dataCollectionDefaultEnabled"));
        }
        return G;
    }

    public static void a(n6 n6Var) {
        if (n6Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!n6Var.s()) {
            String valueOf = String.valueOf(n6Var.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void a(k6 k6Var) {
        if (k6Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public final boolean a() {
        return this.A != null && this.A.booleanValue();
    }
}
