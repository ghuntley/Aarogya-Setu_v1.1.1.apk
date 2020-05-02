package i.b.a.m;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: GifHeaderParser */
public class d {
    public final byte[] a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f2472b;
    public c c;
    public int d = 0;

    public final int[] a(int i2) {
        byte[] bArr = new byte[(i2 * 3)];
        int[] iArr = null;
        try {
            this.f2472b.get(bArr);
            iArr = new int[256];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i3 + 1;
                iArr[i3] = ((bArr[i4] & 255) << 16) | -16777216 | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                i4 = i7;
                i3 = i8;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.c.f2463b = 1;
        }
        return iArr;
    }

    public c b() {
        if (this.f2472b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 6; i2++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.c.f2463b = 1;
            } else {
                this.c.f2464f = e();
                this.c.f2465g = e();
                int c2 = c();
                this.c.f2466h = (c2 & 128) != 0;
                this.c.f2467i = (int) Math.pow(2.0d, (double) ((c2 & 7) + 1));
                this.c.f2468j = c();
                this.c.f2469k = c();
                if (this.c.f2466h && !a()) {
                    c cVar = this.c;
                    cVar.a = a(cVar.f2467i);
                    c cVar2 = this.c;
                    cVar2.f2470l = cVar2.a[cVar2.f2468j];
                }
            }
            if (!a()) {
                boolean z = false;
                while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                    int c3 = c();
                    if (c3 == 33) {
                        int c4 = c();
                        if (c4 == 1) {
                            f();
                        } else if (c4 == 249) {
                            this.c.d = new b();
                            c();
                            int c5 = c();
                            b bVar = this.c.d;
                            int i3 = (c5 & 28) >> 2;
                            bVar.f2458g = i3;
                            if (i3 == 0) {
                                bVar.f2458g = 1;
                            }
                            this.c.d.f2457f = (c5 & 1) != 0;
                            int e = e();
                            if (e < 2) {
                                e = 10;
                            }
                            b bVar2 = this.c.d;
                            bVar2.f2460i = e * 10;
                            bVar2.f2459h = c();
                            c();
                        } else if (c4 == 254) {
                            f();
                        } else if (c4 != 255) {
                            f();
                        } else {
                            d();
                            StringBuilder sb2 = new StringBuilder();
                            for (int i4 = 0; i4 < 11; i4++) {
                                sb2.append((char) this.a[i4]);
                            }
                            if (sb2.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    byte[] bArr = this.a;
                                    if (bArr[0] == 1) {
                                        this.c.f2471m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                    }
                                    if (this.d <= 0) {
                                        break;
                                    }
                                } while (a());
                            } else {
                                f();
                            }
                        }
                    } else if (c3 == 44) {
                        c cVar3 = this.c;
                        if (cVar3.d == null) {
                            cVar3.d = new b();
                        }
                        this.c.d.a = e();
                        this.c.d.f2456b = e();
                        this.c.d.c = e();
                        this.c.d.d = e();
                        int c6 = c();
                        boolean z2 = (c6 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (double) ((c6 & 7) + 1));
                        this.c.d.e = (c6 & 64) != 0;
                        if (z2) {
                            this.c.d.f2462k = a(pow);
                        } else {
                            this.c.d.f2462k = null;
                        }
                        this.c.d.f2461j = this.f2472b.position();
                        c();
                        f();
                        if (!a()) {
                            c cVar4 = this.c;
                            cVar4.c++;
                            cVar4.e.add(cVar4.d);
                        }
                    } else if (c3 != 59) {
                        this.c.f2463b = 1;
                    } else {
                        z = true;
                    }
                }
                c cVar5 = this.c;
                if (cVar5.c < 0) {
                    cVar5.f2463b = 1;
                }
            }
            return this.c;
        }
    }

    public final int c() {
        try {
            return this.f2472b.get() & 255;
        } catch (Exception unused) {
            this.c.f2463b = 1;
            return 0;
        }
    }

    public final void d() {
        int c2 = c();
        this.d = c2;
        if (c2 > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < this.d) {
                try {
                    i3 = this.d - i2;
                    this.f2472b.get(this.a, i2, i3);
                    i2 += i3;
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i2 + " count: " + i3 + " blockSize: " + this.d, e);
                    }
                    this.c.f2463b = 1;
                    return;
                }
            }
        }
    }

    public final int e() {
        return this.f2472b.getShort();
    }

    public final void f() {
        int c2;
        do {
            c2 = c();
            this.f2472b.position(Math.min(this.f2472b.position() + c2, this.f2472b.limit()));
        } while (c2 > 0);
    }

    public final boolean a() {
        return this.c.f2463b != 0;
    }
}
