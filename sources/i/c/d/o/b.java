package i.c.d.o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new r();
    public Bundle e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f4757f;

    public b(Bundle bundle) {
        this.e = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 2, this.e, false);
        q.m(parcel, a);
    }
}
