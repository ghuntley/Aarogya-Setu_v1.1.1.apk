package i.c.a.a.j;

import i.c.a.a.j.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public abstract class f {

    /* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public static abstract class a {
        public abstract a a(long j2);

        public abstract a a(e eVar);

        public abstract a a(String str);

        public final a a(String str, String str2) {
            b().put(str, str2);
            return this;
        }

        public abstract f a();

        public abstract a b(long j2);

        public abstract Map<String, String> b();
    }

    public final String a(String str) {
        String str2 = ((a) this).f2930f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = ((a) this).f2930f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public a a() {
        a.b bVar = new a.b();
        a aVar = (a) this;
        bVar.a(aVar.a);
        bVar.f2931b = aVar.f2929b;
        bVar.a(aVar.c);
        bVar.a(aVar.d);
        bVar.b(aVar.e);
        bVar.f2932f = new HashMap(aVar.f2930f);
        return bVar;
    }
}
