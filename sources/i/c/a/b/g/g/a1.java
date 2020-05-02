package i.c.a.b.g.g;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class a1 extends ContentObserver {
    public a1() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        b1.e.set(true);
    }
}
