package f.a.a;

import n.m.c.f;

/* compiled from: Symbol.kt */
public final class n {
    public final String a;

    public n(String str) {
        if (str != null) {
            this.a = str;
        } else {
            f.a("symbol");
            throw null;
        }
    }

    public String toString() {
        return this.a;
    }
}
