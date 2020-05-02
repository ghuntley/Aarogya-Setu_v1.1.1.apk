package i.b.a.n.n;

import i.b.a.t.g;
import i.b.a.t.j;
import java.util.Queue;

/* compiled from: ModelCache */
public class m<A, B> {
    public final g<b<A>, B> a;

    /* compiled from: ModelCache */
    public class a extends g<b<A>, B> {
        public a(m mVar, long j2) {
            super(j2);
        }

        public void a(Object obj, Object obj2) {
            ((b) obj).a();
        }
    }

    public m(long j2) {
        this.a = new a(this, j2);
    }

    /* compiled from: ModelCache */
    public static final class b<A> {
        public static final Queue<b<?>> d = j.a(0);
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f2691b;
        public A c;

        public static <A> b<A> a(A a2, int i2, int i3) {
            b<A> poll;
            synchronized (d) {
                poll = d.poll();
            }
            if (poll == null) {
                poll = new b<>();
            }
            poll.c = a2;
            poll.f2691b = i2;
            poll.a = i3;
            return poll;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2691b == bVar.f2691b && this.a == bVar.a && this.c.equals(bVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode() + (((this.a * 31) + this.f2691b) * 31);
        }

        public void a() {
            synchronized (d) {
                d.offer(this);
            }
        }
    }
}
