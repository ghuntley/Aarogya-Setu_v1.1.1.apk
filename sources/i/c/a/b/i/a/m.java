package i.c.a.b.i.a;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class m extends a {
    public static final Parcelable.Creator<m> CREATOR = new p();
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final l f3755f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3756g;

    /* renamed from: h  reason: collision with root package name */
    public final long f3757h;

    public m(String str, l lVar, String str2, long j2) {
        this.e = str;
        this.f3755f = lVar;
        this.f3756g = str2;
        this.f3757h = j2;
    }

    public final String toString() {
        String str = this.f3756g;
        String str2 = this.e;
        String valueOf = String.valueOf(this.f3755f);
        StringBuilder sb = new StringBuilder(valueOf.length() + i.a.a.a.a.a(str2, i.a.a.a.a.a(str, 21)));
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return i.a.a.a.a.a(sb, ",params=", valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 2, this.e, false);
        q.a(parcel, 3, (Parcelable) this.f3755f, i2, false);
        q.a(parcel, 4, this.f3756g, false);
        q.a(parcel, 5, this.f3757h);
        q.m(parcel, a);
    }

    public m(m mVar, long j2) {
        q.a(mVar);
        this.e = mVar.e;
        this.f3755f = mVar.f3755f;
        this.f3756g = mVar.f3756g;
        this.f3757h = j2;
    }
}
