package i.c.a.b.i.a;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class na extends a {
    public static final Parcelable.Creator<na> CREATOR = new qa();
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public String f3791f;

    /* renamed from: g  reason: collision with root package name */
    public aa f3792g;

    /* renamed from: h  reason: collision with root package name */
    public long f3793h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3794i;

    /* renamed from: j  reason: collision with root package name */
    public String f3795j;

    /* renamed from: k  reason: collision with root package name */
    public m f3796k;

    /* renamed from: l  reason: collision with root package name */
    public long f3797l;

    /* renamed from: m  reason: collision with root package name */
    public m f3798m;

    /* renamed from: n  reason: collision with root package name */
    public long f3799n;

    /* renamed from: o  reason: collision with root package name */
    public m f3800o;

    public na(na naVar) {
        q.a(naVar);
        this.e = naVar.e;
        this.f3791f = naVar.f3791f;
        this.f3792g = naVar.f3792g;
        this.f3793h = naVar.f3793h;
        this.f3794i = naVar.f3794i;
        this.f3795j = naVar.f3795j;
        this.f3796k = naVar.f3796k;
        this.f3797l = naVar.f3797l;
        this.f3798m = naVar.f3798m;
        this.f3799n = naVar.f3799n;
        this.f3800o = naVar.f3800o;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 2, this.e, false);
        q.a(parcel, 3, this.f3791f, false);
        q.a(parcel, 4, (Parcelable) this.f3792g, i2, false);
        q.a(parcel, 5, this.f3793h);
        q.a(parcel, 6, this.f3794i);
        q.a(parcel, 7, this.f3795j, false);
        q.a(parcel, 8, (Parcelable) this.f3796k, i2, false);
        q.a(parcel, 9, this.f3797l);
        q.a(parcel, 10, (Parcelable) this.f3798m, i2, false);
        q.a(parcel, 11, this.f3799n);
        q.a(parcel, 12, (Parcelable) this.f3800o, i2, false);
        q.m(parcel, a);
    }

    public na(String str, String str2, aa aaVar, long j2, boolean z, String str3, m mVar, long j3, m mVar2, long j4, m mVar3) {
        this.e = str;
        this.f3791f = str2;
        this.f3792g = aaVar;
        this.f3793h = j2;
        this.f3794i = z;
        this.f3795j = str3;
        this.f3796k = mVar;
        this.f3797l = j3;
        this.f3798m = mVar2;
        this.f3799n = j4;
        this.f3800o = mVar3;
    }
}
