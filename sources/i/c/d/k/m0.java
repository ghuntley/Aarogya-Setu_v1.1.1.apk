package i.c.d.k;

import android.util.Log;
import i.a.a.a.a;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class m0 implements Runnable {
    public final j0 e;

    public m0(j0 j0Var) {
        this.e = j0Var;
    }

    public final void run() {
        j0 j0Var = this.e;
        String action = j0Var.a.getAction();
        StringBuilder sb = new StringBuilder(a.a(action, 61));
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("FirebaseInstanceId", sb.toString());
        j0Var.a();
    }
}
