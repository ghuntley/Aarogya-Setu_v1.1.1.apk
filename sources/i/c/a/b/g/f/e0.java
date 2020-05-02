package i.c.a.b.g.f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import i.c.a.b.h.a0;
import i.c.a.b.h.z;

public final class e0 extends a {
    public static final Parcelable.Creator<e0> CREATOR = new f0();
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public c0 f3186f;

    /* renamed from: g  reason: collision with root package name */
    public z f3187g;

    /* renamed from: h  reason: collision with root package name */
    public d f3188h;

    public e0(int i2, c0 c0Var, IBinder iBinder, IBinder iBinder2) {
        this.e = i2;
        this.f3186f = c0Var;
        d dVar = null;
        this.f3187g = iBinder == null ? null : a0.a(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            dVar = queryLocalInterface instanceof d ? (d) queryLocalInterface : new f(iBinder2);
        }
        this.f3188h = dVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, (Parcelable) this.f3186f, i2, false);
        z zVar = this.f3187g;
        IBinder iBinder = null;
        q.a(parcel, 3, zVar == null ? null : zVar.asBinder(), false);
        d dVar = this.f3188h;
        if (dVar != null) {
            iBinder = dVar.asBinder();
        }
        q.a(parcel, 4, iBinder, false);
        q.m(parcel, a);
    }
}
