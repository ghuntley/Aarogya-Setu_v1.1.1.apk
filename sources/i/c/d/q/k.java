package i.c.d.q;

import android.content.Context;
import com.crashlytics.android.answers.AnswersPreferenceManager;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.b;
import i.c.a.b.d.o.c;
import i.c.d.e.a.a;
import i.c.d.q.m.e;
import i.c.d.q.m.l;
import i.c.d.q.m.m;
import i.c.d.q.m.n;
import i.c.d.q.m.o;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class k {

    /* renamed from: j  reason: collision with root package name */
    public static final b f4781j = c.a;

    /* renamed from: k  reason: collision with root package name */
    public static final Random f4782k = new Random();
    public final Map<String, g> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Context f4783b;
    public final ExecutorService c;
    public final FirebaseApp d;
    public final FirebaseInstanceId e;

    /* renamed from: f  reason: collision with root package name */
    public final i.c.d.d.b f4784f;

    /* renamed from: g  reason: collision with root package name */
    public final a f4785g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4786h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, String> f4787i = new HashMap();

    public k(Context context, FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, i.c.d.d.b bVar, a aVar) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        firebaseApp.a();
        o oVar = new o(context, firebaseApp.c.f4636b);
        this.f4783b = context;
        this.c = newCachedThreadPool;
        this.d = firebaseApp;
        this.e = firebaseInstanceId;
        this.f4784f = bVar;
        this.f4785g = aVar;
        firebaseApp.a();
        this.f4786h = firebaseApp.c.f4636b;
        q.a((Executor) newCachedThreadPool, new i(this));
        oVar.getClass();
        q.a((Executor) newCachedThreadPool, new j(oVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized i.c.d.q.g a(com.google.firebase.FirebaseApp r16, java.lang.String r17, com.google.firebase.iid.FirebaseInstanceId r18, i.c.d.d.b r19, java.util.concurrent.Executor r20, i.c.d.q.m.e r21, i.c.d.q.m.e r22, i.c.d.q.m.e r23, i.c.d.q.m.k r24, i.c.d.q.m.l r25, i.c.d.q.m.m r26) {
        /*
            r15 = this;
            r1 = r15
            r0 = r17
            monitor-enter(r15)
            java.util.Map<java.lang.String, i.c.d.q.g> r2 = r1.a     // Catch:{ all -> 0x0067 }
            boolean r2 = r2.containsKey(r0)     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x005d
            i.c.d.q.g r2 = new i.c.d.q.g     // Catch:{ all -> 0x0067 }
            android.content.Context r4 = r1.f4783b     // Catch:{ all -> 0x0067 }
            java.lang.String r3 = "firebase"
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0029
            r16.a()     // Catch:{ all -> 0x0067 }
            r5 = r16
            java.lang.String r3 = r5.f692b     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "[DEFAULT]"
            boolean r3 = r3.equals(r6)     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x0029:
            r5 = r16
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x0031
            r7 = r19
            goto L_0x0033
        L_0x0031:
            r3 = 0
            r7 = r3
        L_0x0033:
            r3 = r2
            r5 = r16
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            r14 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0067 }
            i.c.d.q.m.e r3 = r2.e     // Catch:{ all -> 0x0067 }
            r3.b()     // Catch:{ all -> 0x0067 }
            i.c.d.q.m.e r3 = r2.f4775f     // Catch:{ all -> 0x0067 }
            r3.b()     // Catch:{ all -> 0x0067 }
            i.c.d.q.m.e r3 = r2.d     // Catch:{ all -> 0x0067 }
            r3.b()     // Catch:{ all -> 0x0067 }
            java.util.Map<java.lang.String, i.c.d.q.g> r3 = r1.a     // Catch:{ all -> 0x0067 }
            r3.put(r0, r2)     // Catch:{ all -> 0x0067 }
        L_0x005d:
            java.util.Map<java.lang.String, i.c.d.q.g> r2 = r1.a     // Catch:{ all -> 0x0067 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x0067 }
            i.c.d.q.g r0 = (i.c.d.q.g) r0     // Catch:{ all -> 0x0067 }
            monitor-exit(r15)
            return r0
        L_0x0067:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.q.k.a(com.google.firebase.FirebaseApp, java.lang.String, com.google.firebase.iid.FirebaseInstanceId, i.c.d.d.b, java.util.concurrent.Executor, i.c.d.q.m.e, i.c.d.q.m.e, i.c.d.q.m.e, i.c.d.q.m.k, i.c.d.q.m.l, i.c.d.q.m.m):i.c.d.q.g");
    }

    public synchronized g a(String str) {
        e a2;
        e a3;
        e a4;
        m mVar;
        a2 = a(this.f4783b, this.f4786h, str, "fetch");
        a3 = a(this.f4783b, this.f4786h, str, "activate");
        a4 = a(this.f4783b, this.f4786h, str, "defaults");
        mVar = new m(this.f4783b.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", this.f4786h, str, AnswersPreferenceManager.PREF_STORE_NAME}), 0));
        return a(this.d, str, this.e, this.f4784f, this.c, a2, a3, a4, a(str, a2, mVar), new l(a3, a4), mVar);
    }

    public static e a(Context context, String str, String str2, String str3) {
        return e.a(Executors.newCachedThreadPool(), n.a(context, String.format("%s_%s_%s_%s.json", new Object[]{"frc", str, str2, str3})));
    }

    public synchronized i.c.d.q.m.k a(String str, e eVar, m mVar) {
        i.c.d.q.m.k kVar;
        m mVar2 = mVar;
        synchronized (this) {
            FirebaseInstanceId firebaseInstanceId = this.e;
            FirebaseApp firebaseApp = this.d;
            firebaseApp.a();
            a aVar = firebaseApp.f692b.equals("[DEFAULT]") ? this.f4785g : null;
            ExecutorService executorService = this.c;
            b bVar = f4781j;
            Random random = f4782k;
            FirebaseApp firebaseApp2 = this.d;
            firebaseApp2.a();
            String str2 = firebaseApp2.c.a;
            FirebaseApp firebaseApp3 = this.d;
            firebaseApp3.a();
            kVar = new i.c.d.q.m.k(firebaseInstanceId, aVar, executorService, bVar, random, eVar, new ConfigFetchHttpClient(this.f4783b, firebaseApp3.c.f4636b, str2, str, mVar2.a.getLong("fetch_timeout_in_seconds", 60), mVar2.a.getLong("fetch_timeout_in_seconds", 60)), mVar, this.f4787i);
        }
        return kVar;
    }
}
