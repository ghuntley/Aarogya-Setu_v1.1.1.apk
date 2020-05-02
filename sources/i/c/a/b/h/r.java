package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import java.util.Arrays;

public final class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new s();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3566f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3567g;

    /* renamed from: h  reason: collision with root package name */
    public final long f3568h;

    public r(int i2, int i3, long j2, long j3) {
        this.e = i2;
        this.f3566f = i3;
        this.f3567g = j2;
        this.f3568h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            return this.e == rVar.e && this.f3566f == rVar.f3566f && this.f3567g == rVar.f3567g && this.f3568h == rVar.f3568h;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3566f), Integer.valueOf(this.e), Long.valueOf(this.f3568h), Long.valueOf(this.f3567g)});
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.e + " Cell status: " + this.f3566f + " elapsed time NS: " + this.f3568h + " system time ms: " + this.f3567g;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f3566f);
        q.a(parcel, 3, this.f3567g);
        q.a(parcel, 4, this.f3568h);
        q.m(parcel, a);
    }
}
