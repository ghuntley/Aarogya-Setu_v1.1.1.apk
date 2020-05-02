package i.c.a.b.g.g;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class j6 implements ListIterator<String> {
    public ListIterator<String> e = this.f3327g.e.listIterator(this.f3326f);

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3326f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ k6 f3327g;

    public j6(k6 k6Var, int i2) {
        this.f3327g = k6Var;
        this.f3326f = i2;
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.e.hasNext();
    }

    public final boolean hasPrevious() {
        return this.e.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.e.next();
    }

    public final int nextIndex() {
        return this.e.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.e.previous();
    }

    public final int previousIndex() {
        return this.e.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
