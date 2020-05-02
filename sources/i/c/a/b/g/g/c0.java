package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class c0 extends w3<c0, a> implements g5 {
    public static final c0 zzh;
    public static volatile m5<c0> zzi;
    public int zzc;
    public f0 zzd;
    public d0 zze;
    public boolean zzf;
    public String zzg = "";

    static {
        c0 c0Var = new c0();
        zzh = c0Var;
        w3.zzd.put(c0.class, c0Var);
    }

    public final boolean a() {
        return (this.zzc & 1) != 0;
    }

    public final f0 k() {
        f0 f0Var = this.zzd;
        return f0Var == null ? f0.zzh : f0Var;
    }

    public final boolean l() {
        return (this.zzc & 2) != 0;
    }

    public final d0 m() {
        d0 d0Var = this.zze;
        return d0Var == null ? d0.zzi : d0Var;
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<c0, a> implements g5 {
        public a() {
            super(c0.zzh);
        }

        public /* synthetic */ a(g0 g0Var) {
            super(c0.zzh);
        }
    }

    public static /* synthetic */ void a(c0 c0Var, String str) {
        if (c0Var != null) {
            str.getClass();
            c0Var.zzc |= 8;
            c0Var.zzg = str;
            return;
        }
        throw null;
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (g0.a[i2 - 1]) {
            case 1:
                return new c0();
            case 2:
                return new a((g0) null);
            case 3:
                return new r5(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                m5<c0> m5Var = zzi;
                if (m5Var == null) {
                    synchronized (c0.class) {
                        m5Var = zzi;
                        if (m5Var == null) {
                            m5Var = new w3.a<>(zzh);
                            zzi = m5Var;
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
