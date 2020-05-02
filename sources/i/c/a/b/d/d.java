package i.c.a.b.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new r();
    public final String e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public final int f3019f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3020g;

    public d(String str, long j2) {
        this.e = str;
        this.f3020g = j2;
        this.f3019f = -1;
    }

    public long d() {
        long j2 = this.f3020g;
        return j2 == -1 ? (long) this.f3019f : j2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.e;
            if (((str == null || !str.equals(dVar.e)) && (this.e != null || dVar.e != null)) || d() != dVar.d()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, Long.valueOf(d())});
    }

    public String toString() {
        q.a c = q.c((Object) this);
        c.a(DefaultAppMeasurementEventListenerRegistrar.NAME, this.e);
        c.a("version", Long.valueOf(d()));
        return c.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e, false);
        q.a(parcel, 2, this.f3019f);
        q.a(parcel, 3, d());
        q.m(parcel, a);
    }

    public d(String str, int i2, long j2) {
        this.e = str;
        this.f3019f = i2;
        this.f3020g = j2;
    }
}
