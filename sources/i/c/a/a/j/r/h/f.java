package i.c.a.a.j.r.h;

import i.c.a.a.d;
import i.c.a.a.j.r.h.c;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public abstract class f {

    /* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public static abstract class a {

        /* renamed from: i.c.a.a.j.r.h.f$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
        public static abstract class C0105a {
            public abstract C0105a a(long j2);

            public abstract a a();

            public abstract C0105a b(long j2);
        }

        public static C0105a a() {
            c.b bVar = new c.b();
            Set<b> emptySet = Collections.emptySet();
            if (emptySet != null) {
                bVar.c = emptySet;
                return bVar;
            }
            throw new NullPointerException("Null flags");
        }
    }

    /* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public long a(d dVar, long j2, int i2) {
        b bVar = (b) this;
        c cVar = (c) bVar.f2970b.get(dVar);
        return Math.min(Math.max(((long) Math.pow(2.0d, (double) (i2 - 1))) * cVar.a, j2 - bVar.a.a()), cVar.f2971b);
    }
}
