package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import i.c.d.d.c.a;
import i.c.d.d.c.b;
import i.c.d.f.d;
import i.c.d.f.e;
import i.c.d.f.h;
import i.c.d.f.i;
import i.c.d.f.q;
import java.util.Arrays;
import java.util.List;

@Keep
/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public class AbtRegistrar implements i {
    public static /* synthetic */ a lambda$getComponents$0(e eVar) {
        return new a((Context) eVar.a(Context.class), (i.c.d.e.a.a) eVar.a(i.c.d.e.a.a.class));
    }

    public List<d<?>> getComponents() {
        d.b<a> a = d.a(a.class);
        a.a(q.b(Context.class));
        a.a(q.a(i.c.d.e.a.a.class));
        a.a((h<a>) b.a);
        return Arrays.asList(new d[]{a.a(), i.c.d.p.e.a("fire-abt", "19.0.1")});
    }
}
