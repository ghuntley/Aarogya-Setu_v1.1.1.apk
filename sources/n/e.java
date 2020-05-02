package n;

import java.io.Serializable;
import n.m.c.f;

/* compiled from: Result.kt */
public final class e<T> implements Serializable {

    /* compiled from: Result.kt */
    public static final class a implements Serializable {
        public final Throwable e;

        public a(Throwable th) {
            if (th != null) {
                this.e = th;
            } else {
                f.a("exception");
                throw null;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && f.a((Object) this.e, (Object) ((a) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            StringBuilder a = i.a.a.a.a.a("Failure(");
            a.append(this.e);
            a.append(')');
            return a.toString();
        }
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).e;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof a;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof a);
    }
}
