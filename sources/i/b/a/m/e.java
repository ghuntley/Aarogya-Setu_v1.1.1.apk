package i.b.a.m;

import android.graphics.Bitmap;
import i.b.a.m.a;
import i.b.a.n.m.b0.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: StandardGifDecoder */
public class e implements a {
    public int[] a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f2473b = new int[256];
    public final a.C0079a c;
    public ByteBuffer d;
    public byte[] e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f2474f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f2475g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f2476h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f2477i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f2478j;

    /* renamed from: k  reason: collision with root package name */
    public int f2479k;

    /* renamed from: l  reason: collision with root package name */
    public c f2480l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f2481m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2482n;

    /* renamed from: o  reason: collision with root package name */
    public int f2483o;

    /* renamed from: p  reason: collision with root package name */
    public int f2484p;

    /* renamed from: q  reason: collision with root package name */
    public int f2485q;
    public int r;
    public Boolean s;
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public e(a.C0079a aVar, c cVar, ByteBuffer byteBuffer, int i2) {
        this.c = aVar;
        this.f2480l = new c();
        a(cVar, byteBuffer, i2);
    }

    public int a() {
        return this.f2479k;
    }

    public int b() {
        return (this.f2478j.length * 4) + this.d.limit() + this.f2477i.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f1, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap c() {
        /*
            r8 = this;
            monitor-enter(r8)
            i.b.a.m.c r0 = r8.f2480l     // Catch:{ all -> 0x00f2 }
            int r0 = r0.c     // Catch:{ all -> 0x00f2 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f2479k     // Catch:{ all -> 0x00f2 }
            if (r0 >= 0) goto L_0x003b
        L_0x000d:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "e"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r3.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00f2 }
            i.b.a.m.c r4 = r8.f2480l     // Catch:{ all -> 0x00f2 }
            int r4 = r4.c     // Catch:{ all -> 0x00f2 }
            r3.append(r4)     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00f2 }
            int r4 = r8.f2479k     // Catch:{ all -> 0x00f2 }
            r3.append(r4)     // Catch:{ all -> 0x00f2 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f2 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00f2 }
        L_0x0039:
            r8.f2483o = r2     // Catch:{ all -> 0x00f2 }
        L_0x003b:
            int r0 = r8.f2483o     // Catch:{ all -> 0x00f2 }
            r3 = 0
            if (r0 == r2) goto L_0x00d0
            int r0 = r8.f2483o     // Catch:{ all -> 0x00f2 }
            r4 = 2
            if (r0 != r4) goto L_0x0047
            goto L_0x00d0
        L_0x0047:
            r0 = 0
            r8.f2483o = r0     // Catch:{ all -> 0x00f2 }
            byte[] r5 = r8.e     // Catch:{ all -> 0x00f2 }
            if (r5 != 0) goto L_0x005a
            i.b.a.m.a$a r5 = r8.c     // Catch:{ all -> 0x00f2 }
            r6 = 255(0xff, float:3.57E-43)
            i.b.a.n.o.g.b r5 = (i.b.a.n.o.g.b) r5
            byte[] r5 = r5.a(r6)     // Catch:{ all -> 0x00f2 }
            r8.e = r5     // Catch:{ all -> 0x00f2 }
        L_0x005a:
            i.b.a.m.c r5 = r8.f2480l     // Catch:{ all -> 0x00f2 }
            java.util.List<i.b.a.m.b> r5 = r5.e     // Catch:{ all -> 0x00f2 }
            int r6 = r8.f2479k     // Catch:{ all -> 0x00f2 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00f2 }
            i.b.a.m.b r5 = (i.b.a.m.b) r5     // Catch:{ all -> 0x00f2 }
            int r6 = r8.f2479k     // Catch:{ all -> 0x00f2 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0076
            i.b.a.m.c r7 = r8.f2480l     // Catch:{ all -> 0x00f2 }
            java.util.List<i.b.a.m.b> r7 = r7.e     // Catch:{ all -> 0x00f2 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00f2 }
            i.b.a.m.b r6 = (i.b.a.m.b) r6     // Catch:{ all -> 0x00f2 }
            goto L_0x0077
        L_0x0076:
            r6 = r3
        L_0x0077:
            int[] r7 = r5.f2462k     // Catch:{ all -> 0x00f2 }
            if (r7 == 0) goto L_0x007e
            int[] r7 = r5.f2462k     // Catch:{ all -> 0x00f2 }
            goto L_0x0082
        L_0x007e:
            i.b.a.m.c r7 = r8.f2480l     // Catch:{ all -> 0x00f2 }
            int[] r7 = r7.a     // Catch:{ all -> 0x00f2 }
        L_0x0082:
            r8.a = r7     // Catch:{ all -> 0x00f2 }
            if (r7 != 0) goto L_0x00aa
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = "e"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r1.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00f2 }
            int r4 = r8.f2479k     // Catch:{ all -> 0x00f2 }
            r1.append(r4)     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f2 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00f2 }
        L_0x00a6:
            r8.f2483o = r2     // Catch:{ all -> 0x00f2 }
            monitor-exit(r8)
            return r3
        L_0x00aa:
            boolean r1 = r5.f2457f     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x00ca
            int[] r1 = r8.f2473b     // Catch:{ all -> 0x00f2 }
            int r3 = r7.length     // Catch:{ all -> 0x00f2 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r3)     // Catch:{ all -> 0x00f2 }
            int[] r1 = r8.f2473b     // Catch:{ all -> 0x00f2 }
            r8.a = r1     // Catch:{ all -> 0x00f2 }
            int r3 = r5.f2459h     // Catch:{ all -> 0x00f2 }
            r1[r3] = r0     // Catch:{ all -> 0x00f2 }
            int r0 = r5.f2458g     // Catch:{ all -> 0x00f2 }
            if (r0 != r4) goto L_0x00ca
            int r0 = r8.f2479k     // Catch:{ all -> 0x00f2 }
            if (r0 != 0) goto L_0x00ca
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00f2 }
            r8.s = r0     // Catch:{ all -> 0x00f2 }
        L_0x00ca:
            android.graphics.Bitmap r0 = r8.a(r5, r6)     // Catch:{ all -> 0x00f2 }
            monitor-exit(r8)
            return r0
        L_0x00d0:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "e"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f2 }
            r1.<init>()     // Catch:{ all -> 0x00f2 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00f2 }
            int r2 = r8.f2483o     // Catch:{ all -> 0x00f2 }
            r1.append(r2)     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f2 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00f2 }
        L_0x00f0:
            monitor-exit(r8)
            return r3
        L_0x00f2:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.m.e.c():android.graphics.Bitmap");
    }

    public void clear() {
        b bVar;
        b bVar2;
        b bVar3;
        this.f2480l = null;
        byte[] bArr = this.f2477i;
        if (!(bArr == null || (bVar3 = ((i.b.a.n.o.g.b) this.c).f2768b) == null)) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f2478j;
        if (!(iArr == null || (bVar2 = ((i.b.a.n.o.g.b) this.c).f2768b) == null)) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f2481m;
        if (bitmap != null) {
            ((i.b.a.n.o.g.b) this.c).a.a(bitmap);
        }
        this.f2481m = null;
        this.d = null;
        this.s = null;
        byte[] bArr2 = this.e;
        if (bArr2 != null && (bVar = ((i.b.a.n.o.g.b) this.c).f2768b) != null) {
            bVar.put(bArr2);
        }
    }

    public void d() {
        this.f2479k = (this.f2479k + 1) % this.f2480l.c;
    }

    public int e() {
        return this.f2480l.c;
    }

    public int f() {
        int i2;
        c cVar = this.f2480l;
        int i3 = cVar.c;
        if (i3 <= 0 || (i2 = this.f2479k) < 0) {
            return 0;
        }
        if (i2 < 0 || i2 >= i3) {
            return -1;
        }
        return cVar.e.get(i2).f2460i;
    }

    public ByteBuffer g() {
        return this.d;
    }

    public void h() {
        this.f2479k = -1;
    }

    public final Bitmap i() {
        Boolean bool = this.s;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t;
        Bitmap b2 = ((i.b.a.n.o.g.b) this.c).a.b(this.r, this.f2485q, config);
        b2.setHasAlpha(true);
        return b2;
    }

    public synchronized void a(c cVar, ByteBuffer byteBuffer, int i2) {
        int[] iArr;
        if (i2 > 0) {
            int highestOneBit = Integer.highestOneBit(i2);
            this.f2483o = 0;
            this.f2480l = cVar;
            this.f2479k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.d.order(ByteOrder.LITTLE_ENDIAN);
            this.f2482n = false;
            Iterator<b> it = cVar.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f2458g == 3) {
                        this.f2482n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f2484p = highestOneBit;
            this.r = cVar.f2464f / highestOneBit;
            this.f2485q = cVar.f2465g / highestOneBit;
            this.f2477i = ((i.b.a.n.o.g.b) this.c).a(cVar.f2464f * cVar.f2465g);
            a.C0079a aVar = this.c;
            int i3 = this.r * this.f2485q;
            b bVar = ((i.b.a.n.o.g.b) aVar).f2768b;
            if (bVar == null) {
                iArr = new int[i3];
            } else {
                iArr = (int[]) bVar.b(i3, int[].class);
            }
            this.f2478j = iArr;
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
        }
    }

    public void a(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f2468j == r1.f2459h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v32, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap a(i.b.a.m.b r36, i.b.a.m.b r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            int[] r10 = r0.f2478j
            r11 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f2481m
            if (r3 == 0) goto L_0x0018
            i.b.a.m.a$a r4 = r0.c
            i.b.a.n.o.g.b r4 = (i.b.a.n.o.g.b) r4
            i.b.a.n.m.b0.d r4 = r4.a
            r4.a((android.graphics.Bitmap) r3)
        L_0x0018:
            r3 = 0
            r0.f2481m = r3
            java.util.Arrays.fill(r10, r11)
        L_0x001e:
            r12 = 3
            if (r2 == 0) goto L_0x002c
            int r3 = r2.f2458g
            if (r3 != r12) goto L_0x002c
            android.graphics.Bitmap r3 = r0.f2481m
            if (r3 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r11)
        L_0x002c:
            r13 = 2
            if (r2 == 0) goto L_0x0080
            int r3 = r2.f2458g
            if (r3 <= 0) goto L_0x0080
            if (r3 != r13) goto L_0x006e
            boolean r3 = r1.f2457f
            if (r3 != 0) goto L_0x0047
            i.b.a.m.c r3 = r0.f2480l
            int r4 = r3.f2470l
            int[] r5 = r1.f2462k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f2468j
            int r5 = r1.f2459h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            int r3 = r2.d
            int r5 = r0.f2484p
            int r3 = r3 / r5
            int r6 = r2.f2456b
            int r6 = r6 / r5
            int r7 = r2.c
            int r7 = r7 / r5
            int r2 = r2.a
            int r2 = r2 / r5
            int r5 = r0.r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005e:
            if (r6 >= r3) goto L_0x0080
            int r2 = r6 + r7
            r5 = r6
        L_0x0063:
            if (r5 >= r2) goto L_0x006a
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0063
        L_0x006a:
            int r2 = r0.r
            int r6 = r6 + r2
            goto L_0x005e
        L_0x006e:
            if (r3 != r12) goto L_0x0080
            android.graphics.Bitmap r2 = r0.f2481m
            if (r2 == 0) goto L_0x0080
            r4 = 0
            int r8 = r0.r
            r6 = 0
            r7 = 0
            int r9 = r0.f2485q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x0080:
            if (r1 == 0) goto L_0x0089
            java.nio.ByteBuffer r2 = r0.d
            int r3 = r1.f2461j
            r2.position(r3)
        L_0x0089:
            if (r1 != 0) goto L_0x0092
            i.b.a.m.c r2 = r0.f2480l
            int r3 = r2.f2464f
            int r2 = r2.f2465g
            goto L_0x0096
        L_0x0092:
            int r3 = r1.c
            int r2 = r1.d
        L_0x0096:
            int r3 = r3 * r2
            byte[] r2 = r0.f2477i
            if (r2 == 0) goto L_0x009f
            int r2 = r2.length
            if (r2 >= r3) goto L_0x00a9
        L_0x009f:
            i.b.a.m.a$a r2 = r0.c
            i.b.a.n.o.g.b r2 = (i.b.a.n.o.g.b) r2
            byte[] r2 = r2.a(r3)
            r0.f2477i = r2
        L_0x00a9:
            byte[] r2 = r0.f2477i
            short[] r4 = r0.f2474f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00b5
            short[] r4 = new short[r5]
            r0.f2474f = r4
        L_0x00b5:
            short[] r4 = r0.f2474f
            byte[] r6 = r0.f2475g
            if (r6 != 0) goto L_0x00bf
            byte[] r6 = new byte[r5]
            r0.f2475g = r6
        L_0x00bf:
            byte[] r6 = r0.f2475g
            byte[] r7 = r0.f2476h
            if (r7 != 0) goto L_0x00cb
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f2476h = r7
        L_0x00cb:
            byte[] r7 = r0.f2476h
            java.nio.ByteBuffer r8 = r0.d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r14 = r9 << r8
            int r15 = r14 + 1
            int r16 = r14 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            r13 = -1
            int r17 = r17 + -1
            r5 = 0
        L_0x00e3:
            if (r5 >= r14) goto L_0x00ee
            r4[r5] = r11
            byte r13 = (byte) r5
            r6[r5] = r13
            int r5 = r5 + 1
            r13 = -1
            goto L_0x00e3
        L_0x00ee:
            byte[] r5 = r0.e
            r12 = r0
            r25 = r8
            r24 = r16
            r28 = r17
            r9 = 0
            r13 = -1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r29 = 0
        L_0x0107:
            r30 = 8
            if (r9 >= r3) goto L_0x01fd
            if (r20 != 0) goto L_0x0144
            java.nio.ByteBuffer r11 = r12.d
            byte r11 = r11.get()
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 > 0) goto L_0x0120
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
            goto L_0x0138
        L_0x0120:
            r31 = r8
            java.nio.ByteBuffer r8 = r12.d
            r32 = r9
            byte[] r9 = r12.e
            r33 = r13
            int r13 = r8.remaining()
            int r13 = java.lang.Math.min(r11, r13)
            r34 = r10
            r10 = 0
            r8.get(r9, r10, r13)
        L_0x0138:
            if (r11 > 0) goto L_0x013f
            r8 = 3
            r12.f2483o = r8
            goto L_0x01ff
        L_0x013f:
            r20 = r11
            r21 = 0
            goto L_0x014c
        L_0x0144:
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
        L_0x014c:
            byte r8 = r5[r21]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r22
            int r23 = r23 + r8
            int r22 = r22 + 8
            r8 = 1
            int r21 = r21 + 1
            r8 = -1
            int r20 = r20 + -1
            r10 = r22
            r11 = r24
            r8 = r25
            r9 = r32
            r13 = r33
            r22 = r5
            r5 = r26
        L_0x016a:
            if (r10 < r8) goto L_0x01e7
            r24 = r12
            r12 = r23 & r28
            int r23 = r23 >> r8
            int r10 = r10 - r8
            if (r12 != r14) goto L_0x0181
            r25 = r10
            r11 = r16
            r28 = r17
            r12 = r24
            r8 = r31
            r13 = -1
            goto L_0x019b
        L_0x0181:
            if (r12 != r15) goto L_0x018b
            r12 = r24
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01ec
        L_0x018b:
            r25 = r10
            r10 = -1
            if (r13 != r10) goto L_0x019e
            byte r5 = r6[r12]
            r2[r27] = r5
            int r27 = r27 + 1
            int r9 = r9 + 1
            r5 = r12
            r13 = r5
            r12 = r0
        L_0x019b:
            r10 = r25
            goto L_0x016a
        L_0x019e:
            if (r12 < r11) goto L_0x01a7
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r13
            goto L_0x01a8
        L_0x01a7:
            r5 = r12
        L_0x01a8:
            if (r5 < r14) goto L_0x01b3
            byte r10 = r6[r5]
            r7[r29] = r10
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01a8
        L_0x01b3:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r5
            r2[r27] = r10
        L_0x01ba:
            r19 = 1
            int r27 = r27 + 1
            int r9 = r9 + 1
            if (r29 <= 0) goto L_0x01c9
            int r29 = r29 + -1
            byte r24 = r7[r29]
            r2[r27] = r24
            goto L_0x01ba
        L_0x01c9:
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r11 >= r5) goto L_0x01e0
            short r13 = (short) r13
            r4[r11] = r13
            r6[r11] = r10
            int r11 = r11 + 1
            r10 = r11 & r28
            if (r10 != 0) goto L_0x01e0
            if (r11 >= r5) goto L_0x01e0
            int r8 = r8 + 1
            int r28 = r28 + r11
        L_0x01e0:
            r13 = r12
            r5 = r24
            r10 = r25
            r12 = r0
            goto L_0x016a
        L_0x01e7:
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r12 = r0
        L_0x01ec:
            r25 = r8
            r5 = r22
            r26 = r24
            r8 = r31
            r22 = r10
            r24 = r11
            r10 = r34
            r11 = 0
            goto L_0x0107
        L_0x01fd:
            r34 = r10
        L_0x01ff:
            r11 = r27
            r10 = 0
            java.util.Arrays.fill(r2, r11, r3, r10)
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x027e
            int r2 = r0.f2484p
            r3 = 1
            if (r2 == r3) goto L_0x0210
            goto L_0x027e
        L_0x0210:
            int[] r2 = r0.f2478j
            int r3 = r1.d
            int r4 = r1.f2456b
            int r5 = r1.c
            int r6 = r1.a
            int r7 = r0.f2479k
            if (r7 != 0) goto L_0x0220
            r7 = 1
            goto L_0x0221
        L_0x0220:
            r7 = 0
        L_0x0221:
            int r8 = r0.r
            byte[] r9 = r0.f2477i
            int[] r11 = r0.a
            r12 = -1
            r13 = 0
        L_0x0229:
            if (r13 >= r3) goto L_0x0260
            int r14 = r13 + r4
            int r14 = r14 * r8
            int r15 = r14 + r6
            int r10 = r15 + r5
            int r14 = r14 + r8
            if (r14 >= r10) goto L_0x0237
            r10 = r14
        L_0x0237:
            int r14 = r1.c
            int r14 = r14 * r13
        L_0x023b:
            if (r15 >= r10) goto L_0x0258
            r16 = r3
            byte r3 = r9[r14]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L_0x024f
            r4 = r11[r4]
            if (r4 == 0) goto L_0x024e
            r2[r15] = r4
            goto L_0x024f
        L_0x024e:
            r12 = r3
        L_0x024f:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x023b
        L_0x0258:
            r16 = r3
            r17 = r4
            int r13 = r13 + 1
            r10 = 0
            goto L_0x0229
        L_0x0260:
            java.lang.Boolean r2 = r0.s
            if (r2 == 0) goto L_0x026a
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0273
        L_0x026a:
            java.lang.Boolean r2 = r0.s
            if (r2 != 0) goto L_0x0275
            if (r7 == 0) goto L_0x0275
            r2 = -1
            if (r12 == r2) goto L_0x0275
        L_0x0273:
            r11 = 1
            goto L_0x0276
        L_0x0275:
            r11 = 0
        L_0x0276:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.s = r2
            goto L_0x0413
        L_0x027e:
            int[] r2 = r0.f2478j
            int r3 = r1.d
            int r4 = r0.f2484p
            int r3 = r3 / r4
            int r5 = r1.f2456b
            int r5 = r5 / r4
            int r6 = r1.c
            int r6 = r6 / r4
            int r7 = r1.a
            int r7 = r7 / r4
            int r4 = r0.f2479k
            r8 = 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            if (r4 != 0) goto L_0x0299
            r10 = 1
            goto L_0x029a
        L_0x0299:
            r10 = 0
        L_0x029a:
            int r4 = r0.f2484p
            int r8 = r0.r
            int r11 = r0.f2485q
            byte[] r12 = r0.f2477i
            int[] r13 = r0.a
            java.lang.Boolean r14 = r0.s
            r37 = r9
            r15 = r14
            r9 = 0
            r14 = 0
            r16 = 1
            r17 = 8
        L_0x02af:
            if (r14 >= r3) goto L_0x03ff
            r18 = r15
            boolean r15 = r1.e
            if (r15 == 0) goto L_0x02de
            if (r9 < r3) goto L_0x02d9
            int r15 = r16 + 1
            r21 = r3
            r3 = 2
            if (r15 == r3) goto L_0x02d4
            r3 = 3
            if (r15 == r3) goto L_0x02cd
            r3 = 4
            r16 = r15
            if (r15 == r3) goto L_0x02c9
            goto L_0x02db
        L_0x02c9:
            r9 = 1
            r17 = 2
            goto L_0x02db
        L_0x02cd:
            r3 = 4
            r16 = r15
            r9 = 2
            r17 = 4
            goto L_0x02db
        L_0x02d4:
            r3 = 4
            r16 = r15
            r9 = 4
            goto L_0x02db
        L_0x02d9:
            r21 = r3
        L_0x02db:
            int r3 = r9 + r17
            goto L_0x02e2
        L_0x02de:
            r21 = r3
            r3 = r9
            r9 = r14
        L_0x02e2:
            int r9 = r9 + r5
            r15 = 1
            if (r4 != r15) goto L_0x02e8
            r15 = 1
            goto L_0x02e9
        L_0x02e8:
            r15 = 0
        L_0x02e9:
            if (r9 >= r11) goto L_0x03df
            int r9 = r9 * r8
            int r20 = r9 + r7
            r22 = r3
            int r3 = r20 + r6
            int r9 = r9 + r8
            if (r9 >= r3) goto L_0x02f7
            r3 = r9
        L_0x02f7:
            int r9 = r14 * r4
            r23 = r5
            int r5 = r1.c
            int r9 = r9 * r5
            if (r15 == 0) goto L_0x0320
            r15 = r18
            r5 = r20
        L_0x0305:
            r24 = r6
            if (r5 >= r3) goto L_0x03d8
            byte r6 = r12[r9]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r13[r6]
            if (r6 == 0) goto L_0x0314
            r2[r5] = r6
            goto L_0x031a
        L_0x0314:
            if (r10 == 0) goto L_0x031a
            if (r15 != 0) goto L_0x031a
            r15 = r37
        L_0x031a:
            int r9 = r9 + r4
            int r5 = r5 + 1
            r6 = r24
            goto L_0x0305
        L_0x0320:
            r24 = r6
            int r5 = r3 - r20
            int r5 = r5 * r4
            int r5 = r5 + r9
            r15 = r18
            r6 = r20
        L_0x032b:
            if (r6 >= r3) goto L_0x03d8
            r20 = r3
            int r3 = r1.c
            r29 = r7
            r31 = r8
            r7 = r9
            r18 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x0340:
            int r8 = r0.f2484p
            int r8 = r8 + r9
            if (r7 >= r8) goto L_0x0375
            byte[] r8 = r0.f2477i
            r32 = r11
            int r11 = r8.length
            if (r7 >= r11) goto L_0x0377
            if (r7 >= r5) goto L_0x0377
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r11 = r0.a
            r8 = r11[r8]
            if (r8 == 0) goto L_0x0370
            int r11 = r8 >> 24
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r18 = r18 + r11
            int r11 = r8 >> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r11
            int r11 = r8 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r11
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0370:
            int r7 = r7 + 1
            r11 = r32
            goto L_0x0340
        L_0x0375:
            r32 = r11
        L_0x0377:
            int r3 = r3 + r9
            r7 = r3
        L_0x0379:
            int r8 = r0.f2484p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x03aa
            byte[] r8 = r0.f2477i
            int r11 = r8.length
            if (r7 >= r11) goto L_0x03aa
            if (r7 >= r5) goto L_0x03aa
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r11 = r0.a
            r8 = r11[r8]
            if (r8 == 0) goto L_0x03a7
            int r11 = r8 >> 24
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r18 = r18 + r11
            int r11 = r8 >> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r11
            int r11 = r8 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r11
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x03a7:
            int r7 = r7 + 1
            goto L_0x0379
        L_0x03aa:
            if (r28 != 0) goto L_0x03ae
            r3 = 0
            goto L_0x03c0
        L_0x03ae:
            int r18 = r18 / r28
            int r3 = r18 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03c0:
            if (r3 == 0) goto L_0x03c5
            r2[r6] = r3
            goto L_0x03cb
        L_0x03c5:
            if (r10 == 0) goto L_0x03cb
            if (r15 != 0) goto L_0x03cb
            r15 = r37
        L_0x03cb:
            int r9 = r9 + r4
            int r6 = r6 + 1
            r3 = r20
            r7 = r29
            r8 = r31
            r11 = r32
            goto L_0x032b
        L_0x03d8:
            r29 = r7
            r31 = r8
            r32 = r11
            goto L_0x03ed
        L_0x03df:
            r22 = r3
            r23 = r5
            r24 = r6
            r29 = r7
            r31 = r8
            r32 = r11
            r15 = r18
        L_0x03ed:
            int r14 = r14 + 1
            r3 = r21
            r9 = r22
            r5 = r23
            r6 = r24
            r7 = r29
            r8 = r31
            r11 = r32
            goto L_0x02af
        L_0x03ff:
            r18 = r15
            java.lang.Boolean r2 = r0.s
            if (r2 != 0) goto L_0x0413
            if (r18 != 0) goto L_0x0409
            r11 = 0
            goto L_0x040d
        L_0x0409:
            boolean r11 = r18.booleanValue()
        L_0x040d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.s = r2
        L_0x0413:
            boolean r2 = r0.f2482n
            if (r2 == 0) goto L_0x0437
            int r1 = r1.f2458g
            if (r1 == 0) goto L_0x041e
            r2 = 1
            if (r1 != r2) goto L_0x0437
        L_0x041e:
            android.graphics.Bitmap r1 = r0.f2481m
            if (r1 != 0) goto L_0x0428
            android.graphics.Bitmap r1 = r35.i()
            r0.f2481m = r1
        L_0x0428:
            android.graphics.Bitmap r1 = r0.f2481m
            r3 = 0
            int r7 = r0.r
            r5 = 0
            r6 = 0
            int r8 = r0.f2485q
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x0437:
            android.graphics.Bitmap r9 = r35.i()
            r3 = 0
            int r7 = r0.r
            r5 = 0
            r6 = 0
            int r8 = r0.f2485q
            r1 = r9
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.m.e.a(i.b.a.m.b, i.b.a.m.b):android.graphics.Bitmap");
    }
}
