package i.c.e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray */
public final class g extends j implements Iterable<j> {
    public final List<j> e = new ArrayList();

    public int c() {
        if (this.e.size() == 1) {
            return this.e.get(0).c();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).e.equals(this.e));
    }

    public String f() {
        if (this.e.size() == 1) {
            return this.e.get(0).f();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public Iterator<j> iterator() {
        return this.e.iterator();
    }
}
