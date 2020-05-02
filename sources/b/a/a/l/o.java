package b.a.a.l;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import b.a.a.j.c;
import b.a.a.l.c0;
import com.crashlytics.android.answers.SessionEvent;
import h.a0.g;
import h.a0.n;
import h.a0.p;
import h.a0.v;
import i.c.e.j;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import n.h;
import n.m.c.e;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.background.BackgroundWorker;
import nic.goi.aarogyasetu.background.BluetoothScanningService;
import nic.goi.aarogyasetu.background.UploadDataToServerWorker;
import nic.goi.aarogyasetu.views.WebViewActivity;
import org.json.JSONArray;
import org.json.JSONObject;
import q.d;
import q.f;

/* compiled from: CorUtility.kt */
public final class o {
    public static boolean a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f436b = new a((e) null);

    public static final void a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && !defaultAdapter.isEnabled()) {
            defaultAdapter.enable();
        }
    }

    public static final boolean a(Context context) {
        return f436b.e(context);
    }

    public static final boolean b() {
        return f436b.b();
    }

    public static final boolean b(Context context) {
        return f436b.g(context);
    }

    /* compiled from: CorUtility.kt */
    public static final class a {

        /* renamed from: b.a.a.l.o$a$a  reason: collision with other inner class name */
        /* compiled from: CorUtility.kt */
        public static final class C0013a implements f<j> {
            public final /* synthetic */ Context a;

            public C0013a(Context context) {
                this.a = context;
            }

            public void a(d<j> dVar, Throwable th) {
                if (dVar == null) {
                    n.m.c.f.a("call");
                    throw null;
                } else if (th == null) {
                    n.m.c.f.a("t");
                    throw null;
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
            /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void a(q.d<i.c.e.j> r5, q.d0<i.c.e.j> r6) {
                /*
                    r4 = this;
                    r0 = 0
                    if (r5 == 0) goto L_0x00a6
                    if (r6 == 0) goto L_0x00a0
                    boolean r5 = r6.a()
                    if (r5 == 0) goto L_0x009f
                    T r5 = r6.f5713b
                    if (r5 == 0) goto L_0x009f
                    if (r5 == 0) goto L_0x009b
                    java.lang.String r6 = "response.body()!!"
                    n.m.c.f.a((java.lang.Object) r5, (java.lang.String) r6)
                    i.c.e.j r5 = (i.c.e.j) r5
                    i.c.e.l r5 = r5.d()
                    java.lang.String r6 = "p"
                    boolean r0 = r5.b(r6)
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L_0x0042
                    i.c.e.j r0 = r5.a(r6)
                    java.lang.String r3 = "jsonObject.get(\n        …                        )"
                    n.m.c.f.a((java.lang.Object) r0, (java.lang.String) r3)
                    int r0 = r0.c()
                    if (r0 != r2) goto L_0x0042
                    android.content.Context r0 = r4.a
                    b.a.a.k.a.a((android.content.Context) r0, (java.lang.String) r6, (boolean) r2)
                    b.a.a.l.o$a r6 = b.a.a.l.o.f436b
                    android.content.Context r0 = r4.a
                    r6.h(r0)
                    goto L_0x0047
                L_0x0042:
                    android.content.Context r0 = r4.a
                    b.a.a.k.a.a((android.content.Context) r0, (java.lang.String) r6, (boolean) r1)
                L_0x0047:
                    java.lang.String r6 = "did"
                    boolean r0 = r5.b(r6)
                    java.lang.String r3 = "unique_id"
                    if (r0 == 0) goto L_0x0063
                    nic.goi.aarogyasetu.CoronaApplication r0 = nic.goi.aarogyasetu.CoronaApplication.f5224g
                    i.c.e.j r5 = r5.a(r6)
                    java.lang.String r6 = "jsonObject.get(nic.goi.a…lity.Constants.UNIQUE_ID)"
                    n.m.c.f.a((java.lang.Object) r5, (java.lang.String) r6)
                    java.lang.String r5 = r5.f()
                    b.a.a.k.a.b(r0, r3, r5)
                L_0x0063:
                    android.content.Context r5 = r4.a
                    java.lang.String r6 = ""
                    java.lang.String r5 = b.a.a.k.a.a((android.content.Context) r5, (java.lang.String) r3, (java.lang.String) r6)
                    if (r5 == 0) goto L_0x0073
                    int r5 = r5.length()
                    if (r5 != 0) goto L_0x0074
                L_0x0073:
                    r1 = 1
                L_0x0074:
                    if (r1 == 0) goto L_0x009f
                    android.content.Context r5 = r4.a
                    h.a0.x.j r5 = h.a0.x.j.a((android.content.Context) r5)
                    java.lang.String r6 = "WorkManager.getInstance(context)"
                    n.m.c.f.a((java.lang.Object) r5, (java.lang.String) r6)
                    h.a0.p$a r6 = new h.a0.p$a
                    java.lang.Class<nic.goi.aarogyasetu.background.StatusCheckCall> r0 = nic.goi.aarogyasetu.background.StatusCheckCall.class
                    r1 = 16
                    java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
                    r6.<init>(r0, r1, r3)
                    h.a0.v r6 = r6.a()
                    java.lang.String r0 = "PeriodicWorkRequest.Buil…                ).build()"
                    n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r0)
                    h.a0.p r6 = (h.a0.p) r6
                    r5.a(r6)
                    goto L_0x009f
                L_0x009b:
                    n.m.c.f.a()
                    throw r0
                L_0x009f:
                    return
                L_0x00a0:
                    java.lang.String r5 = "response"
                    n.m.c.f.a((java.lang.String) r5)
                    throw r0
                L_0x00a6:
                    java.lang.String r5 = "call"
                    n.m.c.f.a((java.lang.String) r5)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: b.a.a.l.o.a.C0013a.a(q.d, q.d0):void");
            }
        }

        /* compiled from: CorUtility.kt */
        public static final class b implements c0.b {
            public final /* synthetic */ n.m.b.b a;

            public b(n.m.b.b bVar) {
                this.a = bVar;
            }

            public final void a(boolean z) {
                n.m.b.b bVar = this.a;
                if (bVar != null) {
                    bVar.a(Boolean.valueOf(z));
                }
            }
        }

        public /* synthetic */ a(e eVar) {
        }

        public final void a() {
            if (!b.a.a.k.a.a(CoronaApplication.f5224g).getBoolean("is_ssl_pinning_enabled_android", false)) {
                b.a.a.k.a.a((Context) CoronaApplication.f5224g, "is_ssl_pinning_enabled_android", true);
            }
        }

        public final void b(Context context) {
            if (context == null) {
                n.m.c.f.a("context");
                throw null;
            } else if (h.c.a()) {
                ((c) i.c.d.p.e.a(false, false, true, "").a(c.class)).a(a(false)).a(new C0013a(context));
            }
        }

        public final void c() {
            g gVar;
            h.a0.x.j a = h.a0.x.j.a((Context) CoronaApplication.f5224g);
            n.m.c.f.a((Object) a, "WorkManager.getInstance(…pplication.getInstance())");
            v a2 = new p.a(BackgroundWorker.class, 16, TimeUnit.MINUTES).a();
            n.m.c.f.a((Object) a2, "PeriodicWorkRequest.Buil…TES\n            ).build()");
            p pVar = (p) a2;
            BackgroundWorker backgroundWorker = BackgroundWorker.f5229k;
            String str = BackgroundWorker.f5228j;
            if (h.a0.f.REPLACE == h.a0.f.KEEP) {
                gVar = g.KEEP;
            } else {
                gVar = g.REPLACE;
            }
            new h.a0.x.f(a, str, gVar, Collections.singletonList(pVar), (List<h.a0.x.f>) null).a();
        }

        public final boolean d(Context context) {
            if (context != null) {
                return h.h.f.a.a(context, "android.permission.BLUETOOTH") == 0 && h.h.f.a.a(context, "android.permission.BLUETOOTH_ADMIN") == 0;
            }
            n.m.c.f.a("context");
            throw null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x001e  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0028 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean e(android.content.Context r4) {
            /*
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L_0x002c
                java.lang.String r1 = "location"
                java.lang.Object r4 = r4.getSystemService(r1)
                boolean r1 = r4 instanceof android.location.LocationManager
                if (r1 != 0) goto L_0x000e
                goto L_0x000f
            L_0x000e:
                r0 = r4
            L_0x000f:
                android.location.LocationManager r0 = (android.location.LocationManager) r0
                r4 = 0
                if (r0 == 0) goto L_0x001b
                java.lang.String r1 = "gps"
                boolean r1 = r0.isProviderEnabled(r1)     // Catch:{ Exception -> 0x001b }
                goto L_0x001c
            L_0x001b:
                r1 = 0
            L_0x001c:
                if (r0 == 0) goto L_0x0025
                java.lang.String r2 = "network"
                boolean r0 = r0.isProviderEnabled(r2)     // Catch:{ Exception -> 0x0025 }
                goto L_0x0026
            L_0x0025:
                r0 = 0
            L_0x0026:
                if (r1 != 0) goto L_0x002a
                if (r0 == 0) goto L_0x002b
            L_0x002a:
                r4 = 1
            L_0x002b:
                return r4
            L_0x002c:
                java.lang.String r4 = "context"
                n.m.c.f.a((java.lang.String) r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: b.a.a.l.o.a.e(android.content.Context):boolean");
        }

        public final boolean f(Context context) {
            if (context != null) {
                return h.h.f.a.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 && h.h.f.a.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
            }
            n.m.c.f.a("context");
            throw null;
        }

        public final boolean g(Context context) {
            Object systemService = context != null ? context.getSystemService("connectivity") : null;
            if (systemService != null) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            }
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }

        public final void h(Context context) {
            if (context != null) {
                h.a0.x.j a = h.a0.x.j.a(context);
                n.m.c.f.a((Object) a, "WorkManager.getInstance(context)");
                v a2 = new n.a(UploadDataToServerWorker.class).a();
                n.m.c.f.a((Object) a2, "OneTimeWorkRequest.Build…ava\n            ).build()");
                a.a((n) a2);
                return;
            }
            n.m.c.f.a("context");
            throw null;
        }

        public final Map<String, String> a(boolean z) {
            String b2 = h.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (b2 == null) {
                b2 = "";
            }
            linkedHashMap.put("Authorization", b2);
            linkedHashMap.put("pt", "9cf23ec2-d83c-4778-aca5-d7fb64ae1b2d");
            linkedHashMap.put("os", String.valueOf(Build.VERSION.SDK_INT));
            linkedHashMap.put("device-type", Build.MANUFACTURER + "-" + Build.MODEL);
            linkedHashMap.put("ver", String.valueOf(1045));
            linkedHashMap.put("ver-name", "1.1.1");
            if (z) {
                linkedHashMap.put("Content-Type", "multipart/form-data; boundary=--------------------------855063967778865347844375");
                linkedHashMap.put("Accept-Encoding", "gzip, deflate, br");
            } else {
                linkedHashMap.put("Content-Type", l.a.a.a.o.b.a.ACCEPT_JSON_VALUE);
            }
            return linkedHashMap;
        }

        public final boolean b() {
            BluetoothAdapter defaultAdapter;
            CoronaApplication coronaApplication = CoronaApplication.f5224g;
            n.m.c.f.a((Object) coronaApplication, "CoronaApplication.instance");
            Context applicationContext = coronaApplication.getApplicationContext();
            n.m.c.f.a((Object) applicationContext, "CoronaApplication.instance.context");
            if (!d(applicationContext) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || !defaultAdapter.isEnabled() || defaultAdapter.getState() != 12) {
                return false;
            }
            return true;
        }

        public static /* synthetic */ void a(a aVar, String str, String str2, Context context, boolean z, Bundle bundle, int i2) {
            if ((i2 & 8) != 0) {
                z = false;
            }
            if ((i2 & 16) != 0) {
                bundle = null;
            }
            if (aVar == null) {
                throw null;
            } else if (str == null) {
                n.m.c.f.a("url");
                throw null;
            } else if (str2 == null) {
                n.m.c.f.a("title");
                throw null;
            } else if (context != null) {
                Intent a = WebViewActivity.a(str, str2, context);
                if (z) {
                    a.addFlags(268435456);
                }
                if (bundle != null) {
                    a.putExtras(bundle);
                }
                context.startActivity(a);
            } else {
                n.m.c.f.a("context");
                throw null;
            }
        }

        public final String c(Context context) {
            if (context != null) {
                return "I recommend Aarogya Setu app to fight against COVID19. Please download and share it using this link Android : \n" + "https://play.google.com/store/apps/details?id=" + "nic.goi.aarogyasetu" + "\n" + "iOS : " + "\n" + "https://apps.apple.com/in/app/aarogyasetu/id1505825357" + "\n";
            }
            n.m.c.f.a("context");
            throw null;
        }

        public final void a(String str) {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray = jSONObject.optJSONArray("specific_version");
                int optInt = jSONObject.optInt("min_version", -1);
                if (optInt == -1) {
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            Object obj = optJSONArray.get(i2);
                            if ((obj instanceof Integer) && 1045 == ((Integer) obj).intValue()) {
                                o.a = true;
                                return;
                            }
                        }
                        return;
                    }
                    o.a = false;
                } else if (1045 < optInt) {
                    o.a = true;
                }
            } else {
                n.m.c.f.a("jsonString");
                throw null;
            }
        }

        public final void a(Activity activity, int i2) {
            if (activity == null) {
                n.m.c.f.a("context");
                throw null;
            } else if (Build.VERSION.SDK_INT >= 29) {
                h.h.e.a.a(activity, new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, i2);
            } else {
                h.h.e.a.a(activity, new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, i2);
            }
        }

        public final void a(Context context, n.m.b.b<? super Boolean, h> bVar) {
            if (context == null) {
                n.m.c.f.a("context");
                throw null;
            } else if (bVar != null) {
                new c0(context).a(new b(bVar));
            } else {
                n.m.c.f.a("locationOn");
                throw null;
            }
        }

        public final boolean a(Context context) {
            if (context != null) {
                int a = h.h.f.a.a(context, "android.permission.BLUETOOTH");
                int a2 = h.h.f.a.a(context, "android.permission.BLUETOOTH_ADMIN");
                int a3 = h.h.f.a.a(context, "android.permission.ACCESS_COARSE_LOCATION");
                int a4 = h.h.f.a.a(context, "android.permission.ACCESS_FINE_LOCATION");
                h.h.f.a.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
                return a == 0 && a2 == 0 && a3 == 0 && a4 == 0;
            }
            n.m.c.f.a("context");
            throw null;
        }

        public final void a(Activity activity) {
            if (activity == null) {
                n.m.c.f.a(SessionEvent.ACTIVITY_KEY);
                throw null;
            } else if (!BluetoothScanningService.f5231p) {
                String a = b.a.a.k.a.a((Context) CoronaApplication.f5224g, "unique_id", "");
                n.m.c.f.a((Object) a, "uniqueId");
                if ((a.length() > 0) && !activity.isFinishing()) {
                    h.h.f.a.a((Context) activity, new Intent(activity, BluetoothScanningService.class));
                }
            }
        }
    }
}
