package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class v0 extends w3<v0, a> implements g5 {
    public static final v0 zzg;
    public static volatile m5<v0> zzh;
    public e4 zzc;
    public e4 zzd;
    public d4<o0> zze;
    public d4<w0> zzf;

    static {
        v0 v0Var = new v0();
        zzg = v0Var;
        w3.zzd.put(v0.class, v0Var);
    }

    public v0() {
        t4 t4Var = t4.f3455h;
        this.zzc = t4Var;
        this.zzd = t4Var;
        s5<Object> s5Var = s5.f3444h;
        this.zze = s5Var;
        this.zzf = s5Var;
    }

    public static /* synthetic */ void a(v0 v0Var) {
        if (v0Var != null) {
            v0Var.zzc = t4.f3455h;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void b(v0 v0Var) {
        if (v0Var != null) {
            v0Var.zzd = t4.f3455h;
            return;
        }
        throw null;
    }

    public final int k() {
        return this.zzc.size();
    }

    public final int l() {
        return this.zze.size();
    }

    public final int m() {
        return this.zzf.size();
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<v0, a> implements g5 {
        public a() {
            super(v0.zzg);
        }

        public final a a(Iterable<? extends Long> iterable) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            v0 v0Var = (v0) this.f3512f;
            if (!v0Var.zzc.a()) {
                v0Var.zzc = w3.a(v0Var.zzc);
            }
            m2.a(iterable, v0Var.zzc);
            return this;
        }

        public final a b(Iterable<? extends Long> iterable) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            v0 v0Var = (v0) this.f3512f;
            if (!v0Var.zzd.a()) {
                v0Var.zzd = w3.a(v0Var.zzd);
            }
            m2.a(iterable, v0Var.zzd);
            return this;
        }

        public final a l() {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            v0.b((v0) this.f3512f);
            return this;
        }

        public /* synthetic */ a(y0 y0Var) {
            super(v0.zzg);
        }

        public final a a() {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            v0.a((v0) this.f3512f);
            return this;
        }

        public final a b(int i2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            v0 v0Var = (v0) this.f3512f;
            if (!v0Var.zzf.a()) {
                v0Var.zzf = w3.a(v0Var.zzf);
            }
            v0Var.zzf.remove(i2);
            return this;
        }

        public final a a(int i2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            v0 v0Var = (v0) this.f3512f;
            if (!v0Var.zze.a()) {
                v0Var.zze = w3.a(v0Var.zze);
            }
            v0Var.zze.remove(i2);
            return this;
        }
    }

    public final o0 a(int i2) {
        return this.zze.get(i2);
    }

    public final w0 b(int i2) {
        return this.zzf.get(i2);
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (y0.a[i2 - 1]) {
            case 1:
                return new v0();
            case 2:
                return new a((y0) null);
            case 3:
                return new r5(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", o0.class, "zzf", w0.class});
            case 4:
                return zzg;
            case 5:
                m5<v0> m5Var = zzh;
                if (m5Var == null) {
                    synchronized (v0.class) {
                        m5Var = zzh;
                        if (m5Var == null) {
                            m5Var = new w3.a<>(zzg);
                            zzh = m5Var;
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
