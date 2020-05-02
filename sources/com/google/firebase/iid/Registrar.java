package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import i.c.d.f.d;
import i.c.d.f.h;
import i.c.d.f.i;
import i.c.d.f.q;
import i.c.d.j.c;
import i.c.d.k.t;
import i.c.d.k.u;
import i.c.d.p.e;
import i.c.d.p.g;
import java.util.Arrays;
import java.util.List;

@Keep
/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class Registrar implements i {

    /* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
    public static class a implements i.c.d.k.b.a {
        public a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    @Keep
    public final List<d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        d.b<FirebaseInstanceId> a2 = d.a(cls);
        a2.a(q.b(FirebaseApp.class));
        a2.a(q.b(i.c.d.i.d.class));
        a2.a(q.b(g.class));
        a2.a(q.b(c.class));
        a2.a(q.b(i.c.d.m.g.class));
        a2.a((h<FirebaseInstanceId>) u.a);
        a2.a(1);
        d<FirebaseInstanceId> a3 = a2.a();
        d.b<i.c.d.k.b.a> a4 = d.a(i.c.d.k.b.a.class);
        a4.a(q.b(cls));
        a4.a((h<i.c.d.k.b.a>) t.a);
        return Arrays.asList(new d[]{a3, a4.a(), e.a("fire-iid", "20.1.2")});
    }
}
