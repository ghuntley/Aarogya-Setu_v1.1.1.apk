package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class j0 extends w3<j0, a> implements g5 {
    public static final j0 zzl;
    public static volatile m5<j0> zzm;
    public int zzc;
    public long zzd;
    public String zze = "";
    public int zzf;
    public d4<k0> zzg;
    public d4<i0> zzh;
    public d4<a0> zzi;
    public String zzj;
    public boolean zzk;

    static {
        j0 j0Var = new j0();
        zzl = j0Var;
        w3.zzd.put(j0.class, j0Var);
    }

    public j0() {
        s5<Object> s5Var = s5.f3444h;
        this.zzg = s5Var;
        this.zzh = s5Var;
        this.zzi = s5Var;
        this.zzj = "";
    }

    public static /* synthetic */ void a(j0 j0Var) {
        if (j0Var != null) {
            j0Var.zzi = s5.f3444h;
            return;
        }
        throw null;
    }

    public final long k() {
        return this.zzd;
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<j0, a> implements g5 {
        public a() {
            super(j0.zzl);
        }

        public /* synthetic */ a(m0 m0Var) {
            super(j0.zzl);
        }
    }

    public final boolean a() {
        return (this.zzc & 1) != 0;
    }

    public static /* synthetic */ void a(j0 j0Var, int i2, i0 i0Var) {
        if (j0Var != null) {
            i0Var.getClass();
            if (!j0Var.zzh.a()) {
                j0Var.zzh = w3.a(j0Var.zzh);
            }
            j0Var.zzh.set(i2, i0Var);
            return;
        }
        throw null;
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (m0.a[i2 - 1]) {
            case 1:
                return new j0();
            case 2:
                return new a((m0) null);
            case 3:
                return new r5(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\b\u0003\b\u0007\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", k0.class, "zzh", i0.class, "zzi", a0.class, "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                m5<j0> m5Var = zzm;
                if (m5Var == null) {
                    synchronized (j0.class) {
                        m5Var = zzm;
                        if (m5Var == null) {
                            m5Var = new w3.a<>(zzl);
                            zzm = m5Var;
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
