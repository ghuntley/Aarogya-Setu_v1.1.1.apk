package p;

import java.util.Arrays;

/* compiled from: SegmentedByteString */
public final class y extends i {

    /* renamed from: j  reason: collision with root package name */
    public final transient byte[][] f5676j;

    /* renamed from: k  reason: collision with root package name */
    public final transient int[] f5677k;

    public y(f fVar, int i2) {
        super((byte[]) null);
        c0.a(fVar.f5646f, 0, (long) i2);
        w wVar = fVar.e;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = wVar.c;
            int i7 = wVar.f5672b;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                wVar = wVar.f5673f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f5676j = new byte[i5][];
        this.f5677k = new int[(i5 * 2)];
        w wVar2 = fVar.e;
        int i8 = 0;
        while (i3 < i2) {
            this.f5676j[i8] = wVar2.a;
            int i9 = (wVar2.c - wVar2.f5672b) + i3;
            i3 = i9 > i2 ? i2 : i9;
            int[] iArr = this.f5677k;
            iArr[i8] = i3;
            iArr[this.f5676j.length + i8] = wVar2.f5672b;
            wVar2.d = true;
            i8++;
            wVar2 = wVar2.f5673f;
        }
    }

    public i a(int i2, int i3) {
        return o().a(i2, i3);
    }

    public final int b(int i2) {
        int binarySearch = Arrays.binarySearch(this.f5677k, 0, this.f5676j.length, i2 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.h() != h() || !a(0, iVar, 0, h())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String f() {
        return o().f();
    }

    public String g() {
        return o().g();
    }

    public int h() {
        return this.f5677k[this.f5676j.length - 1];
    }

    public int hashCode() {
        int i2 = this.f5649f;
        if (i2 != 0) {
            return i2;
        }
        int length = this.f5676j.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < length) {
            byte[] bArr = this.f5676j[i3];
            int[] iArr = this.f5677k;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i4) + i6;
            while (i6 < i8) {
                i5 = (i5 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i4 = i7;
        }
        this.f5649f = i5;
        return i5;
    }

    public i j() {
        return o().j();
    }

    public byte[] l() {
        int[] iArr = this.f5677k;
        byte[][] bArr = this.f5676j;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr2 = this.f5677k;
            int i4 = iArr2[length + i2];
            int i5 = iArr2[i2];
            System.arraycopy(this.f5676j[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return bArr2;
    }

    public String m() {
        return o().m();
    }

    public final i o() {
        return new i(l());
    }

    public String toString() {
        return o().toString();
    }

    public byte a(int i2) {
        int i3;
        c0.a((long) this.f5677k[this.f5676j.length - 1], (long) i2, 1);
        int b2 = b(i2);
        if (b2 == 0) {
            i3 = 0;
        } else {
            i3 = this.f5677k[b2 - 1];
        }
        int[] iArr = this.f5677k;
        byte[][] bArr = this.f5676j;
        return bArr[b2][(i2 - i3) + iArr[bArr.length + b2]];
    }

    public void a(f fVar) {
        int length = this.f5676j.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.f5677k;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            w wVar = new w(this.f5676j[i2], i4, (i4 + i5) - i3, true, false);
            w wVar2 = fVar.e;
            if (wVar2 == null) {
                wVar.f5674g = wVar;
                wVar.f5673f = wVar;
                fVar.e = wVar;
            } else {
                wVar2.f5674g.a(wVar);
            }
            i2++;
            i3 = i5;
        }
        fVar.f5646f += (long) i3;
    }

    public boolean a(int i2, i iVar, int i3, int i4) {
        int i5;
        if (i2 < 0 || i2 > h() - i4) {
            return false;
        }
        int b2 = b(i2);
        while (i4 > 0) {
            if (b2 == 0) {
                i5 = 0;
            } else {
                i5 = this.f5677k[b2 - 1];
            }
            int min = Math.min(i4, ((this.f5677k[b2] - i5) + i5) - i2);
            int[] iArr = this.f5677k;
            byte[][] bArr = this.f5676j;
            if (!iVar.a(i3, bArr[b2], (i2 - i5) + iArr[bArr.length + b2], min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            b2++;
        }
        return true;
    }

    public boolean a(int i2, byte[] bArr, int i3, int i4) {
        int i5;
        if (i2 < 0 || i2 > h() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int b2 = b(i2);
        while (i4 > 0) {
            if (b2 == 0) {
                i5 = 0;
            } else {
                i5 = this.f5677k[b2 - 1];
            }
            int min = Math.min(i4, ((this.f5677k[b2] - i5) + i5) - i2);
            int[] iArr = this.f5677k;
            byte[][] bArr2 = this.f5676j;
            if (!c0.a(bArr2[b2], (i2 - i5) + iArr[bArr2.length + b2], bArr, i3, min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            b2++;
        }
        return true;
    }
}
