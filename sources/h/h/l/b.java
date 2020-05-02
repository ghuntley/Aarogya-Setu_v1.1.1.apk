package h.h.l;

import java.util.Objects;

/* compiled from: Pair */
public class b<F, S> {
    public final F a;

    /* renamed from: b  reason: collision with root package name */
    public final S f1808b;

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.a, (Object) null) || !Objects.equals(bVar.f1808b, (Object) null)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "Pair{null null}";
    }
}
