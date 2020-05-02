package i.c.a.b.d.l;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import g.a.a.b.a;
import i.c.a.b.d.k.d;
import i.c.a.b.d.l.r;
import i.c.a.b.h.e;
import i.c.a.b.l.h;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class e0 implements d.a {
    public final /* synthetic */ d a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f3115b;
    public final /* synthetic */ r.a c;
    public final /* synthetic */ r.b d;

    public e0(d dVar, h hVar, r.a aVar, r.b bVar) {
        this.a = dVar;
        this.f3115b = hVar;
        this.c = aVar;
        this.d = bVar;
    }

    public final void a(Status status) {
        if (status.d()) {
            d dVar = this.a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) dVar;
            if (basePendingResult != null) {
                q.b(!basePendingResult.f484i, (Object) "Result has already been consumed.");
                q.b(true, (Object) "Cannot await if then() has been called.");
                try {
                    if (!basePendingResult.c.await(0, timeUnit)) {
                        basePendingResult.a(Status.f474k);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.a(Status.f473j);
                }
                q.b(basePendingResult.b(), (Object) "Result is not ready.");
                basePendingResult.a();
                h hVar = this.f3115b;
                e eVar = ((d0) this.c).a;
                if (eVar != null) {
                    hVar.a.a(eVar);
                    return;
                }
                throw null;
            }
            throw null;
        }
        h hVar2 = this.f3115b;
        if (((c0) this.d) != null) {
            hVar2.a.a((Exception) a.a(status));
            return;
        }
        throw null;
    }
}
