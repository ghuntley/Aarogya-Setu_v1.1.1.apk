package i.b.a.n.m.b0;

import i.b.a.n.m.b0.l;
import i.b.a.t.j;
import java.util.Queue;

/* compiled from: BaseKeyPool */
public abstract class c<T extends l> {
    public final Queue<T> a = j.a(20);

    public abstract T a();

    public void a(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }

    public T b() {
        T t = (l) this.a.poll();
        return t == null ? a() : t;
    }
}
