package i.c.a.b.d.l;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new x();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3108f;

    public c(int i2, String str) {
        this.e = i2;
        this.f3108f = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            c cVar = (c) obj;
            return cVar.e == this.e && q.b((Object) cVar.f3108f, (Object) this.f3108f);
        }
    }

    public int hashCode() {
        return this.e;
    }

    public String toString() {
        int i2 = this.e;
        String str = this.f3108f;
        StringBuilder sb = new StringBuilder(i.a.a.a.a.a(str, 12));
        sb.append(i2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f3108f, false);
        q.m(parcel, a);
    }
}
