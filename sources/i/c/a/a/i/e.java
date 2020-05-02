package i.c.a.a.i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import i.c.a.a.i.b.c;
import i.c.a.a.i.b.f;
import i.c.a.a.i.b.g;
import i.c.a.a.i.b.h;
import i.c.a.a.i.b.j;
import i.c.a.a.i.b.k;
import i.c.a.a.i.b.l;
import i.c.a.a.i.b.m;
import i.c.a.a.i.b.n;
import i.c.a.a.i.b.p;
import i.c.a.a.i.b.r;
import i.c.a.a.i.b.t;
import i.c.a.a.i.b.u;
import i.c.a.a.j.f;
import i.c.a.a.j.p.g;
import i.c.a.a.j.p.m;
import i.c.d.h.g.d;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class e implements m {
    public final i.c.d.h.a a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f2925b;
    public final URL c = a(a.c);
    public final i.c.a.a.j.t.a d;
    public final i.c.a.a.j.t.a e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2926f;

    /* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    public static final class a {
        public final URL a;

        /* renamed from: b  reason: collision with root package name */
        public final k f2927b;
        public final String c;

        public a(URL url, k kVar, String str) {
            this.a = url;
            this.f2927b = kVar;
            this.c = str;
        }
    }

    /* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    public static final class b {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f2928b;
        public final long c;

        public b(int i2, URL url, long j2) {
            this.a = i2;
            this.f2928b = url;
            this.c = j2;
        }
    }

    public e(Context context, i.c.a.a.j.t.a aVar, i.c.a.a.j.t.a aVar2) {
        d dVar = new d();
        dVar.a(i.c.a.a.i.b.e.class, new l());
        dVar.a(h.class, new r());
        dVar.a(f.class, new n());
        dVar.a(g.class, new p());
        dVar.a(i.c.a.a.i.b.d.class, new c());
        dVar.a(j.class, new u());
        this.a = new i.c.d.h.g.c(dVar);
        this.f2925b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = aVar2;
        this.e = aVar;
        this.f2926f = 40000;
    }

    public i.c.a.a.j.f a(i.c.a.a.j.f fVar) {
        int i2;
        int i3;
        NetworkInfo activeNetworkInfo = this.f2925b.getActiveNetworkInfo();
        f.a a2 = fVar.a();
        a2.b().put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
        a2.b().put("model", Build.MODEL);
        a2.b().put("hardware", Build.HARDWARE);
        a2.b().put("device", Build.DEVICE);
        a2.b().put("product", Build.PRODUCT);
        a2.b().put("os-uild", Build.ID);
        a2.b().put("manufacturer", Build.MANUFACTURER);
        a2.b().put("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        a2.b().put("tz-offset", String.valueOf((long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / AnswersRetryFilesSender.BACKOFF_MS)));
        if (activeNetworkInfo == null) {
            i2 = t.b.NONE.e;
        } else {
            i2 = activeNetworkInfo.getType();
        }
        a2.b().put("net-type", String.valueOf(i2));
        if (activeNetworkInfo == null) {
            i3 = t.a.UNKNOWN_MOBILE_SUBTYPE.e;
        } else {
            i3 = activeNetworkInfo.getSubtype();
            if (i3 == -1) {
                i3 = t.a.COMBINED.e;
            } else if (t.a.A.get(i3) == null) {
                i3 = 0;
            }
        }
        a2.b().put("mobile-subtype", String.valueOf(i3));
        return a2.a();
    }

    public i.c.a.a.j.p.g a(i.c.a.a.j.p.f fVar) {
        String str;
        String str2;
        g.a aVar;
        long j2;
        e eVar = this;
        HashMap hashMap = new HashMap();
        i.c.a.a.j.p.a aVar2 = (i.c.a.a.j.p.a) fVar;
        for (i.c.a.a.j.f next : aVar2.a) {
            String str3 = ((i.c.a.a.j.a) next).a;
            if (!hashMap.containsKey(str3)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(str3, arrayList);
            } else {
                ((List) hashMap.get(str3)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i.c.a.a.j.f fVar2 = (i.c.a.a.j.f) ((List) entry.getValue()).get(0);
            Integer valueOf = Integer.valueOf(RecyclerView.UNDEFINED_DURATION);
            i.c.a.a.i.b.b bVar = i.c.a.a.i.b.b.DEFAULT;
            Long valueOf2 = Long.valueOf(eVar.e.a());
            Long valueOf3 = Long.valueOf(eVar.d.a());
            m.a aVar3 = m.a.ANDROID;
            Integer valueOf4 = Integer.valueOf(fVar2.b("sdk-version"));
            String a2 = fVar2.a("model");
            String a3 = fVar2.a("hardware");
            String a4 = fVar2.a("device");
            String a5 = fVar2.a("product");
            String a6 = fVar2.a("os-uild");
            String a7 = fVar2.a("manufacturer");
            String a8 = fVar2.a("fingerprint");
            String str4 = "";
            String str5 = valueOf4 == null ? " sdkVersion" : str4;
            if (str5.isEmpty()) {
                i.c.a.a.i.b.f fVar3 = new i.c.a.a.i.b.f(aVar3, new i.c.a.a.i.b.d(valueOf4.intValue(), a2, a3, a4, a5, a6, a7, a8));
                try {
                    valueOf = Integer.valueOf(Integer.valueOf((String) entry.getKey()).intValue());
                    str2 = null;
                } catch (NumberFormatException unused) {
                    str2 = (String) entry.getKey();
                }
                String str6 = str2;
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    i.c.a.a.j.f fVar4 = (i.c.a.a.j.f) it2.next();
                    i.c.a.a.j.a aVar4 = (i.c.a.a.j.a) fVar4;
                    Iterator it3 = it;
                    i.c.a.a.j.e eVar2 = aVar4.c;
                    Iterator it4 = it2;
                    i.c.a.a.b bVar2 = eVar2.a;
                    String str7 = str4;
                    i.c.a.a.j.p.a aVar5 = aVar2;
                    if (bVar2.equals(new i.c.a.a.b("proto"))) {
                        byte[] bArr = eVar2.f2946b;
                        aVar = new g.a();
                        aVar.a(RecyclerView.UNDEFINED_DURATION);
                        aVar.d = bArr;
                    } else if (bVar2.equals(new i.c.a.a.b("json"))) {
                        String str8 = new String(eVar2.f2946b, Charset.forName("UTF-8"));
                        g.a aVar6 = new g.a();
                        aVar6.a(RecyclerView.UNDEFINED_DURATION);
                        aVar6.e = str8;
                        aVar = aVar6;
                    } else {
                        Log.w(g.a.a.b.a.c("CctTransportBackend"), String.format("Received event of unsupported encoding %s. Skipping...", new Object[]{bVar2}));
                        it2 = it4;
                        it = it3;
                        str4 = str7;
                        aVar2 = aVar5;
                    }
                    aVar.a = Long.valueOf(aVar4.d);
                    aVar.c = Long.valueOf(aVar4.e);
                    String str9 = aVar4.f2930f.get("tz-offset");
                    if (str9 == null) {
                        j2 = 0;
                    } else {
                        j2 = Long.valueOf(str9).longValue();
                    }
                    aVar.f2894f = Long.valueOf(j2);
                    aVar.f2895g = new j(t.b.y.get(fVar4.b("net-type")), t.a.A.get(fVar4.b("mobile-subtype")));
                    Integer num = aVar4.f2929b;
                    if (num != null) {
                        aVar.a(num.intValue());
                    }
                    String str10 = aVar.a == null ? " eventTimeMs" : str7;
                    if (aVar.f2893b == null) {
                        str10 = i.a.a.a.a.b(str10, " eventCode");
                    }
                    if (aVar.c == null) {
                        str10 = i.a.a.a.a.b(str10, " eventUptimeMs");
                    }
                    if (aVar.f2894f == null) {
                        str10 = i.a.a.a.a.b(str10, " timezoneOffsetSeconds");
                    }
                    if (str10.isEmpty()) {
                        arrayList3.add(new g(aVar.a.longValue(), aVar.f2893b.intValue(), aVar.c.longValue(), aVar.d, aVar.e, aVar.f2894f.longValue(), aVar.f2895g));
                        it2 = it4;
                        it = it3;
                        str4 = str7;
                        aVar2 = aVar5;
                    } else {
                        throw new IllegalStateException(i.a.a.a.a.b("Missing required properties:", str10));
                    }
                }
                Iterator it5 = it;
                i.c.a.a.j.p.a aVar7 = aVar2;
                String str11 = valueOf2 == null ? " requestTimeMs" : str4;
                if (valueOf3 == null) {
                    str11 = i.a.a.a.a.b(str11, " requestUptimeMs");
                }
                if (valueOf == null) {
                    str11 = i.a.a.a.a.b(str11, " logSource");
                }
                if (str11.isEmpty()) {
                    arrayList2.add(new h(valueOf2.longValue(), valueOf3.longValue(), fVar3, valueOf.intValue(), str6, arrayList3, bVar));
                    eVar = this;
                    it = it5;
                    aVar2 = aVar7;
                } else {
                    throw new IllegalStateException(i.a.a.a.a.b("Missing required properties:", str11));
                }
            } else {
                throw new IllegalStateException(i.a.a.a.a.b("Missing required properties:", str5));
            }
        }
        i.c.a.a.j.p.a aVar8 = aVar2;
        i.c.a.a.i.b.e eVar3 = new i.c.a.a.i.b.e(arrayList2);
        URL url = this.c;
        if (aVar8.f2951b != null) {
            try {
                a a9 = a.a(((i.c.a.a.j.p.a) fVar).f2951b);
                str = a9.f2878b != null ? a9.f2878b : null;
                if (a9.a != null) {
                    url = a(a9.a);
                }
            } catch (IllegalArgumentException unused2) {
                return i.c.a.a.j.p.g.a();
            }
        } else {
            str = null;
        }
        try {
            b bVar3 = (b) g.a.a.b.a.a(5, new a(url, eVar3, str), new c(this), d.a);
            if (bVar3.a == 200) {
                return new i.c.a.a.j.p.b(g.a.OK, bVar3.c);
            }
            int i2 = bVar3.a;
            if (i2 < 500) {
                if (i2 != 404) {
                    return i.c.a.a.j.p.g.a();
                }
            }
            return new i.c.a.a.j.p.b(g.a.TRANSIENT_ERROR, -1);
        } catch (IOException e2) {
            Log.e(g.a.a.b.a.c("CctTransportBackend"), "Could not make request to the backend", e2);
            return new i.c.a.a.j.p.b(g.a.TRANSIENT_ERROR, -1);
        }
    }

    public static URL a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(i.a.a.a.a.b("Invalid url: ", str), e2);
        }
    }
}
