package i.c.a.b.d.k.h;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import i.c.a.b.l.a;
import i.c.a.b.l.g;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class l0 implements a<Boolean, Void> {
    public final /* synthetic */ Object a(g gVar) {
        if (((Boolean) gVar.b()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
