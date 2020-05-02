package i.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new q();
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3559f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3560g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3561h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3562i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3563j;

    public g(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.e = z;
        this.f3559f = z2;
        this.f3560g = z3;
        this.f3561h = z4;
        this.f3562i = z5;
        this.f3563j = z6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f3559f);
        q.a(parcel, 3, this.f3560g);
        q.a(parcel, 4, this.f3561h);
        q.a(parcel, 5, this.f3562i);
        q.a(parcel, 6, this.f3563j);
        q.m(parcel, a);
    }
}
