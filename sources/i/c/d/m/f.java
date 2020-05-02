package i.c.d.m;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import i.c.a.b.d.l.q;
import i.c.a.b.l.h;
import i.c.d.m.o.a;
import i.c.d.m.o.b;
import i.c.d.m.o.c;
import i.c.d.m.o.d;
import i.c.d.m.p.b;
import i.c.d.m.p.c;
import i.c.d.m.p.e;
import i.c.d.p.g;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public class f implements g {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f4724j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static final ThreadFactory f4725k = new a();
    public final FirebaseApp a;

    /* renamed from: b  reason: collision with root package name */
    public final c f4726b;
    public final i.c.d.m.o.c c;
    public final ExecutorService d;
    public final n e;

    /* renamed from: f  reason: collision with root package name */
    public final b f4727f;

    /* renamed from: g  reason: collision with root package name */
    public final l f4728g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f4729h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public final List<m> f4730i = new ArrayList();

    /* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.a.getAndIncrement())}));
        }
    }

    public f(FirebaseApp firebaseApp, g gVar, i.c.d.j.c cVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f4725k);
        firebaseApp.a();
        c cVar2 = new c(firebaseApp.a, gVar, cVar);
        i.c.d.m.o.c cVar3 = new i.c.d.m.o.c(firebaseApp);
        n nVar = new n();
        b bVar = new b(firebaseApp);
        l lVar = new l();
        this.a = firebaseApp;
        this.f4726b = cVar2;
        this.d = threadPoolExecutor;
        this.c = cVar3;
        this.e = nVar;
        this.f4727f = bVar;
        this.f4728g = lVar;
    }

    public i.c.a.b.l.g<k> a(boolean z) {
        g();
        i.c.a.b.l.g<k> a2 = a();
        if (z) {
            this.d.execute(new d(this));
        } else {
            this.d.execute(new e(this));
        }
        return a2;
    }

    public final i.c.a.b.l.g<String> b() {
        h hVar = new h();
        j jVar = new j(hVar);
        synchronized (this.f4729h) {
            this.f4730i.add(jVar);
        }
        return hVar.a;
    }

    public String c() {
        FirebaseApp firebaseApp = this.a;
        firebaseApp.a();
        return firebaseApp.c.a;
    }

    public i.c.a.b.l.g<String> d() {
        g();
        i.c.a.b.l.g<String> b2 = b();
        this.d.execute(new c(this));
        return b2;
    }

    public final d e() {
        d a2;
        synchronized (f4724j) {
            FirebaseApp firebaseApp = this.a;
            firebaseApp.a();
            b a3 = b.a(firebaseApp.a, "generatefid.lock");
            try {
                a2 = this.c.a();
                if (a2.b()) {
                    String b2 = b(a2);
                    i.c.d.m.o.c cVar = this.c;
                    a.b bVar = (a.b) a2.d();
                    bVar.a = b2;
                    bVar.a(c.a.UNREGISTERED);
                    a2 = bVar.a();
                    cVar.a(a2);
                }
                if (a3 != null) {
                    a3.f4723b.release();
                    a3.a.close();
                }
            } catch (IOException e2) {
                Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
            } catch (Throwable th) {
                if (a3 != null) {
                    try {
                        a3.f4723b.release();
                        a3.a.close();
                    } catch (IOException e3) {
                        Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e3);
                    }
                }
                throw th;
            }
        }
        return a2;
    }

    public String f() {
        FirebaseApp firebaseApp = this.a;
        firebaseApp.a();
        if (TextUtils.isEmpty(firebaseApp.c.f4638g)) {
            FirebaseApp firebaseApp2 = this.a;
            firebaseApp2.a();
            return firebaseApp2.c.e;
        }
        FirebaseApp firebaseApp3 = this.a;
        firebaseApp3.a();
        return firebaseApp3.c.f4638g;
    }

    public final void g() {
        FirebaseApp firebaseApp = this.a;
        firebaseApp.a();
        q.b(firebaseApp.c.f4636b);
        q.b(f());
        q.b(c());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: i.c.d.m.p.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: i.c.d.m.p.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: i.c.d.m.p.a} */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.c.d.m.o.d c(i.c.d.m.o.d r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            i.c.d.m.o.a r0 = (i.c.d.m.o.a) r0
            java.lang.String r2 = r0.a
            int r2 = r2.length()
            r3 = 11
            r4 = 0
            if (r2 != r3) goto L_0x0018
            i.c.d.m.o.b r2 = r1.f4727f
            java.lang.String r2 = r2.d()
            goto L_0x0019
        L_0x0018:
            r2 = r4
        L_0x0019:
            i.c.d.m.p.c r3 = r1.f4726b
            java.lang.String r5 = r18.c()
            java.lang.String r0 = r0.a
            java.lang.String r6 = r18.f()
            com.google.firebase.FirebaseApp r7 = r1.a
            r7.a()
            i.c.d.c r7 = r7.c
            java.lang.String r7 = r7.f4636b
            if (r3 == 0) goto L_0x0107
            r4 = 1
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r9 = 0
            r8[r9] = r6
            java.lang.String r6 = "projects/%s/installations"
            java.lang.String r6 = java.lang.String.format(r6, r8)
            java.net.URL r8 = new java.net.URL
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r11 = "firebaseinstallations.googleapis.com"
            r10[r9] = r11
            java.lang.String r11 = "v1"
            r10[r4] = r11
            r11 = 2
            r10[r11] = r6
            r6 = 3
            r10[r6] = r5
            java.lang.String r5 = "https://%s/%s/%s?key=%s"
            java.lang.String r5 = java.lang.String.format(r5, r10)
            r8.<init>(r5)
        L_0x0058:
            if (r9 > r4) goto L_0x0101
            java.net.HttpURLConnection r5 = r3.a((java.net.URL) r8)
            java.lang.String r6 = "POST"
            r5.setRequestMethod(r6)     // Catch:{ all -> 0x00fc }
            r5.setDoOutput(r4)     // Catch:{ all -> 0x00fc }
            if (r2 == 0) goto L_0x006d
            java.lang.String r6 = "x-goog-fis-android-iid-migration-auth"
            r5.addRequestProperty(r6, r2)     // Catch:{ all -> 0x00fc }
        L_0x006d:
            r3.a(r5, r0, r7)     // Catch:{ all -> 0x00fc }
            int r6 = r5.getResponseCode()     // Catch:{ all -> 0x00fc }
            r10 = 200(0xc8, float:2.8E-43)
            if (r6 != r10) goto L_0x007d
            i.c.d.m.p.d r0 = r3.a((java.net.HttpURLConnection) r5)     // Catch:{ all -> 0x00fc }
            goto L_0x0098
        L_0x007d:
            r10 = 429(0x1ad, float:6.01E-43)
            if (r6 == r10) goto L_0x00f5
            r10 = 500(0x1f4, float:7.0E-43)
            if (r6 < r10) goto L_0x008a
            r10 = 600(0x258, float:8.41E-43)
            if (r6 >= r10) goto L_0x008a
            goto L_0x00f5
        L_0x008a:
            r15 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            i.c.d.m.p.d$a r16 = i.c.d.m.p.d.a.BAD_CONFIG     // Catch:{ all -> 0x00fc }
            i.c.d.m.p.a r0 = new i.c.d.m.p.a     // Catch:{ all -> 0x00fc }
            r17 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00fc }
        L_0x0098:
            r5.disconnect()
            i.c.d.m.p.a r0 = (i.c.d.m.p.a) r0
            i.c.d.m.p.d$a r2 = r0.e
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x00c1
            if (r2 != r4) goto L_0x00bb
            i.c.d.m.o.d$a r0 = r19.d()
            i.c.d.m.o.a$b r0 = (i.c.d.m.o.a.b) r0
            java.lang.String r2 = "BAD CONFIG"
            r0.f4738g = r2
            i.c.d.m.o.c$a r2 = i.c.d.m.o.c.a.REGISTER_ERROR
            r0.a((i.c.d.m.o.c.a) r2)
            i.c.d.m.o.d r0 = r0.a()
            return r0
        L_0x00bb:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
        L_0x00c1:
            java.lang.String r2 = r0.f4746b
            java.lang.String r3 = r0.c
            i.c.d.m.n r4 = r1.e
            long r4 = r4.a()
            i.c.d.m.p.e r0 = r0.d
            i.c.d.m.p.b r0 = (i.c.d.m.p.b) r0
            java.lang.String r6 = r0.a
            long r7 = r0.f4747b
            i.c.d.m.o.d$a r0 = r19.d()
            i.c.d.m.o.a$b r0 = (i.c.d.m.o.a.b) r0
            r0.a = r2
            i.c.d.m.o.c$a r2 = i.c.d.m.o.c.a.REGISTERED
            r0.a((i.c.d.m.o.c.a) r2)
            r0.c = r6
            r0.d = r3
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r0.e = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.f4737f = r2
            i.c.d.m.o.d r0 = r0.a()
            return r0
        L_0x00f5:
            int r9 = r9 + 1
            r5.disconnect()
            goto L_0x0058
        L_0x00fc:
            r0 = move-exception
            r5.disconnect()
            throw r0
        L_0x0101:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
        L_0x0107:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.m.f.c(i.c.d.m.o.d):i.c.d.m.o.d");
    }

    public final void d(d dVar) {
        synchronized (this.f4729h) {
            Iterator<m> it = this.f4730i.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    public final i.c.a.b.l.g<k> a() {
        h hVar = new h();
        i iVar = new i(this.e, hVar);
        synchronized (this.f4729h) {
            this.f4730i.add(iVar);
        }
        return hVar.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(boolean r3) {
        /*
            r2 = this;
            i.c.d.m.o.d r0 = r2.e()
            if (r3 == 0) goto L_0x0013
            i.c.d.m.o.d$a r0 = r0.d()
            i.c.d.m.o.a$b r0 = (i.c.d.m.o.a.b) r0
            r1 = 0
            r0.c = r1
            i.c.d.m.o.d r0 = r0.a()
        L_0x0013:
            r2.d(r0)
            boolean r1 = r0.a()     // Catch:{ IOException -> 0x0063 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r0.c()     // Catch:{ IOException -> 0x0063 }
            if (r1 == 0) goto L_0x0023
            goto L_0x0034
        L_0x0023:
            if (r3 != 0) goto L_0x002f
            i.c.d.m.n r3 = r2.e     // Catch:{ IOException -> 0x0063 }
            boolean r3 = r3.a(r0)     // Catch:{ IOException -> 0x0063 }
            if (r3 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            return
        L_0x002f:
            i.c.d.m.o.d r3 = r2.a((i.c.d.m.o.d) r0)     // Catch:{ IOException -> 0x0063 }
            goto L_0x0038
        L_0x0034:
            i.c.d.m.o.d r3 = r2.c((i.c.d.m.o.d) r0)     // Catch:{ IOException -> 0x0063 }
        L_0x0038:
            i.c.d.m.o.c r0 = r2.c
            r0.a(r3)
            boolean r0 = r3.a()
            if (r0 == 0) goto L_0x004e
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r1 = com.google.firebase.installations.FirebaseInstallationsException.a.BAD_CONFIG
            r0.<init>(r1)
            r2.a(r3, r0)
            goto L_0x0062
        L_0x004e:
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x005f
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "cleared fid due to auth error"
            r0.<init>(r1)
            r2.a(r3, r0)
            goto L_0x0062
        L_0x005f:
            r2.d(r3)
        L_0x0062:
            return
        L_0x0063:
            r3 = move-exception
            r2.a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.m.f.b(boolean):void");
    }

    public final void a(d dVar, Exception exc) {
        synchronized (this.f4729h) {
            Iterator<m> it = this.f4730i.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    public final d a(d dVar) {
        e b2;
        i.c.d.m.p.c cVar = this.f4726b;
        String c2 = c();
        i.c.d.m.o.a aVar = (i.c.d.m.o.a) dVar;
        String str = aVar.a;
        String f2 = f();
        String str2 = aVar.d;
        if (cVar != null) {
            int i2 = 0;
            URL url = new URL(String.format("https://%s/%s/%s?key=%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{f2, str}), c2}));
            while (i2 <= 1) {
                HttpURLConnection a2 = cVar.a(url);
                try {
                    a2.setRequestMethod("POST");
                    a2.addRequestProperty("Authorization", "FIS_v2 " + str2);
                    cVar.c(a2);
                    int responseCode = a2.getResponseCode();
                    if (responseCode == 200) {
                        b2 = cVar.b(a2);
                    } else {
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode != 429) {
                                    if (responseCode < 500 || responseCode >= 600) {
                                        b.C0134b bVar = (b.C0134b) e.a();
                                        bVar.c = e.b.BAD_CONFIG;
                                        b2 = bVar.a();
                                    }
                                }
                                i2++;
                            }
                        }
                        b.C0134b bVar2 = (b.C0134b) e.a();
                        bVar2.c = e.b.AUTH_ERROR;
                        b2 = bVar2.a();
                    }
                    a2.disconnect();
                    i.c.d.m.p.b bVar3 = (i.c.d.m.p.b) b2;
                    int ordinal = bVar3.c.ordinal();
                    if (ordinal == 0) {
                        String str3 = bVar3.a;
                        long j2 = bVar3.f4747b;
                        long a3 = this.e.a();
                        a.b bVar4 = (a.b) dVar.d();
                        bVar4.c = str3;
                        bVar4.e = Long.valueOf(j2);
                        bVar4.f4737f = Long.valueOf(a3);
                        return bVar4.a();
                    } else if (ordinal == 1) {
                        a.b bVar5 = (a.b) dVar.d();
                        bVar5.f4738g = "BAD CONFIG";
                        bVar5.a(c.a.REGISTER_ERROR);
                        return bVar5.a();
                    } else if (ordinal == 2) {
                        d.a d2 = dVar.d();
                        d2.a(c.a.NOT_GENERATED);
                        return d2.a();
                    } else {
                        throw new IOException();
                    }
                } finally {
                    a2.disconnect();
                }
            }
            throw new IOException();
        }
        throw null;
    }

    public final String b(d dVar) {
        FirebaseApp firebaseApp = this.a;
        firebaseApp.a();
        if (firebaseApp.f692b.equals("CHIME_ANDROID_SDK") || this.a.d()) {
            if (dVar != null) {
                if (((i.c.d.m.o.a) dVar).f4733b == c.a.ATTEMPT_MIGRATION) {
                    String a2 = this.f4727f.a();
                    return TextUtils.isEmpty(a2) ? this.f4728g.a() : a2;
                }
            } else {
                throw null;
            }
        }
        return this.f4728g.a();
    }
}
