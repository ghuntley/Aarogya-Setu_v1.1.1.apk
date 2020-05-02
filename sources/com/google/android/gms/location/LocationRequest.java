package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import i.c.a.b.h.j;
import java.util.Arrays;

public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new j();
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public long f513f;

    /* renamed from: g  reason: collision with root package name */
    public long f514g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f515h;

    /* renamed from: i  reason: collision with root package name */
    public long f516i;

    /* renamed from: j  reason: collision with root package name */
    public int f517j;

    /* renamed from: k  reason: collision with root package name */
    public float f518k;

    /* renamed from: l  reason: collision with root package name */
    public long f519l;

    public LocationRequest() {
        this.e = 102;
        this.f513f = 3600000;
        this.f514g = 600000;
        this.f515h = false;
        this.f516i = RecyclerView.FOREVER_NS;
        this.f517j = Integer.MAX_VALUE;
        this.f518k = 0.0f;
        this.f519l = 0;
    }

    public LocationRequest(int i2, long j2, long j3, boolean z, long j4, int i3, float f2, long j5) {
        this.e = i2;
        this.f513f = j2;
        this.f514g = j3;
        this.f515h = z;
        this.f516i = j4;
        this.f517j = i3;
        this.f518k = f2;
        this.f519l = j5;
    }

    public static void a(long j2) {
        if (j2 < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final LocationRequest c(int i2) {
        if (i2 == 100 || i2 == 102 || i2 == 104 || i2 == 105) {
            this.e = i2;
            return this;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.e == locationRequest.e) {
            long j2 = this.f513f;
            if (j2 == locationRequest.f513f && this.f514g == locationRequest.f514g && this.f515h == locationRequest.f515h && this.f516i == locationRequest.f516i && this.f517j == locationRequest.f517j && this.f518k == locationRequest.f518k) {
                long j3 = this.f519l;
                if (j3 >= j2) {
                    j2 = j3;
                }
                long j4 = locationRequest.f519l;
                long j5 = locationRequest.f513f;
                if (j4 < j5) {
                    j4 = j5;
                }
                if (j2 == j4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), Long.valueOf(this.f513f), Float.valueOf(this.f518k), Long.valueOf(this.f519l)});
    }

    public final String toString() {
        StringBuilder a = i.a.a.a.a.a("Request[");
        int i2 = this.e;
        a.append(i2 != 100 ? i2 != 102 ? i2 != 104 ? i2 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.e != 105) {
            a.append(" requested=");
            a.append(this.f513f);
            a.append("ms");
        }
        a.append(" fastest=");
        a.append(this.f514g);
        a.append("ms");
        if (this.f519l > this.f513f) {
            a.append(" maxWait=");
            a.append(this.f519l);
            a.append("ms");
        }
        if (this.f518k > 0.0f) {
            a.append(" smallestDisplacement=");
            a.append(this.f518k);
            a.append("m");
        }
        long j2 = this.f516i;
        if (j2 != RecyclerView.FOREVER_NS) {
            a.append(" expireIn=");
            a.append(j2 - SystemClock.elapsedRealtime());
            a.append("ms");
        }
        if (this.f517j != Integer.MAX_VALUE) {
            a.append(" num=");
            a.append(this.f517j);
        }
        a.append(']');
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f513f);
        q.a(parcel, 3, this.f514g);
        q.a(parcel, 4, this.f515h);
        q.a(parcel, 5, this.f516i);
        q.a(parcel, 6, this.f517j);
        q.a(parcel, 7, this.f518k);
        q.a(parcel, 8, this.f519l);
        q.m(parcel, a);
    }
}
