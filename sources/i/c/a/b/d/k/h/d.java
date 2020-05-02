package i.c.a.b.d.k.h;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import i.c.a.b.d.k.a;
import i.c.a.b.d.k.a.b;
import i.c.a.b.d.k.c;
import i.c.a.b.d.k.f;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class d<R extends f, A extends a.b> extends BasePendingResult<R> implements e<R> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(a<?> aVar, c cVar) {
        super(cVar);
        q.a(cVar, (Object) "GoogleApiClient must not be null");
        q.a(aVar, (Object) "Api must not be null");
        if (aVar.f3024b == null) {
            throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
        }
    }

    public abstract void a(A a);

    public /* bridge */ /* synthetic */ void a(Object obj) {
        super.a((f) obj);
    }

    public final void b(Status status) {
        q.a(!status.d(), (Object) "Failed result must not be success");
        a(new i.c.a.b.h.f(status));
    }
}
