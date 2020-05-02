package i.c.a.a.j.r.i;

import i.c.a.a.j.r.i.a;
import l.a.a.a.o.b.a;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public abstract class d {
    public static final d a;

    static {
        Long l2 = 10485760L;
        Integer num = 200;
        Integer valueOf = Integer.valueOf(a.DEFAULT_TIMEOUT);
        Long l3 = 604800000L;
        String str = l2 == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            str = i.a.a.a.a.b(str, " loadBatchSize");
        }
        if (valueOf == null) {
            str = i.a.a.a.a.b(str, " criticalSectionEnterTimeoutMs");
        }
        if (l3 == null) {
            str = i.a.a.a.a.b(str, " eventCleanUpAge");
        }
        if (str.isEmpty()) {
            a = new a(l2.longValue(), num.intValue(), valueOf.intValue(), l3.longValue(), (a.C0106a) null);
            return;
        }
        throw new IllegalStateException(i.a.a.a.a.b("Missing required properties:", str));
    }
}
