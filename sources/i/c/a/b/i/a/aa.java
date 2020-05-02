package i.c.a.b.i.a;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class aa extends a {
    public static final Parcelable.Creator<aa> CREATOR = new z9();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3586f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3587g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f3588h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3589i;

    /* renamed from: j  reason: collision with root package name */
    public final String f3590j;

    /* renamed from: k  reason: collision with root package name */
    public final Double f3591k;

    public aa(da daVar) {
        this(daVar.c, daVar.d, daVar.e, daVar.f3643b);
    }

    public final Object a() {
        Long l2 = this.f3588h;
        if (l2 != null) {
            return l2;
        }
        Double d = this.f3591k;
        if (d != null) {
            return d;
        }
        String str = this.f3589i;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f3586f, false);
        q.a(parcel, 3, this.f3587g);
        Long l2 = this.f3588h;
        if (l2 != null) {
            q.d(parcel, 4, 8);
            parcel.writeLong(l2.longValue());
        }
        q.a(parcel, 6, this.f3589i, false);
        q.a(parcel, 7, this.f3590j, false);
        Double d = this.f3591k;
        if (d != null) {
            q.d(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        q.m(parcel, a);
    }

    public aa(String str, long j2, Object obj, String str2) {
        q.b(str);
        this.e = 2;
        this.f3586f = str;
        this.f3587g = j2;
        this.f3590j = str2;
        if (obj == null) {
            this.f3588h = null;
            this.f3591k = null;
            this.f3589i = null;
        } else if (obj instanceof Long) {
            this.f3588h = (Long) obj;
            this.f3591k = null;
            this.f3589i = null;
        } else if (obj instanceof String) {
            this.f3588h = null;
            this.f3591k = null;
            this.f3589i = (String) obj;
        } else if (obj instanceof Double) {
            this.f3588h = null;
            this.f3591k = (Double) obj;
            this.f3589i = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public aa(String str) {
        q.b(str);
        this.e = 2;
        this.f3586f = str;
        this.f3587g = 0;
        this.f3588h = null;
        this.f3591k = null;
        this.f3589i = null;
        this.f3590j = null;
    }

    public aa(int i2, String str, long j2, Long l2, Float f2, String str2, String str3, Double d) {
        this.e = i2;
        this.f3586f = str;
        this.f3587g = j2;
        this.f3588h = l2;
        if (i2 == 1) {
            this.f3591k = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.f3591k = d;
        }
        this.f3589i = str2;
        this.f3590j = str3;
    }
}
