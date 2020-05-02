package i.c.a.b.g.e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class m extends WeakReference<Throwable> {
    public final int a;

    public m(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == m.class) {
            if (this == obj) {
                return true;
            }
            m mVar = (m) obj;
            return this.a == mVar.a && get() == mVar.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
