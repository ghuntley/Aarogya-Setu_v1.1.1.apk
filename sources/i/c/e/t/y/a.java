package i.c.e.t.y;

import i.c.e.g;
import i.c.e.k;
import i.c.e.l;
import i.c.e.m;
import i.c.e.v.b;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader */
public final class a extends i.c.e.v.a {
    public static final Object y = new Object();
    public Object[] u;
    public int v;
    public String[] w;
    public int[] x;

    /* renamed from: i.c.e.t.y.a$a  reason: collision with other inner class name */
    /* compiled from: JsonTreeReader */
    public class C0138a extends Reader {
        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    static {
        new C0138a();
    }

    private String t() {
        StringBuilder a = i.a.a.a.a.a(" at path ");
        a.append(q());
        return a.toString();
    }

    public String A() {
        b C = C();
        if (C == b.STRING || C == b.NUMBER) {
            String f2 = ((m) H()).f();
            int i2 = this.v;
            if (i2 > 0) {
                int[] iArr = this.x;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return f2;
        }
        StringBuilder a = i.a.a.a.a.a("Expected ");
        a.append(b.STRING);
        a.append(" but was ");
        a.append(C);
        a.append(t());
        throw new IllegalStateException(a.toString());
    }

    public b C() {
        if (this.v == 0) {
            return b.END_DOCUMENT;
        }
        Object G = G();
        if (G instanceof Iterator) {
            boolean z = this.u[this.v - 2] instanceof l;
            Iterator it = (Iterator) G;
            if (!it.hasNext()) {
                return z ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z) {
                return b.NAME;
            }
            a(it.next());
            return C();
        } else if (G instanceof l) {
            return b.BEGIN_OBJECT;
        } else {
            if (G instanceof g) {
                return b.BEGIN_ARRAY;
            }
            if (G instanceof m) {
                Object obj = ((m) G).a;
                if (obj instanceof String) {
                    return b.STRING;
                }
                if (obj instanceof Boolean) {
                    return b.BOOLEAN;
                }
                if (obj instanceof Number) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (G instanceof k) {
                return b.NULL;
            } else {
                if (G == y) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void F() {
        if (C() == b.NAME) {
            y();
            this.w[this.v - 2] = "null";
        } else {
            H();
            int i2 = this.v;
            if (i2 > 0) {
                this.w[i2 - 1] = "null";
            }
        }
        int i3 = this.v;
        if (i3 > 0) {
            int[] iArr = this.x;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public final Object G() {
        return this.u[this.v - 1];
    }

    public final Object H() {
        Object[] objArr = this.u;
        int i2 = this.v - 1;
        this.v = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public void a() {
        a(b.BEGIN_ARRAY);
        a((Object) ((g) G()).iterator());
        this.x[this.v - 1] = 0;
    }

    public void close() {
        this.u = new Object[]{y};
        this.v = 1;
    }

    public void f() {
        a(b.BEGIN_OBJECT);
        a((Object) ((l) G()).a.entrySet().iterator());
    }

    public void m() {
        a(b.END_ARRAY);
        H();
        H();
        int i2 = this.v;
        if (i2 > 0) {
            int[] iArr = this.x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public void o() {
        a(b.END_OBJECT);
        H();
        H();
        int i2 = this.v;
        if (i2 > 0) {
            int[] iArr = this.x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public String q() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (i2 < this.v) {
            Object[] objArr = this.u;
            if (objArr[i2] instanceof g) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.x[i2]);
                    sb.append(']');
                }
            } else if (objArr[i2] instanceof l) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.w;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    public boolean s() {
        b C = C();
        return (C == b.END_OBJECT || C == b.END_ARRAY) ? false : true;
    }

    public String toString() {
        return a.class.getSimpleName();
    }

    public boolean u() {
        a(b.BOOLEAN);
        boolean h2 = ((m) H()).h();
        int i2 = this.v;
        if (i2 > 0) {
            int[] iArr = this.x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return h2;
    }

    public double v() {
        b C = C();
        if (C == b.NUMBER || C == b.STRING) {
            m mVar = (m) G();
            double doubleValue = mVar.a instanceof Number ? mVar.i().doubleValue() : Double.parseDouble(mVar.f());
            if (this.f4898f || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                H();
                int i2 = this.v;
                if (i2 > 0) {
                    int[] iArr = this.x;
                    int i3 = i2 - 1;
                    iArr[i3] = iArr[i3] + 1;
                }
                return doubleValue;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        StringBuilder a = i.a.a.a.a.a("Expected ");
        a.append(b.NUMBER);
        a.append(" but was ");
        a.append(C);
        a.append(t());
        throw new IllegalStateException(a.toString());
    }

    public int w() {
        b C = C();
        if (C == b.NUMBER || C == b.STRING) {
            int c = ((m) G()).c();
            H();
            int i2 = this.v;
            if (i2 > 0) {
                int[] iArr = this.x;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return c;
        }
        StringBuilder a = i.a.a.a.a.a("Expected ");
        a.append(b.NUMBER);
        a.append(" but was ");
        a.append(C);
        a.append(t());
        throw new IllegalStateException(a.toString());
    }

    public long x() {
        b C = C();
        if (C == b.NUMBER || C == b.STRING) {
            m mVar = (m) G();
            long longValue = mVar.a instanceof Number ? mVar.i().longValue() : Long.parseLong(mVar.f());
            H();
            int i2 = this.v;
            if (i2 > 0) {
                int[] iArr = this.x;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return longValue;
        }
        StringBuilder a = i.a.a.a.a.a("Expected ");
        a.append(b.NUMBER);
        a.append(" but was ");
        a.append(C);
        a.append(t());
        throw new IllegalStateException(a.toString());
    }

    public String y() {
        a(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) G()).next();
        String str = (String) entry.getKey();
        this.w[this.v - 1] = str;
        a(entry.getValue());
        return str;
    }

    public void z() {
        a(b.NULL);
        H();
        int i2 = this.v;
        if (i2 > 0) {
            int[] iArr = this.x;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final void a(b bVar) {
        if (C() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + C() + t());
        }
    }

    public final void a(Object obj) {
        int i2 = this.v;
        Object[] objArr = this.u;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.u = Arrays.copyOf(objArr, i3);
            this.x = Arrays.copyOf(this.x, i3);
            this.w = (String[]) Arrays.copyOf(this.w, i3);
        }
        Object[] objArr2 = this.u;
        int i4 = this.v;
        this.v = i4 + 1;
        objArr2[i4] = obj;
    }
}
