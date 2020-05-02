package i.b.a.n.o.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import com.crashlytics.android.core.LogFileManager;
import i.b.a.n.f;
import i.b.a.n.g;
import i.b.a.n.h;
import i.b.a.n.m.b0.d;
import i.b.a.n.m.v;
import i.b.a.n.o.c.r;
import i.b.a.t.j;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* compiled from: Downsampler */
public final class l {

    /* renamed from: f  reason: collision with root package name */
    public static final f<i.b.a.n.b> f2739f = f.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", i.b.a.n.b.f2492g);

    /* renamed from: g  reason: collision with root package name */
    public static final f<h> f2740g = f.a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", h.SRGB);

    /* renamed from: h  reason: collision with root package name */
    public static final f<Boolean> f2741h = f.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);

    /* renamed from: i  reason: collision with root package name */
    public static final f<Boolean> f2742i = f.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);

    /* renamed from: j  reason: collision with root package name */
    public static final Set<String> f2743j = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: k  reason: collision with root package name */
    public static final b f2744k = new a();

    /* renamed from: l  reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f2745l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: m  reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f2746m = j.a(0);
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f2747b;
    public final i.b.a.n.m.b0.b c;
    public final List<ImageHeaderParser> d;
    public final q e = q.b();

    /* compiled from: Downsampler */
    public class a implements b {
        public void a() {
        }

        public void a(d dVar, Bitmap bitmap) {
        }
    }

    /* compiled from: Downsampler */
    public interface b {
        void a();

        void a(d dVar, Bitmap bitmap);
    }

    static {
        f<k> fVar = k.f2735f;
    }

    public l(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, d dVar, i.b.a.n.m.b0.b bVar) {
        this.d = list;
        g.a.a.b.a.a(displayMetrics, "Argument must not be null");
        this.f2747b = displayMetrics;
        g.a.a.b.a.a(dVar, "Argument must not be null");
        this.a = dVar;
        g.a.a.b.a.a(bVar, "Argument must not be null");
        this.c = bVar;
    }

    public static boolean a(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public static int b(double d2) {
        return (int) (d2 + 0.5d);
    }

    public static int[] b(r rVar, BitmapFactory.Options options, b bVar, d dVar) {
        options.inJustDecodeBounds = true;
        a(rVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public v<Bitmap> a(InputStream inputStream, int i2, int i3, g gVar, b bVar) {
        return a((r) new r.a(inputStream, this.d, this.c), i2, i3, gVar, bVar);
    }

    public final v<Bitmap> a(r rVar, int i2, int i3, g gVar, b bVar) {
        g gVar2 = gVar;
        byte[] bArr = (byte[]) this.c.b(LogFileManager.MAX_LOG_SIZE, byte[].class);
        BitmapFactory.Options a2 = a();
        a2.inTempStorage = bArr;
        i.b.a.n.b bVar2 = (i.b.a.n.b) gVar2.a(f2739f);
        h hVar = (h) gVar2.a(f2740g);
        try {
            return e.a(a(rVar, a2, (k) gVar2.a(k.f2735f), bVar2, hVar, gVar2.a(f2742i) != null && ((Boolean) gVar2.a(f2742i)).booleanValue(), i2, i3, ((Boolean) gVar2.a(f2741h)).booleanValue(), bVar), this.a);
        } finally {
            a(a2);
            this.c.put(bArr);
        }
    }

    public static void b(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x055b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap a(i.b.a.n.o.c.r r32, android.graphics.BitmapFactory.Options r33, i.b.a.n.o.c.k r34, i.b.a.n.b r35, i.b.a.n.h r36, boolean r37, int r38, int r39, boolean r40, i.b.a.n.o.c.l.b r41) {
        /*
            r31 = this;
            r1 = r31
            r2 = r32
            r3 = r33
            r0 = r34
            r4 = r35
            r5 = r38
            r6 = r39
            r7 = r41
            long r8 = i.b.a.t.f.a()
            i.b.a.n.m.b0.d r10 = r1.a
            int[] r10 = b(r2, r3, r7, r10)
            r11 = 0
            r11 = r10[r11]
            r12 = 1
            r10 = r10[r12]
            java.lang.String r12 = r3.outMimeType
            r13 = -1
            if (r11 == r13) goto L_0x002b
            if (r10 != r13) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            r13 = r37
            goto L_0x002c
        L_0x002b:
            r13 = 0
        L_0x002c:
            int r14 = r32.c()
            switch(r14) {
                case 3: goto L_0x003b;
                case 4: goto L_0x003b;
                case 5: goto L_0x0038;
                case 6: goto L_0x0038;
                case 7: goto L_0x0035;
                case 8: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            r15 = 0
            goto L_0x003d
        L_0x0035:
            r15 = 270(0x10e, float:3.78E-43)
            goto L_0x003d
        L_0x0038:
            r15 = 90
            goto L_0x003d
        L_0x003b:
            r15 = 180(0xb4, float:2.52E-43)
        L_0x003d:
            switch(r14) {
                case 2: goto L_0x0048;
                case 3: goto L_0x0048;
                case 4: goto L_0x0048;
                case 5: goto L_0x0048;
                case 6: goto L_0x0048;
                case 7: goto L_0x0048;
                case 8: goto L_0x0048;
                default: goto L_0x0040;
            }
        L_0x0040:
            r16 = 0
            r16 = r8
            r37 = r14
            r14 = 0
            goto L_0x004f
        L_0x0048:
            r16 = 1
            r16 = r8
            r37 = r14
            r14 = 1
        L_0x004f:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r8) goto L_0x005d
            boolean r9 = a((int) r15)
            if (r9 == 0) goto L_0x005b
            r9 = r10
            goto L_0x005e
        L_0x005b:
            r9 = r11
            goto L_0x005e
        L_0x005d:
            r9 = r5
        L_0x005e:
            if (r6 != r8) goto L_0x006a
            boolean r8 = a((int) r15)
            if (r8 == 0) goto L_0x0068
            r8 = r11
            goto L_0x006b
        L_0x0068:
            r8 = r10
            goto L_0x006b
        L_0x006a:
            r8 = r6
        L_0x006b:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = r32.a()
            i.b.a.n.m.b0.d r5 = r1.a
            r18 = r12
            java.lang.String r12 = "]"
            java.lang.String r4 = ", target density: "
            r19 = r13
            java.lang.String r13 = ", density: "
            r20 = r14
            java.lang.String r14 = "x"
            java.lang.String r1 = "Downsampler"
            if (r11 <= 0) goto L_0x02a7
            if (r10 > 0) goto L_0x0093
            r0 = 3
            r5 = r1
            r1 = r4
            r4 = r12
            r12 = r13
            r30 = r10
            r10 = r8
            r8 = r9
            r9 = r14
            r14 = r30
            goto L_0x02b3
        L_0x0093:
            boolean r21 = a((int) r15)
            r23 = r4
            if (r21 == 0) goto L_0x00a2
            r21 = r12
            r22 = r13
            r12 = r10
            r13 = r11
            goto L_0x00a8
        L_0x00a2:
            r21 = r12
            r22 = r13
            r13 = r10
            r12 = r11
        L_0x00a8:
            float r4 = r0.b(r12, r13, r9, r8)
            r24 = 0
            int r24 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r24 <= 0) goto L_0x025e
            r24 = r15
            i.b.a.n.o.c.k$e r15 = r0.a(r12, r13, r9, r8)
            if (r15 == 0) goto L_0x0256
            r25 = r10
            float r10 = (float) r12
            r26 = r14
            float r14 = r4 * r10
            r27 = r1
            double r0 = (double) r14
            int r0 = b((double) r0)
            float r1 = (float) r13
            float r14 = r4 * r1
            r29 = r8
            r28 = r9
            double r8 = (double) r14
            int r8 = b((double) r8)
            int r0 = r12 / r0
            int r8 = r13 / r8
            i.b.a.n.o.c.k$e r9 = i.b.a.n.o.c.k.e.MEMORY
            if (r15 != r9) goto L_0x00e1
            int r0 = java.lang.Math.max(r0, r8)
            goto L_0x00e5
        L_0x00e1:
            int r0 = java.lang.Math.min(r0, r8)
        L_0x00e5:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 23
            if (r8 > r9) goto L_0x00f7
            java.util.Set<java.lang.String> r8 = f2743j
            java.lang.String r9 = r3.outMimeType
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x00f7
            r0 = 1
            goto L_0x010e
        L_0x00f7:
            int r0 = java.lang.Integer.highestOneBit(r0)
            r8 = 1
            int r0 = java.lang.Math.max(r8, r0)
            i.b.a.n.o.c.k$e r8 = i.b.a.n.o.c.k.e.MEMORY
            if (r15 != r8) goto L_0x010e
            float r8 = (float) r0
            r9 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 / r4
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x010e
            int r0 = r0 << 1
        L_0x010e:
            r3.inSampleSize = r0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG
            if (r6 != r8) goto L_0x0136
            r5 = 8
            int r5 = java.lang.Math.min(r0, r5)
            float r5 = (float) r5
            float r10 = r10 / r5
            double r8 = (double) r10
            double r8 = java.lang.Math.ceil(r8)
            int r6 = (int) r8
            float r1 = r1 / r5
            double r8 = (double) r1
            double r8 = java.lang.Math.ceil(r8)
            int r1 = (int) r8
            int r5 = r0 / 8
            if (r5 <= 0) goto L_0x012f
            int r6 = r6 / r5
            int r1 = r1 / r5
        L_0x012f:
            r5 = r34
            r8 = r28
            r10 = r29
            goto L_0x0192
        L_0x0136:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG
            if (r6 == r8) goto L_0x0182
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A
            if (r6 != r8) goto L_0x013f
            goto L_0x0182
        L_0x013f:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP
            if (r6 == r8) goto L_0x0161
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A
            if (r6 != r8) goto L_0x0148
            goto L_0x0161
        L_0x0148:
            int r1 = r12 % r0
            if (r1 != 0) goto L_0x0156
            int r1 = r13 % r0
            if (r1 == 0) goto L_0x0151
            goto L_0x0156
        L_0x0151:
            int r6 = r12 / r0
            int r1 = r13 / r0
            goto L_0x012f
        L_0x0156:
            int[] r1 = b(r2, r3, r7, r5)
            r5 = 0
            r6 = r1[r5]
            r5 = 1
            r1 = r1[r5]
            goto L_0x012f
        L_0x0161:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r5 < r6) goto L_0x0173
            float r5 = (float) r0
            float r10 = r10 / r5
            int r6 = java.lang.Math.round(r10)
            float r1 = r1 / r5
            int r1 = java.lang.Math.round(r1)
            goto L_0x012f
        L_0x0173:
            float r5 = (float) r0
            float r10 = r10 / r5
            double r8 = (double) r10
            double r8 = java.lang.Math.floor(r8)
            int r6 = (int) r8
            float r1 = r1 / r5
            double r8 = (double) r1
            double r8 = java.lang.Math.floor(r8)
            goto L_0x0190
        L_0x0182:
            float r5 = (float) r0
            float r10 = r10 / r5
            double r8 = (double) r10
            double r8 = java.lang.Math.floor(r8)
            int r6 = (int) r8
            float r1 = r1 / r5
            double r8 = (double) r1
            double r8 = java.lang.Math.floor(r8)
        L_0x0190:
            int r1 = (int) r8
            goto L_0x012f
        L_0x0192:
            float r5 = r5.b(r6, r1, r8, r10)
            double r12 = (double) r5
            int r5 = a((double) r12)
            double r14 = (double) r5
            double r14 = r14 * r12
            int r9 = b((double) r14)
            float r14 = (float) r9
            float r5 = (float) r5
            float r14 = r14 / r5
            double r14 = (double) r14
            double r14 = r12 / r14
            r28 = r4
            double r4 = (double) r9
            double r14 = r14 * r4
            int r4 = b((double) r14)
            r3.inTargetDensity = r4
            int r4 = a((double) r12)
            r3.inDensity = r4
            int r5 = r3.inTargetDensity
            if (r5 <= 0) goto L_0x01c3
            if (r4 <= 0) goto L_0x01c3
            if (r5 == r4) goto L_0x01c3
            r4 = 1
            goto L_0x01c4
        L_0x01c3:
            r4 = 0
        L_0x01c4:
            if (r4 == 0) goto L_0x01ca
            r4 = 1
            r3.inScaled = r4
            goto L_0x01cf
        L_0x01ca:
            r4 = 0
            r3.inTargetDensity = r4
            r3.inDensity = r4
        L_0x01cf:
            r4 = 2
            r5 = r27
            boolean r4 = android.util.Log.isLoggable(r5, r4)
            if (r4 == 0) goto L_0x024c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "Calculate scaling, source: ["
            r4.append(r9)
            r4.append(r11)
            r9 = r26
            r4.append(r9)
            r14 = r25
            r4.append(r14)
            java.lang.String r15 = "], degreesToRotate: "
            r4.append(r15)
            r15 = r24
            r4.append(r15)
            java.lang.String r15 = ", target: ["
            r4.append(r15)
            r4.append(r8)
            r4.append(r9)
            r4.append(r10)
            java.lang.String r15 = "], power of two scaled: ["
            r4.append(r15)
            r4.append(r6)
            r4.append(r9)
            r4.append(r1)
            java.lang.String r1 = "], exact scale factor: "
            r4.append(r1)
            r1 = r28
            r4.append(r1)
            java.lang.String r1 = ", power of 2 sample size: "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = ", adjusted scale factor: "
            r4.append(r0)
            r4.append(r12)
            r1 = r23
            r4.append(r1)
            int r0 = r3.inTargetDensity
            r4.append(r0)
            r12 = r22
            r4.append(r12)
            int r0 = r3.inDensity
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.v(r5, r0)
            goto L_0x02de
        L_0x024c:
            r12 = r22
            r1 = r23
            r14 = r25
            r9 = r26
            goto L_0x02de
        L_0x0256:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)
            throw r0
        L_0x025e:
            r5 = r0
            r1 = r4
            r30 = r10
            r10 = r8
            r8 = r9
            r9 = r14
            r14 = r30
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot scale with factor: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " from: "
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = ", source: ["
            r2.append(r1)
            r2.append(r11)
            r2.append(r9)
            r2.append(r14)
            java.lang.String r1 = "], target: ["
            r2.append(r1)
            r2.append(r8)
            r2.append(r9)
            r2.append(r10)
            r4 = r21
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x02a7:
            r5 = r1
            r1 = r4
            r4 = r12
            r12 = r13
            r30 = r10
            r10 = r8
            r8 = r9
            r9 = r14
            r14 = r30
            r0 = 3
        L_0x02b3:
            boolean r0 = android.util.Log.isLoggable(r5, r0)
            if (r0 == 0) goto L_0x02de
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = "Unable to determine dimensions for: "
            r0.append(r13)
            r0.append(r6)
            java.lang.String r6 = " with target ["
            r0.append(r6)
            r0.append(r8)
            r0.append(r9)
            r0.append(r10)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r5, r0)
        L_0x02de:
            r4 = r31
            i.b.a.n.o.c.q r0 = r4.e
            r13 = r19
            r6 = r20
            boolean r0 = r0.a(r8, r10, r13, r6)
            if (r0 == 0) goto L_0x02f3
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.HARDWARE
            r3.inPreferredConfig = r6
            r6 = 0
            r3.inMutable = r6
        L_0x02f3:
            if (r0 == 0) goto L_0x02f7
            r6 = r1
            goto L_0x0339
        L_0x02f7:
            i.b.a.n.b r0 = i.b.a.n.b.PREFER_ARGB_8888
            r6 = r1
            r1 = r35
            if (r1 == r0) goto L_0x0335
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = r32.a()     // Catch:{ IOException -> 0x0307 }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x0307 }
            goto L_0x0324
        L_0x0307:
            r0 = move-exception
            r13 = 3
            boolean r13 = android.util.Log.isLoggable(r5, r13)
            if (r13 == 0) goto L_0x0323
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "Cannot determine whether the image has alpha or not from header, format "
            r13.append(r15)
            r13.append(r1)
            java.lang.String r1 = r13.toString()
            android.util.Log.d(r5, r1, r0)
        L_0x0323:
            r0 = 0
        L_0x0324:
            if (r0 == 0) goto L_0x0329
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            goto L_0x032b
        L_0x0329:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x032b:
            r3.inPreferredConfig = r0
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r1) goto L_0x0339
            r0 = 1
            r3.inDither = r0
            goto L_0x0339
        L_0x0335:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r3.inPreferredConfig = r0
        L_0x0339:
            int r0 = r3.inSampleSize
            if (r11 < 0) goto L_0x0347
            if (r14 < 0) goto L_0x0347
            if (r40 == 0) goto L_0x0347
            r23 = r6
            r6 = r8
            r8 = r10
            goto L_0x03d4
        L_0x0347:
            int r0 = r3.inTargetDensity
            if (r0 <= 0) goto L_0x0353
            int r1 = r3.inDensity
            if (r1 <= 0) goto L_0x0353
            if (r0 == r1) goto L_0x0353
            r0 = 1
            goto L_0x0354
        L_0x0353:
            r0 = 0
        L_0x0354:
            if (r0 == 0) goto L_0x035e
            int r0 = r3.inTargetDensity
            float r0 = (float) r0
            int r1 = r3.inDensity
            float r1 = (float) r1
            float r0 = r0 / r1
            goto L_0x0360
        L_0x035e:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0360:
            int r1 = r3.inSampleSize
            float r8 = (float) r11
            float r10 = (float) r1
            float r8 = r8 / r10
            r23 = r6
            double r6 = (double) r8
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            float r7 = (float) r14
            float r7 = r7 / r10
            double r7 = (double) r7
            double r7 = java.lang.Math.ceil(r7)
            int r7 = (int) r7
            float r6 = (float) r6
            float r6 = r6 * r0
            int r6 = java.lang.Math.round(r6)
            float r7 = (float) r7
            float r7 = r7 * r0
            int r8 = java.lang.Math.round(r7)
            r7 = 2
            boolean r7 = android.util.Log.isLoggable(r5, r7)
            if (r7 == 0) goto L_0x03d4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "Calculated target ["
            r7.append(r10)
            r7.append(r6)
            r7.append(r9)
            r7.append(r8)
            java.lang.String r10 = "] for source ["
            r7.append(r10)
            r7.append(r11)
            r7.append(r9)
            r7.append(r14)
            java.lang.String r10 = "], sampleSize: "
            r7.append(r10)
            r7.append(r1)
            java.lang.String r1 = ", targetDensity: "
            r7.append(r1)
            int r1 = r3.inTargetDensity
            r7.append(r1)
            r7.append(r12)
            int r1 = r3.inDensity
            r7.append(r1)
            java.lang.String r1 = ", density multiplier: "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.util.Log.v(r5, r0)
        L_0x03d4:
            r0 = 26
            if (r6 <= 0) goto L_0x03f5
            if (r8 <= 0) goto L_0x03f5
            i.b.a.n.m.b0.d r1 = r4.a
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r0) goto L_0x03ea
            android.graphics.Bitmap$Config r7 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.HARDWARE
            if (r7 != r10) goto L_0x03e7
            goto L_0x03f5
        L_0x03e7:
            android.graphics.Bitmap$Config r7 = r3.outConfig
            goto L_0x03eb
        L_0x03ea:
            r7 = 0
        L_0x03eb:
            if (r7 != 0) goto L_0x03ef
            android.graphics.Bitmap$Config r7 = r3.inPreferredConfig
        L_0x03ef:
            android.graphics.Bitmap r1 = r1.b(r6, r8, r7)
            r3.inBitmap = r1
        L_0x03f5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r1 < r6) goto L_0x041c
            i.b.a.n.h r0 = i.b.a.n.h.DISPLAY_P3
            r1 = r36
            if (r1 != r0) goto L_0x040d
            android.graphics.ColorSpace r0 = r3.outColorSpace
            if (r0 == 0) goto L_0x040d
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x040d
            r0 = 1
            goto L_0x040e
        L_0x040d:
            r0 = 0
        L_0x040e:
            if (r0 == 0) goto L_0x0413
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x0415
        L_0x0413:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x0415:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
            goto L_0x0426
        L_0x041c:
            if (r1 < r0) goto L_0x0426
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r3.inPreferredColorSpace = r0
        L_0x0426:
            i.b.a.n.m.b0.d r0 = r4.a
            r1 = r41
            android.graphics.Bitmap r0 = a(r2, r3, r1, r0)
            i.b.a.n.m.b0.d r2 = r4.a
            r1.a(r2, r0)
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r5, r1)
            if (r1 == 0) goto L_0x04be
            java.lang.String r1 = "Decoded "
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            java.lang.String r2 = a((android.graphics.Bitmap) r0)
            r1.append(r2)
            java.lang.String r2 = " from ["
            r1.append(r2)
            r1.append(r11)
            r1.append(r9)
            r1.append(r14)
            java.lang.String r2 = "] "
            r1.append(r2)
            r2 = r18
            r1.append(r2)
            java.lang.String r2 = " with inBitmap "
            r1.append(r2)
            android.graphics.Bitmap r2 = r3.inBitmap
            java.lang.String r2 = a((android.graphics.Bitmap) r2)
            r1.append(r2)
            java.lang.String r2 = " for ["
            r1.append(r2)
            r2 = r38
            r1.append(r2)
            r1.append(r9)
            r2 = r39
            r1.append(r2)
            java.lang.String r2 = "], sample size: "
            r1.append(r2)
            int r2 = r3.inSampleSize
            r1.append(r2)
            r1.append(r12)
            int r2 = r3.inDensity
            r1.append(r2)
            r2 = r23
            r1.append(r2)
            int r2 = r3.inTargetDensity
            r1.append(r2)
            java.lang.String r2 = ", thread: "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = ", duration: "
            r1.append(r2)
            double r2 = i.b.a.t.f.a(r16)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r5, r1)
        L_0x04be:
            if (r0 == 0) goto L_0x055b
            android.util.DisplayMetrics r1 = r4.f2747b
            int r1 = r1.densityDpi
            r0.setDensity(r1)
            i.b.a.n.m.b0.d r1 = r4.a
            switch(r37) {
                case 2: goto L_0x04ce;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04ce;
                case 5: goto L_0x04ce;
                case 6: goto L_0x04ce;
                case 7: goto L_0x04ce;
                case 8: goto L_0x04ce;
                default: goto L_0x04cc;
            }
        L_0x04cc:
            r2 = 0
            goto L_0x04cf
        L_0x04ce:
            r2 = 1
        L_0x04cf:
            if (r2 != 0) goto L_0x04d4
            r1 = r0
            goto L_0x054f
        L_0x04d4:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5 = 1119092736(0x42b40000, float:90.0)
            r6 = 1127481344(0x43340000, float:180.0)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r37) {
                case 2: goto L_0x050c;
                case 3: goto L_0x0508;
                case 4: goto L_0x04ff;
                case 5: goto L_0x04f6;
                case 6: goto L_0x04f2;
                case 7: goto L_0x04e9;
                case 8: goto L_0x04e5;
                default: goto L_0x04e4;
            }
        L_0x04e4:
            goto L_0x0511
        L_0x04e5:
            r2.setRotate(r3)
            goto L_0x0511
        L_0x04e9:
            r2.setRotate(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r7, r3)
            goto L_0x0511
        L_0x04f2:
            r2.setRotate(r5)
            goto L_0x0511
        L_0x04f6:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setRotate(r5)
            r2.postScale(r7, r3)
            goto L_0x0511
        L_0x04ff:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setRotate(r6)
            r2.postScale(r7, r3)
            goto L_0x0511
        L_0x0508:
            r2.setRotate(r6)
            goto L_0x0511
        L_0x050c:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r7, r3)
        L_0x0511:
            android.graphics.RectF r3 = new android.graphics.RectF
            int r5 = r0.getWidth()
            float r5 = (float) r5
            int r6 = r0.getHeight()
            float r6 = (float) r6
            r7 = 0
            r3.<init>(r7, r7, r5, r6)
            r2.mapRect(r3)
            float r5 = r3.width()
            int r5 = java.lang.Math.round(r5)
            float r6 = r3.height()
            int r6 = java.lang.Math.round(r6)
            android.graphics.Bitmap$Config r7 = i.b.a.n.o.c.y.a(r0)
            android.graphics.Bitmap r1 = r1.a(r5, r6, r7)
            float r5 = r3.left
            float r5 = -r5
            float r3 = r3.top
            float r3 = -r3
            r2.postTranslate(r5, r3)
            boolean r3 = r0.hasAlpha()
            r1.setHasAlpha(r3)
            i.b.a.n.o.c.y.a(r0, r1, r2)
        L_0x054f:
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L_0x055c
            i.b.a.n.m.b0.d r2 = r4.a
            r2.a((android.graphics.Bitmap) r0)
            goto L_0x055c
        L_0x055b:
            r1 = 0
        L_0x055c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.o.c.l.a(i.b.a.n.o.c.r, android.graphics.BitmapFactory$Options, i.b.a.n.o.c.k, i.b.a.n.b, i.b.a.n.h, boolean, int, int, boolean, i.b.a.n.o.c.l$b):android.graphics.Bitmap");
    }

    public static int a(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap a(i.b.a.n.o.c.r r5, android.graphics.BitmapFactory.Options r6, i.b.a.n.o.c.l.b r7, i.b.a.n.m.b0.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.a()
            r5.b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = i.b.a.n.o.c.y.d
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch:{ IllegalArgumentException -> 0x0023 }
            java.util.concurrent.locks.Lock r6 = i.b.a.n.o.c.y.d
            r6.unlock()
            return r5
        L_0x0021:
            r5 = move-exception
            goto L_0x004c
        L_0x0023:
            r4 = move-exception
            java.io.IOException r1 = a((java.lang.IllegalArgumentException) r4, (int) r1, (int) r2, (java.lang.String) r3, (android.graphics.BitmapFactory.Options) r6)     // Catch:{ all -> 0x0021 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0021 }
            if (r2 == 0) goto L_0x0034
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0021 }
        L_0x0034:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x004b
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ IOException -> 0x004a }
            r8.a((android.graphics.Bitmap) r0)     // Catch:{ IOException -> 0x004a }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x004a }
            android.graphics.Bitmap r5 = a(r5, r6, r7, r8)     // Catch:{ IOException -> 0x004a }
            java.util.concurrent.locks.Lock r6 = i.b.a.n.o.c.y.d
            r6.unlock()
            return r5
        L_0x004a:
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x004b:
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x004c:
            java.util.concurrent.locks.Lock r6 = i.b.a.n.o.c.y.d
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.o.c.l.a(i.b.a.n.o.c.r, android.graphics.BitmapFactory$Options, i.b.a.n.o.c.l$b, i.b.a.n.m.b0.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder a2 = i.a.a.a.a.a(" (");
        a2.append(bitmap.getAllocationByteCount());
        a2.append(")");
        String sb = a2.toString();
        StringBuilder a3 = i.a.a.a.a.a("[");
        a3.append(bitmap.getWidth());
        a3.append("x");
        a3.append(bitmap.getHeight());
        a3.append("] ");
        a3.append(bitmap.getConfig());
        a3.append(sb);
        return a3.toString();
    }

    public static IOException a(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + a(options.inBitmap), illegalArgumentException);
    }

    public static synchronized BitmapFactory.Options a() {
        BitmapFactory.Options poll;
        synchronized (l.class) {
            synchronized (f2746m) {
                poll = f2746m.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                b(poll);
            }
        }
        return poll;
    }

    public static void a(BitmapFactory.Options options) {
        b(options);
        synchronized (f2746m) {
            f2746m.offer(options);
        }
    }
}
