package i.c.a.b.i.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.b;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.k9;
import i.c.a.b.g.g.p0;
import i.c.a.b.g.g.pc;
import i.c.a.b.g.g.r0;
import i.c.a.b.g.g.t0;
import i.c.a.b.g.g.w3;
import i.c.a.b.g.g.x0;
import i.c.a.b.g.g.x9;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public class t9 implements m6 {
    public static volatile t9 x;
    public n5 a;

    /* renamed from: b  reason: collision with root package name */
    public s4 f3892b;
    public d c;
    public v4 d;
    public q9 e;

    /* renamed from: f  reason: collision with root package name */
    public fa f3893f;

    /* renamed from: g  reason: collision with root package name */
    public final x9 f3894g;

    /* renamed from: h  reason: collision with root package name */
    public u7 f3895h;

    /* renamed from: i  reason: collision with root package name */
    public final s5 f3896i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3897j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3898k;

    /* renamed from: l  reason: collision with root package name */
    public long f3899l;

    /* renamed from: m  reason: collision with root package name */
    public List<Runnable> f3900m;

    /* renamed from: n  reason: collision with root package name */
    public int f3901n;

    /* renamed from: o  reason: collision with root package name */
    public int f3902o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3903p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3904q;
    public boolean r;
    public FileLock s;
    public FileChannel t;
    public List<Long> u;
    public List<Long> v;
    public long w;

    public t9(y9 y9Var) {
        q.a(y9Var);
        this.f3896i = s5.a(y9Var.a, (pc) null);
        this.w = -1;
        x9 x9Var = new x9(this);
        x9Var.o();
        this.f3894g = x9Var;
        s4 s4Var = new s4(this);
        s4Var.o();
        this.f3892b = s4Var;
        n5 n5Var = new n5(this);
        n5Var.o();
        this.a = n5Var;
        m5 k2 = this.f3896i.k();
        s9 s9Var = new s9(this, y9Var);
        k2.o();
        q.a(s9Var);
        k2.a((q5<?>) new q5(k2, s9Var, "Task exception on worker thread"));
    }

    public static t9 a(Context context) {
        q.a(context);
        q.a(context.getApplicationContext());
        if (x == null) {
            synchronized (t9.class) {
                if (x == null) {
                    x = new t9(new y9(context));
                }
            }
        }
        return x;
    }

    public final n5 b() {
        a((r9) this.a);
        return this.a;
    }

    public final s4 c() {
        a((r9) this.f3892b);
        return this.f3892b;
    }

    public final d d() {
        a((r9) this.c);
        return this.c;
    }

    public final fa e() {
        a((r9) this.f3893f);
        return this.f3893f;
    }

    public final x9 f() {
        a((r9) this.f3894g);
        return this.f3894g;
    }

    public final k4 g() {
        return this.f3896i.q();
    }

    public final Context h() {
        return this.f3896i.a;
    }

    public final void i() {
        if (!this.f3897j) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    public final oa j() {
        return this.f3896i.f3860f;
    }

    public final m5 k() {
        return this.f3896i.k();
    }

    public final b l() {
        return this.f3896i.f3868n;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:108|109) */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r1.f3896i.n().f3758f.a("Failed to parse upload URL. Not uploading. appId", i.c.a.b.i.a.m4.a(r3), r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x0306 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r17 = this;
            r1 = r17
            r17.r()
            r17.i()
            r0 = 1
            r1.r = r0
            r2 = 0
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.oa r3 = r3.f3860f     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.z7 r3 = r3.t()     // Catch:{ all -> 0x0342 }
            java.lang.Boolean r3 = r3.e     // Catch:{ all -> 0x0342 }
            if (r3 != 0) goto L_0x002d
            i.c.a.b.i.a.s5 r0 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.m4 r0 = r0.n()     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.o4 r0 = r0.f3761i     // Catch:{ all -> 0x0342 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            r0.a(r3)     // Catch:{ all -> 0x0342 }
            r1.r = r2
            r17.a()
            return
        L_0x002d:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0342 }
            if (r3 == 0) goto L_0x0046
            i.c.a.b.i.a.s5 r0 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.m4 r0 = r0.n()     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.o4 r0 = r0.f3758f     // Catch:{ all -> 0x0342 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            r0.a(r3)     // Catch:{ all -> 0x0342 }
            r1.r = r2
            r17.a()
            return
        L_0x0046:
            long r3 = r1.f3899l     // Catch:{ all -> 0x0342 }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0057
            r17.u()     // Catch:{ all -> 0x0342 }
            r1.r = r2
            r17.a()
            return
        L_0x0057:
            r17.r()     // Catch:{ all -> 0x0342 }
            java.util.List<java.lang.Long> r3 = r1.u     // Catch:{ all -> 0x0342 }
            if (r3 == 0) goto L_0x0060
            r3 = 1
            goto L_0x0061
        L_0x0060:
            r3 = 0
        L_0x0061:
            if (r3 == 0) goto L_0x0076
            i.c.a.b.i.a.s5 r0 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.m4 r0 = r0.n()     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.o4 r0 = r0.f3766n     // Catch:{ all -> 0x0342 }
            java.lang.String r3 = "Uploading requested multiple times"
            r0.a(r3)     // Catch:{ all -> 0x0342 }
            r1.r = r2
            r17.a()
            return
        L_0x0076:
            i.c.a.b.i.a.s4 r3 = r17.c()     // Catch:{ all -> 0x0342 }
            boolean r3 = r3.t()     // Catch:{ all -> 0x0342 }
            if (r3 != 0) goto L_0x0096
            i.c.a.b.i.a.s5 r0 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.m4 r0 = r0.n()     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.o4 r0 = r0.f3766n     // Catch:{ all -> 0x0342 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.a(r3)     // Catch:{ all -> 0x0342 }
            r17.u()     // Catch:{ all -> 0x0342 }
            r1.r = r2
            r17.a()
            return
        L_0x0096:
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.d.o.b r3 = r3.f3868n     // Catch:{ all -> 0x0342 }
            i.c.a.b.d.o.c r3 = (i.c.a.b.d.o.c) r3     // Catch:{ all -> 0x0342 }
            r4 = 0
            if (r3 == 0) goto L_0x0341
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.ja r3 = i.c.a.b.g.g.ja.f3329f     // Catch:{ all -> 0x0342 }
            java.lang.Object r3 = r3.a()     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.na r3 = (i.c.a.b.g.g.na) r3     // Catch:{ all -> 0x0342 }
            boolean r3 = r3.a()     // Catch:{ all -> 0x0342 }
            if (r3 == 0) goto L_0x00bc
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.pa r3 = r3.f3861g     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.f4<java.lang.Integer> r9 = i.c.a.b.i.a.o.Q     // Catch:{ all -> 0x0342 }
            int r3 = r3.b(r4, r9)     // Catch:{ all -> 0x0342 }
            goto L_0x00bd
        L_0x00bc:
            r3 = 1
        L_0x00bd:
            if (r3 <= r0) goto L_0x00d1
            long r9 = i.c.a.b.i.a.pa.w()     // Catch:{ all -> 0x0342 }
            long r9 = r7 - r9
            r11 = 0
        L_0x00c6:
            if (r11 >= r3) goto L_0x00da
            boolean r12 = r1.a((long) r9)     // Catch:{ all -> 0x0342 }
            if (r12 == 0) goto L_0x00da
            int r11 = r11 + 1
            goto L_0x00c6
        L_0x00d1:
            long r9 = i.c.a.b.i.a.pa.w()     // Catch:{ all -> 0x0342 }
            long r9 = r7 - r9
            r1.a((long) r9)     // Catch:{ all -> 0x0342 }
        L_0x00da:
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.x4 r3 = r3.i()     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.d5 r3 = r3.e     // Catch:{ all -> 0x0342 }
            long r9 = r3.a()     // Catch:{ all -> 0x0342 }
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0101
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.m4 r3 = r3.n()     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.o4 r3 = r3.f3765m     // Catch:{ all -> 0x0342 }
            java.lang.String r5 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r9 = r7 - r9
            long r9 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0342 }
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0342 }
            r3.a(r5, r6)     // Catch:{ all -> 0x0342 }
        L_0x0101:
            i.c.a.b.i.a.d r3 = r17.d()     // Catch:{ all -> 0x0342 }
            java.lang.String r3 = r3.v()     // Catch:{ all -> 0x0342 }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0342 }
            r9 = -1
            if (r5 != 0) goto L_0x0318
            long r5 = r1.w     // Catch:{ all -> 0x0342 }
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0121
            i.c.a.b.i.a.d r5 = r17.d()     // Catch:{ all -> 0x0342 }
            long r5 = r5.w()     // Catch:{ all -> 0x0342 }
            r1.w = r5     // Catch:{ all -> 0x0342 }
        L_0x0121:
            i.c.a.b.i.a.s5 r5 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.pa r5 = r5.f3861g     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.f4<java.lang.Integer> r6 = i.c.a.b.i.a.o.f3803g     // Catch:{ all -> 0x0342 }
            int r5 = r5.b(r3, r6)     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.pa r6 = r6.f3861g     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.f4<java.lang.Integer> r9 = i.c.a.b.i.a.o.f3804h     // Catch:{ all -> 0x0342 }
            int r6 = r6.b(r3, r9)     // Catch:{ all -> 0x0342 }
            int r6 = java.lang.Math.max(r2, r6)     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.d r9 = r17.d()     // Catch:{ all -> 0x0342 }
            java.util.List r5 = r9.a((java.lang.String) r3, (int) r5, (int) r6)     // Catch:{ all -> 0x0342 }
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0342 }
            if (r6 != 0) goto L_0x033b
            java.util.Iterator r6 = r5.iterator()     // Catch:{ all -> 0x0342 }
        L_0x014b:
            boolean r9 = r6.hasNext()     // Catch:{ all -> 0x0342 }
            if (r9 == 0) goto L_0x0166
            java.lang.Object r9 = r6.next()     // Catch:{ all -> 0x0342 }
            android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ all -> 0x0342 }
            java.lang.Object r9 = r9.first     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.t0 r9 = (i.c.a.b.g.g.t0) r9     // Catch:{ all -> 0x0342 }
            java.lang.String r10 = r9.zzw     // Catch:{ all -> 0x0342 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0342 }
            if (r10 != 0) goto L_0x014b
            java.lang.String r6 = r9.zzw     // Catch:{ all -> 0x0342 }
            goto L_0x0167
        L_0x0166:
            r6 = r4
        L_0x0167:
            if (r6 == 0) goto L_0x0192
            r9 = 0
        L_0x016a:
            int r10 = r5.size()     // Catch:{ all -> 0x0342 }
            if (r9 >= r10) goto L_0x0192
            java.lang.Object r10 = r5.get(r9)     // Catch:{ all -> 0x0342 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0342 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.t0 r10 = (i.c.a.b.g.g.t0) r10     // Catch:{ all -> 0x0342 }
            java.lang.String r11 = r10.zzw     // Catch:{ all -> 0x0342 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0342 }
            if (r11 != 0) goto L_0x018f
            java.lang.String r10 = r10.zzw     // Catch:{ all -> 0x0342 }
            boolean r10 = r10.equals(r6)     // Catch:{ all -> 0x0342 }
            if (r10 != 0) goto L_0x018f
            java.util.List r5 = r5.subList(r2, r9)     // Catch:{ all -> 0x0342 }
            goto L_0x0192
        L_0x018f:
            int r9 = r9 + 1
            goto L_0x016a
        L_0x0192:
            i.c.a.b.g.g.s0 r6 = i.c.a.b.g.g.s0.zzd     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.w3$b r6 = r6.i()     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.s0$a r6 = (i.c.a.b.g.g.s0.a) r6     // Catch:{ all -> 0x0342 }
            int r9 = r5.size()     // Catch:{ all -> 0x0342 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0342 }
            int r11 = r5.size()     // Catch:{ all -> 0x0342 }
            r10.<init>(r11)     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.s5 r11 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.pa r11 = r11.f3861g     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.ra r11 = r11.c     // Catch:{ all -> 0x0342 }
            java.lang.String r12 = "gaia_collection_enabled"
            java.lang.String r11 = r11.a(r3, r12)     // Catch:{ all -> 0x0342 }
            java.lang.String r12 = "1"
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0342 }
            r12 = 0
        L_0x01ba:
            if (r12 >= r9) goto L_0x024b
            java.lang.Object r13 = r5.get(r12)     // Catch:{ all -> 0x0342 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x0342 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.t0 r13 = (i.c.a.b.g.g.t0) r13     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.w3$b r13 = r13.j()     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.t0$a r13 = (i.c.a.b.g.g.t0.a) r13     // Catch:{ all -> 0x0342 }
            java.lang.Object r14 = r5.get(r12)     // Catch:{ all -> 0x0342 }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x0342 }
            java.lang.Object r14 = r14.second     // Catch:{ all -> 0x0342 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x0342 }
            r10.add(r14)     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.s5 r14 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.pa r14 = r14.f3861g     // Catch:{ all -> 0x0342 }
            r14.o()     // Catch:{ all -> 0x0342 }
            r14 = 25001(0x61a9, double:1.2352E-319)
            r13.g((long) r14)     // Catch:{ all -> 0x0342 }
            r13.a((long) r7)     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.s5 r14 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.oa r14 = r14.f3860f     // Catch:{ all -> 0x0342 }
            r13.b((boolean) r2)     // Catch:{ all -> 0x0342 }
            if (r11 != 0) goto L_0x020d
            boolean r14 = r13.f3513g     // Catch:{ all -> 0x0342 }
            if (r14 == 0) goto L_0x01fa
            r13.i()     // Catch:{ all -> 0x0342 }
            r13.f3513g = r2     // Catch:{ all -> 0x0342 }
        L_0x01fa:
            MessageType r14 = r13.f3512f     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.t0 r14 = (i.c.a.b.g.g.t0) r14     // Catch:{ all -> 0x0342 }
            int r15 = r14.zzc     // Catch:{ all -> 0x0342 }
            r16 = 2147483647(0x7fffffff, float:NaN)
            r15 = r15 & r16
            r14.zzc = r15     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.t0 r15 = i.c.a.b.g.g.t0.zzav     // Catch:{ all -> 0x0342 }
            java.lang.String r15 = r15.zzam     // Catch:{ all -> 0x0342 }
            r14.zzam = r15     // Catch:{ all -> 0x0342 }
        L_0x020d:
            i.c.a.b.i.a.s5 r14 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.pa r14 = r14.f3861g     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r15 = i.c.a.b.i.a.o.i0     // Catch:{ all -> 0x0342 }
            boolean r14 = r14.d(r3, r15)     // Catch:{ all -> 0x0342 }
            if (r14 == 0) goto L_0x0242
            i.c.a.b.g.g.f5 r14 = r13.k()     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.w3 r14 = (i.c.a.b.g.g.w3) r14     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.t0 r14 = (i.c.a.b.g.g.t0) r14     // Catch:{ all -> 0x0342 }
            byte[] r14 = r14.f()     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.x9 r15 = r17.f()     // Catch:{ all -> 0x0342 }
            long r14 = r15.a((byte[]) r14)     // Catch:{ all -> 0x0342 }
            boolean r0 = r13.f3513g     // Catch:{ all -> 0x0342 }
            if (r0 == 0) goto L_0x0236
            r13.i()     // Catch:{ all -> 0x0342 }
            r13.f3513g = r2     // Catch:{ all -> 0x0342 }
        L_0x0236:
            MessageType r0 = r13.f3512f     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.t0 r0 = (i.c.a.b.g.g.t0) r0     // Catch:{ all -> 0x0342 }
            int r2 = r0.zzd     // Catch:{ all -> 0x0342 }
            r2 = r2 | 32
            r0.zzd = r2     // Catch:{ all -> 0x0342 }
            r0.zzat = r14     // Catch:{ all -> 0x0342 }
        L_0x0242:
            r6.a(r13)     // Catch:{ all -> 0x0342 }
            int r12 = r12 + 1
            r0 = 1
            r2 = 0
            goto L_0x01ba
        L_0x024b:
            i.c.a.b.i.a.s5 r0 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.m4 r0 = r0.n()     // Catch:{ all -> 0x0342 }
            r2 = 2
            boolean r0 = r0.a((int) r2)     // Catch:{ all -> 0x0342 }
            if (r0 == 0) goto L_0x0269
            i.c.a.b.i.a.x9 r0 = r17.f()     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.f5 r2 = r6.k()     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.w3 r2 = (i.c.a.b.g.g.w3) r2     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.s0 r2 = (i.c.a.b.g.g.s0) r2     // Catch:{ all -> 0x0342 }
            java.lang.String r0 = r0.a((i.c.a.b.g.g.s0) r2)     // Catch:{ all -> 0x0342 }
            goto L_0x026a
        L_0x0269:
            r0 = r4
        L_0x026a:
            r17.f()     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.f5 r2 = r6.k()     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.w3 r2 = (i.c.a.b.g.g.w3) r2     // Catch:{ all -> 0x0342 }
            i.c.a.b.g.g.s0 r2 = (i.c.a.b.g.g.s0) r2     // Catch:{ all -> 0x0342 }
            byte[] r13 = r2.f()     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.f4<java.lang.String> r2 = i.c.a.b.i.a.o.f3813q     // Catch:{ all -> 0x0342 }
            java.lang.Object r2 = r2.a(r4)     // Catch:{ all -> 0x0342 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0342 }
            java.net.URL r12 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0306 }
            r12.<init>(r2)     // Catch:{ MalformedURLException -> 0x0306 }
            boolean r4 = r10.isEmpty()     // Catch:{ MalformedURLException -> 0x0306 }
            if (r4 != 0) goto L_0x028e
            r4 = 1
            goto L_0x028f
        L_0x028e:
            r4 = 0
        L_0x028f:
            i.c.a.b.d.l.q.a((boolean) r4)     // Catch:{ MalformedURLException -> 0x0306 }
            java.util.List<java.lang.Long> r4 = r1.u     // Catch:{ MalformedURLException -> 0x0306 }
            if (r4 == 0) goto L_0x02a4
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.i.a.m4 r4 = r4.n()     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.i.a.o4 r4 = r4.f3758f     // Catch:{ MalformedURLException -> 0x0306 }
            java.lang.String r5 = "Set uploading progress before finishing the previous upload"
            r4.a(r5)     // Catch:{ MalformedURLException -> 0x0306 }
            goto L_0x02ab
        L_0x02a4:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0306 }
            r4.<init>(r10)     // Catch:{ MalformedURLException -> 0x0306 }
            r1.u = r4     // Catch:{ MalformedURLException -> 0x0306 }
        L_0x02ab:
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.i.a.x4 r4 = r4.i()     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.i.a.d5 r4 = r4.f3929f     // Catch:{ MalformedURLException -> 0x0306 }
            r4.a(r7)     // Catch:{ MalformedURLException -> 0x0306 }
            java.lang.String r4 = "?"
            if (r9 <= 0) goto L_0x02c9
            MessageType r4 = r6.f3512f     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.g.g.s0 r4 = (i.c.a.b.g.g.s0) r4     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.g.g.d4<i.c.a.b.g.g.t0> r4 = r4.zzc     // Catch:{ MalformedURLException -> 0x0306 }
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.g.g.t0 r4 = (i.c.a.b.g.g.t0) r4     // Catch:{ MalformedURLException -> 0x0306 }
            java.lang.String r4 = r4.zzs     // Catch:{ MalformedURLException -> 0x0306 }
        L_0x02c9:
            i.c.a.b.i.a.s5 r5 = r1.f3896i     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.i.a.m4 r5 = r5.n()     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.i.a.o4 r5 = r5.f3766n     // Catch:{ MalformedURLException -> 0x0306 }
            java.lang.String r6 = "Uploading data. app, uncompressed size, data"
            int r7 = r13.length     // Catch:{ MalformedURLException -> 0x0306 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x0306 }
            r5.a(r6, r4, r7, r0)     // Catch:{ MalformedURLException -> 0x0306 }
            r0 = 1
            r1.f3904q = r0     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.i.a.s4 r10 = r17.c()     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.i.a.v9 r15 = new i.c.a.b.i.a.v9     // Catch:{ MalformedURLException -> 0x0306 }
            r15.<init>(r1, r3)     // Catch:{ MalformedURLException -> 0x0306 }
            r10.c()     // Catch:{ MalformedURLException -> 0x0306 }
            r10.m()     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.d.l.q.a(r12)     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.d.l.q.a(r13)     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.d.l.q.a(r15)     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.i.a.m5 r0 = r10.k()     // Catch:{ MalformedURLException -> 0x0306 }
            i.c.a.b.i.a.w4 r4 = new i.c.a.b.i.a.w4     // Catch:{ MalformedURLException -> 0x0306 }
            r14 = 0
            r9 = r4
            r11 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ MalformedURLException -> 0x0306 }
            r0.b(r4)     // Catch:{ MalformedURLException -> 0x0306 }
            goto L_0x033a
        L_0x0306:
            i.c.a.b.i.a.s5 r0 = r1.f3896i     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.m4 r0 = r0.n()     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.o4 r0 = r0.f3758f     // Catch:{ all -> 0x0342 }
            java.lang.String r4 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = i.c.a.b.i.a.m4.a((java.lang.String) r3)     // Catch:{ all -> 0x0342 }
            r0.a(r4, r3, r2)     // Catch:{ all -> 0x0342 }
            goto L_0x033a
        L_0x0318:
            r1.w = r9     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.d r0 = r17.d()     // Catch:{ all -> 0x0342 }
            long r2 = i.c.a.b.i.a.pa.w()     // Catch:{ all -> 0x0342 }
            long r7 = r7 - r2
            java.lang.String r0 = r0.a((long) r7)     // Catch:{ all -> 0x0342 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0342 }
            if (r2 != 0) goto L_0x033a
            i.c.a.b.i.a.d r2 = r17.d()     // Catch:{ all -> 0x0342 }
            i.c.a.b.i.a.c5 r0 = r2.b(r0)     // Catch:{ all -> 0x0342 }
            if (r0 == 0) goto L_0x033a
            r1.a((i.c.a.b.i.a.c5) r0)     // Catch:{ all -> 0x0342 }
        L_0x033a:
            r2 = 0
        L_0x033b:
            r1.r = r2
            r17.a()
            return
        L_0x0341:
            throw r4     // Catch:{ all -> 0x0342 }
        L_0x0342:
            r0 = move-exception
            r2 = 0
            r1.r = r2
            r17.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.t9.m():void");
    }

    public final m4 n() {
        return this.f3896i.n();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r11 = this;
            r11.r()
            r11.i()
            boolean r0 = r11.f3898k
            if (r0 != 0) goto L_0x01b6
            r0 = 1
            r11.f3898k = r0
            r11.r()
            i.c.a.b.i.a.s5 r1 = r11.f3896i
            i.c.a.b.i.a.pa r1 = r1.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.G0
            boolean r1 = r1.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r2)
            java.lang.String r2 = "Storage concurrent access okay"
            r3 = 0
            if (r1 == 0) goto L_0x0035
            java.nio.channels.FileLock r1 = r11.s
            if (r1 == 0) goto L_0x0035
            boolean r1 = r1.isValid()
            if (r1 == 0) goto L_0x0035
            i.c.a.b.i.a.s5 r1 = r11.f3896i
            i.c.a.b.i.a.m4 r1 = r1.n()
            i.c.a.b.i.a.o4 r1 = r1.f3766n
            r1.a(r2)
            goto L_0x0064
        L_0x0035:
            i.c.a.b.i.a.s5 r1 = r11.f3896i
            android.content.Context r1 = r1.a
            java.io.File r1 = r1.getFilesDir()
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "google_app_measurement.db"
            r4.<init>(r1, r5)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            java.lang.String r5 = "rw"
            r1.<init>(r4, r5)     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            r11.t = r1     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            java.nio.channels.FileLock r1 = r1.tryLock()     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            r11.s = r1     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            if (r1 == 0) goto L_0x0066
            i.c.a.b.i.a.s5 r1 = r11.f3896i     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            i.c.a.b.i.a.m4 r1 = r1.n()     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            i.c.a.b.i.a.o4 r1 = r1.f3766n     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            r1.a(r2)     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
        L_0x0064:
            r1 = 1
            goto L_0x00a1
        L_0x0066:
            i.c.a.b.i.a.s5 r1 = r11.f3896i     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            i.c.a.b.i.a.m4 r1 = r1.n()     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            i.c.a.b.i.a.o4 r1 = r1.f3758f     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            java.lang.String r2 = "Storage concurrent data access panic"
            r1.a(r2)     // Catch:{ FileNotFoundException -> 0x0092, IOException -> 0x0083, OverlappingFileLockException -> 0x0074 }
            goto L_0x00a0
        L_0x0074:
            r1 = move-exception
            i.c.a.b.i.a.s5 r2 = r11.f3896i
            i.c.a.b.i.a.m4 r2 = r2.n()
            i.c.a.b.i.a.o4 r2 = r2.f3761i
            java.lang.String r4 = "Storage lock already acquired"
            r2.a(r4, r1)
            goto L_0x00a0
        L_0x0083:
            r1 = move-exception
            i.c.a.b.i.a.s5 r2 = r11.f3896i
            i.c.a.b.i.a.m4 r2 = r2.n()
            i.c.a.b.i.a.o4 r2 = r2.f3758f
            java.lang.String r4 = "Failed to access storage lock file"
            r2.a(r4, r1)
            goto L_0x00a0
        L_0x0092:
            r1 = move-exception
            i.c.a.b.i.a.s5 r2 = r11.f3896i
            i.c.a.b.i.a.m4 r2 = r2.n()
            i.c.a.b.i.a.o4 r2 = r2.f3758f
            java.lang.String r4 = "Failed to acquire storage lock"
            r2.a(r4, r1)
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            if (r1 == 0) goto L_0x01b6
            java.nio.channels.FileChannel r1 = r11.t
            r11.r()
            r4 = 0
            r2 = 4
            java.lang.String r6 = "Bad channel to read from"
            if (r1 == 0) goto L_0x00ef
            boolean r7 = r1.isOpen()
            if (r7 != 0) goto L_0x00b6
            goto L_0x00ef
        L_0x00b6:
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r2)
            r1.position(r4)     // Catch:{ IOException -> 0x00e0 }
            int r1 = r1.read(r7)     // Catch:{ IOException -> 0x00e0 }
            if (r1 == r2) goto L_0x00d8
            r7 = -1
            if (r1 == r7) goto L_0x00fa
            i.c.a.b.i.a.s5 r7 = r11.f3896i     // Catch:{ IOException -> 0x00e0 }
            i.c.a.b.i.a.m4 r7 = r7.n()     // Catch:{ IOException -> 0x00e0 }
            i.c.a.b.i.a.o4 r7 = r7.f3761i     // Catch:{ IOException -> 0x00e0 }
            java.lang.String r8 = "Unexpected data length. Bytes read"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00e0 }
            r7.a(r8, r1)     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00fa
        L_0x00d8:
            r7.flip()     // Catch:{ IOException -> 0x00e0 }
            int r1 = r7.getInt()     // Catch:{ IOException -> 0x00e0 }
            goto L_0x00fb
        L_0x00e0:
            r1 = move-exception
            i.c.a.b.i.a.s5 r7 = r11.f3896i
            i.c.a.b.i.a.m4 r7 = r7.n()
            i.c.a.b.i.a.o4 r7 = r7.f3758f
            java.lang.String r8 = "Failed to read from channel"
            r7.a(r8, r1)
            goto L_0x00fa
        L_0x00ef:
            i.c.a.b.i.a.s5 r1 = r11.f3896i
            i.c.a.b.i.a.m4 r1 = r1.n()
            i.c.a.b.i.a.o4 r1 = r1.f3758f
            r1.a(r6)
        L_0x00fa:
            r1 = 0
        L_0x00fb:
            i.c.a.b.i.a.s5 r7 = r11.f3896i
            i.c.a.b.i.a.j4 r7 = r7.v()
            r7.w()
            int r7 = r7.e
            r11.r()
            if (r1 <= r7) goto L_0x0122
            i.c.a.b.i.a.s5 r0 = r11.f3896i
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.String r3 = "Panic: can't downgrade version. Previous, current version"
            r0.a(r3, r1, r2)
            goto L_0x01b6
        L_0x0122:
            if (r1 >= r7) goto L_0x01b6
            java.nio.channels.FileChannel r8 = r11.t
            r11.r()
            if (r8 == 0) goto L_0x017d
            boolean r9 = r8.isOpen()
            if (r9 != 0) goto L_0x0132
            goto L_0x017d
        L_0x0132:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r2.putInt(r7)
            r2.flip()
            r8.truncate(r4)     // Catch:{ IOException -> 0x016e }
            i.c.a.b.i.a.s5 r4 = r11.f3896i     // Catch:{ IOException -> 0x016e }
            i.c.a.b.i.a.pa r4 = r4.f3861g     // Catch:{ IOException -> 0x016e }
            i.c.a.b.i.a.f4<java.lang.Boolean> r5 = i.c.a.b.i.a.o.V0     // Catch:{ IOException -> 0x016e }
            r4.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r5)     // Catch:{ IOException -> 0x016e }
            r8.write(r2)     // Catch:{ IOException -> 0x016e }
            r8.force(r0)     // Catch:{ IOException -> 0x016e }
            long r4 = r8.size()     // Catch:{ IOException -> 0x016e }
            r9 = 4
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x0189
            i.c.a.b.i.a.s5 r2 = r11.f3896i     // Catch:{ IOException -> 0x016e }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ IOException -> 0x016e }
            i.c.a.b.i.a.o4 r2 = r2.f3758f     // Catch:{ IOException -> 0x016e }
            java.lang.String r4 = "Error writing to channel. Bytes written"
            long r5 = r8.size()     // Catch:{ IOException -> 0x016e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x016e }
            r2.a(r4, r5)     // Catch:{ IOException -> 0x016e }
            goto L_0x0189
        L_0x016e:
            r0 = move-exception
            i.c.a.b.i.a.s5 r2 = r11.f3896i
            i.c.a.b.i.a.m4 r2 = r2.n()
            i.c.a.b.i.a.o4 r2 = r2.f3758f
            java.lang.String r4 = "Failed to write to channel"
            r2.a(r4, r0)
            goto L_0x0188
        L_0x017d:
            i.c.a.b.i.a.s5 r0 = r11.f3896i
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            r0.a(r6)
        L_0x0188:
            r0 = 0
        L_0x0189:
            if (r0 == 0) goto L_0x01a1
            i.c.a.b.i.a.s5 r0 = r11.f3896i
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3766n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.String r3 = "Storage version upgraded. Previous, current version"
            r0.a(r3, r1, r2)
            goto L_0x01b6
        L_0x01a1:
            i.c.a.b.i.a.s5 r0 = r11.f3896i
            i.c.a.b.i.a.m4 r0 = r0.n()
            i.c.a.b.i.a.o4 r0 = r0.f3758f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.lang.String r3 = "Storage version upgrade failed. Previous, current version"
            r0.a(r3, r1, r2)
        L_0x01b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.t9.o():void");
    }

    public final v4 p() {
        v4 v4Var = this.d;
        if (v4Var != null) {
            return v4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final q9 q() {
        a((r9) this.e);
        return this.e;
    }

    public final void r() {
        this.f3896i.k().c();
    }

    public final long s() {
        if (((c) this.f3896i.f3868n) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            x4 i2 = this.f3896i.i();
            i2.o();
            i2.c();
            long a2 = i2.f3932i.a();
            if (a2 == 0) {
                a2 = 1 + ((long) i2.f().u().nextInt(86400000));
                i2.f3932i.a(a2);
            }
            return ((((currentTimeMillis + a2) / 1000) / 60) / 60) / 24;
        }
        throw null;
    }

    public final boolean t() {
        r();
        i();
        return ((d().b("select count(1) > 0 from raw_events", (String[]) null) > 0 ? 1 : (d().b("select count(1) > 0 from raw_events", (String[]) null) == 0 ? 0 : -1)) != 0) || !TextUtils.isEmpty(d().v());
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r20 = this;
            r0 = r20
            r20.r()
            r20.i()
            long r1 = r0.f3899l
            r3 = 0
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0050
            i.c.a.b.i.a.s5 r1 = r0.f3896i
            i.c.a.b.d.o.b r1 = r1.f3868n
            i.c.a.b.d.o.c r1 = (i.c.a.b.d.o.c) r1
            if (r1 == 0) goto L_0x004f
            long r1 = android.os.SystemClock.elapsedRealtime()
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r0.f3899l
            long r1 = r1 - r8
            long r1 = java.lang.Math.abs(r1)
            long r6 = r6 - r1
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x004c
            i.c.a.b.i.a.s5 r1 = r0.f3896i
            i.c.a.b.i.a.m4 r1 = r1.n()
            i.c.a.b.i.a.o4 r1 = r1.f3766n
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.a(r3, r2)
            i.c.a.b.i.a.v4 r1 = r20.p()
            r1.a()
            i.c.a.b.i.a.q9 r1 = r20.q()
            r1.t()
            return
        L_0x004c:
            r0.f3899l = r4
            goto L_0x0050
        L_0x004f:
            throw r3
        L_0x0050:
            i.c.a.b.i.a.s5 r1 = r0.f3896i
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x03d0
            boolean r1 = r20.t()
            if (r1 != 0) goto L_0x0060
            goto L_0x03d0
        L_0x0060:
            i.c.a.b.i.a.s5 r1 = r0.f3896i
            i.c.a.b.d.o.b r1 = r1.f3868n
            i.c.a.b.d.o.c r1 = (i.c.a.b.d.o.c) r1
            if (r1 == 0) goto L_0x03cf
            long r1 = java.lang.System.currentTimeMillis()
            i.c.a.b.i.a.f4<java.lang.Long> r6 = i.c.a.b.i.a.o.A
            java.lang.Object r6 = r6.a(r3)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            long r6 = java.lang.Math.max(r4, r6)
            i.c.a.b.i.a.d r8 = r20.d()
            java.lang.String r9 = "select count(1) > 0 from raw_events where realtime = 1"
            long r8 = r8.b((java.lang.String) r9, (java.lang.String[]) r3)
            int r12 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x008c
            r8 = 1
            goto L_0x008d
        L_0x008c:
            r8 = 0
        L_0x008d:
            if (r8 != 0) goto L_0x00a5
            i.c.a.b.i.a.d r8 = r20.d()
            java.lang.String r9 = "select count(1) > 0 from queue where has_realtime = 1"
            long r8 = r8.b((java.lang.String) r9, (java.lang.String[]) r3)
            int r12 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x009f
            r8 = 1
            goto L_0x00a0
        L_0x009f:
            r8 = 0
        L_0x00a0:
            if (r8 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r8 = 0
            goto L_0x00a6
        L_0x00a5:
            r8 = 1
        L_0x00a6:
            if (r8 == 0) goto L_0x00e4
            i.c.a.b.i.a.s5 r9 = r0.f3896i
            i.c.a.b.i.a.pa r9 = r9.f3861g
            java.lang.String r12 = "debug.firebase.analytics.app"
            java.lang.String r13 = ""
            java.lang.String r9 = r9.a((java.lang.String) r12, (java.lang.String) r13)
            boolean r12 = android.text.TextUtils.isEmpty(r9)
            if (r12 != 0) goto L_0x00d3
            java.lang.String r12 = ".none."
            boolean r9 = r12.equals(r9)
            if (r9 != 0) goto L_0x00d3
            i.c.a.b.i.a.f4<java.lang.Long> r9 = i.c.a.b.i.a.o.v
            java.lang.Object r9 = r9.a(r3)
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r12 = java.lang.Math.max(r4, r12)
            goto L_0x00f4
        L_0x00d3:
            i.c.a.b.i.a.f4<java.lang.Long> r9 = i.c.a.b.i.a.o.u
            java.lang.Object r9 = r9.a(r3)
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r12 = java.lang.Math.max(r4, r12)
            goto L_0x00f4
        L_0x00e4:
            i.c.a.b.i.a.f4<java.lang.Long> r9 = i.c.a.b.i.a.o.t
            java.lang.Object r9 = r9.a(r3)
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r12 = java.lang.Math.max(r4, r12)
        L_0x00f4:
            i.c.a.b.i.a.s5 r9 = r0.f3896i
            i.c.a.b.i.a.x4 r9 = r9.i()
            i.c.a.b.i.a.d5 r9 = r9.e
            long r14 = r9.a()
            i.c.a.b.i.a.s5 r9 = r0.f3896i
            i.c.a.b.i.a.x4 r9 = r9.i()
            i.c.a.b.i.a.d5 r9 = r9.f3929f
            long r16 = r9.a()
            i.c.a.b.i.a.d r9 = r20.d()
            java.lang.String r11 = "select max(bundle_end_timestamp) from queue"
            long r10 = r9.a((java.lang.String) r11, (java.lang.String[]) r3, (long) r4)
            i.c.a.b.i.a.d r9 = r20.d()
            java.lang.String r0 = "select max(timestamp) from raw_events"
            r18 = r12
            long r12 = r9.a((java.lang.String) r0, (java.lang.String[]) r3, (long) r4)
            long r9 = java.lang.Math.max(r10, r12)
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x012d
            r6 = r4
            goto L_0x01a3
        L_0x012d:
            long r9 = r9 - r1
            long r9 = java.lang.Math.abs(r9)
            long r9 = r1 - r9
            long r14 = r14 - r1
            long r11 = java.lang.Math.abs(r14)
            long r11 = r1 - r11
            long r16 = r16 - r1
            long r13 = java.lang.Math.abs(r16)
            long r1 = r1 - r13
            long r11 = java.lang.Math.max(r11, r1)
            long r6 = r6 + r9
            if (r8 == 0) goto L_0x0153
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0153
            long r6 = java.lang.Math.min(r9, r11)
            long r6 = r6 + r18
        L_0x0153:
            i.c.a.b.i.a.x9 r0 = r20.f()
            r13 = r18
            boolean r0 = r0.a((long) r11, (long) r13)
            if (r0 != 0) goto L_0x0161
            long r6 = r11 + r13
        L_0x0161:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01a3
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x01a3
            r0 = 0
        L_0x016a:
            r8 = 20
            i.c.a.b.i.a.f4<java.lang.Integer> r9 = i.c.a.b.i.a.o.C
            java.lang.Object r9 = r9.a(r3)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r10 = 0
            int r9 = java.lang.Math.max(r10, r9)
            int r8 = java.lang.Math.min(r8, r9)
            if (r0 >= r8) goto L_0x01a1
            r8 = 1
            long r8 = r8 << r0
            i.c.a.b.i.a.f4<java.lang.Long> r11 = i.c.a.b.i.a.o.B
            java.lang.Object r11 = r11.a(r3)
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r4, r11)
            long r11 = r11 * r8
            long r6 = r6 + r11
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x019e
            goto L_0x01a4
        L_0x019e:
            int r0 = r0 + 1
            goto L_0x016a
        L_0x01a1:
            r6 = r4
            goto L_0x01a4
        L_0x01a3:
            r10 = 0
        L_0x01a4:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01c6
            r0 = r20
            i.c.a.b.i.a.s5 r1 = r0.f3896i
            i.c.a.b.i.a.m4 r1 = r1.n()
            i.c.a.b.i.a.o4 r1 = r1.f3766n
            java.lang.String r2 = "Next upload time is 0"
            r1.a(r2)
            i.c.a.b.i.a.v4 r1 = r20.p()
            r1.a()
            i.c.a.b.i.a.q9 r1 = r20.q()
            r1.t()
            return
        L_0x01c6:
            r0 = r20
            i.c.a.b.i.a.s4 r1 = r20.c()
            boolean r1 = r1.t()
            if (r1 != 0) goto L_0x0230
            i.c.a.b.i.a.s5 r1 = r0.f3896i
            i.c.a.b.i.a.m4 r1 = r1.n()
            i.c.a.b.i.a.o4 r1 = r1.f3766n
            java.lang.String r2 = "No network"
            r1.a(r2)
            i.c.a.b.i.a.v4 r1 = r20.p()
            i.c.a.b.i.a.t9 r2 = r1.a
            r2.i()
            i.c.a.b.i.a.t9 r2 = r1.a
            i.c.a.b.i.a.m5 r2 = r2.k()
            r2.c()
            boolean r2 = r1.f3912b
            if (r2 == 0) goto L_0x01f6
            goto L_0x0228
        L_0x01f6:
            i.c.a.b.i.a.t9 r2 = r1.a
            i.c.a.b.i.a.s5 r2 = r2.f3896i
            android.content.Context r2 = r2.a
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.net.conn.CONNECTIVITY_CHANGE"
            r3.<init>(r4)
            r2.registerReceiver(r1, r3)
            i.c.a.b.i.a.t9 r2 = r1.a
            i.c.a.b.i.a.s4 r2 = r2.c()
            boolean r2 = r2.t()
            r1.c = r2
            i.c.a.b.i.a.t9 r2 = r1.a
            i.c.a.b.i.a.m4 r2 = r2.n()
            i.c.a.b.i.a.o4 r2 = r2.f3766n
            boolean r3 = r1.c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Registering connectivity change receiver. Network connected"
            r2.a(r4, r3)
            r2 = 1
            r1.f3912b = r2
        L_0x0228:
            i.c.a.b.i.a.q9 r1 = r20.q()
            r1.t()
            return
        L_0x0230:
            i.c.a.b.i.a.s5 r1 = r0.f3896i
            i.c.a.b.i.a.x4 r1 = r1.i()
            i.c.a.b.i.a.d5 r1 = r1.f3930g
            long r1 = r1.a()
            i.c.a.b.i.a.f4<java.lang.Long> r8 = i.c.a.b.i.a.o.r
            java.lang.Object r8 = r8.a(r3)
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            long r8 = java.lang.Math.max(r4, r8)
            i.c.a.b.i.a.x9 r11 = r20.f()
            boolean r11 = r11.a((long) r1, (long) r8)
            if (r11 != 0) goto L_0x025b
            long r1 = r1 + r8
            long r6 = java.lang.Math.max(r6, r1)
        L_0x025b:
            i.c.a.b.i.a.v4 r1 = r20.p()
            r1.a()
            i.c.a.b.i.a.s5 r1 = r0.f3896i
            i.c.a.b.d.o.b r1 = r1.f3868n
            i.c.a.b.d.o.c r1 = (i.c.a.b.d.o.c) r1
            if (r1 == 0) goto L_0x03ce
            long r1 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x029c
            i.c.a.b.i.a.f4<java.lang.Long> r1 = i.c.a.b.i.a.o.w
            java.lang.Object r1 = r1.a(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r6 = java.lang.Math.max(r4, r1)
            i.c.a.b.i.a.s5 r1 = r0.f3896i
            i.c.a.b.i.a.x4 r1 = r1.i()
            i.c.a.b.i.a.d5 r1 = r1.e
            i.c.a.b.i.a.s5 r2 = r0.f3896i
            i.c.a.b.d.o.b r2 = r2.f3868n
            i.c.a.b.d.o.c r2 = (i.c.a.b.d.o.c) r2
            if (r2 == 0) goto L_0x029b
            long r8 = java.lang.System.currentTimeMillis()
            r1.a(r8)
            goto L_0x029c
        L_0x029b:
            throw r3
        L_0x029c:
            i.c.a.b.i.a.s5 r1 = r0.f3896i
            i.c.a.b.i.a.m4 r1 = r1.n()
            i.c.a.b.i.a.o4 r1 = r1.f3766n
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r8 = "Upload scheduled in approximately ms"
            r1.a(r8, r2)
            i.c.a.b.i.a.q9 r1 = r20.q()
            r1.m()
            i.c.a.b.i.a.s5 r2 = r1.a
            i.c.a.b.i.a.oa r8 = r2.f3860f
            android.content.Context r2 = r2.a
            boolean r8 = i.c.a.b.i.a.j5.a(r2)
            if (r8 != 0) goto L_0x02cb
            i.c.a.b.i.a.m4 r8 = r1.n()
            i.c.a.b.i.a.o4 r8 = r8.f3765m
            java.lang.String r9 = "Receiver not registered/enabled"
            r8.a(r9)
        L_0x02cb:
            boolean r2 = i.c.a.b.i.a.ca.a((android.content.Context) r2)
            if (r2 != 0) goto L_0x02dc
            i.c.a.b.i.a.m4 r2 = r1.n()
            i.c.a.b.i.a.o4 r2 = r2.f3765m
            java.lang.String r8 = "Service not registered/enabled"
            r2.a(r8)
        L_0x02dc:
            r1.t()
            boolean r2 = r1.x()
            if (r2 == 0) goto L_0x02f4
            i.c.a.b.i.a.m4 r2 = r1.n()
            i.c.a.b.i.a.o4 r2 = r2.f3766n
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.lang.String r9 = "Scheduling upload, millis"
            r2.a(r9, r8)
        L_0x02f4:
            i.c.a.b.i.a.s5 r2 = r1.a
            i.c.a.b.d.o.b r2 = r2.f3868n
            i.c.a.b.d.o.c r2 = (i.c.a.b.d.o.c) r2
            if (r2 == 0) goto L_0x03cd
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r13 = r8 + r6
            i.c.a.b.i.a.f4<java.lang.Long> r2 = i.c.a.b.i.a.o.x
            java.lang.Object r2 = r2.a(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            long r8 = r2.longValue()
            long r8 = java.lang.Math.max(r4, r8)
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0337
            i.c.a.b.i.a.f r2 = r1.e
            long r8 = r2.c
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x031f
            r10 = 1
        L_0x031f:
            if (r10 != 0) goto L_0x0337
            boolean r2 = r1.x()
            if (r2 != 0) goto L_0x0332
            i.c.a.b.i.a.m4 r2 = r1.n()
            i.c.a.b.i.a.o4 r2 = r2.f3766n
            java.lang.String r4 = "Scheduling upload with DelayedRunnable"
            r2.a(r4)
        L_0x0332:
            i.c.a.b.i.a.f r2 = r1.e
            r2.a(r6)
        L_0x0337:
            i.c.a.b.i.a.s5 r2 = r1.a
            i.c.a.b.i.a.oa r2 = r2.f3860f
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r2 < r4) goto L_0x03a1
            boolean r2 = r1.x()
            if (r2 != 0) goto L_0x0352
            i.c.a.b.i.a.m4 r2 = r1.n()
            i.c.a.b.i.a.o4 r2 = r2.f3766n
            java.lang.String r3 = "Scheduling upload with JobScheduler"
            r2.a(r3)
        L_0x0352:
            i.c.a.b.i.a.s5 r2 = r1.a
            android.content.Context r2 = r2.a
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementJobService"
            r3.<init>(r2, r4)
            int r4 = r1.v()
            android.os.PersistableBundle r5 = new android.os.PersistableBundle
            r5.<init>()
            java.lang.String r8 = "action"
            java.lang.String r9 = "com.google.android.gms.measurement.UPLOAD"
            r5.putString(r8, r9)
            android.app.job.JobInfo$Builder r8 = new android.app.job.JobInfo$Builder
            r8.<init>(r4, r3)
            android.app.job.JobInfo$Builder r3 = r8.setMinimumLatency(r6)
            r8 = 1
            long r6 = r6 << r8
            android.app.job.JobInfo$Builder r3 = r3.setOverrideDeadline(r6)
            android.app.job.JobInfo$Builder r3 = r3.setExtras(r5)
            android.app.job.JobInfo r3 = r3.build()
            boolean r5 = r1.x()
            if (r5 != 0) goto L_0x0399
            i.c.a.b.i.a.m4 r1 = r1.n()
            i.c.a.b.i.a.o4 r1 = r1.f3766n
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Scheduling job. JobID"
            r1.a(r5, r4)
        L_0x0399:
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r4 = "UploadAlarm"
            i.c.a.b.g.g.p5.a(r2, r3, r1, r4)
            goto L_0x03cc
        L_0x03a1:
            boolean r2 = r1.x()
            if (r2 != 0) goto L_0x03b2
            i.c.a.b.i.a.m4 r2 = r1.n()
            i.c.a.b.i.a.o4 r2 = r2.f3766n
            java.lang.String r4 = "Scheduling upload with AlarmManager"
            r2.a(r4)
        L_0x03b2:
            android.app.AlarmManager r11 = r1.d
            r12 = 2
            i.c.a.b.i.a.f4<java.lang.Long> r2 = i.c.a.b.i.a.o.s
            java.lang.Object r2 = r2.a(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r15 = java.lang.Math.max(r2, r6)
            android.app.PendingIntent r17 = r1.w()
            r11.setInexactRepeating(r12, r13, r15, r17)
        L_0x03cc:
            return
        L_0x03cd:
            throw r3
        L_0x03ce:
            throw r3
        L_0x03cf:
            throw r3
        L_0x03d0:
            i.c.a.b.i.a.s5 r1 = r0.f3896i
            i.c.a.b.i.a.m4 r1 = r1.n()
            i.c.a.b.i.a.o4 r1 = r1.f3766n
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.a(r2)
            i.c.a.b.i.a.v4 r1 = r20.p()
            r1.a()
            i.c.a.b.i.a.q9 r1 = r20.q()
            r1.t()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.t9.u():void");
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public class a {
        public t0 a;

        /* renamed from: b  reason: collision with root package name */
        public List<Long> f3905b;
        public List<p0> c;
        public long d;

        public /* synthetic */ a(t9 t9Var, s9 s9Var) {
        }

        public final void a(t0 t0Var) {
            q.a(t0Var);
            this.a = t0Var;
        }

        public final boolean a(long j2, p0 p0Var) {
            q.a(p0Var);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.f3905b == null) {
                this.f3905b = new ArrayList();
            }
            if (this.c.size() > 0 && ((this.c.get(0).zzf / 1000) / 60) / 60 != ((p0Var.zzf / 1000) / 60) / 60) {
                return false;
            }
            long e = this.d + ((long) p0Var.e());
            if (e >= ((long) Math.max(0, o.f3805i.a(null).intValue()))) {
                return false;
            }
            this.d = e;
            this.c.add(p0Var);
            this.f3905b.add(Long.valueOf(j2));
            if (this.c.size() >= Math.max(1, o.f3806j.a(null).intValue())) {
                return false;
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:313:0x09c8, code lost:
        if (r11.e < ((long) r1.f3896i.g().b(r4.a))) goto L_0x09ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x09ca, code lost:
        r2 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0389 A[Catch:{ SQLiteException -> 0x034b, all -> 0x0a5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03b7 A[Catch:{ SQLiteException -> 0x034b, all -> 0x0a5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03c0 A[Catch:{ SQLiteException -> 0x034b, all -> 0x0a5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03f9 A[Catch:{ SQLiteException -> 0x034b, all -> 0x0a5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0408 A[Catch:{ SQLiteException -> 0x034b, all -> 0x0a5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0443 A[Catch:{ SQLiteException -> 0x034b, all -> 0x0a5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0470  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0224 A[Catch:{ SQLiteException -> 0x034b, all -> 0x0a5c }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x022c A[Catch:{ SQLiteException -> 0x034b, all -> 0x0a5c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(i.c.a.b.i.a.m r32, i.c.a.b.i.a.ea r33) {
        /*
            r31 = this;
            r1 = r31
            r2 = r32
            r3 = r33
            java.lang.String r4 = "_s"
            i.c.a.b.d.l.q.a(r33)
            java.lang.String r5 = r3.e
            i.c.a.b.d.l.q.b((java.lang.String) r5)
            long r5 = java.lang.System.nanoTime()
            r31.r()
            r31.i()
            java.lang.String r15 = r3.e
            i.c.a.b.i.a.x9 r7 = r31.f()
            boolean r7 = r7.a((i.c.a.b.i.a.m) r2, (i.c.a.b.i.a.ea) r3)
            if (r7 != 0) goto L_0x0027
            return
        L_0x0027:
            boolean r7 = r3.f3655l
            if (r7 != 0) goto L_0x002f
            r1.b((i.c.a.b.i.a.ea) r3)
            return
        L_0x002f:
            i.c.a.b.i.a.n5 r7 = r31.b()
            java.lang.String r8 = r2.e
            boolean r7 = r7.b(r15, r8)
            java.lang.String r14 = "_ev"
            java.lang.String r13 = "_err"
            r11 = 0
            r18 = 1
            r12 = 0
            if (r7 == 0) goto L_0x00dc
            i.c.a.b.i.a.s5 r3 = r1.f3896i
            i.c.a.b.i.a.m4 r3 = r3.n()
            i.c.a.b.i.a.o4 r3 = r3.w()
            java.lang.Object r4 = i.c.a.b.i.a.m4.a((java.lang.String) r15)
            i.c.a.b.i.a.s5 r5 = r1.f3896i
            i.c.a.b.i.a.k4 r5 = r5.q()
            java.lang.String r6 = r2.e
            java.lang.String r5 = r5.a((java.lang.String) r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.a(r6, r4, r5)
            i.c.a.b.i.a.n5 r3 = r31.b()
            boolean r3 = r3.d(r15)
            if (r3 != 0) goto L_0x0079
            i.c.a.b.i.a.n5 r3 = r31.b()
            boolean r3 = r3.e(r15)
            if (r3 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            r18 = 0
        L_0x0079:
            if (r18 != 0) goto L_0x0090
            java.lang.String r3 = r2.e
            boolean r3 = r13.equals(r3)
            if (r3 != 0) goto L_0x0090
            i.c.a.b.i.a.s5 r3 = r1.f3896i
            i.c.a.b.i.a.ca r3 = r3.p()
            r4 = 11
            java.lang.String r2 = r2.e
            r3.a((int) r4, (java.lang.String) r14, (java.lang.String) r2, (int) r12)
        L_0x0090:
            if (r18 == 0) goto L_0x00db
            i.c.a.b.i.a.d r2 = r31.d()
            i.c.a.b.i.a.c5 r2 = r2.b(r15)
            if (r2 == 0) goto L_0x00db
            long r3 = r2.y()
            long r5 = r2.x()
            long r3 = java.lang.Math.max(r3, r5)
            i.c.a.b.i.a.s5 r5 = r1.f3896i
            i.c.a.b.d.o.b r5 = r5.l()
            i.c.a.b.d.o.c r5 = (i.c.a.b.d.o.c) r5
            long r5 = r5.a()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            i.c.a.b.i.a.f4<java.lang.Long> r5 = i.c.a.b.i.a.o.z
            java.lang.Object r5 = r5.a(r11)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00db
            i.c.a.b.i.a.s5 r3 = r1.f3896i
            i.c.a.b.i.a.m4 r3 = r3.n()
            i.c.a.b.i.a.o4 r3 = r3.y()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.a(r4)
            r1.a((i.c.a.b.i.a.c5) r2)
        L_0x00db:
            return
        L_0x00dc:
            boolean r7 = i.c.a.b.g.g.t7.b()
            if (r7 == 0) goto L_0x01a9
            i.c.a.b.i.a.s5 r7 = r1.f3896i
            i.c.a.b.i.a.pa r7 = r7.g()
            i.c.a.b.i.a.f4<java.lang.Boolean> r8 = i.c.a.b.i.a.o.g1
            boolean r7 = r7.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r8)
            if (r7 == 0) goto L_0x01a9
            java.lang.String r7 = r2.e
            java.lang.String r8 = r2.f3756g
            i.c.a.b.i.a.l r9 = r2.f3755f
            android.os.Bundle r9 = r9.b()
            long r11 = r2.f3757h
            i.c.a.b.i.a.s5 r2 = r1.f3896i
            i.c.a.b.i.a.ca r2 = r2.p()
            i.c.a.b.i.a.s5 r10 = r1.f3896i
            i.c.a.b.i.a.pa r10 = r10.g()
            r25 = r13
            i.c.a.b.i.a.f4<java.lang.Integer> r13 = i.c.a.b.i.a.o.I
            r26 = r14
            r14 = 25
            r27 = r5
            r5 = 100
            int r5 = r10.a(r15, r13, r14, r5)
            java.util.TreeSet r6 = new java.util.TreeSet
            java.util.Set r10 = r9.keySet()
            r6.<init>(r10)
            java.util.Iterator r6 = r6.iterator()
            r10 = 0
        L_0x0126:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x018f
            java.lang.Object r13 = r6.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = i.c.a.b.i.a.ca.h(r13)
            if (r14 == 0) goto L_0x0186
            int r10 = r10 + 1
            if (r10 <= r5) goto L_0x017d
            r14 = 48
            r32 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r14)
            java.lang.String r14 = "Event can't contain more than "
            r6.append(r14)
            r6.append(r5)
            java.lang.String r14 = " params"
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            i.c.a.b.i.a.m4 r14 = r2.n()
            i.c.a.b.i.a.o4 r14 = r14.v()
            r19 = r5
            i.c.a.b.i.a.k4 r5 = r2.e()
            java.lang.String r5 = r5.a((java.lang.String) r7)
            r20 = r10
            i.c.a.b.i.a.k4 r10 = r2.e()
            java.lang.String r10 = r10.a((android.os.Bundle) r9)
            r14.a(r6, r5, r10)
            r5 = 5
            i.c.a.b.i.a.ca.a((android.os.Bundle) r9, (int) r5)
            r9.remove(r13)
            goto L_0x0183
        L_0x017d:
            r19 = r5
            r32 = r6
            r20 = r10
        L_0x0183:
            r10 = r20
            goto L_0x018a
        L_0x0186:
            r19 = r5
            r32 = r6
        L_0x018a:
            r6 = r32
            r5 = r19
            goto L_0x0126
        L_0x018f:
            i.c.a.b.i.a.m r2 = new i.c.a.b.i.a.m
            i.c.a.b.i.a.l r5 = new i.c.a.b.i.a.l
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>(r9)
            r5.<init>(r6)
            r19 = r2
            r20 = r7
            r21 = r5
            r22 = r8
            r23 = r11
            r19.<init>(r20, r21, r22, r23)
            goto L_0x01af
        L_0x01a9:
            r27 = r5
            r25 = r13
            r26 = r14
        L_0x01af:
            i.c.a.b.i.a.s5 r5 = r1.f3896i
            i.c.a.b.i.a.m4 r5 = r5.n()
            r6 = 2
            boolean r5 = r5.a((int) r6)
            if (r5 == 0) goto L_0x01d5
            i.c.a.b.i.a.s5 r5 = r1.f3896i
            i.c.a.b.i.a.m4 r5 = r5.n()
            i.c.a.b.i.a.o4 r5 = r5.z()
            i.c.a.b.i.a.s5 r7 = r1.f3896i
            i.c.a.b.i.a.k4 r7 = r7.q()
            java.lang.String r7 = r7.a((i.c.a.b.i.a.m) r2)
            java.lang.String r8 = "Logging event"
            r5.a(r8, r7)
        L_0x01d5:
            i.c.a.b.i.a.d r5 = r31.d()
            r5.y()
            r1.b((i.c.a.b.i.a.ea) r3)     // Catch:{ all -> 0x0a5c }
            boolean r5 = i.c.a.b.g.g.e8.b()     // Catch:{ all -> 0x0a5c }
            if (r5 == 0) goto L_0x01f5
            i.c.a.b.i.a.s5 r5 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r5 = r5.g()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Boolean> r7 = i.c.a.b.i.a.o.f1     // Catch:{ all -> 0x0a5c }
            boolean r5 = r5.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r7)     // Catch:{ all -> 0x0a5c }
            if (r5 == 0) goto L_0x01f5
            r5 = 1
            goto L_0x01f6
        L_0x01f5:
            r5 = 0
        L_0x01f6:
            java.lang.String r7 = "ecommerce_purchase"
            java.lang.String r8 = r2.e     // Catch:{ all -> 0x0a5c }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0a5c }
            java.lang.String r8 = "refund"
            if (r7 != 0) goto L_0x0219
            if (r5 == 0) goto L_0x0217
            java.lang.String r5 = "purchase"
            java.lang.String r7 = r2.e     // Catch:{ all -> 0x0a5c }
            boolean r5 = r5.equals(r7)     // Catch:{ all -> 0x0a5c }
            if (r5 != 0) goto L_0x0219
            java.lang.String r5 = r2.e     // Catch:{ all -> 0x0a5c }
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x0a5c }
            if (r5 == 0) goto L_0x0217
            goto L_0x0219
        L_0x0217:
            r5 = 0
            goto L_0x021a
        L_0x0219:
            r5 = 1
        L_0x021a:
            java.lang.String r7 = "_iap"
            java.lang.String r9 = r2.e     // Catch:{ all -> 0x0a5c }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0a5c }
            if (r7 != 0) goto L_0x0229
            if (r5 == 0) goto L_0x0227
            goto L_0x0229
        L_0x0227:
            r7 = 0
            goto L_0x022a
        L_0x0229:
            r7 = 1
        L_0x022a:
            if (r7 == 0) goto L_0x03cf
            i.c.a.b.i.a.l r7 = r2.f3755f     // Catch:{ all -> 0x0a5c }
            java.lang.String r9 = "currency"
            java.lang.String r7 = r7.d(r9)     // Catch:{ all -> 0x0a5c }
            java.lang.String r9 = "value"
            if (r5 == 0) goto L_0x02a8
            i.c.a.b.i.a.l r5 = r2.f3755f     // Catch:{ all -> 0x0a5c }
            java.lang.Double r5 = r5.c(r9)     // Catch:{ all -> 0x0a5c }
            double r10 = r5.doubleValue()     // Catch:{ all -> 0x0a5c }
            r12 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r10 = r10 * r12
            r19 = 0
            int r5 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r5 != 0) goto L_0x025c
            i.c.a.b.i.a.l r5 = r2.f3755f     // Catch:{ all -> 0x0a5c }
            java.lang.Long r5 = r5.b(r9)     // Catch:{ all -> 0x0a5c }
            long r9 = r5.longValue()     // Catch:{ all -> 0x0a5c }
            double r9 = (double) r9     // Catch:{ all -> 0x0a5c }
            double r10 = r9 * r12
        L_0x025c:
            r12 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x028a
            r12 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x028a
            long r9 = java.lang.Math.round(r10)     // Catch:{ all -> 0x0a5c }
            boolean r5 = i.c.a.b.g.g.e8.b()     // Catch:{ all -> 0x0a5c }
            if (r5 == 0) goto L_0x02b2
            i.c.a.b.i.a.s5 r5 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r5 = r5.g()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Boolean> r11 = i.c.a.b.i.a.o.f1     // Catch:{ all -> 0x0a5c }
            boolean r5 = r5.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r11)     // Catch:{ all -> 0x0a5c }
            if (r5 == 0) goto L_0x02b2
            java.lang.String r5 = r2.e     // Catch:{ all -> 0x0a5c }
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x0a5c }
            if (r5 == 0) goto L_0x02b2
            long r9 = -r9
            goto L_0x02b2
        L_0x028a:
            i.c.a.b.i.a.s5 r5 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.m4 r5 = r5.n()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.o4 r5 = r5.w()     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = "Data lost. Currency value is too big. appId"
            java.lang.Object r8 = i.c.a.b.i.a.m4.a((java.lang.String) r15)     // Catch:{ all -> 0x0a5c }
            java.lang.Double r9 = java.lang.Double.valueOf(r10)     // Catch:{ all -> 0x0a5c }
            r5.a(r7, r8, r9)     // Catch:{ all -> 0x0a5c }
            r29 = r25
            r12 = 0
            r13 = 0
            r14 = 0
            goto L_0x03be
        L_0x02a8:
            i.c.a.b.i.a.l r5 = r2.f3755f     // Catch:{ all -> 0x0a5c }
            java.lang.Long r5 = r5.b(r9)     // Catch:{ all -> 0x0a5c }
            long r9 = r5.longValue()     // Catch:{ all -> 0x0a5c }
        L_0x02b2:
            boolean r5 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a5c }
            if (r5 != 0) goto L_0x03b9
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ all -> 0x0a5c }
            java.lang.String r5 = r7.toUpperCase(r5)     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = "[A-Z]{3}"
            boolean r7 = r5.matches(r7)     // Catch:{ all -> 0x0a5c }
            if (r7 == 0) goto L_0x03b9
            java.lang.String r7 = "_ltv_"
            int r8 = r5.length()     // Catch:{ all -> 0x0a5c }
            if (r8 == 0) goto L_0x02d3
            java.lang.String r5 = r7.concat(r5)     // Catch:{ all -> 0x0a5c }
            goto L_0x02d8
        L_0x02d3:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0a5c }
            r5.<init>(r7)     // Catch:{ all -> 0x0a5c }
        L_0x02d8:
            i.c.a.b.i.a.d r7 = r31.d()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.da r7 = r7.c(r15, r5)     // Catch:{ all -> 0x0a5c }
            if (r7 == 0) goto L_0x0316
            java.lang.Object r8 = r7.e     // Catch:{ all -> 0x0a5c }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x0a5c }
            if (r8 != 0) goto L_0x02e9
            goto L_0x0316
        L_0x02e9:
            java.lang.Object r7 = r7.e     // Catch:{ all -> 0x0a5c }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0a5c }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.da r14 = new i.c.a.b.i.a.da     // Catch:{ all -> 0x0a5c }
            java.lang.String r11 = r2.f3756g     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r12 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.d.o.b r12 = r12.l()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.d.o.c r12 = (i.c.a.b.d.o.c) r12
            long r12 = r12.a()     // Catch:{ all -> 0x0a5c }
            long r7 = r7 + r9
            java.lang.Long r19 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0a5c }
            r7 = r14
            r8 = r15
            r9 = r11
            r10 = r5
            r5 = 0
            r11 = r12
            r29 = r25
            r13 = r19
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x0a5c }
            r5 = r14
            r14 = 0
            goto L_0x037f
        L_0x0316:
            r29 = r25
            r14 = 0
            i.c.a.b.i.a.d r7 = r31.d()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r8 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r8 = r8.g()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Integer> r11 = i.c.a.b.i.a.o.E     // Catch:{ all -> 0x0a5c }
            int r8 = r8.b(r15, r11)     // Catch:{ all -> 0x0a5c }
            int r8 = r8 + -1
            i.c.a.b.d.l.q.b((java.lang.String) r15)     // Catch:{ all -> 0x0a5c }
            r7.c()     // Catch:{ all -> 0x0a5c }
            r7.m()     // Catch:{ all -> 0x0a5c }
            android.database.sqlite.SQLiteDatabase r11 = r7.u()     // Catch:{ SQLiteException -> 0x034b }
            java.lang.String r12 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r13 = 3
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x034b }
            r13[r14] = r15     // Catch:{ SQLiteException -> 0x034b }
            r13[r18] = r15     // Catch:{ SQLiteException -> 0x034b }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x034b }
            r13[r6] = r8     // Catch:{ SQLiteException -> 0x034b }
            r11.execSQL(r12, r13)     // Catch:{ SQLiteException -> 0x034b }
            goto L_0x035e
        L_0x034b:
            r0 = move-exception
            r8 = r0
            i.c.a.b.i.a.m4 r7 = r7.n()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.o4 r7 = r7.u()     // Catch:{ all -> 0x0a5c }
            java.lang.String r11 = "Error pruning currencies. appId"
            java.lang.Object r12 = i.c.a.b.i.a.m4.a((java.lang.String) r15)     // Catch:{ all -> 0x0a5c }
            r7.a(r11, r12, r8)     // Catch:{ all -> 0x0a5c }
        L_0x035e:
            i.c.a.b.i.a.da r16 = new i.c.a.b.i.a.da     // Catch:{ all -> 0x0a5c }
            java.lang.String r11 = r2.f3756g     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.d.o.b r7 = r7.l()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.d.o.c r7 = (i.c.a.b.d.o.c) r7
            long r12 = r7.a()     // Catch:{ all -> 0x0a5c }
            java.lang.Long r17 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0a5c }
            r7 = r16
            r8 = r15
            r9 = r11
            r10 = r5
            r11 = r12
            r13 = r17
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x0a5c }
            r5 = r16
        L_0x037f:
            i.c.a.b.i.a.d r7 = r31.d()     // Catch:{ all -> 0x0a5c }
            boolean r7 = r7.a((i.c.a.b.i.a.da) r5)     // Catch:{ all -> 0x0a5c }
            if (r7 != 0) goto L_0x03b7
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.m4 r7 = r7.n()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.o4 r7 = r7.u()     // Catch:{ all -> 0x0a5c }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = i.c.a.b.i.a.m4.a((java.lang.String) r15)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r10 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.k4 r10 = r10.q()     // Catch:{ all -> 0x0a5c }
            java.lang.String r11 = r5.c     // Catch:{ all -> 0x0a5c }
            java.lang.String r10 = r10.c(r11)     // Catch:{ all -> 0x0a5c }
            java.lang.Object r5 = r5.e     // Catch:{ all -> 0x0a5c }
            r7.a(r8, r9, r10, r5)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r5 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.ca r5 = r5.p()     // Catch:{ all -> 0x0a5c }
            r7 = 9
            r13 = 0
            r5.a((int) r7, (java.lang.String) r13, (java.lang.String) r13, (int) r14)     // Catch:{ all -> 0x0a5c }
            goto L_0x03bd
        L_0x03b7:
            r13 = 0
            goto L_0x03bd
        L_0x03b9:
            r29 = r25
            r13 = 0
            r14 = 0
        L_0x03bd:
            r12 = 1
        L_0x03be:
            if (r12 != 0) goto L_0x03d3
            i.c.a.b.i.a.d r2 = r31.d()     // Catch:{ all -> 0x0a5c }
            r2.t()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.d r2 = r31.d()
            r2.z()
            return
        L_0x03cf:
            r29 = r25
            r13 = 0
            r14 = 0
        L_0x03d3:
            java.lang.String r5 = r2.e     // Catch:{ all -> 0x0a5c }
            boolean r5 = i.c.a.b.i.a.ca.h(r5)     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r2.e     // Catch:{ all -> 0x0a5c }
            r8 = r29
            boolean r19 = r8.equals(r7)     // Catch:{ all -> 0x0a5c }
            boolean r7 = i.c.a.b.g.g.e8.b()     // Catch:{ all -> 0x0a5c }
            r20 = 1
            if (r7 == 0) goto L_0x0408
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r7 = r7.g()     // Catch:{ all -> 0x0a5c }
            java.lang.String r8 = r3.e     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Boolean> r9 = i.c.a.b.i.a.o.b1     // Catch:{ all -> 0x0a5c }
            boolean r7 = r7.e(r8, r9)     // Catch:{ all -> 0x0a5c }
            if (r7 == 0) goto L_0x0408
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            r7.p()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.l r7 = r2.f3755f     // Catch:{ all -> 0x0a5c }
            long r7 = i.c.a.b.i.a.ca.a((i.c.a.b.i.a.l) r7)     // Catch:{ all -> 0x0a5c }
            long r7 = r7 + r20
            r11 = r7
            goto L_0x040a
        L_0x0408:
            r11 = r20
        L_0x040a:
            i.c.a.b.i.a.d r7 = r31.d()     // Catch:{ all -> 0x0a5c }
            long r8 = r31.s()     // Catch:{ all -> 0x0a5c }
            r16 = 1
            r17 = 0
            r22 = 0
            r10 = r15
            r6 = r13
            r13 = r16
            r30 = r26
            r14 = r5
            r23 = r15
            r15 = r17
            r16 = r19
            r17 = r22
            i.c.a.b.i.a.c r7 = r7.a(r8, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0a5c }
            long r8 = r7.f3605b     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Integer> r10 = i.c.a.b.i.a.o.f3807k     // Catch:{ all -> 0x0a5c }
            java.lang.Object r10 = r10.a(r6)     // Catch:{ all -> 0x0a5c }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0a5c }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0a5c }
            long r10 = (long) r10     // Catch:{ all -> 0x0a5c }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r14 = 0
            int r12 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x0470
            long r8 = r8 % r10
            int r2 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x0461
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.o4 r2 = r2.u()     // Catch:{ all -> 0x0a5c }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = i.c.a.b.i.a.m4.a((java.lang.String) r23)     // Catch:{ all -> 0x0a5c }
            long r5 = r7.f3605b     // Catch:{ all -> 0x0a5c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a5c }
            r2.a(r3, r4, r5)     // Catch:{ all -> 0x0a5c }
        L_0x0461:
            i.c.a.b.i.a.d r2 = r31.d()     // Catch:{ all -> 0x0a5c }
            r2.t()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.d r2 = r31.d()
            r2.z()
            return
        L_0x0470:
            if (r5 == 0) goto L_0x04c3
            long r8 = r7.a     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Integer> r12 = i.c.a.b.i.a.o.f3809m     // Catch:{ all -> 0x0a5c }
            java.lang.Object r12 = r12.a(r6)     // Catch:{ all -> 0x0a5c }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x0a5c }
            int r12 = r12.intValue()     // Catch:{ all -> 0x0a5c }
            long r12 = (long) r12     // Catch:{ all -> 0x0a5c }
            long r8 = r8 - r12
            int r12 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x04c3
            long r8 = r8 % r10
            int r3 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x04a4
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.m4 r3 = r3.n()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.o4 r3 = r3.u()     // Catch:{ all -> 0x0a5c }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = i.c.a.b.i.a.m4.a((java.lang.String) r23)     // Catch:{ all -> 0x0a5c }
            long r6 = r7.a     // Catch:{ all -> 0x0a5c }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0a5c }
            r3.a(r4, r5, r6)     // Catch:{ all -> 0x0a5c }
        L_0x04a4:
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.ca r3 = r3.p()     // Catch:{ all -> 0x0a5c }
            r4 = 16
            java.lang.String r2 = r2.e     // Catch:{ all -> 0x0a5c }
            r5 = r30
            r12 = 0
            r3.a((int) r4, (java.lang.String) r5, (java.lang.String) r2, (int) r12)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.d r2 = r31.d()     // Catch:{ all -> 0x0a5c }
            r2.t()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.d r2 = r31.d()
            r2.z()
            return
        L_0x04c3:
            r12 = 0
            if (r19 == 0) goto L_0x0513
            long r8 = r7.d     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r10 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r10 = r10.g()     // Catch:{ all -> 0x0a5c }
            java.lang.String r11 = r3.e     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Integer> r13 = i.c.a.b.i.a.o.f3808l     // Catch:{ all -> 0x0a5c }
            int r10 = r10.b(r11, r13)     // Catch:{ all -> 0x0a5c }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x0a5c }
            int r10 = java.lang.Math.max(r12, r10)     // Catch:{ all -> 0x0a5c }
            long r10 = (long) r10     // Catch:{ all -> 0x0a5c }
            long r8 = r8 - r10
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x0513
            int r2 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x0504
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.o4 r2 = r2.u()     // Catch:{ all -> 0x0a5c }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = i.c.a.b.i.a.m4.a((java.lang.String) r23)     // Catch:{ all -> 0x0a5c }
            long r5 = r7.d     // Catch:{ all -> 0x0a5c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0a5c }
            r2.a(r3, r4, r5)     // Catch:{ all -> 0x0a5c }
        L_0x0504:
            i.c.a.b.i.a.d r2 = r31.d()     // Catch:{ all -> 0x0a5c }
            r2.t()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.d r2 = r31.d()
            r2.z()
            return
        L_0x0513:
            i.c.a.b.i.a.l r7 = r2.f3755f     // Catch:{ all -> 0x0a5c }
            android.os.Bundle r13 = r7.b()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.ca r7 = r7.p()     // Catch:{ all -> 0x0a5c }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.f3756g     // Catch:{ all -> 0x0a5c }
            r7.a((android.os.Bundle) r13, (java.lang.String) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.ca r7 = r7.p()     // Catch:{ all -> 0x0a5c }
            r11 = r23
            boolean r7 = r7.d(r11)     // Catch:{ all -> 0x0a5c }
            java.lang.String r10 = "_r"
            if (r7 == 0) goto L_0x0552
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.ca r7 = r7.p()     // Catch:{ all -> 0x0a5c }
            java.lang.String r8 = "_dbg"
            java.lang.Long r9 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0a5c }
            r7.a((android.os.Bundle) r13, (java.lang.String) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.ca r7 = r7.p()     // Catch:{ all -> 0x0a5c }
            java.lang.Long r8 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0a5c }
            r7.a((android.os.Bundle) r13, (java.lang.String) r10, (java.lang.Object) r8)     // Catch:{ all -> 0x0a5c }
        L_0x0552:
            java.lang.String r7 = r2.e     // Catch:{ all -> 0x0a5c }
            boolean r7 = r4.equals(r7)     // Catch:{ all -> 0x0a5c }
            java.lang.String r8 = "_sno"
            if (r7 == 0) goto L_0x0589
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r7 = r7.g()     // Catch:{ all -> 0x0a5c }
            java.lang.String r9 = r3.e     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Boolean> r12 = i.c.a.b.i.a.o.U     // Catch:{ all -> 0x0a5c }
            boolean r7 = r7.e(r9, r12)     // Catch:{ all -> 0x0a5c }
            if (r7 == 0) goto L_0x0589
            i.c.a.b.i.a.d r7 = r31.d()     // Catch:{ all -> 0x0a5c }
            java.lang.String r9 = r3.e     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.da r7 = r7.c(r9, r8)     // Catch:{ all -> 0x0a5c }
            if (r7 == 0) goto L_0x0589
            java.lang.Object r9 = r7.e     // Catch:{ all -> 0x0a5c }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0a5c }
            if (r9 == 0) goto L_0x0589
            i.c.a.b.i.a.s5 r9 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.ca r9 = r9.p()     // Catch:{ all -> 0x0a5c }
            java.lang.Object r7 = r7.e     // Catch:{ all -> 0x0a5c }
            r9.a((android.os.Bundle) r13, (java.lang.String) r8, (java.lang.Object) r7)     // Catch:{ all -> 0x0a5c }
        L_0x0589:
            java.lang.String r7 = r2.e     // Catch:{ all -> 0x0a5c }
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x0a5c }
            if (r4 == 0) goto L_0x05b9
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r4 = r4.g()     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r3.e     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Boolean> r9 = i.c.a.b.i.a.o.Y     // Catch:{ all -> 0x0a5c }
            boolean r4 = r4.e(r7, r9)     // Catch:{ all -> 0x0a5c }
            if (r4 == 0) goto L_0x05b9
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r4 = r4.g()     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r3.e     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Boolean> r9 = i.c.a.b.i.a.o.U     // Catch:{ all -> 0x0a5c }
            boolean r4 = r4.e(r7, r9)     // Catch:{ all -> 0x0a5c }
            if (r4 != 0) goto L_0x05b9
            i.c.a.b.i.a.aa r4 = new i.c.a.b.i.a.aa     // Catch:{ all -> 0x0a5c }
            r4.<init>((java.lang.String) r8)     // Catch:{ all -> 0x0a5c }
            r1.b((i.c.a.b.i.a.aa) r4, (i.c.a.b.i.a.ea) r3)     // Catch:{ all -> 0x0a5c }
        L_0x05b9:
            i.c.a.b.i.a.d r4 = r31.d()     // Catch:{ all -> 0x0a5c }
            long r7 = r4.c(r11)     // Catch:{ all -> 0x0a5c }
            int r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x05dc
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.m4 r4 = r4.n()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.o4 r4 = r4.w()     // Catch:{ all -> 0x0a5c }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r12 = i.c.a.b.i.a.m4.a((java.lang.String) r11)     // Catch:{ all -> 0x0a5c }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0a5c }
            r4.a(r9, r12, r7)     // Catch:{ all -> 0x0a5c }
        L_0x05dc:
            i.c.a.b.i.a.j r4 = new i.c.a.b.i.a.j     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r8 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            java.lang.String r9 = r2.f3756g     // Catch:{ all -> 0x0a5c }
            java.lang.String r12 = r2.e     // Catch:{ all -> 0x0a5c }
            long r14 = r2.f3757h     // Catch:{ all -> 0x0a5c }
            r21 = 0
            r7 = r4
            r2 = r10
            r10 = r11
            r6 = r11
            r11 = r12
            r17 = r2
            r16 = r13
            r2 = 0
            r12 = r14
            r14 = r21
            r7.<init>((i.c.a.b.i.a.s5) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (android.os.Bundle) r16)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.d r7 = r31.d()     // Catch:{ all -> 0x0a5c }
            java.lang.String r8 = r4.f3722b     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.i r7 = r7.a((java.lang.String) r6, (java.lang.String) r8)     // Catch:{ all -> 0x0a5c }
            if (r7 != 0) goto L_0x066e
            i.c.a.b.i.a.d r7 = r31.d()     // Catch:{ all -> 0x0a5c }
            long r7 = r7.e(r6)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r9 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r9 = r9.g()     // Catch:{ all -> 0x0a5c }
            int r9 = r9.a((java.lang.String) r6)     // Catch:{ all -> 0x0a5c }
            long r9 = (long) r9     // Catch:{ all -> 0x0a5c }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x065e
            if (r5 == 0) goto L_0x065e
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.m4 r3 = r3.n()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.o4 r3 = r3.u()     // Catch:{ all -> 0x0a5c }
            java.lang.String r5 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r7 = i.c.a.b.i.a.m4.a((java.lang.String) r6)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r8 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.k4 r8 = r8.q()     // Catch:{ all -> 0x0a5c }
            java.lang.String r4 = r4.f3722b     // Catch:{ all -> 0x0a5c }
            java.lang.String r4 = r8.a((java.lang.String) r4)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r8 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r8 = r8.g()     // Catch:{ all -> 0x0a5c }
            int r6 = r8.a((java.lang.String) r6)     // Catch:{ all -> 0x0a5c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0a5c }
            r3.a(r5, r7, r4, r6)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.ca r3 = r3.p()     // Catch:{ all -> 0x0a5c }
            r4 = 8
            r5 = 0
            r3.a((int) r4, (java.lang.String) r5, (java.lang.String) r5, (int) r2)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.d r2 = r31.d()
            r2.z()
            return
        L_0x065e:
            i.c.a.b.i.a.i r5 = new i.c.a.b.i.a.i     // Catch:{ all -> 0x0a5c }
            java.lang.String r9 = r4.f3722b     // Catch:{ all -> 0x0a5c }
            r10 = 0
            r12 = 0
            long r14 = r4.d     // Catch:{ all -> 0x0a5c }
            r7 = r5
            r8 = r6
            r7.<init>(r8, r9, r10, r12, r14)     // Catch:{ all -> 0x0a5c }
            goto L_0x067c
        L_0x066e:
            i.c.a.b.i.a.s5 r5 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            long r8 = r7.f3703f     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.j r4 = r4.a(r5, r8)     // Catch:{ all -> 0x0a5c }
            long r5 = r4.d     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.i r5 = r7.a(r5)     // Catch:{ all -> 0x0a5c }
        L_0x067c:
            i.c.a.b.i.a.d r6 = r31.d()     // Catch:{ all -> 0x0a5c }
            r6.a((i.c.a.b.i.a.i) r5)     // Catch:{ all -> 0x0a5c }
            r31.r()     // Catch:{ all -> 0x0a5c }
            r31.i()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.d.l.q.a(r4)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.d.l.q.a(r33)     // Catch:{ all -> 0x0a5c }
            java.lang.String r5 = r4.a     // Catch:{ all -> 0x0a5c }
            i.c.a.b.d.l.q.b((java.lang.String) r5)     // Catch:{ all -> 0x0a5c }
            java.lang.String r5 = r4.a     // Catch:{ all -> 0x0a5c }
            java.lang.String r6 = r3.e     // Catch:{ all -> 0x0a5c }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.d.l.q.a((boolean) r5)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.g.g.t0$a r5 = i.c.a.b.g.g.t0.o()     // Catch:{ all -> 0x0a5c }
            r5.a()     // Catch:{ all -> 0x0a5c }
            java.lang.String r6 = "android"
            r5.a((java.lang.String) r6)     // Catch:{ all -> 0x0a5c }
            java.lang.String r6 = r3.e     // Catch:{ all -> 0x0a5c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a5c }
            if (r6 != 0) goto L_0x06b8
            java.lang.String r6 = r3.e     // Catch:{ all -> 0x0a5c }
            r5.f((java.lang.String) r6)     // Catch:{ all -> 0x0a5c }
        L_0x06b8:
            java.lang.String r6 = r3.f3651h     // Catch:{ all -> 0x0a5c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a5c }
            if (r6 != 0) goto L_0x06c5
            java.lang.String r6 = r3.f3651h     // Catch:{ all -> 0x0a5c }
            r5.e((java.lang.String) r6)     // Catch:{ all -> 0x0a5c }
        L_0x06c5:
            java.lang.String r6 = r3.f3650g     // Catch:{ all -> 0x0a5c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a5c }
            if (r6 != 0) goto L_0x06d2
            java.lang.String r6 = r3.f3650g     // Catch:{ all -> 0x0a5c }
            r5.g((java.lang.String) r6)     // Catch:{ all -> 0x0a5c }
        L_0x06d2:
            long r6 = r3.f3657n     // Catch:{ all -> 0x0a5c }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x06e1
            long r6 = r3.f3657n     // Catch:{ all -> 0x0a5c }
            int r7 = (int) r6     // Catch:{ all -> 0x0a5c }
            r5.g((int) r7)     // Catch:{ all -> 0x0a5c }
        L_0x06e1:
            long r6 = r3.f3652i     // Catch:{ all -> 0x0a5c }
            r5.f((long) r6)     // Catch:{ all -> 0x0a5c }
            java.lang.String r6 = r3.f3649f     // Catch:{ all -> 0x0a5c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a5c }
            if (r6 != 0) goto L_0x06f3
            java.lang.String r6 = r3.f3649f     // Catch:{ all -> 0x0a5c }
            r5.k((java.lang.String) r6)     // Catch:{ all -> 0x0a5c }
        L_0x06f3:
            boolean r6 = i.c.a.b.g.g.x9.b()     // Catch:{ all -> 0x0a5c }
            if (r6 == 0) goto L_0x0742
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r6 = r6.g()     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r3.e     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Boolean> r8 = i.c.a.b.i.a.o.I0     // Catch:{ all -> 0x0a5c }
            boolean r6 = r6.e(r7, r8)     // Catch:{ all -> 0x0a5c }
            if (r6 == 0) goto L_0x0742
            java.lang.String r6 = r5.x()     // Catch:{ all -> 0x0a5c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a5c }
            if (r6 == 0) goto L_0x0720
            java.lang.String r6 = r3.z     // Catch:{ all -> 0x0a5c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a5c }
            if (r6 != 0) goto L_0x0720
            java.lang.String r6 = r3.z     // Catch:{ all -> 0x0a5c }
            r5.o(r6)     // Catch:{ all -> 0x0a5c }
        L_0x0720:
            java.lang.String r6 = r5.x()     // Catch:{ all -> 0x0a5c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a5c }
            if (r6 == 0) goto L_0x0759
            java.lang.String r6 = r5.A()     // Catch:{ all -> 0x0a5c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a5c }
            if (r6 == 0) goto L_0x0759
            java.lang.String r6 = r3.v     // Catch:{ all -> 0x0a5c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a5c }
            if (r6 != 0) goto L_0x0759
            java.lang.String r6 = r3.v     // Catch:{ all -> 0x0a5c }
            r5.n(r6)     // Catch:{ all -> 0x0a5c }
            goto L_0x0759
        L_0x0742:
            java.lang.String r6 = r5.x()     // Catch:{ all -> 0x0a5c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a5c }
            if (r6 == 0) goto L_0x0759
            java.lang.String r6 = r3.v     // Catch:{ all -> 0x0a5c }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a5c }
            if (r6 != 0) goto L_0x0759
            java.lang.String r6 = r3.v     // Catch:{ all -> 0x0a5c }
            r5.n(r6)     // Catch:{ all -> 0x0a5c }
        L_0x0759:
            long r6 = r3.f3653j     // Catch:{ all -> 0x0a5c }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0766
            long r6 = r3.f3653j     // Catch:{ all -> 0x0a5c }
            r5.h((long) r6)     // Catch:{ all -> 0x0a5c }
        L_0x0766:
            long r6 = r3.x     // Catch:{ all -> 0x0a5c }
            r5.k((long) r6)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r6 = r6.g()     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r3.e     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Boolean> r10 = i.c.a.b.i.a.o.g0     // Catch:{ all -> 0x0a5c }
            boolean r6 = r6.e(r7, r10)     // Catch:{ all -> 0x0a5c }
            if (r6 == 0) goto L_0x0788
            i.c.a.b.i.a.x9 r6 = r31.f()     // Catch:{ all -> 0x0a5c }
            java.util.List r6 = r6.t()     // Catch:{ all -> 0x0a5c }
            if (r6 == 0) goto L_0x0788
            r5.c((java.lang.Iterable<? extends java.lang.Integer>) r6)     // Catch:{ all -> 0x0a5c }
        L_0x0788:
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.x4 r6 = r6.i()     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r3.e     // Catch:{ all -> 0x0a5c }
            android.util.Pair r6 = r6.a((java.lang.String) r7)     // Catch:{ all -> 0x0a5c }
            java.lang.Object r7 = r6.first     // Catch:{ all -> 0x0a5c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x0a5c }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a5c }
            if (r7 != 0) goto L_0x07b9
            boolean r7 = r3.s     // Catch:{ all -> 0x0a5c }
            if (r7 == 0) goto L_0x081b
            java.lang.Object r7 = r6.first     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0a5c }
            r5.h((java.lang.String) r7)     // Catch:{ all -> 0x0a5c }
            java.lang.Object r7 = r6.second     // Catch:{ all -> 0x0a5c }
            if (r7 == 0) goto L_0x081b
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x0a5c }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0a5c }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0a5c }
            r5.a((boolean) r6)     // Catch:{ all -> 0x0a5c }
            goto L_0x081b
        L_0x07b9:
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.g r6 = r6.u()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            android.content.Context r7 = r7.h()     // Catch:{ all -> 0x0a5c }
            boolean r6 = r6.a(r7)     // Catch:{ all -> 0x0a5c }
            if (r6 != 0) goto L_0x081b
            boolean r6 = r3.t     // Catch:{ all -> 0x0a5c }
            if (r6 == 0) goto L_0x081b
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            android.content.Context r6 = r6.h()     // Catch:{ all -> 0x0a5c }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = "android_id"
            java.lang.String r6 = android.provider.Settings.Secure.getString(r6, r7)     // Catch:{ all -> 0x0a5c }
            if (r6 != 0) goto L_0x07fb
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.m4 r6 = r6.n()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.o4 r6 = r6.w()     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = "null secure ID. appId"
            java.lang.String r10 = r5.v()     // Catch:{ all -> 0x0a5c }
            java.lang.Object r10 = i.c.a.b.i.a.m4.a((java.lang.String) r10)     // Catch:{ all -> 0x0a5c }
            r6.a(r7, r10)     // Catch:{ all -> 0x0a5c }
            java.lang.String r6 = "null"
            goto L_0x0818
        L_0x07fb:
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x0a5c }
            if (r7 == 0) goto L_0x0818
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.m4 r7 = r7.n()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.o4 r7 = r7.w()     // Catch:{ all -> 0x0a5c }
            java.lang.String r10 = "empty secure ID. appId"
            java.lang.String r11 = r5.v()     // Catch:{ all -> 0x0a5c }
            java.lang.Object r11 = i.c.a.b.i.a.m4.a((java.lang.String) r11)     // Catch:{ all -> 0x0a5c }
            r7.a(r10, r11)     // Catch:{ all -> 0x0a5c }
        L_0x0818:
            r5.m(r6)     // Catch:{ all -> 0x0a5c }
        L_0x081b:
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.g r6 = r6.u()     // Catch:{ all -> 0x0a5c }
            r6.o()     // Catch:{ all -> 0x0a5c }
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ all -> 0x0a5c }
            r5.c((java.lang.String) r6)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.g r6 = r6.u()     // Catch:{ all -> 0x0a5c }
            r6.o()     // Catch:{ all -> 0x0a5c }
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0a5c }
            r5.b((java.lang.String) r6)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.g r6 = r6.u()     // Catch:{ all -> 0x0a5c }
            long r6 = r6.t()     // Catch:{ all -> 0x0a5c }
            int r7 = (int) r6     // Catch:{ all -> 0x0a5c }
            r5.e((int) r7)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.g r6 = r6.u()     // Catch:{ all -> 0x0a5c }
            java.lang.String r6 = r6.u()     // Catch:{ all -> 0x0a5c }
            r5.d((java.lang.String) r6)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r6 = r6.g()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Boolean> r7 = i.c.a.b.i.a.o.i1     // Catch:{ all -> 0x0a5c }
            boolean r6 = r6.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r7)     // Catch:{ all -> 0x0a5c }
            if (r6 != 0) goto L_0x0865
            long r6 = r3.f3659p     // Catch:{ all -> 0x0a5c }
            r5.j((long) r6)     // Catch:{ all -> 0x0a5c }
        L_0x0865:
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            boolean r6 = r6.b()     // Catch:{ all -> 0x0a5c }
            if (r6 == 0) goto L_0x087c
            r5.v()     // Catch:{ all -> 0x0a5c }
            r6 = 0
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0a5c }
            if (r7 == 0) goto L_0x0878
            goto L_0x087c
        L_0x0878:
            r5.z()     // Catch:{ all -> 0x0a5c }
            throw r6
        L_0x087c:
            i.c.a.b.i.a.d r6 = r31.d()     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r3.e     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.c5 r6 = r6.b(r7)     // Catch:{ all -> 0x0a5c }
            if (r6 != 0) goto L_0x08fd
            i.c.a.b.i.a.c5 r6 = new i.c.a.b.i.a.c5     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            java.lang.String r10 = r3.e     // Catch:{ all -> 0x0a5c }
            r6.<init>(r7, r10)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.ca r7 = r7.p()     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r7.w()     // Catch:{ all -> 0x0a5c }
            r6.a((java.lang.String) r7)     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r3.f3658o     // Catch:{ all -> 0x0a5c }
            r6.f((java.lang.String) r7)     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r3.f3649f     // Catch:{ all -> 0x0a5c }
            r6.b((java.lang.String) r7)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.x4 r7 = r7.i()     // Catch:{ all -> 0x0a5c }
            java.lang.String r10 = r3.e     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r7.b(r10)     // Catch:{ all -> 0x0a5c }
            r6.e((java.lang.String) r7)     // Catch:{ all -> 0x0a5c }
            r6.g((long) r8)     // Catch:{ all -> 0x0a5c }
            r6.a((long) r8)     // Catch:{ all -> 0x0a5c }
            r6.b((long) r8)     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r3.f3650g     // Catch:{ all -> 0x0a5c }
            r6.g((java.lang.String) r7)     // Catch:{ all -> 0x0a5c }
            long r10 = r3.f3657n     // Catch:{ all -> 0x0a5c }
            r6.c((long) r10)     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r3.f3651h     // Catch:{ all -> 0x0a5c }
            r6.h((java.lang.String) r7)     // Catch:{ all -> 0x0a5c }
            long r10 = r3.f3652i     // Catch:{ all -> 0x0a5c }
            r6.d((long) r10)     // Catch:{ all -> 0x0a5c }
            long r10 = r3.f3653j     // Catch:{ all -> 0x0a5c }
            r6.e((long) r10)     // Catch:{ all -> 0x0a5c }
            boolean r7 = r3.f3655l     // Catch:{ all -> 0x0a5c }
            r6.a((boolean) r7)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r7 = r7.g()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Boolean> r10 = i.c.a.b.i.a.o.i1     // Catch:{ all -> 0x0a5c }
            boolean r7 = r7.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r10)     // Catch:{ all -> 0x0a5c }
            if (r7 != 0) goto L_0x08f1
            long r10 = r3.f3659p     // Catch:{ all -> 0x0a5c }
            r6.j(r10)     // Catch:{ all -> 0x0a5c }
        L_0x08f1:
            long r10 = r3.x     // Catch:{ all -> 0x0a5c }
            r6.f((long) r10)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.d r7 = r31.d()     // Catch:{ all -> 0x0a5c }
            r7.a((i.c.a.b.i.a.c5) r6)     // Catch:{ all -> 0x0a5c }
        L_0x08fd:
            java.lang.String r7 = r6.h()     // Catch:{ all -> 0x0a5c }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a5c }
            if (r7 != 0) goto L_0x090e
            java.lang.String r7 = r6.h()     // Catch:{ all -> 0x0a5c }
            r5.i((java.lang.String) r7)     // Catch:{ all -> 0x0a5c }
        L_0x090e:
            java.lang.String r7 = r6.m()     // Catch:{ all -> 0x0a5c }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0a5c }
            if (r7 != 0) goto L_0x091f
            java.lang.String r6 = r6.m()     // Catch:{ all -> 0x0a5c }
            r5.l(r6)     // Catch:{ all -> 0x0a5c }
        L_0x091f:
            i.c.a.b.i.a.d r6 = r31.d()     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = r3.e     // Catch:{ all -> 0x0a5c }
            java.util.List r6 = r6.a((java.lang.String) r7)     // Catch:{ all -> 0x0a5c }
            r12 = 0
        L_0x092a:
            int r7 = r6.size()     // Catch:{ all -> 0x0a5c }
            if (r12 >= r7) goto L_0x095f
            i.c.a.b.g.g.x0$a r7 = i.c.a.b.g.g.x0.l()     // Catch:{ all -> 0x0a5c }
            java.lang.Object r10 = r6.get(r12)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.da r10 = (i.c.a.b.i.a.da) r10     // Catch:{ all -> 0x0a5c }
            java.lang.String r10 = r10.c     // Catch:{ all -> 0x0a5c }
            r7.a((java.lang.String) r10)     // Catch:{ all -> 0x0a5c }
            java.lang.Object r10 = r6.get(r12)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.da r10 = (i.c.a.b.i.a.da) r10     // Catch:{ all -> 0x0a5c }
            long r10 = r10.d     // Catch:{ all -> 0x0a5c }
            r7.a((long) r10)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.x9 r10 = r31.f()     // Catch:{ all -> 0x0a5c }
            java.lang.Object r11 = r6.get(r12)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.da r11 = (i.c.a.b.i.a.da) r11     // Catch:{ all -> 0x0a5c }
            java.lang.Object r11 = r11.e     // Catch:{ all -> 0x0a5c }
            r10.a((i.c.a.b.g.g.x0.a) r7, (java.lang.Object) r11)     // Catch:{ all -> 0x0a5c }
            r5.a((i.c.a.b.g.g.x0.a) r7)     // Catch:{ all -> 0x0a5c }
            int r12 = r12 + 1
            goto L_0x092a
        L_0x095f:
            i.c.a.b.i.a.d r6 = r31.d()     // Catch:{ IOException -> 0x09d4 }
            i.c.a.b.g.g.f5 r7 = r5.k()     // Catch:{ IOException -> 0x09d4 }
            i.c.a.b.g.g.w3 r7 = (i.c.a.b.g.g.w3) r7     // Catch:{ IOException -> 0x09d4 }
            i.c.a.b.g.g.t0 r7 = (i.c.a.b.g.g.t0) r7     // Catch:{ IOException -> 0x09d4 }
            long r5 = r6.a((i.c.a.b.g.g.t0) r7)     // Catch:{ IOException -> 0x09d4 }
            i.c.a.b.i.a.d r7 = r31.d()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.l r10 = r4.f3723f     // Catch:{ all -> 0x0a5c }
            if (r10 == 0) goto L_0x09cb
            i.c.a.b.i.a.l r10 = r4.f3723f     // Catch:{ all -> 0x0a5c }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0a5c }
        L_0x097d:
            r11 = r10
            i.c.a.b.i.a.k r11 = (i.c.a.b.i.a.k) r11
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0a5c }
            if (r12 == 0) goto L_0x0998
            java.lang.Object r11 = r11.next()     // Catch:{ all -> 0x0a5c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0a5c }
            r12 = r17
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0a5c }
            if (r11 == 0) goto L_0x0995
            goto L_0x09ca
        L_0x0995:
            r17 = r12
            goto L_0x097d
        L_0x0998:
            i.c.a.b.i.a.n5 r10 = r31.b()     // Catch:{ all -> 0x0a5c }
            java.lang.String r11 = r4.a     // Catch:{ all -> 0x0a5c }
            java.lang.String r12 = r4.f3722b     // Catch:{ all -> 0x0a5c }
            boolean r10 = r10.c(r11, r12)     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.d r11 = r31.d()     // Catch:{ all -> 0x0a5c }
            long r12 = r31.s()     // Catch:{ all -> 0x0a5c }
            java.lang.String r14 = r4.a     // Catch:{ all -> 0x0a5c }
            r15 = 0
            r16 = 0
            i.c.a.b.i.a.c r11 = r11.a((long) r12, (java.lang.String) r14, (boolean) r15, (boolean) r16)     // Catch:{ all -> 0x0a5c }
            if (r10 == 0) goto L_0x09cb
            long r10 = r11.e     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.s5 r12 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r12 = r12.g()     // Catch:{ all -> 0x0a5c }
            java.lang.String r13 = r4.a     // Catch:{ all -> 0x0a5c }
            int r12 = r12.b(r13)     // Catch:{ all -> 0x0a5c }
            long r12 = (long) r12     // Catch:{ all -> 0x0a5c }
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x09cb
        L_0x09ca:
            r2 = 1
        L_0x09cb:
            boolean r2 = r7.a((i.c.a.b.i.a.j) r4, (long) r5, (boolean) r2)     // Catch:{ all -> 0x0a5c }
            if (r2 == 0) goto L_0x09ed
            r1.f3899l = r8     // Catch:{ all -> 0x0a5c }
            goto L_0x09ed
        L_0x09d4:
            r0 = move-exception
            r2 = r0
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.m4 r6 = r6.n()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.o4 r6 = r6.u()     // Catch:{ all -> 0x0a5c }
            java.lang.String r7 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r5 = r5.v()     // Catch:{ all -> 0x0a5c }
            java.lang.Object r5 = i.c.a.b.i.a.m4.a((java.lang.String) r5)     // Catch:{ all -> 0x0a5c }
            r6.a(r7, r5, r2)     // Catch:{ all -> 0x0a5c }
        L_0x09ed:
            i.c.a.b.i.a.d r2 = r31.d()     // Catch:{ all -> 0x0a5c }
            r2.t()     // Catch:{ all -> 0x0a5c }
            boolean r2 = i.c.a.b.g.g.k9.b()     // Catch:{ all -> 0x0a5c }
            if (r2 == 0) goto L_0x0a0a
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.pa r2 = r2.g()     // Catch:{ all -> 0x0a5c }
            java.lang.String r3 = r3.e     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.f4<java.lang.Boolean> r5 = i.c.a.b.i.a.o.Z0     // Catch:{ all -> 0x0a5c }
            boolean r2 = r2.e(r3, r5)     // Catch:{ all -> 0x0a5c }
            if (r2 != 0) goto L_0x0a30
        L_0x0a0a:
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x0a5c }
            r3 = 2
            boolean r2 = r2.a((int) r3)     // Catch:{ all -> 0x0a5c }
            if (r2 == 0) goto L_0x0a30
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.o4 r2 = r2.z()     // Catch:{ all -> 0x0a5c }
            java.lang.String r3 = "Event recorded"
            i.c.a.b.i.a.s5 r5 = r1.f3896i     // Catch:{ all -> 0x0a5c }
            i.c.a.b.i.a.k4 r5 = r5.q()     // Catch:{ all -> 0x0a5c }
            java.lang.String r4 = r5.a((i.c.a.b.i.a.j) r4)     // Catch:{ all -> 0x0a5c }
            r2.a(r3, r4)     // Catch:{ all -> 0x0a5c }
        L_0x0a30:
            i.c.a.b.i.a.d r2 = r31.d()
            r2.z()
            r31.u()
            i.c.a.b.i.a.s5 r2 = r1.f3896i
            i.c.a.b.i.a.m4 r2 = r2.n()
            i.c.a.b.i.a.o4 r2 = r2.z()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r27
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.a(r4, r3)
            return
        L_0x0a5c:
            r0 = move-exception
            r2 = r0
            i.c.a.b.i.a.d r3 = r31.d()
            r3.z()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.t9.b(i.c.a.b.i.a.m, i.c.a.b.i.a.ea):void");
    }

    public final boolean c(ea eaVar) {
        return (!x9.b() || !this.f3896i.f3861g.d(eaVar.e, o.I0)) ? !TextUtils.isEmpty(eaVar.f3649f) || !TextUtils.isEmpty(eaVar.v) : !TextUtils.isEmpty(eaVar.f3649f) || !TextUtils.isEmpty(eaVar.z) || !TextUtils.isEmpty(eaVar.v);
    }

    public static void a(r9 r9Var) {
        if (r9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!r9Var.c) {
            String valueOf = String.valueOf(r9Var.getClass());
            StringBuilder sb = new StringBuilder(valueOf.length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x012d A[Catch:{ all -> 0x0366 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0200 A[Catch:{ all -> 0x0366 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(i.c.a.b.i.a.m r20, i.c.a.b.i.a.ea r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            i.c.a.b.d.l.q.a(r21)
            java.lang.String r3 = r2.e
            i.c.a.b.d.l.q.b((java.lang.String) r3)
            r19.r()
            r19.i()
            java.lang.String r3 = r2.e
            long r11 = r0.f3757h
            i.c.a.b.i.a.x9 r4 = r19.f()
            boolean r4 = r4.a((i.c.a.b.i.a.m) r0, (i.c.a.b.i.a.ea) r2)
            if (r4 != 0) goto L_0x0023
            return
        L_0x0023:
            boolean r4 = r2.f3655l
            if (r4 != 0) goto L_0x002b
            r1.b((i.c.a.b.i.a.ea) r2)
            return
        L_0x002b:
            i.c.a.b.i.a.s5 r4 = r1.f3896i
            i.c.a.b.i.a.pa r4 = r4.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r5 = i.c.a.b.i.a.o.m0
            boolean r4 = r4.d(r3, r5)
            if (r4 == 0) goto L_0x0079
            java.util.List<java.lang.String> r4 = r2.y
            if (r4 == 0) goto L_0x0079
            java.lang.String r5 = r0.e
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0067
            i.c.a.b.i.a.l r4 = r0.f3755f
            android.os.Bundle r4 = r4.b()
            r5 = 1
            java.lang.String r7 = "ga_safelisted"
            r4.putLong(r7, r5)
            i.c.a.b.i.a.m r5 = new i.c.a.b.i.a.m
            java.lang.String r14 = r0.e
            i.c.a.b.i.a.l r15 = new i.c.a.b.i.a.l
            r15.<init>(r4)
            java.lang.String r4 = r0.f3756g
            long r6 = r0.f3757h
            r13 = r5
            r16 = r4
            r17 = r6
            r13.<init>(r14, r15, r16, r17)
            r0 = r5
            goto L_0x0079
        L_0x0067:
            i.c.a.b.i.a.s5 r2 = r1.f3896i
            i.c.a.b.i.a.m4 r2 = r2.n()
            i.c.a.b.i.a.o4 r2 = r2.f3765m
            java.lang.String r4 = r0.e
            java.lang.String r0 = r0.f3756g
            java.lang.String r5 = "Dropping non-safelisted event. appId, event name, origin"
            r2.a(r5, r3, r4, r0)
            return
        L_0x0079:
            i.c.a.b.i.a.d r4 = r19.d()
            r4.y()
            i.c.a.b.i.a.d r4 = r19.d()     // Catch:{ all -> 0x0366 }
            i.c.a.b.d.l.q.b((java.lang.String) r3)     // Catch:{ all -> 0x0366 }
            r4.c()     // Catch:{ all -> 0x0366 }
            r4.m()     // Catch:{ all -> 0x0366 }
            r5 = 0
            r7 = 2
            r13 = 0
            r14 = 1
            int r8 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x00ae
            i.c.a.b.i.a.m4 r4 = r4.n()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.o4 r4 = r4.f3761i     // Catch:{ all -> 0x0366 }
            java.lang.String r5 = "Invalid time querying timed out conditional properties"
            java.lang.Object r6 = i.c.a.b.i.a.m4.a((java.lang.String) r3)     // Catch:{ all -> 0x0366 }
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0366 }
            r4.a(r5, r6, r9)     // Catch:{ all -> 0x0366 }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0366 }
            goto L_0x00be
        L_0x00ae:
            java.lang.String r5 = "active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout"
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ all -> 0x0366 }
            r6[r13] = r3     // Catch:{ all -> 0x0366 }
            java.lang.String r9 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0366 }
            r6[r14] = r9     // Catch:{ all -> 0x0366 }
            java.util.List r4 = r4.a((java.lang.String) r5, (java.lang.String[]) r6)     // Catch:{ all -> 0x0366 }
        L_0x00be:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0366 }
        L_0x00c2:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0366 }
            if (r5 == 0) goto L_0x0145
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.na r5 = (i.c.a.b.i.a.na) r5     // Catch:{ all -> 0x0366 }
            if (r5 == 0) goto L_0x00c2
            boolean r6 = i.c.a.b.g.g.k9.b()     // Catch:{ all -> 0x0366 }
            java.lang.String r9 = "User property timed out"
            if (r6 == 0) goto L_0x0108
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.pa r6 = r6.f3861g     // Catch:{ all -> 0x0366 }
            java.lang.String r10 = r2.e     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r15 = i.c.a.b.i.a.o.Z0     // Catch:{ all -> 0x0366 }
            boolean r6 = r6.d(r10, r15)     // Catch:{ all -> 0x0366 }
            if (r6 == 0) goto L_0x0108
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.m4 r6 = r6.n()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.o4 r6 = r6.f3766n     // Catch:{ all -> 0x0366 }
            java.lang.String r10 = r5.e     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.s5 r15 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.k4 r15 = r15.q()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.aa r14 = r5.f3792g     // Catch:{ all -> 0x0366 }
            java.lang.String r14 = r14.f3586f     // Catch:{ all -> 0x0366 }
            java.lang.String r14 = r15.c(r14)     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.aa r15 = r5.f3792g     // Catch:{ all -> 0x0366 }
            java.lang.Object r15 = r15.a()     // Catch:{ all -> 0x0366 }
            r6.a(r9, r10, r14, r15)     // Catch:{ all -> 0x0366 }
            goto L_0x0129
        L_0x0108:
            i.c.a.b.i.a.s5 r6 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.m4 r6 = r6.n()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.o4 r6 = r6.f3765m     // Catch:{ all -> 0x0366 }
            java.lang.String r10 = r5.e     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.s5 r14 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.k4 r14 = r14.q()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.aa r15 = r5.f3792g     // Catch:{ all -> 0x0366 }
            java.lang.String r15 = r15.f3586f     // Catch:{ all -> 0x0366 }
            java.lang.String r14 = r14.c(r15)     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.aa r15 = r5.f3792g     // Catch:{ all -> 0x0366 }
            java.lang.Object r15 = r15.a()     // Catch:{ all -> 0x0366 }
            r6.a(r9, r10, r14, r15)     // Catch:{ all -> 0x0366 }
        L_0x0129:
            i.c.a.b.i.a.m r6 = r5.f3796k     // Catch:{ all -> 0x0366 }
            if (r6 == 0) goto L_0x0137
            i.c.a.b.i.a.m r6 = new i.c.a.b.i.a.m     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.m r9 = r5.f3796k     // Catch:{ all -> 0x0366 }
            r6.<init>(r9, r11)     // Catch:{ all -> 0x0366 }
            r1.b((i.c.a.b.i.a.m) r6, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x0366 }
        L_0x0137:
            i.c.a.b.i.a.d r6 = r19.d()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.aa r5 = r5.f3792g     // Catch:{ all -> 0x0366 }
            java.lang.String r5 = r5.f3586f     // Catch:{ all -> 0x0366 }
            r6.e(r3, r5)     // Catch:{ all -> 0x0366 }
            r14 = 1
            goto L_0x00c2
        L_0x0145:
            i.c.a.b.i.a.d r4 = r19.d()     // Catch:{ all -> 0x0366 }
            i.c.a.b.d.l.q.b((java.lang.String) r3)     // Catch:{ all -> 0x0366 }
            r4.c()     // Catch:{ all -> 0x0366 }
            r4.m()     // Catch:{ all -> 0x0366 }
            if (r8 >= 0) goto L_0x016c
            i.c.a.b.i.a.m4 r4 = r4.n()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.o4 r4 = r4.f3761i     // Catch:{ all -> 0x0366 }
            java.lang.String r5 = "Invalid time querying expired conditional properties"
            java.lang.Object r6 = i.c.a.b.i.a.m4.a((java.lang.String) r3)     // Catch:{ all -> 0x0366 }
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0366 }
            r4.a(r5, r6, r9)     // Catch:{ all -> 0x0366 }
            java.util.List r4 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0366 }
            goto L_0x017d
        L_0x016c:
            java.lang.String r5 = "active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live"
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ all -> 0x0366 }
            r6[r13] = r3     // Catch:{ all -> 0x0366 }
            java.lang.String r9 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0366 }
            r10 = 1
            r6[r10] = r9     // Catch:{ all -> 0x0366 }
            java.util.List r4 = r4.a((java.lang.String) r5, (java.lang.String[]) r6)     // Catch:{ all -> 0x0366 }
        L_0x017d:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0366 }
            int r6 = r4.size()     // Catch:{ all -> 0x0366 }
            r5.<init>(r6)     // Catch:{ all -> 0x0366 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0366 }
        L_0x018a:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0366 }
            if (r6 == 0) goto L_0x0213
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.na r6 = (i.c.a.b.i.a.na) r6     // Catch:{ all -> 0x0366 }
            if (r6 == 0) goto L_0x018a
            boolean r9 = i.c.a.b.g.g.k9.b()     // Catch:{ all -> 0x0366 }
            java.lang.String r10 = "User property expired"
            if (r9 == 0) goto L_0x01d0
            i.c.a.b.i.a.s5 r9 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.pa r9 = r9.f3861g     // Catch:{ all -> 0x0366 }
            java.lang.String r14 = r2.e     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r15 = i.c.a.b.i.a.o.Z0     // Catch:{ all -> 0x0366 }
            boolean r9 = r9.d(r14, r15)     // Catch:{ all -> 0x0366 }
            if (r9 == 0) goto L_0x01d0
            i.c.a.b.i.a.s5 r9 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.m4 r9 = r9.n()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.o4 r9 = r9.f3766n     // Catch:{ all -> 0x0366 }
            java.lang.String r14 = r6.e     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.s5 r15 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.k4 r15 = r15.q()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.aa r7 = r6.f3792g     // Catch:{ all -> 0x0366 }
            java.lang.String r7 = r7.f3586f     // Catch:{ all -> 0x0366 }
            java.lang.String r7 = r15.c(r7)     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.aa r15 = r6.f3792g     // Catch:{ all -> 0x0366 }
            java.lang.Object r15 = r15.a()     // Catch:{ all -> 0x0366 }
            r9.a(r10, r14, r7, r15)     // Catch:{ all -> 0x0366 }
            goto L_0x01f1
        L_0x01d0:
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.m4 r7 = r7.n()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.o4 r7 = r7.f3765m     // Catch:{ all -> 0x0366 }
            java.lang.String r9 = r6.e     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.s5 r14 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.k4 r14 = r14.q()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.aa r15 = r6.f3792g     // Catch:{ all -> 0x0366 }
            java.lang.String r15 = r15.f3586f     // Catch:{ all -> 0x0366 }
            java.lang.String r14 = r14.c(r15)     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.aa r15 = r6.f3792g     // Catch:{ all -> 0x0366 }
            java.lang.Object r15 = r15.a()     // Catch:{ all -> 0x0366 }
            r7.a(r10, r9, r14, r15)     // Catch:{ all -> 0x0366 }
        L_0x01f1:
            i.c.a.b.i.a.d r7 = r19.d()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.aa r9 = r6.f3792g     // Catch:{ all -> 0x0366 }
            java.lang.String r9 = r9.f3586f     // Catch:{ all -> 0x0366 }
            r7.b((java.lang.String) r3, (java.lang.String) r9)     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.m r7 = r6.f3800o     // Catch:{ all -> 0x0366 }
            if (r7 == 0) goto L_0x0205
            i.c.a.b.i.a.m r7 = r6.f3800o     // Catch:{ all -> 0x0366 }
            r5.add(r7)     // Catch:{ all -> 0x0366 }
        L_0x0205:
            i.c.a.b.i.a.d r7 = r19.d()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.aa r6 = r6.f3792g     // Catch:{ all -> 0x0366 }
            java.lang.String r6 = r6.f3586f     // Catch:{ all -> 0x0366 }
            r7.e(r3, r6)     // Catch:{ all -> 0x0366 }
            r7 = 2
            goto L_0x018a
        L_0x0213:
            int r4 = r5.size()     // Catch:{ all -> 0x0366 }
            r6 = 0
        L_0x0218:
            if (r6 >= r4) goto L_0x022b
            java.lang.Object r7 = r5.get(r6)     // Catch:{ all -> 0x0366 }
            int r6 = r6 + 1
            i.c.a.b.i.a.m r7 = (i.c.a.b.i.a.m) r7     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.m r9 = new i.c.a.b.i.a.m     // Catch:{ all -> 0x0366 }
            r9.<init>(r7, r11)     // Catch:{ all -> 0x0366 }
            r1.b((i.c.a.b.i.a.m) r9, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x0366 }
            goto L_0x0218
        L_0x022b:
            i.c.a.b.i.a.d r4 = r19.d()     // Catch:{ all -> 0x0366 }
            java.lang.String r5 = r0.e     // Catch:{ all -> 0x0366 }
            i.c.a.b.d.l.q.b((java.lang.String) r3)     // Catch:{ all -> 0x0366 }
            i.c.a.b.d.l.q.b((java.lang.String) r5)     // Catch:{ all -> 0x0366 }
            r4.c()     // Catch:{ all -> 0x0366 }
            r4.m()     // Catch:{ all -> 0x0366 }
            if (r8 >= 0) goto L_0x025f
            i.c.a.b.i.a.m4 r6 = r4.n()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.o4 r6 = r6.f3761i     // Catch:{ all -> 0x0366 }
            java.lang.String r7 = "Invalid time querying triggered conditional properties"
            java.lang.Object r3 = i.c.a.b.i.a.m4.a((java.lang.String) r3)     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.k4 r4 = r4.e()     // Catch:{ all -> 0x0366 }
            java.lang.String r4 = r4.a((java.lang.String) r5)     // Catch:{ all -> 0x0366 }
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0366 }
            r6.a(r7, r3, r4, r5)     // Catch:{ all -> 0x0366 }
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0366 }
            goto L_0x0274
        L_0x025f:
            java.lang.String r6 = "active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout"
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ all -> 0x0366 }
            r7[r13] = r3     // Catch:{ all -> 0x0366 }
            r3 = 1
            r7[r3] = r5     // Catch:{ all -> 0x0366 }
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0366 }
            r5 = 2
            r7[r5] = r3     // Catch:{ all -> 0x0366 }
            java.util.List r3 = r4.a((java.lang.String) r6, (java.lang.String[]) r7)     // Catch:{ all -> 0x0366 }
        L_0x0274:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0366 }
            int r4 = r3.size()     // Catch:{ all -> 0x0366 }
            r14.<init>(r4)     // Catch:{ all -> 0x0366 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0366 }
        L_0x0281:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0366 }
            if (r4 == 0) goto L_0x033c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0366 }
            r15 = r4
            i.c.a.b.i.a.na r15 = (i.c.a.b.i.a.na) r15     // Catch:{ all -> 0x0366 }
            if (r15 == 0) goto L_0x0281
            i.c.a.b.i.a.aa r4 = r15.f3792g     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.da r10 = new i.c.a.b.i.a.da     // Catch:{ all -> 0x0366 }
            java.lang.String r5 = r15.e     // Catch:{ all -> 0x0366 }
            java.lang.String r6 = r15.f3791f     // Catch:{ all -> 0x0366 }
            java.lang.String r7 = r4.f3586f     // Catch:{ all -> 0x0366 }
            java.lang.Object r16 = r4.a()     // Catch:{ all -> 0x0366 }
            r4 = r10
            r8 = r11
            r13 = r10
            r10 = r16
            r4.<init>(r5, r6, r7, r8, r10)     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.d r4 = r19.d()     // Catch:{ all -> 0x0366 }
            boolean r4 = r4.a((i.c.a.b.i.a.da) r13)     // Catch:{ all -> 0x0366 }
            if (r4 == 0) goto L_0x02fe
            boolean r4 = i.c.a.b.g.g.k9.b()     // Catch:{ all -> 0x0366 }
            java.lang.String r5 = "User property triggered"
            if (r4 == 0) goto L_0x02e2
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.pa r4 = r4.f3861g     // Catch:{ all -> 0x0366 }
            java.lang.String r6 = r2.e     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r7 = i.c.a.b.i.a.o.Z0     // Catch:{ all -> 0x0366 }
            boolean r4 = r4.d(r6, r7)     // Catch:{ all -> 0x0366 }
            if (r4 == 0) goto L_0x02e2
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.m4 r4 = r4.n()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.o4 r4 = r4.f3766n     // Catch:{ all -> 0x0366 }
            java.lang.String r6 = r15.e     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.k4 r7 = r7.q()     // Catch:{ all -> 0x0366 }
            java.lang.String r8 = r13.c     // Catch:{ all -> 0x0366 }
            java.lang.String r7 = r7.c(r8)     // Catch:{ all -> 0x0366 }
            java.lang.Object r8 = r13.e     // Catch:{ all -> 0x0366 }
            r4.a(r5, r6, r7, r8)     // Catch:{ all -> 0x0366 }
            goto L_0x031f
        L_0x02e2:
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.m4 r4 = r4.n()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.o4 r4 = r4.f3765m     // Catch:{ all -> 0x0366 }
            java.lang.String r6 = r15.e     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.k4 r7 = r7.q()     // Catch:{ all -> 0x0366 }
            java.lang.String r8 = r13.c     // Catch:{ all -> 0x0366 }
            java.lang.String r7 = r7.c(r8)     // Catch:{ all -> 0x0366 }
            java.lang.Object r8 = r13.e     // Catch:{ all -> 0x0366 }
            r4.a(r5, r6, r7, r8)     // Catch:{ all -> 0x0366 }
            goto L_0x031f
        L_0x02fe:
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.m4 r4 = r4.n()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.o4 r4 = r4.f3758f     // Catch:{ all -> 0x0366 }
            java.lang.String r5 = "Too many active user properties, ignoring"
            java.lang.String r6 = r15.e     // Catch:{ all -> 0x0366 }
            java.lang.Object r6 = i.c.a.b.i.a.m4.a((java.lang.String) r6)     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.k4 r7 = r7.q()     // Catch:{ all -> 0x0366 }
            java.lang.String r8 = r13.c     // Catch:{ all -> 0x0366 }
            java.lang.String r7 = r7.c(r8)     // Catch:{ all -> 0x0366 }
            java.lang.Object r8 = r13.e     // Catch:{ all -> 0x0366 }
            r4.a(r5, r6, r7, r8)     // Catch:{ all -> 0x0366 }
        L_0x031f:
            i.c.a.b.i.a.m r4 = r15.f3798m     // Catch:{ all -> 0x0366 }
            if (r4 == 0) goto L_0x0328
            i.c.a.b.i.a.m r4 = r15.f3798m     // Catch:{ all -> 0x0366 }
            r14.add(r4)     // Catch:{ all -> 0x0366 }
        L_0x0328:
            i.c.a.b.i.a.aa r4 = new i.c.a.b.i.a.aa     // Catch:{ all -> 0x0366 }
            r4.<init>((i.c.a.b.i.a.da) r13)     // Catch:{ all -> 0x0366 }
            r15.f3792g = r4     // Catch:{ all -> 0x0366 }
            r4 = 1
            r15.f3794i = r4     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.d r5 = r19.d()     // Catch:{ all -> 0x0366 }
            r5.a((i.c.a.b.i.a.na) r15)     // Catch:{ all -> 0x0366 }
            r13 = 0
            goto L_0x0281
        L_0x033c:
            r1.b((i.c.a.b.i.a.m) r0, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x0366 }
            int r0 = r14.size()     // Catch:{ all -> 0x0366 }
            r13 = 0
        L_0x0344:
            if (r13 >= r0) goto L_0x0357
            java.lang.Object r3 = r14.get(r13)     // Catch:{ all -> 0x0366 }
            int r13 = r13 + 1
            i.c.a.b.i.a.m r3 = (i.c.a.b.i.a.m) r3     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.m r4 = new i.c.a.b.i.a.m     // Catch:{ all -> 0x0366 }
            r4.<init>(r3, r11)     // Catch:{ all -> 0x0366 }
            r1.b((i.c.a.b.i.a.m) r4, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x0366 }
            goto L_0x0344
        L_0x0357:
            i.c.a.b.i.a.d r0 = r19.d()     // Catch:{ all -> 0x0366 }
            r0.t()     // Catch:{ all -> 0x0366 }
            i.c.a.b.i.a.d r0 = r19.d()
            r0.z()
            return
        L_0x0366:
            r0 = move-exception
            i.c.a.b.i.a.d r2 = r19.d()
            r2.z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.t9.a(i.c.a.b.i.a.m, i.c.a.b.i.a.ea):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0264, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0265, code lost:
        r2 = r0;
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0269, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x026a, code lost:
        r29 = "_si";
        r28 = "_npa";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x026f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0270, code lost:
        r29 = "_si";
        r28 = "_npa";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0280, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0283, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0284, code lost:
        r29 = "_si";
        r28 = "_npa";
        r27 = "";
        r53 = r8;
        r8 = r0;
        r2 = r53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0291, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r29 = "_si";
        r28 = "_npa";
        r27 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0143, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0144, code lost:
        r8 = r0;
        r29 = "_si";
        r28 = "_npa";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c A[ExcHandler: all (r0v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:4:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0264 A[ExcHandler: all (r0v13 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:63:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0280 A[ExcHandler: all (th java.lang.Throwable), PHI: r8 
  PHI: (r8v65 android.database.Cursor) = (r8v70 android.database.Cursor), (r8v70 android.database.Cursor), (r8v70 android.database.Cursor), (r8v96 android.database.Cursor), (r8v96 android.database.Cursor), (r8v96 android.database.Cursor), (r8v100 android.database.Cursor), (r8v100 android.database.Cursor), (r8v100 android.database.Cursor), (r8v100 android.database.Cursor) binds: [B:58:0x0102, B:59:?, B:61:0x010b, B:47:0x00e4, B:54:0x00f6, B:55:?, B:26:0x008e, B:32:0x0099, B:35:0x009e, B:36:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:26:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02b3 A[SYNTHETIC, Splitter:B:146:0x02b3] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02ba A[Catch:{ IOException -> 0x0246, all -> 0x1070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02c8 A[Catch:{ IOException -> 0x0246, all -> 0x1070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x040e A[Catch:{ IOException -> 0x0246, all -> 0x1070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0410 A[Catch:{ IOException -> 0x0246, all -> 0x1070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0413 A[Catch:{ IOException -> 0x0246, all -> 0x1070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0414 A[Catch:{ IOException -> 0x0246, all -> 0x1070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x05e6 A[Catch:{ IOException -> 0x0246, all -> 0x1070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x06bd A[Catch:{ IOException -> 0x0246, all -> 0x1070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0883 A[Catch:{ IOException -> 0x0246, all -> 0x1070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x08a4 A[Catch:{ IOException -> 0x0246, all -> 0x1070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x08be A[Catch:{ IOException -> 0x0246, all -> 0x1070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:604:0x1057 A[SYNTHETIC, Splitter:B:604:0x1057] */
    /* JADX WARNING: Removed duplicated region for block: B:612:0x106c A[SYNTHETIC, Splitter:B:612:0x106c] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0129 A[SYNTHETIC, Splitter:B:66:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(long r56) {
        /*
            r55 = this;
            r1 = r55
            java.lang.String r2 = "_si"
            java.lang.String r3 = "_sc"
            java.lang.String r4 = "_sn"
            java.lang.String r5 = "_npa"
            java.lang.String r6 = ""
            i.c.a.b.i.a.d r7 = r55.d()
            r7.y()
            i.c.a.b.i.a.t9$a r7 = new i.c.a.b.i.a.t9$a     // Catch:{ all -> 0x1070 }
            r8 = 0
            r7.<init>(r1, r8)     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.d r9 = r55.d()     // Catch:{ all -> 0x1070 }
            long r10 = r1.w     // Catch:{ all -> 0x1070 }
            i.c.a.b.d.l.q.a(r7)     // Catch:{ all -> 0x1070 }
            r9.c()     // Catch:{ all -> 0x1070 }
            r9.m()     // Catch:{ all -> 0x1070 }
            r13 = -1
            r15 = 2
            android.database.sqlite.SQLiteDatabase r12 = r9.u()     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            boolean r18 = android.text.TextUtils.isEmpty(r8)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            if (r18 == 0) goto L_0x00a6
            int r18 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r18 == 0) goto L_0x0053
            java.lang.String[] r8 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x0050, all -> 0x004c }
            java.lang.String r19 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x0050, all -> 0x004c }
            r17 = 0
            r8[r17] = r19     // Catch:{ SQLiteException -> 0x0050, all -> 0x004c }
            java.lang.String r19 = java.lang.String.valueOf(r56)     // Catch:{ SQLiteException -> 0x0050, all -> 0x004c }
            r20 = 1
            r8[r20] = r19     // Catch:{ SQLiteException -> 0x0050, all -> 0x004c }
            goto L_0x005f
        L_0x004c:
            r0 = move-exception
            r2 = r0
            goto L_0x0291
        L_0x0050:
            r0 = move-exception
            r8 = r0
            goto L_0x0064
        L_0x0053:
            r8 = 1
            java.lang.String[] r15 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            java.lang.String r8 = java.lang.String.valueOf(r56)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            r17 = 0
            r15[r17] = r8     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            r8 = r15
        L_0x005f:
            if (r18 == 0) goto L_0x006d
            java.lang.String r15 = "rowid <= ? and "
            goto L_0x006e
        L_0x0064:
            r29 = r2
            r28 = r5
            r27 = r6
        L_0x006a:
            r2 = 0
            goto L_0x029f
        L_0x006d:
            r15 = r6
        L_0x006e:
            int r13 = r15.length()     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            int r13 = r13 + 148
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            r14.<init>(r13)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            java.lang.String r13 = "select app_id, metadata_fingerprint from raw_events where "
            r14.append(r13)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            r14.append(r15)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            java.lang.String r13 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r14.append(r13)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            java.lang.String r13 = r14.toString()     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            android.database.Cursor r8 = r12.rawQuery(r13, r8)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            boolean r13 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0283, all -> 0x0280 }
            if (r13 != 0) goto L_0x0098
            r8.close()     // Catch:{ all -> 0x1070 }
            goto L_0x00ed
        L_0x0098:
            r13 = 0
            java.lang.String r14 = r8.getString(r13)     // Catch:{ SQLiteException -> 0x0283, all -> 0x0280 }
            r13 = 1
            java.lang.String r15 = r8.getString(r13)     // Catch:{ SQLiteException -> 0x0275, all -> 0x0280 }
            r8.close()     // Catch:{ SQLiteException -> 0x0275, all -> 0x0280 }
            goto L_0x00fe
        L_0x00a6:
            int r8 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x00b9
            r13 = 2
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            r13 = 0
            r15 = 0
            r14[r15] = r13     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            java.lang.String r13 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            r15 = 1
            r14[r15] = r13     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            goto L_0x00be
        L_0x00b9:
            r13 = 0
            java.lang.String[] r14 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
        L_0x00be:
            if (r8 == 0) goto L_0x00c3
            java.lang.String r8 = " and rowid <= ?"
            goto L_0x00c4
        L_0x00c3:
            r8 = r6
        L_0x00c4:
            int r13 = r8.length()     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            int r13 = r13 + 84
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            r15.<init>(r13)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            java.lang.String r13 = "select metadata_fingerprint from raw_events where app_id = ?"
            r15.append(r13)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            r15.append(r8)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            java.lang.String r8 = " order by rowid limit 1;"
            r15.append(r8)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            java.lang.String r8 = r15.toString()     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            android.database.Cursor r8 = r12.rawQuery(r8, r14)     // Catch:{ SQLiteException -> 0x0294, all -> 0x004c }
            boolean r13 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0283, all -> 0x0280 }
            if (r13 != 0) goto L_0x00f5
            r8.close()     // Catch:{ all -> 0x1070 }
        L_0x00ed:
            r29 = r2
            r28 = r5
            r27 = r6
            goto L_0x02b6
        L_0x00f5:
            r13 = 0
            java.lang.String r15 = r8.getString(r13)     // Catch:{ SQLiteException -> 0x0283, all -> 0x0280 }
            r8.close()     // Catch:{ SQLiteException -> 0x0283, all -> 0x0280 }
            r14 = 0
        L_0x00fe:
            java.lang.String r19 = "raw_events_metadata"
            java.lang.String r13 = "metadata"
            java.lang.String[] r20 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x0275, all -> 0x0280 }
            java.lang.String r21 = "app_id = ? and metadata_fingerprint = ?"
            r27 = r6
            r13 = 2
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x026f, all -> 0x0280 }
            r13 = 0
            r6[r13] = r14     // Catch:{ SQLiteException -> 0x026f, all -> 0x0280 }
            r13 = 1
            r6[r13] = r15     // Catch:{ SQLiteException -> 0x026f, all -> 0x0280 }
            r23 = 0
            r24 = 0
            java.lang.String r25 = "rowid"
            java.lang.String r26 = "2"
            r18 = r12
            r22 = r6
            android.database.Cursor r6 = r18.query(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ SQLiteException -> 0x026f, all -> 0x0280 }
            boolean r8 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0269, all -> 0x0264 }
            if (r8 != 0) goto L_0x014b
            i.c.a.b.i.a.m4 r8 = r9.n()     // Catch:{ SQLiteException -> 0x0143, all -> 0x0264 }
            i.c.a.b.i.a.o4 r8 = r8.u()     // Catch:{ SQLiteException -> 0x0143, all -> 0x0264 }
            java.lang.String r10 = "Raw event metadata record is missing. appId"
            java.lang.Object r11 = i.c.a.b.i.a.m4.a((java.lang.String) r14)     // Catch:{ SQLiteException -> 0x0143, all -> 0x0264 }
            r8.a(r10, r11)     // Catch:{ SQLiteException -> 0x0143, all -> 0x0264 }
            r6.close()     // Catch:{ all -> 0x1070 }
            r29 = r2
            r28 = r5
            goto L_0x02b6
        L_0x0143:
            r0 = move-exception
            r8 = r0
            r29 = r2
            r28 = r5
            goto L_0x027e
        L_0x014b:
            r8 = 0
            byte[] r13 = r6.getBlob(r8)     // Catch:{ SQLiteException -> 0x0269, all -> 0x0264 }
            i.c.a.b.g.g.t0$a r8 = i.c.a.b.g.g.t0.o()     // Catch:{ IOException -> 0x0246 }
            i.c.a.b.g.g.e5 r8 = i.c.a.b.i.a.x9.a(r8, (byte[]) r13)     // Catch:{ IOException -> 0x0246 }
            i.c.a.b.g.g.t0$a r8 = (i.c.a.b.g.g.t0.a) r8     // Catch:{ IOException -> 0x0246 }
            i.c.a.b.g.g.f5 r8 = r8.k()     // Catch:{ IOException -> 0x0246 }
            i.c.a.b.g.g.w3 r8 = (i.c.a.b.g.g.w3) r8     // Catch:{ IOException -> 0x0246 }
            i.c.a.b.g.g.t0 r8 = (i.c.a.b.g.g.t0) r8     // Catch:{ IOException -> 0x0246 }
            boolean r13 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x0269, all -> 0x0264 }
            if (r13 == 0) goto L_0x0183
            i.c.a.b.i.a.m4 r13 = r9.n()     // Catch:{ SQLiteException -> 0x0269, all -> 0x0264 }
            i.c.a.b.i.a.o4 r13 = r13.w()     // Catch:{ SQLiteException -> 0x0269, all -> 0x0264 }
            r28 = r5
            java.lang.String r5 = "Get multiple raw event metadata records, expected one. appId"
            r29 = r2
            java.lang.Object r2 = i.c.a.b.i.a.m4.a((java.lang.String) r14)     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            r13.a(r5, r2)     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            goto L_0x0187
        L_0x017e:
            r0 = move-exception
            r29 = r2
            goto L_0x027d
        L_0x0183:
            r29 = r2
            r28 = r5
        L_0x0187:
            r6.close()     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            r7.a(r8)     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            r18 = -1
            int r2 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r2 == 0) goto L_0x01a6
            java.lang.String r2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r5 = 3
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            r5 = 0
            r8[r5] = r14     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            r5 = 1
            r8[r5] = r15     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            r10 = 2
            r8[r10] = r5     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            goto L_0x01b1
        L_0x01a6:
            java.lang.String r2 = "app_id = ? and metadata_fingerprint = ?"
            r5 = 2
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            r5 = 0
            r8[r5] = r14     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            r5 = 1
            r8[r5] = r15     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
        L_0x01b1:
            r21 = r2
            r22 = r8
            java.lang.String r19 = "raw_events"
            java.lang.String r2 = "rowid"
            java.lang.String r5 = "name"
            java.lang.String r8 = "timestamp"
            java.lang.String r10 = "data"
            java.lang.String[] r20 = new java.lang.String[]{r2, r5, r8, r10}     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            r23 = 0
            r24 = 0
            java.lang.String r25 = "rowid"
            r26 = 0
            r18 = r12
            android.database.Cursor r2 = r18.query(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            boolean r5 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0242 }
            if (r5 != 0) goto L_0x01ed
            i.c.a.b.i.a.m4 r5 = r9.n()     // Catch:{ SQLiteException -> 0x0242 }
            i.c.a.b.i.a.o4 r5 = r5.w()     // Catch:{ SQLiteException -> 0x0242 }
            java.lang.String r6 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r8 = i.c.a.b.i.a.m4.a((java.lang.String) r14)     // Catch:{ SQLiteException -> 0x0242 }
            r5.a(r6, r8)     // Catch:{ SQLiteException -> 0x0242 }
            r2.close()     // Catch:{ all -> 0x1070 }
            goto L_0x02b6
        L_0x01ed:
            r5 = 0
            long r10 = r2.getLong(r5)     // Catch:{ SQLiteException -> 0x0242 }
            r5 = 3
            byte[] r6 = r2.getBlob(r5)     // Catch:{ SQLiteException -> 0x0242 }
            i.c.a.b.g.g.p0$a r5 = i.c.a.b.g.g.p0.n()     // Catch:{ IOException -> 0x0224 }
            i.c.a.b.g.g.e5 r5 = i.c.a.b.i.a.x9.a(r5, (byte[]) r6)     // Catch:{ IOException -> 0x0224 }
            i.c.a.b.g.g.p0$a r5 = (i.c.a.b.g.g.p0.a) r5     // Catch:{ IOException -> 0x0224 }
            r6 = 1
            java.lang.String r8 = r2.getString(r6)     // Catch:{ SQLiteException -> 0x0242 }
            r5.a((java.lang.String) r8)     // Catch:{ SQLiteException -> 0x0242 }
            r6 = 2
            long r12 = r2.getLong(r6)     // Catch:{ SQLiteException -> 0x0242 }
            r5.a((long) r12)     // Catch:{ SQLiteException -> 0x0242 }
            i.c.a.b.g.g.f5 r5 = r5.k()     // Catch:{ SQLiteException -> 0x0242 }
            i.c.a.b.g.g.w3 r5 = (i.c.a.b.g.g.w3) r5     // Catch:{ SQLiteException -> 0x0242 }
            i.c.a.b.g.g.p0 r5 = (i.c.a.b.g.g.p0) r5     // Catch:{ SQLiteException -> 0x0242 }
            boolean r5 = r7.a(r10, r5)     // Catch:{ SQLiteException -> 0x0242 }
            if (r5 != 0) goto L_0x0237
            r2.close()     // Catch:{ all -> 0x1070 }
            goto L_0x02b6
        L_0x0224:
            r0 = move-exception
            r5 = r0
            i.c.a.b.i.a.m4 r6 = r9.n()     // Catch:{ SQLiteException -> 0x0242 }
            i.c.a.b.i.a.o4 r6 = r6.u()     // Catch:{ SQLiteException -> 0x0242 }
            java.lang.String r8 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r10 = i.c.a.b.i.a.m4.a((java.lang.String) r14)     // Catch:{ SQLiteException -> 0x0242 }
            r6.a(r8, r10, r5)     // Catch:{ SQLiteException -> 0x0242 }
        L_0x0237:
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0242 }
            if (r5 != 0) goto L_0x01ed
            r2.close()     // Catch:{ all -> 0x1070 }
            goto L_0x02b6
        L_0x0242:
            r0 = move-exception
            r8 = r0
            r6 = r2
            goto L_0x027e
        L_0x0246:
            r0 = move-exception
            r29 = r2
            r28 = r5
            r2 = r0
            i.c.a.b.i.a.m4 r5 = r9.n()     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            i.c.a.b.i.a.o4 r5 = r5.u()     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            java.lang.String r8 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r10 = i.c.a.b.i.a.m4.a((java.lang.String) r14)     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            r5.a(r8, r10, r2)     // Catch:{ SQLiteException -> 0x0262, all -> 0x0264 }
            r6.close()     // Catch:{ all -> 0x1070 }
            goto L_0x02b6
        L_0x0262:
            r0 = move-exception
            goto L_0x027d
        L_0x0264:
            r0 = move-exception
            r2 = r0
            r8 = r6
            goto L_0x106a
        L_0x0269:
            r0 = move-exception
            r29 = r2
            r28 = r5
            goto L_0x027d
        L_0x026f:
            r0 = move-exception
            r29 = r2
            r28 = r5
            goto L_0x027c
        L_0x0275:
            r0 = move-exception
            r29 = r2
            r28 = r5
            r27 = r6
        L_0x027c:
            r6 = r8
        L_0x027d:
            r8 = r0
        L_0x027e:
            r2 = r6
            goto L_0x02a0
        L_0x0280:
            r0 = move-exception
            goto L_0x1069
        L_0x0283:
            r0 = move-exception
            r29 = r2
            r28 = r5
            r27 = r6
            r2 = r0
            r53 = r8
            r8 = r2
            r2 = r53
            goto L_0x029f
        L_0x0291:
            r8 = 0
            goto L_0x106a
        L_0x0294:
            r0 = move-exception
            r29 = r2
            r28 = r5
            r27 = r6
            r2 = r0
            r8 = r2
            goto L_0x006a
        L_0x029f:
            r14 = 0
        L_0x02a0:
            i.c.a.b.i.a.m4 r5 = r9.n()     // Catch:{ all -> 0x1067 }
            i.c.a.b.i.a.o4 r5 = r5.u()     // Catch:{ all -> 0x1067 }
            java.lang.String r6 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = i.c.a.b.i.a.m4.a((java.lang.String) r14)     // Catch:{ all -> 0x1067 }
            r5.a(r6, r9, r8)     // Catch:{ all -> 0x1067 }
            if (r2 == 0) goto L_0x02b6
            r2.close()     // Catch:{ all -> 0x1070 }
        L_0x02b6:
            java.util.List<i.c.a.b.g.g.p0> r2 = r7.c     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x02c5
            java.util.List<i.c.a.b.g.g.p0> r2 = r7.c     // Catch:{ all -> 0x1070 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x02c3
            goto L_0x02c5
        L_0x02c3:
            r2 = 0
            goto L_0x02c6
        L_0x02c5:
            r2 = 1
        L_0x02c6:
            if (r2 != 0) goto L_0x1057
            i.c.a.b.g.g.t0 r2 = r7.a     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3$b r2 = r2.j()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0$a r2 = (i.c.a.b.g.g.t0.a) r2     // Catch:{ all -> 0x1070 }
            r2.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.s5 r5 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r5 = r5.g()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r6 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = r6.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r8 = i.c.a.b.i.a.o.d0     // Catch:{ all -> 0x1070 }
            boolean r5 = r5.e(r6, r8)     // Catch:{ all -> 0x1070 }
            r8 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = -1
            r18 = 0
        L_0x02ee:
            java.util.List<i.c.a.b.g.g.p0> r9 = r7.c     // Catch:{ all -> 0x1070 }
            int r9 = r9.size()     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = "_fr"
            r21 = r10
            java.lang.String r10 = "_et"
            r22 = r11
            java.lang.String r11 = "_e"
            r23 = r3
            r24 = r4
            if (r12 >= r9) goto L_0x0918
            java.util.List<i.c.a.b.g.g.p0> r9 = r7.c     // Catch:{ all -> 0x1070 }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r9 = (i.c.a.b.g.g.p0) r9     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3$b r9 = r9.j()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0$a r9 = (i.c.a.b.g.g.p0.a) r9     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.n5 r3 = r55.b()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r4 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = r4.n()     // Catch:{ all -> 0x1070 }
            r30 = r12
            java.lang.String r12 = r9.n()     // Catch:{ all -> 0x1070 }
            boolean r3 = r3.b(r4, r12)     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = "_err"
            if (r3 == 0) goto L_0x03ad
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r3 = r3.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r3 = r3.w()     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = "Dropping blacklisted raw event. appId"
            i.c.a.b.g.g.t0 r10 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r10 = r10.n()     // Catch:{ all -> 0x1070 }
            java.lang.Object r10 = i.c.a.b.i.a.m4.a((java.lang.String) r10)     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.s5 r11 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.k4 r11 = r11.q()     // Catch:{ all -> 0x1070 }
            java.lang.String r12 = r9.n()     // Catch:{ all -> 0x1070 }
            java.lang.String r11 = r11.a((java.lang.String) r12)     // Catch:{ all -> 0x1070 }
            r3.a(r6, r10, r11)     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.n5 r3 = r55.b()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r6 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = r6.n()     // Catch:{ all -> 0x1070 }
            boolean r3 = r3.d(r6)     // Catch:{ all -> 0x1070 }
            if (r3 != 0) goto L_0x0374
            i.c.a.b.i.a.n5 r3 = r55.b()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r6 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = r6.n()     // Catch:{ all -> 0x1070 }
            boolean r3 = r3.e(r6)     // Catch:{ all -> 0x1070 }
            if (r3 == 0) goto L_0x0372
            goto L_0x0374
        L_0x0372:
            r3 = 0
            goto L_0x0375
        L_0x0374:
            r3 = 1
        L_0x0375:
            if (r3 != 0) goto L_0x0398
            java.lang.String r3 = r9.n()     // Catch:{ all -> 0x1070 }
            boolean r3 = r4.equals(r3)     // Catch:{ all -> 0x1070 }
            if (r3 != 0) goto L_0x0398
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.ca r3 = r3.p()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r4 = r7.a     // Catch:{ all -> 0x1070 }
            r4.n()     // Catch:{ all -> 0x1070 }
            r4 = 11
            java.lang.String r6 = "_ev"
            java.lang.String r9 = r9.n()     // Catch:{ all -> 0x1070 }
            r10 = 0
            r3.a((int) r4, (java.lang.String) r6, (java.lang.String) r9, (int) r10)     // Catch:{ all -> 0x1070 }
        L_0x0398:
            r31 = r5
            r36 = r8
            r16 = r14
            r10 = r21
            r11 = r22
            r3 = r23
            r14 = r24
            r6 = r29
            r5 = r30
            r8 = r2
            goto L_0x090a
        L_0x03ad:
            i.c.a.b.i.a.n5 r3 = r55.b()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r12 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r12 = r12.n()     // Catch:{ all -> 0x1070 }
            r31 = r5
            java.lang.String r5 = r9.n()     // Catch:{ all -> 0x1070 }
            boolean r3 = r3.c(r12, r5)     // Catch:{ all -> 0x1070 }
            java.lang.String r5 = "_c"
            if (r3 != 0) goto L_0x041d
            r55.f()     // Catch:{ all -> 0x1070 }
            java.lang.String r12 = r9.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.d.l.q.b((java.lang.String) r12)     // Catch:{ all -> 0x1070 }
            r32 = r15
            int r15 = r12.hashCode()     // Catch:{ all -> 0x1070 }
            r33 = r13
            r13 = 94660(0x171c4, float:1.32647E-40)
            if (r15 == r13) goto L_0x03fb
            r13 = 95025(0x17331, float:1.33158E-40)
            if (r15 == r13) goto L_0x03f1
            r13 = 95027(0x17333, float:1.33161E-40)
            if (r15 == r13) goto L_0x03e7
            goto L_0x0405
        L_0x03e7:
            java.lang.String r13 = "_ui"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x1070 }
            if (r12 == 0) goto L_0x0405
            r12 = 1
            goto L_0x0406
        L_0x03f1:
            java.lang.String r13 = "_ug"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x1070 }
            if (r12 == 0) goto L_0x0405
            r12 = 2
            goto L_0x0406
        L_0x03fb:
            java.lang.String r13 = "_in"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x1070 }
            if (r12 == 0) goto L_0x0405
            r12 = 0
            goto L_0x0406
        L_0x0405:
            r12 = -1
        L_0x0406:
            if (r12 == 0) goto L_0x0410
            r13 = 1
            if (r12 == r13) goto L_0x0410
            r13 = 2
            if (r12 == r13) goto L_0x0410
            r12 = 0
            goto L_0x0411
        L_0x0410:
            r12 = 1
        L_0x0411:
            if (r12 == 0) goto L_0x0414
            goto L_0x0421
        L_0x0414:
            r35 = r2
            r36 = r8
            r34 = r10
            r10 = r14
            goto L_0x05e4
        L_0x041d:
            r33 = r13
            r32 = r15
        L_0x0421:
            r34 = r10
            r12 = 0
            r13 = 0
            r15 = 0
        L_0x0426:
            int r10 = r9.l()     // Catch:{ all -> 0x1070 }
            r35 = r2
            java.lang.String r2 = "_r"
            if (r12 >= r10) goto L_0x048b
            i.c.a.b.g.g.r0 r10 = r9.a((int) r12)     // Catch:{ all -> 0x1070 }
            java.lang.String r10 = r10.k()     // Catch:{ all -> 0x1070 }
            boolean r10 = r5.equals(r10)     // Catch:{ all -> 0x1070 }
            if (r10 == 0) goto L_0x045b
            i.c.a.b.g.g.r0 r2 = r9.a((int) r12)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3$b r2 = r2.j()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0$a r2 = (i.c.a.b.g.g.r0.a) r2     // Catch:{ all -> 0x1070 }
            r10 = r14
            r13 = 1
            r2.a((long) r13)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r2 = r2.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r2 = (i.c.a.b.g.g.w3) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r2 = (i.c.a.b.g.g.r0) r2     // Catch:{ all -> 0x1070 }
            r9.a(r12, r2)     // Catch:{ all -> 0x1070 }
            r13 = 1
            goto L_0x0485
        L_0x045b:
            r10 = r14
            i.c.a.b.g.g.r0 r14 = r9.a((int) r12)     // Catch:{ all -> 0x1070 }
            java.lang.String r14 = r14.k()     // Catch:{ all -> 0x1070 }
            boolean r2 = r2.equals(r14)     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x0485
            i.c.a.b.g.g.r0 r2 = r9.a((int) r12)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3$b r2 = r2.j()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0$a r2 = (i.c.a.b.g.g.r0.a) r2     // Catch:{ all -> 0x1070 }
            r14 = 1
            r2.a((long) r14)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r2 = r2.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r2 = (i.c.a.b.g.g.w3) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r2 = (i.c.a.b.g.g.r0) r2     // Catch:{ all -> 0x1070 }
            r9.a(r12, r2)     // Catch:{ all -> 0x1070 }
            r15 = 1
        L_0x0485:
            int r12 = r12 + 1
            r14 = r10
            r2 = r35
            goto L_0x0426
        L_0x048b:
            r10 = r14
            if (r13 != 0) goto L_0x04bf
            if (r3 == 0) goto L_0x04bf
            i.c.a.b.i.a.s5 r12 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r12 = r12.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r12 = r12.z()     // Catch:{ all -> 0x1070 }
            java.lang.String r13 = "Marking event as conversion"
            i.c.a.b.i.a.s5 r14 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.k4 r14 = r14.q()     // Catch:{ all -> 0x1070 }
            r36 = r8
            java.lang.String r8 = r9.n()     // Catch:{ all -> 0x1070 }
            java.lang.String r8 = r14.a((java.lang.String) r8)     // Catch:{ all -> 0x1070 }
            r12.a(r13, r8)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0$a r8 = i.c.a.b.g.g.r0.s()     // Catch:{ all -> 0x1070 }
            r8.a((java.lang.String) r5)     // Catch:{ all -> 0x1070 }
            r12 = 1
            r8.a((long) r12)     // Catch:{ all -> 0x1070 }
            r9.a((i.c.a.b.g.g.r0.a) r8)     // Catch:{ all -> 0x1070 }
            goto L_0x04c1
        L_0x04bf:
            r36 = r8
        L_0x04c1:
            if (r15 != 0) goto L_0x04ef
            i.c.a.b.i.a.s5 r8 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r8 = r8.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r8 = r8.z()     // Catch:{ all -> 0x1070 }
            java.lang.String r12 = "Marking event as real-time"
            i.c.a.b.i.a.s5 r13 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.k4 r13 = r13.q()     // Catch:{ all -> 0x1070 }
            java.lang.String r14 = r9.n()     // Catch:{ all -> 0x1070 }
            java.lang.String r13 = r13.a((java.lang.String) r14)     // Catch:{ all -> 0x1070 }
            r8.a(r12, r13)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0$a r8 = i.c.a.b.g.g.r0.s()     // Catch:{ all -> 0x1070 }
            r8.a((java.lang.String) r2)     // Catch:{ all -> 0x1070 }
            r12 = 1
            r8.a((long) r12)     // Catch:{ all -> 0x1070 }
            r9.a((i.c.a.b.g.g.r0.a) r8)     // Catch:{ all -> 0x1070 }
        L_0x04ef:
            i.c.a.b.i.a.d r37 = r55.d()     // Catch:{ all -> 0x1070 }
            long r38 = r55.s()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r8 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r40 = r8.n()     // Catch:{ all -> 0x1070 }
            r41 = 0
            r42 = 1
            i.c.a.b.i.a.c r8 = r37.a((long) r38, (java.lang.String) r40, (boolean) r41, (boolean) r42)     // Catch:{ all -> 0x1070 }
            long r12 = r8.e     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.s5 r8 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r8 = r8.g()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r14 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r14 = r14.n()     // Catch:{ all -> 0x1070 }
            int r8 = r8.b(r14)     // Catch:{ all -> 0x1070 }
            long r14 = (long) r8     // Catch:{ all -> 0x1070 }
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x0520
            a((i.c.a.b.g.g.p0.a) r9, (java.lang.String) r2)     // Catch:{ all -> 0x1070 }
            goto L_0x0522
        L_0x0520:
            r21 = 1
        L_0x0522:
            java.lang.String r2 = r9.n()     // Catch:{ all -> 0x1070 }
            boolean r2 = i.c.a.b.i.a.ca.h(r2)     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x05e4
            if (r3 == 0) goto L_0x05e4
            i.c.a.b.i.a.d r37 = r55.d()     // Catch:{ all -> 0x1070 }
            long r38 = r55.s()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r2 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r40 = r2.n()     // Catch:{ all -> 0x1070 }
            r41 = 1
            r42 = 0
            i.c.a.b.i.a.c r2 = r37.a((long) r38, (java.lang.String) r40, (boolean) r41, (boolean) r42)     // Catch:{ all -> 0x1070 }
            long r12 = r2.c     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r2 = r2.g()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r8 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r8 = r8.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.f4<java.lang.Integer> r14 = i.c.a.b.i.a.o.f3810n     // Catch:{ all -> 0x1070 }
            int r2 = r2.b(r8, r14)     // Catch:{ all -> 0x1070 }
            long r14 = (long) r2     // Catch:{ all -> 0x1070 }
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x05e4
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r2 = r2.w()     // Catch:{ all -> 0x1070 }
            java.lang.String r8 = "Too many conversions. Not logging as conversion. appId"
            i.c.a.b.g.g.t0 r12 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r12 = r12.n()     // Catch:{ all -> 0x1070 }
            java.lang.Object r12 = i.c.a.b.i.a.m4.a((java.lang.String) r12)     // Catch:{ all -> 0x1070 }
            r2.a(r8, r12)     // Catch:{ all -> 0x1070 }
            r2 = 0
            r8 = 0
            r12 = -1
            r13 = 0
        L_0x057a:
            int r14 = r9.l()     // Catch:{ all -> 0x1070 }
            if (r2 >= r14) goto L_0x05a5
            i.c.a.b.g.g.r0 r14 = r9.a((int) r2)     // Catch:{ all -> 0x1070 }
            java.lang.String r15 = r14.k()     // Catch:{ all -> 0x1070 }
            boolean r15 = r5.equals(r15)     // Catch:{ all -> 0x1070 }
            if (r15 == 0) goto L_0x0597
            i.c.a.b.g.g.w3$b r12 = r14.j()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0$a r12 = (i.c.a.b.g.g.r0.a) r12     // Catch:{ all -> 0x1070 }
            r13 = r12
            r12 = r2
            goto L_0x05a2
        L_0x0597:
            java.lang.String r14 = r14.k()     // Catch:{ all -> 0x1070 }
            boolean r14 = r4.equals(r14)     // Catch:{ all -> 0x1070 }
            if (r14 == 0) goto L_0x05a2
            r8 = 1
        L_0x05a2:
            int r2 = r2 + 1
            goto L_0x057a
        L_0x05a5:
            if (r8 == 0) goto L_0x05ad
            if (r13 == 0) goto L_0x05ad
            r9.b((int) r12)     // Catch:{ all -> 0x1070 }
            goto L_0x05e4
        L_0x05ad:
            if (r13 == 0) goto L_0x05cb
            java.lang.Object r2 = r13.clone()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3$b r2 = (i.c.a.b.g.g.w3.b) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0$a r2 = (i.c.a.b.g.g.r0.a) r2     // Catch:{ all -> 0x1070 }
            r2.a((java.lang.String) r4)     // Catch:{ all -> 0x1070 }
            r13 = 10
            r2.a((long) r13)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r2 = r2.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r2 = (i.c.a.b.g.g.w3) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r2 = (i.c.a.b.g.g.r0) r2     // Catch:{ all -> 0x1070 }
            r9.a(r12, r2)     // Catch:{ all -> 0x1070 }
            goto L_0x05e4
        L_0x05cb:
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r2 = r2.u()     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = "Did not find conversion parameter. appId"
            i.c.a.b.g.g.t0 r8 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r8 = r8.n()     // Catch:{ all -> 0x1070 }
            java.lang.Object r8 = i.c.a.b.i.a.m4.a((java.lang.String) r8)     // Catch:{ all -> 0x1070 }
            r2.a(r4, r8)     // Catch:{ all -> 0x1070 }
        L_0x05e4:
            if (r3 == 0) goto L_0x06a7
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x1070 }
            java.util.List r3 = r9.a()     // Catch:{ all -> 0x1070 }
            r2.<init>(r3)     // Catch:{ all -> 0x1070 }
            r3 = 0
            r4 = -1
            r8 = -1
        L_0x05f2:
            int r12 = r2.size()     // Catch:{ all -> 0x1070 }
            java.lang.String r13 = "currency"
            java.lang.String r14 = "value"
            if (r3 >= r12) goto L_0x0622
            java.lang.Object r12 = r2.get(r3)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r12 = (i.c.a.b.g.g.r0) r12     // Catch:{ all -> 0x1070 }
            java.lang.String r12 = r12.k()     // Catch:{ all -> 0x1070 }
            boolean r12 = r14.equals(r12)     // Catch:{ all -> 0x1070 }
            if (r12 == 0) goto L_0x060e
            r4 = r3
            goto L_0x061f
        L_0x060e:
            java.lang.Object r12 = r2.get(r3)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r12 = (i.c.a.b.g.g.r0) r12     // Catch:{ all -> 0x1070 }
            java.lang.String r12 = r12.k()     // Catch:{ all -> 0x1070 }
            boolean r12 = r13.equals(r12)     // Catch:{ all -> 0x1070 }
            if (r12 == 0) goto L_0x061f
            r8 = r3
        L_0x061f:
            int r3 = r3 + 1
            goto L_0x05f2
        L_0x0622:
            r3 = -1
            if (r4 == r3) goto L_0x06a8
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r3 = (i.c.a.b.g.g.r0) r3     // Catch:{ all -> 0x1070 }
            boolean r3 = r3.n()     // Catch:{ all -> 0x1070 }
            if (r3 != 0) goto L_0x0658
            java.lang.Object r3 = r2.get(r4)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r3 = (i.c.a.b.g.g.r0) r3     // Catch:{ all -> 0x1070 }
            boolean r3 = r3.p()     // Catch:{ all -> 0x1070 }
            if (r3 != 0) goto L_0x0658
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r2 = r2.x()     // Catch:{ all -> 0x1070 }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.a(r3)     // Catch:{ all -> 0x1070 }
            r9.b((int) r4)     // Catch:{ all -> 0x1070 }
            a((i.c.a.b.g.g.p0.a) r9, (java.lang.String) r5)     // Catch:{ all -> 0x1070 }
            r2 = 18
            a((i.c.a.b.g.g.p0.a) r9, (int) r2, (java.lang.String) r14)     // Catch:{ all -> 0x1070 }
            goto L_0x06a7
        L_0x0658:
            r3 = -1
            if (r8 != r3) goto L_0x065e
            r2 = 1
            r12 = 3
            goto L_0x068a
        L_0x065e:
            java.lang.Object r2 = r2.get(r8)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r2 = (i.c.a.b.g.g.r0) r2     // Catch:{ all -> 0x1070 }
            java.lang.String r2 = r2.m()     // Catch:{ all -> 0x1070 }
            int r8 = r2.length()     // Catch:{ all -> 0x1070 }
            r12 = 3
            if (r8 == r12) goto L_0x0670
            goto L_0x0681
        L_0x0670:
            r8 = 0
        L_0x0671:
            int r14 = r2.length()     // Catch:{ all -> 0x1070 }
            if (r8 >= r14) goto L_0x0689
            int r14 = r2.codePointAt(r8)     // Catch:{ all -> 0x1070 }
            boolean r15 = java.lang.Character.isLetter(r14)     // Catch:{ all -> 0x1070 }
            if (r15 != 0) goto L_0x0683
        L_0x0681:
            r2 = 1
            goto L_0x068a
        L_0x0683:
            int r14 = java.lang.Character.charCount(r14)     // Catch:{ all -> 0x1070 }
            int r8 = r8 + r14
            goto L_0x0671
        L_0x0689:
            r2 = 0
        L_0x068a:
            if (r2 == 0) goto L_0x06a9
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r2 = r2.x()     // Catch:{ all -> 0x1070 }
            java.lang.String r8 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.a(r8)     // Catch:{ all -> 0x1070 }
            r9.b((int) r4)     // Catch:{ all -> 0x1070 }
            a((i.c.a.b.g.g.p0.a) r9, (java.lang.String) r5)     // Catch:{ all -> 0x1070 }
            r2 = 19
            a((i.c.a.b.g.g.p0.a) r9, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x1070 }
            goto L_0x06a9
        L_0x06a7:
            r3 = -1
        L_0x06a8:
            r12 = 3
        L_0x06a9:
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r2 = r2.g()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r4 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = r4.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r5 = i.c.a.b.i.a.o.c0     // Catch:{ all -> 0x1070 }
            boolean r2 = r2.e(r4, r5)     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x0883
            java.lang.String r2 = r9.n()     // Catch:{ all -> 0x1070 }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x1070 }
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x072e
            r55.f()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r2 = r9.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r2 = (i.c.a.b.g.g.w3) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r2 = (i.c.a.b.g.g.p0) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r2 = i.c.a.b.i.a.x9.b(r2, r6)     // Catch:{ all -> 0x1070 }
            if (r2 != 0) goto L_0x071e
            if (r10 == 0) goto L_0x0708
            long r13 = r10.p()     // Catch:{ all -> 0x1070 }
            long r15 = r9.p()     // Catch:{ all -> 0x1070 }
            long r13 = r13 - r15
            long r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x1070 }
            int r2 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0708
            java.lang.Object r2 = r10.clone()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3$b r2 = (i.c.a.b.g.g.w3.b) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0$a r2 = (i.c.a.b.g.g.p0.a) r2     // Catch:{ all -> 0x1070 }
            boolean r4 = r1.a((i.c.a.b.g.g.p0.a) r9, (i.c.a.b.g.g.p0.a) r2)     // Catch:{ all -> 0x1070 }
            if (r4 == 0) goto L_0x0708
            r8 = r35
            r6 = r36
            r8.a((int) r6, (i.c.a.b.g.g.p0.a) r2)     // Catch:{ all -> 0x1070 }
            r4 = r32
            r13 = r34
            goto L_0x0778
        L_0x0708:
            r8 = r35
            r6 = r36
            r36 = r6
            r33 = r9
            r16 = r10
            r15 = r22
            r3 = r23
            r14 = r24
            r6 = r29
            r13 = r34
            goto L_0x0892
        L_0x071e:
            r8 = r35
            r16 = r10
            r3 = r23
            r14 = r24
            r6 = r29
            r4 = r32
            r13 = r34
            goto L_0x0891
        L_0x072e:
            r8 = r35
            r6 = r36
            java.lang.String r2 = "_vs"
            java.lang.String r13 = r9.n()     // Catch:{ all -> 0x1070 }
            boolean r2 = r2.equals(r13)     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x0797
            r55.f()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r2 = r9.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r2 = (i.c.a.b.g.g.w3) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r2 = (i.c.a.b.g.g.p0) r2     // Catch:{ all -> 0x1070 }
            r13 = r34
            i.c.a.b.g.g.r0 r2 = i.c.a.b.i.a.x9.b(r2, r13)     // Catch:{ all -> 0x1070 }
            if (r2 != 0) goto L_0x0793
            if (r33 == 0) goto L_0x0784
            long r14 = r33.p()     // Catch:{ all -> 0x1070 }
            long r25 = r9.p()     // Catch:{ all -> 0x1070 }
            long r14 = r14 - r25
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x1070 }
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0784
            java.lang.Object r2 = r33.clone()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3$b r2 = (i.c.a.b.g.g.w3.b) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0$a r2 = (i.c.a.b.g.g.p0.a) r2     // Catch:{ all -> 0x1070 }
            boolean r4 = r1.a((i.c.a.b.g.g.p0.a) r2, (i.c.a.b.g.g.p0.a) r9)     // Catch:{ all -> 0x1070 }
            if (r4 == 0) goto L_0x0784
            r4 = r32
            r8.a((int) r4, (i.c.a.b.g.g.p0.a) r2)     // Catch:{ all -> 0x1070 }
        L_0x0778:
            r36 = r6
            r3 = r23
            r14 = r24
            r6 = r29
            r16 = 0
            goto L_0x0874
        L_0x0784:
            r4 = r32
            r15 = r4
            r16 = r9
            r36 = r22
            r3 = r23
            r14 = r24
            r6 = r29
            goto L_0x0892
        L_0x0793:
            r4 = r32
            goto L_0x0878
        L_0x0797:
            r4 = r32
            r13 = r34
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r2 = r2.g()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r5 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r5 = r5.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r14 = i.c.a.b.i.a.o.M0     // Catch:{ all -> 0x1070 }
            boolean r2 = r2.e(r5, r14)     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x0878
            java.lang.String r2 = "_ab"
            java.lang.String r5 = r9.n()     // Catch:{ all -> 0x1070 }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x0878
            r55.f()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r2 = r9.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r2 = (i.c.a.b.g.g.w3) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r2 = (i.c.a.b.g.g.p0) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r2 = i.c.a.b.i.a.x9.b(r2, r13)     // Catch:{ all -> 0x1070 }
            if (r2 != 0) goto L_0x0878
            if (r33 == 0) goto L_0x0878
            long r14 = r33.p()     // Catch:{ all -> 0x1070 }
            long r25 = r9.p()     // Catch:{ all -> 0x1070 }
            long r14 = r14 - r25
            long r14 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x1070 }
            r25 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1))
            if (r2 > 0) goto L_0x0878
            java.lang.Object r2 = r33.clone()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3$b r2 = (i.c.a.b.g.g.w3.b) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0$a r2 = (i.c.a.b.g.g.p0.a) r2     // Catch:{ all -> 0x1070 }
            r1.b((i.c.a.b.g.g.p0.a) r2, (i.c.a.b.g.g.p0.a) r9)     // Catch:{ all -> 0x1070 }
            java.lang.String r5 = r2.n()     // Catch:{ all -> 0x1070 }
            boolean r5 = r11.equals(r5)     // Catch:{ all -> 0x1070 }
            i.c.a.b.d.l.q.a((boolean) r5)     // Catch:{ all -> 0x1070 }
            r55.f()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r5 = r2.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r5 = (i.c.a.b.g.g.w3) r5     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r5 = (i.c.a.b.g.g.p0) r5     // Catch:{ all -> 0x1070 }
            r14 = r24
            i.c.a.b.g.g.r0 r5 = i.c.a.b.i.a.x9.b(r5, r14)     // Catch:{ all -> 0x1070 }
            r55.f()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r15 = r2.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r15 = (i.c.a.b.g.g.w3) r15     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r15 = (i.c.a.b.g.g.p0) r15     // Catch:{ all -> 0x1070 }
            r3 = r23
            i.c.a.b.g.g.r0 r15 = i.c.a.b.i.a.x9.b(r15, r3)     // Catch:{ all -> 0x1070 }
            r55.f()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r16 = r2.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r16 = (i.c.a.b.g.g.w3) r16     // Catch:{ all -> 0x1070 }
            r12 = r16
            i.c.a.b.g.g.p0 r12 = (i.c.a.b.g.g.p0) r12     // Catch:{ all -> 0x1070 }
            r36 = r6
            r6 = r29
            i.c.a.b.g.g.r0 r12 = i.c.a.b.i.a.x9.b(r12, r6)     // Catch:{ all -> 0x1070 }
            if (r5 == 0) goto L_0x0836
            java.lang.String r5 = r5.m()     // Catch:{ all -> 0x1070 }
            goto L_0x0838
        L_0x0836:
            r5 = r27
        L_0x0838:
            boolean r16 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x1070 }
            if (r16 != 0) goto L_0x0848
            r16 = r10
            i.c.a.b.i.a.x9 r10 = r55.f()     // Catch:{ all -> 0x1070 }
            r10.a((i.c.a.b.g.g.p0.a) r9, (java.lang.String) r14, (java.lang.Object) r5)     // Catch:{ all -> 0x1070 }
            goto L_0x084a
        L_0x0848:
            r16 = r10
        L_0x084a:
            if (r15 == 0) goto L_0x0851
            java.lang.String r5 = r15.m()     // Catch:{ all -> 0x1070 }
            goto L_0x0853
        L_0x0851:
            r5 = r27
        L_0x0853:
            boolean r10 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x1070 }
            if (r10 != 0) goto L_0x0860
            i.c.a.b.i.a.x9 r10 = r55.f()     // Catch:{ all -> 0x1070 }
            r10.a((i.c.a.b.g.g.p0.a) r9, (java.lang.String) r3, (java.lang.Object) r5)     // Catch:{ all -> 0x1070 }
        L_0x0860:
            if (r12 == 0) goto L_0x0871
            i.c.a.b.i.a.x9 r5 = r55.f()     // Catch:{ all -> 0x1070 }
            long r24 = r12.o()     // Catch:{ all -> 0x1070 }
            java.lang.Long r10 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x1070 }
            r5.a((i.c.a.b.g.g.p0.a) r9, (java.lang.String) r6, (java.lang.Object) r10)     // Catch:{ all -> 0x1070 }
        L_0x0871:
            r8.a((int) r4, (i.c.a.b.g.g.p0.a) r2)     // Catch:{ all -> 0x1070 }
        L_0x0874:
            r15 = r4
            r33 = 0
            goto L_0x0892
        L_0x0878:
            r36 = r6
            r16 = r10
            r3 = r23
            r14 = r24
            r6 = r29
            goto L_0x0891
        L_0x0883:
            r16 = r10
            r3 = r23
            r14 = r24
            r6 = r29
            r4 = r32
            r13 = r34
            r8 = r35
        L_0x0891:
            r15 = r4
        L_0x0892:
            if (r31 != 0) goto L_0x08f2
            java.lang.String r2 = r9.n()     // Catch:{ all -> 0x1070 }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x08f2
            int r2 = r9.l()     // Catch:{ all -> 0x1070 }
            if (r2 != 0) goto L_0x08be
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r2 = r2.w()     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = "Engagement event does not contain any parameters. appId"
            i.c.a.b.g.g.t0 r5 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r5 = r5.n()     // Catch:{ all -> 0x1070 }
            java.lang.Object r5 = i.c.a.b.i.a.m4.a((java.lang.String) r5)     // Catch:{ all -> 0x1070 }
            r2.a(r4, r5)     // Catch:{ all -> 0x1070 }
            goto L_0x08f2
        L_0x08be:
            i.c.a.b.i.a.x9 r2 = r55.f()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r4 = r9.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r4 = (i.c.a.b.g.g.w3) r4     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r4 = (i.c.a.b.g.g.p0) r4     // Catch:{ all -> 0x1070 }
            java.lang.Object r2 = r2.a((i.c.a.b.g.g.p0) r4, (java.lang.String) r13)     // Catch:{ all -> 0x1070 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x1070 }
            if (r2 != 0) goto L_0x08ec
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r2 = r2.w()     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = "Engagement event does not include duration. appId"
            i.c.a.b.g.g.t0 r5 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r5 = r5.n()     // Catch:{ all -> 0x1070 }
            java.lang.Object r5 = i.c.a.b.i.a.m4.a((java.lang.String) r5)     // Catch:{ all -> 0x1070 }
            r2.a(r4, r5)     // Catch:{ all -> 0x1070 }
            goto L_0x08f2
        L_0x08ec:
            long r4 = r2.longValue()     // Catch:{ all -> 0x1070 }
            long r18 = r18 + r4
        L_0x08f2:
            java.util.List<i.c.a.b.g.g.p0> r2 = r7.c     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r4 = r9.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r4 = (i.c.a.b.g.g.w3) r4     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r4 = (i.c.a.b.g.g.p0) r4     // Catch:{ all -> 0x1070 }
            r5 = r30
            r2.set(r5, r4)     // Catch:{ all -> 0x1070 }
            int r11 = r22 + 1
            r8.a((i.c.a.b.g.g.p0.a) r9)     // Catch:{ all -> 0x1070 }
            r10 = r21
            r13 = r33
        L_0x090a:
            int r12 = r5 + 1
            r29 = r6
            r2 = r8
            r4 = r14
            r14 = r16
            r5 = r31
            r8 = r36
            goto L_0x02ee
        L_0x0918:
            r8 = r2
            r31 = r5
            r13 = r10
            if (r31 == 0) goto L_0x0970
            r2 = r22
            r3 = 0
        L_0x0921:
            if (r3 >= r2) goto L_0x0970
            i.c.a.b.g.g.p0 r4 = r8.a((int) r3)     // Catch:{ all -> 0x1070 }
            java.lang.String r5 = r4.k()     // Catch:{ all -> 0x1070 }
            boolean r5 = r11.equals(r5)     // Catch:{ all -> 0x1070 }
            if (r5 == 0) goto L_0x0942
            r55.f()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r5 = i.c.a.b.i.a.x9.b(r4, r6)     // Catch:{ all -> 0x1070 }
            if (r5 == 0) goto L_0x0942
            r8.b((int) r3)     // Catch:{ all -> 0x1070 }
            int r2 = r2 + -1
            int r3 = r3 + -1
            goto L_0x096d
        L_0x0942:
            r55.f()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r4 = i.c.a.b.i.a.x9.b(r4, r13)     // Catch:{ all -> 0x1070 }
            if (r4 == 0) goto L_0x096d
            boolean r5 = r4.n()     // Catch:{ all -> 0x1070 }
            if (r5 == 0) goto L_0x095a
            long r4 = r4.o()     // Catch:{ all -> 0x1070 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x1070 }
            goto L_0x095b
        L_0x095a:
            r4 = 0
        L_0x095b:
            if (r4 == 0) goto L_0x096d
            long r9 = r4.longValue()     // Catch:{ all -> 0x1070 }
            r14 = 0
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x096d
            long r4 = r4.longValue()     // Catch:{ all -> 0x1070 }
            long r18 = r18 + r4
        L_0x096d:
            r4 = 1
            int r3 = r3 + r4
            goto L_0x0921
        L_0x0970:
            r2 = r18
            r4 = 0
            r1.a((i.c.a.b.g.g.t0.a) r8, (long) r2, (boolean) r4)     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r4 = r4.g()     // Catch:{ all -> 0x1070 }
            java.lang.String r5 = r8.v()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r6 = i.c.a.b.i.a.o.p0     // Catch:{ all -> 0x1070 }
            boolean r4 = r4.e(r5, r6)     // Catch:{ all -> 0x1070 }
            java.lang.String r5 = "_se"
            if (r4 == 0) goto L_0x0a39
            java.util.List r4 = r8.a()     // Catch:{ all -> 0x1070 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x1070 }
        L_0x0992:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x1070 }
            if (r6 == 0) goto L_0x09ac
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r6 = (i.c.a.b.g.g.p0) r6     // Catch:{ all -> 0x1070 }
            java.lang.String r9 = "_s"
            java.lang.String r6 = r6.k()     // Catch:{ all -> 0x1070 }
            boolean r6 = r9.equals(r6)     // Catch:{ all -> 0x1070 }
            if (r6 == 0) goto L_0x0992
            r4 = 1
            goto L_0x09ad
        L_0x09ac:
            r4 = 0
        L_0x09ad:
            if (r4 == 0) goto L_0x09ba
            i.c.a.b.i.a.d r4 = r55.d()     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = r8.v()     // Catch:{ all -> 0x1070 }
            r4.b((java.lang.String) r6, (java.lang.String) r5)     // Catch:{ all -> 0x1070 }
        L_0x09ba:
            boolean r4 = i.c.a.b.g.g.ib.b()     // Catch:{ all -> 0x1070 }
            if (r4 == 0) goto L_0x0a34
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r4 = r4.g()     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = r8.v()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r9 = i.c.a.b.i.a.o.q0     // Catch:{ all -> 0x1070 }
            boolean r4 = r4.e(r6, r9)     // Catch:{ all -> 0x1070 }
            if (r4 == 0) goto L_0x0a34
            java.lang.String r4 = "_sid"
            int r4 = i.c.a.b.i.a.x9.a((i.c.a.b.g.g.t0.a) r8, (java.lang.String) r4)     // Catch:{ all -> 0x1070 }
            if (r4 < 0) goto L_0x09dc
            r4 = 1
            goto L_0x09dd
        L_0x09dc:
            r4 = 0
        L_0x09dd:
            if (r4 != 0) goto L_0x0a34
            int r2 = i.c.a.b.i.a.x9.a((i.c.a.b.g.g.t0.a) r8, (java.lang.String) r5)     // Catch:{ all -> 0x1070 }
            if (r2 < 0) goto L_0x0a56
            r8.d((int) r2)     // Catch:{ all -> 0x1070 }
            boolean r2 = i.c.a.b.g.g.k9.b()     // Catch:{ all -> 0x1070 }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            if (r2 == 0) goto L_0x0a1c
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r2 = r2.g()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r4 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = r4.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r5 = i.c.a.b.i.a.o.Z0     // Catch:{ all -> 0x1070 }
            boolean r2 = r2.e(r4, r5)     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x0a1c
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r2 = r2.u()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r4 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = r4.n()     // Catch:{ all -> 0x1070 }
            java.lang.Object r4 = i.c.a.b.i.a.m4.a((java.lang.String) r4)     // Catch:{ all -> 0x1070 }
            r2.a(r3, r4)     // Catch:{ all -> 0x1070 }
            goto L_0x0a56
        L_0x0a1c:
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r2 = r2.w()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r4 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = r4.n()     // Catch:{ all -> 0x1070 }
            java.lang.Object r4 = i.c.a.b.i.a.m4.a((java.lang.String) r4)     // Catch:{ all -> 0x1070 }
            r2.a(r3, r4)     // Catch:{ all -> 0x1070 }
            goto L_0x0a56
        L_0x0a34:
            r4 = 1
            r1.a((i.c.a.b.g.g.t0.a) r8, (long) r2, (boolean) r4)     // Catch:{ all -> 0x1070 }
            goto L_0x0a56
        L_0x0a39:
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r2 = r2.g()     // Catch:{ all -> 0x1070 }
            java.lang.String r3 = r8.v()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r4 = i.c.a.b.i.a.o.s0     // Catch:{ all -> 0x1070 }
            boolean r2 = r2.e(r3, r4)     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x0a56
            i.c.a.b.i.a.d r2 = r55.d()     // Catch:{ all -> 0x1070 }
            java.lang.String r3 = r8.v()     // Catch:{ all -> 0x1070 }
            r2.b((java.lang.String) r3, (java.lang.String) r5)     // Catch:{ all -> 0x1070 }
        L_0x0a56:
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r2 = r2.g()     // Catch:{ all -> 0x1070 }
            java.lang.String r3 = r8.v()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r4 = i.c.a.b.i.a.o.e0     // Catch:{ all -> 0x1070 }
            boolean r2 = r2.e(r3, r4)     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x0af6
            i.c.a.b.i.a.x9 r2 = r55.f()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r3 = r2.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r3 = r3.z()     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = "Checking account type status for ad personalization signals"
            r3.a(r4)     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.n5 r3 = r2.s()     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = r8.v()     // Catch:{ all -> 0x1070 }
            boolean r3 = r3.b(r4)     // Catch:{ all -> 0x1070 }
            if (r3 == 0) goto L_0x0af6
            i.c.a.b.i.a.d r3 = r2.r()     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = r8.v()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.c5 r3 = r3.b(r4)     // Catch:{ all -> 0x1070 }
            if (r3 == 0) goto L_0x0af6
            boolean r3 = r3.c()     // Catch:{ all -> 0x1070 }
            if (r3 == 0) goto L_0x0af6
            i.c.a.b.i.a.g r3 = r2.d()     // Catch:{ all -> 0x1070 }
            boolean r3 = r3.w()     // Catch:{ all -> 0x1070 }
            if (r3 == 0) goto L_0x0af6
            i.c.a.b.i.a.m4 r3 = r2.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r3 = r3.y()     // Catch:{ all -> 0x1070 }
            java.lang.String r4 = "Turning off ad personalization due to account type"
            r3.a(r4)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.x0$a r3 = i.c.a.b.g.g.x0.l()     // Catch:{ all -> 0x1070 }
            r4 = r28
            r3.a((java.lang.String) r4)     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.g r2 = r2.d()     // Catch:{ all -> 0x1070 }
            long r5 = r2.v()     // Catch:{ all -> 0x1070 }
            r3.a((long) r5)     // Catch:{ all -> 0x1070 }
            r5 = 1
            r3.b(r5)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r2 = r3.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r2 = (i.c.a.b.g.g.w3) r2     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.x0 r2 = (i.c.a.b.g.g.x0) r2     // Catch:{ all -> 0x1070 }
            r3 = 0
        L_0x0ad4:
            int r5 = r8.q()     // Catch:{ all -> 0x1070 }
            if (r3 >= r5) goto L_0x0af0
            i.c.a.b.g.g.x0 r5 = r8.c((int) r3)     // Catch:{ all -> 0x1070 }
            java.lang.String r5 = r5.k()     // Catch:{ all -> 0x1070 }
            boolean r5 = r4.equals(r5)     // Catch:{ all -> 0x1070 }
            if (r5 == 0) goto L_0x0aed
            r8.a((int) r3, (i.c.a.b.g.g.x0) r2)     // Catch:{ all -> 0x1070 }
            r3 = 1
            goto L_0x0af1
        L_0x0aed:
            int r3 = r3 + 1
            goto L_0x0ad4
        L_0x0af0:
            r3 = 0
        L_0x0af1:
            if (r3 != 0) goto L_0x0af6
            r8.a((i.c.a.b.g.g.x0) r2)     // Catch:{ all -> 0x1070 }
        L_0x0af6:
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r2 = r2.g()     // Catch:{ all -> 0x1070 }
            java.lang.String r3 = r8.v()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r4 = i.c.a.b.i.a.o.H0     // Catch:{ all -> 0x1070 }
            boolean r2 = r2.e(r3, r4)     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x0b0b
            a((i.c.a.b.g.g.t0.a) r8)     // Catch:{ all -> 0x1070 }
        L_0x0b0b:
            r8.y()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.fa r9 = r55.e()     // Catch:{ all -> 0x1070 }
            java.lang.String r10 = r8.v()     // Catch:{ all -> 0x1070 }
            java.util.List r11 = r8.a()     // Catch:{ all -> 0x1070 }
            java.util.List r12 = r8.p()     // Catch:{ all -> 0x1070 }
            long r2 = r8.r()     // Catch:{ all -> 0x1070 }
            java.lang.Long r13 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x1070 }
            long r2 = r8.s()     // Catch:{ all -> 0x1070 }
            java.lang.Long r14 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x1070 }
            java.util.List r2 = r9.a(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x1070 }
            r8.b((java.lang.Iterable<? extends i.c.a.b.g.g.n0>) r2)     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r2 = r2.g()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r3 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r3 = r3.n()     // Catch:{ all -> 0x1070 }
            boolean r2 = r2.d(r3)     // Catch:{ all -> 0x1070 }
            if (r2 == 0) goto L_0x0eb1
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x1070 }
            r2.<init>()     // Catch:{ all -> 0x1070 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x1070 }
            r3.<init>()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.ca r4 = r4.p()     // Catch:{ all -> 0x1070 }
            java.security.SecureRandom r4 = r4.u()     // Catch:{ all -> 0x1070 }
            r5 = 0
        L_0x0b5c:
            int r6 = r8.l()     // Catch:{ all -> 0x1070 }
            if (r5 >= r6) goto L_0x0e7c
            i.c.a.b.g.g.p0 r6 = r8.a((int) r5)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3$b r6 = r6.j()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0$a r6 = (i.c.a.b.g.g.p0.a) r6     // Catch:{ all -> 0x1070 }
            java.lang.String r9 = r6.n()     // Catch:{ all -> 0x1070 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x1070 }
            java.lang.String r10 = "_sr"
            java.lang.String r11 = "_efs"
            if (r9 == 0) goto L_0x0beb
            i.c.a.b.i.a.x9 r9 = r55.f()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r12 = r6.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r12 = (i.c.a.b.g.g.w3) r12     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r12 = (i.c.a.b.g.g.p0) r12     // Catch:{ all -> 0x1070 }
            java.lang.String r13 = "_en"
            java.lang.Object r9 = r9.a((i.c.a.b.g.g.p0) r12, (java.lang.String) r13)     // Catch:{ all -> 0x1070 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x1070 }
            java.lang.Object r12 = r2.get(r9)     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.i r12 = (i.c.a.b.i.a.i) r12     // Catch:{ all -> 0x1070 }
            if (r12 != 0) goto L_0x0ba9
            i.c.a.b.i.a.d r12 = r55.d()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r13 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r13 = r13.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.i r12 = r12.a((java.lang.String) r13, (java.lang.String) r9)     // Catch:{ all -> 0x1070 }
            r2.put(r9, r12)     // Catch:{ all -> 0x1070 }
        L_0x0ba9:
            java.lang.Long r9 = r12.f3706i     // Catch:{ all -> 0x1070 }
            if (r9 != 0) goto L_0x0be6
            java.lang.Long r9 = r12.f3707j     // Catch:{ all -> 0x1070 }
            long r13 = r9.longValue()     // Catch:{ all -> 0x1070 }
            r15 = 1
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x0bc2
            i.c.a.b.i.a.x9 r9 = r55.f()     // Catch:{ all -> 0x1070 }
            java.lang.Long r13 = r12.f3707j     // Catch:{ all -> 0x1070 }
            r9.a((i.c.a.b.g.g.p0.a) r6, (java.lang.String) r10, (java.lang.Object) r13)     // Catch:{ all -> 0x1070 }
        L_0x0bc2:
            java.lang.Boolean r9 = r12.f3708k     // Catch:{ all -> 0x1070 }
            if (r9 == 0) goto L_0x0bdb
            java.lang.Boolean r9 = r12.f3708k     // Catch:{ all -> 0x1070 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x1070 }
            if (r9 == 0) goto L_0x0bdb
            i.c.a.b.i.a.x9 r9 = r55.f()     // Catch:{ all -> 0x1070 }
            r12 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x1070 }
            r9.a((i.c.a.b.g.g.p0.a) r6, (java.lang.String) r11, (java.lang.Object) r10)     // Catch:{ all -> 0x1070 }
        L_0x0bdb:
            i.c.a.b.g.g.f5 r9 = r6.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r9 = (i.c.a.b.g.g.w3) r9     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r9 = (i.c.a.b.g.g.p0) r9     // Catch:{ all -> 0x1070 }
            r3.add(r9)     // Catch:{ all -> 0x1070 }
        L_0x0be6:
            r8.a((int) r5, (i.c.a.b.g.g.p0.a) r6)     // Catch:{ all -> 0x1070 }
            goto L_0x0d93
        L_0x0beb:
            i.c.a.b.i.a.n5 r9 = r55.b()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r12 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r12 = r12.n()     // Catch:{ all -> 0x1070 }
            long r12 = r9.c(r12)     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.s5 r9 = r1.f3896i     // Catch:{ all -> 0x1070 }
            r9.p()     // Catch:{ all -> 0x1070 }
            long r14 = r6.p()     // Catch:{ all -> 0x1070 }
            long r14 = i.c.a.b.i.a.ca.a((long) r14, (long) r12)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r9 = r6.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r9 = (i.c.a.b.g.g.w3) r9     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r9 = (i.c.a.b.g.g.p0) r9     // Catch:{ all -> 0x1070 }
            r16 = r11
            java.lang.String r11 = "_dbg"
            r22 = r12
            r18 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x1070 }
            boolean r13 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x1070 }
            if (r13 != 0) goto L_0x0c76
            if (r12 != 0) goto L_0x0c23
            goto L_0x0c76
        L_0x0c23:
            java.util.List r9 = r9.a()     // Catch:{ all -> 0x1070 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x1070 }
        L_0x0c2b:
            boolean r13 = r9.hasNext()     // Catch:{ all -> 0x1070 }
            if (r13 == 0) goto L_0x0c76
            java.lang.Object r13 = r9.next()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.r0 r13 = (i.c.a.b.g.g.r0) r13     // Catch:{ all -> 0x1070 }
            r18 = r9
            java.lang.String r9 = r13.k()     // Catch:{ all -> 0x1070 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x1070 }
            if (r9 == 0) goto L_0x0c73
            long r18 = r13.o()     // Catch:{ all -> 0x1070 }
            java.lang.Long r9 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x1070 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x1070 }
            if (r9 != 0) goto L_0x0c71
            boolean r9 = r12 instanceof java.lang.String     // Catch:{ all -> 0x1070 }
            if (r9 == 0) goto L_0x0c5f
            java.lang.String r9 = r13.m()     // Catch:{ all -> 0x1070 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x1070 }
            if (r9 != 0) goto L_0x0c71
        L_0x0c5f:
            boolean r9 = r12 instanceof java.lang.Double     // Catch:{ all -> 0x1070 }
            if (r9 == 0) goto L_0x0c76
            double r18 = r13.q()     // Catch:{ all -> 0x1070 }
            java.lang.Double r9 = java.lang.Double.valueOf(r18)     // Catch:{ all -> 0x1070 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x1070 }
            if (r9 == 0) goto L_0x0c76
        L_0x0c71:
            r9 = 1
            goto L_0x0c77
        L_0x0c73:
            r9 = r18
            goto L_0x0c2b
        L_0x0c76:
            r9 = 0
        L_0x0c77:
            if (r9 != 0) goto L_0x0c8c
            i.c.a.b.i.a.n5 r9 = r55.b()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r11 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r11 = r11.n()     // Catch:{ all -> 0x1070 }
            java.lang.String r12 = r6.n()     // Catch:{ all -> 0x1070 }
            int r9 = r9.d(r11, r12)     // Catch:{ all -> 0x1070 }
            goto L_0x0c8d
        L_0x0c8c:
            r9 = 1
        L_0x0c8d:
            if (r9 > 0) goto L_0x0cb6
            i.c.a.b.i.a.s5 r10 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r10 = r10.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r10 = r10.w()     // Catch:{ all -> 0x1070 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r6.n()     // Catch:{ all -> 0x1070 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x1070 }
            r10.a(r11, r12, r9)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r9 = r6.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r9 = (i.c.a.b.g.g.w3) r9     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r9 = (i.c.a.b.g.g.p0) r9     // Catch:{ all -> 0x1070 }
            r3.add(r9)     // Catch:{ all -> 0x1070 }
            r8.a((int) r5, (i.c.a.b.g.g.p0.a) r6)     // Catch:{ all -> 0x1070 }
            goto L_0x0d93
        L_0x0cb6:
            java.lang.String r11 = r6.n()     // Catch:{ all -> 0x1070 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.i r11 = (i.c.a.b.i.a.i) r11     // Catch:{ all -> 0x1070 }
            if (r11 != 0) goto L_0x0d45
            i.c.a.b.i.a.d r11 = r55.d()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r12 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r12 = r12.n()     // Catch:{ all -> 0x1070 }
            java.lang.String r13 = r6.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.i r11 = r11.a((java.lang.String) r12, (java.lang.String) r13)     // Catch:{ all -> 0x1070 }
            if (r11 != 0) goto L_0x0d45
            i.c.a.b.i.a.s5 r11 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r11 = r11.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r11 = r11.w()     // Catch:{ all -> 0x1070 }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            i.c.a.b.g.g.t0 r13 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r13 = r13.n()     // Catch:{ all -> 0x1070 }
            r18 = r14
            java.lang.String r14 = r6.n()     // Catch:{ all -> 0x1070 }
            r11.a(r12, r13, r14)     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.s5 r11 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r11 = r11.g()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r12 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r12 = r12.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r13 = i.c.a.b.i.a.o.o0     // Catch:{ all -> 0x1070 }
            boolean r11 = r11.e(r12, r13)     // Catch:{ all -> 0x1070 }
            if (r11 == 0) goto L_0x0d2b
            i.c.a.b.i.a.i r11 = new i.c.a.b.i.a.i     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r12 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r28 = r12.n()     // Catch:{ all -> 0x1070 }
            java.lang.String r29 = r6.n()     // Catch:{ all -> 0x1070 }
            r30 = 1
            r32 = 1
            r34 = 1
            long r36 = r6.p()     // Catch:{ all -> 0x1070 }
            r38 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r27 = r11
            r27.<init>(r28, r29, r30, r32, r34, r36, r38, r40, r41, r42, r43)     // Catch:{ all -> 0x1070 }
            goto L_0x0d47
        L_0x0d2b:
            i.c.a.b.i.a.i r11 = new i.c.a.b.i.a.i     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r12 = r7.a     // Catch:{ all -> 0x1070 }
            java.lang.String r45 = r12.n()     // Catch:{ all -> 0x1070 }
            java.lang.String r46 = r6.n()     // Catch:{ all -> 0x1070 }
            r47 = 1
            r49 = 1
            long r51 = r6.p()     // Catch:{ all -> 0x1070 }
            r44 = r11
            r44.<init>(r45, r46, r47, r49, r51)     // Catch:{ all -> 0x1070 }
            goto L_0x0d47
        L_0x0d45:
            r18 = r14
        L_0x0d47:
            i.c.a.b.i.a.x9 r12 = r55.f()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r13 = r6.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r13 = (i.c.a.b.g.g.w3) r13     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r13 = (i.c.a.b.g.g.p0) r13     // Catch:{ all -> 0x1070 }
            java.lang.String r14 = "_eid"
            java.lang.Object r12 = r12.a((i.c.a.b.g.g.p0) r13, (java.lang.String) r14)     // Catch:{ all -> 0x1070 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x1070 }
            if (r12 == 0) goto L_0x0d5f
            r13 = 1
            goto L_0x0d60
        L_0x0d5f:
            r13 = 0
        L_0x0d60:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x1070 }
            r14 = 1
            if (r9 != r14) goto L_0x0d9a
            i.c.a.b.g.g.f5 r9 = r6.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r9 = (i.c.a.b.g.g.w3) r9     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r9 = (i.c.a.b.g.g.p0) r9     // Catch:{ all -> 0x1070 }
            r3.add(r9)     // Catch:{ all -> 0x1070 }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x1070 }
            if (r9 == 0) goto L_0x0d90
            java.lang.Long r9 = r11.f3706i     // Catch:{ all -> 0x1070 }
            if (r9 != 0) goto L_0x0d84
            java.lang.Long r9 = r11.f3707j     // Catch:{ all -> 0x1070 }
            if (r9 != 0) goto L_0x0d84
            java.lang.Boolean r9 = r11.f3708k     // Catch:{ all -> 0x1070 }
            if (r9 == 0) goto L_0x0d90
        L_0x0d84:
            r9 = 0
            i.c.a.b.i.a.i r10 = r11.a(r9, r9, r9)     // Catch:{ all -> 0x1070 }
            java.lang.String r9 = r6.n()     // Catch:{ all -> 0x1070 }
            r2.put(r9, r10)     // Catch:{ all -> 0x1070 }
        L_0x0d90:
            r8.a((int) r5, (i.c.a.b.g.g.p0.a) r6)     // Catch:{ all -> 0x1070 }
        L_0x0d93:
            r18 = r4
            r20 = r7
            r4 = r8
            goto L_0x0e73
        L_0x0d9a:
            int r14 = r4.nextInt(r9)     // Catch:{ all -> 0x1070 }
            if (r14 != 0) goto L_0x0dde
            i.c.a.b.i.a.x9 r12 = r55.f()     // Catch:{ all -> 0x1070 }
            long r14 = (long) r9     // Catch:{ all -> 0x1070 }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x1070 }
            r12.a((i.c.a.b.g.g.p0.a) r6, (java.lang.String) r10, (java.lang.Object) r9)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r9 = r6.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r9 = (i.c.a.b.g.g.w3) r9     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r9 = (i.c.a.b.g.g.p0) r9     // Catch:{ all -> 0x1070 }
            r3.add(r9)     // Catch:{ all -> 0x1070 }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x1070 }
            if (r9 == 0) goto L_0x0dc6
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x1070 }
            r10 = 0
            i.c.a.b.i.a.i r11 = r11.a(r10, r9, r10)     // Catch:{ all -> 0x1070 }
        L_0x0dc6:
            java.lang.String r9 = r6.n()     // Catch:{ all -> 0x1070 }
            long r12 = r6.p()     // Catch:{ all -> 0x1070 }
            r14 = r18
            i.c.a.b.i.a.i r10 = r11.a(r12, r14)     // Catch:{ all -> 0x1070 }
            r2.put(r9, r10)     // Catch:{ all -> 0x1070 }
            r18 = r4
            r20 = r7
            r4 = r8
            goto L_0x0e70
        L_0x0dde:
            r14 = r18
            r18 = r4
            java.lang.Long r4 = r11.f3705h     // Catch:{ all -> 0x1070 }
            if (r4 == 0) goto L_0x0df7
            java.lang.Long r4 = r11.f3705h     // Catch:{ all -> 0x1070 }
            long r19 = r4.longValue()     // Catch:{ all -> 0x1070 }
            r35 = r8
            r53 = r19
            r19 = r5
            r20 = r7
            r4 = r53
            goto L_0x0e0c
        L_0x0df7:
            i.c.a.b.i.a.s5 r4 = r1.f3896i     // Catch:{ all -> 0x1070 }
            r4.p()     // Catch:{ all -> 0x1070 }
            r19 = r5
            long r4 = r6.q()     // Catch:{ all -> 0x1070 }
            r20 = r7
            r35 = r8
            r7 = r22
            long r4 = i.c.a.b.i.a.ca.a((long) r4, (long) r7)     // Catch:{ all -> 0x1070 }
        L_0x0e0c:
            int r7 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x0e5a
            i.c.a.b.i.a.x9 r4 = r55.f()     // Catch:{ all -> 0x1070 }
            r7 = 1
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x1070 }
            r12 = r16
            r4.a((i.c.a.b.g.g.p0.a) r6, (java.lang.String) r12, (java.lang.Object) r5)     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.x9 r4 = r55.f()     // Catch:{ all -> 0x1070 }
            long r7 = (long) r9     // Catch:{ all -> 0x1070 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x1070 }
            r4.a((i.c.a.b.g.g.p0.a) r6, (java.lang.String) r10, (java.lang.Object) r5)     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r4 = r6.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r4 = (i.c.a.b.g.g.w3) r4     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.p0 r4 = (i.c.a.b.g.g.p0) r4     // Catch:{ all -> 0x1070 }
            r3.add(r4)     // Catch:{ all -> 0x1070 }
            boolean r4 = r13.booleanValue()     // Catch:{ all -> 0x1070 }
            if (r4 == 0) goto L_0x0e4a
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x1070 }
            r5 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x1070 }
            r5 = 0
            i.c.a.b.i.a.i r11 = r11.a(r5, r4, r7)     // Catch:{ all -> 0x1070 }
        L_0x0e4a:
            java.lang.String r4 = r6.n()     // Catch:{ all -> 0x1070 }
            long r7 = r6.p()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.i r5 = r11.a(r7, r14)     // Catch:{ all -> 0x1070 }
            r2.put(r4, r5)     // Catch:{ all -> 0x1070 }
            goto L_0x0e6c
        L_0x0e5a:
            boolean r4 = r13.booleanValue()     // Catch:{ all -> 0x1070 }
            if (r4 == 0) goto L_0x0e6c
            java.lang.String r4 = r6.n()     // Catch:{ all -> 0x1070 }
            r5 = 0
            i.c.a.b.i.a.i r7 = r11.a(r12, r5, r5)     // Catch:{ all -> 0x1070 }
            r2.put(r4, r7)     // Catch:{ all -> 0x1070 }
        L_0x0e6c:
            r5 = r19
            r4 = r35
        L_0x0e70:
            r4.a((int) r5, (i.c.a.b.g.g.p0.a) r6)     // Catch:{ all -> 0x1070 }
        L_0x0e73:
            int r5 = r5 + 1
            r8 = r4
            r4 = r18
            r7 = r20
            goto L_0x0b5c
        L_0x0e7c:
            r20 = r7
            r4 = r8
            int r5 = r3.size()     // Catch:{ all -> 0x1070 }
            int r6 = r4.l()     // Catch:{ all -> 0x1070 }
            if (r5 >= r6) goto L_0x0e8f
            r4.n()     // Catch:{ all -> 0x1070 }
            r4.a((java.lang.Iterable<? extends i.c.a.b.g.g.p0>) r3)     // Catch:{ all -> 0x1070 }
        L_0x0e8f:
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x1070 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x1070 }
        L_0x0e97:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x1070 }
            if (r3 == 0) goto L_0x0eb4
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x1070 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.d r5 = r55.d()     // Catch:{ all -> 0x1070 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.i r3 = (i.c.a.b.i.a.i) r3     // Catch:{ all -> 0x1070 }
            r5.a((i.c.a.b.i.a.i) r3)     // Catch:{ all -> 0x1070 }
            goto L_0x0e97
        L_0x0eb1:
            r20 = r7
            r4 = r8
        L_0x0eb4:
            i.c.a.b.i.a.s5 r2 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.pa r2 = r2.g()     // Catch:{ all -> 0x1070 }
            java.lang.String r3 = r4.v()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.f4<java.lang.Boolean> r5 = i.c.a.b.i.a.o.H0     // Catch:{ all -> 0x1070 }
            boolean r2 = r2.e(r3, r5)     // Catch:{ all -> 0x1070 }
            if (r2 != 0) goto L_0x0ec9
            a((i.c.a.b.g.g.t0.a) r4)     // Catch:{ all -> 0x1070 }
        L_0x0ec9:
            r2 = r20
            i.c.a.b.g.g.t0 r3 = r2.a     // Catch:{ all -> 0x1070 }
            java.lang.String r3 = r3.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.d r5 = r55.d()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.c5 r5 = r5.b(r3)     // Catch:{ all -> 0x1070 }
            if (r5 != 0) goto L_0x0ef5
            i.c.a.b.i.a.s5 r5 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r5 = r5.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r5 = r5.u()     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            i.c.a.b.g.g.t0 r7 = r2.a     // Catch:{ all -> 0x1070 }
            java.lang.String r7 = r7.n()     // Catch:{ all -> 0x1070 }
            java.lang.Object r7 = i.c.a.b.i.a.m4.a((java.lang.String) r7)     // Catch:{ all -> 0x1070 }
            r5.a(r6, r7)     // Catch:{ all -> 0x1070 }
            goto L_0x0f50
        L_0x0ef5:
            int r6 = r4.l()     // Catch:{ all -> 0x1070 }
            if (r6 <= 0) goto L_0x0f50
            long r6 = r5.o()     // Catch:{ all -> 0x1070 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0f09
            r4.e((long) r6)     // Catch:{ all -> 0x1070 }
            goto L_0x0f0c
        L_0x0f09:
            r4.u()     // Catch:{ all -> 0x1070 }
        L_0x0f0c:
            long r8 = r5.n()     // Catch:{ all -> 0x1070 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0f17
            goto L_0x0f18
        L_0x0f17:
            r6 = r8
        L_0x0f18:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0f20
            r4.d((long) r6)     // Catch:{ all -> 0x1070 }
            goto L_0x0f23
        L_0x0f20:
            r4.t()     // Catch:{ all -> 0x1070 }
        L_0x0f23:
            r5.z()     // Catch:{ all -> 0x1070 }
            long r6 = r5.w()     // Catch:{ all -> 0x1070 }
            int r7 = (int) r6     // Catch:{ all -> 0x1070 }
            r4.f((int) r7)     // Catch:{ all -> 0x1070 }
            long r6 = r4.r()     // Catch:{ all -> 0x1070 }
            r5.a((long) r6)     // Catch:{ all -> 0x1070 }
            long r6 = r4.s()     // Catch:{ all -> 0x1070 }
            r5.b((long) r6)     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = r5.a()     // Catch:{ all -> 0x1070 }
            if (r6 == 0) goto L_0x0f46
            r4.j((java.lang.String) r6)     // Catch:{ all -> 0x1070 }
            goto L_0x0f49
        L_0x0f46:
            r4.w()     // Catch:{ all -> 0x1070 }
        L_0x0f49:
            i.c.a.b.i.a.d r6 = r55.d()     // Catch:{ all -> 0x1070 }
            r6.a((i.c.a.b.i.a.c5) r5)     // Catch:{ all -> 0x1070 }
        L_0x0f50:
            int r5 = r4.l()     // Catch:{ all -> 0x1070 }
            if (r5 <= 0) goto L_0x0fb6
            i.c.a.b.i.a.s5 r5 = r1.f3896i     // Catch:{ all -> 0x1070 }
            r5.j()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.n5 r5 = r55.b()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r6 = r2.a     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = r6.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.j0 r5 = r5.a((java.lang.String) r6)     // Catch:{ all -> 0x1070 }
            if (r5 == 0) goto L_0x0f7a
            boolean r6 = r5.a()     // Catch:{ all -> 0x1070 }
            if (r6 != 0) goto L_0x0f72
            goto L_0x0f7a
        L_0x0f72:
            long r5 = r5.k()     // Catch:{ all -> 0x1070 }
            r4.i((long) r5)     // Catch:{ all -> 0x1070 }
            goto L_0x0fa5
        L_0x0f7a:
            i.c.a.b.g.g.t0 r5 = r2.a     // Catch:{ all -> 0x1070 }
            java.lang.String r5 = r5.k()     // Catch:{ all -> 0x1070 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x1070 }
            if (r5 == 0) goto L_0x0f8c
            r5 = -1
            r4.i((long) r5)     // Catch:{ all -> 0x1070 }
            goto L_0x0fa5
        L_0x0f8c:
            i.c.a.b.i.a.s5 r5 = r1.f3896i     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.m4 r5 = r5.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r5 = r5.w()     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            i.c.a.b.g.g.t0 r7 = r2.a     // Catch:{ all -> 0x1070 }
            java.lang.String r7 = r7.n()     // Catch:{ all -> 0x1070 }
            java.lang.Object r7 = i.c.a.b.i.a.m4.a((java.lang.String) r7)     // Catch:{ all -> 0x1070 }
            r5.a(r6, r7)     // Catch:{ all -> 0x1070 }
        L_0x0fa5:
            i.c.a.b.i.a.d r5 = r55.d()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.f5 r4 = r4.k()     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.w3 r4 = (i.c.a.b.g.g.w3) r4     // Catch:{ all -> 0x1070 }
            i.c.a.b.g.g.t0 r4 = (i.c.a.b.g.g.t0) r4     // Catch:{ all -> 0x1070 }
            r10 = r21
            r5.a((i.c.a.b.g.g.t0) r4, (boolean) r10)     // Catch:{ all -> 0x1070 }
        L_0x0fb6:
            i.c.a.b.i.a.d r4 = r55.d()     // Catch:{ all -> 0x1070 }
            java.util.List<java.lang.Long> r2 = r2.f3905b     // Catch:{ all -> 0x1070 }
            i.c.a.b.d.l.q.a(r2)     // Catch:{ all -> 0x1070 }
            r4.c()     // Catch:{ all -> 0x1070 }
            r4.m()     // Catch:{ all -> 0x1070 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x1070 }
            r6 = 0
        L_0x0fcd:
            int r7 = r2.size()     // Catch:{ all -> 0x1070 }
            if (r6 >= r7) goto L_0x0fea
            if (r6 == 0) goto L_0x0fda
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x1070 }
        L_0x0fda:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x1070 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x1070 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x1070 }
            r5.append(r7)     // Catch:{ all -> 0x1070 }
            int r6 = r6 + 1
            goto L_0x0fcd
        L_0x0fea:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x1070 }
            android.database.sqlite.SQLiteDatabase r6 = r4.u()     // Catch:{ all -> 0x1070 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x1070 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x1070 }
            int r6 = r2.size()     // Catch:{ all -> 0x1070 }
            if (r5 == r6) goto L_0x101d
            i.c.a.b.i.a.m4 r4 = r4.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r4 = r4.u()     // Catch:{ all -> 0x1070 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x1070 }
            int r2 = r2.size()     // Catch:{ all -> 0x1070 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1070 }
            r4.a(r6, r5, r2)     // Catch:{ all -> 0x1070 }
        L_0x101d:
            i.c.a.b.i.a.d r2 = r55.d()     // Catch:{ all -> 0x1070 }
            android.database.sqlite.SQLiteDatabase r4 = r2.u()     // Catch:{ all -> 0x1070 }
            java.lang.String r5 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x1034 }
            r7 = 0
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x1034 }
            r7 = 1
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x1034 }
            r4.execSQL(r5, r6)     // Catch:{ SQLiteException -> 0x1034 }
            goto L_0x1047
        L_0x1034:
            r0 = move-exception
            r4 = r0
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.o4 r2 = r2.u()     // Catch:{ all -> 0x1070 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = i.c.a.b.i.a.m4.a((java.lang.String) r3)     // Catch:{ all -> 0x1070 }
            r2.a(r5, r3, r4)     // Catch:{ all -> 0x1070 }
        L_0x1047:
            i.c.a.b.i.a.d r2 = r55.d()     // Catch:{ all -> 0x1070 }
            r2.t()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.d r2 = r55.d()
            r2.z()
            r2 = 1
            return r2
        L_0x1057:
            i.c.a.b.i.a.d r2 = r55.d()     // Catch:{ all -> 0x1070 }
            r2.t()     // Catch:{ all -> 0x1070 }
            i.c.a.b.i.a.d r2 = r55.d()
            r2.z()
            r2 = 0
            return r2
        L_0x1067:
            r0 = move-exception
            r8 = r2
        L_0x1069:
            r2 = r0
        L_0x106a:
            if (r8 == 0) goto L_0x106f
            r8.close()     // Catch:{ all -> 0x1070 }
        L_0x106f:
            throw r2     // Catch:{ all -> 0x1070 }
        L_0x1070:
            r0 = move-exception
            r2 = r0
            i.c.a.b.i.a.d r3 = r55.d()
            r3.z()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.t9.a(long):boolean");
    }

    public final void b(p0.a aVar, p0.a aVar2) {
        q.a("_e".equals(aVar.n()));
        f();
        r0 b2 = x9.b((p0) ((w3) aVar.k()), "_et");
        if (b2.n()) {
            long j2 = b2.zzf;
            if (j2 > 0) {
                f();
                r0 b3 = x9.b((p0) ((w3) aVar2.k()), "_et");
                if (b3 != null) {
                    long j3 = b3.zzf;
                    if (j3 > 0) {
                        j2 += j3;
                    }
                }
                f().a(aVar2, "_et", (Object) Long.valueOf(j2));
                f().a(aVar, "_fr", (Object) 1L);
            }
        }
    }

    public final Boolean b(c5 c5Var) {
        try {
            if (c5Var.q() != -2147483648L) {
                if (c5Var.q() == ((long) i.c.a.b.d.p.c.b(this.f3896i.a).b(c5Var.g(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = i.c.a.b.d.p.c.b(this.f3896i.a).b(c5Var.g(), 0).versionName;
                if (c5Var.p() != null && c5Var.p().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void b(aa aaVar, ea eaVar) {
        r();
        i();
        if (c(eaVar)) {
            if (!eaVar.f3655l) {
                b(eaVar);
            } else if (!this.f3896i.f3861g.d(eaVar.e, o.e0)) {
                this.f3896i.n().f3765m.a("Removing user property", this.f3896i.q().c(aaVar.f3586f));
                d().y();
                try {
                    b(eaVar);
                    d().b(eaVar.e, aaVar.f3586f);
                    d().t();
                    this.f3896i.n().f3765m.a("User property removed", this.f3896i.q().c(aaVar.f3586f));
                } finally {
                    d().z();
                }
            } else if (!"_npa".equals(aaVar.f3586f) || eaVar.w == null) {
                this.f3896i.n().f3765m.a("Removing user property", this.f3896i.q().c(aaVar.f3586f));
                d().y();
                try {
                    b(eaVar);
                    d().b(eaVar.e, aaVar.f3586f);
                    d().t();
                    this.f3896i.n().f3765m.a("User property removed", this.f3896i.q().c(aaVar.f3586f));
                } finally {
                    d().z();
                }
            } else {
                this.f3896i.n().f3765m.a("Falling back to manifest metadata value for ad personalization");
                if (((c) this.f3896i.f3868n) != null) {
                    a(new aa("_npa", System.currentTimeMillis(), Long.valueOf(eaVar.w.booleanValue() ? 1 : 0), "auto"), eaVar);
                    return;
                }
                throw null;
            }
        }
    }

    public final void b(na naVar, ea eaVar) {
        q.a(naVar);
        q.b(naVar.e);
        q.a(naVar.f3792g);
        q.b(naVar.f3792g.f3586f);
        r();
        i();
        if (c(eaVar)) {
            if (!eaVar.f3655l) {
                b(eaVar);
                return;
            }
            d().y();
            try {
                b(eaVar);
                na d2 = d().d(naVar.e, naVar.f3792g.f3586f);
                if (d2 != null) {
                    this.f3896i.n().f3765m.a("Removing conditional user property", naVar.e, this.f3896i.q().c(naVar.f3792g.f3586f));
                    d().e(naVar.e, naVar.f3792g.f3586f);
                    if (d2.f3794i) {
                        d().b(naVar.e, naVar.f3792g.f3586f);
                    }
                    if (naVar.f3800o != null) {
                        Bundle bundle = null;
                        if (naVar.f3800o.f3755f != null) {
                            bundle = naVar.f3800o.f3755f.b();
                        }
                        Bundle bundle2 = bundle;
                        b(this.f3896i.p().a(naVar.e, naVar.f3800o.e, bundle2, d2.f3791f, naVar.f3800o.f3757h), eaVar);
                    }
                } else {
                    this.f3896i.n().f3761i.a("Conditional user property doesn't exist", m4.a(naVar.e), this.f3896i.q().c(naVar.f3792g.f3586f));
                }
                d().t();
            } finally {
                d().z();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0241  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.c.a.b.i.a.c5 b(i.c.a.b.i.a.ea r11) {
        /*
            r10 = this;
            r10.r()
            r10.i()
            i.c.a.b.d.l.q.a(r11)
            java.lang.String r0 = r11.e
            i.c.a.b.d.l.q.b((java.lang.String) r0)
            i.c.a.b.i.a.d r0 = r10.d()
            java.lang.String r1 = r11.e
            i.c.a.b.i.a.c5 r0 = r0.b(r1)
            i.c.a.b.i.a.s5 r1 = r10.f3896i
            i.c.a.b.i.a.x4 r1 = r1.i()
            java.lang.String r2 = r11.e
            java.lang.String r1 = r1.b(r2)
            i.c.a.b.g.g.e9 r2 = i.c.a.b.g.g.e9.f3261f
            java.lang.Object r2 = r2.a()
            i.c.a.b.g.g.h9 r2 = (i.c.a.b.g.g.h9) r2
            boolean r2 = r2.a()
            r3 = 0
            if (r2 == 0) goto L_0x0129
            i.c.a.b.i.a.s5 r2 = r10.f3896i
            i.c.a.b.i.a.pa r2 = r2.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r5 = i.c.a.b.i.a.o.Q0
            boolean r2 = r2.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r5)
            if (r2 == 0) goto L_0x0129
            if (r0 != 0) goto L_0x005c
            i.c.a.b.i.a.c5 r0 = new i.c.a.b.i.a.c5
            i.c.a.b.i.a.s5 r2 = r10.f3896i
            java.lang.String r5 = r11.e
            r0.<init>(r2, r5)
            i.c.a.b.i.a.s5 r2 = r10.f3896i
            i.c.a.b.i.a.ca r2 = r2.p()
            java.lang.String r2 = r2.w()
            r0.a((java.lang.String) r2)
            r0.e((java.lang.String) r1)
            goto L_0x0076
        L_0x005c:
            java.lang.String r2 = r0.l()
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0076
            r0.e((java.lang.String) r1)
            i.c.a.b.i.a.s5 r1 = r10.f3896i
            i.c.a.b.i.a.ca r1 = r1.p()
            java.lang.String r1 = r1.w()
            r0.a((java.lang.String) r1)
        L_0x0076:
            java.lang.String r1 = r11.f3649f
            r0.b((java.lang.String) r1)
            java.lang.String r1 = r11.v
            r0.c((java.lang.String) r1)
            boolean r1 = i.c.a.b.g.g.x9.b()
            if (r1 == 0) goto L_0x009b
            i.c.a.b.i.a.s5 r1 = r10.f3896i
            i.c.a.b.i.a.pa r1 = r1.f3861g
            java.lang.String r2 = r0.g()
            i.c.a.b.i.a.f4<java.lang.Boolean> r5 = i.c.a.b.i.a.o.I0
            boolean r1 = r1.d(r2, r5)
            if (r1 == 0) goto L_0x009b
            java.lang.String r1 = r11.z
            r0.d((java.lang.String) r1)
        L_0x009b:
            java.lang.String r1 = r11.f3658o
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00a8
            java.lang.String r1 = r11.f3658o
            r0.f((java.lang.String) r1)
        L_0x00a8:
            long r1 = r11.f3652i
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b1
            r0.d((long) r1)
        L_0x00b1:
            java.lang.String r1 = r11.f3650g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00be
            java.lang.String r1 = r11.f3650g
            r0.g((java.lang.String) r1)
        L_0x00be:
            long r1 = r11.f3657n
            r0.c((long) r1)
            java.lang.String r1 = r11.f3651h
            if (r1 == 0) goto L_0x00ca
            r0.h((java.lang.String) r1)
        L_0x00ca:
            long r1 = r11.f3653j
            r0.e((long) r1)
            boolean r1 = r11.f3655l
            r0.a((boolean) r1)
            java.lang.String r1 = r11.f3654k
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00e1
            java.lang.String r1 = r11.f3654k
            r0.i((java.lang.String) r1)
        L_0x00e1:
            i.c.a.b.i.a.s5 r1 = r10.f3896i
            i.c.a.b.i.a.pa r1 = r1.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.i1
            boolean r1 = r1.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r2)
            if (r1 != 0) goto L_0x00f2
            long r1 = r11.f3659p
            r0.j(r1)
        L_0x00f2:
            boolean r1 = r11.s
            r0.b((boolean) r1)
            boolean r1 = r11.t
            r0.c((boolean) r1)
            i.c.a.b.i.a.s5 r1 = r10.f3896i
            i.c.a.b.i.a.pa r1 = r1.f3861g
            java.lang.String r2 = r11.e
            i.c.a.b.i.a.f4<java.lang.Boolean> r3 = i.c.a.b.i.a.o.e0
            boolean r1 = r1.d(r2, r3)
            if (r1 == 0) goto L_0x010f
            java.lang.Boolean r1 = r11.w
            r0.a((java.lang.Boolean) r1)
        L_0x010f:
            long r1 = r11.x
            r0.f((long) r1)
            i.c.a.b.i.a.s5 r11 = r0.a
            i.c.a.b.i.a.m5 r11 = r11.k()
            r11.c()
            boolean r11 = r0.E
            if (r11 == 0) goto L_0x0128
            i.c.a.b.i.a.d r11 = r10.d()
            r11.a((i.c.a.b.i.a.c5) r0)
        L_0x0128:
            return r0
        L_0x0129:
            r2 = 1
            if (r0 != 0) goto L_0x0146
            i.c.a.b.i.a.c5 r0 = new i.c.a.b.i.a.c5
            i.c.a.b.i.a.s5 r5 = r10.f3896i
            java.lang.String r6 = r11.e
            r0.<init>(r5, r6)
            i.c.a.b.i.a.s5 r5 = r10.f3896i
            i.c.a.b.i.a.ca r5 = r5.p()
            java.lang.String r5 = r5.w()
            r0.a((java.lang.String) r5)
            r0.e((java.lang.String) r1)
            goto L_0x0160
        L_0x0146:
            java.lang.String r5 = r0.l()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0162
            r0.e((java.lang.String) r1)
            i.c.a.b.i.a.s5 r1 = r10.f3896i
            i.c.a.b.i.a.ca r1 = r1.p()
            java.lang.String r1 = r1.w()
            r0.a((java.lang.String) r1)
        L_0x0160:
            r1 = 1
            goto L_0x0163
        L_0x0162:
            r1 = 0
        L_0x0163:
            java.lang.String r5 = r11.f3649f
            java.lang.String r6 = r0.i()
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 != 0) goto L_0x0175
            java.lang.String r1 = r11.f3649f
            r0.b((java.lang.String) r1)
            r1 = 1
        L_0x0175:
            java.lang.String r5 = r11.v
            java.lang.String r6 = r0.j()
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 != 0) goto L_0x0187
            java.lang.String r1 = r11.v
            r0.c((java.lang.String) r1)
            r1 = 1
        L_0x0187:
            boolean r5 = i.c.a.b.g.g.x9.b()
            if (r5 == 0) goto L_0x01af
            i.c.a.b.i.a.s5 r5 = r10.f3896i
            i.c.a.b.i.a.pa r5 = r5.f3861g
            java.lang.String r6 = r0.g()
            i.c.a.b.i.a.f4<java.lang.Boolean> r7 = i.c.a.b.i.a.o.I0
            boolean r5 = r5.d(r6, r7)
            if (r5 == 0) goto L_0x01af
            java.lang.String r5 = r11.z
            java.lang.String r6 = r0.k()
            boolean r5 = android.text.TextUtils.equals(r5, r6)
            if (r5 != 0) goto L_0x01af
            java.lang.String r1 = r11.z
            r0.d((java.lang.String) r1)
            r1 = 1
        L_0x01af:
            java.lang.String r5 = r11.f3658o
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01c9
            java.lang.String r5 = r11.f3658o
            java.lang.String r6 = r0.m()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x01c9
            java.lang.String r1 = r11.f3658o
            r0.f((java.lang.String) r1)
            r1 = 1
        L_0x01c9:
            long r5 = r11.f3652i
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x01dd
            long r7 = r0.s()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x01dd
            long r5 = r11.f3652i
            r0.d((long) r5)
            r1 = 1
        L_0x01dd:
            java.lang.String r5 = r11.f3650g
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x01f7
            java.lang.String r5 = r11.f3650g
            java.lang.String r6 = r0.p()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x01f7
            java.lang.String r1 = r11.f3650g
            r0.g((java.lang.String) r1)
            r1 = 1
        L_0x01f7:
            long r5 = r11.f3657n
            long r7 = r0.q()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0207
            long r5 = r11.f3657n
            r0.c((long) r5)
            r1 = 1
        L_0x0207:
            java.lang.String r5 = r11.f3651h
            if (r5 == 0) goto L_0x021b
            java.lang.String r6 = r0.r()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x021b
            java.lang.String r1 = r11.f3651h
            r0.h((java.lang.String) r1)
            r1 = 1
        L_0x021b:
            long r5 = r11.f3653j
            long r7 = r0.t()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x022b
            long r5 = r11.f3653j
            r0.e((long) r5)
            r1 = 1
        L_0x022b:
            boolean r5 = r11.f3655l
            boolean r6 = r0.v()
            if (r5 == r6) goto L_0x0239
            boolean r1 = r11.f3655l
            r0.a((boolean) r1)
            r1 = 1
        L_0x0239:
            java.lang.String r5 = r11.f3654k
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x025a
            java.lang.String r5 = r11.f3654k
            i.c.a.b.i.a.s5 r6 = r0.a
            i.c.a.b.i.a.m5 r6 = r6.k()
            r6.c()
            java.lang.String r6 = r0.D
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x025a
            java.lang.String r1 = r11.f3654k
            r0.i((java.lang.String) r1)
            r1 = 1
        L_0x025a:
            i.c.a.b.i.a.s5 r5 = r10.f3896i
            i.c.a.b.i.a.pa r5 = r5.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r6 = i.c.a.b.i.a.o.i1
            boolean r5 = r5.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r6)
            if (r5 != 0) goto L_0x0276
            long r5 = r11.f3659p
            long r7 = r0.b()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0276
            long r5 = r11.f3659p
            r0.j(r5)
            r1 = 1
        L_0x0276:
            boolean r5 = r11.s
            boolean r6 = r0.c()
            if (r5 == r6) goto L_0x0284
            boolean r1 = r11.s
            r0.b((boolean) r1)
            r1 = 1
        L_0x0284:
            boolean r5 = r11.t
            boolean r6 = r0.d()
            if (r5 == r6) goto L_0x0292
            boolean r1 = r11.t
            r0.c((boolean) r1)
            r1 = 1
        L_0x0292:
            i.c.a.b.i.a.s5 r5 = r10.f3896i
            i.c.a.b.i.a.pa r5 = r5.f3861g
            java.lang.String r6 = r11.e
            i.c.a.b.i.a.f4<java.lang.Boolean> r7 = i.c.a.b.i.a.o.e0
            boolean r5 = r5.d(r6, r7)
            if (r5 == 0) goto L_0x02ae
            java.lang.Boolean r5 = r11.w
            java.lang.Boolean r6 = r0.e()
            if (r5 == r6) goto L_0x02ae
            java.lang.Boolean r1 = r11.w
            r0.a((java.lang.Boolean) r1)
            r1 = 1
        L_0x02ae:
            long r5 = r11.x
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x02c2
            long r3 = r0.u()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x02c2
            long r3 = r11.x
            r0.f((long) r3)
            goto L_0x02c3
        L_0x02c2:
            r2 = r1
        L_0x02c3:
            if (r2 == 0) goto L_0x02cc
            i.c.a.b.i.a.d r11 = r10.d()
            r11.a((i.c.a.b.i.a.c5) r0)
        L_0x02cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.t9.b(i.c.a.b.i.a.ea):i.c.a.b.i.a.c5");
    }

    public static void a(t0.a aVar) {
        aVar.b((long) RecyclerView.FOREVER_NS);
        aVar.c(Long.MIN_VALUE);
        for (int i2 = 0; i2 < aVar.l(); i2++) {
            p0 a2 = aVar.a(i2);
            if (a2.zzf < aVar.r()) {
                aVar.b(a2.zzf);
            }
            if (a2.zzf > aVar.s()) {
                aVar.c(a2.zzf);
            }
        }
    }

    public final void a(t0.a aVar, long j2, boolean z) {
        da daVar;
        boolean z2;
        String str = z ? "_se" : "_lte";
        da c2 = d().c(aVar.v(), str);
        if (c2 == null || c2.e == null) {
            String v2 = aVar.v();
            if (((c) this.f3896i.f3868n) != null) {
                daVar = new da(v2, "auto", str, System.currentTimeMillis(), Long.valueOf(j2));
            } else {
                throw null;
            }
        } else {
            String v3 = aVar.v();
            if (((c) this.f3896i.f3868n) != null) {
                daVar = new da(v3, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) c2.e).longValue() + j2));
            } else {
                throw null;
            }
        }
        x0.a l2 = x0.l();
        l2.a(str);
        if (((c) this.f3896i.f3868n) != null) {
            l2.a(System.currentTimeMillis());
            l2.b(((Long) daVar.e).longValue());
            x0 x0Var = (x0) ((w3) l2.k());
            int a2 = x9.a(aVar, str);
            if (a2 >= 0) {
                if (aVar.f3513g) {
                    aVar.i();
                    aVar.f3513g = false;
                }
                t0.a((t0) aVar.f3512f, a2, x0Var);
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (aVar.f3513g) {
                    aVar.i();
                    aVar.f3513g = false;
                }
                t0.a((t0) aVar.f3512f, x0Var);
            }
            if (j2 > 0) {
                d().a(daVar);
                String str2 = z ? "session-scoped" : "lifetime";
                if (!k9.b() || !this.f3896i.f3861g.d(aVar.v(), o.Z0)) {
                    this.f3896i.n().f3765m.a("Updated engagement user property. scope, value", str2, daVar.e);
                } else {
                    this.f3896i.n().f3766n.a("Updated engagement user property. scope, value", str2, daVar.e);
                }
            }
        } else {
            throw null;
        }
    }

    public final boolean a(p0.a aVar, p0.a aVar2) {
        String str;
        q.a("_e".equals(aVar.n()));
        f();
        r0 b2 = x9.b((p0) ((w3) aVar.k()), "_sc");
        String str2 = null;
        if (b2 == null) {
            str = null;
        } else {
            str = b2.zze;
        }
        f();
        r0 b3 = x9.b((p0) ((w3) aVar2.k()), "_pc");
        if (b3 != null) {
            str2 = b3.zze;
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        b(aVar, aVar2);
        return true;
    }

    public static void a(p0.a aVar, String str) {
        List<r0> a2 = aVar.a();
        for (int i2 = 0; i2 < a2.size(); i2++) {
            if (str.equals(a2.get(i2).zzd)) {
                aVar.b(i2);
                return;
            }
        }
    }

    public static void a(p0.a aVar, int i2, String str) {
        List<r0> a2 = aVar.a();
        int i3 = 0;
        while (i3 < a2.size()) {
            if (!"_err".equals(a2.get(i3).zzd)) {
                i3++;
            } else {
                return;
            }
        }
        r0.a s2 = r0.s();
        s2.a("_err");
        s2.a(Long.valueOf((long) i2).longValue());
        r0 r0Var = (r0) ((w3) s2.k());
        r0.a s3 = r0.s();
        s3.a("_ev");
        s3.b(str);
        r0 r0Var2 = (r0) ((w3) s3.k());
        if (aVar.f3513g) {
            aVar.i();
            aVar.f3513g = false;
        }
        p0.a((p0) aVar.f3512f, r0Var);
        if (aVar.f3513g) {
            aVar.i();
            aVar.f3513g = false;
        }
        p0.a((p0) aVar.f3512f, r0Var2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009b, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(i.c.a.b.i.a.c5 r11) {
        /*
            r10 = this;
            r10.r()
            boolean r0 = i.c.a.b.g.g.x9.b()
            if (r0 == 0) goto L_0x0045
            i.c.a.b.i.a.s5 r0 = r10.f3896i
            i.c.a.b.i.a.pa r0 = r0.f3861g
            java.lang.String r1 = r11.g()
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.I0
            boolean r0 = r0.d(r1, r2)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r11.i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r11.k()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r11.j()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r2 = r11.g()
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            r1.a(r2, r3, r4, r5, r6)
            return
        L_0x0045:
            java.lang.String r0 = r11.i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = r11.j()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0067
            java.lang.String r2 = r11.g()
            r3 = 204(0xcc, float:2.86E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            r1.a(r2, r3, r4, r5, r6)
            return
        L_0x0067:
            i.c.a.b.i.a.s5 r0 = r10.f3896i
            i.c.a.b.i.a.pa r0 = r0.f3861g
            r1 = 0
            if (r0 == 0) goto L_0x0184
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            java.lang.String r3 = r11.i()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x00a1
            boolean r3 = i.c.a.b.g.g.x9.b()
            if (r3 == 0) goto L_0x009d
            i.c.a.b.i.a.s5 r3 = r0.a
            i.c.a.b.i.a.pa r3 = r3.f3861g
            java.lang.String r4 = r11.g()
            i.c.a.b.i.a.f4<java.lang.Boolean> r5 = i.c.a.b.i.a.o.I0
            boolean r3 = r3.d(r4, r5)
            if (r3 == 0) goto L_0x009d
            java.lang.String r3 = r11.k()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x00a1
        L_0x009d:
            java.lang.String r3 = r11.j()
        L_0x00a1:
            i.c.a.b.i.a.f4<java.lang.String> r4 = i.c.a.b.i.a.o.e
            java.lang.Object r4 = r4.a(r1)
            java.lang.String r4 = (java.lang.String) r4
            android.net.Uri$Builder r4 = r2.scheme(r4)
            i.c.a.b.i.a.f4<java.lang.String> r5 = i.c.a.b.i.a.o.f3802f
            java.lang.Object r5 = r5.a(r1)
            java.lang.String r5 = (java.lang.String) r5
            android.net.Uri$Builder r4 = r4.encodedAuthority(r5)
            java.lang.String r5 = "config/app/"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L_0x00ca
            java.lang.String r3 = r5.concat(r3)
            goto L_0x00cf
        L_0x00ca:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5)
        L_0x00cf:
            android.net.Uri$Builder r3 = r4.path(r3)
            java.lang.String r4 = r11.h()
            java.lang.String r5 = "app_instance_id"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r5, r4)
            java.lang.String r4 = "platform"
            java.lang.String r5 = "android"
            android.net.Uri$Builder r3 = r3.appendQueryParameter(r4, r5)
            r0.o()
            r4 = 25001(0x61a9, double:1.2352E-319)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "gmp_version"
            r3.appendQueryParameter(r4, r0)
            android.net.Uri r0 = r2.build()
            java.lang.String r0 = r0.toString()
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x016e }
            r5.<init>(r0)     // Catch:{ MalformedURLException -> 0x016e }
            i.c.a.b.i.a.s5 r2 = r10.f3896i     // Catch:{ MalformedURLException -> 0x016e }
            i.c.a.b.i.a.m4 r2 = r2.n()     // Catch:{ MalformedURLException -> 0x016e }
            i.c.a.b.i.a.o4 r2 = r2.f3766n     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r3 = "Fetching remote configuration"
            java.lang.String r4 = r11.g()     // Catch:{ MalformedURLException -> 0x016e }
            r2.a(r3, r4)     // Catch:{ MalformedURLException -> 0x016e }
            i.c.a.b.i.a.n5 r2 = r10.b()     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r3 = r11.g()     // Catch:{ MalformedURLException -> 0x016e }
            i.c.a.b.g.g.j0 r2 = r2.a((java.lang.String) r3)     // Catch:{ MalformedURLException -> 0x016e }
            i.c.a.b.i.a.n5 r3 = r10.b()     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r4 = r11.g()     // Catch:{ MalformedURLException -> 0x016e }
            r3.c()     // Catch:{ MalformedURLException -> 0x016e }
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f3786i     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ MalformedURLException -> 0x016e }
            if (r2 == 0) goto L_0x0142
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ MalformedURLException -> 0x016e }
            if (r2 != 0) goto L_0x0142
            h.e.a r1 = new h.e.a     // Catch:{ MalformedURLException -> 0x016e }
            r1.<init>()     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r2 = "If-Modified-Since"
            r1.put(r2, r3)     // Catch:{ MalformedURLException -> 0x016e }
        L_0x0142:
            r7 = r1
            r1 = 1
            r10.f3903p = r1     // Catch:{ MalformedURLException -> 0x016e }
            i.c.a.b.i.a.s4 r3 = r10.c()     // Catch:{ MalformedURLException -> 0x016e }
            java.lang.String r4 = r11.g()     // Catch:{ MalformedURLException -> 0x016e }
            i.c.a.b.i.a.u9 r8 = new i.c.a.b.i.a.u9     // Catch:{ MalformedURLException -> 0x016e }
            r8.<init>(r10)     // Catch:{ MalformedURLException -> 0x016e }
            r3.c()     // Catch:{ MalformedURLException -> 0x016e }
            r3.m()     // Catch:{ MalformedURLException -> 0x016e }
            i.c.a.b.d.l.q.a(r5)     // Catch:{ MalformedURLException -> 0x016e }
            i.c.a.b.d.l.q.a(r8)     // Catch:{ MalformedURLException -> 0x016e }
            i.c.a.b.i.a.m5 r1 = r3.k()     // Catch:{ MalformedURLException -> 0x016e }
            i.c.a.b.i.a.w4 r9 = new i.c.a.b.i.a.w4     // Catch:{ MalformedURLException -> 0x016e }
            r6 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch:{ MalformedURLException -> 0x016e }
            r1.b(r9)     // Catch:{ MalformedURLException -> 0x016e }
            return
        L_0x016e:
            i.c.a.b.i.a.s5 r1 = r10.f3896i
            i.c.a.b.i.a.m4 r1 = r1.n()
            i.c.a.b.i.a.o4 r1 = r1.f3758f
            java.lang.String r11 = r11.g()
            java.lang.Object r11 = i.c.a.b.i.a.m4.a((java.lang.String) r11)
            java.lang.String r2 = "Failed to parse config URL. Not fetching. appId"
            r1.a(r2, r11, r0)
            return
        L_0x0184:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.t9.a(i.c.a.b.i.a.c5):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0136 A[Catch:{ all -> 0x0196, all -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0195 A[SYNTHETIC, Splitter:B:82:0x0195] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r12) {
        /*
            r7 = this;
            r7.r()
            r7.i()
            i.c.a.b.d.l.q.b((java.lang.String) r8)
            r0 = 0
            if (r11 != 0) goto L_0x000e
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x019f }
        L_0x000e:
            i.c.a.b.i.a.s5 r1 = r7.f3896i     // Catch:{ all -> 0x019f }
            i.c.a.b.i.a.m4 r1 = r1.n()     // Catch:{ all -> 0x019f }
            i.c.a.b.i.a.o4 r1 = r1.f3766n     // Catch:{ all -> 0x019f }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r11.length     // Catch:{ all -> 0x019f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x019f }
            r1.a(r2, r3)     // Catch:{ all -> 0x019f }
            i.c.a.b.i.a.d r1 = r7.d()     // Catch:{ all -> 0x019f }
            r1.y()     // Catch:{ all -> 0x019f }
            i.c.a.b.i.a.d r1 = r7.d()     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.c5 r1 = r1.b(r8)     // Catch:{ all -> 0x0196 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r9 == r2) goto L_0x003c
            r2 = 204(0xcc, float:2.86E-43)
            if (r9 == r2) goto L_0x003c
            if (r9 != r3) goto L_0x0040
        L_0x003c:
            if (r10 != 0) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            if (r1 != 0) goto L_0x0056
            i.c.a.b.i.a.s5 r9 = r7.f3896i     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.m4 r9 = r9.n()     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.o4 r9 = r9.f3761i     // Catch:{ all -> 0x0196 }
            java.lang.String r10 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r8 = i.c.a.b.i.a.m4.a((java.lang.String) r8)     // Catch:{ all -> 0x0196 }
            r9.a(r10, r8)     // Catch:{ all -> 0x0196 }
            goto L_0x0181
        L_0x0056:
            r5 = 404(0x194, float:5.66E-43)
            r6 = 0
            if (r2 != 0) goto L_0x00d5
            if (r9 != r5) goto L_0x005f
            goto L_0x00d5
        L_0x005f:
            i.c.a.b.i.a.s5 r11 = r7.f3896i     // Catch:{ all -> 0x0196 }
            i.c.a.b.d.o.b r11 = r11.f3868n     // Catch:{ all -> 0x0196 }
            i.c.a.b.d.o.c r11 = (i.c.a.b.d.o.c) r11     // Catch:{ all -> 0x0196 }
            if (r11 == 0) goto L_0x00d4
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            r1.i((long) r11)     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.d r11 = r7.d()     // Catch:{ all -> 0x0196 }
            r11.a((i.c.a.b.i.a.c5) r1)     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.s5 r11 = r7.f3896i     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.m4 r11 = r11.n()     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.o4 r11 = r11.f3766n     // Catch:{ all -> 0x0196 }
            java.lang.String r12 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0196 }
            r11.a(r12, r1, r10)     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.n5 r10 = r7.b()     // Catch:{ all -> 0x0196 }
            r10.c()     // Catch:{ all -> 0x0196 }
            java.util.Map<java.lang.String, java.lang.String> r10 = r10.f3786i     // Catch:{ all -> 0x0196 }
            r10.put(r8, r6)     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.s5 r8 = r7.f3896i     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.x4 r8 = r8.i()     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.d5 r8 = r8.f3929f     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.s5 r10 = r7.f3896i     // Catch:{ all -> 0x0196 }
            i.c.a.b.d.o.b r10 = r10.f3868n     // Catch:{ all -> 0x0196 }
            i.c.a.b.d.o.c r10 = (i.c.a.b.d.o.c) r10     // Catch:{ all -> 0x0196 }
            if (r10 == 0) goto L_0x00d3
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            r8.a(r10)     // Catch:{ all -> 0x0196 }
            r8 = 503(0x1f7, float:7.05E-43)
            if (r9 == r8) goto L_0x00b3
            r8 = 429(0x1ad, float:6.01E-43)
            if (r9 != r8) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r4 = 0
        L_0x00b3:
            if (r4 == 0) goto L_0x00ce
            i.c.a.b.i.a.s5 r8 = r7.f3896i     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.x4 r8 = r8.i()     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.d5 r8 = r8.f3930g     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.s5 r9 = r7.f3896i     // Catch:{ all -> 0x0196 }
            i.c.a.b.d.o.b r9 = r9.f3868n     // Catch:{ all -> 0x0196 }
            i.c.a.b.d.o.c r9 = (i.c.a.b.d.o.c) r9     // Catch:{ all -> 0x0196 }
            if (r9 == 0) goto L_0x00cd
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            r8.a(r9)     // Catch:{ all -> 0x0196 }
            goto L_0x00ce
        L_0x00cd:
            throw r6     // Catch:{ all -> 0x0196 }
        L_0x00ce:
            r7.u()     // Catch:{ all -> 0x0196 }
            goto L_0x0181
        L_0x00d3:
            throw r6     // Catch:{ all -> 0x0196 }
        L_0x00d4:
            throw r6     // Catch:{ all -> 0x0196 }
        L_0x00d5:
            if (r12 == 0) goto L_0x00e0
            java.lang.String r10 = "Last-Modified"
            java.lang.Object r10 = r12.get(r10)     // Catch:{ all -> 0x0196 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x0196 }
            goto L_0x00e1
        L_0x00e0:
            r10 = r6
        L_0x00e1:
            if (r10 == 0) goto L_0x00f0
            int r12 = r10.size()     // Catch:{ all -> 0x0196 }
            if (r12 <= 0) goto L_0x00f0
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x0196 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0196 }
            goto L_0x00f1
        L_0x00f0:
            r10 = r6
        L_0x00f1:
            if (r9 == r5) goto L_0x010d
            if (r9 != r3) goto L_0x00f6
            goto L_0x010d
        L_0x00f6:
            i.c.a.b.i.a.n5 r12 = r7.b()     // Catch:{ all -> 0x0196 }
            boolean r10 = r12.a(r8, r11, r10)     // Catch:{ all -> 0x0196 }
            if (r10 != 0) goto L_0x012e
            i.c.a.b.i.a.d r8 = r7.d()     // Catch:{ all -> 0x019f }
            r8.z()     // Catch:{ all -> 0x019f }
            r7.f3903p = r0
            r7.a()
            return
        L_0x010d:
            i.c.a.b.i.a.n5 r10 = r7.b()     // Catch:{ all -> 0x0196 }
            i.c.a.b.g.g.j0 r10 = r10.a((java.lang.String) r8)     // Catch:{ all -> 0x0196 }
            if (r10 != 0) goto L_0x012e
            i.c.a.b.i.a.n5 r10 = r7.b()     // Catch:{ all -> 0x0196 }
            boolean r10 = r10.a(r8, r6, r6)     // Catch:{ all -> 0x0196 }
            if (r10 != 0) goto L_0x012e
            i.c.a.b.i.a.d r8 = r7.d()     // Catch:{ all -> 0x019f }
            r8.z()     // Catch:{ all -> 0x019f }
            r7.f3903p = r0
            r7.a()
            return
        L_0x012e:
            i.c.a.b.i.a.s5 r10 = r7.f3896i     // Catch:{ all -> 0x0196 }
            i.c.a.b.d.o.b r10 = r10.f3868n     // Catch:{ all -> 0x0196 }
            i.c.a.b.d.o.c r10 = (i.c.a.b.d.o.c) r10     // Catch:{ all -> 0x0196 }
            if (r10 == 0) goto L_0x0195
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0196 }
            r1.h((long) r2)     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.d r10 = r7.d()     // Catch:{ all -> 0x0196 }
            r10.a((i.c.a.b.i.a.c5) r1)     // Catch:{ all -> 0x0196 }
            if (r9 != r5) goto L_0x0154
            i.c.a.b.i.a.s5 r9 = r7.f3896i     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.m4 r9 = r9.n()     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.o4 r9 = r9.f3763k     // Catch:{ all -> 0x0196 }
            java.lang.String r10 = "Config not found. Using empty config. appId"
            r9.a(r10, r8)     // Catch:{ all -> 0x0196 }
            goto L_0x016a
        L_0x0154:
            i.c.a.b.i.a.s5 r8 = r7.f3896i     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.m4 r8 = r8.n()     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.o4 r8 = r8.f3766n     // Catch:{ all -> 0x0196 }
            java.lang.String r10 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0196 }
            int r11 = r11.length     // Catch:{ all -> 0x0196 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0196 }
            r8.a(r10, r9, r11)     // Catch:{ all -> 0x0196 }
        L_0x016a:
            i.c.a.b.i.a.s4 r8 = r7.c()     // Catch:{ all -> 0x0196 }
            boolean r8 = r8.t()     // Catch:{ all -> 0x0196 }
            if (r8 == 0) goto L_0x017e
            boolean r8 = r7.t()     // Catch:{ all -> 0x0196 }
            if (r8 == 0) goto L_0x017e
            r7.m()     // Catch:{ all -> 0x0196 }
            goto L_0x0181
        L_0x017e:
            r7.u()     // Catch:{ all -> 0x0196 }
        L_0x0181:
            i.c.a.b.i.a.d r8 = r7.d()     // Catch:{ all -> 0x0196 }
            r8.t()     // Catch:{ all -> 0x0196 }
            i.c.a.b.i.a.d r8 = r7.d()     // Catch:{ all -> 0x019f }
            r8.z()     // Catch:{ all -> 0x019f }
            r7.f3903p = r0
            r7.a()
            return
        L_0x0195:
            throw r6     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r8 = move-exception
            i.c.a.b.i.a.d r9 = r7.d()     // Catch:{ all -> 0x019f }
            r9.z()     // Catch:{ all -> 0x019f }
            throw r8     // Catch:{ all -> 0x019f }
        L_0x019f:
            r8 = move-exception
            r7.f3903p = r0
            r7.a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.t9.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void a() {
        r();
        if (this.f3903p || this.f3904q || this.r) {
            this.f3896i.n().f3766n.a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f3903p), Boolean.valueOf(this.f3904q), Boolean.valueOf(this.r));
            return;
        }
        this.f3896i.n().f3766n.a("Stopping uploading service(s)");
        List<Runnable> list = this.f3900m;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.f3900m.clear();
        }
    }

    public final void a(aa aaVar, ea eaVar) {
        i a2;
        r();
        i();
        if (c(eaVar)) {
            if (!eaVar.f3655l) {
                b(eaVar);
                return;
            }
            int b2 = this.f3896i.p().b(aaVar.f3586f);
            int i2 = 0;
            if (b2 != 0) {
                this.f3896i.p();
                String a3 = ca.a(aaVar.f3586f, 24, true);
                String str = aaVar.f3586f;
                if (str != null) {
                    i2 = str.length();
                }
                this.f3896i.p().a(b2, "_ev", a3, i2);
                return;
            }
            int b3 = this.f3896i.p().b(aaVar.f3586f, aaVar.a());
            if (b3 != 0) {
                this.f3896i.p();
                String a4 = ca.a(aaVar.f3586f, 24, true);
                Object a5 = aaVar.a();
                if (a5 != null && ((a5 instanceof String) || (a5 instanceof CharSequence))) {
                    i2 = String.valueOf(a5).length();
                }
                this.f3896i.p().a(b3, "_ev", a4, i2);
                return;
            }
            Object c2 = this.f3896i.p().c(aaVar.f3586f, aaVar.a());
            if (c2 != null) {
                if ("_sid".equals(aaVar.f3586f) && this.f3896i.f3861g.d(eaVar.e, o.U)) {
                    long j2 = aaVar.f3587g;
                    String str2 = aaVar.f3590j;
                    long j3 = 0;
                    da c3 = d().c(eaVar.e, "_sno");
                    if (c3 != null) {
                        Object obj = c3.e;
                        if (obj instanceof Long) {
                            j3 = ((Long) obj).longValue();
                            a(new aa("_sno", j2, Long.valueOf(j3 + 1), str2), eaVar);
                        }
                    }
                    if (c3 != null) {
                        this.f3896i.n().f3761i.a("Retrieved last session number from database does not contain a valid (long) value", c3.e);
                    }
                    if (this.f3896i.f3861g.d(eaVar.e, o.X) && (a2 = d().a(eaVar.e, "_s")) != null) {
                        j3 = a2.c;
                        this.f3896i.n().f3766n.a("Backfill the session number. Last used session number", Long.valueOf(j3));
                    }
                    a(new aa("_sno", j2, Long.valueOf(j3 + 1), str2), eaVar);
                }
                da daVar = new da(eaVar.e, aaVar.f3590j, aaVar.f3586f, aaVar.f3587g, c2);
                if (!k9.b() || !this.f3896i.f3861g.d(eaVar.e, o.Z0)) {
                    this.f3896i.n().f3765m.a("Setting user property", this.f3896i.q().c(daVar.c), c2);
                } else {
                    this.f3896i.n().f3766n.a("Setting user property", this.f3896i.q().c(daVar.c), c2);
                }
                d().y();
                try {
                    b(eaVar);
                    boolean a6 = d().a(daVar);
                    d().t();
                    if (!a6) {
                        this.f3896i.n().f3758f.a("Too many unique user properties are set. Ignoring user property", this.f3896i.q().c(daVar.c), daVar.e);
                        this.f3896i.p().a(9, (String) null, (String) null, 0);
                    } else if (!k9.b() || !this.f3896i.f3861g.d(eaVar.e, o.Z0)) {
                        this.f3896i.n().f3765m.a("User property set", this.f3896i.q().c(daVar.c), daVar.e);
                    }
                } finally {
                    d().z();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0220 A[Catch:{ SQLiteException -> 0x01d9, all -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0222 A[Catch:{ SQLiteException -> 0x01d9, all -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0226 A[Catch:{ SQLiteException -> 0x01d9, all -> 0x04bf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(i.c.a.b.i.a.ea r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.r()
            r21.i()
            i.c.a.b.d.l.q.a(r22)
            java.lang.String r7 = r2.e
            i.c.a.b.d.l.q.b((java.lang.String) r7)
            boolean r7 = r21.c(r22)
            if (r7 != 0) goto L_0x0023
            return
        L_0x0023:
            i.c.a.b.i.a.d r7 = r21.d()
            java.lang.String r8 = r2.e
            i.c.a.b.i.a.c5 r7 = r7.b(r8)
            r8 = 0
            if (r7 == 0) goto L_0x005b
            java.lang.String r10 = r7.i()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x005b
            java.lang.String r10 = r2.f3649f
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x005b
            r7.h((long) r8)
            i.c.a.b.i.a.d r10 = r21.d()
            r10.a((i.c.a.b.i.a.c5) r7)
            i.c.a.b.i.a.n5 r7 = r21.b()
            java.lang.String r10 = r2.e
            r7.c()
            java.util.Map<java.lang.String, i.c.a.b.g.g.j0> r7 = r7.f3784g
            r7.remove(r10)
        L_0x005b:
            boolean r7 = r2.f3655l
            if (r7 != 0) goto L_0x0063
            r21.b((i.c.a.b.i.a.ea) r22)
            return
        L_0x0063:
            long r10 = r2.f3660q
            r7 = 0
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 != 0) goto L_0x0078
            i.c.a.b.i.a.s5 r10 = r1.f3896i
            i.c.a.b.d.o.b r10 = r10.f3868n
            i.c.a.b.d.o.c r10 = (i.c.a.b.d.o.c) r10
            if (r10 == 0) goto L_0x0077
            long r10 = java.lang.System.currentTimeMillis()
            goto L_0x0078
        L_0x0077:
            throw r7
        L_0x0078:
            i.c.a.b.i.a.s5 r12 = r1.f3896i
            i.c.a.b.i.a.pa r12 = r12.f3861g
            java.lang.String r13 = r2.e
            i.c.a.b.i.a.f4<java.lang.Boolean> r14 = i.c.a.b.i.a.o.e0
            boolean r12 = r12.d(r13, r14)
            if (r12 == 0) goto L_0x0093
            i.c.a.b.i.a.s5 r12 = r1.f3896i
            i.c.a.b.i.a.g r12 = r12.u()
            r12.c()
            r12.f3678g = r7
            r12.f3679h = r8
        L_0x0093:
            int r12 = r2.r
            r15 = 1
            if (r12 == 0) goto L_0x00b3
            if (r12 == r15) goto L_0x00b3
            i.c.a.b.i.a.s5 r13 = r1.f3896i
            i.c.a.b.i.a.m4 r13 = r13.n()
            i.c.a.b.i.a.o4 r13 = r13.f3761i
            java.lang.String r7 = r2.e
            java.lang.Object r7 = i.c.a.b.i.a.m4.a((java.lang.String) r7)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r13.a(r14, r7, r12)
            r7 = 0
            goto L_0x00b4
        L_0x00b3:
            r7 = r12
        L_0x00b4:
            i.c.a.b.i.a.d r12 = r21.d()
            r12.y()
            i.c.a.b.i.a.s5 r12 = r1.f3896i     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.pa r12 = r12.f3861g     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = r2.e     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.f4<java.lang.Boolean> r14 = i.c.a.b.i.a.o.e0     // Catch:{ all -> 0x04bf }
            boolean r12 = r12.d(r13, r14)     // Catch:{ all -> 0x04bf }
            if (r12 == 0) goto L_0x0133
            i.c.a.b.i.a.d r12 = r21.d()     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = r2.e     // Catch:{ all -> 0x04bf }
            java.lang.String r14 = "_npa"
            i.c.a.b.i.a.da r14 = r12.c(r13, r14)     // Catch:{ all -> 0x04bf }
            if (r14 == 0) goto L_0x00e1
            java.lang.String r12 = "auto"
            java.lang.String r13 = r14.f3643b     // Catch:{ all -> 0x04bf }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x04bf }
            if (r12 == 0) goto L_0x0133
        L_0x00e1:
            java.lang.Boolean r12 = r2.w     // Catch:{ all -> 0x04bf }
            if (r12 == 0) goto L_0x011c
            i.c.a.b.i.a.aa r13 = new i.c.a.b.i.a.aa     // Catch:{ all -> 0x04bf }
            java.lang.String r17 = "_npa"
            java.lang.Boolean r12 = r2.w     // Catch:{ all -> 0x04bf }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x04bf }
            if (r12 == 0) goto L_0x00f4
            r18 = 1
            goto L_0x00f6
        L_0x00f4:
            r18 = r8
        L_0x00f6:
            java.lang.Long r18 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x04bf }
            java.lang.String r19 = "auto"
            r12 = r13
            r8 = r13
            r13 = r17
            r20 = r3
            r9 = r14
            r3 = 1
            r14 = r10
            r16 = r18
            r17 = r19
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04bf }
            if (r9 == 0) goto L_0x0118
            java.lang.Object r9 = r9.e     // Catch:{ all -> 0x04bf }
            java.lang.Long r12 = r8.f3588h     // Catch:{ all -> 0x04bf }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x04bf }
            if (r9 != 0) goto L_0x0136
        L_0x0118:
            r1.a((i.c.a.b.i.a.aa) r8, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x04bf }
            goto L_0x0136
        L_0x011c:
            r20 = r3
            r9 = r14
            r3 = 1
            if (r9 == 0) goto L_0x0136
            i.c.a.b.i.a.aa r8 = new i.c.a.b.i.a.aa     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_npa"
            r16 = 0
            java.lang.String r17 = "auto"
            r12 = r8
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04bf }
            r1.b((i.c.a.b.i.a.aa) r8, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x04bf }
            goto L_0x0136
        L_0x0133:
            r20 = r3
            r3 = 1
        L_0x0136:
            i.c.a.b.i.a.d r8 = r21.d()     // Catch:{ all -> 0x04bf }
            java.lang.String r9 = r2.e     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.c5 r8 = r8.b(r9)     // Catch:{ all -> 0x04bf }
            if (r8 == 0) goto L_0x01ea
            i.c.a.b.i.a.s5 r9 = r1.f3896i     // Catch:{ all -> 0x04bf }
            r9.p()     // Catch:{ all -> 0x04bf }
            java.lang.String r9 = r2.f3649f     // Catch:{ all -> 0x04bf }
            java.lang.String r12 = r8.i()     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = r2.v     // Catch:{ all -> 0x04bf }
            java.lang.String r14 = r8.j()     // Catch:{ all -> 0x04bf }
            boolean r9 = i.c.a.b.i.a.ca.a((java.lang.String) r9, (java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14)     // Catch:{ all -> 0x04bf }
            if (r9 == 0) goto L_0x01ea
            i.c.a.b.i.a.s5 r9 = r1.f3896i     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.m4 r9 = r9.n()     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.o4 r9 = r9.f3761i     // Catch:{ all -> 0x04bf }
            java.lang.String r12 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r8.g()     // Catch:{ all -> 0x04bf }
            java.lang.Object r13 = i.c.a.b.i.a.m4.a((java.lang.String) r13)     // Catch:{ all -> 0x04bf }
            r9.a(r12, r13)     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.d r9 = r21.d()     // Catch:{ all -> 0x04bf }
            java.lang.String r8 = r8.g()     // Catch:{ all -> 0x04bf }
            r9.m()     // Catch:{ all -> 0x04bf }
            r9.c()     // Catch:{ all -> 0x04bf }
            i.c.a.b.d.l.q.b((java.lang.String) r8)     // Catch:{ all -> 0x04bf }
            android.database.sqlite.SQLiteDatabase r12 = r9.u()     // Catch:{ SQLiteException -> 0x01d9 }
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01d9 }
            r14 = 0
            r13[r14] = r8     // Catch:{ SQLiteException -> 0x01d9 }
            java.lang.String r15 = "events"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01d9 }
            int r15 = r15 + r14
            java.lang.String r14 = "user_attributes"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01d9 }
            int r15 = r15 + r14
            java.lang.String r14 = "conditional_properties"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01d9 }
            int r15 = r15 + r14
            java.lang.String r14 = "apps"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01d9 }
            int r15 = r15 + r14
            java.lang.String r14 = "raw_events"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01d9 }
            int r15 = r15 + r14
            java.lang.String r14 = "raw_events_metadata"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01d9 }
            int r15 = r15 + r14
            java.lang.String r14 = "event_filters"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01d9 }
            int r15 = r15 + r14
            java.lang.String r14 = "property_filters"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01d9 }
            int r15 = r15 + r14
            java.lang.String r14 = "audience_filter_values"
            int r0 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01d9 }
            int r15 = r15 + r0
            if (r15 <= 0) goto L_0x01e9
            i.c.a.b.i.a.m4 r0 = r9.n()     // Catch:{ SQLiteException -> 0x01d9 }
            i.c.a.b.i.a.o4 r0 = r0.f3766n     // Catch:{ SQLiteException -> 0x01d9 }
            java.lang.String r12 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x01d9 }
            r0.a(r12, r8, r13)     // Catch:{ SQLiteException -> 0x01d9 }
            goto L_0x01e9
        L_0x01d9:
            r0 = move-exception
            i.c.a.b.i.a.m4 r9 = r9.n()     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.o4 r9 = r9.f3758f     // Catch:{ all -> 0x04bf }
            java.lang.String r12 = "Error deleting application data. appId, error"
            java.lang.Object r8 = i.c.a.b.i.a.m4.a((java.lang.String) r8)     // Catch:{ all -> 0x04bf }
            r9.a(r12, r8, r0)     // Catch:{ all -> 0x04bf }
        L_0x01e9:
            r8 = 0
        L_0x01ea:
            if (r8 == 0) goto L_0x0249
            long r12 = r8.q()     // Catch:{ all -> 0x04bf }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0204
            long r12 = r8.q()     // Catch:{ all -> 0x04bf }
            r9 = r4
            long r3 = r2.f3657n     // Catch:{ all -> 0x04bf }
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0205
            r0 = 1
            goto L_0x0206
        L_0x0204:
            r9 = r4
        L_0x0205:
            r0 = 0
        L_0x0206:
            long r3 = r8.q()     // Catch:{ all -> 0x04bf }
            int r12 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x0222
            java.lang.String r3 = r8.p()     // Catch:{ all -> 0x04bf }
            if (r3 == 0) goto L_0x0222
            java.lang.String r3 = r8.p()     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = r2.f3650g     // Catch:{ all -> 0x04bf }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x04bf }
            if (r3 != 0) goto L_0x0222
            r14 = 1
            goto L_0x0223
        L_0x0222:
            r14 = 0
        L_0x0223:
            r0 = r0 | r14
            if (r0 == 0) goto L_0x024a
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04bf }
            r0.<init>()     // Catch:{ all -> 0x04bf }
            java.lang.String r3 = "_pv"
            java.lang.String r4 = r8.p()     // Catch:{ all -> 0x04bf }
            r0.putString(r3, r4)     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.m r3 = new i.c.a.b.i.a.m     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_au"
            i.c.a.b.i.a.l r14 = new i.c.a.b.i.a.l     // Catch:{ all -> 0x04bf }
            r14.<init>(r0)     // Catch:{ all -> 0x04bf }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04bf }
            r1.a((i.c.a.b.i.a.m) r3, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x04bf }
            goto L_0x024a
        L_0x0249:
            r9 = r4
        L_0x024a:
            r21.b((i.c.a.b.i.a.ea) r22)     // Catch:{ all -> 0x04bf }
            if (r7 != 0) goto L_0x025c
            i.c.a.b.i.a.d r0 = r21.d()     // Catch:{ all -> 0x04bf }
            java.lang.String r3 = r2.e     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = "_f"
            i.c.a.b.i.a.i r0 = r0.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x04bf }
            goto L_0x026d
        L_0x025c:
            r3 = 1
            if (r7 != r3) goto L_0x026c
            i.c.a.b.i.a.d r0 = r21.d()     // Catch:{ all -> 0x04bf }
            java.lang.String r3 = r2.e     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = "_v"
            i.c.a.b.i.a.i r0 = r0.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x04bf }
            goto L_0x026d
        L_0x026c:
            r0 = 0
        L_0x026d:
            if (r0 != 0) goto L_0x0493
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r12 = r10 / r3
            r14 = 1
            long r12 = r12 + r14
            long r12 = r12 * r3
            java.lang.String r0 = "_dac"
            java.lang.String r3 = "_r"
            java.lang.String r4 = "_c"
            java.lang.String r8 = "_et"
            if (r7 != 0) goto L_0x03f7
            i.c.a.b.i.a.aa r7 = new i.c.a.b.i.a.aa     // Catch:{ all -> 0x04bf }
            java.lang.String r14 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04bf }
            java.lang.String r17 = "auto"
            r12 = r7
            r13 = r14
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04bf }
            r1.a((i.c.a.b.i.a.aa) r7, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.pa r7 = r7.f3861g     // Catch:{ all -> 0x04bf }
            java.lang.String r12 = r2.f3649f     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.f4<java.lang.Boolean> r13 = i.c.a.b.i.a.o.S     // Catch:{ all -> 0x04bf }
            boolean r7 = r7.d(r12, r13)     // Catch:{ all -> 0x04bf }
            if (r7 == 0) goto L_0x02b0
            r21.r()     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.s5 r7 = r1.f3896i     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.e5 r7 = r7.w     // Catch:{ all -> 0x04bf }
            java.lang.String r12 = r2.e     // Catch:{ all -> 0x04bf }
            r7.a(r12)     // Catch:{ all -> 0x04bf }
        L_0x02b0:
            r21.r()     // Catch:{ all -> 0x04bf }
            r21.i()     // Catch:{ all -> 0x04bf }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x04bf }
            r7.<init>()     // Catch:{ all -> 0x04bf }
            r12 = 1
            r7.putLong(r4, r12)     // Catch:{ all -> 0x04bf }
            r7.putLong(r3, r12)     // Catch:{ all -> 0x04bf }
            r3 = 0
            r7.putLong(r6, r3)     // Catch:{ all -> 0x04bf }
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04bf }
            r7.putLong(r9, r3)     // Catch:{ all -> 0x04bf }
            r14 = r20
            r7.putLong(r14, r3)     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.pa r3 = r3.f3861g     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = r2.e     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.f4<java.lang.Boolean> r12 = i.c.a.b.i.a.o.c0     // Catch:{ all -> 0x04bf }
            boolean r3 = r3.d(r4, r12)     // Catch:{ all -> 0x04bf }
            if (r3 == 0) goto L_0x02e7
            r3 = 1
            r7.putLong(r8, r3)     // Catch:{ all -> 0x04bf }
            goto L_0x02e9
        L_0x02e7:
            r3 = 1
        L_0x02e9:
            boolean r12 = r2.u     // Catch:{ all -> 0x04bf }
            if (r12 == 0) goto L_0x02f0
            r7.putLong(r0, r3)     // Catch:{ all -> 0x04bf }
        L_0x02f0:
            i.c.a.b.i.a.d r0 = r21.d()     // Catch:{ all -> 0x04bf }
            java.lang.String r3 = r2.e     // Catch:{ all -> 0x04bf }
            i.c.a.b.d.l.q.b((java.lang.String) r3)     // Catch:{ all -> 0x04bf }
            r0.c()     // Catch:{ all -> 0x04bf }
            r0.m()     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = "first_open_count"
            long r3 = r0.h(r3, r4)     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.s5 r0 = r1.f3896i     // Catch:{ all -> 0x04bf }
            android.content.Context r0 = r0.a     // Catch:{ all -> 0x04bf }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04bf }
            if (r0 != 0) goto L_0x0326
            i.c.a.b.i.a.s5 r0 = r1.f3896i     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.m4 r0 = r0.n()     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.o4 r0 = r0.f3758f     // Catch:{ all -> 0x04bf }
            java.lang.String r6 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r9 = r2.e     // Catch:{ all -> 0x04bf }
            java.lang.Object r9 = i.c.a.b.i.a.m4.a((java.lang.String) r9)     // Catch:{ all -> 0x04bf }
            r0.a(r6, r9)     // Catch:{ all -> 0x04bf }
        L_0x0322:
            r12 = 0
            goto L_0x03db
        L_0x0326:
            i.c.a.b.i.a.s5 r0 = r1.f3896i     // Catch:{ NameNotFoundException -> 0x0336 }
            android.content.Context r0 = r0.a     // Catch:{ NameNotFoundException -> 0x0336 }
            i.c.a.b.d.p.b r0 = i.c.a.b.d.p.c.b(r0)     // Catch:{ NameNotFoundException -> 0x0336 }
            java.lang.String r12 = r2.e     // Catch:{ NameNotFoundException -> 0x0336 }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.b(r12, r13)     // Catch:{ NameNotFoundException -> 0x0336 }
            goto L_0x034b
        L_0x0336:
            r0 = move-exception
            i.c.a.b.i.a.s5 r12 = r1.f3896i     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.m4 r12 = r12.n()     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.o4 r12 = r12.f3758f     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r15 = r2.e     // Catch:{ all -> 0x04bf }
            java.lang.Object r15 = i.c.a.b.i.a.m4.a((java.lang.String) r15)     // Catch:{ all -> 0x04bf }
            r12.a(r13, r15, r0)     // Catch:{ all -> 0x04bf }
            r0 = 0
        L_0x034b:
            if (r0 == 0) goto L_0x039b
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04bf }
            r15 = 0
            int r17 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x039b
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04bf }
            r20 = r14
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x04bf }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x037e
            i.c.a.b.i.a.s5 r0 = r1.f3896i     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.pa r0 = r0.f3861g     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.f4<java.lang.Boolean> r12 = i.c.a.b.i.a.o.O0     // Catch:{ all -> 0x04bf }
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r12)     // Catch:{ all -> 0x04bf }
            if (r0 == 0) goto L_0x0377
            r12 = 0
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x037c
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04bf }
            goto L_0x037c
        L_0x0377:
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04bf }
        L_0x037c:
            r14 = 0
            goto L_0x037f
        L_0x037e:
            r14 = 1
        L_0x037f:
            i.c.a.b.i.a.aa r0 = new i.c.a.b.i.a.aa     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_fi"
            if (r14 == 0) goto L_0x0388
            r14 = 1
            goto L_0x038a
        L_0x0388:
            r14 = 0
        L_0x038a:
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x04bf }
            java.lang.String r17 = "auto"
            r12 = r0
            r6 = r20
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04bf }
            r1.a((i.c.a.b.i.a.aa) r0, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x04bf }
            goto L_0x039c
        L_0x039b:
            r6 = r14
        L_0x039c:
            i.c.a.b.i.a.s5 r0 = r1.f3896i     // Catch:{ NameNotFoundException -> 0x03ac }
            android.content.Context r0 = r0.a     // Catch:{ NameNotFoundException -> 0x03ac }
            i.c.a.b.d.p.b r0 = i.c.a.b.d.p.c.b(r0)     // Catch:{ NameNotFoundException -> 0x03ac }
            java.lang.String r12 = r2.e     // Catch:{ NameNotFoundException -> 0x03ac }
            r13 = 0
            android.content.pm.ApplicationInfo r0 = r0.a(r12, r13)     // Catch:{ NameNotFoundException -> 0x03ac }
            goto L_0x03c1
        L_0x03ac:
            r0 = move-exception
            i.c.a.b.i.a.s5 r12 = r1.f3896i     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.m4 r12 = r12.n()     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.o4 r12 = r12.f3758f     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r14 = r2.e     // Catch:{ all -> 0x04bf }
            java.lang.Object r14 = i.c.a.b.i.a.m4.a((java.lang.String) r14)     // Catch:{ all -> 0x04bf }
            r12.a(r13, r14, r0)     // Catch:{ all -> 0x04bf }
            r0 = 0
        L_0x03c1:
            if (r0 == 0) goto L_0x0322
            int r12 = r0.flags     // Catch:{ all -> 0x04bf }
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x03ce
            r12 = 1
            r7.putLong(r9, r12)     // Catch:{ all -> 0x04bf }
        L_0x03ce:
            int r0 = r0.flags     // Catch:{ all -> 0x04bf }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0322
            r12 = 1
            r7.putLong(r6, r12)     // Catch:{ all -> 0x04bf }
            goto L_0x0322
        L_0x03db:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x03e2
            r7.putLong(r5, r3)     // Catch:{ all -> 0x04bf }
        L_0x03e2:
            i.c.a.b.i.a.m r0 = new i.c.a.b.i.a.m     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_f"
            i.c.a.b.i.a.l r14 = new i.c.a.b.i.a.l     // Catch:{ all -> 0x04bf }
            r14.<init>(r7)     // Catch:{ all -> 0x04bf }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04bf }
            r1.a((i.c.a.b.i.a.m) r0, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x04bf }
            goto L_0x0451
        L_0x03f7:
            r5 = 1
            if (r7 != r5) goto L_0x0451
            i.c.a.b.i.a.aa r5 = new i.c.a.b.i.a.aa     // Catch:{ all -> 0x04bf }
            java.lang.String r6 = "_fvt"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04bf }
            java.lang.String r17 = "auto"
            r12 = r5
            r13 = r6
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04bf }
            r1.a((i.c.a.b.i.a.aa) r5, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x04bf }
            r21.r()     // Catch:{ all -> 0x04bf }
            r21.i()     // Catch:{ all -> 0x04bf }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x04bf }
            r5.<init>()     // Catch:{ all -> 0x04bf }
            r6 = 1
            r5.putLong(r4, r6)     // Catch:{ all -> 0x04bf }
            r5.putLong(r3, r6)     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.pa r3 = r3.f3861g     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = r2.e     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.f4<java.lang.Boolean> r6 = i.c.a.b.i.a.o.c0     // Catch:{ all -> 0x04bf }
            boolean r3 = r3.d(r4, r6)     // Catch:{ all -> 0x04bf }
            if (r3 == 0) goto L_0x0434
            r3 = 1
            r5.putLong(r8, r3)     // Catch:{ all -> 0x04bf }
            goto L_0x0436
        L_0x0434:
            r3 = 1
        L_0x0436:
            boolean r6 = r2.u     // Catch:{ all -> 0x04bf }
            if (r6 == 0) goto L_0x043d
            r5.putLong(r0, r3)     // Catch:{ all -> 0x04bf }
        L_0x043d:
            i.c.a.b.i.a.m r0 = new i.c.a.b.i.a.m     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_v"
            i.c.a.b.i.a.l r14 = new i.c.a.b.i.a.l     // Catch:{ all -> 0x04bf }
            r14.<init>(r5)     // Catch:{ all -> 0x04bf }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04bf }
            r1.a((i.c.a.b.i.a.m) r0, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x04bf }
        L_0x0451:
            i.c.a.b.i.a.s5 r0 = r1.f3896i     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.pa r0 = r0.f3861g     // Catch:{ all -> 0x04bf }
            java.lang.String r3 = r2.e     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.f4<java.lang.Boolean> r4 = i.c.a.b.i.a.o.d0     // Catch:{ all -> 0x04bf }
            boolean r0 = r0.d(r3, r4)     // Catch:{ all -> 0x04bf }
            if (r0 != 0) goto L_0x04b0
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04bf }
            r0.<init>()     // Catch:{ all -> 0x04bf }
            r3 = 1
            r0.putLong(r8, r3)     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.s5 r3 = r1.f3896i     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.pa r3 = r3.f3861g     // Catch:{ all -> 0x04bf }
            java.lang.String r4 = r2.e     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.f4<java.lang.Boolean> r5 = i.c.a.b.i.a.o.c0     // Catch:{ all -> 0x04bf }
            boolean r3 = r3.d(r4, r5)     // Catch:{ all -> 0x04bf }
            if (r3 == 0) goto L_0x047e
            java.lang.String r3 = "_fr"
            r4 = 1
            r0.putLong(r3, r4)     // Catch:{ all -> 0x04bf }
        L_0x047e:
            i.c.a.b.i.a.m r3 = new i.c.a.b.i.a.m     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_e"
            i.c.a.b.i.a.l r14 = new i.c.a.b.i.a.l     // Catch:{ all -> 0x04bf }
            r14.<init>(r0)     // Catch:{ all -> 0x04bf }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04bf }
            r1.a((i.c.a.b.i.a.m) r3, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x04bf }
            goto L_0x04b0
        L_0x0493:
            boolean r0 = r2.f3656m     // Catch:{ all -> 0x04bf }
            if (r0 == 0) goto L_0x04b0
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04bf }
            r0.<init>()     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.m r3 = new i.c.a.b.i.a.m     // Catch:{ all -> 0x04bf }
            java.lang.String r13 = "_cd"
            i.c.a.b.i.a.l r14 = new i.c.a.b.i.a.l     // Catch:{ all -> 0x04bf }
            r14.<init>(r0)     // Catch:{ all -> 0x04bf }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04bf }
            r1.a((i.c.a.b.i.a.m) r3, (i.c.a.b.i.a.ea) r2)     // Catch:{ all -> 0x04bf }
        L_0x04b0:
            i.c.a.b.i.a.d r0 = r21.d()     // Catch:{ all -> 0x04bf }
            r0.t()     // Catch:{ all -> 0x04bf }
            i.c.a.b.i.a.d r0 = r21.d()
            r0.z()
            return
        L_0x04bf:
            r0 = move-exception
            i.c.a.b.i.a.d r2 = r21.d()
            r2.z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.t9.a(i.c.a.b.i.a.ea):void");
    }

    public final ea a(String str) {
        String str2 = str;
        c5 b2 = d().b(str2);
        if (b2 == null || TextUtils.isEmpty(b2.p())) {
            this.f3896i.n().f3765m.a("No app data available; dropping", str2);
            return null;
        }
        Boolean b3 = b(b2);
        if (b3 == null || b3.booleanValue()) {
            return new ea(str, b2.i(), b2.p(), b2.q(), b2.r(), b2.s(), b2.t(), (String) null, b2.v(), false, b2.m(), b2.b(), 0, 0, b2.c(), b2.d(), false, b2.j(), b2.e(), b2.u(), b2.f(), (!x9.b() || !this.f3896i.f3861g.d(str2, o.I0)) ? null : b2.k());
        }
        this.f3896i.n().f3758f.a("App version does not match; dropping. appId", m4.a(str));
        return null;
    }

    public final void a(na naVar, ea eaVar) {
        q.a(naVar);
        q.b(naVar.e);
        q.a(naVar.f3791f);
        q.a(naVar.f3792g);
        q.b(naVar.f3792g.f3586f);
        r();
        i();
        if (c(eaVar)) {
            if (!eaVar.f3655l) {
                b(eaVar);
                return;
            }
            na naVar2 = new na(naVar);
            boolean z = false;
            naVar2.f3794i = false;
            d().y();
            try {
                na d2 = d().d(naVar2.e, naVar2.f3792g.f3586f);
                if (d2 != null && !d2.f3791f.equals(naVar2.f3791f)) {
                    this.f3896i.n().f3761i.a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f3896i.q().c(naVar2.f3792g.f3586f), naVar2.f3791f, d2.f3791f);
                }
                if (d2 != null && d2.f3794i) {
                    naVar2.f3791f = d2.f3791f;
                    naVar2.f3793h = d2.f3793h;
                    naVar2.f3797l = d2.f3797l;
                    naVar2.f3795j = d2.f3795j;
                    naVar2.f3798m = d2.f3798m;
                    naVar2.f3794i = d2.f3794i;
                    naVar2.f3792g = new aa(naVar2.f3792g.f3586f, d2.f3792g.f3587g, naVar2.f3792g.a(), d2.f3792g.f3590j);
                } else if (TextUtils.isEmpty(naVar2.f3795j)) {
                    naVar2.f3792g = new aa(naVar2.f3792g.f3586f, naVar2.f3793h, naVar2.f3792g.a(), naVar2.f3792g.f3590j);
                    naVar2.f3794i = true;
                    z = true;
                }
                if (naVar2.f3794i) {
                    aa aaVar = naVar2.f3792g;
                    da daVar = new da(naVar2.e, naVar2.f3791f, aaVar.f3586f, aaVar.f3587g, aaVar.a());
                    if (d().a(daVar)) {
                        this.f3896i.n().f3765m.a("User property updated immediately", naVar2.e, this.f3896i.q().c(daVar.c), daVar.e);
                    } else {
                        this.f3896i.n().f3758f.a("(2)Too many active user properties, ignoring", m4.a(naVar2.e), this.f3896i.q().c(daVar.c), daVar.e);
                    }
                    if (z && naVar2.f3798m != null) {
                        b(new m(naVar2.f3798m, naVar2.f3793h), eaVar);
                    }
                }
                if (d().a(naVar2)) {
                    this.f3896i.n().f3765m.a("Conditional property added", naVar2.e, this.f3896i.q().c(naVar2.f3792g.f3586f), naVar2.f3792g.a());
                } else {
                    this.f3896i.n().f3758f.a("Too many conditional properties, ignoring", m4.a(naVar2.e), this.f3896i.q().c(naVar2.f3792g.f3586f), naVar2.f3792g.a());
                }
                d().t();
            } finally {
                d().z();
            }
        }
    }
}
