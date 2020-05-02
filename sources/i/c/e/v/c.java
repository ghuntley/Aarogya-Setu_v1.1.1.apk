package i.c.e.v;

import i.a.a.a.a;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* compiled from: JsonWriter */
public class c implements Closeable, Flushable {

    /* renamed from: n  reason: collision with root package name */
    public static final String[] f4920n = new String[128];

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f4921o;
    public final Writer e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f4922f = new int[32];

    /* renamed from: g  reason: collision with root package name */
    public int f4923g = 0;

    /* renamed from: h  reason: collision with root package name */
    public String f4924h;

    /* renamed from: i  reason: collision with root package name */
    public String f4925i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4926j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4927k;

    /* renamed from: l  reason: collision with root package name */
    public String f4928l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4929m;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f4920n[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = f4920n;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4921o = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        b(6);
        this.f4925i = ":";
        this.f4929m = true;
        if (writer != null) {
            this.e = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public final c a(int i2, int i3, char c) {
        int s = s();
        if (s != i3 && s != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f4928l == null) {
            this.f4923g--;
            if (s == i3) {
                o();
            }
            this.e.write(c);
            return this;
        } else {
            StringBuilder a = a.a("Dangling name: ");
            a.append(this.f4928l);
            throw new IllegalStateException(a.toString());
        }
    }

    public final void b(int i2) {
        int i3 = this.f4923g;
        int[] iArr = this.f4922f;
        if (i3 == iArr.length) {
            this.f4922f = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f4922f;
        int i4 = this.f4923g;
        this.f4923g = i4 + 1;
        iArr2[i4] = i2;
    }

    public final void c(int i2) {
        this.f4922f[this.f4923g - 1] = i2;
    }

    public void close() {
        this.e.close();
        int i2 = this.f4923g;
        if (i2 > 1 || (i2 == 1 && this.f4922f[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4923g = 0;
    }

    public c d(String str) {
        if (str == null) {
            return q();
        }
        t();
        a();
        c(str);
        return this;
    }

    public c e(long j2) {
        t();
        a();
        this.e.write(Long.toString(j2));
        return this;
    }

    public c f() {
        t();
        a();
        b(1);
        this.e.write(91);
        return this;
    }

    public void flush() {
        if (this.f4923g != 0) {
            this.e.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c h() {
        t();
        a();
        b(3);
        this.e.write(123);
        return this;
    }

    public c j() {
        a(1, 2, ']');
        return this;
    }

    public c m() {
        a(3, 5, '}');
        return this;
    }

    public final void o() {
        if (this.f4924h != null) {
            this.e.write(10);
            int i2 = this.f4923g;
            for (int i3 = 1; i3 < i2; i3++) {
                this.e.write(this.f4924h);
            }
        }
    }

    public c q() {
        if (this.f4928l != null) {
            if (this.f4929m) {
                t();
            } else {
                this.f4928l = null;
                return this;
            }
        }
        a();
        this.e.write("null");
        return this;
    }

    public final int s() {
        int i2 = this.f4923g;
        if (i2 != 0) {
            return this.f4922f[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void t() {
        if (this.f4928l != null) {
            int s = s();
            if (s == 5) {
                this.e.write(44);
            } else if (s != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            o();
            c(4);
            c(this.f4928l);
            this.f4928l = null;
        }
    }

    public final void c(String str) {
        String str2;
        String[] strArr = this.f4927k ? f4921o : f4920n;
        this.e.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                this.e.write(str, i2, i3 - i2);
            }
            this.e.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            this.e.write(str, i2, length - i2);
        }
        this.e.write(34);
    }

    public c b(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f4928l != null) {
            throw new IllegalStateException();
        } else if (this.f4923g != 0) {
            this.f4928l = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public c a(boolean z) {
        t();
        a();
        this.e.write(z ? "true" : "false");
        return this;
    }

    public c a(Boolean bool) {
        if (bool == null) {
            return q();
        }
        t();
        a();
        this.e.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c a(Number number) {
        if (number == null) {
            return q();
        }
        t();
        String obj = number.toString();
        if (this.f4926j || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            a();
            this.e.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public final void a() {
        int s = s();
        if (s == 1) {
            c(2);
            o();
        } else if (s == 2) {
            this.e.append(',');
            o();
        } else if (s != 4) {
            if (s != 6) {
                if (s != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f4926j) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            c(7);
        } else {
            this.e.append(this.f4925i);
            c(5);
        }
    }
}
