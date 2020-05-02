package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import i.c.a.b.h.k;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new k();

    /* renamed from: f  reason: collision with root package name */
    public static final List<Location> f520f = Collections.emptyList();
    public final List<Location> e;

    public LocationResult(List<Location> list) {
        this.e = list;
    }

    public final Location d() {
        int size = this.e.size();
        if (size == 0) {
            return null;
        }
        return this.e.get(size - 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.e.size() != this.e.size()) {
            return false;
        }
        Iterator<Location> it = this.e.iterator();
        for (Location time : locationResult.e) {
            if (it.next().getTime() != time.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 17;
        for (Location time : this.e) {
            long time2 = time.getTime();
            i2 = (i2 * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        return i.a.a.a.a.a(valueOf.length() + 27, "LocationResult[locations: ", valueOf, "]");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e, false);
        q.m(parcel, a);
    }
}
