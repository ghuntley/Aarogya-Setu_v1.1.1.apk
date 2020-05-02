package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class u0 extends w3<u0, b> implements g5 {
    public static final u0 zzf;
    public static volatile m5<u0> zzg;
    public int zzc;
    public int zzd = 1;
    public d4<q0> zze = s5.f3444h;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public enum a implements a4 {
        RADS(1),
        PROVISIONING(2);
        
        public final int e;

        /* access modifiers changed from: public */
        a(int i2) {
            this.e = i2;
        }

        public static c4 b() {
            return z0.a;
        }

        public final int a() {
            return this.e;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.e + " name=" + name() + '>';
        }

        public static a a(int i2) {
            if (i2 == 1) {
                return RADS;
            }
            if (i2 != 2) {
                return null;
            }
            return PROVISIONING;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class b extends w3.b<u0, b> implements g5 {
        public /* synthetic */ b(y0 y0Var) {
            super(u0.zzf);
        }
    }

    static {
        u0 u0Var = new u0();
        zzf = u0Var;
        w3.zzd.put(u0.class, u0Var);
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (y0.a[i2 - 1]) {
            case 1:
                return new u0();
            case 2:
                return new b((y0) null);
            case 3:
                return new r5(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zzc", "zzd", a.b(), "zze", q0.class});
            case 4:
                return zzf;
            case 5:
                m5<u0> m5Var = zzg;
                if (m5Var == null) {
                    synchronized (u0.class) {
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
