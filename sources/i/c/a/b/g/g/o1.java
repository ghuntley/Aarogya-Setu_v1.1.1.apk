package i.c.a.b.g.g;

import android.annotation.SuppressLint;
import android.content.Context;
import i.c.a.b.d.l.q;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public abstract class o1<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f3373f = new Object();
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: g  reason: collision with root package name */
    public static Context f3374g;

    /* renamed from: h  reason: collision with root package name */
    public static a2<z1<l1>> f3375h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicInteger f3376i = new AtomicInteger();
    public final u1 a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3377b;
    public final T c;
    public volatile int d = -1;
    public volatile T e;

    public /* synthetic */ o1(u1 u1Var, String str, Object obj, q1 q1Var) {
        if (u1Var.a != null) {
            this.a = u1Var;
            this.f3377b = str;
            this.c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void a(Context context) {
        synchronized (f3373f) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f3374g != context) {
                c1.c();
                x1.b();
                k1.a();
                f3376i.incrementAndGet();
                f3374g = context;
                f3375h = q.a(r1.e);
            }
        }
    }

    public abstract T a(Object obj);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T b() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f3376i
            int r0 = r0.get()
            int r1 = r6.d
            if (r1 >= r0) goto L_0x0126
            monitor-enter(r6)
            int r1 = r6.d     // Catch:{ all -> 0x0123 }
            if (r1 >= r0) goto L_0x0121
            android.content.Context r1 = f3374g     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x0119
            android.content.Context r1 = f3374g     // Catch:{ all -> 0x0123 }
            i.c.a.b.g.g.k1 r1 = i.c.a.b.g.g.k1.a((android.content.Context) r1)     // Catch:{ all -> 0x0123 }
            java.lang.String r2 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.Object r1 = r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x0031
            java.util.regex.Pattern r2 = i.c.a.b.g.g.b1.c     // Catch:{ all -> 0x0123 }
            java.util.regex.Matcher r1 = r2.matcher(r1)     // Catch:{ all -> 0x0123 }
            boolean r1 = r1.matches()     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x0031
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            r2 = 0
            if (r1 != 0) goto L_0x006f
            i.c.a.b.g.g.u1 r1 = r6.a     // Catch:{ all -> 0x0123 }
            android.net.Uri r1 = r1.a     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x0058
            android.content.Context r1 = f3374g     // Catch:{ all -> 0x0123 }
            i.c.a.b.g.g.u1 r3 = r6.a     // Catch:{ all -> 0x0123 }
            android.net.Uri r3 = r3.a     // Catch:{ all -> 0x0123 }
            boolean r1 = i.c.a.b.g.g.n1.a(r1, r3)     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x0056
            android.content.Context r1 = f3374g     // Catch:{ all -> 0x0123 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x0123 }
            i.c.a.b.g.g.u1 r3 = r6.a     // Catch:{ all -> 0x0123 }
            android.net.Uri r3 = r3.a     // Catch:{ all -> 0x0123 }
            i.c.a.b.g.g.c1 r1 = i.c.a.b.g.g.c1.a(r1, r3)     // Catch:{ all -> 0x0123 }
            goto L_0x005e
        L_0x0056:
            r1 = r2
            goto L_0x005e
        L_0x0058:
            android.content.Context r1 = f3374g     // Catch:{ all -> 0x0123 }
            i.c.a.b.g.g.x1 r1 = i.c.a.b.g.g.x1.a(r1, r2)     // Catch:{ all -> 0x0123 }
        L_0x005e:
            if (r1 == 0) goto L_0x0098
            java.lang.String r3 = r6.a()     // Catch:{ all -> 0x0123 }
            java.lang.Object r1 = r1.a(r3)     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x0098
            java.lang.Object r1 = r6.a((java.lang.Object) r1)     // Catch:{ all -> 0x0123 }
            goto L_0x0099
        L_0x006f:
            java.lang.String r1 = "PhenotypeFlag"
            r3 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r3)     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = "PhenotypeFlag"
            java.lang.String r3 = "Bypass reading Phenotype values for flag: "
            java.lang.String r4 = r6.a()     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0123 }
            int r5 = r4.length()     // Catch:{ all -> 0x0123 }
            if (r5 == 0) goto L_0x008f
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x0123 }
            goto L_0x0095
        L_0x008f:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0123 }
            r4.<init>(r3)     // Catch:{ all -> 0x0123 }
            r3 = r4
        L_0x0095:
            android.util.Log.d(r1, r3)     // Catch:{ all -> 0x0123 }
        L_0x0098:
            r1 = r2
        L_0x0099:
            if (r1 == 0) goto L_0x009c
            goto L_0x00bb
        L_0x009c:
            android.content.Context r1 = f3374g     // Catch:{ all -> 0x0123 }
            i.c.a.b.g.g.k1 r1 = i.c.a.b.g.g.k1.a((android.content.Context) r1)     // Catch:{ all -> 0x0123 }
            i.c.a.b.g.g.u1 r3 = r6.a     // Catch:{ all -> 0x0123 }
            java.lang.String r3 = r3.f3470b     // Catch:{ all -> 0x0123 }
            java.lang.String r3 = r6.a((java.lang.String) r3)     // Catch:{ all -> 0x0123 }
            java.lang.Object r1 = r1.a((java.lang.String) r3)     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x00b5
            java.lang.Object r1 = r6.a((java.lang.Object) r1)     // Catch:{ all -> 0x0123 }
            goto L_0x00b6
        L_0x00b5:
            r1 = r2
        L_0x00b6:
            if (r1 == 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            T r1 = r6.c     // Catch:{ all -> 0x0123 }
        L_0x00bb:
            i.c.a.b.g.g.a2<i.c.a.b.g.g.z1<i.c.a.b.g.g.l1>> r3 = f3375h     // Catch:{ all -> 0x0123 }
            java.lang.Object r3 = r3.a()     // Catch:{ all -> 0x0123 }
            i.c.a.b.g.g.z1 r3 = (i.c.a.b.g.g.z1) r3     // Catch:{ all -> 0x0123 }
            boolean r4 = r3.a()     // Catch:{ all -> 0x0123 }
            if (r4 == 0) goto L_0x0114
            java.lang.Object r1 = r3.b()     // Catch:{ all -> 0x0123 }
            i.c.a.b.g.g.l1 r1 = (i.c.a.b.g.g.l1) r1     // Catch:{ all -> 0x0123 }
            i.c.a.b.g.g.u1 r3 = r6.a     // Catch:{ all -> 0x0123 }
            android.net.Uri r3 = r3.a     // Catch:{ all -> 0x0123 }
            i.c.a.b.g.g.u1 r4 = r6.a     // Catch:{ all -> 0x0123 }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x0123 }
            java.lang.String r5 = r6.f3377b     // Catch:{ all -> 0x0123 }
            if (r1 == 0) goto L_0x0113
            if (r3 == 0) goto L_0x0109
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0123 }
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r1 = r1.a     // Catch:{ all -> 0x0123 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x0123 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0123 }
            if (r1 != 0) goto L_0x00ec
            goto L_0x0109
        L_0x00ec:
            if (r4 == 0) goto L_0x0102
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0123 }
            int r3 = r2.length()     // Catch:{ all -> 0x0123 }
            if (r3 == 0) goto L_0x00fd
            java.lang.String r5 = r4.concat(r2)     // Catch:{ all -> 0x0123 }
            goto L_0x0102
        L_0x00fd:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0123 }
            r5.<init>(r4)     // Catch:{ all -> 0x0123 }
        L_0x0102:
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0123 }
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0123 }
        L_0x0109:
            if (r2 != 0) goto L_0x010e
            T r1 = r6.c     // Catch:{ all -> 0x0123 }
            goto L_0x0114
        L_0x010e:
            java.lang.Object r1 = r6.a((java.lang.Object) r2)     // Catch:{ all -> 0x0123 }
            goto L_0x0114
        L_0x0113:
            throw r2     // Catch:{ all -> 0x0123 }
        L_0x0114:
            r6.e = r1     // Catch:{ all -> 0x0123 }
            r6.d = r0     // Catch:{ all -> 0x0123 }
            goto L_0x0121
        L_0x0119:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "Must call PhenotypeFlag.init() first"
            r0.<init>(r1)     // Catch:{ all -> 0x0123 }
            throw r0     // Catch:{ all -> 0x0123 }
        L_0x0121:
            monitor-exit(r6)     // Catch:{ all -> 0x0123 }
            goto L_0x0126
        L_0x0123:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0123 }
            throw r0
        L_0x0126:
            T r0 = r6.e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.o1.b():java.lang.Object");
    }

    public final String a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f3377b;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f3377b);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final String a() {
        return a(this.a.c);
    }

    public static /* synthetic */ o1 a(u1 u1Var, String str, long j2) {
        return new q1(u1Var, str, Long.valueOf(j2));
    }

    public static /* synthetic */ o1 a(u1 u1Var, String str, boolean z) {
        return new t1(u1Var, str, Boolean.valueOf(z));
    }

    public static /* synthetic */ o1 a(u1 u1Var, String str) {
        return new s1(u1Var, str, Double.valueOf(-3.0d));
    }

    public static /* synthetic */ o1 a(u1 u1Var, String str, String str2) {
        return new v1(u1Var, str, str2);
    }
}
