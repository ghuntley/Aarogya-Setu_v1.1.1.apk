package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class r0 extends w3<r0, a> implements g5 {
    public static final r0 zzj;
    public static volatile m5<r0> zzk;
    public int zzc;
    public String zzd = "";
    public String zze = "";
    public long zzf;
    public float zzg;
    public double zzh;
    public d4<r0> zzi = s5.f3444h;

    static {
        r0 r0Var = new r0();
        zzj = r0Var;
        w3.zzd.put(r0.class, r0Var);
    }

    public static /* synthetic */ void a(r0 r0Var) {
        if (r0Var != null) {
            r0Var.zzi = s5.f3444h;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void b(r0 r0Var, String str) {
        if (r0Var != null) {
            str.getClass();
            r0Var.zzc |= 2;
            r0Var.zze = str;
            return;
        }
        throw null;
    }

    public static a s() {
        return (a) zzj.i();
    }

    public final String k() {
        return this.zzd;
    }

    public final boolean l() {
        return (this.zzc & 2) != 0;
    }

    public final String m() {
        return this.zze;
    }

    public final boolean n() {
        return (this.zzc & 4) != 0;
    }

    public final long o() {
        return this.zzf;
    }

    public final boolean p() {
        return (this.zzc & 16) != 0;
    }

    public final double q() {
        return this.zzh;
    }

    public final int r() {
        return this.zzi.size();
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<r0, a> implements g5 {
        public a() {
            super(r0.zzj);
        }

        public final a a(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            r0.a((r0) this.f3512f, str);
            return this;
        }

        public final a b(String str) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            r0.b((r0) this.f3512f, str);
            return this;
        }

        public /* synthetic */ a(y0 y0Var) {
            super(r0.zzj);
        }

        public final a a(long j2) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            r0 r0Var = (r0) this.f3512f;
            r0Var.zzc |= 4;
            r0Var.zzf = j2;
            return this;
        }

        public final a a(double d) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            r0 r0Var = (r0) this.f3512f;
            r0Var.zzc |= 16;
            r0Var.zzh = d;
            return this;
        }

        public final a a(Iterable<? extends r0> iterable) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            r0 r0Var = (r0) this.f3512f;
            if (!r0Var.zzi.a()) {
                r0Var.zzi = w3.a(r0Var.zzi);
            }
            m2.a(iterable, r0Var.zzi);
            return this;
        }
    }

    public static /* synthetic */ void a(r0 r0Var, String str) {
        if (r0Var != null) {
            str.getClass();
            r0Var.zzc |= 1;
            r0Var.zzd = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(r0 r0Var, r0 r0Var2) {
        if (r0Var != null) {
            r0Var2.getClass();
            if (!r0Var.zzi.a()) {
                r0Var.zzi = w3.a(r0Var.zzi);
            }
            r0Var.zzi.add(r0Var2);
            return;
        }
        throw null;
    }

    public final Object a(int i2, Object obj, Object obj2) {
        Class<r0> cls = r0.class;
        switch (y0.a[i2 - 1]) {
            case 1:
                return new r0();
            case 2:
                return new a((y0) null);
            case 3:
                return new r5(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0001\u0003\u0005\u0000\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", cls});
            case 4:
                return zzj;
            case 5:
                m5<r0> m5Var = zzk;
                if (m5Var == null) {
                    synchronized (cls) {
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
