package i.c.a.b.d.l;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import i.c.a.b.d.k.h.y;
import i.c.a.b.d.k.h.z;
import i.c.a.b.d.l.i;
import i.c.a.b.d.l.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public abstract class b<T extends IInterface> {
    public static final i.c.a.b.d.d[] v = new i.c.a.b.d.d[0];
    public n0 a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3088b;
    public final i c;
    public final i.c.a.b.d.f d;
    public final Handler e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3089f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public final Object f3090g = new Object();
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: h  reason: collision with root package name */
    public o f3091h;

    /* renamed from: i  reason: collision with root package name */
    public c f3092i;
    @GuardedBy("mLock")

    /* renamed from: j  reason: collision with root package name */
    public T f3093j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<g<?>> f3094k = new ArrayList<>();
    @GuardedBy("mLock")

    /* renamed from: l  reason: collision with root package name */
    public j f3095l;
    @GuardedBy("mLock")

    /* renamed from: m  reason: collision with root package name */
    public int f3096m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final a f3097n;

    /* renamed from: o  reason: collision with root package name */
    public final C0111b f3098o;

    /* renamed from: p  reason: collision with root package name */
    public final int f3099p;

    /* renamed from: q  reason: collision with root package name */
    public final String f3100q;
    public i.c.a.b.d.b r = null;
    public boolean s = false;
    public volatile h0 t = null;
    public AtomicInteger u = new AtomicInteger(0);

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public interface a {
        void a(int i2);

        void b(Bundle bundle);
    }

    /* renamed from: i.c.a.b.d.l.b$b  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public interface C0111b {
        void a(i.c.a.b.d.b bVar);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public interface c {
        void a(i.c.a.b.d.b bVar);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public class d implements c {
        public d() {
        }

        public void a(i.c.a.b.d.b bVar) {
            if (bVar.d()) {
                b bVar2 = b.this;
                bVar2.a((l) null, bVar2.p());
                return;
            }
            C0111b bVar3 = b.this.f3098o;
            if (bVar3 != null) {
                bVar3.a(bVar);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public interface e {
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public abstract class f extends g<Boolean> {
        public final int d;
        public final Bundle e;

        public f(int i2, Bundle bundle) {
            super(true);
            this.d = i2;
            this.e = bundle;
        }

        public abstract void a(i.c.a.b.d.b bVar);

        /* JADX WARNING: type inference failed for: r5v11, types: [android.os.Parcelable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                r0 = 1
                r1 = 0
                if (r5 != 0) goto L_0x000c
                i.c.a.b.d.l.b r5 = i.c.a.b.d.l.b.this
                r5.b(r0, r1)
                return
            L_0x000c:
                int r5 = r4.d
                if (r5 == 0) goto L_0x0061
                r2 = 10
                if (r5 == r2) goto L_0x0031
                i.c.a.b.d.l.b r5 = i.c.a.b.d.l.b.this
                r5.b(r0, r1)
                android.os.Bundle r5 = r4.e
                if (r5 == 0) goto L_0x0026
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r5 = r5.getParcelable(r0)
                r1 = r5
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x0026:
                i.c.a.b.d.b r5 = new i.c.a.b.d.b
                int r0 = r4.d
                r5.<init>(r0, r1)
                r4.a((i.c.a.b.d.b) r5)
                goto L_0x0076
            L_0x0031:
                i.c.a.b.d.l.b r5 = i.c.a.b.d.l.b.this
                r5.b(r0, r1)
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Class r3 = r4.getClass()
                java.lang.String r3 = r3.getSimpleName()
                r1[r2] = r3
                i.c.a.b.d.l.b r2 = i.c.a.b.d.l.b.this
                java.lang.String r2 = r2.s()
                r1[r0] = r2
                r0 = 2
                i.c.a.b.d.l.b r2 = i.c.a.b.d.l.b.this
                java.lang.String r2 = r2.r()
                r1[r0] = r2
                java.lang.String r0 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r5.<init>(r0)
                throw r5
            L_0x0061:
                boolean r5 = r4.d()
                if (r5 != 0) goto L_0x0076
                i.c.a.b.d.l.b r5 = i.c.a.b.d.l.b.this
                r5.b(r0, r1)
                i.c.a.b.d.b r5 = new i.c.a.b.d.b
                r0 = 8
                r5.<init>(r0, r1)
                r4.a((i.c.a.b.d.b) r5)
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.d.l.b.f.a(java.lang.Object):void");
        }

        public abstract boolean d();
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public abstract class g<TListener> {
        public TListener a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3102b = false;

        public g(TListener tlistener) {
            this.a = tlistener;
        }

        public final void a() {
            synchronized (this) {
                this.a = null;
            }
        }

        public abstract void a(TListener tlistener);

        public final void b() {
            a();
            synchronized (b.this.f3094k) {
                b.this.f3094k.remove(this);
            }
        }

        public final void c() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.a;
                if (this.f3102b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            }
            if (tlistener != null) {
                try {
                    a(tlistener);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            synchronized (this) {
                this.f3102b = true;
            }
            b();
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public final class h extends i.c.a.b.g.d.g {
        public h(Looper looper) {
            super(looper);
        }

        public static void a(Message message) {
            g gVar = (g) message.obj;
            if (((f) gVar) != null) {
                gVar.b();
                return;
            }
            throw null;
        }

        public static boolean b(Message message) {
            int i2 = message.what;
            return i2 == 2 || i2 == 1 || i2 == 7;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (r0 == 5) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                i.c.a.b.d.l.b r0 = i.c.a.b.d.l.b.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.u
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x0016
                boolean r0 = b(r8)
                if (r0 == 0) goto L_0x0015
                a(r8)
            L_0x0015:
                return
            L_0x0016:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                r4 = 0
                if (r0 == r2) goto L_0x002b
                r5 = 7
                if (r0 == r5) goto L_0x002b
                if (r0 != r1) goto L_0x0029
                i.c.a.b.d.l.b r0 = i.c.a.b.d.l.b.this
                if (r0 == 0) goto L_0x0028
                goto L_0x002b
            L_0x0028:
                throw r4
            L_0x0029:
                if (r0 != r3) goto L_0x0037
            L_0x002b:
                i.c.a.b.d.l.b r0 = i.c.a.b.d.l.b.this
                boolean r0 = r0.a()
                if (r0 != 0) goto L_0x0037
                a(r8)
                return
            L_0x0037:
                int r0 = r8.what
                r5 = 8
                r6 = 3
                if (r0 != r1) goto L_0x0077
                i.c.a.b.d.l.b r0 = i.c.a.b.d.l.b.this
                i.c.a.b.d.b r1 = new i.c.a.b.d.b
                int r8 = r8.arg2
                r1.<init>(r8)
                r0.r = r1
                i.c.a.b.d.l.b r8 = i.c.a.b.d.l.b.this
                boolean r8 = i.c.a.b.d.l.b.b(r8)
                if (r8 == 0) goto L_0x005b
                i.c.a.b.d.l.b r8 = i.c.a.b.d.l.b.this
                boolean r0 = r8.s
                if (r0 != 0) goto L_0x005b
                r8.b(r6, r4)
                return
            L_0x005b:
                i.c.a.b.d.l.b r8 = i.c.a.b.d.l.b.this
                i.c.a.b.d.b r8 = r8.r
                if (r8 == 0) goto L_0x0062
                goto L_0x0067
            L_0x0062:
                i.c.a.b.d.b r8 = new i.c.a.b.d.b
                r8.<init>(r5)
            L_0x0067:
                i.c.a.b.d.l.b r0 = i.c.a.b.d.l.b.this
                i.c.a.b.d.l.b$c r0 = r0.f3092i
                r0.a(r8)
                i.c.a.b.d.l.b r8 = i.c.a.b.d.l.b.this
                if (r8 == 0) goto L_0x0076
                java.lang.System.currentTimeMillis()
                return
            L_0x0076:
                throw r4
            L_0x0077:
                if (r0 != r3) goto L_0x0095
                i.c.a.b.d.l.b r8 = i.c.a.b.d.l.b.this
                i.c.a.b.d.b r8 = r8.r
                if (r8 == 0) goto L_0x0080
                goto L_0x0085
            L_0x0080:
                i.c.a.b.d.b r8 = new i.c.a.b.d.b
                r8.<init>(r5)
            L_0x0085:
                i.c.a.b.d.l.b r0 = i.c.a.b.d.l.b.this
                i.c.a.b.d.l.b$c r0 = r0.f3092i
                r0.a(r8)
                i.c.a.b.d.l.b r8 = i.c.a.b.d.l.b.this
                if (r8 == 0) goto L_0x0094
                java.lang.System.currentTimeMillis()
                return
            L_0x0094:
                throw r4
            L_0x0095:
                if (r0 != r6) goto L_0x00b8
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00a0
                android.app.PendingIntent r0 = (android.app.PendingIntent) r0
                goto L_0x00a1
            L_0x00a0:
                r0 = r4
            L_0x00a1:
                i.c.a.b.d.b r1 = new i.c.a.b.d.b
                int r8 = r8.arg2
                r1.<init>(r8, r0)
                i.c.a.b.d.l.b r8 = i.c.a.b.d.l.b.this
                i.c.a.b.d.l.b$c r8 = r8.f3092i
                r8.a(r1)
                i.c.a.b.d.l.b r8 = i.c.a.b.d.l.b.this
                if (r8 == 0) goto L_0x00b7
                java.lang.System.currentTimeMillis()
                return
            L_0x00b7:
                throw r4
            L_0x00b8:
                r1 = 6
                if (r0 != r1) goto L_0x00d9
                i.c.a.b.d.l.b r0 = i.c.a.b.d.l.b.this
                r0.b(r3, r4)
                i.c.a.b.d.l.b r0 = i.c.a.b.d.l.b.this
                i.c.a.b.d.l.b$a r0 = r0.f3097n
                if (r0 == 0) goto L_0x00cb
                int r8 = r8.arg2
                r0.a(r8)
            L_0x00cb:
                i.c.a.b.d.l.b r8 = i.c.a.b.d.l.b.this
                if (r8 == 0) goto L_0x00d8
                java.lang.System.currentTimeMillis()
                i.c.a.b.d.l.b r8 = i.c.a.b.d.l.b.this
                r8.a(r3, r2, r4)
                return
            L_0x00d8:
                throw r4
            L_0x00d9:
                r1 = 2
                if (r0 != r1) goto L_0x00e8
                i.c.a.b.d.l.b r0 = i.c.a.b.d.l.b.this
                boolean r0 = r0.c()
                if (r0 != 0) goto L_0x00e8
                a(r8)
                return
            L_0x00e8:
                boolean r0 = b(r8)
                if (r0 == 0) goto L_0x00f6
                java.lang.Object r8 = r8.obj
                i.c.a.b.d.l.b$g r8 = (i.c.a.b.d.l.b.g) r8
                r8.c()
                return
            L_0x00f6:
                int r8 = r8.what
                r0 = 45
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Don't know how to handle message: "
                r1.append(r0)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "GmsClient"
                android.util.Log.wtf(r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.d.l.b.h.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static final class i extends m.a {
        public b a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3103b;

        public i(b bVar, int i2) {
            this.a = bVar;
            this.f3103b = i2;
        }

        public final void a(int i2, IBinder iBinder, Bundle bundle) {
            q.a(this.a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            b bVar = this.a;
            int i3 = this.f3103b;
            Handler handler = bVar.e;
            handler.sendMessage(handler.obtainMessage(1, i3, -1, new l(i2, iBinder, bundle)));
            this.a = null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public final class j implements ServiceConnection {
        public final int a;

        public j(int i2) {
            this.a = i2;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            o oVar;
            if (iBinder == null) {
                b.a(b.this);
                return;
            }
            synchronized (b.this.f3090g) {
                b bVar = b.this;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof o)) {
                    oVar = new n(iBinder);
                } else {
                    oVar = (o) queryLocalInterface;
                }
                bVar.f3091h = oVar;
            }
            b bVar2 = b.this;
            int i2 = this.a;
            Handler handler = bVar2.e;
            handler.sendMessage(handler.obtainMessage(7, i2, -1, new k(0)));
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (b.this.f3090g) {
                b.this.f3091h = null;
            }
            Handler handler = b.this.e;
            handler.sendMessage(handler.obtainMessage(6, this.a, 1));
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public final class k extends f {
        public k(int i2) {
            super(i2, (Bundle) null);
        }

        public final void a(i.c.a.b.d.b bVar) {
            b bVar2 = b.this;
            if (bVar2 != null) {
                bVar2.f3092i.a(bVar);
                if (b.this != null) {
                    int i2 = bVar.f3014f;
                    System.currentTimeMillis();
                    return;
                }
                throw null;
            }
            throw null;
        }

        public final boolean d() {
            b.this.f3092i.a(i.c.a.b.d.b.f3013i);
            return true;
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public final class l extends f {

        /* renamed from: g  reason: collision with root package name */
        public final IBinder f3106g;

        public l(int i2, IBinder iBinder, Bundle bundle) {
            super(i2, bundle);
            this.f3106g = iBinder;
        }

        public final void a(i.c.a.b.d.b bVar) {
            C0111b bVar2 = b.this.f3098o;
            if (bVar2 != null) {
                bVar2.a(bVar);
            }
            if (b.this != null) {
                int i2 = bVar.f3014f;
                System.currentTimeMillis();
                return;
            }
            throw null;
        }

        public final boolean d() {
            try {
                String interfaceDescriptor = this.f3106g.getInterfaceDescriptor();
                if (!b.this.r().equals(interfaceDescriptor)) {
                    String r = b.this.r();
                    StringBuilder sb = new StringBuilder(i.a.a.a.a.a(interfaceDescriptor, i.a.a.a.a.a(r, 34)));
                    sb.append("service descriptor mismatch: ");
                    sb.append(r);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface a = b.this.a(this.f3106g);
                if (a == null || (!b.this.a(2, 4, a) && !b.this.a(3, 4, a))) {
                    return false;
                }
                b bVar = b.this;
                bVar.r = null;
                a aVar = bVar.f3097n;
                if (aVar == null) {
                    return true;
                }
                aVar.b((Bundle) null);
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    public b(Context context, Looper looper, i iVar, i.c.a.b.d.f fVar, int i2, a aVar, C0111b bVar, String str) {
        q.a(context, (Object) "Context must not be null");
        this.f3088b = context;
        q.a(looper, (Object) "Looper must not be null");
        Looper looper2 = looper;
        q.a(iVar, (Object) "Supervisor must not be null");
        this.c = iVar;
        q.a(fVar, (Object) "API availability must not be null");
        this.d = fVar;
        this.e = new h(looper);
        this.f3099p = i2;
        this.f3097n = aVar;
        this.f3098o = bVar;
        this.f3100q = str;
    }

    public abstract T a(IBinder iBinder);

    public void a(int i2, T t2) {
    }

    public final boolean a(int i2, int i3, T t2) {
        synchronized (this.f3089f) {
            if (this.f3096m != i2) {
                return false;
            }
            b(i3, t2);
            return true;
        }
    }

    public final i.c.a.b.d.d[] b() {
        h0 h0Var = this.t;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f3127f;
    }

    public boolean c() {
        boolean z;
        synchronized (this.f3089f) {
            z = this.f3096m == 4;
        }
        return z;
    }

    public String d() {
        n0 n0Var;
        if (c() && (n0Var = this.a) != null) {
            return n0Var.f3140b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void f() {
        this.u.incrementAndGet();
        synchronized (this.f3094k) {
            int size = this.f3094k.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f3094k.get(i2).a();
            }
            this.f3094k.clear();
        }
        synchronized (this.f3090g) {
            this.f3091h = null;
        }
        b(1, (IInterface) null);
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return true;
    }

    public abstract int j();

    public void k() {
        int a2 = this.d.a(this.f3088b, j());
        if (a2 != 0) {
            b(1, (IInterface) null);
            d dVar = new d();
            q.a(dVar, (Object) "Connection progress callbacks cannot be null.");
            this.f3092i = dVar;
            Handler handler = this.e;
            handler.sendMessage(handler.obtainMessage(3, this.u.get(), a2, (Object) null));
            return;
        }
        a((c) new d());
    }

    public final void l() {
        if (!c()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public Account m() {
        return null;
    }

    public i.c.a.b.d.d[] n() {
        return v;
    }

    public Bundle o() {
        return new Bundle();
    }

    public Set<Scope> p() {
        return Collections.EMPTY_SET;
    }

    public final T q() {
        T t2;
        synchronized (this.f3089f) {
            if (this.f3096m != 5) {
                l();
                q.b(this.f3093j != null, (Object) "Client is connected but service is null");
                t2 = this.f3093j;
            } else {
                throw new DeadObjectException();
            }
        }
        return t2;
    }

    public abstract String r();

    public abstract String s();

    public final String t() {
        String str = this.f3100q;
        return str == null ? this.f3088b.getClass().getName() : str;
    }

    public final boolean u() {
        boolean z;
        synchronized (this.f3089f) {
            z = this.f3096m == 3;
        }
        return z;
    }

    public final void b(int i2, T t2) {
        q.a((i2 == 4) == (t2 != null));
        synchronized (this.f3089f) {
            this.f3096m = i2;
            this.f3093j = t2;
            a(i2, t2);
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    if (!(this.f3095l == null || this.a == null)) {
                        String str = this.a.a;
                        String str2 = this.a.f3140b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 70 + String.valueOf(str2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str);
                        sb.append(" on ");
                        sb.append(str2);
                        Log.e("GmsClient", sb.toString());
                        i iVar = this.c;
                        String str3 = this.a.a;
                        String str4 = this.a.f3140b;
                        int i3 = this.a.c;
                        j jVar = this.f3095l;
                        String t3 = t();
                        if (iVar != null) {
                            iVar.b(new i.a(str3, str4, i3), jVar, t3);
                            this.u.incrementAndGet();
                        } else {
                            throw null;
                        }
                    }
                    this.f3095l = new j(this.u.get());
                    n0 n0Var = new n0("com.google.android.gms", s(), false, false);
                    this.a = n0Var;
                    if (!this.c.a(new i.a(n0Var.a, n0Var.f3140b, n0Var.c, this.a.d), this.f3095l, t())) {
                        String str5 = this.a.a;
                        String str6 = this.a.f3140b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + String.valueOf(str6).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on ");
                        sb2.append(str6);
                        Log.e("GmsClient", sb2.toString());
                        int i4 = this.u.get();
                        Handler handler = this.e;
                        handler.sendMessage(handler.obtainMessage(7, i4, -1, new k(16)));
                    }
                } else if (i2 == 4) {
                    System.currentTimeMillis();
                }
            } else if (this.f3095l != null) {
                i iVar2 = this.c;
                String str7 = this.a.a;
                String str8 = this.a.f3140b;
                int i5 = this.a.c;
                j jVar2 = this.f3095l;
                String t4 = t();
                if (iVar2 != null) {
                    iVar2.b(new i.a(str7, str8, i5), jVar2, t4);
                    this.f3095l = null;
                } else {
                    throw null;
                }
            }
        }
    }

    public void a(c cVar) {
        q.a(cVar, (Object) "Connection progress callbacks cannot be null.");
        this.f3092i = cVar;
        b(2, (IInterface) null);
    }

    public boolean a() {
        boolean z;
        synchronized (this.f3089f) {
            if (this.f3096m != 2) {
                if (this.f3096m != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public static /* synthetic */ void a(b bVar) {
        int i2;
        if (bVar.u()) {
            i2 = 5;
            bVar.s = true;
        } else {
            i2 = 4;
        }
        Handler handler = bVar.e;
        handler.sendMessage(handler.obtainMessage(i2, bVar.u.get(), 16));
    }

    public void a(l lVar, Set<Scope> set) {
        Bundle o2 = o();
        g gVar = new g(this.f3099p);
        gVar.f3118h = this.f3088b.getPackageName();
        gVar.f3121k = o2;
        if (set != null) {
            gVar.f3120j = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (h()) {
            gVar.f3122l = m() != null ? m() : new Account("<<default account>>", "com.google");
            if (lVar != null) {
                gVar.f3119i = lVar.asBinder();
            }
        }
        gVar.f3123m = v;
        gVar.f3124n = n();
        try {
            synchronized (this.f3090g) {
                if (this.f3091h != null) {
                    this.f3091h.a(new i(this, this.u.get()), gVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            Handler handler = this.e;
            handler.sendMessage(handler.obtainMessage(6, this.u.get(), 1));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            int i2 = this.u.get();
            Handler handler2 = this.e;
            handler2.sendMessage(handler2.obtainMessage(1, i2, -1, new l(8, (IBinder) null, (Bundle) null)));
        }
    }

    public void a(e eVar) {
        z zVar = (z) eVar;
        i.c.a.b.d.k.h.g.this.f3053m.post(new y(zVar));
    }

    public static /* synthetic */ boolean b(b bVar) {
        if (bVar.s || TextUtils.isEmpty(bVar.r()) || TextUtils.isEmpty((CharSequence) null)) {
            return false;
        }
        try {
            Class.forName(bVar.r());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
