package i.c.a.b.d.l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.d;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class h0 extends a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();
    public Bundle e;

    /* renamed from: f  reason: collision with root package name */
    public d[] f3127f;

    /* renamed from: g  reason: collision with root package name */
    public int f3128g;

    public h0(Bundle bundle, d[] dVarArr, int i2) {
        this.e = bundle;
        this.f3127f = dVarArr;
        this.f3128g = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e, false);
        q.a(parcel, 2, (T[]) this.f3127f, i2, false);
        q.a(parcel, 3, this.f3128g);
        q.m(parcel, a);
    }

    public h0() {
    }
}
