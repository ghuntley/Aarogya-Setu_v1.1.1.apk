package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;

public final class f extends a implements i.c.a.b.d.k.f {
    public static final Parcelable.Creator<f> CREATOR = new p();
    public final Status e;

    /* renamed from: f  reason: collision with root package name */
    public final g f3558f;

    public f(Status status) {
        this.e = status;
        this.f3558f = null;
    }

    public f(Status status, g gVar) {
        this.e = status;
        this.f3558f = gVar;
    }

    public final Status c() {
        return this.e;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, (Parcelable) this.e, i2, false);
        q.a(parcel, 2, (Parcelable) this.f3558f, i2, false);
        q.m(parcel, a);
    }
}
