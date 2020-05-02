package i.c.a.a;

import i.a.a.a.a;

/* compiled from: com.google.android.datatransport:transport-api@@2.2.0 */
public final class b {
    public final String a;

    public b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return a.a(a.a("Encoding{name=\""), this.a, "\"}");
    }
}
