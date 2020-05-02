package i.c.a.b.g.g;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class i2 extends WeakReference<Throwable> {
    public final int a;

    public i2(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == i2.class) {
            if (this == obj) {
                return true;
            }
            i2 i2Var = (i2) obj;
            return this.a == i2Var.a && get() == i2Var.get();
        }
    }

    public final int hashCode() {
        return this.a;
    }
}
