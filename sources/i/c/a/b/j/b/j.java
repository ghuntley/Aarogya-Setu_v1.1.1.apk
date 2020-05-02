package i.c.a.b.j.b;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.s;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new i();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final s f3987f;

    public j(int i2, s sVar) {
        this.e = i2;
        this.f3987f = sVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, (Parcelable) this.f3987f, i2, false);
        q.m(parcel, a);
    }

    public j(s sVar) {
        this.e = 1;
        this.f3987f = sVar;
    }
}
