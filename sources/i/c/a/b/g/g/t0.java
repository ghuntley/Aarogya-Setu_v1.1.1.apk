package i.c.a.b.g.g;

import com.crashlytics.android.core.CodedOutputStream;
import com.crashlytics.android.core.LogFileManager;
import i.c.a.b.g.g.p0;
import i.c.a.b.g.g.w3;
import i.c.a.b.g.g.x0;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class t0 extends w3<t0, a> implements g5 {
    public static final t0 zzav;
    public static volatile m5<t0> zzaw;
    public int zzaa;
    public String zzab = "";
    public String zzac = "";
    public boolean zzad;
    public d4<n0> zzae;
    public String zzaf;
    public int zzag;
    public int zzah;
    public int zzai;
    public String zzaj;
    public long zzak;
    public long zzal;
    public String zzam;
    public String zzan;
    public int zzao;
    public String zzap;
    public u0 zzaq;
    public b4 zzar;
    public long zzas;
    public long zzat;
    public String zzau;
    public int zzc;
    public int zzd;
    public int zze;
    public d4<p0> zzf;
    public d4<x0> zzg;
    public long zzh;
    public long zzi;
    public long zzj;
    public long zzk;
    public long zzl;
    public String zzm = "";
    public String zzn = "";
    public String zzo = "";
    public String zzp = "";
    public int zzq;
    public String zzr = "";
    public String zzs = "";
    public String zzt = "";
    public long zzu;
    public long zzv;
    public String zzw = "";
    public boolean zzx;
    public String zzy = "";
    public long zzz;

    static {
        t0 t0Var = new t0();
        zzav = t0Var;
        w3.zzd.put(t0.class, t0Var);
    }

    public t0() {
        s5<Object> s5Var = s5.f3444h;
        this.zzf = s5Var;
        this.zzg = s5Var;
        this.zzae = s5Var;
        this.zzaf = "";
        this.zzaj = "";
        this.zzam = "";
        this.zzan = "";
        this.zzap = "";
        this.zzar = z3.f3548h;
        this.zzau = "";
    }

    public static /* synthetic */ void a(t0 t0Var) {
        if (t0Var != null) {
            t0Var.zzf = s5.f3444h;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void b(t0 t0Var) {
        if (t0Var != null) {
            t0Var.zzae = s5.f3444h;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void c(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= 256;
            t0Var.zzo = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void d(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= 512;
            t0Var.zzp = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void e(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= 2048;
            t0Var.zzr = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void f(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
            t0Var.zzs = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void g(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= 8192;
            t0Var.zzt = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void h(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= LogFileManager.MAX_LOG_SIZE;
            t0Var.zzw = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void i(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= 262144;
            t0Var.zzy = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void j(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= 2097152;
            t0Var.zzab = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void o(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzd |= 64;
            t0Var.zzau = str;
            return;
        }
        throw null;
    }

    public final String k() {
        return this.zzac;
    }

    public final void l() {
        if (!this.zzf.a()) {
            this.zzf = w3.a(this.zzf);
        }
    }

    public final void m() {
        if (!this.zzg.a()) {
            this.zzg = w3.a(this.zzg);
        }
    }

    public final String n() {
        return this.zzs;
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<t0, a> implements g5 {
        public a() {
            super(t0.zzav);
        }

        public final String A() {
            return ((t0) this.f3512f).zzau;
        }

        public final a a() {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 1;
            t0Var.zze = 1;
            return this;
        }

        public final a b(int i2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.a((t0) this.f3512f, i2);
            return this;
        }

        public final x0 c(int i2) {
            return ((t0) this.f3512f).zzg.get(i2);
        }

        public final a d(int i2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.b((t0) this.f3512f, i2);
            return this;
        }

        public final a e(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 32;
            t0Var.zzl = j2;
            return this;
        }

        public final a f(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.f((t0) this.f3512f, str);
            return this;
        }

        public final a g(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.g((t0) this.f3512f, str);
            return this;
        }

        public final a h(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.h((t0) this.f3512f, str);
            return this;
        }

        public final a i(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.i((t0) this.f3512f, str);
            return this;
        }

        public final a j(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.j((t0) this.f3512f, str);
            return this;
        }

        public final a k(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.k((t0) this.f3512f, str);
            return this;
        }

        public final int l() {
            return ((t0) this.f3512f).zzf.size();
        }

        public final a m(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.m((t0) this.f3512f, str);
            return this;
        }

        public final a n() {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.a((t0) this.f3512f);
            return this;
        }

        public final a o(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.o((t0) this.f3512f, str);
            return this;
        }

        public final List<x0> p() {
            return Collections.unmodifiableList(((t0) this.f3512f).zzg);
        }

        public final int q() {
            return ((t0) this.f3512f).zzg.size();
        }

        public final long r() {
            return ((t0) this.f3512f).zzi;
        }

        public final long s() {
            return ((t0) this.f3512f).zzj;
        }

        public final a t() {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc &= -17;
            t0Var.zzk = 0;
            return this;
        }

        public final a u() {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc &= -33;
            t0Var.zzl = 0;
            return this;
        }

        public final String v() {
            return ((t0) this.f3512f).zzs;
        }

        public final a w() {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc &= -2097153;
            t0Var.zzab = t0.zzav.zzab;
            return this;
        }

        public final String x() {
            return ((t0) this.f3512f).zzac;
        }

        public final a y() {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.b((t0) this.f3512f);
            return this;
        }

        public final a z() {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            throw null;
        }

        public /* synthetic */ a(y0 y0Var) {
            super(t0.zzav);
        }

        public final a c(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 8;
            t0Var.zzj = j2;
            return this;
        }

        public final a l(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.l((t0) this.f3512f, str);
            return this;
        }

        public final a b(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 4;
            t0Var.zzi = j2;
            return this;
        }

        public final a d(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 16;
            t0Var.zzk = j2;
            return this;
        }

        public final a f(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 16384;
            t0Var.zzu = j2;
            return this;
        }

        public final a g(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 32768;
            t0Var.zzv = j2;
            return this;
        }

        public final a h(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 524288;
            t0Var.zzz = j2;
            return this;
        }

        public final a i(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 536870912;
            t0Var.zzak = j2;
            return this;
        }

        public final a j(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 1073741824;
            t0Var.zzal = j2;
            return this;
        }

        public final a k(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzd |= 16;
            t0Var.zzas = j2;
            return this;
        }

        public final a n(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.n((t0) this.f3512f, str);
            return this;
        }

        /* renamed from: a  reason: collision with other method in class */
        public final List<p0> m13a() {
            return Collections.unmodifiableList(((t0) this.f3512f).zzf);
        }

        public final a e(int i2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 1024;
            t0Var.zzq = i2;
            return this;
        }

        public final a c(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.c((t0) this.f3512f, str);
            return this;
        }

        public final p0 a(int i2) {
            return ((t0) this.f3512f).zzf.get(i2);
        }

        public final a b(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.b((t0) this.f3512f, str);
            return this;
        }

        public final a d(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.d((t0) this.f3512f, str);
            return this;
        }

        public final a f(int i2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 1048576;
            t0Var.zzaa = i2;
            return this;
        }

        public final a g(int i2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 33554432;
            t0Var.zzag = i2;
            return this;
        }

        public final a h(int i2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzd |= 2;
            t0Var.zzao = i2;
            return this;
        }

        public final a a(int i2, p0.a aVar) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.a((t0) this.f3512f, i2, (p0) ((w3) aVar.k()));
            return this;
        }

        public final a c(Iterable<? extends Integer> iterable) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            if (!t0Var.zzar.a()) {
                b4 b4Var = t0Var.zzar;
                int size = b4Var.size();
                t0Var.zzar = ((z3) b4Var).a(size == 0 ? 10 : size << 1);
            }
            m2.a(iterable, t0Var.zzar);
            return this;
        }

        public final a e(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.e((t0) this.f3512f, str);
            return this;
        }

        public final a b(boolean z) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 8388608;
            t0Var.zzad = z;
            return this;
        }

        public final a a(p0.a aVar) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.a((t0) this.f3512f, (p0) ((w3) aVar.k()));
            return this;
        }

        public final a b(Iterable<? extends n0> iterable) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            if (!t0Var.zzae.a()) {
                t0Var.zzae = w3.a(t0Var.zzae);
            }
            m2.a(iterable, t0Var.zzae);
            return this;
        }

        public final a a(Iterable<? extends p0> iterable) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.a((t0) this.f3512f, (Iterable) iterable);
            return this;
        }

        public final a a(int i2, x0 x0Var) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.a((t0) this.f3512f, i2, x0Var);
            return this;
        }

        public final a a(x0 x0Var) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.a((t0) this.f3512f, x0Var);
            return this;
        }

        public final a a(x0.a aVar) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.a((t0) this.f3512f, (x0) ((w3) aVar.k()));
            return this;
        }

        public final a a(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 2;
            t0Var.zzh = j2;
            return this;
        }

        public final a a(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0.a((t0) this.f3512f, str);
            return this;
        }

        public final a a(boolean z) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            t0 t0Var = (t0) this.f3512f;
            t0Var.zzc |= 131072;
            t0Var.zzx = z;
            return this;
        }
    }

    public static /* synthetic */ void k(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= 4194304;
            t0Var.zzac = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void n(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzd |= 4;
            t0Var.zzap = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(t0 t0Var, int i2, p0 p0Var) {
        if (t0Var != null) {
            p0Var.getClass();
            t0Var.l();
            t0Var.zzf.set(i2, p0Var);
            return;
        }
        throw null;
    }

    public static /* synthetic */ void b(t0 t0Var, int i2) {
        t0Var.m();
        t0Var.zzg.remove(i2);
    }

    public static /* synthetic */ void l(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= 16777216;
            t0Var.zzaf = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void m(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= 268435456;
            t0Var.zzaj = str;
            return;
        }
        throw null;
    }

    public static a o() {
        return (a) zzav.i();
    }

    public static /* synthetic */ void b(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= 128;
            t0Var.zzn = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(t0 t0Var, p0 p0Var) {
        if (t0Var != null) {
            p0Var.getClass();
            t0Var.l();
            t0Var.zzf.add(p0Var);
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(t0 t0Var, Iterable iterable) {
        t0Var.l();
        m2.a(iterable, t0Var.zzf);
    }

    public static /* synthetic */ void a(t0 t0Var, int i2) {
        t0Var.l();
        t0Var.zzf.remove(i2);
    }

    public static /* synthetic */ void a(t0 t0Var, int i2, x0 x0Var) {
        if (t0Var != null) {
            x0Var.getClass();
            t0Var.m();
            t0Var.zzg.set(i2, x0Var);
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(t0 t0Var, x0 x0Var) {
        if (t0Var != null) {
            x0Var.getClass();
            t0Var.m();
            t0Var.zzg.add(x0Var);
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(t0 t0Var, String str) {
        if (t0Var != null) {
            str.getClass();
            t0Var.zzc |= 64;
            t0Var.zzm = str;
            return;
        }
        throw null;
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (y0.a[i2 - 1]) {
            case 1:
                return new t0();
            case 2:
                return new a((y0) null);
            case 3:
                return new r5(zzav, "\u0001+\u0000\u0002\u00012+\u0000\u0004\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0002\u0001\u0005\u0002\u0002\u0006\u0002\u0003\u0007\u0002\u0005\b\b\u0006\t\b\u0007\n\b\b\u000b\b\t\f\u0004\n\r\b\u000b\u000e\b\f\u0010\b\r\u0011\u0002\u000e\u0012\u0002\u000f\u0013\b\u0010\u0014\u0007\u0011\u0015\b\u0012\u0016\u0002\u0013\u0017\u0004\u0014\u0018\b\u0015\u0019\b\u0016\u001a\u0002\u0004\u001c\u0007\u0017\u001d\u001b\u001e\b\u0018\u001f\u0004\u0019 \u0004\u001a!\u0004\u001b\"\b\u001c#\u0002\u001d$\u0002\u001e%\b\u001f&\b '\u0004!)\b\",\t#-\u001d.\u0002$/\u0002%2\b&", new Object[]{"zzc", "zzd", "zze", "zzf", p0.class, "zzg", x0.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzk", "zzad", "zzae", n0.class, "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau"});
            case 4:
                return zzav;
            case 5:
                m5<t0> m5Var = zzaw;
                if (m5Var == null) {
                    synchronized (t0.class) {
                        m5Var = zzaw;
                        if (m5Var == null) {
                            m5Var = new w3.a<>(zzav);
                            zzaw = m5Var;
                        }
                    }
                }
                return m5Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
