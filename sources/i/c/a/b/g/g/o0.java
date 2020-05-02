package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class o0 extends w3<o0, a> implements g5 {
    public static final o0 zzf;
    public static volatile m5<o0> zzg;
    public int zzc;
    public int zzd;
    public long zze;

    static {
        o0 o0Var = new o0();
        zzf = o0Var;
        w3.zzd.put(o0.class, o0Var);
    }

    public final boolean a() {
        return (this.zzc & 1) != 0;
    }

    public final boolean k() {
        return (this.zzc & 2) != 0;
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<o0, a> implements g5 {
        public a() {
            super(o0.zzf);
        }

        public /* synthetic */ a(y0 y0Var) {
            super(o0.zzf);
        }
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (y0.a[i2 - 1]) {
            case 1:
                return new o0();
            case 2:
                return new a((y0) null);
            case 3:
                return new r5(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                m5<o0> m5Var = zzg;
                if (m5Var == null) {
                    synchronized (o0.class) {
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
