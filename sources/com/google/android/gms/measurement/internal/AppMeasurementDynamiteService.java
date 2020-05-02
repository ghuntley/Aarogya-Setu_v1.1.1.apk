package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.util.DynamiteApi;
import i.c.a.b.d.l.q;
import i.c.a.b.g.g.l9;
import i.c.a.b.g.g.mc;
import i.c.a.b.g.g.nb;
import i.c.a.b.g.g.nc;
import i.c.a.b.g.g.pc;
import i.c.a.b.i.a.a7;
import i.c.a.b.i.a.a8;
import i.c.a.b.i.a.b7;
import i.c.a.b.i.a.b9;
import i.c.a.b.i.a.ba;
import i.c.a.b.i.a.c6;
import i.c.a.b.i.a.c7;
import i.c.a.b.i.a.ca;
import i.c.a.b.i.a.f7;
import i.c.a.b.i.a.h7;
import i.c.a.b.i.a.j7;
import i.c.a.b.i.a.k7;
import i.c.a.b.i.a.l;
import i.c.a.b.i.a.m;
import i.c.a.b.i.a.m5;
import i.c.a.b.i.a.m7;
import i.c.a.b.i.a.n7;
import i.c.a.b.i.a.o7;
import i.c.a.b.i.a.q5;
import i.c.a.b.i.a.q7;
import i.c.a.b.i.a.r6;
import i.c.a.b.i.a.s5;
import i.c.a.b.i.a.s6;
import i.c.a.b.i.a.t6;
import i.c.a.b.i.a.v6;
import i.c.a.b.i.a.w7;
import i.c.a.b.i.a.y7;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.3.0 */
public class AppMeasurementDynamiteService extends l9 {
    public s5 a = null;

    /* renamed from: b  reason: collision with root package name */
    public Map<Integer, r6> f522b = new h.e.a();

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.3.0 */
    public class a implements s6 {
        public mc a;

        public a(mc mcVar) {
            this.a = mcVar;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.3.0 */
    public class b implements r6 {
        public mc a;

        public b(mc mcVar) {
            this.a = mcVar;
        }

        public final void onEvent(String str, String str2, Bundle bundle, long j2) {
            try {
                this.a.a(str, str2, bundle, j2);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.a.n().f3761i.a("Event listener threw exception", e);
            }
        }
    }

    public final void a() {
        if (this.a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j2) {
        a();
        this.a.w().a(str, j2);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        a();
        t6 o2 = this.a.o();
        o2.a();
        o2.a((String) null, str, str2, bundle);
    }

    public void endAdUnitExposure(String str, long j2) {
        a();
        this.a.w().b(str, j2);
    }

    public void generateEventId(nb nbVar) {
        a();
        this.a.p().a(nbVar, this.a.p().t());
    }

    public void getAppInstanceId(nb nbVar) {
        a();
        m5 k2 = this.a.k();
        b7 b7Var = new b7(this, nbVar);
        k2.o();
        q.a(b7Var);
        k2.a((q5<?>) new q5(k2, b7Var, "Task exception on worker thread"));
    }

    public void getCachedAppInstanceId(nb nbVar) {
        a();
        t6 o2 = this.a.o();
        o2.a();
        this.a.p().a(nbVar, o2.f3881g.get());
    }

    public void getConditionalUserProperties(String str, String str2, nb nbVar) {
        a();
        m5 k2 = this.a.k();
        a8 a8Var = new a8(this, nbVar, str, str2);
        k2.o();
        q.a(a8Var);
        k2.a((q5<?>) new q5(k2, a8Var, "Task exception on worker thread"));
    }

    public void getCurrentScreenClass(nb nbVar) {
        a();
        y7 s = this.a.o().a.s();
        s.a();
        w7 w7Var = s.d;
        this.a.p().a(nbVar, w7Var != null ? w7Var.f3927b : null);
    }

    public void getCurrentScreenName(nb nbVar) {
        a();
        y7 s = this.a.o().a.s();
        s.a();
        w7 w7Var = s.d;
        this.a.p().a(nbVar, w7Var != null ? w7Var.a : null);
    }

    public void getGmpAppId(nb nbVar) {
        a();
        this.a.p().a(nbVar, this.a.o().B());
    }

    public void getMaxUserProperties(String str, nb nbVar) {
        a();
        this.a.o();
        q.b(str);
        this.a.p().a(nbVar, 25);
    }

    public void getTestFlag(nb nbVar, int i2) {
        a();
        if (i2 == 0) {
            ca p2 = this.a.p();
            t6 o2 = this.a.o();
            if (o2 != null) {
                AtomicReference atomicReference = new AtomicReference();
                p2.a(nbVar, (String) o2.k().a(atomicReference, 15000, "String test flag value", new f7(o2, atomicReference)));
                return;
            }
            throw null;
        } else if (i2 == 1) {
            ca p3 = this.a.p();
            t6 o3 = this.a.o();
            if (o3 != null) {
                AtomicReference atomicReference2 = new AtomicReference();
                p3.a(nbVar, ((Long) o3.k().a(atomicReference2, 15000, "long test flag value", new h7(o3, atomicReference2))).longValue());
                return;
            }
            throw null;
        } else if (i2 == 2) {
            ca p4 = this.a.p();
            t6 o4 = this.a.o();
            if (o4 != null) {
                AtomicReference atomicReference3 = new AtomicReference();
                double doubleValue = ((Double) o4.k().a(atomicReference3, 15000, "double test flag value", new j7(o4, atomicReference3))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    nbVar.a(bundle);
                } catch (RemoteException e) {
                    p4.a.n().f3761i.a("Error returning double value to wrapper", e);
                }
            } else {
                throw null;
            }
        } else if (i2 == 3) {
            ca p5 = this.a.p();
            t6 o5 = this.a.o();
            if (o5 != null) {
                AtomicReference atomicReference4 = new AtomicReference();
                p5.a(nbVar, ((Integer) o5.k().a(atomicReference4, 15000, "int test flag value", new k7(o5, atomicReference4))).intValue());
                return;
            }
            throw null;
        } else if (i2 == 4) {
            ca p6 = this.a.p();
            t6 o6 = this.a.o();
            if (o6 != null) {
                AtomicReference atomicReference5 = new AtomicReference();
                p6.a(nbVar, ((Boolean) o6.k().a(atomicReference5, 15000, "boolean test flag value", new v6(o6, atomicReference5))).booleanValue());
                return;
            }
            throw null;
        }
    }

    public void getUserProperties(String str, String str2, boolean z, nb nbVar) {
        a();
        m5 k2 = this.a.k();
        b9 b9Var = new b9(this, nbVar, str, str2, z);
        k2.o();
        q.a(b9Var);
        k2.a((q5<?>) new q5(k2, b9Var, "Task exception on worker thread"));
    }

    public void initForTests(Map map) {
        a();
    }

    public void initialize(i.c.a.b.e.a aVar, pc pcVar, long j2) {
        Context context = (Context) i.c.a.b.e.b.a(aVar);
        s5 s5Var = this.a;
        if (s5Var == null) {
            this.a = s5.a(context, pcVar);
        } else {
            s5Var.n().f3761i.a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(nb nbVar) {
        a();
        m5 k2 = this.a.k();
        ba baVar = new ba(this, nbVar);
        k2.o();
        q.a(baVar);
        k2.a((q5<?>) new q5(k2, baVar, "Task exception on worker thread"));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        a();
        this.a.o().a(str, str2, bundle, z, z2, j2);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, nb nbVar, long j2) {
        Bundle bundle2;
        a();
        q.b(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        m mVar = new m(str2, new l(bundle), "app", j2);
        m5 k2 = this.a.k();
        c6 c6Var = new c6(this, nbVar, mVar, str);
        k2.o();
        q.a(c6Var);
        k2.a((q5<?>) new q5(k2, c6Var, "Task exception on worker thread"));
    }

    public void logHealthData(int i2, String str, i.c.a.b.e.a aVar, i.c.a.b.e.a aVar2, i.c.a.b.e.a aVar3) {
        Object obj;
        Object obj2;
        a();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = i.c.a.b.e.b.a(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = i.c.a.b.e.b.a(aVar2);
        }
        if (aVar3 != null) {
            obj3 = i.c.a.b.e.b.a(aVar3);
        }
        this.a.n().a(i2, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(i.c.a.b.e.a aVar, Bundle bundle, long j2) {
        a();
        q7 q7Var = this.a.o().c;
        if (q7Var != null) {
            this.a.o().z();
            q7Var.onActivityCreated((Activity) i.c.a.b.e.b.a(aVar), bundle);
        }
    }

    public void onActivityDestroyed(i.c.a.b.e.a aVar, long j2) {
        a();
        q7 q7Var = this.a.o().c;
        if (q7Var != null) {
            this.a.o().z();
            q7Var.onActivityDestroyed((Activity) i.c.a.b.e.b.a(aVar));
        }
    }

    public void onActivityPaused(i.c.a.b.e.a aVar, long j2) {
        a();
        q7 q7Var = this.a.o().c;
        if (q7Var != null) {
            this.a.o().z();
            q7Var.onActivityPaused((Activity) i.c.a.b.e.b.a(aVar));
        }
    }

    public void onActivityResumed(i.c.a.b.e.a aVar, long j2) {
        a();
        q7 q7Var = this.a.o().c;
        if (q7Var != null) {
            this.a.o().z();
            q7Var.onActivityResumed((Activity) i.c.a.b.e.b.a(aVar));
        }
    }

    public void onActivitySaveInstanceState(i.c.a.b.e.a aVar, nb nbVar, long j2) {
        a();
        q7 q7Var = this.a.o().c;
        Bundle bundle = new Bundle();
        if (q7Var != null) {
            this.a.o().z();
            q7Var.onActivitySaveInstanceState((Activity) i.c.a.b.e.b.a(aVar), bundle);
        }
        try {
            nbVar.a(bundle);
        } catch (RemoteException e) {
            this.a.n().f3761i.a("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(i.c.a.b.e.a aVar, long j2) {
        a();
        q7 q7Var = this.a.o().c;
        if (q7Var != null) {
            this.a.o().z();
            q7Var.onActivityStarted((Activity) i.c.a.b.e.b.a(aVar));
        }
    }

    public void onActivityStopped(i.c.a.b.e.a aVar, long j2) {
        a();
        q7 q7Var = this.a.o().c;
        if (q7Var != null) {
            this.a.o().z();
            q7Var.onActivityStopped((Activity) i.c.a.b.e.b.a(aVar));
        }
    }

    public void performAction(Bundle bundle, nb nbVar, long j2) {
        a();
        nbVar.a((Bundle) null);
    }

    public void registerOnMeasurementEventListener(mc mcVar) {
        a();
        r6 r6Var = this.f522b.get(Integer.valueOf(mcVar.a()));
        if (r6Var == null) {
            r6Var = new b(mcVar);
            this.f522b.put(Integer.valueOf(mcVar.a()), r6Var);
        }
        this.a.o().a(r6Var);
    }

    public void resetAnalyticsData(long j2) {
        a();
        t6 o2 = this.a.o();
        o2.f3881g.set((Object) null);
        m5 k2 = o2.k();
        c7 c7Var = new c7(o2, j2);
        k2.o();
        q.a(c7Var);
        k2.a((q5<?>) new q5(k2, c7Var, "Task exception on worker thread"));
    }

    public void setConditionalUserProperty(Bundle bundle, long j2) {
        a();
        if (bundle == null) {
            this.a.n().f3758f.a("Conditional user property must not be null");
        } else {
            this.a.o().a(bundle, j2);
        }
    }

    public void setCurrentScreen(i.c.a.b.e.a aVar, String str, String str2, long j2) {
        a();
        this.a.s().a((Activity) i.c.a.b.e.b.a(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) {
        a();
        this.a.o().a(z);
    }

    public void setEventInterceptor(mc mcVar) {
        a();
        t6 o2 = this.a.o();
        a aVar = new a(mcVar);
        o2.a();
        o2.w();
        m5 k2 = o2.k();
        a7 a7Var = new a7(o2, aVar);
        k2.o();
        q.a(a7Var);
        k2.a((q5<?>) new q5(k2, a7Var, "Task exception on worker thread"));
    }

    public void setInstanceIdProvider(nc ncVar) {
        a();
    }

    public void setMeasurementEnabled(boolean z, long j2) {
        a();
        t6 o2 = this.a.o();
        o2.w();
        o2.a();
        m5 k2 = o2.k();
        m7 m7Var = new m7(o2, z);
        k2.o();
        q.a(m7Var);
        k2.a((q5<?>) new q5(k2, m7Var, "Task exception on worker thread"));
    }

    public void setMinimumSessionDuration(long j2) {
        a();
        t6 o2 = this.a.o();
        o2.a();
        m5 k2 = o2.k();
        o7 o7Var = new o7(o2, j2);
        k2.o();
        q.a(o7Var);
        k2.a((q5<?>) new q5(k2, o7Var, "Task exception on worker thread"));
    }

    public void setSessionTimeoutDuration(long j2) {
        a();
        t6 o2 = this.a.o();
        o2.a();
        m5 k2 = o2.k();
        n7 n7Var = new n7(o2, j2);
        k2.o();
        q.a(n7Var);
        k2.a((q5<?>) new q5(k2, n7Var, "Task exception on worker thread"));
    }

    public void setUserId(String str, long j2) {
        a();
        this.a.o().a((String) null, "_id", str, true, j2);
    }

    public void setUserProperty(String str, String str2, i.c.a.b.e.a aVar, boolean z, long j2) {
        a();
        this.a.o().a(str, str2, i.c.a.b.e.b.a(aVar), z, j2);
    }

    public void unregisterOnMeasurementEventListener(mc mcVar) {
        a();
        Object remove = this.f522b.remove(Integer.valueOf(mcVar.a()));
        if (remove == null) {
            remove = new b(mcVar);
        }
        t6 o2 = this.a.o();
        o2.a();
        o2.w();
        q.a(remove);
        if (!o2.e.remove(remove)) {
            o2.n().f3761i.a("OnEventListener had not been registered");
        }
    }
}
