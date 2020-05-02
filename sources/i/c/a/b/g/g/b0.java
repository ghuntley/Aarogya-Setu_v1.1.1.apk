package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class b0 extends w3<b0, a> implements g5 {
    public static final b0 zzl;
    public static volatile m5<b0> zzm;
    public int zzc;
    public int zzd;
    public String zze = "";
    public d4<c0> zzf = s5.f3444h;
    public boolean zzg;
    public d0 zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;

    static {
        b0 b0Var = new b0();
        zzl = b0Var;
        w3.zzd.put(b0.class, b0Var);
    }

    public final boolean a() {
        return (this.zzc & 1) != 0;
    }

    public final int k() {
        return this.zzd;
    }

    public final boolean l() {
        return (this.zzc & 8) != 0;
    }

    public final boolean m() {
        return this.zzj;
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
    public static final class a extends w3.b<b0, a> implements g5 {
        public a() {
            super(b0.zzl);
        }

        public /* synthetic */ a(g0 g0Var) {
            super(b0.zzl);
        }
    }

    public static /* synthetic */ void a(b0 b0Var, String str) {
        if (b0Var != null) {
            str.getClass();
            b0Var.zzc |= 2;
            b0Var.zze = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(b0 b0Var, int i2, c0 c0Var) {
        if (b0Var != null) {
            c0Var.getClass();
            if (!b0Var.zzf.a()) {
                b0Var.zzf = w3.a(b0Var.zzf);
            }
            b0Var.zzf.set(i2, c0Var);
            return;
        }
        throw null;
    }

    public final Object a(int i2, Object obj, Object obj2) {
        switch (g0.a[i2 - 1]) {
            case 1:
                return new b0();
            case 2:
                return new a((g0) null);
            case 3:
                return new r5(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", c0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                m5<b0> m5Var = zzm;
                if (m5Var == null) {
                    synchronized (b0.class) {
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
