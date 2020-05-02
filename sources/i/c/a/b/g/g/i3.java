package i.c.a.b.g.g;

import i.c.a.b.g.g.w3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public class i3 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile i3 f3315b;
    public static volatile i3 c;
    public static final i3 d = new i3(true);
    public final Map<a, w3.f<?, ?>> a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static final class a {
        public final Object a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3316b;

        public a(Object obj, int i2) {
            this.a = obj;
            this.f3316b = i2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.f3316b == aVar.f3316b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.f3316b;
        }
    }

    public i3() {
        this.a = new HashMap();
    }

    public static i3 a() {
        i3 i3Var = f3315b;
        if (i3Var == null) {
            synchronized (i3.class) {
                i3Var = f3315b;
                if (i3Var == null) {
                    i3Var = d;
                    f3315b = i3Var;
                }
            }
        }
        return i3Var;
    }

    public static i3 b() {
        Class<i3> cls = i3.class;
        i3 i3Var = c;
        if (i3Var != null) {
            return i3Var;
        }
        synchronized (cls) {
            i3 i3Var2 = c;
            if (i3Var2 != null) {
                return i3Var2;
            }
            i3 a2 = u3.a(cls);
            c = a2;
            return a2;
        }
    }

    public i3(boolean z) {
        this.a = Collections.emptyMap();
    }
}
