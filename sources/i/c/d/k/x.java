package i.c.d.k;

import android.os.Looper;
import android.os.Message;
import i.c.a.b.g.e.d;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class x extends d {
    public final /* synthetic */ y a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(y yVar, Looper looper) {
        super(looper);
        this.a = yVar;
    }

    public final void handleMessage(Message message) {
        this.a.a(message);
    }
}
