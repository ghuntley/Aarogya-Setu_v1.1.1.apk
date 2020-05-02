package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class i0 extends w3<i0, a> implements g5 {
    public static final i0 zzh;
    public static volatile m5<i0> zzi;
    public int zzc;
    public String zzd = "";
    public boolean zze;
    public boolean zzf;
    public int zzg;

    static {
        i0 i0Var = new i0();
        zzh = i0Var;
        w3.zzd.put(i0.class, i0Var);
    }

    public static /* synthetic */ void a(i0 i0Var, String str) {
        if (i0Var != null) {
            str.getClass();
            i0Var.zzc |= 1;
            i0Var.zzd = str;
            return;
        }
        throw null;
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<i0, a> implements g5 {
        public a() {
            super(i0.zzh);
        }

        public final String a() {
            return ((i0) this.f3512f).zzd;
        }

        public final int l() {
            return ((i0) this.f3512f).zzg;
        }

        public /* synthetic */ a(m0 m0Var) {
            super(i0.zzh);
        }
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (m0.a[i2 - 1]) {
            case 1:
                return new i0();
            case 2:
                return new a((m0) null);
            case 3:
                return new r5(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0004\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                m5<i0> m5Var = zzi;
                if (m5Var == null) {
                    synchronized (i0.class) {
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
