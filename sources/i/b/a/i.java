package i.b.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import i.b.a.n.m.k;
import i.b.a.r.b;
import i.b.a.r.c;
import i.b.a.r.d;
import i.b.a.r.e;
import i.b.a.r.g;
import i.b.a.r.h.h;
import i.b.a.t.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: RequestBuilder */
public class i<TranscodeType> extends i.b.a.r.a<i<TranscodeType>> implements Cloneable {
    public final Context E;
    public final j F;
    public final Class<TranscodeType> G;
    public final e H;
    public k<?, ? super TranscodeType> I;
    public Object J;
    public List<d<TranscodeType>> K;
    public boolean L = true;
    public boolean M;

    /* compiled from: RequestBuilder */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f2422b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|8|9|11|12|13|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0074 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                i.b.a.g[] r0 = i.b.a.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2422b = r0
                r1 = 1
                r2 = 3
                i.b.a.g r3 = i.b.a.g.LOW     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r3 = f2422b     // Catch:{ NoSuchFieldError -> 0x0016 }
                i.b.a.g r4 = i.b.a.g.NORMAL     // Catch:{ NoSuchFieldError -> 0x0016 }
                r3[r0] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r3 = f2422b     // Catch:{ NoSuchFieldError -> 0x001c }
                i.b.a.g r4 = i.b.a.g.HIGH     // Catch:{ NoSuchFieldError -> 0x001c }
                r3[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r3 = 4
                int[] r4 = f2422b     // Catch:{ NoSuchFieldError -> 0x0024 }
                i.b.a.g r5 = i.b.a.g.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0024 }
                r5 = 0
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x003f }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x003f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0053 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x005e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0069 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0074 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0080 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0080 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0080 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0080 }
            L_0x0080:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.b.a.i.a.<clinit>():void");
        }
    }

    static {
        e eVar = (e) ((e) ((e) new e().a(k.f2615b)).a(g.LOW)).a(true);
    }

    @SuppressLint({"CheckResult"})
    public i(c cVar, j jVar, Class<TranscodeType> cls, Context context) {
        this.F = jVar;
        this.G = cls;
        this.E = context;
        e eVar = jVar.e.f2391g;
        k<?, ?> kVar = eVar.f2410f.get(cls);
        if (kVar == null) {
            for (Map.Entry next : eVar.f2410f.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    kVar = (k) next.getValue();
                }
            }
        }
        this.I = kVar == null ? e.f2408k : kVar;
        this.H = cVar.f2391g;
        for (d<Object> a2 : jVar.f2432n) {
            a(a2);
        }
        a((i.b.a.r.a<?>) jVar.g());
    }

    public i<TranscodeType> a(i.b.a.r.a<?> aVar) {
        g.a.a.b.a.a(aVar, "Argument must not be null");
        return (i) super.a(aVar);
    }

    public final <Y extends h<TranscodeType>> Y a(Y y, d<TranscodeType> dVar, i.b.a.r.a<?> aVar, Executor executor) {
        Y y2 = y;
        i.b.a.r.a<?> aVar2 = aVar;
        g.a.a.b.a.a(y2, "Argument must not be null");
        if (this.M) {
            b a2 = a(new Object(), y, dVar, (c) null, this.I, aVar2.f2822h, aVar2.f2829o, aVar2.f2828n, aVar, executor);
            b b2 = y.b();
            if (a2.a(b2)) {
                if (!(!aVar2.f2827m && b2.c())) {
                    g.a.a.b.a.a(b2, "Argument must not be null");
                    if (!b2.isRunning()) {
                        b2.b();
                    }
                    return y2;
                }
            }
            this.F.a((h<?>) y2);
            y2.a(a2);
            this.F.a(y2, a2);
            return y2;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public i<TranscodeType> clone() {
        i<TranscodeType> iVar = (i) super.clone();
        iVar.I = iVar.I.clone();
        return iVar;
    }

    public i<TranscodeType> a(d<TranscodeType> dVar) {
        if (dVar != null) {
            if (this.K == null) {
                this.K = new ArrayList();
            }
            this.K.add(dVar);
        }
        return this;
    }

    public i<TranscodeType> a(Integer num) {
        this.J = num;
        this.M = true;
        return a((i.b.a.r.a<?>) (e) new e().a(i.b.a.s.a.a(this.E)));
    }

    public i<TranscodeType> a(Object obj) {
        this.J = obj;
        this.M = true;
        return this;
    }

    public i.b.a.r.h.i<ImageView, TranscodeType> a(ImageView imageView) {
        i.b.a.r.a aVar;
        i.b.a.r.h.i<ImageView, TranscodeType> iVar;
        j.a();
        g.a.a.b.a.a(imageView, "Argument must not be null");
        if (!i.b.a.r.a.b(this.e, 2048) && this.r && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().d();
                    break;
                case 2:
                    aVar = clone().e();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().g();
                    break;
                case 6:
                    aVar = clone().e();
                    break;
            }
        }
        aVar = this;
        e eVar = this.H;
        Class<TranscodeType> cls = this.G;
        if (eVar.c != null) {
            if (Bitmap.class.equals(cls)) {
                iVar = new i.b.a.r.h.b(imageView);
            } else if (Drawable.class.isAssignableFrom(cls)) {
                iVar = new i.b.a.r.h.d(imageView);
            } else {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            a(iVar, (d) null, aVar, i.b.a.t.e.a);
            return iVar;
        }
        throw null;
    }

    public final b a(Object obj, h<TranscodeType> hVar, d<TranscodeType> dVar, c cVar, k<?, ? super TranscodeType> kVar, g gVar, int i2, int i3, i.b.a.r.a<?> aVar, Executor executor) {
        return a(obj, hVar, dVar, aVar, cVar, kVar, gVar, i2, i3, executor);
    }

    public final b a(Object obj, h<TranscodeType> hVar, d<TranscodeType> dVar, i.b.a.r.a<?> aVar, c cVar, k<?, ? super TranscodeType> kVar, g gVar, int i2, int i3, Executor executor) {
        Context context = this.E;
        e eVar = this.H;
        return new g(context, eVar, obj, this.J, this.G, aVar, i2, i3, gVar, hVar, dVar, this.K, cVar, eVar.f2411g, kVar.e, executor);
    }
}
