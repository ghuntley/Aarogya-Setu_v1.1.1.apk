package i.c.a.b.g.g;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class m6 implements Iterator<String> {
    public Iterator<String> e = this.f3361f.e.iterator();

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k6 f3361f;

    public m6(k6 k6Var) {
        this.f3361f = k6Var;
    }

    public final boolean hasNext() {
        return this.e.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.e.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
