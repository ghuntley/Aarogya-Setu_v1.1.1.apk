package i.b.a.n.m;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler */
public class y {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2675b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler */
    public static final class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).d();
            return true;
        }
    }

    public synchronized void a(v<?> vVar, boolean z) {
        if (!this.a) {
            if (!z) {
                this.a = true;
                vVar.d();
                this.a = false;
            }
        }
        this.f2675b.obtainMessage(1, vVar).sendToTarget();
    }
}
