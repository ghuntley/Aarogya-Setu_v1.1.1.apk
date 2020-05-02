package i.c.a.b.g.g;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class b5 implements y4 {
    public final Map<?, ?> a(Object obj) {
        return (z4) obj;
    }

    public final boolean b(Object obj) {
        return !((z4) obj).e;
    }

    public final Map<?, ?> c(Object obj) {
        return (z4) obj;
    }

    public final Object d(Object obj) {
        ((z4) obj).e = false;
        return obj;
    }

    public final w4<?, ?> e(Object obj) {
        x4 x4Var = (x4) obj;
        throw new NoSuchMethodError();
    }

    public final Object f(Object obj) {
        z4 z4Var = z4.f3551f;
        return z4Var.isEmpty() ? new z4() : new z4(z4Var);
    }

    public final Object a(Object obj, Object obj2) {
        z4 z4Var = (z4) obj;
        z4 z4Var2 = (z4) obj2;
        if (!z4Var2.isEmpty()) {
            if (!z4Var.e) {
                z4Var = z4Var.isEmpty() ? new z4() : new z4(z4Var);
            }
            z4Var.b();
            if (!z4Var2.isEmpty()) {
                z4Var.putAll(z4Var2);
            }
        }
        return z4Var;
    }

    public final int a(int i2, Object obj, Object obj2) {
        z4 z4Var = (z4) obj;
        x4 x4Var = (x4) obj2;
        if (z4Var.isEmpty()) {
            return 0;
        }
        Iterator it = z4Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
