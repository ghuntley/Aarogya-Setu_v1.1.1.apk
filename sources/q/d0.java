package q;

import java.util.Objects;
import javax.annotation.Nullable;
import o.j0;
import o.l0;

/* compiled from: Response */
public final class d0<T> {
    public final j0 a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final T f5713b;
    @Nullable
    public final l0 c;

    public d0(j0 j0Var, @Nullable T t, @Nullable l0 l0Var) {
        this.a = j0Var;
        this.f5713b = t;
        this.c = l0Var;
    }

    public static <T> d0<T> a(@Nullable T t, j0 j0Var) {
        Objects.requireNonNull(j0Var, "rawResponse == null");
        if (j0Var.f()) {
            return new d0<>(j0Var, t, (l0) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public String toString() {
        return this.a.toString();
    }

    public boolean a() {
        return this.a.f();
    }
}
