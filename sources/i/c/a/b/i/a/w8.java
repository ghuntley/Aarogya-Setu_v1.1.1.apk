package i.c.a.b.i.a;

import android.content.ComponentName;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class w8 implements Runnable {
    public final /* synthetic */ s8 e;

    public w8(s8 s8Var) {
        this.e = s8Var;
    }

    public final void run() {
        z7 z7Var = this.e.c;
        s5 s5Var = this.e.c.a;
        Context context = s5Var.a;
        oa oaVar = s5Var.f3860f;
        z7.a(z7Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
