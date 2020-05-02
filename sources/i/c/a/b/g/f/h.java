package i.c.a.b.g.f;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.h.d;

public final class h extends a implements g {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final Location a(String str) {
        Parcel g2 = g();
        g2.writeString(str);
        g2 = Parcel.obtain();
        try {
            this.a.transact(21, g2, g2, 0);
            g2.readException();
            g2.recycle();
            return (Location) z.a(g2, Location.CREATOR);
        } catch (RuntimeException e) {
            throw e;
        } finally {
            g2.recycle();
        }
    }

    public final void a(e0 e0Var) {
        Parcel g2 = g();
        z.a(g2, (Parcelable) e0Var);
        a(75, g2);
    }

    public final void a(v vVar) {
        Parcel g2 = g();
        z.a(g2, (Parcelable) vVar);
        a(59, g2);
    }

    public final void b(boolean z) {
        Parcel g2 = g();
        z.a(g2, z);
        a(12, g2);
    }

    public final void a(d dVar, i iVar, String str) {
        Parcel g2 = g();
        z.a(g2, (Parcelable) dVar);
        g2.writeStrongBinder(iVar == null ? null : iVar.asBinder());
        g2.writeString(str);
        a(63, g2);
    }
}
