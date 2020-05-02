package l.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import l.a.a.a.o.b.l;
import l.a.a.a.o.b.s;
import l.a.a.a.o.c.c;
import l.a.a.a.o.c.d;
import l.a.a.a.o.c.k;

/* compiled from: Fabric */
public class f {

    /* renamed from: l  reason: collision with root package name */
    public static volatile f f5033l;

    /* renamed from: m  reason: collision with root package name */
    public static final c f5034m = new c();
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<? extends k>, k> f5035b;
    public final ExecutorService c;
    public final i<f> d;
    public final i<?> e;

    /* renamed from: f  reason: collision with root package name */
    public final s f5036f;

    /* renamed from: g  reason: collision with root package name */
    public b f5037g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<Activity> f5038h;

    /* renamed from: i  reason: collision with root package name */
    public AtomicBoolean f5039i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    public final c f5040j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f5041k;

    public f(Context context, Map<Class<? extends k>, k> map, k kVar, Handler handler, c cVar, boolean z, i iVar, s sVar, Activity activity) {
        this.a = context;
        this.f5035b = map;
        this.c = kVar;
        this.f5040j = cVar;
        this.f5041k = z;
        this.d = iVar;
        this.e = new e(this, map.size());
        this.f5036f = sVar;
        a(activity);
    }

    public static <T extends k> T a(Class<T> cls) {
        if (f5033l != null) {
            return (k) f5033l.f5035b.get(cls);
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    public static boolean b() {
        if (f5033l == null) {
            return false;
        }
        return f5033l.f5041k;
    }

    public static f a(Context context, k... kVarArr) {
        if (f5033l == null) {
            synchronized (f.class) {
                if (f5033l == null) {
                    a aVar = new a(context);
                    aVar.a(kVarArr);
                    a(aVar.a());
                }
            }
        }
        return f5033l;
    }

    public static void a(f fVar) {
        StringBuilder sb;
        f fVar2 = fVar;
        f5033l = fVar2;
        b bVar = new b(fVar2.a);
        fVar2.f5037g = bVar;
        bVar.a(new d(fVar2));
        Context context = fVar2.a;
        Future submit = fVar2.c.submit(new h(context.getPackageCodePath()));
        Collection<k> values = fVar2.f5035b.values();
        n nVar = new n(submit, values);
        ArrayList arrayList = new ArrayList(values);
        Collections.sort(arrayList);
        nVar.injectParameters(context, fVar2, i.a, fVar2.f5036f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((k) it.next()).injectParameters(context, fVar2, fVar2.e, fVar2.f5036f);
        }
        nVar.initialize();
        if (a().a("Fabric", 3)) {
            sb = new StringBuilder("Initializing ");
            sb.append("io.fabric.sdk.android:fabric");
            sb.append(" [Version: ");
            sb.append("1.4.8.32");
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            k kVar = (k) it2.next();
            kVar.initializationTask.addDependency(nVar.initializationTask);
            Map<Class<? extends k>, k> map = fVar2.f5035b;
            d dVar = kVar.dependsOnAnnotation;
            if (dVar != null) {
                for (Class cls : dVar.value()) {
                    if (cls.isInterface()) {
                        for (k next : map.values()) {
                            if (cls.isAssignableFrom(next.getClass())) {
                                kVar.initializationTask.addDependency(next.initializationTask);
                            }
                        }
                    } else if (map.get(cls) != null) {
                        kVar.initializationTask.addDependency(map.get(cls).initializationTask);
                    } else {
                        throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                    }
                }
            }
            kVar.initialize();
            if (sb != null) {
                sb.append(kVar.getIdentifier());
                sb.append(" [Version: ");
                sb.append(kVar.getVersion());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            c a2 = a();
            String sb2 = sb.toString();
            if (a2.a("Fabric", 3)) {
                Log.d("Fabric", sb2, (Throwable) null);
            }
        }
    }

    /* compiled from: Fabric */
    public static class a {
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public k[] f5042b;
        public k c;
        public Handler d;
        public c e;

        /* renamed from: f  reason: collision with root package name */
        public String f5043f;

        /* renamed from: g  reason: collision with root package name */
        public i<f> f5044g;

        public a(Context context) {
            if (context != null) {
                this.a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public a a(k... kVarArr) {
            if (this.f5042b == null) {
                if (!l.a(this.a).a()) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    for (k kVar : kVarArr) {
                        String identifier = kVar.getIdentifier();
                        char c2 = 65535;
                        int hashCode = identifier.hashCode();
                        if (hashCode != 607220212) {
                            if (hashCode == 1830452504 && identifier.equals("com.crashlytics.sdk.android:crashlytics")) {
                                c2 = 0;
                            }
                        } else if (identifier.equals("com.crashlytics.sdk.android:answers")) {
                            c2 = 1;
                        }
                        if (c2 == 0 || c2 == 1) {
                            arrayList.add(kVar);
                        } else if (!z) {
                            if (f.a().a("Fabric", 5)) {
                                Log.w("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.", (Throwable) null);
                            }
                            z = true;
                        }
                    }
                    kVarArr = (k[]) arrayList.toArray(new k[0]);
                }
                this.f5042b = kVarArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        public f a() {
            HashMap hashMap;
            if (this.c == null) {
                this.c = new k(k.f5144f, k.f5145g, 1, TimeUnit.SECONDS, new c(), new k.a(10));
            }
            if (this.d == null) {
                this.d = new Handler(Looper.getMainLooper());
            }
            if (this.e == null) {
                this.e = new c();
            }
            if (this.f5043f == null) {
                this.f5043f = this.a.getPackageName();
            }
            if (this.f5044g == null) {
                this.f5044g = i.a;
            }
            k[] kVarArr = this.f5042b;
            if (kVarArr == null) {
                hashMap = new HashMap();
            } else {
                List asList = Arrays.asList(kVarArr);
                HashMap hashMap2 = new HashMap(asList.size());
                f.a((Map<Class<? extends k>, k>) hashMap2, (Collection<? extends k>) asList);
                hashMap = hashMap2;
            }
            Context applicationContext = this.a.getApplicationContext();
            s sVar = new s(applicationContext, this.f5043f, (String) null, hashMap.values());
            k kVar = this.c;
            Handler handler = this.d;
            c cVar = this.e;
            i<f> iVar = this.f5044g;
            Context context = this.a;
            return new f(applicationContext, hashMap, kVar, handler, cVar, false, iVar, sVar, context instanceof Activity ? (Activity) context : null);
        }
    }

    public f a(Activity activity) {
        this.f5038h = new WeakReference<>(activity);
        return this;
    }

    public static c a() {
        if (f5033l == null) {
            return f5034m;
        }
        return f5033l.f5040j;
    }

    public static void a(Map<Class<? extends k>, k> map, Collection<? extends k> collection) {
        for (k kVar : collection) {
            map.put(kVar.getClass(), kVar);
            if (kVar instanceof l) {
                a(map, ((l) kVar).getKits());
            }
        }
    }
}
