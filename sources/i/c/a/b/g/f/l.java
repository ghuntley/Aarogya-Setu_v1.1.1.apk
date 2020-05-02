package i.c.a.b.g.f;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import i.c.a.b.d.k.h.k;
import i.c.a.b.h.b;
import i.c.a.b.h.d0;

public final class l extends d0 {
    public final k<b> a;

    public l(k<b> kVar) {
        this.a = kVar;
    }

    public final void a(LocationAvailability locationAvailability) {
        this.a.a(new n(locationAvailability));
    }

    public final void a(LocationResult locationResult) {
        this.a.a(new m(locationResult));
    }

    public final synchronized void g() {
        this.a.f3072b = null;
    }
}
