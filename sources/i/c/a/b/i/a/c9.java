package i.c.a.b.i.a;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final /* synthetic */ class c9 implements Runnable {
    public final y8 e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3627f;

    /* renamed from: g  reason: collision with root package name */
    public final m4 f3628g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f3629h;

    public c9(y8 y8Var, int i2, m4 m4Var, Intent intent) {
        this.e = y8Var;
        this.f3627f = i2;
        this.f3628g = m4Var;
        this.f3629h = intent;
    }

    public final void run() {
        y8 y8Var = this.e;
        int i2 = this.f3627f;
        m4 m4Var = this.f3628g;
        Intent intent = this.f3629h;
        if (((d9) y8Var.a).a(i2)) {
            m4Var.f3766n.a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            y8Var.a().f3766n.a("Completed wakeful intent.");
            ((d9) y8Var.a).a(intent);
        }
    }
}
