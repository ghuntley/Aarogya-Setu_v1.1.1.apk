package i.c.a.b.i.a;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class k implements Iterator<String> {
    public Iterator<String> e = this.f3738f.e.keySet().iterator();

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f3738f;

    public k(l lVar) {
        this.f3738f = lVar;
    }

    public final boolean hasNext() {
        return this.e.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.e.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
