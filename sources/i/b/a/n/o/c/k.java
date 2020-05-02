package i.b.a.n.o.c;

import i.b.a.n.f;

/* compiled from: DownsampleStrategy */
public abstract class k {
    public static final k a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final k f2734b = new a();
    public static final k c = new b();
    public static final k d = new d();
    public static final k e;

    /* renamed from: f  reason: collision with root package name */
    public static final f<k> f2735f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f2736g = true;

    /* compiled from: DownsampleStrategy */
    public static class a extends k {
        public e a(int i2, int i3, int i4, int i5) {
            if (b(i2, i3, i4, i5) == 1.0f) {
                return e.QUALITY;
            }
            return k.a.a(i2, i3, i4, i5);
        }

        public float b(int i2, int i3, int i4, int i5) {
            return Math.min(1.0f, k.a.b(i2, i3, i4, i5));
        }
    }

    /* compiled from: DownsampleStrategy */
    public static class b extends k {
        public e a(int i2, int i3, int i4, int i5) {
            return e.QUALITY;
        }

        public float b(int i2, int i3, int i4, int i5) {
            return Math.max(((float) i4) / ((float) i2), ((float) i5) / ((float) i3));
        }
    }

    /* compiled from: DownsampleStrategy */
    public static class c extends k {
        public e a(int i2, int i3, int i4, int i5) {
            if (k.f2736g) {
                return e.QUALITY;
            }
            return e.MEMORY;
        }

        public float b(int i2, int i3, int i4, int i5) {
            if (k.f2736g) {
                return Math.min(((float) i4) / ((float) i2), ((float) i5) / ((float) i3));
            }
            int max = Math.max(i3 / i5, i2 / i4);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* compiled from: DownsampleStrategy */
    public static class d extends k {
        public e a(int i2, int i3, int i4, int i5) {
            return e.QUALITY;
        }

        public float b(int i2, int i3, int i4, int i5) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy */
    public enum e {
        MEMORY,
        QUALITY
    }

    static {
        k kVar = c;
        e = kVar;
        f2735f = f.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", kVar);
    }

    public abstract e a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}
