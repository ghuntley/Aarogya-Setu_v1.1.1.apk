package i.c.a.b.g.g;

import com.google.android.gms.internal.measurement.zzen;
import i.c.a.b.g.g.w3;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class u5 {
    public static final Class<?> a;

    /* renamed from: b  reason: collision with root package name */
    public static final g6<?, ?> f3474b = a(false);
    public static final g6<?, ?> c = a(true);
    public static final g6<?, ?> d = new h6();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
    }

    public static void a(Class<?> cls) {
        Class<?> cls2;
        if (!w3.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void b(int i2, List<Float> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                int i3 = 0;
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        list.get(i5).floatValue();
                        i4 += 4;
                    }
                    h3Var.a.b(i4);
                    while (i3 < list.size()) {
                        zzen zzen = h3Var.a;
                        float floatValue = list.get(i3).floatValue();
                        if (zzen != null) {
                            zzen.c(Float.floatToRawIntBits(floatValue));
                            i3++;
                        } else {
                            throw null;
                        }
                    }
                    return;
                }
                while (i3 < list.size()) {
                    zzen zzen2 = h3Var.a;
                    float floatValue2 = list.get(i3).floatValue();
                    if (zzen2 != null) {
                        int floatToRawIntBits = Float.floatToRawIntBits(floatValue2);
                        zzen.a aVar = (zzen.a) zzen2;
                        aVar.b((i2 << 3) | 5);
                        aVar.c(floatToRawIntBits);
                        i3++;
                    } else {
                        throw null;
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static void c(int i2, List<Long> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += zzen.c(list.get(i4).longValue());
                    }
                    h3Var.a.b(i3);
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        h3Var.a.a(list.get(i5).longValue());
                    }
                    return;
                }
                for (int i6 = 0; i6 < list.size(); i6++) {
                    zzen zzen = h3Var.a;
                    long longValue = list.get(i6).longValue();
                    zzen.a aVar = (zzen.a) zzen;
                    aVar.b((i2 << 3) | 0);
                    aVar.a(longValue);
                }
                return;
            }
            throw null;
        }
    }

    public static void d(int i2, List<Long> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += zzen.c(list.get(i4).longValue());
                    }
                    h3Var.a.b(i3);
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        h3Var.a.a(list.get(i5).longValue());
                    }
                    return;
                }
                for (int i6 = 0; i6 < list.size(); i6++) {
                    zzen zzen = h3Var.a;
                    long longValue = list.get(i6).longValue();
                    zzen.a aVar = (zzen.a) zzen;
                    aVar.b((i2 << 3) | 0);
                    aVar.a(longValue);
                }
                return;
            }
            throw null;
        }
    }

    public static void e(int i2, List<Long> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += zzen.d(list.get(i4).longValue());
                    }
                    h3Var.a.b(i3);
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        h3Var.a.a(zzen.e(list.get(i5).longValue()));
                    }
                    return;
                }
                int i6 = 0;
                while (i6 < list.size()) {
                    zzen zzen = h3Var.a;
                    long longValue = list.get(i6).longValue();
                    if (zzen != null) {
                        long e = zzen.e(longValue);
                        zzen.a aVar = (zzen.a) zzen;
                        aVar.b((i2 << 3) | 0);
                        aVar.a(e);
                        i6++;
                    } else {
                        throw null;
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static void f(int i2, List<Long> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                int i3 = 0;
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        list.get(i5).longValue();
                        i4 += 8;
                    }
                    h3Var.a.b(i4);
                    while (i3 < list.size()) {
                        h3Var.a.b(list.get(i3).longValue());
                        i3++;
                    }
                    return;
                }
                while (i3 < list.size()) {
                    zzen zzen = h3Var.a;
                    long longValue = list.get(i3).longValue();
                    zzen.a aVar = (zzen.a) zzen;
                    aVar.b((i2 << 3) | 1);
                    aVar.b(longValue);
                    i3++;
                }
                return;
            }
            throw null;
        }
    }

    public static void g(int i2, List<Long> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                int i3 = 0;
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        list.get(i5).longValue();
                        i4 += 8;
                    }
                    h3Var.a.b(i4);
                    while (i3 < list.size()) {
                        h3Var.a.b(list.get(i3).longValue());
                        i3++;
                    }
                    return;
                }
                while (i3 < list.size()) {
                    zzen zzen = h3Var.a;
                    long longValue = list.get(i3).longValue();
                    zzen.a aVar = (zzen.a) zzen;
                    aVar.b((i2 << 3) | 1);
                    aVar.b(longValue);
                    i3++;
                }
                return;
            }
            throw null;
        }
    }

    public static void h(int i2, List<Integer> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                int i3 = 0;
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        i4 += zzen.g(list.get(i5).intValue());
                    }
                    h3Var.a.b(i4);
                    while (i3 < list.size()) {
                        h3Var.a.a(list.get(i3).intValue());
                        i3++;
                    }
                    return;
                }
                while (i3 < list.size()) {
                    h3Var.a.a(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            throw null;
        }
    }

    public static void i(int i2, List<Integer> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += zzen.h(list.get(i4).intValue());
                    }
                    h3Var.a.b(i3);
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        h3Var.a.b(list.get(i5).intValue());
                    }
                    return;
                }
                for (int i6 = 0; i6 < list.size(); i6++) {
                    zzen zzen = h3Var.a;
                    int intValue = list.get(i6).intValue();
                    zzen.a aVar = (zzen.a) zzen;
                    aVar.b((i2 << 3) | 0);
                    aVar.b(intValue);
                }
                return;
            }
            throw null;
        }
    }

    public static void j(int i2, List<Integer> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        i3 += zzen.j(list.get(i4).intValue());
                    }
                    h3Var.a.b(i3);
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        h3Var.a.b(zzen.n(list.get(i5).intValue()));
                    }
                    return;
                }
                int i6 = 0;
                while (i6 < list.size()) {
                    zzen zzen = h3Var.a;
                    int intValue = list.get(i6).intValue();
                    if (zzen != null) {
                        int n2 = zzen.n(intValue);
                        zzen.a aVar = (zzen.a) zzen;
                        aVar.b((i2 << 3) | 0);
                        aVar.b(n2);
                        i6++;
                    } else {
                        throw null;
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static void k(int i2, List<Integer> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                int i3 = 0;
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        list.get(i5).intValue();
                        i4 += 4;
                    }
                    h3Var.a.b(i4);
                    while (i3 < list.size()) {
                        h3Var.a.c(list.get(i3).intValue());
                        i3++;
                    }
                    return;
                }
                while (i3 < list.size()) {
                    zzen zzen = h3Var.a;
                    int intValue = list.get(i3).intValue();
                    zzen.a aVar = (zzen.a) zzen;
                    aVar.b((i2 << 3) | 5);
                    aVar.c(intValue);
                    i3++;
                }
                return;
            }
            throw null;
        }
    }

    public static void l(int i2, List<Integer> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                int i3 = 0;
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        list.get(i5).intValue();
                        i4 += 4;
                    }
                    h3Var.a.b(i4);
                    while (i3 < list.size()) {
                        h3Var.a.c(list.get(i3).intValue());
                        i3++;
                    }
                    return;
                }
                while (i3 < list.size()) {
                    zzen zzen = h3Var.a;
                    int intValue = list.get(i3).intValue();
                    zzen.a aVar = (zzen.a) zzen;
                    aVar.b((i2 << 3) | 5);
                    aVar.c(intValue);
                    i3++;
                }
                return;
            }
            throw null;
        }
    }

    public static void m(int i2, List<Integer> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                int i3 = 0;
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        i4 += zzen.g(list.get(i5).intValue());
                    }
                    h3Var.a.b(i4);
                    while (i3 < list.size()) {
                        h3Var.a.a(list.get(i3).intValue());
                        i3++;
                    }
                    return;
                }
                while (i3 < list.size()) {
                    h3Var.a.a(i2, list.get(i3).intValue());
                    i3++;
                }
                return;
            }
            throw null;
        }
    }

    public static void n(int i2, List<Boolean> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        list.get(i4).booleanValue();
                        i3++;
                    }
                    h3Var.a.b(i3);
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        h3Var.a.a(list.get(i5).booleanValue() ? (byte) 1 : 0);
                    }
                    return;
                }
                for (int i6 = 0; i6 < list.size(); i6++) {
                    zzen zzen = h3Var.a;
                    boolean booleanValue = list.get(i6).booleanValue();
                    zzen.a aVar = (zzen.a) zzen;
                    aVar.b((i2 << 3) | 0);
                    aVar.a(booleanValue ? (byte) 1 : 0);
                }
                return;
            }
            throw null;
        }
    }

    public static void a(int i2, List<Double> list, b7 b7Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                int i3 = 0;
                if (z) {
                    ((zzen.a) h3Var.a).b((i2 << 3) | 2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        list.get(i5).doubleValue();
                        i4 += 8;
                    }
                    h3Var.a.b(i4);
                    while (i3 < list.size()) {
                        zzen zzen = h3Var.a;
                        double doubleValue = list.get(i3).doubleValue();
                        if (zzen != null) {
                            zzen.b(Double.doubleToRawLongBits(doubleValue));
                            i3++;
                        } else {
                            throw null;
                        }
                    }
                    return;
                }
                while (i3 < list.size()) {
                    zzen zzen2 = h3Var.a;
                    double doubleValue2 = list.get(i3).doubleValue();
                    if (zzen2 != null) {
                        long doubleToRawLongBits = Double.doubleToRawLongBits(doubleValue2);
                        zzen.a aVar = (zzen.a) zzen2;
                        aVar.b((i2 << 3) | 1);
                        aVar.b(doubleToRawLongBits);
                        i3++;
                    } else {
                        throw null;
                    }
                }
                return;
            }
            throw null;
        }
    }

    public static int h(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzen.f(i2) * size) + f(list);
    }

    public static int d(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzen.f(i2) * size) + b(list);
    }

    public static int f(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzen.f(i2) * size) + d(list);
    }

    public static int i(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzen.f(i2) * size) + g(list);
    }

    public static int k(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzen.i(i2) * size;
    }

    public static int h(List<?> list) {
        return list.size() << 2;
    }

    public static int g(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzen.f(i2) * size) + e(list);
    }

    public static int l(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzen.e(i2) * size;
    }

    public static void b(int i2, List<u2> list, b7 b7Var) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    zzen.a aVar = (zzen.a) h3Var.a;
                    aVar.b((i2 << 3) | 2);
                    aVar.b(list.get(i3));
                }
                return;
            }
            throw null;
        }
    }

    public static int c(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t4) {
            t4 t4Var = (t4) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.d(t4Var.b(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzen.d(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int d(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z3) {
            z3 z3Var = (z3) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.g(z3Var.c(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzen.g(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int e(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzen.f(i2) * size) + c(list);
    }

    public static int f(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z3) {
            z3 z3Var = (z3) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.h(z3Var.c(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzen.h(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int i(List<?> list) {
        return list.size() << 3;
    }

    public static int j(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzen.l(i2) * size;
    }

    public static int g(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z3) {
            z3 z3Var = (z3) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.j(z3Var.c(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzen.j(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int j(List<?> list) {
        return list.size();
    }

    public static void a(int i2, List<String> list, b7 b7Var) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                int i3 = 0;
                if (list instanceof l4) {
                    l4 l4Var = (l4) list;
                    while (i3 < list.size()) {
                        Object b2 = l4Var.b(i3);
                        if (b2 instanceof String) {
                            zzen.a aVar = (zzen.a) h3Var.a;
                            aVar.b((i2 << 3) | 2);
                            aVar.b((String) b2);
                        } else {
                            zzen.a aVar2 = (zzen.a) h3Var.a;
                            aVar2.b((i2 << 3) | 2);
                            aVar2.b((u2) b2);
                        }
                        i3++;
                    }
                    return;
                }
                while (i3 < list.size()) {
                    zzen.a aVar3 = (zzen.a) h3Var.a;
                    aVar3.b((i2 << 3) | 2);
                    aVar3.b(list.get(i3));
                    i3++;
                }
                return;
            }
            throw null;
        }
    }

    public static int e(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z3) {
            z3 z3Var = (z3) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.g(z3Var.c(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzen.g(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int c(int i2, List<u2> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f2 = zzen.f(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            f2 += zzen.a(list.get(i3));
        }
        return f2;
    }

    public static void b(int i2, List<?> list, b7 b7Var, t5 t5Var) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    h3Var.b(i2, list.get(i3), t5Var);
                }
                return;
            }
            throw null;
        }
    }

    public static int b(int i2, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzen.f(i2) * list.size()) + a((List<Long>) list);
    }

    public static int b(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t4) {
            t4 t4Var = (t4) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.c(t4Var.b(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzen.c(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int b(int i2, List<f5> list, t5 t5Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzen.a(i2, list.get(i4), t5Var);
        }
        return i3;
    }

    public static void a(int i2, List<?> list, b7 b7Var, t5 t5Var) {
        if (list != null && !list.isEmpty()) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    h3Var.a(i2, list.get(i3), t5Var);
                }
                return;
            }
            throw null;
        }
    }

    public static int a(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t4) {
            t4 t4Var = (t4) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzen.c(t4Var.b(i3));
                i3++;
            }
        } else {
            int i4 = 0;
            while (i3 < size) {
                i4 = i2 + zzen.c(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int a(int i2, List<?> list) {
        int i3;
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int f2 = zzen.f(i2) * size;
        if (list instanceof l4) {
            l4 l4Var = (l4) list;
            while (i5 < size) {
                Object b2 = l4Var.b(i5);
                if (b2 instanceof u2) {
                    i4 = zzen.a((u2) b2);
                } else {
                    i4 = zzen.a((String) b2);
                }
                f2 = i4 + f2;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                if (obj instanceof u2) {
                    i3 = zzen.a((u2) obj);
                } else {
                    i3 = zzen.a((String) obj);
                }
                f2 = i3 + f2;
                i5++;
            }
        }
        return f2;
    }

    public static int a(int i2, Object obj, t5 t5Var) {
        if (obj instanceof j4) {
            int f2 = zzen.f(i2);
            int a2 = ((j4) obj).a();
            return zzen.h(a2) + a2 + f2;
        }
        return zzen.a((f5) obj, t5Var) + zzen.f(i2);
    }

    public static int a(int i2, List<?> list, t5 t5Var) {
        int i3;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f2 = zzen.f(i2) * size;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            if (obj instanceof j4) {
                i3 = zzen.a((j4) obj);
            } else {
                i3 = zzen.a((f5) obj, t5Var);
            }
            f2 = i3 + f2;
        }
        return f2;
    }

    public static g6<?, ?> a(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (g6) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T> void a(y4 y4Var, T t, T t2, long j2) {
        l6.a((Object) t, j2, y4Var.a(l6.f(t, j2), l6.f(t2, j2)));
    }

    public static <T, FT extends q3<FT>> void a(k3<FT> k3Var, T t, T t2) {
        if (((m3) k3Var) != null) {
            o3<w3.c> o3Var = ((w3.d) t2).zzc;
            if (!o3Var.a.isEmpty()) {
                o3<w3.c> a2 = ((w3.d) t).a();
                if (a2 != null) {
                    for (int i2 = 0; i2 < o3Var.a.b(); i2++) {
                        a2.a((Map.Entry<w3.c, Object>) o3Var.a.a(i2));
                    }
                    for (Map.Entry<T, Object> a3 : o3Var.a.c()) {
                        a2.a((Map.Entry<w3.c, Object>) a3);
                    }
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }

    public static <T, UT, UB> void a(g6<UT, UB> g6Var, T t, T t2) {
        if (((h6) g6Var) != null) {
            w3 w3Var = (w3) t;
            i6 i6Var = w3Var.zzb;
            i6 i6Var2 = ((w3) t2).zzb;
            if (!i6Var2.equals(i6.f3317f)) {
                int i2 = i6Var.a + i6Var2.a;
                int[] copyOf = Arrays.copyOf(i6Var.f3318b, i2);
                System.arraycopy(i6Var2.f3318b, 0, copyOf, i6Var.a, i6Var2.a);
                Object[] copyOf2 = Arrays.copyOf(i6Var.c, i2);
                System.arraycopy(i6Var2.c, 0, copyOf2, i6Var.a, i6Var2.a);
                i6Var = new i6(i2, copyOf, copyOf2, true);
            }
            w3Var.zzb = i6Var;
            return;
        }
        throw null;
    }

    public static <UT, UB> UB a(int i2, List<Integer> list, c4 c4Var, UB ub, g6<UT, UB> g6Var) {
        if (c4Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (c4Var.a(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub = a(i2, intValue, ub, g6Var);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!c4Var.a(intValue2)) {
                    ub = a(i2, intValue2, ub, g6Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static <UT, UB> UB a(int i2, int i3, UB ub, g6<UT, UB> g6Var) {
        if (ub == null) {
            if (((h6) g6Var) != null) {
                ub = i6.b();
            } else {
                throw null;
            }
        }
        long j2 = (long) i3;
        if (((h6) g6Var) != null) {
            ((i6) ub).a(i2 << 3, Long.valueOf(j2));
            return ub;
        }
        throw null;
    }
}
