package i.c.c.a.c0;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: Ed25519 */
public final class q {
    public static final a a = new a(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* renamed from: b  reason: collision with root package name */
    public static final b f4343b = new b(new c(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* compiled from: Ed25519 */
    public static class d {
        public final c a = new c();

        /* renamed from: b  reason: collision with root package name */
        public final long[] f4347b = new long[10];

        public static /* synthetic */ d a(d dVar, b bVar) {
            b0.a(dVar.a.a, bVar.a.a, bVar.f4345b);
            long[] jArr = dVar.a.f4346b;
            c cVar = bVar.a;
            b0.a(jArr, cVar.f4346b, cVar.c);
            b0.a(dVar.a.c, bVar.a.c, bVar.f4345b);
            long[] jArr2 = dVar.f4347b;
            c cVar2 = bVar.a;
            b0.a(jArr2, cVar2.a, cVar2.f4346b);
            return dVar;
        }
    }

    public static int a(int i2, int i3) {
        int i4 = (~(i2 ^ i3)) & 255;
        int i5 = i4 & (i4 << 4);
        int i6 = i5 & (i5 << 2);
        return ((i6 & (i6 << 1)) >> 7) & 1;
    }

    public static void a(b bVar, d dVar, a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = bVar.a.a;
        c cVar = dVar.a;
        b0.c(jArr2, cVar.f4346b, cVar.a);
        long[] jArr3 = bVar.a.f4346b;
        c cVar2 = dVar.a;
        b0.b(jArr3, cVar2.f4346b, cVar2.a);
        long[] jArr4 = bVar.a.f4346b;
        b0.a(jArr4, jArr4, aVar.f4344b);
        c cVar3 = bVar.a;
        b0.a(cVar3.c, cVar3.a, aVar.a);
        b0.a(bVar.f4345b, dVar.f4347b, aVar.c);
        System.arraycopy(dVar.a.c, 0, bVar.a.a, 0, 10);
        long[] jArr5 = bVar.a.a;
        b0.c(jArr, jArr5, jArr5);
        c cVar4 = bVar.a;
        b0.b(cVar4.a, cVar4.c, cVar4.f4346b);
        c cVar5 = bVar.a;
        long[] jArr6 = cVar5.f4346b;
        b0.c(jArr6, cVar5.c, jArr6);
        b0.c(bVar.a.c, jArr, bVar.f4345b);
        long[] jArr7 = bVar.f4345b;
        b0.b(jArr7, jArr, jArr7);
    }

    public static byte[] b(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[64];
        int i3 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = i3 * 2;
            bArr2[i4 + 0] = (byte) (((bArr[i3] & 255) >> 0) & 15);
            bArr2[i4 + 1] = (byte) (((bArr[i3] & 255) >> 4) & 15);
            i3++;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 63; i6++) {
            bArr2[i6] = (byte) (bArr2[i6] + i5);
            i5 = (bArr2[i6] + 8) >> 4;
            bArr2[i6] = (byte) (bArr2[i6] - (i5 << 4));
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        b bVar = new b(f4343b);
        d dVar = new d();
        for (i2 = 1; i2 < 64; i2 += 2) {
            a aVar = new a(a);
            a(aVar, i2 / 2, bArr2[i2]);
            d.a(dVar, bVar);
            a(bVar, dVar, aVar);
        }
        c cVar = new c();
        c.a(cVar, bVar);
        a(bVar, cVar);
        c.a(cVar, bVar);
        a(bVar, cVar);
        c.a(cVar, bVar);
        a(bVar, cVar);
        c.a(cVar, bVar);
        a(bVar, cVar);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            a aVar2 = new a(a);
            a(aVar2, i7 / 2, bArr2[i7]);
            d.a(dVar, bVar);
            a(bVar, dVar, aVar2);
        }
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        b0.a(jArr, bVar.a.a, bVar.f4345b);
        c cVar2 = bVar.a;
        b0.a(jArr2, cVar2.f4346b, cVar2.c);
        b0.a(jArr3, bVar.a.c, bVar.f4345b);
        long[] jArr4 = new long[10];
        b0.a(jArr4, jArr);
        long[] jArr5 = new long[10];
        b0.a(jArr5, jArr2);
        long[] jArr6 = new long[10];
        b0.a(jArr6, jArr3);
        long[] jArr7 = new long[10];
        b0.a(jArr7, jArr6);
        long[] jArr8 = new long[10];
        b0.b(jArr8, jArr5, jArr4);
        b0.a(jArr8, jArr8, jArr6);
        long[] jArr9 = new long[10];
        b0.a(jArr9, jArr4, jArr5);
        b0.a(jArr9, jArr9, r.a);
        b0.c(jArr9, jArr9, jArr7);
        if (i.c.a.b.d.l.q.b(b0.a(jArr8), b0.a(jArr9))) {
            long[] jArr10 = new long[10];
            long[] jArr11 = new long[10];
            long[] jArr12 = new long[10];
            long[] jArr13 = new long[10];
            long[] jArr14 = new long[10];
            long[] jArr15 = new long[10];
            long[] jArr16 = new long[10];
            long[] jArr17 = new long[10];
            long[] jArr18 = new long[10];
            long[] jArr19 = new long[10];
            long[] jArr20 = new long[10];
            long[] jArr21 = new long[10];
            long[] jArr22 = jArr2;
            long[] jArr23 = new long[10];
            b0.a(jArr13, jArr3);
            b0.a(jArr23, jArr13);
            b0.a(jArr21, jArr23);
            b0.a(jArr14, jArr21, jArr3);
            b0.a(jArr15, jArr14, jArr13);
            b0.a(jArr21, jArr15);
            b0.a(jArr16, jArr21, jArr14);
            b0.a(jArr21, jArr16);
            b0.a(jArr23, jArr21);
            b0.a(jArr21, jArr23);
            b0.a(jArr23, jArr21);
            b0.a(jArr21, jArr23);
            b0.a(jArr17, jArr21, jArr16);
            b0.a(jArr21, jArr17);
            b0.a(jArr23, jArr21);
            for (int i8 = 2; i8 < 10; i8 += 2) {
                b0.a(jArr21, jArr23);
                b0.a(jArr23, jArr21);
            }
            b0.a(jArr18, jArr23, jArr17);
            b0.a(jArr21, jArr18);
            b0.a(jArr23, jArr21);
            for (int i9 = 2; i9 < 20; i9 += 2) {
                b0.a(jArr21, jArr23);
                b0.a(jArr23, jArr21);
            }
            b0.a(jArr21, jArr23, jArr18);
            b0.a(jArr23, jArr21);
            b0.a(jArr21, jArr23);
            for (int i10 = 2; i10 < 10; i10 += 2) {
                b0.a(jArr23, jArr21);
                b0.a(jArr21, jArr23);
            }
            b0.a(jArr19, jArr21, jArr17);
            b0.a(jArr21, jArr19);
            b0.a(jArr23, jArr21);
            for (int i11 = 2; i11 < 50; i11 += 2) {
                b0.a(jArr21, jArr23);
                b0.a(jArr23, jArr21);
            }
            b0.a(jArr20, jArr23, jArr19);
            b0.a(jArr23, jArr20);
            b0.a(jArr21, jArr23);
            for (int i12 = 2; i12 < 100; i12 += 2) {
                b0.a(jArr23, jArr21);
                b0.a(jArr21, jArr23);
            }
            b0.a(jArr23, jArr21, jArr20);
            b0.a(jArr21, jArr23);
            b0.a(jArr23, jArr21);
            for (int i13 = 2; i13 < 50; i13 += 2) {
                b0.a(jArr21, jArr23);
                b0.a(jArr23, jArr21);
            }
            b0.a(jArr21, jArr23, jArr19);
            b0.a(jArr23, jArr21);
            b0.a(jArr21, jArr23);
            b0.a(jArr23, jArr21);
            b0.a(jArr21, jArr23);
            b0.a(jArr23, jArr21);
            b0.a(jArr10, jArr23, jArr15);
            b0.a(jArr11, jArr, jArr10);
            b0.a(jArr12, jArr22, jArr10);
            byte[] a2 = b0.a(jArr12);
            a2[31] = (byte) (a2[31] ^ (a(jArr11) << 7));
            return a2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    /* compiled from: Ed25519 */
    public static class b {
        public final c a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f4345b;

        public b(c cVar, long[] jArr) {
            this.a = cVar;
            this.f4345b = jArr;
        }

        public b(b bVar) {
            this.a = new c(bVar.a);
            this.f4345b = Arrays.copyOf(bVar.f4345b, 10);
        }
    }

    /* compiled from: Ed25519 */
    public static class a {
        public final long[] a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f4344b;
        public final long[] c;

        public a() {
            this.a = new long[10];
            this.f4344b = new long[10];
            this.c = new long[10];
        }

        public void a(a aVar, int i2) {
            k.a(this.a, aVar.a, i2);
            k.a(this.f4344b, aVar.f4344b, i2);
            k.a(this.c, aVar.c, i2);
        }

        public a(long[] jArr, long[] jArr2, long[] jArr3) {
            this.a = jArr;
            this.f4344b = jArr2;
            this.c = jArr3;
        }

        public a(a aVar) {
            this.a = Arrays.copyOf(aVar.a, 10);
            this.f4344b = Arrays.copyOf(aVar.f4344b, 10);
            this.c = Arrays.copyOf(aVar.c, 10);
        }
    }

    /* compiled from: Ed25519 */
    public static class c {
        public final long[] a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f4346b;
        public final long[] c;

        public c() {
            this.a = new long[10];
            this.f4346b = new long[10];
            this.c = new long[10];
        }

        public static c a(c cVar, b bVar) {
            b0.a(cVar.a, bVar.a.a, bVar.f4345b);
            long[] jArr = cVar.f4346b;
            c cVar2 = bVar.a;
            b0.a(jArr, cVar2.f4346b, cVar2.c);
            b0.a(cVar.c, bVar.a.c, bVar.f4345b);
            return cVar;
        }

        public c(long[] jArr, long[] jArr2, long[] jArr3) {
            this.a = jArr;
            this.f4346b = jArr2;
            this.c = jArr3;
        }

        public c(c cVar) {
            this.a = Arrays.copyOf(cVar.a, 10);
            this.f4346b = Arrays.copyOf(cVar.f4346b, 10);
            this.c = Arrays.copyOf(cVar.c, 10);
        }
    }

    public static void a(b bVar, c cVar) {
        long[] jArr = new long[10];
        b0.a(bVar.a.a, cVar.a);
        b0.a(bVar.a.c, cVar.f4346b);
        b0.a(bVar.f4345b, cVar.c);
        long[] jArr2 = bVar.f4345b;
        b0.c(jArr2, jArr2, jArr2);
        b0.c(bVar.a.f4346b, cVar.a, cVar.f4346b);
        b0.a(jArr, bVar.a.f4346b);
        c cVar2 = bVar.a;
        b0.c(cVar2.f4346b, cVar2.c, cVar2.a);
        c cVar3 = bVar.a;
        long[] jArr3 = cVar3.c;
        b0.b(jArr3, jArr3, cVar3.a);
        c cVar4 = bVar.a;
        b0.b(cVar4.a, jArr, cVar4.f4346b);
        long[] jArr4 = bVar.f4345b;
        b0.b(jArr4, jArr4, bVar.a.c);
    }

    public static void a(a aVar, int i2, byte b2) {
        int i3 = (b2 & 255) >> 7;
        int i4 = b2 - (((-i3) & b2) << 1);
        aVar.a(r.f4348b[i2][0], a(i4, 1));
        aVar.a(r.f4348b[i2][1], a(i4, 2));
        aVar.a(r.f4348b[i2][2], a(i4, 3));
        aVar.a(r.f4348b[i2][3], a(i4, 4));
        aVar.a(r.f4348b[i2][4], a(i4, 5));
        aVar.a(r.f4348b[i2][5], a(i4, 6));
        aVar.a(r.f4348b[i2][6], a(i4, 7));
        aVar.a(r.f4348b[i2][7], a(i4, 8));
        long[] copyOf = Arrays.copyOf(aVar.f4344b, 10);
        long[] copyOf2 = Arrays.copyOf(aVar.a, 10);
        long[] copyOf3 = Arrays.copyOf(aVar.c, 10);
        for (int i5 = 0; i5 < copyOf3.length; i5++) {
            copyOf3[i5] = -copyOf3[i5];
        }
        aVar.a(new a(copyOf, copyOf2, copyOf3), i3);
    }

    public static /* synthetic */ int a(long[] jArr) {
        return b0.a(jArr)[0] & 1;
    }

    public static byte[] a(byte[] bArr) {
        MessageDigest a2 = y.f4363h.a("SHA-512");
        a2.update(bArr, 0, 32);
        byte[] digest = a2.digest();
        digest[0] = (byte) (digest[0] & 248);
        digest[31] = (byte) (digest[31] & Byte.MAX_VALUE);
        digest[31] = (byte) (digest[31] | 64);
        return digest;
    }
}
