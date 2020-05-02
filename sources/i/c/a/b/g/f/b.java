package i.c.a.b.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import i.c.a.b.d.k.f;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;

public final class b extends a implements f {
    public static final Parcelable.Creator<b> CREATOR = new c();
    public final Status e;

    static {
        new b(Status.f472i);
    }

    public b(Status status) {
        this.e = status;
    }

    public final Status c() {
        return this.e;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, (Parcelable) this.e, i2, false);
        q.m(parcel, a);
    }
}
