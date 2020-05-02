package i.c.a.b.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import i.c.a.b.d.l.c;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import java.util.Collections;
import java.util.List;

public final class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new u();

    /* renamed from: l  reason: collision with root package name */
    public static final List<c> f3191l = Collections.emptyList();
    public LocationRequest e;

    /* renamed from: f  reason: collision with root package name */
    public List<c> f3192f;

    /* renamed from: g  reason: collision with root package name */
    public String f3193g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3194h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3195i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3196j;

    /* renamed from: k  reason: collision with root package name */
    public String f3197k;

    public t(LocationRequest locationRequest, List<c> list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.e = locationRequest;
        this.f3192f = list;
        this.f3193g = str;
        this.f3194h = z;
        this.f3195i = z2;
        this.f3196j = z3;
        this.f3197k = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return q.b((Object) this.e, (Object) tVar.e) && q.b((Object) this.f3192f, (Object) tVar.f3192f) && q.b((Object) this.f3193g, (Object) tVar.f3193g) && this.f3194h == tVar.f3194h && this.f3195i == tVar.f3195i && this.f3196j == tVar.f3196j && q.b((Object) this.f3197k, (Object) tVar.f3197k);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        if (this.f3193g != null) {
            sb.append(" tag=");
            sb.append(this.f3193g);
        }
        if (this.f3197k != null) {
            sb.append(" moduleId=");
            sb.append(this.f3197k);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f3194h);
        sb.append(" clients=");
        sb.append(this.f3192f);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f3195i);
        if (this.f3196j) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, (Parcelable) this.e, i2, false);
        q.a(parcel, 5, this.f3192f, false);
        q.a(parcel, 6, this.f3193g, false);
        q.a(parcel, 7, this.f3194h);
        q.a(parcel, 8, this.f3195i);
        q.a(parcel, 9, this.f3196j);
        q.a(parcel, 10, this.f3197k, false);
        q.m(parcel, a);
    }
}
