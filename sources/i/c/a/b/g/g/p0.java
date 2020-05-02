package i.c.a.b.g.g;

import i.c.a.b.g.g.r0;
import i.c.a.b.g.g.w3;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class p0 extends w3<p0, a> implements g5 {
    public static final p0 zzi;
    public static volatile m5<p0> zzj;
    public int zzc;
    public d4<r0> zzd = s5.f3444h;
    public String zze = "";
    public long zzf;
    public long zzg;
    public int zzh;

    static {
        p0 p0Var = new p0();
        zzi = p0Var;
        w3.zzd.put(p0.class, p0Var);
    }

    public static /* synthetic */ void a(p0 p0Var) {
        if (p0Var != null) {
            p0Var.zzd = s5.f3444h;
            return;
        }
        throw null;
    }

    public static a n() {
        return (a) zzi.i();
    }

    public final String k() {
        return this.zze;
    }

    public final boolean l() {
        return (this.zzc & 2) != 0;
    }

    public final void m() {
        if (!this.zzd.a()) {
            this.zzd = w3.a(this.zzd);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<p0, a> implements g5 {
        public a() {
            super(p0.zzi);
        }

        public final List<r0> a() {
            return Collections.unmodifiableList(((p0) this.f3512f).zzd);
        }

        public final a b(int i2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            p0.a((p0) this.f3512f, i2);
            return this;
        }

        public final int l() {
            return ((p0) this.f3512f).zzd.size();
        }

        public final String n() {
            return ((p0) this.f3512f).zze;
        }

        public final long p() {
            return ((p0) this.f3512f).zzf;
        }

        public final long q() {
            return ((p0) this.f3512f).zzg;
        }

        public /* synthetic */ a(y0 y0Var) {
            super(p0.zzi);
        }

        public final r0 a(int i2) {
            return ((p0) this.f3512f).zzd.get(i2);
        }

        public final a b(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            p0 p0Var = (p0) this.f3512f;
            p0Var.zzc |= 4;
            p0Var.zzg = j2;
            return this;
        }

        public final a a(int i2, r0 r0Var) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            p0.a((p0) this.f3512f, i2, r0Var);
            return this;
        }

        public final a a(r0.a aVar) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            p0.a((p0) this.f3512f, (r0) ((w3) aVar.k()));
            return this;
        }

        public final a a(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            p0.a((p0) this.f3512f, str);
            return this;
        }

        public final a a(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            p0 p0Var = (p0) this.f3512f;
            p0Var.zzc |= 2;
            p0Var.zzf = j2;
            return this;
        }
    }

    public final List<r0> a() {
        return this.zzd;
    }

    public static /* synthetic */ void a(p0 p0Var, int i2, r0 r0Var) {
        if (p0Var != null) {
            r0Var.getClass();
            p0Var.m();
            p0Var.zzd.set(i2, r0Var);
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(p0 p0Var, r0 r0Var) {
        if (p0Var != null) {
            r0Var.getClass();
            p0Var.m();
            p0Var.zzd.add(r0Var);
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(p0 p0Var, Iterable iterable) {
        p0Var.m();
        m2.a(iterable, p0Var.zzd);
    }

    public static /* synthetic */ void a(p0 p0Var, int i2) {
        p0Var.m();
        p0Var.zzd.remove(i2);
    }

    public static /* synthetic */ void a(p0 p0Var, String str) {
        if (p0Var != null) {
            str.getClass();
            p0Var.zzc |= 1;
            p0Var.zze = str;
            return;
        }
        throw null;
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (y0.a[i2 - 1]) {
            case 1:
                return new p0();
            case 2:
                return new a((y0) null);
            case 3:
                return new r5(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0004\u0003", new Object[]{"zzc", "zzd", r0.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                m5<p0> m5Var = zzj;
                if (m5Var == null) {
                    synchronized (p0.class) {
                        m5Var = zzj;
                        if (m5Var == null) {
                            m5Var = new w3.a<>(zzi);
                            zzj = m5Var;
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
