package i.c.a.b.i.a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class l extends a implements Iterable<String> {
    public static final Parcelable.Creator<l> CREATOR = new n();
    public final Bundle e;

    public l(Bundle bundle) {
        this.e = bundle;
    }

    public final Object a(String str) {
        return this.e.get(str);
    }

    public final Long b(String str) {
        return Long.valueOf(this.e.getLong(str));
    }

    public final Double c(String str) {
        return Double.valueOf(this.e.getDouble(str));
    }

    public final String d(String str) {
        return this.e.getString(str);
    }

    public final Iterator<String> iterator() {
        return new k(this);
    }

    public final String toString() {
        return this.e.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 2, b(), false);
        q.m(parcel, a);
    }

    public final Bundle b() {
        return new Bundle(this.e);
    }
}
