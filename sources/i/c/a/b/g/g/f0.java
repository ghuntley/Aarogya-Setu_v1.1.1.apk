package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class f0 extends w3<f0, a> implements g5 {
    public static final f0 zzh;
    public static volatile m5<f0> zzi;
    public int zzc;
    public int zzd;
    public String zze = "";
    public boolean zzf;
    public d4<String> zzg = s5.f3444h;

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<f0, a> implements g5 {
        public /* synthetic */ a(g0 g0Var) {
            super(f0.zzh);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public enum b implements a4 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        
        public final int e;

        /* access modifiers changed from: public */
        b(int i2) {
            this.e = i2;
        }

        public static c4 b() {
            return l0.a;
        }

        public final int a() {
            return this.e;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.e + " name=" + name() + '>';
        }

        public static b a(int i2) {
            switch (i2) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }
    }

    static {
        f0 f0Var = new f0();
        zzh = f0Var;
        w3.zzd.put(f0.class, f0Var);
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (g0.a[i2 - 1]) {
            case 1:
                return new f0();
            case 2:
                return new a((g0) null);
            case 3:
                return new r5(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzc", "zzd", b.b(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                m5<f0> m5Var = zzi;
                if (m5Var == null) {
                    synchronized (f0.class) {
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

    public final b k() {
        b a2 = b.a(this.zzd);
        return a2 == null ? b.UNKNOWN_MATCH_TYPE : a2;
    }

    public final int l() {
        return this.zzg.size();
    }
}
