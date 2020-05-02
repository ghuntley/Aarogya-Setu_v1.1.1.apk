package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import i.c.d.f.d;
import i.c.d.f.e;
import i.c.d.f.h;
import i.c.d.f.i;
import i.c.d.f.q;
import i.c.d.j.c;
import i.c.d.m.f;
import i.c.d.m.g;
import java.util.Arrays;
import java.util.List;

@Keep
/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public class FirebaseInstallationsRegistrar implements i {
    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        return new f((FirebaseApp) eVar.a(FirebaseApp.class), (i.c.d.p.g) eVar.a(i.c.d.p.g.class), (c) eVar.a(c.class));
    }

    public List<d<?>> getComponents() {
        d.b<g> a = d.a(g.class);
        a.a(q.b(FirebaseApp.class));
        a.a(q.b(c.class));
        a.a(q.b(i.c.d.p.g.class));
        a.a((h<g>) i.c.d.m.h.a);
        return Arrays.asList(new d[]{a.a(), i.c.d.p.e.a("fire-installations", "16.1.0")});
    }
}
