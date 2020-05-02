package i.c.a.b.i.a;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.crashlytics.android.core.CrashlyticsController;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import h.e.a;
import i.c.a.b.d.k.h.h;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;
import i.c.a.b.d.o.f;
import i.c.a.b.g.g.e8;
import i.c.a.b.g.g.ib;
import i.c.a.b.g.g.j9;
import i.c.a.b.g.g.m8;
import i.c.a.b.g.g.q9;
import i.c.a.b.g.g.w8;
import i.c.a.b.g.g.x8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class t6 extends c3 {
    public q7 c;
    public s6 d;
    public final Set<r6> e = new CopyOnWriteArraySet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f3880f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicReference<String> f3881g = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f3882h = true;

    public t6(s5 s5Var) {
        super(s5Var);
    }

    public final void A() {
        c();
        a();
        w();
        if (this.a.e()) {
            if (this.a.f3861g.a(o.z0)) {
                pa paVar = this.a.f3861g;
                oa oaVar = paVar.a.f3860f;
                Boolean c2 = paVar.c("google_analytics_deferred_deep_link_enabled");
                if (c2 != null && c2.booleanValue()) {
                    n().f3765m.a("Deferred Deep Link feature enabled.");
                    m5 k2 = k();
                    w6 w6Var = new w6(this);
                    k2.o();
                    q.a(w6Var);
                    k2.a((q5<?>) new q5(k2, w6Var, "Task exception on worker thread"));
                }
            }
            z7 r = r();
            r.c();
            r.w();
            ea a = r.a(true);
            boolean a2 = r.a.f3861g.a(o.A0);
            if (a2) {
                r.t().a(3, new byte[0]);
            }
            r.a((Runnable) new j8(r, a, a2));
            this.f3882h = false;
            x4 g2 = g();
            g2.c();
            String string = g2.t().getString("previous_os_version", (String) null);
            g2.d().o();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = g2.t().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                d().o();
                if (!string.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    a("auto", "_ou", bundle);
                }
            }
        }
    }

    public final String B() {
        String str = this.a.f3859b;
        if (str != null) {
            return str;
        }
        try {
            return h.a();
        } catch (IllegalStateException e2) {
            this.a.n().f3758f.a("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public final void C() {
        if (this.a.f3861g.a(o.f0)) {
            c();
            String a = g().s.a();
            if (a != null) {
                if (!"unset".equals(a)) {
                    Long valueOf = Long.valueOf("true".equals(a) ? 1 : 0);
                    if (((c) this.a.f3868n) != null) {
                        a("app", "_npa", (Object) valueOf, System.currentTimeMillis());
                    } else {
                        throw null;
                    }
                } else if (((c) this.a.f3868n) != null) {
                    a("app", "_npa", (Object) null, System.currentTimeMillis());
                } else {
                    throw null;
                }
            }
        }
        boolean z = true;
        if (!this.a.b() || !this.f3882h) {
            n().f3765m.a("Updating Scion state (FE)");
            z7 r = r();
            r.c();
            r.w();
            r.a((Runnable) new n8(r, r.a(true)));
            return;
        }
        n().f3765m.a("Recording app launch after enabling measurement for the first time (FE)");
        A();
        if (q9.b() && this.a.f3861g.a(o.S0)) {
            u().d.a();
        }
        if (((w8) x8.f3525f.a()).a() && this.a.f3861g.a(o.X0)) {
            if (this.a.w.a.i().f3934k.a() <= 0) {
                z = false;
            }
            if (!z) {
                e5 e5Var = this.a.w;
                s5 s5Var = e5Var.a;
                if (s5Var != null) {
                    e5Var.a(s5Var.a.getPackageName());
                    return;
                }
                throw null;
            }
        }
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (((c) this.a.f3868n) != null) {
            a(str, str2, bundle, true, true, System.currentTimeMillis());
            return;
        }
        throw null;
    }

    public final void b(Bundle bundle, long j2) {
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        q.a(bundle);
        q.a(bundle, "app_id", cls2, null);
        q.a(bundle, "origin", cls2, null);
        q.a(bundle, DefaultAppMeasurementEventListenerRegistrar.NAME, cls2, null);
        q.a(bundle, "value", Object.class, null);
        q.a(bundle, "trigger_event_name", cls2, null);
        q.a(bundle, "trigger_timeout", cls, 0L);
        q.a(bundle, "timed_out_event_name", cls2, null);
        q.a(bundle, "timed_out_event_params", Bundle.class, null);
        q.a(bundle, "triggered_event_name", cls2, null);
        q.a(bundle, "triggered_event_params", Bundle.class, null);
        q.a(bundle, "time_to_live", cls, 0L);
        q.a(bundle, "expired_event_name", cls2, null);
        q.a(bundle, "expired_event_params", Bundle.class, null);
        q.b(bundle.getString(DefaultAppMeasurementEventListenerRegistrar.NAME));
        q.b(bundle.getString("origin"));
        q.a(bundle.get("value"));
        bundle.putLong("creation_timestamp", j2);
        String string = bundle.getString(DefaultAppMeasurementEventListenerRegistrar.NAME);
        Object obj = bundle.get("value");
        if (f().b(string) != 0) {
            n().f3758f.a("Invalid conditional user property name", e().c(string));
        } else if (f().b(string, obj) != 0) {
            n().f3758f.a("Invalid conditional user property value", e().c(string), obj);
        } else {
            Object c2 = f().c(string, obj);
            if (c2 == null) {
                n().f3758f.a("Unable to normalize conditional user property value", e().c(string), obj);
                return;
            }
            q.a(bundle, c2);
            long j3 = bundle.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle.getString("trigger_event_name")) || (j3 <= 15552000000L && j3 >= 1)) {
                long j4 = bundle.getLong("time_to_live");
                if (j4 > 15552000000L || j4 < 1) {
                    n().f3758f.a("Invalid conditional user property time to live", e().c(string), Long.valueOf(j4));
                    return;
                }
                m5 k2 = k();
                e7 e7Var = new e7(this, bundle);
                k2.o();
                q.a(e7Var);
                k2.a((q5<?>) new q5(k2, e7Var, "Task exception on worker thread"));
                return;
            }
            n().f3758f.a("Invalid conditional user property timeout", e().c(string), Long.valueOf(j3));
        }
    }

    public final boolean y() {
        return false;
    }

    public final void z() {
        if (this.a.a.getApplicationContext() instanceof Application) {
            ((Application) this.a.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    public final void a(String str, String str2, Object obj, boolean z) {
        if (((c) this.a.f3868n) != null) {
            a(str, str2, obj, z, System.currentTimeMillis());
            return;
        }
        throw null;
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        if (((c) this.a.f3868n) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            q.b(str2);
            Bundle bundle2 = new Bundle();
            if (str != null) {
                bundle2.putString("app_id", str);
            }
            bundle2.putString(DefaultAppMeasurementEventListenerRegistrar.NAME, str2);
            bundle2.putLong("creation_timestamp", currentTimeMillis);
            if (str3 != null) {
                bundle2.putString("expired_event_name", str3);
                bundle2.putBundle("expired_event_params", bundle);
            }
            m5 k2 = k();
            d7 d7Var = new d7(this, bundle2);
            k2.o();
            q.a(d7Var);
            k2.a((q5<?>) new q5(k2, d7Var, "Task exception on worker thread"));
            return;
        }
        throw null;
    }

    public final void a(boolean z) {
        w();
        a();
        m5 k2 = k();
        l7 l7Var = new l7(this, z);
        k2.o();
        q.a(l7Var);
        k2.a((q5<?>) new q5(k2, l7Var, "Task exception on worker thread"));
    }

    public final void a(String str, String str2, long j2, Bundle bundle) {
        a();
        c();
        a(str, str2, j2, bundle, true, this.d == null || ca.i(str2), false, (String) null);
    }

    public final void a(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        String str4;
        String str5;
        String str6;
        ArrayList arrayList;
        String str7;
        String str8;
        boolean z4;
        String str9;
        String str10;
        int i2;
        w7 w7Var;
        long j3;
        ArrayList arrayList2;
        Bundle bundle2;
        String str11;
        boolean z5;
        Class<?> cls;
        List<String> list;
        String str12 = str;
        String str13 = str2;
        long j4 = j2;
        Bundle bundle3 = bundle;
        q.b(str);
        q.a(bundle);
        c();
        w();
        if (!this.a.b()) {
            n().f3765m.a("Event not sent since app measurement is disabled");
        } else if (!this.a.f3861g.a(o.m0) || (list = q().f3727i) == null || list.contains(str13)) {
            int i3 = 0;
            if (!this.f3880f) {
                this.f3880f = true;
                try {
                    if (!this.a.e) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.a.a.getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{this.a.a});
                    } catch (Exception e2) {
                        n().f3761i.a("Failed to invoke Tag Manager's initialize() method", e2);
                    }
                } catch (ClassNotFoundException unused) {
                    n().f3764l.a("Tag Manager is not found and thus will not be used");
                }
            }
            if (this.a.f3861g.a(o.B0) && "_cmp".equals(str13) && bundle3.containsKey("gclid")) {
                String string = bundle3.getString("gclid");
                if (((c) this.a.f3868n) != null) {
                    a("auto", "_lgclid", (Object) string, System.currentTimeMillis());
                } else {
                    throw null;
                }
            }
            if (z3) {
                oa oaVar = this.a.f3860f;
                if (!"_iap".equals(str13)) {
                    ca p2 = this.a.p();
                    int i4 = 2;
                    if (p2.a("event", str13)) {
                        if (!p2.a("event", o6.a, str13)) {
                            i4 = 13;
                        } else if (p2.a("event", 40, str13)) {
                            i4 = 0;
                        }
                    }
                    if (i4 != 0) {
                        n().f3760h.a("Invalid public event name. Event will not be logged (FE)", e().a(str13));
                        this.a.p();
                        String a = ca.a(str13, 40, true);
                        if (str13 != null) {
                            i3 = str2.length();
                        }
                        this.a.p().a(i4, "_ev", a, i3);
                        return;
                    }
                }
            }
            oa oaVar2 = this.a.f3860f;
            w7 z6 = s().z();
            if (z6 != null && !bundle3.containsKey("_sc")) {
                z6.d = true;
            }
            y7.a(z6, bundle3, z && z3);
            boolean equals = "am".equals(str12);
            boolean i5 = ca.i(str2);
            if (z && this.d != null && !i5 && !equals) {
                n().f3765m.a("Passing event to registered event handler (FE)", e().a(str13), e().a(bundle3));
                AppMeasurementDynamiteService.a aVar = (AppMeasurementDynamiteService.a) this.d;
                if (aVar != null) {
                    try {
                        aVar.a.a(str, str2, bundle, j2);
                    } catch (RemoteException e3) {
                        AppMeasurementDynamiteService.this.a.n().f3761i.a("Event interceptor threw exception", e3);
                    }
                } else {
                    throw null;
                }
            } else if (this.a.e()) {
                int a2 = f().a(str13);
                if (a2 != 0) {
                    n().f3760h.a("Invalid event name. Event will not be logged (FE)", e().a(str13));
                    f();
                    String a3 = ca.a(str13, 40, true);
                    if (str13 != null) {
                        i3 = str2.length();
                    }
                    this.a.p().a(a2, "_ev", a3, i3);
                    return;
                }
                List unmodifiableList = Collections.unmodifiableList(Arrays.asList(new String[]{"_o", "_sn", "_sc", "_si"}));
                String str14 = "_o";
                long j5 = j4;
                w7 w7Var2 = z6;
                String str15 = str13;
                Bundle a4 = f().a(str3, str2, bundle, (List<String>) unmodifiableList, z3, true);
                w7 w7Var3 = (a4 == null || !a4.containsKey("_sc") || !a4.containsKey("_si")) ? null : new w7(a4.getString("_sn"), a4.getString("_sc"), Long.valueOf(a4.getLong("_si")).longValue());
                w7 w7Var4 = w7Var3 == null ? w7Var2 : w7Var3;
                boolean a5 = this.a.f3861g.a(o.c0);
                String str16 = CrashlyticsController.FIREBASE_APPLICATION_EXCEPTION;
                if (a5) {
                    oa oaVar3 = this.a.f3860f;
                    if (s().z() != null && str16.equals(str15)) {
                        long a6 = u().e.a();
                        if (a6 > 0) {
                            f().a(a4, a6);
                        }
                    }
                }
                if (m8.b() && this.a.f3861g.a(o.R0)) {
                    if (!"auto".equals(str12) && "_ssr".equals(str15)) {
                        ca f2 = f();
                        String string2 = a4.getString("_ffr");
                        if (f.a(string2)) {
                            str11 = null;
                        } else {
                            str11 = string2.trim();
                        }
                        if (ca.c(str11, f2.g().B.a())) {
                            f2.n().f3765m.a("Not logging duplicate session_start_with_rollout event");
                            z5 = false;
                        } else {
                            f2.g().B.a(str11);
                            z5 = true;
                        }
                        if (!z5) {
                            return;
                        }
                    } else if (str16.equals(str15)) {
                        String a7 = f().g().B.a();
                        if (!TextUtils.isEmpty(a7)) {
                            a4.putString("_ffr", a7);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(a4);
                long nextLong = f().u().nextLong();
                if (!this.a.f3861g.a(o.W) || g().v.a() <= 0 || !g().a(j5) || !g().y.a()) {
                    str4 = str14;
                } else {
                    n().f3766n.a("Current session is expired, remove the session number, ID, and engagement time");
                    if (!this.a.f3861g.a(o.T)) {
                        str4 = str14;
                    } else if (((c) this.a.f3868n) != null) {
                        str4 = str14;
                        a("auto", "_sid", (Object) null, System.currentTimeMillis());
                    } else {
                        throw null;
                    }
                    if (this.a.f3861g.a(o.U)) {
                        if (((c) this.a.f3868n) != null) {
                            a("auto", "_sno", (Object) null, System.currentTimeMillis());
                        } else {
                            throw null;
                        }
                    }
                    if (ib.b() && this.a.f3861g.a(o.r0)) {
                        if (((c) this.a.f3868n) != null) {
                            a("auto", "_se", (Object) null, System.currentTimeMillis());
                        } else {
                            throw null;
                        }
                    }
                }
                if (!this.a.f3861g.a(o.V) || a4.getLong("extend_session", 0) != 1) {
                    long j6 = j2;
                } else {
                    n().f3766n.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.a.m().d.a(j2, true);
                }
                String[] strArr = (String[]) a4.keySet().toArray(new String[a4.size()]);
                Arrays.sort(strArr);
                if (!e8.b() || !this.a.f3861g.a(o.d1) || !this.a.f3861g.a(o.c1)) {
                    int length = strArr.length;
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        str9 = "_eid";
                        if (i6 >= length) {
                            break;
                        }
                        String str17 = strArr[i6];
                        Object obj = a4.get(str17);
                        f();
                        String[] strArr2 = strArr;
                        Bundle[] a8 = ca.a(obj);
                        if (a8 != null) {
                            i2 = length;
                            a4.putInt(str17, a8.length);
                            int i8 = 0;
                            while (i8 < a8.length) {
                                Bundle bundle4 = a8[i8];
                                y7.a(w7Var4, bundle4, true);
                                String str18 = str9;
                                long j7 = nextLong;
                                Bundle bundle5 = bundle4;
                                ArrayList arrayList4 = arrayList3;
                                Bundle a9 = f().a(str3, "_ep", bundle5, (List<String>) unmodifiableList, z3, false);
                                a9.putString("_en", str2);
                                a9.putLong(str18, j7);
                                a9.putString("_gn", str17);
                                a9.putInt("_ll", a8.length);
                                a9.putInt("_i", i8);
                                arrayList4.add(a9);
                                i8++;
                                a4 = a4;
                                arrayList3 = arrayList4;
                                str9 = str18;
                                nextLong = j7;
                                w7Var4 = w7Var4;
                                str16 = str16;
                                i7 = i7;
                                String str19 = str;
                            }
                            w7Var = w7Var4;
                            j3 = nextLong;
                            arrayList2 = arrayList3;
                            str10 = str16;
                            bundle2 = a4;
                            String str20 = str2;
                            i7 += a8.length;
                        } else {
                            w7Var = w7Var4;
                            i2 = length;
                            int i9 = i7;
                            j3 = nextLong;
                            arrayList2 = arrayList3;
                            str10 = str16;
                            bundle2 = a4;
                            String str21 = str2;
                        }
                        i6++;
                        strArr = strArr2;
                        a4 = bundle2;
                        arrayList3 = arrayList2;
                        nextLong = j3;
                        w7Var4 = w7Var;
                        length = i2;
                        str16 = str10;
                        String str22 = str;
                        long j8 = j2;
                    }
                    String str23 = str9;
                    int i10 = i7;
                    long j9 = nextLong;
                    arrayList = arrayList3;
                    str5 = str16;
                    Bundle bundle6 = a4;
                    str6 = str2;
                    if (i10 != 0) {
                        bundle6.putLong(str23, j9);
                        bundle6.putInt("_epc", i10);
                    }
                } else {
                    for (String str24 : strArr) {
                        f();
                        Bundle[] a10 = ca.a(a4.get(str24));
                        if (a10 != null) {
                            a4.putParcelableArray(str24, a10);
                        }
                    }
                    str6 = str2;
                    arrayList = arrayList3;
                    str5 = str16;
                }
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    Bundle bundle7 = (Bundle) arrayList.get(i11);
                    if (i11 != 0) {
                        str7 = str;
                        str8 = "_ep";
                    } else {
                        str7 = str;
                        str8 = str6;
                    }
                    String str25 = str4;
                    bundle7.putString(str25, str7);
                    if (z2) {
                        bundle7 = f().a(bundle7);
                    }
                    if (!j9.b() || !this.a.f3861g.a(o.Y0)) {
                        n().f3765m.a("Logging event (FE)", e().a(str6), e().a(bundle7));
                    }
                    ArrayList arrayList5 = arrayList;
                    m mVar = new m(str8, new l(bundle7), str, j2);
                    z7 r = r();
                    if (r != null) {
                        q.a(mVar);
                        r.c();
                        r.w();
                        r.C();
                        i4 t = r.t();
                        if (t != null) {
                            Parcel obtain = Parcel.obtain();
                            mVar.writeToParcel(obtain, 0);
                            byte[] marshall = obtain.marshall();
                            obtain.recycle();
                            if (marshall.length > 131072) {
                                t.n().f3759g.a("Event is too long for local database. Sending event directly to service");
                                z4 = false;
                            } else {
                                z4 = t.a(0, marshall);
                            }
                            r.a((Runnable) new m8(r, true, z4, mVar, r.a(true), str3));
                            if (!equals) {
                                for (r6 onEvent : this.e) {
                                    onEvent.onEvent(str, str2, new Bundle(bundle7), j2);
                                }
                            }
                            i11++;
                            str4 = str25;
                            arrayList = arrayList5;
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }
                oa oaVar4 = this.a.f3860f;
                if (s().z() != null && str5.equals(str6)) {
                    g9 u = u();
                    if (((c) this.a.f3868n) != null) {
                        u.e.a(true, true, SystemClock.elapsedRealtime());
                        return;
                    }
                    throw null;
                }
            }
        } else {
            n().f3765m.a("Dropping non-safelisted event. event name, origin", str13, str12);
        }
    }

    public final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        a();
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        boolean z3 = !z2 || this.d == null || ca.i(str2);
        boolean z4 = !z;
        Bundle bundle3 = new Bundle(bundle2);
        for (String str4 : bundle3.keySet()) {
            Object obj = bundle3.get(str4);
            if (obj instanceof Bundle) {
                bundle3.putBundle(str4, new Bundle((Bundle) obj));
            } else if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                for (int i2 = 0; i2 < parcelableArr.length; i2++) {
                    if (parcelableArr[i2] instanceof Bundle) {
                        parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                    }
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    Object obj2 = list.get(i3);
                    if (obj2 instanceof Bundle) {
                        list.set(i3, new Bundle((Bundle) obj2));
                    }
                }
            }
        }
        m5 k2 = k();
        y6 y6Var = new y6(this, str3, str2, j2, bundle3, z2, z3, z4, (String) null);
        k2.o();
        q.a(y6Var);
        k2.a((q5<?>) new q5(k2, y6Var, "Task exception on worker thread"));
    }

    public final void a(String str, String str2, Object obj, boolean z, long j2) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i2 = 6;
        int i3 = 0;
        if (z) {
            i2 = f().b(str2);
        } else {
            ca f2 = f();
            if (f2.a("user property", str2)) {
                if (!f2.a("user property", p6.a, str2)) {
                    i2 = 15;
                } else if (f2.a("user property", 24, str2)) {
                    i2 = 0;
                }
            }
        }
        if (i2 != 0) {
            f();
            String a = ca.a(str2, 24, true);
            if (str2 != null) {
                i3 = str2.length();
            }
            this.a.p().a(i2, "_ev", a, i3);
        } else if (obj != null) {
            int b2 = f().b(str2, obj);
            if (b2 != 0) {
                f();
                String a2 = ca.a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i3 = String.valueOf(obj).length();
                }
                this.a.p().a(b2, "_ev", a2, i3);
                return;
            }
            Object c2 = f().c(str2, obj);
            if (c2 != null) {
                a(str3, str2, j2, c2);
            }
        } else {
            a(str3, str2, j2, (Object) null);
        }
    }

    public final void a(String str, String str2, long j2, Object obj) {
        m5 k2 = k();
        x6 x6Var = new x6(this, str, str2, obj, j2);
        k2.o();
        q.a(x6Var);
        k2.a((q5<?>) new q5(k2, x6Var, "Task exception on worker thread"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            i.c.a.b.d.l.q.b((java.lang.String) r9)
            i.c.a.b.d.l.q.b((java.lang.String) r10)
            r8.c()
            r8.a()
            r8.w()
            i.c.a.b.i.a.s5 r0 = r8.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r1 = i.c.a.b.i.a.o.f0
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r1)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x006f
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x005f
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x005f
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0044
            r4 = r2
            goto L_0x0046
        L_0x0044:
            r4 = 0
        L_0x0046:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            i.c.a.b.i.a.x4 r0 = r8.g()
            i.c.a.b.i.a.f5 r0 = r0.s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x005a
            java.lang.String r11 = "true"
        L_0x005a:
            r0.a(r11)
            r6 = r10
            goto L_0x006d
        L_0x005f:
            if (r11 != 0) goto L_0x006f
            i.c.a.b.i.a.x4 r10 = r8.g()
            i.c.a.b.i.a.f5 r10 = r10.s
            java.lang.String r0 = "unset"
            r10.a(r0)
            r6 = r11
        L_0x006d:
            r3 = r1
            goto L_0x0071
        L_0x006f:
            r3 = r10
            r6 = r11
        L_0x0071:
            i.c.a.b.i.a.s5 r10 = r8.a
            boolean r10 = r10.b()
            if (r10 != 0) goto L_0x0085
            i.c.a.b.i.a.m4 r9 = r8.n()
            i.c.a.b.i.a.o4 r9 = r9.f3766n
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L_0x0085:
            i.c.a.b.i.a.s5 r10 = r8.a
            boolean r10 = r10.e()
            if (r10 != 0) goto L_0x008e
            return
        L_0x008e:
            i.c.a.b.i.a.aa r10 = new i.c.a.b.i.a.aa
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            i.c.a.b.i.a.z7 r9 = r8.r()
            r9.c()
            r9.w()
            r9.C()
            i.c.a.b.i.a.i4 r11 = r9.t()
            if (r11 == 0) goto L_0x00db
            android.os.Parcel r12 = android.os.Parcel.obtain()
            r13 = 0
            r10.writeToParcel(r12, r13)
            byte[] r0 = r12.marshall()
            r12.recycle()
            int r12 = r0.length
            r1 = 131072(0x20000, float:1.83671E-40)
            r2 = 1
            if (r12 <= r1) goto L_0x00ca
            i.c.a.b.i.a.m4 r11 = r11.n()
            i.c.a.b.i.a.o4 r11 = r11.f3759g
            java.lang.String r12 = "User property too long for local database. Sending directly to service"
            r11.a(r12)
            goto L_0x00ce
        L_0x00ca:
            boolean r13 = r11.a(r2, r0)
        L_0x00ce:
            i.c.a.b.i.a.ea r11 = r9.a((boolean) r2)
            i.c.a.b.i.a.c8 r12 = new i.c.a.b.i.a.c8
            r12.<init>(r9, r13, r10, r11)
            r9.a((java.lang.Runnable) r12)
            return
        L_0x00db:
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.t6.a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void a(r6 r6Var) {
        a();
        w();
        q.a(r6Var);
        if (!this.e.add(r6Var)) {
            n().f3761i.a("OnEventListener already registered");
        }
    }

    public final void a(Bundle bundle, long j2) {
        q.a(bundle);
        a();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            n().f3761i.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        b(bundle2, j2);
    }

    public final ArrayList<Bundle> a(String str, String str2, String str3) {
        if (k().t()) {
            n().f3758f.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (oa.a()) {
            n().f3758f.a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.k().a(atomicReference, 5000, "get conditional user properties", new g7(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return ca.b((List<na>) list);
            }
            n().f3758f.a("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    public final Map<String, Object> a(String str, String str2, String str3, boolean z) {
        if (k().t()) {
            n().f3758f.a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (oa.a()) {
            n().f3758f.a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.k().a(atomicReference, 5000, "get user properties", new i7(this, atomicReference, str, str2, str3, z));
            List<aa> list = (List) atomicReference.get();
            if (list == null) {
                n().f3758f.a("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            a aVar = new a(list.size());
            for (aa aaVar : list) {
                aVar.put(aaVar.f3586f, aaVar.a());
            }
            return aVar;
        }
    }
}
