package i.c.a.b.j.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import i.c.a.b.d.k.f;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class c extends a implements f {
    public static final Parcelable.Creator<c> CREATOR = new b();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public int f3984f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f3985g;

    public c() {
        this.e = 2;
        this.f3984f = 0;
        this.f3985g = null;
    }

    public final Status c() {
        if (this.f3984f == 0) {
            return Status.f472i;
        }
        return Status.f475l;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f3984f);
        q.a(parcel, 3, (Parcelable) this.f3985g, i2, false);
        q.m(parcel, a);
    }

    public c(int i2, int i3, Intent intent) {
        this.e = i2;
        this.f3984f = i3;
        this.f3985g = intent;
    }
}
