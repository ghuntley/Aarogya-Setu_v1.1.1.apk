package i.c.a.b.j.b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.b;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.t;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new k();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final b f3988f;

    /* renamed from: g  reason: collision with root package name */
    public final t f3989g;

    public l(int i2, b bVar, t tVar) {
        this.e = i2;
        this.f3988f = bVar;
        this.f3989g = tVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, (Parcelable) this.f3988f, i2, false);
        q.a(parcel, 3, (Parcelable) this.f3989g, i2, false);
        q.m(parcel, a);
    }

    public l() {
        b bVar = new b(8, (PendingIntent) null);
        this.e = 1;
        this.f3988f = bVar;
        this.f3989g = null;
    }
}
