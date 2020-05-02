package i.c.a.b.g.g;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class m1 extends ContentObserver {
    public m1() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        o1.f3376i.incrementAndGet();
    }
}
