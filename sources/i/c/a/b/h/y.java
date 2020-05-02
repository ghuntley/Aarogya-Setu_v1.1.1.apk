package i.c.a.b.h;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import g.a.a.b.a;
import i.c.a.b.g.f.b;
import i.c.a.b.g.f.e;
import i.c.a.b.l.h;

public final class y extends e {
    public final /* synthetic */ h a;

    public y(h hVar) {
        this.a = hVar;
    }

    public final void a(b bVar) {
        Status status = bVar.e;
        if (status == null) {
            h hVar = this.a;
            hVar.a.b((Exception) new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.f476f == 0) {
            this.a.a.a(true);
        } else {
            h hVar2 = this.a;
            hVar2.a.b((Exception) a.a(status));
        }
    }
}
