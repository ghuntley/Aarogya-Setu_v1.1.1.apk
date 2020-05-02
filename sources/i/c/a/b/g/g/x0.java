package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class x0 extends w3<x0, a> implements g5 {
    public static final x0 zzj;
    public static volatile m5<x0> zzk;
    public int zzc;
    public long zzd;
    public String zze = "";
    public String zzf = "";
    public long zzg;
    public float zzh;
    public double zzi;

    static {
        x0 x0Var = new x0();
        zzj = x0Var;
        w3.zzd.put(x0.class, x0Var);
    }

    public static /* synthetic */ void a(x0 x0Var, String str) {
        if (x0Var != null) {
            str.getClass();
            x0Var.zzc |= 2;
            x0Var.zze = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void b(x0 x0Var, String str) {
        if (x0Var != null) {
            str.getClass();
            x0Var.zzc |= 4;
            x0Var.zzf = str;
            return;
        }
        throw null;
    }

    public static a l() {
        return (a) zzj.i();
    }

    public final String k() {
        return this.zze;
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<x0, a> implements g5 {
        public a() {
            super(x0.zzj);
        }

        public final a a(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            x0 x0Var = (x0) this.f3512f;
            x0Var.zzc |= 1;
            x0Var.zzd = j2;
            return this;
        }

        public final a b(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            x0 x0Var = (x0) this.f3512f;
            x0Var.zzc |= 8;
            x0Var.zzg = j2;
            return this;
        }

        public /* synthetic */ a(y0 y0Var) {
            super(x0.zzj);
        }

        public final a a(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            x0.a((x0) this.f3512f, str);
            return this;
        }
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (y0.a[i2 - 1]) {
            case 1:
                return new x0();
            case 2:
                return new a((y0) null);
            case 3:
                return new r5(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u0001\u0004\u0006\u0000\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                m5<x0> m5Var = zzk;
                if (m5Var == null) {
                    synchronized (x0.class) {
                        m5Var = zzk;
                        if (m5Var == null) {
                            m5Var = new w3.a<>(zzj);
                            zzk = m5Var;
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
