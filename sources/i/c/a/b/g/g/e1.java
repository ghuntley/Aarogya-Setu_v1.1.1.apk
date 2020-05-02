package i.c.a.b.g.g;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class e1 extends ContentObserver {
    public final /* synthetic */ c1 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1(c1 c1Var) {
        super((Handler) null);
        this.a = c1Var;
    }

    public final void onChange(boolean z) {
        this.a.b();
    }
}
