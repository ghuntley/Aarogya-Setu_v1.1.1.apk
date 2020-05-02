package l.a.a.a.o.g;

import android.util.Log;
import i.a.a.a.a;
import l.a.a.a.f;
import l.a.a.a.o.b.k;
import l.a.a.a.o.b.l;
import l.a.a.a.o.f.c;
import l.a.a.a.o.f.d;
import org.json.JSONObject;

/* compiled from: DefaultSettingsController */
public class i implements r {
    public final t a;

    /* renamed from: b  reason: collision with root package name */
    public final j f5175b;
    public final k c;
    public final h d;
    public final u e;

    /* renamed from: f  reason: collision with root package name */
    public final l.a.a.a.k f5176f;

    /* renamed from: g  reason: collision with root package name */
    public final c f5177g;

    /* renamed from: h  reason: collision with root package name */
    public final l f5178h;

    public i(l.a.a.a.k kVar, t tVar, k kVar2, j jVar, h hVar, u uVar, l lVar) {
        this.f5176f = kVar;
        this.a = tVar;
        this.c = kVar2;
        this.f5175b = jVar;
        this.d = hVar;
        this.e = uVar;
        this.f5178h = lVar;
        this.f5177g = new d(kVar.getContext(), kVar.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final l.a.a.a.o.g.s a(l.a.a.a.o.g.q r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Fabric"
            r1 = 0
            l.a.a.a.o.g.q r2 = l.a.a.a.o.g.q.SKIP_CACHE_LOOKUP     // Catch:{ Exception -> 0x0074 }
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x0074 }
            if (r2 != 0) goto L_0x0085
            l.a.a.a.o.g.h r2 = r9.d     // Catch:{ Exception -> 0x0074 }
            org.json.JSONObject r2 = r2.a()     // Catch:{ Exception -> 0x0074 }
            r3 = 3
            if (r2 == 0) goto L_0x0064
            l.a.a.a.o.g.j r4 = r9.f5175b     // Catch:{ Exception -> 0x0074 }
            l.a.a.a.o.b.k r5 = r9.c     // Catch:{ Exception -> 0x0074 }
            l.a.a.a.o.g.s r4 = r4.a(r5, r2)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r5 = "Loaded cached settings: "
            r9.a(r2, r5)     // Catch:{ Exception -> 0x0074 }
            l.a.a.a.o.b.k r2 = r9.c     // Catch:{ Exception -> 0x0074 }
            l.a.a.a.o.b.v r2 = (l.a.a.a.o.b.v) r2     // Catch:{ Exception -> 0x0074 }
            if (r2 == 0) goto L_0x0063
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0074 }
            l.a.a.a.o.g.q r2 = l.a.a.a.o.g.q.IGNORE_CACHE_EXPIRATION     // Catch:{ Exception -> 0x0074 }
            boolean r10 = r2.equals(r10)     // Catch:{ Exception -> 0x0074 }
            if (r10 != 0) goto L_0x004f
            long r7 = r4.f5190f     // Catch:{ Exception -> 0x0074 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x003b
            r10 = 1
            goto L_0x003c
        L_0x003b:
            r10 = 0
        L_0x003c:
            if (r10 != 0) goto L_0x003f
            goto L_0x004f
        L_0x003f:
            l.a.a.a.c r10 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r2 = "Cached settings have expired."
            boolean r10 = r10.a(r0, r3)     // Catch:{ Exception -> 0x0074 }
            if (r10 == 0) goto L_0x0085
            android.util.Log.d(r0, r2, r1)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0085
        L_0x004f:
            l.a.a.a.c r10 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = "Returning cached settings."
            boolean r10 = r10.a(r0, r3)     // Catch:{ Exception -> 0x0060 }
            if (r10 == 0) goto L_0x005e
            android.util.Log.d(r0, r2, r1)     // Catch:{ Exception -> 0x0060 }
        L_0x005e:
            r1 = r4
            goto L_0x0085
        L_0x0060:
            r10 = move-exception
            r1 = r4
            goto L_0x0075
        L_0x0063:
            throw r1     // Catch:{ Exception -> 0x0074 }
        L_0x0064:
            l.a.a.a.c r10 = l.a.a.a.f.a()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r2 = "No cached settings data found."
            boolean r10 = r10.a(r0, r3)     // Catch:{ Exception -> 0x0074 }
            if (r10 == 0) goto L_0x0085
            android.util.Log.d(r0, r2, r1)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0085
        L_0x0074:
            r10 = move-exception
        L_0x0075:
            l.a.a.a.c r2 = l.a.a.a.f.a()
            r3 = 6
            boolean r2 = r2.a(r0, r3)
            if (r2 == 0) goto L_0x0085
            java.lang.String r2 = "Failed to get cached settings"
            android.util.Log.e(r0, r2, r10)
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.g.i.a(l.a.a.a.o.g.q):l.a.a.a.o.g.s");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044 A[SYNTHETIC, Splitter:B:16:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085 A[SYNTHETIC, Splitter:B:30:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l.a.a.a.o.g.s b(l.a.a.a.o.g.q r8) {
        /*
            r7 = this;
            l.a.a.a.o.b.l r0 = r7.f5178h
            boolean r0 = r0.a()
            java.lang.String r1 = "Fabric"
            r2 = 0
            if (r0 != 0) goto L_0x001c
            l.a.a.a.c r8 = l.a.a.a.f.a()
            r0 = 3
            boolean r8 = r8.a(r1, r0)
            if (r8 == 0) goto L_0x001b
            java.lang.String r8 = "Not fetching settings, because data collection is disabled by Firebase."
            android.util.Log.d(r1, r8, r2)
        L_0x001b:
            return r2
        L_0x001c:
            boolean r0 = l.a.a.a.f.b()     // Catch:{ Exception -> 0x008c }
            java.lang.String r3 = "existing_instance_identifier"
            if (r0 != 0) goto L_0x0041
            l.a.a.a.o.f.c r0 = r7.f5177g     // Catch:{ Exception -> 0x008c }
            l.a.a.a.o.f.d r0 = (l.a.a.a.o.f.d) r0     // Catch:{ Exception -> 0x008c }
            android.content.SharedPreferences r0 = r0.a     // Catch:{ Exception -> 0x008c }
            java.lang.String r4 = ""
            java.lang.String r0 = r0.getString(r3, r4)     // Catch:{ Exception -> 0x008c }
            java.lang.String r4 = r7.a()     // Catch:{ Exception -> 0x008c }
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x008c }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0041
            l.a.a.a.o.g.s r8 = r7.a(r8)     // Catch:{ Exception -> 0x008c }
            goto L_0x0042
        L_0x0041:
            r8 = r2
        L_0x0042:
            if (r8 != 0) goto L_0x0082
            l.a.a.a.o.g.u r0 = r7.e     // Catch:{ Exception -> 0x007e }
            l.a.a.a.o.g.t r4 = r7.a     // Catch:{ Exception -> 0x007e }
            l.a.a.a.o.g.k r0 = (l.a.a.a.o.g.k) r0
            org.json.JSONObject r0 = r0.b(r4)     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x0082
            l.a.a.a.o.g.j r4 = r7.f5175b     // Catch:{ Exception -> 0x007e }
            l.a.a.a.o.b.k r5 = r7.c     // Catch:{ Exception -> 0x007e }
            l.a.a.a.o.g.s r8 = r4.a(r5, r0)     // Catch:{ Exception -> 0x007e }
            l.a.a.a.o.g.h r4 = r7.d     // Catch:{ Exception -> 0x007e }
            long r5 = r8.f5190f     // Catch:{ Exception -> 0x007e }
            r4.a(r5, r0)     // Catch:{ Exception -> 0x007e }
            java.lang.String r4 = "Loaded settings: "
            r7.a(r0, r4)     // Catch:{ Exception -> 0x007e }
            java.lang.String r0 = r7.a()     // Catch:{ Exception -> 0x007e }
            l.a.a.a.o.f.c r4 = r7.f5177g     // Catch:{ Exception -> 0x007e }
            l.a.a.a.o.f.d r4 = (l.a.a.a.o.f.d) r4     // Catch:{ Exception -> 0x007e }
            android.content.SharedPreferences$Editor r4 = r4.a()     // Catch:{ Exception -> 0x007e }
            r4.putString(r3, r0)     // Catch:{ Exception -> 0x007e }
            l.a.a.a.o.f.c r0 = r7.f5177g     // Catch:{ Exception -> 0x007e }
            l.a.a.a.o.f.d r0 = (l.a.a.a.o.f.d) r0     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x007d
            r4.apply()     // Catch:{ Exception -> 0x007e }
            goto L_0x0082
        L_0x007d:
            throw r2     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            r0 = move-exception
            r2 = r8
            r8 = r0
            goto L_0x008d
        L_0x0082:
            r2 = r8
            if (r2 != 0) goto L_0x009d
            l.a.a.a.o.g.q r8 = l.a.a.a.o.g.q.IGNORE_CACHE_EXPIRATION     // Catch:{ Exception -> 0x008c }
            l.a.a.a.o.g.s r2 = r7.a(r8)     // Catch:{ Exception -> 0x008c }
            goto L_0x009d
        L_0x008c:
            r8 = move-exception
        L_0x008d:
            l.a.a.a.c r0 = l.a.a.a.f.a()
            r3 = 6
            boolean r0 = r0.a(r1, r3)
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved."
            android.util.Log.e(r1, r0, r8)
        L_0x009d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.g.i.b(l.a.a.a.o.g.q):l.a.a.a.o.g.s");
    }

    public final void a(JSONObject jSONObject, String str) {
        l.a.a.a.c a2 = f.a();
        StringBuilder a3 = a.a(str);
        a3.append(jSONObject.toString());
        String sb = a3.toString();
        if (a2.a("Fabric", 3)) {
            Log.d("Fabric", sb, (Throwable) null);
        }
    }

    public String a() {
        return l.a.a.a.o.b.i.a(l.a.a.a.o.b.i.j(this.f5176f.getContext()));
    }
}
