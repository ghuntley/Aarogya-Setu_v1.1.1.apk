package i.c.a.b.d.k.h;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import i.c.a.b.d.d;
import i.c.a.b.d.e;
import i.c.a.b.d.f;
import i.c.a.b.d.k.a;
import i.c.a.b.d.k.c;
import i.c.a.b.d.k.h.c;
import i.c.a.b.d.k.h.k;
import i.c.a.b.d.l.b;
import i.c.a.b.d.l.k;
import i.c.a.b.d.l.l;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.u;
import i.c.a.b.h.a;
import i.c.a.b.h.w;
import i.c.a.b.l.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class g implements Handler.Callback {

    /* renamed from: n  reason: collision with root package name */
    public static final Status f3041n = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: o  reason: collision with root package name */
    public static final Status f3042o = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: p  reason: collision with root package name */
    public static final Object f3043p = new Object();
    @GuardedBy("lock")

    /* renamed from: q  reason: collision with root package name */
    public static g f3044q;
    public long a = 5000;

    /* renamed from: b  reason: collision with root package name */
    public long f3045b = 120000;
    public long c = 10000;
    public final Context d;
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final k f3046f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicInteger f3047g = new AtomicInteger(1);

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f3048h = new AtomicInteger(0);

    /* renamed from: i  reason: collision with root package name */
    public final Map<b<?>, a<?>> f3049i = new ConcurrentHashMap(5, 0.75f, 1);
    @GuardedBy("lock")

    /* renamed from: j  reason: collision with root package name */
    public r f3050j = null;
    @GuardedBy("lock")

    /* renamed from: k  reason: collision with root package name */
    public final Set<b<?>> f3051k = new h.e.c();

    /* renamed from: l  reason: collision with root package name */
    public final Set<b<?>> f3052l = new h.e.c();

    /* renamed from: m  reason: collision with root package name */
    public final Handler f3053m;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public class b implements h0, b.c {
        public final a.f a;

        /* renamed from: b  reason: collision with root package name */
        public final b<?> f3063b;
        public l c = null;
        public Set<Scope> d = null;
        public boolean e = false;

        public b(a.f fVar, b<?> bVar) {
            this.a = fVar;
            this.f3063b = bVar;
        }

        public final void a(i.c.a.b.d.b bVar) {
            g.this.f3053m.post(new b0(this, bVar));
        }

        public final void b(i.c.a.b.d.b bVar) {
            a aVar = g.this.f3049i.get(this.f3063b);
            q.a(g.this.f3053m);
            aVar.f3054b.f();
            aVar.a(bVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class c {
        public final b<?> a;

        /* renamed from: b  reason: collision with root package name */
        public final d f3065b;

        public /* synthetic */ c(b bVar, d dVar, v vVar) {
            this.a = bVar;
            this.f3065b = dVar;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                if (!q.b((Object) this.a, (Object) cVar.a) || !q.b((Object) this.f3065b, (Object) cVar.f3065b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.f3065b});
        }

        public final String toString() {
            q.a c = q.c((Object) this);
            c.a("key", this.a);
            c.a("feature", this.f3065b);
            return c.toString();
        }
    }

    public g(Context context, Looper looper, e eVar) {
        this.d = context;
        this.f3053m = new i.c.a.b.g.c.c(looper, this);
        this.e = eVar;
        this.f3046f = new k(eVar);
        Handler handler = this.f3053m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static g a(Context context) {
        g gVar;
        synchronized (f3043p) {
            if (f3044q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f3044q = new g(context.getApplicationContext(), handlerThread.getLooper(), e.d);
            }
            gVar = f3044q;
        }
        return gVar;
    }

    public boolean handleMessage(Message message) {
        a aVar;
        Status status;
        d[] b2;
        int i2 = message.what;
        int i3 = 0;
        long j2 = 300000;
        switch (i2) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.c = j2;
                this.f3053m.removeMessages(12);
                for (b<?> obtainMessage : this.f3049i.keySet()) {
                    Handler handler = this.f3053m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.c);
                }
                break;
            case 2:
                if (((t0) message.obj) != null) {
                    throw null;
                }
                throw null;
            case 3:
                for (a next : this.f3049i.values()) {
                    next.g();
                    next.a();
                }
                break;
            case 4:
            case 8:
            case 13:
                c0 c0Var = (c0) message.obj;
                a aVar2 = this.f3049i.get(c0Var.c.d);
                if (aVar2 == null) {
                    a(c0Var.c);
                    aVar2 = this.f3049i.get(c0Var.c.d);
                }
                if (aVar2.b() && this.f3048h.get() != c0Var.f3039b) {
                    c0Var.a.a(f3041n);
                    aVar2.f();
                    break;
                } else {
                    aVar2.a(c0Var.a);
                    break;
                }
            case 5:
                int i4 = message.arg1;
                i.c.a.b.d.b bVar = (i.c.a.b.d.b) message.obj;
                Iterator<a<?>> it = this.f3049i.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        aVar = it.next();
                        if (aVar.f3057h == i4) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i4);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    e eVar = this.e;
                    int i5 = bVar.f3014f;
                    if (eVar != null) {
                        String errorString = i.c.a.b.d.g.getErrorString(i5);
                        String str = bVar.f3016h;
                        StringBuilder sb2 = new StringBuilder(i.a.a.a.a.a(str, i.a.a.a.a.a(errorString, 69)));
                        sb2.append("Error resolution was canceled by the user, original error message: ");
                        sb2.append(errorString);
                        sb2.append(": ");
                        sb2.append(str);
                        aVar.a(new Status(17, sb2.toString()));
                        break;
                    } else {
                        throw null;
                    }
                }
            case 6:
                if (this.d.getApplicationContext() instanceof Application) {
                    c.a((Application) this.d.getApplicationContext());
                    c.f3035i.a((c.a) new v(this));
                    c cVar = c.f3035i;
                    if (!cVar.f3036f.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!cVar.f3036f.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            cVar.e.set(true);
                        }
                    }
                    if (!cVar.e.get()) {
                        this.c = 300000;
                        break;
                    }
                }
                break;
            case 7:
                a((i.c.a.b.d.k.b<?>) (i.c.a.b.d.k.b) message.obj);
                break;
            case 9:
                if (this.f3049i.containsKey(message.obj)) {
                    a aVar3 = this.f3049i.get(message.obj);
                    q.a(g.this.f3053m);
                    if (aVar3.f3059j) {
                        aVar3.a();
                        break;
                    }
                }
                break;
            case 10:
                for (b<?> remove : this.f3052l) {
                    this.f3049i.remove(remove).f();
                }
                this.f3052l.clear();
                break;
            case 11:
                if (this.f3049i.containsKey(message.obj)) {
                    a aVar4 = this.f3049i.get(message.obj);
                    q.a(g.this.f3053m);
                    if (aVar4.f3059j) {
                        aVar4.h();
                        g gVar = g.this;
                        if (gVar.e.a(gVar.d, f.a) == 18) {
                            status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                        }
                        aVar4.a(status);
                        aVar4.f3054b.f();
                        break;
                    }
                }
                break;
            case 12:
                if (this.f3049i.containsKey(message.obj)) {
                    this.f3049i.get(message.obj).a(true);
                    break;
                }
                break;
            case 14:
                if (((s) message.obj) == null) {
                    throw null;
                } else if (!this.f3049i.containsKey((Object) null)) {
                    throw null;
                } else {
                    this.f3049i.get((Object) null).a(false);
                    throw null;
                }
            case 15:
                c cVar2 = (c) message.obj;
                if (this.f3049i.containsKey(cVar2.a)) {
                    a aVar5 = this.f3049i.get(cVar2.a);
                    if (aVar5.f3060k.contains(cVar2) && !aVar5.f3059j) {
                        if (aVar5.f3054b.c()) {
                            aVar5.e();
                            break;
                        } else {
                            aVar5.a();
                            break;
                        }
                    }
                }
                break;
            case 16:
                c cVar3 = (c) message.obj;
                if (this.f3049i.containsKey(cVar3.a)) {
                    a aVar6 = this.f3049i.get(cVar3.a);
                    if (aVar6.f3060k.remove(cVar3)) {
                        g.this.f3053m.removeMessages(15, cVar3);
                        g.this.f3053m.removeMessages(16, cVar3);
                        d dVar = cVar3.f3065b;
                        ArrayList arrayList = new ArrayList(aVar6.a.size());
                        for (e0 e0Var : aVar6.a) {
                            if ((e0Var instanceof u) && (b2 = ((u) e0Var).b(aVar6)) != null) {
                                int length = b2.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        i6 = -1;
                                    } else if (!q.b((Object) b2[i6], (Object) dVar)) {
                                        i6++;
                                    }
                                }
                                if (i6 >= 0) {
                                    arrayList.add(e0Var);
                                }
                            }
                        }
                        int size = arrayList.size();
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            e0 e0Var2 = (e0) obj;
                            aVar6.a.remove(e0Var2);
                            e0Var2.a((RuntimeException) new UnsupportedApiCallException(dVar));
                        }
                        break;
                    }
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public class a<O extends a.d> implements c.a, c.b, w0 {
        public final Queue<e0> a = new LinkedList();

        /* renamed from: b  reason: collision with root package name */
        public final a.f f3054b;
        public final a.b c;
        public final b<O> d;
        public final x0 e;

        /* renamed from: f  reason: collision with root package name */
        public final Set<t0> f3055f = new HashSet();

        /* renamed from: g  reason: collision with root package name */
        public final Map<k.a<?>, d0> f3056g = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        public final int f3057h;

        /* renamed from: i  reason: collision with root package name */
        public final g0 f3058i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f3059j;

        /* renamed from: k  reason: collision with root package name */
        public final List<c> f3060k = new ArrayList();

        /* renamed from: l  reason: collision with root package name */
        public i.c.a.b.d.b f3061l = null;

        public a(i.c.a.b.d.k.b<O> bVar) {
            Looper looper = g.this.f3053m.getLooper();
            i.c.a.b.d.l.d a2 = bVar.a().a();
            i.c.a.b.d.k.a<O> aVar = bVar.f3025b;
            q.b(aVar.a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
            a.f a3 = aVar.a.a(bVar.a, looper, a2, bVar.c, (c.a) this, (c.b) this);
            this.f3054b = a3;
            if (!(a3 instanceof u)) {
                this.c = a3;
            } else if (((u) a3) != null) {
                this.c = null;
            } else {
                throw null;
            }
            this.d = bVar.d;
            this.e = new x0();
            this.f3057h = bVar.f3026f;
            if (this.f3054b.h()) {
                this.f3058i = new g0(g.this.d, g.this.f3053m, bVar.a().a());
            } else {
                this.f3058i = null;
            }
        }

        public final void a(int i2) {
            if (Looper.myLooper() == g.this.f3053m.getLooper()) {
                d();
            } else {
                g.this.f3053m.post(new x(this));
            }
        }

        public final void b(Bundle bundle) {
            if (Looper.myLooper() == g.this.f3053m.getLooper()) {
                c();
            } else {
                g.this.f3053m.post(new w(this));
            }
        }

        public final void c() {
            g();
            c(i.c.a.b.d.b.f3013i);
            h();
            Iterator<d0> it = this.f3056g.values().iterator();
            while (it.hasNext()) {
                d0 next = it.next();
                if (a(next.a.f3074b) != null) {
                    it.remove();
                } else {
                    try {
                        m<a.b, ?> mVar = next.a;
                        a.b bVar = this.c;
                        h hVar = new h();
                        w wVar = (w) mVar;
                        if (wVar != null) {
                            ((i.c.a.b.g.f.q) bVar).a(wVar.d, wVar.e, new a.C0115a(hVar));
                        } else {
                            throw null;
                        }
                    } catch (DeadObjectException unused) {
                        a(1);
                        this.f3054b.f();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            e();
            i();
        }

        public final void d() {
            g();
            this.f3059j = true;
            x0 x0Var = this.e;
            if (x0Var != null) {
                x0Var.a(true, m0.a);
                Handler handler = g.this.f3053m;
                handler.sendMessageDelayed(Message.obtain(handler, 9, this.d), g.this.a);
                Handler handler2 = g.this.f3053m;
                handler2.sendMessageDelayed(Message.obtain(handler2, 11, this.d), g.this.f3045b);
                g.this.f3046f.a.clear();
                return;
            }
            throw null;
        }

        public final void e() {
            ArrayList arrayList = new ArrayList(this.a);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                e0 e0Var = (e0) obj;
                if (!this.f3054b.c()) {
                    return;
                }
                if (b(e0Var)) {
                    this.a.remove(e0Var);
                }
            }
        }

        public final void f() {
            q.a(g.this.f3053m);
            a(g.f3041n);
            x0 x0Var = this.e;
            if (x0Var != null) {
                x0Var.a(false, g.f3041n);
                for (k.a s0Var : (k.a[]) this.f3056g.keySet().toArray(new k.a[this.f3056g.size()])) {
                    a((e0) new s0(s0Var, new h()));
                }
                c(new i.c.a.b.d.b(4));
                if (this.f3054b.c()) {
                    this.f3054b.a((b.e) new z(this));
                    return;
                }
                return;
            }
            throw null;
        }

        public final void g() {
            q.a(g.this.f3053m);
            this.f3061l = null;
        }

        public final void h() {
            if (this.f3059j) {
                g.this.f3053m.removeMessages(11, this.d);
                g.this.f3053m.removeMessages(9, this.d);
                this.f3059j = false;
            }
        }

        public final void i() {
            g.this.f3053m.removeMessages(12, this.d);
            Handler handler = g.this.f3053m;
            handler.sendMessageDelayed(handler.obtainMessage(12, this.d), g.this.c);
        }

        public final void a(i.c.a.b.d.b bVar) {
            i.c.a.b.j.e eVar;
            q.a(g.this.f3053m);
            g0 g0Var = this.f3058i;
            if (!(g0Var == null || (eVar = g0Var.f3068f) == null)) {
                eVar.f();
            }
            g();
            g.this.f3046f.a.clear();
            c(bVar);
            if (bVar.f3014f == 4) {
                a(g.f3042o);
            } else if (this.a.isEmpty()) {
                this.f3061l = bVar;
            } else {
                b(bVar);
                if (!g.this.a(bVar, this.f3057h)) {
                    if (bVar.f3014f == 18) {
                        this.f3059j = true;
                    }
                    if (this.f3059j) {
                        Handler handler = g.this.f3053m;
                        handler.sendMessageDelayed(Message.obtain(handler, 9, this.d), g.this.a);
                        return;
                    }
                    String str = this.d.c.c;
                    String valueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(valueOf.length() + i.a.a.a.a.a(str, 63));
                    sb.append("API: ");
                    sb.append(str);
                    sb.append(" is not available on this device. Connection failed with: ");
                    sb.append(valueOf);
                    a(new Status(17, sb.toString()));
                }
            }
        }

        public final boolean b(e0 e0Var) {
            if (!(e0Var instanceof u)) {
                c(e0Var);
                return true;
            }
            u uVar = (u) e0Var;
            d a2 = a(uVar.b(this));
            if (a2 == null) {
                c(e0Var);
                return true;
            } else if (uVar.c(this)) {
                c cVar = new c(this.d, a2, (v) null);
                int indexOf = this.f3060k.indexOf(cVar);
                if (indexOf >= 0) {
                    c cVar2 = this.f3060k.get(indexOf);
                    g.this.f3053m.removeMessages(15, cVar2);
                    Handler handler = g.this.f3053m;
                    handler.sendMessageDelayed(Message.obtain(handler, 15, cVar2), g.this.a);
                    return false;
                }
                this.f3060k.add(cVar);
                Handler handler2 = g.this.f3053m;
                handler2.sendMessageDelayed(Message.obtain(handler2, 15, cVar), g.this.a);
                Handler handler3 = g.this.f3053m;
                handler3.sendMessageDelayed(Message.obtain(handler3, 16, cVar), g.this.f3045b);
                i.c.a.b.d.b bVar = new i.c.a.b.d.b(2, (PendingIntent) null);
                b(bVar);
                g.this.a(bVar, this.f3057h);
                return false;
            } else {
                uVar.a((RuntimeException) new UnsupportedApiCallException(a2));
                return false;
            }
        }

        public final void c(e0 e0Var) {
            e0Var.a(this.e, b());
            try {
                e0Var.a((a<?>) this);
            } catch (DeadObjectException unused) {
                a(1);
                this.f3054b.f();
            }
        }

        public final void c(i.c.a.b.d.b bVar) {
            Iterator<t0> it = this.f3055f.iterator();
            if (it.hasNext()) {
                t0 next = it.next();
                if (q.b((Object) bVar, (Object) i.c.a.b.d.b.f3013i)) {
                    this.f3054b.d();
                }
                if (next != null) {
                    throw null;
                }
                throw null;
            }
            this.f3055f.clear();
        }

        public final void a(e0 e0Var) {
            q.a(g.this.f3053m);
            if (!this.f3054b.c()) {
                this.a.add(e0Var);
                i.c.a.b.d.b bVar = this.f3061l;
                if (bVar != null) {
                    if ((bVar.f3014f == 0 || bVar.f3015g == null) ? false : true) {
                        a(this.f3061l);
                        return;
                    }
                }
                a();
            } else if (b(e0Var)) {
                i();
            } else {
                this.a.add(e0Var);
            }
        }

        public final boolean b(i.c.a.b.d.b bVar) {
            synchronized (g.f3043p) {
            }
            return false;
        }

        public final boolean b() {
            return this.f3054b.h();
        }

        public final void a(Status status) {
            q.a(g.this.f3053m);
            for (e0 a2 : this.a) {
                a2.a(status);
            }
            this.a.clear();
        }

        public final boolean a(boolean z) {
            q.a(g.this.f3053m);
            if (!this.f3054b.c() || this.f3056g.size() != 0) {
                return false;
            }
            x0 x0Var = this.e;
            if (!x0Var.a.isEmpty() || !x0Var.f3082b.isEmpty()) {
                if (z) {
                    i();
                }
                return false;
            }
            this.f3054b.f();
            return true;
        }

        public final void a() {
            q.a(g.this.f3053m);
            if (!this.f3054b.c() && !this.f3054b.a()) {
                g gVar = g.this;
                i.c.a.b.d.l.k kVar = gVar.f3046f;
                Context context = gVar.d;
                a.f fVar = this.f3054b;
                if (kVar != null) {
                    q.a(context);
                    q.a(fVar);
                    int i2 = 0;
                    if (fVar.i()) {
                        int j2 = fVar.j();
                        int i3 = kVar.a.get(j2, -1);
                        if (i3 != -1) {
                            i2 = i3;
                        } else {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= kVar.a.size()) {
                                    i2 = i3;
                                    break;
                                }
                                int keyAt = kVar.a.keyAt(i4);
                                if (keyAt > j2 && kVar.a.get(keyAt) == 0) {
                                    break;
                                }
                                i4++;
                            }
                            if (i2 == -1) {
                                i2 = kVar.f3133b.a(context, j2);
                            }
                            kVar.a.put(j2, i2);
                        }
                    }
                    if (i2 != 0) {
                        a(new i.c.a.b.d.b(i2, (PendingIntent) null));
                        return;
                    }
                    b bVar = new b(this.f3054b, this.d);
                    if (this.f3054b.h()) {
                        g0 g0Var = this.f3058i;
                        i.c.a.b.j.e eVar = g0Var.f3068f;
                        if (eVar != null) {
                            eVar.f();
                        }
                        g0Var.e.f3112h = Integer.valueOf(System.identityHashCode(g0Var));
                        a.C0108a<? extends i.c.a.b.j.e, i.c.a.b.j.a> aVar = g0Var.c;
                        Context context2 = g0Var.a;
                        Looper looper = g0Var.f3067b.getLooper();
                        i.c.a.b.d.l.d dVar = g0Var.e;
                        g0Var.f3068f = (i.c.a.b.j.e) aVar.a(context2, looper, dVar, dVar.f3111g, (c.a) g0Var, (c.b) g0Var);
                        g0Var.f3069g = bVar;
                        Set<Scope> set = g0Var.d;
                        if (set == null || set.isEmpty()) {
                            g0Var.f3067b.post(new f0(g0Var));
                        } else {
                            g0Var.f3068f.g();
                        }
                    }
                    this.f3054b.a((b.c) bVar);
                    return;
                }
                throw null;
            }
        }

        public final d a(d[] dVarArr) {
            if (!(dVarArr == null || dVarArr.length == 0)) {
                d[] b2 = this.f3054b.b();
                if (b2 == null) {
                    b2 = new d[0];
                }
                h.e.a aVar = new h.e.a(b2.length);
                for (d dVar : b2) {
                    aVar.put(dVar.e, Long.valueOf(dVar.d()));
                }
                for (d dVar2 : dVarArr) {
                    if (!aVar.containsKey(dVar2.e) || ((Long) aVar.get(dVar2.e)).longValue() < dVar2.d()) {
                        return dVar2;
                    }
                }
            }
            return null;
        }
    }

    public final void a(i.c.a.b.d.k.b<?> bVar) {
        b<O> bVar2 = bVar.d;
        a aVar = this.f3049i.get(bVar2);
        if (aVar == null) {
            aVar = new a(bVar);
            this.f3049i.put(bVar2, aVar);
        }
        if (aVar.b()) {
            this.f3052l.add(bVar2);
        }
        aVar.a();
    }

    public final boolean a(i.c.a.b.d.b bVar, int i2) {
        e eVar = this.e;
        Context context = this.d;
        PendingIntent pendingIntent = null;
        if (eVar != null) {
            if ((bVar.f3014f == 0 || bVar.f3015g == null) ? false : true) {
                pendingIntent = bVar.f3015g;
            } else {
                Intent a2 = eVar.a(context, bVar.f3014f, (String) null);
                if (a2 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a2, 134217728);
                }
            }
            if (pendingIntent == null) {
                return false;
            }
            eVar.a(context, bVar.f3014f, GoogleApiActivity.a(context, pendingIntent, i2));
            return true;
        }
        throw null;
    }
}
