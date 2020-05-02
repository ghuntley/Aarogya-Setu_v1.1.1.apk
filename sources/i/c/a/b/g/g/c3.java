package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public class c3 extends u2 {

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f3237h;

    public c3(byte[] bArr) {
        if (bArr != null) {
            this.f3237h = bArr;
            return;
        }
        throw null;
    }

    public byte a(int i2) {
        return this.f3237h[i2];
    }

    public byte b(int i2) {
        return this.f3237h[i2];
    }

    public int c() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u2) || a() != ((u2) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return obj.equals(this);
        }
        c3 c3Var = (c3) obj;
        int i2 = this.e;
        int i3 = c3Var.e;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int a = a();
        if (a > c3Var.a()) {
            int a2 = a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(a);
            sb.append(a2);
            throw new IllegalArgumentException(sb.toString());
        } else if (a <= c3Var.a()) {
            byte[] bArr = this.f3237h;
            byte[] bArr2 = c3Var.f3237h;
            int c = c() + a;
            int c2 = c();
            int c3 = c3Var.c();
            while (c2 < c) {
                if (bArr[c2] != bArr2[c3]) {
                    return false;
                }
                c2++;
                c3++;
            }
            return true;
        } else {
            int a3 = c3Var.a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(a);
            sb2.append(", ");
            sb2.append(a3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public int a() {
        return this.f3237h.length;
    }

    public final u2 a(int i2, int i3) {
        int a = u2.a(0, i3, a());
        if (a == 0) {
            return u2.f3471f;
        }
        return new z2(this.f3237h, c(), a);
    }
}
