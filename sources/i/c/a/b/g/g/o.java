package i.c.a.b.g.g;

import android.util.Log;
import android.util.Pair;
import i.c.a.b.g.g.rc;
import i.c.a.b.i.a.r6;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.3.0 */
public final class o extends rc.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ r6 f3371i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ rc f3372j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(rc rcVar, r6 r6Var) {
        super(true);
        this.f3372j = rcVar;
        this.f3371i = r6Var;
    }

    public final void a() {
        for (int i2 = 0; i2 < this.f3372j.d.size(); i2++) {
            if (this.f3371i.equals(this.f3372j.d.get(i2).first)) {
                Log.w(this.f3372j.a, "OnEventListener already registered.");
                return;
            }
        }
        rc.b bVar = new rc.b(this.f3371i);
        this.f3372j.d.add(new Pair(this.f3371i, bVar));
        this.f3372j.f3435g.registerOnMeasurementEventListener(bVar);
    }
}
