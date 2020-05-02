package i.b.a.n.o.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import i.b.a.i;
import i.b.a.j;
import i.b.a.n.k;
import i.b.a.n.m.b0.d;
import i.b.a.r.e;
import i.b.a.r.h.h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GifFrameLoader */
public class g {
    public final i.b.a.m.a a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2779b;
    public final List<b> c = new ArrayList();
    public final j d;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2780f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2781g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2782h;

    /* renamed from: i  reason: collision with root package name */
    public i<Bitmap> f2783i;

    /* renamed from: j  reason: collision with root package name */
    public a f2784j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2785k;

    /* renamed from: l  reason: collision with root package name */
    public a f2786l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f2787m;

    /* renamed from: n  reason: collision with root package name */
    public a f2788n;

    /* renamed from: o  reason: collision with root package name */
    public int f2789o;

    /* renamed from: p  reason: collision with root package name */
    public int f2790p;

    /* renamed from: q  reason: collision with root package name */
    public int f2791q;

    /* compiled from: GifFrameLoader */
    public static class a extends i.b.a.r.h.c<Bitmap> {

        /* renamed from: h  reason: collision with root package name */
        public final Handler f2792h;

        /* renamed from: i  reason: collision with root package name */
        public final int f2793i;

        /* renamed from: j  reason: collision with root package name */
        public final long f2794j;

        /* renamed from: k  reason: collision with root package name */
        public Bitmap f2795k;

        public a(Handler handler, int i2, long j2) {
            this.f2792h = handler;
            this.f2793i = i2;
            this.f2794j = j2;
        }

        public void a(Object obj, i.b.a.r.i.b bVar) {
            this.f2795k = (Bitmap) obj;
            this.f2792h.sendMessageAtTime(this.f2792h.obtainMessage(1, this), this.f2794j);
        }

        public void c(Drawable drawable) {
            this.f2795k = null;
        }
    }

    /* compiled from: GifFrameLoader */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader */
    public class c implements Handler.Callback {
        public c() {
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                g.this.a((a) message.obj);
                return true;
            } else if (i2 != 2) {
                return false;
            } else {
                g.this.d.a((h<?>) (a) message.obj);
                return false;
            }
        }
    }

    public g(i.b.a.c cVar, i.b.a.m.a aVar, int i2, int i3, k<Bitmap> kVar, Bitmap bitmap) {
        d dVar = cVar.e;
        Context baseContext = cVar.f2391g.getBaseContext();
        g.a.a.b.a.a(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        j a2 = i.b.a.c.a(baseContext).f2394j.a(baseContext);
        Context baseContext2 = cVar.f2391g.getBaseContext();
        g.a.a.b.a.a(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        i<Bitmap> a3 = i.b.a.c.a(baseContext2).f2394j.a(baseContext2).e().a((i.b.a.r.a<?>) ((e) ((e) ((e) new e().a(i.b.a.n.m.k.a)).b(true)).a(true)).a(i2, i3));
        this.d = a2;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.e = dVar;
        this.f2779b = handler;
        this.f2783i = a3;
        this.a = aVar;
        a(kVar, bitmap);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [i.b.a.n.k<android.graphics.Bitmap>, java.lang.Object, i.b.a.n.k] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(i.b.a.n.k<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            java.lang.String r0 = "Argument must not be null"
            g.a.a.b.a.a(r4, (java.lang.String) r0)
            g.a.a.b.a.a(r5, (java.lang.String) r0)
            r3.f2787m = r5
            i.b.a.i<android.graphics.Bitmap> r0 = r3.f2783i
            i.b.a.r.e r1 = new i.b.a.r.e
            r1.<init>()
            r2 = 1
            i.b.a.r.a r4 = r1.a((i.b.a.n.k<android.graphics.Bitmap>) r4, (boolean) r2)
            i.b.a.i r4 = r0.a((i.b.a.r.a<?>) r4)
            r3.f2783i = r4
            int r4 = i.b.a.t.j.a((android.graphics.Bitmap) r5)
            r3.f2789o = r4
            int r4 = r5.getWidth()
            r3.f2790p = r4
            int r4 = r5.getHeight()
            r3.f2791q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.o.g.g.a(i.b.a.n.k, android.graphics.Bitmap):void");
    }

    public final void a() {
        if (this.f2780f && !this.f2781g) {
            if (this.f2782h) {
                g.a.a.b.a.a(this.f2788n == null, "Pending target must be null when starting from the first frame");
                this.a.h();
                this.f2782h = false;
            }
            a aVar = this.f2788n;
            if (aVar != null) {
                this.f2788n = null;
                a(aVar);
                return;
            }
            this.f2781g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.a.f());
            this.a.d();
            this.f2786l = new a(this.f2779b, this.a.a(), uptimeMillis);
            i<Bitmap> a2 = this.f2783i.a((i.b.a.r.a<?>) (e) new e().a((i.b.a.n.e) new i.b.a.s.d(Double.valueOf(Math.random())))).a((Object) this.a);
            a aVar2 = this.f2786l;
            if (a2 != null) {
                a2.a(aVar2, (i.b.a.r.d<Bitmap>) null, a2, i.b.a.t.e.a);
                return;
            }
            throw null;
        }
    }

    public void a(a aVar) {
        this.f2781g = false;
        if (this.f2785k) {
            this.f2779b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f2780f) {
            this.f2788n = aVar;
        } else {
            if (aVar.f2795k != null) {
                Bitmap bitmap = this.f2787m;
                if (bitmap != null) {
                    this.e.a(bitmap);
                    this.f2787m = null;
                }
                a aVar2 = this.f2784j;
                this.f2784j = aVar;
                int size = this.c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f2779b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }
}
