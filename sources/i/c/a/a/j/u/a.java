package i.c.a.a.j.u;

import android.util.SparseArray;
import i.c.a.a.d;
import java.util.EnumMap;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class a {
    public static SparseArray<d> a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static EnumMap<d, Integer> f3007b;

    static {
        EnumMap<d, Integer> enumMap = new EnumMap<>(d.class);
        f3007b = enumMap;
        enumMap.put(d.DEFAULT, 0);
        f3007b.put(d.VERY_LOW, 1);
        f3007b.put(d.HIGHEST, 2);
        for (d next : f3007b.keySet()) {
            a.append(f3007b.get(next).intValue(), next);
        }
    }

    public static d a(int i2) {
        d dVar = a.get(i2);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(i.a.a.a.a.b("Unknown Priority for value ", i2));
    }

    public static int a(d dVar) {
        Integer num = f3007b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }
}
