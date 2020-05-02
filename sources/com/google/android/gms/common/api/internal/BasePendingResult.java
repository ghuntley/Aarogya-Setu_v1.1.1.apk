package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import i.c.a.b.d.k.d;
import i.c.a.b.d.k.e;
import i.c.a.b.d.k.f;
import i.c.a.b.d.k.g;
import i.c.a.b.d.k.h.n0;
import i.c.a.b.d.k.h.v0;
import i.c.a.b.d.l.q;
import i.c.a.b.g.c.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class BasePendingResult<R extends f> extends d<R> {

    /* renamed from: l  reason: collision with root package name */
    public static final ThreadLocal<Boolean> f479l = new v0();
    public final Object a;

    /* renamed from: b  reason: collision with root package name */
    public final a<R> f480b;
    public final CountDownLatch c;
    public final ArrayList<d.a> d;
    public g<? super R> e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<n0> f481f;

    /* renamed from: g  reason: collision with root package name */
    public R f482g;

    /* renamed from: h  reason: collision with root package name */
    public Status f483h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f484i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f485j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f486k;
    @KeepName
    public b mResultGuardian;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class a<R extends f> extends c {
        public a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                Pair pair = (Pair) message.obj;
                g gVar = (g) pair.first;
                f fVar = (f) pair.second;
                try {
                    gVar.a(fVar);
                } catch (RuntimeException e) {
                    BasePendingResult.c(fVar);
                    throw e;
                }
            } else if (i2 != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).a(Status.f474k);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public final class b {
        public /* synthetic */ b(v0 v0Var) {
        }

        public final void finalize() {
            BasePendingResult.c(BasePendingResult.this.f482g);
            super.finalize();
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.a = new Object();
        this.c = new CountDownLatch(1);
        this.d = new ArrayList<>();
        this.f481f = new AtomicReference<>();
        this.f486k = false;
        this.f480b = new a<>(Looper.getMainLooper());
        new WeakReference((Object) null);
    }

    public static void c(f fVar) {
        if (fVar instanceof e) {
            try {
                ((e) fVar).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(fVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    public final void a(d.a aVar) {
        q.a(aVar != null, (Object) "Callback cannot be null.");
        synchronized (this.a) {
            if (b()) {
                aVar.a(this.f483h);
            } else {
                this.d.add(aVar);
            }
        }
    }

    public final boolean b() {
        return this.c.getCount() == 0;
    }

    public final void b(R r) {
        this.f482g = r;
        this.c.countDown();
        this.f483h = this.f482g.c();
        if (this.e != null) {
            this.f480b.removeMessages(2);
            a<R> aVar = this.f480b;
            g<? super R> gVar = this.e;
            f a2 = a();
            if (aVar != null) {
                aVar.sendMessage(aVar.obtainMessage(1, new Pair(gVar, a2)));
            } else {
                throw null;
            }
        } else if (this.f482g instanceof e) {
            this.mResultGuardian = new b((v0) null);
        }
        ArrayList<d.a> arrayList = this.d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            d.a aVar2 = arrayList.get(i2);
            i2++;
            aVar2.a(this.f483h);
        }
        this.d.clear();
    }

    public final void a(R r) {
        synchronized (this.a) {
            if (!this.f485j) {
                b();
                boolean z = true;
                q.b(!b(), (Object) "Results have already been set");
                if (this.f484i) {
                    z = false;
                }
                q.b(z, (Object) "Result has already been consumed");
                b(r);
                return;
            }
            c(r);
        }
    }

    public BasePendingResult(i.c.a.b.d.k.c cVar) {
        this.a = new Object();
        this.c = new CountDownLatch(1);
        this.d = new ArrayList<>();
        this.f481f = new AtomicReference<>();
        this.f486k = false;
        this.f480b = new a<>(cVar != null ? cVar.a() : Looper.getMainLooper());
        new WeakReference(cVar);
    }

    public final void a(Status status) {
        synchronized (this.a) {
            if (!b()) {
                a(new i.c.a.b.h.f(status));
                this.f485j = true;
            }
        }
    }

    public final R a() {
        R r;
        synchronized (this.a) {
            q.b(!this.f484i, (Object) "Result has already been consumed.");
            q.b(b(), (Object) "Result is not ready.");
            r = this.f482g;
            this.f482g = null;
            this.e = null;
            this.f484i = true;
        }
        n0 andSet = this.f481f.getAndSet((Object) null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }
}
