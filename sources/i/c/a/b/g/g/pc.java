package i.c.a.b.g.g;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class pc extends a {
    public static final Parcelable.Creator<pc> CREATOR = new sc();
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3402f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3403g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3404h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3405i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3406j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f3407k;

    public pc(long j2, long j3, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.e = j2;
        this.f3402f = j3;
        this.f3403g = z;
        this.f3404h = str;
        this.f3405i = str2;
        this.f3406j = str3;
        this.f3407k = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f3402f);
        q.a(parcel, 3, this.f3403g);
        q.a(parcel, 4, this.f3404h, false);
        q.a(parcel, 5, this.f3405i, false);
        q.a(parcel, 6, this.f3406j, false);
        q.a(parcel, 7, this.f3407k, false);
        q.m(parcel, a);
    }
}
