package i.c.d.e.a;

import android.content.Context;
import android.os.Bundle;
import com.crashlytics.android.core.CrashlyticsController;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.FirebaseApp;
import i.c.a.b.d.l.q;
import i.c.a.b.i.a.aa;
import i.c.a.b.i.a.oa;
import i.c.a.b.i.a.t6;
import i.c.a.b.i.a.z6;
import i.c.d.a;
import i.c.d.e.a.a;
import i.c.d.i.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.3.0 */
public class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f4656b;
    public final AppMeasurement a;

    public b(AppMeasurement appMeasurement) {
        q.a(appMeasurement);
        this.a = appMeasurement;
        new ConcurrentHashMap();
    }

    public static a a(FirebaseApp firebaseApp, Context context, d dVar) {
        q.a(firebaseApp);
        q.a(context);
        q.a(dVar);
        q.a(context.getApplicationContext());
        if (f4656b == null) {
            synchronized (b.class) {
                if (f4656b == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.d()) {
                        dVar.a(a.class, e.e, d.a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    f4656b = new b(AppMeasurement.a(context, bundle));
                }
            }
        }
        return f4656b;
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || i.c.d.e.a.c.b.a(str2, bundle)) {
            this.a.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (i.c.d.e.a.c.b.a(str) && i.c.d.e.a.c.b.a(str2, bundle) && i.c.d.e.a.c.b.a(str, str2, bundle)) {
            if (CrashlyticsController.FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS.equals(str) && CrashlyticsController.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                bundle.putLong(CrashlyticsController.FIREBASE_REALTIME, 1);
            }
            this.a.logEventInternal(str, str2, bundle);
        }
    }

    public void a(String str, String str2, Object obj) {
        if (i.c.d.e.a.c.b.a(str) && i.c.d.e.a.c.b.a(str, str2)) {
            AppMeasurement appMeasurement = this.a;
            if (appMeasurement != null) {
                q.b(str);
                if (appMeasurement.c) {
                    appMeasurement.f521b.a(str, str2, obj);
                } else {
                    appMeasurement.a.o().a(str, str2, obj, true);
                }
            } else {
                throw null;
            }
        }
    }

    public Map<String, Object> a(boolean z) {
        List<aa> list;
        AppMeasurement appMeasurement = this.a;
        if (appMeasurement.c) {
            return appMeasurement.f521b.a((String) null, (String) null, z);
        }
        t6 o2 = appMeasurement.a.o();
        o2.a();
        o2.w();
        o2.n().f3766n.a("Getting user properties (FE)");
        if (o2.k().t()) {
            o2.n().f3758f.a("Cannot get all user properties from analytics worker thread");
            list = Collections.emptyList();
        } else if (oa.a()) {
            o2.n().f3758f.a("Cannot get all user properties from main thread");
            list = Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            o2.a.k().a(atomicReference, 5000, "get user properties", new z6(o2, atomicReference, z));
            List list2 = (List) atomicReference.get();
            if (list2 == null) {
                o2.n().f3758f.a("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
                list = Collections.emptyList();
            } else {
                list = list2;
            }
        }
        h.e.a aVar = new h.e.a(list.size());
        for (aa aaVar : list) {
            aVar.put(aaVar.f3586f, aaVar.a());
        }
        return aVar;
    }

    public void a(a.C0130a aVar) {
        if (i.c.d.e.a.c.b.a(aVar)) {
            AppMeasurement appMeasurement = this.a;
            AppMeasurement.ConditionalUserProperty conditionalUserProperty = new AppMeasurement.ConditionalUserProperty();
            conditionalUserProperty.mOrigin = aVar.a;
            conditionalUserProperty.mActive = aVar.f4654n;
            conditionalUserProperty.mCreationTimestamp = aVar.f4653m;
            conditionalUserProperty.mExpiredEventName = aVar.f4651k;
            if (aVar.f4652l != null) {
                conditionalUserProperty.mExpiredEventParams = new Bundle(aVar.f4652l);
            }
            conditionalUserProperty.mName = aVar.f4645b;
            conditionalUserProperty.mTimedOutEventName = aVar.f4646f;
            if (aVar.f4647g != null) {
                conditionalUserProperty.mTimedOutEventParams = new Bundle(aVar.f4647g);
            }
            conditionalUserProperty.mTimeToLive = aVar.f4650j;
            conditionalUserProperty.mTriggeredEventName = aVar.f4648h;
            if (aVar.f4649i != null) {
                conditionalUserProperty.mTriggeredEventParams = new Bundle(aVar.f4649i);
            }
            conditionalUserProperty.mTriggeredTimestamp = aVar.f4655o;
            conditionalUserProperty.mTriggerEventName = aVar.d;
            conditionalUserProperty.mTriggerTimeout = aVar.e;
            Object obj = aVar.c;
            if (obj != null) {
                conditionalUserProperty.mValue = q.d(obj);
            }
            appMeasurement.setConditionalUserProperty(conditionalUserProperty);
        }
    }

    public List<a.C0130a> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (AppMeasurement.ConditionalUserProperty a2 : this.a.getConditionalUserProperties(str, str2)) {
            arrayList.add(i.c.d.e.a.c.b.a(a2));
        }
        return arrayList;
    }

    public int a(String str) {
        return this.a.getMaxUserProperties(str);
    }
}
