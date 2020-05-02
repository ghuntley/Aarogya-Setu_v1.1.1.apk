package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import java.util.Collections;
import java.util.List;

public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new o();
    public final List<LocationRequest> e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3555f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3556g;

    /* renamed from: h  reason: collision with root package name */
    public m f3557h;

    public d(List<LocationRequest> list, boolean z, boolean z2, m mVar) {
        this.e = list;
        this.f3555f = z;
        this.f3556g = z2;
        this.f3557h = mVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, Collections.unmodifiableList(this.e), false);
        q.a(parcel, 2, this.f3555f);
        q.a(parcel, 3, this.f3556g);
        q.a(parcel, 5, (Parcelable) this.f3557h, i2, false);
        q.m(parcel, a);
    }
}
