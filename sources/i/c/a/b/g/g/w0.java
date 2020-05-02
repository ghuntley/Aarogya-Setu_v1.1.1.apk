package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class w0 extends w3<w0, a> implements g5 {
    public static final w0 zzf;
    public static volatile m5<w0> zzg;
    public int zzc;
    public int zzd;
    public e4 zze = t4.f3455h;

    static {
        w0 w0Var = new w0();
        zzf = w0Var;
        w3.zzd.put(w0.class, w0Var);
    }

    public static /* synthetic */ void a(w0 w0Var) {
        if (w0Var != null) {
            w0Var.zze = t4.f3455h;
            return;
        }
        throw null;
    }

    public final int k() {
        return this.zzd;
    }

    public final int l() {
        return this.zze.size();
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<w0, a> implements g5 {
        public a() {
            super(w0.zzf);
        }

        public final a a(int i2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            w0 w0Var = (w0) this.f3512f;
            w0Var.zzc |= 1;
            w0Var.zzd = i2;
            return this;
        }

        public /* synthetic */ a(y0 y0Var) {
            super(w0.zzf);
        }

        public final a a(Iterable<? extends Long> iterable) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            w0 w0Var = (w0) this.f3512f;
            if (!w0Var.zze.a()) {
                w0Var.zze = w3.a(w0Var.zze);
            }
            m2.a(iterable, w0Var.zze);
            return this;
        }
    }

    public final boolean a() {
        return (this.zzc & 1) != 0;
    }

    public final long a(int i2) {
        t4 t4Var = (t4) this.zze;
        t4Var.d(i2);
        return t4Var.f3456f[i2];
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (y0.a[i2 - 1]) {
            case 1:
                return new w0();
            case 2:
                return new a((y0) null);
            case 3:
                return new r5(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                m5<w0> m5Var = zzg;
                if (m5Var == null) {
                    synchronized (w0.class) {
                        m5Var = zzg;
                        if (m5Var == null) {
                            m5Var = new w3.a<>(zzf);
                            zzg = m5Var;
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
