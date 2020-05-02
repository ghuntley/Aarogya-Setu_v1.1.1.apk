package i.c.a.b.i.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class ea extends a {
    public static final Parcelable.Creator<ea> CREATOR = new ga();
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3649f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3650g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3651h;

    /* renamed from: i  reason: collision with root package name */
    public final long f3652i;

    /* renamed from: j  reason: collision with root package name */
    public final long f3653j;

    /* renamed from: k  reason: collision with root package name */
    public final String f3654k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f3655l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f3656m;

    /* renamed from: n  reason: collision with root package name */
    public final long f3657n;

    /* renamed from: o  reason: collision with root package name */
    public final String f3658o;

    /* renamed from: p  reason: collision with root package name */
    public final long f3659p;

    /* renamed from: q  reason: collision with root package name */
    public final long f3660q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final Boolean w;
    public final long x;
    public final List<String> y;
    public final String z;

    public ea(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z2, boolean z3, String str6, long j5, long j6, int i2, boolean z4, boolean z5, boolean z6, String str7, Boolean bool, long j7, List<String> list, String str8) {
        q.b(str);
        this.e = str;
        this.f3649f = TextUtils.isEmpty(str2) ? null : str2;
        this.f3650g = str3;
        this.f3657n = j2;
        this.f3651h = str4;
        this.f3652i = j3;
        this.f3653j = j4;
        this.f3654k = str5;
        this.f3655l = z2;
        this.f3656m = z3;
        this.f3658o = str6;
        this.f3659p = j5;
        this.f3660q = j6;
        this.r = i2;
        this.s = z4;
        this.t = z5;
        this.u = z6;
        this.v = str7;
        this.w = bool;
        this.x = j7;
        this.y = list;
        this.z = str8;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 2, this.e, false);
        q.a(parcel, 3, this.f3649f, false);
        q.a(parcel, 4, this.f3650g, false);
        q.a(parcel, 5, this.f3651h, false);
        q.a(parcel, 6, this.f3652i);
        q.a(parcel, 7, this.f3653j);
        q.a(parcel, 8, this.f3654k, false);
        q.a(parcel, 9, this.f3655l);
        q.a(parcel, 10, this.f3656m);
        q.a(parcel, 11, this.f3657n);
        q.a(parcel, 12, this.f3658o, false);
        q.a(parcel, 13, this.f3659p);
        q.a(parcel, 14, this.f3660q);
        q.a(parcel, 15, this.r);
        q.a(parcel, 16, this.s);
        q.a(parcel, 17, this.t);
        q.a(parcel, 18, this.u);
        q.a(parcel, 19, this.v, false);
        Boolean bool = this.w;
        if (bool != null) {
            q.d(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        q.a(parcel, 22, this.x);
        List<String> list = this.y;
        if (list != null) {
            int l2 = q.l(parcel, 23);
            parcel.writeStringList(list);
            q.m(parcel, l2);
        }
        q.a(parcel, 24, this.z, false);
        q.m(parcel, a);
    }

    public ea(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z2, boolean z3, long j4, String str6, long j5, long j6, int i2, boolean z4, boolean z5, boolean z6, String str7, Boolean bool, long j7, List<String> list, String str8) {
        this.e = str;
        this.f3649f = str2;
        this.f3650g = str3;
        this.f3657n = j4;
        this.f3651h = str4;
        this.f3652i = j2;
        this.f3653j = j3;
        this.f3654k = str5;
        this.f3655l = z2;
        this.f3656m = z3;
        this.f3658o = str6;
        this.f3659p = j5;
        this.f3660q = j6;
        this.r = i2;
        this.s = z4;
        this.t = z5;
        this.u = z6;
        this.v = str7;
        this.w = bool;
        this.x = j7;
        this.y = list;
        this.z = str8;
    }
}
