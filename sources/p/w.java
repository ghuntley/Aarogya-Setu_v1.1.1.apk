package p;

import javax.annotation.Nullable;

/* compiled from: Segment */
public final class w {
    public final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public int f5672b;
    public int c;
    public boolean d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public w f5673f;

    /* renamed from: g  reason: collision with root package name */
    public w f5674g;

    public w() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    @Nullable
    public final w a() {
        w wVar = this.f5673f;
        if (wVar == this) {
            wVar = null;
        }
        w wVar2 = this.f5674g;
        wVar2.f5673f = this.f5673f;
        this.f5673f.f5674g = wVar2;
        this.f5673f = null;
        this.f5674g = null;
        return wVar;
    }

    public final w b() {
        this.d = true;
        return new w(this.a, this.f5672b, this.c, true, false);
    }

    public w(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        this.a = bArr;
        this.f5672b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
    }

    public final w a(w wVar) {
        wVar.f5674g = this;
        wVar.f5673f = this.f5673f;
        this.f5673f.f5674g = wVar;
        this.f5673f = wVar;
        return wVar;
    }

    public final void a(w wVar, int i2) {
        if (wVar.e) {
            int i3 = wVar.c;
            if (i3 + i2 > 8192) {
                if (!wVar.d) {
                    int i4 = wVar.f5672b;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = wVar.a;
                        System.arraycopy(bArr, i4, bArr, 0, i3 - i4);
                        wVar.c -= wVar.f5672b;
                        wVar.f5672b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.f5672b, wVar.a, wVar.c, i2);
            wVar.c += i2;
            this.f5672b += i2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
