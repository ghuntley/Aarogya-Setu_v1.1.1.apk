package i.c.a.b.g.g;

import com.google.android.gms.internal.measurement.zzen;
import i.c.a.b.g.g.q3;
import i.c.a.b.g.g.w3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class o3<T extends q3<T>> {
    public static final o3 d = new o3(true);
    public final x5<T, Object> a = x5.c(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f3378b;
    public boolean c;

    public o3() {
    }

    public final void a() {
        if (!this.f3378b) {
            this.a.a();
            this.f3378b = true;
        }
    }

    public final Iterator<Map.Entry<T, Object>> b() {
        if (this.c) {
            return new k4(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final boolean c() {
        for (int i2 = 0; i2 < this.a.b(); i2++) {
            if (!b(this.a.a(i2))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> b2 : this.a.c()) {
            if (!b(b2)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        o3 o3Var = new o3();
        for (int i2 = 0; i2 < this.a.b(); i2++) {
            Map.Entry<T, Object> a2 = this.a.a(i2);
            o3Var.a((q3) a2.getKey(), a2.getValue());
        }
        for (Map.Entry next : this.a.c()) {
            o3Var.a((q3) next.getKey(), next.getValue());
        }
        o3Var.c = this.c;
        return o3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        return this.a.equals(((o3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public o3(boolean z) {
        a();
        a();
    }

    public static <T extends q3<T>> boolean b(Map.Entry<T, Object> entry) {
        q3 q3Var = (q3) entry.getKey();
        if (q3Var.c() == y6.MESSAGE) {
            if (q3Var.d()) {
                for (f5 d2 : (List) entry.getValue()) {
                    if (!d2.d()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof f5) {
                    if (!((f5) value).d()) {
                        return false;
                    }
                } else if (value instanceof f4) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void a(T t, Object obj) {
        if (!t.d()) {
            a(t.b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                a(t.b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof f4) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    public static int c(Map.Entry<T, Object> entry) {
        int c2;
        int f2;
        int e;
        int h2;
        q3 q3Var = (q3) entry.getKey();
        Object value = entry.getValue();
        if (q3Var.c() != y6.MESSAGE || q3Var.d() || q3Var.e()) {
            return b((q3<?>) q3Var, value);
        }
        if (value instanceof f4) {
            c2 = zzen.c(2, ((q3) entry.getKey()).a()) + (zzen.f(1) << 1);
            f2 = zzen.f(3);
            e = ((f4) value).a();
            h2 = zzen.h(e);
        } else {
            c2 = zzen.c(2, ((q3) entry.getKey()).a()) + (zzen.f(1) << 1);
            f2 = zzen.f(3);
            e = ((f5) value).e();
            h2 = zzen.h(e);
        }
        return h2 + e + f2 + c2;
    }

    public static int b(v6 v6Var, Object obj) {
        switch (n3.f3368b[v6Var.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                zzen.c();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                zzen.b();
                return 4;
            case 3:
                return zzen.c(((Long) obj).longValue());
            case 4:
                return zzen.c(((Long) obj).longValue());
            case 5:
                return zzen.g(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                zzen.e();
                return 8;
            case 7:
                ((Integer) obj).intValue();
                zzen.g();
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                zzen.d();
                return 1;
            case 9:
                return zzen.b((f5) obj);
            case 10:
                if (obj instanceof f4) {
                    return zzen.a((j4) (f4) obj);
                }
                return zzen.a((f5) obj);
            case 11:
                if (obj instanceof u2) {
                    return zzen.a((u2) obj);
                }
                return zzen.a((String) obj);
            case 12:
                if (obj instanceof u2) {
                    return zzen.a((u2) obj);
                }
                return zzen.b((byte[]) obj);
            case 13:
                return zzen.h(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                zzen.h();
                return 4;
            case 15:
                ((Long) obj).longValue();
                zzen.f();
                return 8;
            case 16:
                return zzen.j(((Integer) obj).intValue());
            case 17:
                return zzen.d(((Long) obj).longValue());
            case 18:
                if (obj instanceof a4) {
                    return zzen.g(((a4) obj).a());
                }
                return zzen.g(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if ((r2 instanceof byte[]) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        if (r1 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if ((r2 instanceof i.c.a.b.g.g.f4) == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r2 instanceof i.c.a.b.g.g.a4) == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(i.c.a.b.g.g.v6 r1, java.lang.Object r2) {
        /*
            i.c.a.b.g.g.y3.a(r2)
            int[] r0 = i.c.a.b.g.g.n3.a
            i.c.a.b.g.g.y6 r1 = r1.e
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L_0x003c;
                case 2: goto L_0x0039;
                case 3: goto L_0x0036;
                case 4: goto L_0x0033;
                case 5: goto L_0x0030;
                case 6: goto L_0x002d;
                case 7: goto L_0x0023;
                case 8: goto L_0x001a;
                case 9: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x003f
        L_0x0011:
            boolean r1 = r2 instanceof i.c.a.b.g.g.f5
            if (r1 != 0) goto L_0x002b
            boolean r1 = r2 instanceof i.c.a.b.g.g.f4
            if (r1 == 0) goto L_0x003f
            goto L_0x002b
        L_0x001a:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x002b
            boolean r1 = r2 instanceof i.c.a.b.g.g.a4
            if (r1 == 0) goto L_0x003f
            goto L_0x002b
        L_0x0023:
            boolean r1 = r2 instanceof i.c.a.b.g.g.u2
            if (r1 != 0) goto L_0x002b
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L_0x003f
        L_0x002b:
            r1 = 1
            goto L_0x0040
        L_0x002d:
            boolean r1 = r2 instanceof java.lang.String
            goto L_0x0040
        L_0x0030:
            boolean r1 = r2 instanceof java.lang.Boolean
            goto L_0x0040
        L_0x0033:
            boolean r1 = r2 instanceof java.lang.Double
            goto L_0x0040
        L_0x0036:
            boolean r1 = r2 instanceof java.lang.Float
            goto L_0x0040
        L_0x0039:
            boolean r1 = r2 instanceof java.lang.Long
            goto L_0x0040
        L_0x003c:
            boolean r1 = r2 instanceof java.lang.Integer
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x0043
            return
        L_0x0043:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.o3.a(i.c.a.b.g.g.v6, java.lang.Object):void");
    }

    public static Object a(Object obj) {
        if (obj instanceof i5) {
            return ((i5) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final void a(Map.Entry<T, Object> entry) {
        Object obj;
        q3 q3Var = (q3) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof f4) {
            f4 f4Var = (f4) value;
            f4.c();
            throw null;
        } else if (q3Var.d()) {
            Object obj2 = this.a.get(q3Var);
            if (!(obj2 instanceof f4)) {
                if (obj2 == null) {
                    obj2 = new ArrayList();
                }
                for (Object a2 : (List) value) {
                    ((List) obj2).add(a(a2));
                }
                this.a.put(q3Var, obj2);
                return;
            }
            f4 f4Var2 = (f4) obj2;
            f4.c();
            throw null;
        } else if (q3Var.c() == y6.MESSAGE) {
            Object obj3 = this.a.get(q3Var);
            if (obj3 instanceof f4) {
                f4 f4Var3 = (f4) obj3;
                f4.c();
                throw null;
            } else if (obj3 == null) {
                this.a.put(q3Var, a(value));
            } else {
                if (obj3 instanceof i5) {
                    obj = q3Var.a((i5) obj3, (i5) value);
                } else {
                    obj = ((w3.b) q3Var.a(((f5) obj3).g(), (f5) value)).k();
                }
                this.a.put(q3Var, obj);
            }
        } else {
            this.a.put(q3Var, a(value));
        }
    }

    public static int b(q3<?> q3Var, Object obj) {
        v6 b2 = q3Var.b();
        int a2 = q3Var.a();
        if (!q3Var.d()) {
            return a(b2, a2, obj);
        }
        int i2 = 0;
        if (q3Var.e()) {
            for (Object b3 : (List) obj) {
                i2 += b(b2, b3);
            }
            return zzen.f(a2) + i2 + zzen.h(i2);
        }
        for (Object a3 : (List) obj) {
            i2 += a(b2, a2, a3);
        }
        return i2;
    }

    public static int a(v6 v6Var, int i2, Object obj) {
        int f2 = zzen.f(i2);
        if (v6Var == v6.GROUP) {
            f5 f5Var = (f5) obj;
            if (f5Var instanceof n2) {
                n2 n2Var = (n2) f5Var;
            }
            f2 <<= 1;
        }
        return b(v6Var, obj) + f2;
    }
}
