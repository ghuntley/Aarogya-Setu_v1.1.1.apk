package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import o.o0.e;

/* compiled from: Headers */
public final class x {
    public final String[] a;

    public x(a aVar) {
        List<String> list = aVar.a;
        this.a = (String[]) list.toArray(new String[list.size()]);
    }

    @Nullable
    public String a(String str) {
        String[] strArr = this.a;
        int length = strArr.length;
        do {
            length -= 2;
            if (length < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase(strArr[length]));
        return strArr[length + 1];
    }

    public int b() {
        return this.a.length / 2;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof x) && Arrays.equals(((x) obj).a, this.a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int b2 = b();
        for (int i2 = 0; i2 < b2; i2++) {
            sb.append(a(i2));
            sb.append(": ");
            sb.append(b(i2));
            sb.append("\n");
        }
        return sb.toString();
    }

    public String b(int i2) {
        return this.a[(i2 * 2) + 1];
    }

    public x(String[] strArr) {
        this.a = strArr;
    }

    public static void b(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(e.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    /* compiled from: Headers */
    public static final class a {
        public final List<String> a = new ArrayList(20);

        public a a(String str, String str2) {
            x.b(str);
            x.a(str2, str);
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public a b(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public a a(String str) {
            int i2 = 0;
            while (i2 < this.a.size()) {
                if (str.equalsIgnoreCase(this.a.get(i2))) {
                    this.a.remove(i2);
                    this.a.remove(i2);
                    i2 -= 2;
                }
                i2 += 2;
            }
            return this;
        }
    }

    public String a(int i2) {
        return this.a[i2 * 2];
    }

    public a a() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    public static x a(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i2 = 0;
            while (i2 < strArr2.length) {
                if (strArr2[i2] != null) {
                    strArr2[i2] = strArr2[i2].trim();
                    i2++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i3 = 0; i3 < strArr2.length; i3 += 2) {
                String str = strArr2[i3];
                String str2 = strArr2[i3 + 1];
                b(str);
                a(str2, str);
            }
            return new x(strArr2);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    public static void a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i2++;
                } else {
                    throw new IllegalArgumentException(e.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(i.a.a.a.a.a("value for name ", str2, " == null"));
    }
}
