package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import i.c.a.b.h.i;
import i.c.a.b.h.r;
import java.util.Arrays;

public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new i();
    @Deprecated
    public int e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public int f509f;

    /* renamed from: g  reason: collision with root package name */
    public long f510g;

    /* renamed from: h  reason: collision with root package name */
    public int f511h;

    /* renamed from: i  reason: collision with root package name */
    public r[] f512i;

    public LocationAvailability(int i2, int i3, int i4, long j2, r[] rVarArr) {
        this.f511h = i2;
        this.e = i3;
        this.f509f = i4;
        this.f510g = j2;
        this.f512i = rVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.e == locationAvailability.e && this.f509f == locationAvailability.f509f && this.f510g == locationAvailability.f510g && this.f511h == locationAvailability.f511h && Arrays.equals(this.f512i, locationAvailability.f512i);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f511h), Integer.valueOf(this.e), Integer.valueOf(this.f509f), Long.valueOf(this.f510g), this.f512i});
    }

    public final String toString() {
        boolean z = this.f511h < 1000;
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f509f);
        q.a(parcel, 3, this.f510g);
        q.a(parcel, 4, this.f511h);
        q.a(parcel, 5, (T[]) this.f512i, i2, false);
        q.m(parcel, a);
    }
}
