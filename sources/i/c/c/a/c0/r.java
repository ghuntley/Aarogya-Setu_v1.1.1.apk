package i.c.c.a.c0;

import i.c.c.a.c0.q;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: Ed25519Constants */
public final class r {
    public static final long[] a = b0.a(a(e));

    /* renamed from: b  reason: collision with root package name */
    public static final q.a[][] f4348b = ((q.a[][]) Array.newInstance(q.a.class, new int[]{32, 8}));
    public static final q.a[] c = new q.a[8];
    public static final BigInteger d = BigInteger.valueOf(2).pow(255).subtract(BigInteger.valueOf(19));
    public static final BigInteger e = BigInteger.valueOf(-121665).multiply(BigInteger.valueOf(121666).modInverse(d)).mod(d);

    /* renamed from: f  reason: collision with root package name */
    public static final BigInteger f4349f = BigInteger.valueOf(2).multiply(e).mod(d);

    /* renamed from: g  reason: collision with root package name */
    public static final BigInteger f4350g = BigInteger.valueOf(2).modPow(d.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4)), d);

    /* compiled from: Ed25519Constants */
    public static class b {
        public BigInteger a;

        /* renamed from: b  reason: collision with root package name */
        public BigInteger f4351b;

        public /* synthetic */ b(a aVar) {
        }
    }

    static {
        b bVar = new b((a) null);
        BigInteger mod = BigInteger.valueOf(4).multiply(BigInteger.valueOf(5).modInverse(d)).mod(d);
        bVar.f4351b = mod;
        BigInteger multiply = mod.pow(2).subtract(BigInteger.ONE).multiply(e.multiply(mod.pow(2)).add(BigInteger.ONE).modInverse(d));
        BigInteger modPow = multiply.modPow(d.add(BigInteger.valueOf(3)).divide(BigInteger.valueOf(8)), d);
        if (!modPow.pow(2).subtract(multiply).mod(d).equals(BigInteger.ZERO)) {
            modPow = modPow.multiply(f4350g).mod(d);
        }
        if (modPow.testBit(0)) {
            modPow = d.subtract(modPow);
        }
        bVar.a = modPow;
        b0.a(a(f4349f));
        b0.a(a(f4350g));
        b bVar2 = bVar;
        for (int i2 = 0; i2 < 32; i2++) {
            b bVar3 = bVar2;
            for (int i3 = 0; i3 < 8; i3++) {
                f4348b[i2][i3] = a(bVar3);
                bVar3 = a(bVar3, bVar2);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                bVar2 = a(bVar2, bVar2);
            }
        }
        b a2 = a(bVar, bVar);
        for (int i5 = 0; i5 < 8; i5++) {
            c[i5] = a(bVar);
            bVar = a(bVar, a2);
        }
    }

    public static b a(b bVar, b bVar2) {
        b bVar3 = new b((a) null);
        BigInteger mod = e.multiply(bVar.a.multiply(bVar2.a).multiply(bVar.f4351b).multiply(bVar2.f4351b)).mod(d);
        bVar3.a = bVar.a.multiply(bVar2.f4351b).add(bVar2.a.multiply(bVar.f4351b)).multiply(BigInteger.ONE.add(mod).modInverse(d)).mod(d);
        bVar3.f4351b = bVar.f4351b.multiply(bVar2.f4351b).add(bVar.a.multiply(bVar2.a)).multiply(BigInteger.ONE.subtract(mod).modInverse(d)).mod(d);
        return bVar3;
    }

    public static byte[] a(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = (32 - i2) - 1;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }

    public static q.a a(b bVar) {
        return new q.a(b0.a(a(bVar.f4351b.add(bVar.a).mod(d))), b0.a(a(bVar.f4351b.subtract(bVar.a).mod(d))), b0.a(a(f4349f.multiply(bVar.a).multiply(bVar.f4351b).mod(d))));
    }
}
