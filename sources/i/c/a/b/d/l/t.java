package i.c.a.b.d.l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.b;
import i.c.a.b.d.l.l;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new g0();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public IBinder f3147f;

    /* renamed from: g  reason: collision with root package name */
    public b f3148g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3149h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3150i;

    public t(int i2, IBinder iBinder, b bVar, boolean z, boolean z2) {
        this.e = i2;
        this.f3147f = iBinder;
        this.f3148g = bVar;
        this.f3149h = z;
        this.f3150i = z2;
    }

    public l d() {
        return l.a.a(this.f3147f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f3148g.equals(tVar.f3148g) && d().equals(tVar.d());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f3147f, false);
        q.a(parcel, 3, (Parcelable) this.f3148g, i2, false);
        q.a(parcel, 4, this.f3149h);
        q.a(parcel, 5, this.f3150i);
        q.m(parcel, a);
    }
}
