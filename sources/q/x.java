package q;

import javax.annotation.Nullable;

/* compiled from: ParameterHandler */
public class x extends z<Iterable<T>> {
    public final /* synthetic */ z a;

    public x(z zVar) {
        this.a = zVar;
    }

    public void a(b0 b0Var, @Nullable Object obj) {
        Iterable<Object> iterable = (Iterable) obj;
        if (iterable != null) {
            for (Object a2 : iterable) {
                this.a.a(b0Var, a2);
            }
        }
    }
}
