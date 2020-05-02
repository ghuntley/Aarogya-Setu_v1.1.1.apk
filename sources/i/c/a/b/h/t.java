package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import java.util.Arrays;

public final class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new u();
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public long f3569f;

    /* renamed from: g  reason: collision with root package name */
    public float f3570g;

    /* renamed from: h  reason: collision with root package name */
    public long f3571h;

    /* renamed from: i  reason: collision with root package name */
    public int f3572i;

    public t() {
        this.e = true;
        this.f3569f = 50;
        this.f3570g = 0.0f;
        this.f3571h = RecyclerView.FOREVER_NS;
        this.f3572i = Integer.MAX_VALUE;
    }

    public t(boolean z, long j2, float f2, long j3, int i2) {
        this.e = z;
        this.f3569f = j2;
        this.f3570g = f2;
        this.f3571h = j3;
        this.f3572i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.e == tVar.e && this.f3569f == tVar.f3569f && Float.compare(this.f3570g, tVar.f3570g) == 0 && this.f3571h == tVar.f3571h && this.f3572i == tVar.f3572i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.e), Long.valueOf(this.f3569f), Float.valueOf(this.f3570g), Long.valueOf(this.f3571h), Integer.valueOf(this.f3572i)});
    }

    public final String toString() {
        StringBuilder a = i.a.a.a.a.a("DeviceOrientationRequest[mShouldUseMag=");
        a.append(this.e);
        a.append(" mMinimumSamplingPeriodMs=");
        a.append(this.f3569f);
        a.append(" mSmallestAngleChangeRadians=");
        a.append(this.f3570g);
        long j2 = this.f3571h;
        if (j2 != RecyclerView.FOREVER_NS) {
            a.append(" expireIn=");
            a.append(j2 - SystemClock.elapsedRealtime());
            a.append("ms");
        }
        if (this.f3572i != Integer.MAX_VALUE) {
            a.append(" num=");
            a.append(this.f3572i);
        }
        a.append(']');
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f3569f);
        q.a(parcel, 3, this.f3570g);
        q.a(parcel, 4, this.f3571h);
        q.a(parcel, 5, this.f3572i);
        q.m(parcel, a);
    }
}
