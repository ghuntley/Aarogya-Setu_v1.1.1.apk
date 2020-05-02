package i.c.d.k;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import i.c.d.o.h;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class g0 extends Binder {
    public final h a;

    public g0(h hVar) {
        this.a = hVar;
    }

    public final void a(j0 j0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
            }
            h hVar = this.a;
            hVar.a.b(j0Var.a).a(s0.a, new i0(j0Var));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
