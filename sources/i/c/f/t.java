package i.c.f;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite */
public final class t {

    /* renamed from: f  reason: collision with root package name */
    public static final t f4977f = new t(0, new int[0], new Object[0], false);
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f4978b;
    public Object[] c;
    public int d;
    public boolean e;

    public t() {
        this(0, new int[8], new Object[8], true);
    }

    public boolean a(int i2, g gVar) {
        int i3;
        if (this.e) {
            int i4 = i2 >>> 3;
            int i5 = i2 & 7;
            if (i5 == 0) {
                a(i2, (Object) Long.valueOf(gVar.e()));
                return true;
            } else if (i5 == 1) {
                a(i2, (Object) Long.valueOf(gVar.b()));
                return true;
            } else if (i5 == 2) {
                a(i2, (Object) gVar.a());
                return true;
            } else if (i5 == 3) {
                t tVar = new t(0, new int[8], new Object[8], true);
                do {
                    i3 = gVar.i();
                    if (i3 == 0 || !tVar.a(i3, gVar)) {
                        gVar.a((i4 << 3) | 4);
                        a(i2, (Object) tVar);
                    }
                    i3 = gVar.i();
                    break;
                } while (!tVar.a(i3, gVar));
                gVar.a((i4 << 3) | 4);
                a(i2, (Object) tVar);
                return true;
            } else if (i5 == 4) {
                return false;
            } else {
                if (i5 == 5) {
                    int i6 = gVar.e;
                    if (gVar.c - i6 < 4) {
                        gVar.d(4);
                        i6 = gVar.e;
                    }
                    byte[] bArr = gVar.a;
                    gVar.e = i6 + 4;
                    a(i2, (Object) Integer.valueOf((bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24)));
                    return true;
                }
                throw InvalidProtocolBufferException.a();
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && Arrays.equals(this.f4978b, tVar.f4978b) && Arrays.deepEquals(this.c, tVar.c);
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.f4978b);
        return Arrays.deepHashCode(this.c) + ((hashCode + ((527 + this.a) * 31)) * 31);
    }

    public t(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i2;
        this.f4978b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public void a(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.f4978b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                long longValue = ((Long) this.c[i2]).longValue();
                CodedOutputStream.b bVar = (CodedOutputStream.b) codedOutputStream;
                bVar.a((i4 << 3) | 0);
                bVar.b(longValue);
            } else if (i5 == 1) {
                codedOutputStream.a(i4, ((Long) this.c[i2]).longValue());
            } else if (i5 == 2) {
                codedOutputStream.a(i4, (f) this.c[i2]);
            } else if (i5 == 3) {
                codedOutputStream.b(i4, 3);
                ((t) this.c[i2]).a(codedOutputStream);
                codedOutputStream.b(i4, 4);
            } else if (i5 == 5) {
                int intValue = ((Integer) this.c[i2]).intValue();
                CodedOutputStream.b bVar2 = (CodedOutputStream.b) codedOutputStream;
                bVar2.a((i4 << 3) | 5);
                try {
                    byte[] bArr = bVar2.d;
                    int i6 = bVar2.f769f;
                    int i7 = i6 + 1;
                    bVar2.f769f = i7;
                    bArr[i6] = (byte) (intValue & 255);
                    byte[] bArr2 = bVar2.d;
                    int i8 = i7 + 1;
                    bVar2.f769f = i8;
                    bArr2[i7] = (byte) ((intValue >> 8) & 255);
                    byte[] bArr3 = bVar2.d;
                    int i9 = i8 + 1;
                    bVar2.f769f = i9;
                    bArr3[i8] = (byte) ((intValue >> 16) & 255);
                    byte[] bArr4 = bVar2.d;
                    bVar2.f769f = i9 + 1;
                    bArr4[i9] = (byte) ((intValue >> 24) & 255);
                } catch (IndexOutOfBoundsException e2) {
                    throw new CodedOutputStream.OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(bVar2.f769f), Integer.valueOf(bVar2.e), 1}), e2);
                }
            } else {
                throw InvalidProtocolBufferException.a();
            }
        }
    }

    public int a() {
        int i2;
        int i3 = this.d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.a; i5++) {
            int i6 = this.f4978b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 != 0) {
                if (i8 == 1) {
                    i2 = CodedOutputStream.c(i7, ((Long) this.c[i5]).longValue());
                } else if (i8 == 2) {
                    i2 = CodedOutputStream.b(i7, (f) this.c[i5]);
                } else if (i8 == 3) {
                    i4 = ((t) this.c[i5]).a() + (CodedOutputStream.c(i7) * 2) + i4;
                } else if (i8 == 5) {
                    ((Integer) this.c[i5]).intValue();
                    i4 += CodedOutputStream.c(i7) + 4;
                } else {
                    throw new IllegalStateException(InvalidProtocolBufferException.a());
                }
                i4 = i2 + i4;
            } else {
                long longValue = ((Long) this.c[i5]).longValue();
                i4 += CodedOutputStream.a(longValue) + CodedOutputStream.c(i7);
            }
        }
        this.d = i4;
        return i4;
    }

    public final void a(int i2, Object obj) {
        int i3 = this.a;
        if (i3 == this.f4978b.length) {
            int i4 = this.a + (i3 < 4 ? 8 : i3 >> 1);
            this.f4978b = Arrays.copyOf(this.f4978b, i4);
            this.c = Arrays.copyOf(this.c, i4);
        }
        int[] iArr = this.f4978b;
        int i5 = this.a;
        iArr[i5] = i2;
        this.c[i5] = obj;
        this.a = i5 + 1;
    }
}
