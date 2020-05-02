package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.iid.FirebaseInstanceId;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.d;
import i.c.a.b.g.g.pc;
import i.c.a.b.g.g.rc;
import i.c.a.b.i.a.oa;
import i.c.a.b.i.a.s5;
import i.c.a.b.i.a.s7;
import i.c.a.b.i.a.t6;
import i.c.d.e.b;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.3.0 */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics d;
    public final s5 a;

    /* renamed from: b  reason: collision with root package name */
    public final rc f697b;
    public final boolean c;

    public FirebaseAnalytics(s5 s5Var) {
        q.a(s5Var);
        this.a = s5Var;
        this.f697b = null;
        this.c = false;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (d == null) {
            synchronized (FirebaseAnalytics.class) {
                if (d == null) {
                    if (rc.a(context)) {
                        d = new FirebaseAnalytics(rc.a(context, (String) null, (String) null, (String) null, (Bundle) null));
                    } else {
                        d = new FirebaseAnalytics(s5.a(context, (pc) null));
                    }
                }
            }
        }
        return d;
    }

    @Keep
    public static s7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        rc a2;
        if (rc.a(context) && (a2 = rc.a(context, (String) null, (String) null, (String) null, bundle)) != null) {
            return new b(a2);
        }
        return null;
    }

    public final void a(String str, Bundle bundle) {
        if (this.c) {
            this.f697b.a((String) null, str, bundle, false, true, (Long) null);
            return;
        }
        t6 o2 = this.a.o();
        if (((c) o2.a.f3868n) != null) {
            o2.a("app", str, bundle, false, true, System.currentTimeMillis());
            return;
        }
        throw null;
    }

    @Keep
    public final String getFirebaseInstanceId() {
        FirebaseInstanceId g2 = FirebaseInstanceId.g();
        FirebaseInstanceId.a(g2.f701b);
        g2.d();
        return g2.f();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.c) {
            rc rcVar = this.f697b;
            if (rcVar != null) {
                rcVar.c.execute(new d(rcVar, activity, str, str2));
                return;
            }
            throw null;
        } else if (!oa.a()) {
            this.a.n().f3761i.a("setCurrentScreen must be called from the main thread");
        } else {
            this.a.s().a(activity, str, str2);
        }
    }

    public FirebaseAnalytics(rc rcVar) {
        q.a(rcVar);
        this.a = null;
        this.f697b = rcVar;
        this.c = true;
    }

    public final void a(String str, String str2) {
        if (this.c) {
            this.f697b.a((String) null, str, str2, false);
        } else {
            this.a.o().a("app", str, (Object) str2, false);
        }
    }
}
