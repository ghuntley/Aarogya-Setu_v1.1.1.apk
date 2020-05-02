package i.c.a.b.g.f;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import i.c.a.b.h.c0;
import i.c.a.b.h.d0;
import i.c.a.b.h.f0;
import i.c.a.b.h.g0;

public final class v extends a {
    public static final Parcelable.Creator<v> CREATOR = new w();
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public t f3198f;

    /* renamed from: g  reason: collision with root package name */
    public f0 f3199g;

    /* renamed from: h  reason: collision with root package name */
    public PendingIntent f3200h;

    /* renamed from: i  reason: collision with root package name */
    public c0 f3201i;

    /* renamed from: j  reason: collision with root package name */
    public d f3202j;

    public v(int i2, t tVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.e = i2;
        this.f3198f = tVar;
        d dVar = null;
        this.f3199g = iBinder == null ? null : g0.a(iBinder);
        this.f3200h = pendingIntent;
        this.f3201i = iBinder2 == null ? null : d0.a(iBinder2);
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            dVar = queryLocalInterface instanceof d ? (d) queryLocalInterface : new f(iBinder3);
        }
        this.f3202j = dVar;
    }

    public static v a(c0 c0Var, d dVar) {
        return new v(2, (t) null, (IBinder) null, (PendingIntent) null, c0Var.asBinder(), dVar != null ? dVar.asBinder() : null);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, (Parcelable) this.f3198f, i2, false);
        f0 f0Var = this.f3199g;
        IBinder iBinder = null;
        q.a(parcel, 3, f0Var == null ? null : f0Var.asBinder(), false);
        q.a(parcel, 4, (Parcelable) this.f3200h, i2, false);
        c0 c0Var = this.f3201i;
        q.a(parcel, 5, c0Var == null ? null : c0Var.asBinder(), false);
        d dVar = this.f3202j;
        if (dVar != null) {
            iBinder = dVar.asBinder();
        }
        q.a(parcel, 6, iBinder, false);
        q.m(parcel, a);
    }
}
