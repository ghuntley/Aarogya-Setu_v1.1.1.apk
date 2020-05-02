package i.c.a.a;

/* compiled from: com.google.android.datatransport:transport-api@@2.2.0 */
public final class a<T> extends c<T> {
    public final Integer a;

    /* renamed from: b  reason: collision with root package name */
    public final T f2872b;
    public final d c;

    public a(Integer num, T t, d dVar) {
        this.a = num;
        if (t != null) {
            this.f2872b = t;
            if (dVar != null) {
                this.c = dVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.a;
        if (num != null ? num.equals(((a) cVar).a) : ((a) cVar).a == null) {
            a aVar = (a) cVar;
            if (!this.f2872b.equals(aVar.f2872b) || !this.c.equals(aVar.c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f2872b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("Event{code=");
        a2.append(this.a);
        a2.append(", payload=");
        a2.append(this.f2872b);
        a2.append(", priority=");
        a2.append(this.c);
        a2.append("}");
        return a2.toString();
    }
}
