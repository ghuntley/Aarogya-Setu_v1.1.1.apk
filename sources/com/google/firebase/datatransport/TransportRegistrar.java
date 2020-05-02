package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import i.c.a.a.b;
import i.c.a.a.g;
import i.c.a.a.i.a;
import i.c.a.a.j.b;
import i.c.a.a.j.d;
import i.c.a.a.j.h;
import i.c.a.a.j.m;
import i.c.d.f.d;
import i.c.d.f.e;
import i.c.d.f.i;
import i.c.d.f.q;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Keep
/* compiled from: com.google.firebase:firebase-datatransport@@17.0.3 */
public class TransportRegistrar implements i {
    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        Set<T> set;
        m.a((Context) eVar.a(Context.class));
        m a = m.a();
        a aVar = a.f2877g;
        if (a != null) {
            if (aVar instanceof d) {
                set = Collections.unmodifiableSet(aVar.b());
            } else {
                set = Collections.singleton(new b("proto"));
            }
            h.a a2 = h.a();
            a2.a(aVar.c());
            b.C0103b bVar = (b.C0103b) a2;
            bVar.f2934b = aVar.a();
            return new i.c.a.a.j.i(set, bVar.a(), a);
        }
        throw null;
    }

    public List<i.c.d.f.d<?>> getComponents() {
        d.b<g> a = i.c.d.f.d.a(g.class);
        a.a(q.b(Context.class));
        a.a((i.c.d.f.h<g>) i.c.d.g.a.a);
        return Collections.singletonList(a.a());
    }
}
