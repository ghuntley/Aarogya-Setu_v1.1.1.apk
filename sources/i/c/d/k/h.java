package i.c.d.k;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class h implements Handler.Callback {
    public final i a;

    public h(i iVar) {
        this.a = iVar;
    }

    public final boolean handleMessage(Message message) {
        this.a.a(message);
        return true;
    }
}
