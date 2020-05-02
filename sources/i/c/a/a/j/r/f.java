package i.c.a.a.j.r;

import i.c.a.a.d;
import i.c.a.a.j.r.h.c;
import i.c.a.a.j.r.h.f;
import i.c.d.p.e;
import j.a.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import m.a.a;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class f implements b<i.c.a.a.j.r.h.f> {
    public final a<i.c.a.a.j.t.a> a;

    public f(a<i.c.a.a.j.t.a> aVar) {
        this.a = aVar;
    }

    public Object get() {
        i.c.a.a.j.t.a aVar = this.a.get();
        HashMap hashMap = new HashMap();
        d dVar = d.DEFAULT;
        f.a.C0105a a2 = f.a.a();
        a2.a(30000);
        a2.b(86400000);
        hashMap.put(dVar, a2.a());
        d dVar2 = d.HIGHEST;
        f.a.C0105a a3 = f.a.a();
        a3.a(1000);
        a3.b(86400000);
        hashMap.put(dVar2, a3.a());
        d dVar3 = d.VERY_LOW;
        f.a.C0105a a4 = f.a.a();
        a4.a(86400000);
        a4.b(86400000);
        Set<f.b> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new f.b[]{f.b.NETWORK_UNMETERED, f.b.DEVICE_IDLE})));
        c.b bVar = (c.b) a4;
        if (unmodifiableSet != null) {
            bVar.c = unmodifiableSet;
            hashMap.put(dVar3, bVar.a());
            if (aVar == null) {
                throw new NullPointerException("missing required property: clock");
            } else if (hashMap.keySet().size() >= d.values().length) {
                new HashMap();
                i.c.a.a.j.r.h.b bVar2 = new i.c.a.a.j.r.h.b(aVar, hashMap);
                e.a(bVar2, "Cannot return null from a non-@Nullable @Provides method");
                return bVar2;
            } else {
                throw new IllegalStateException("Not all priorities have been configured");
            }
        } else {
            throw new NullPointerException("Null flags");
        }
    }
}
