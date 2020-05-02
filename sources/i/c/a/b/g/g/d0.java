package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class d0 extends w3<d0, b> implements g5 {
    public static final d0 zzi;
    public static volatile m5<d0> zzj;
    public int zzc;
    public int zzd;
    public boolean zze;
    public String zzf = "";
    public String zzg = "";
    public String zzh = "";

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public enum a implements a4 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        
        public final int e;

        /* access modifiers changed from: public */
        a(int i2) {
            this.e = i2;
        }

        public static c4 b() {
            return h0.a;
        }

        public final int a() {
            return this.e;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.e + " name=" + name() + '>';
        }

        public static a a(int i2) {
            if (i2 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i2 == 1) {
                return LESS_THAN;
            }
            if (i2 == 2) {
                return GREATER_THAN;
            }
            if (i2 == 3) {
                return EQUAL;
            }
            if (i2 != 4) {
                return null;
            }
            return BETWEEN;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class b extends w3.b<d0, b> implements g5 {
        public /* synthetic */ b(g0 g0Var) {
            super(d0.zzi);
        }
    }

    static {
        d0 d0Var = new d0();
        zzi = d0Var;
        w3.zzd.put(d0.class, d0Var);
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (g0.a[i2 - 1]) {
            case 1:
                return new d0();
            case 2:
                return new b((g0) null);
            case 3:
                return new r5(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzc", "zzd", a.b(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                m5<d0> m5Var = zzj;
                if (m5Var == null) {
                    synchronized (d0.class) {
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

    public final a k() {
        a a2 = a.a(this.zzd);
        return a2 == null ? a.UNKNOWN_COMPARISON_TYPE : a2;
    }
}
