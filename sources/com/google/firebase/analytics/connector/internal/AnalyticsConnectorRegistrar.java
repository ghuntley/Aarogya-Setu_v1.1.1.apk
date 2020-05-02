package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import i.c.d.e.a.a;
import i.c.d.f.d;
import i.c.d.f.h;
import i.c.d.f.i;
import i.c.d.f.q;
import i.c.d.p.e;
import java.util.Arrays;
import java.util.List;

@Keep
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.3.0 */
public class AnalyticsConnectorRegistrar implements i {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<d<?>> getComponents() {
        d.b<a> a = d.a(a.class);
        a.a(q.b(FirebaseApp.class));
        a.a(q.b(Context.class));
        a.a(q.b(i.c.d.i.d.class));
        a.a((h<a>) i.c.d.e.a.c.a.a);
        a.a(2);
        return Arrays.asList(new d[]{a.a(), e.a("fire-analytics", "17.3.0")});
    }
}
