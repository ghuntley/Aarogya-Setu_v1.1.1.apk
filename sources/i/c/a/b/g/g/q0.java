package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class q0 extends w3<q0, a> implements g5 {
    public static final q0 zzf;
    public static volatile m5<q0> zzg;
    public int zzc;
    public String zzd = "";
    public long zze;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<q0, a> implements g5 {
        public /* synthetic */ a(y0 y0Var) {
            super(q0.zzf);
        }
    }

    static {
        q0 q0Var = new q0();
        zzf = q0Var;
        w3.zzd.put(q0.class, q0Var);
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (y0.a[i2 - 1]) {
            case 1:
                return new q0();
            case 2:
                return new a((y0) null);
            case 3:
                return new r5(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                m5<q0> m5Var = zzg;
                if (m5Var == null) {
                    synchronized (q0.class) {
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
