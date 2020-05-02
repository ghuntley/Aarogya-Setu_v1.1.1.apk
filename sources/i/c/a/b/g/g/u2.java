package i.c.a.b.g.g;

import i.c.a.b.d.l.q;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public abstract class u2 implements Serializable, Iterable<Byte> {

    /* renamed from: f  reason: collision with root package name */
    public static final u2 f3471f = new c3(y3.f3529b);

    /* renamed from: g  reason: collision with root package name */
    public static final y2 f3472g = (r2.a() ? new d3((w2) null) : new x2((w2) null));
    public int e = 0;

    public static u2 a(byte[] bArr, int i2, int i3) {
        a(i2, i2 + i3, bArr.length);
        return new c3(f3472g.a(bArr, i2, i3));
    }

    public static a3 c(int i2) {
        return new a3(i2, (w2) null);
    }

    public abstract byte a(int i2);

    public abstract int a();

    public abstract u2 a(int i2, int i3);

    public abstract byte b(int i2);

    public final String b() {
        Charset charset = y3.a;
        if (a() == 0) {
            return "";
        }
        c3 c3Var = (c3) this;
        return new String(c3Var.f3237h, c3Var.c(), c3Var.a(), charset);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.e;
        if (i2 == 0) {
            int a = a();
            c3 c3Var = (c3) this;
            i2 = y3.a(a, c3Var.f3237h, c3Var.c(), a);
            if (i2 == 0) {
                i2 = 1;
            }
            this.e = i2;
        }
        return i2;
    }

    public /* synthetic */ Iterator iterator() {
        return new w2(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(a());
        objArr[2] = a() <= 50 ? q.a(this) : String.valueOf(q.a(a(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public static u2 a(String str) {
        return new c3(str.getBytes(y3.a));
    }

    public static int a(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i3 < i2) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i3);
            sb3.append(" >= ");
            sb3.append(i4);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }
}
