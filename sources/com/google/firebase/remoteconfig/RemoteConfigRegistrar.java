package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import i.c.d.d.c.a;
import i.c.d.f.d;
import i.c.d.f.e;
import i.c.d.f.h;
import i.c.d.f.i;
import i.c.d.f.q;
import i.c.d.q.k;
import i.c.d.q.l;
import java.util.Arrays;
import java.util.List;

@Keep
/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class RemoteConfigRegistrar implements i {
    public static /* synthetic */ k lambda$getComponents$0(e eVar) {
        return new k((Context) eVar.a(Context.class), (FirebaseApp) eVar.a(FirebaseApp.class), (FirebaseInstanceId) eVar.a(FirebaseInstanceId.class), ((a) eVar.a(a.class)).a("frc"), (i.c.d.e.a.a) eVar.a(i.c.d.e.a.a.class));
    }

    public List<d<?>> getComponents() {
        d.b<k> a = d.a(k.class);
        a.a(q.b(Context.class));
        a.a(q.b(FirebaseApp.class));
        a.a(q.b(FirebaseInstanceId.class));
        a.a(q.b(a.class));
        a.a(q.a(i.c.d.e.a.a.class));
        a.a((h<k>) l.a);
        a.a(2);
        return Arrays.asList(new d[]{a.a(), i.c.d.p.e.a("fire-rc", "19.1.3")});
    }
}
