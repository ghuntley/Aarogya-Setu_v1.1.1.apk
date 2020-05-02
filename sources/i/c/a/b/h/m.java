package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;

public final class m extends a {
    public static final Parcelable.Creator<m> CREATOR = new n();
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3564f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3565g;

    public m(String str, String str2, String str3) {
        this.f3565g = str;
        this.e = str2;
        this.f3564f = str3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e, false);
        q.a(parcel, 2, this.f3564f, false);
        q.a(parcel, 5, this.f3565g, false);
        q.m(parcel, a);
    }
}
