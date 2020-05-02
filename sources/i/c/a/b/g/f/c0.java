package i.c.a.b.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.c;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import i.c.a.b.h.t;
import java.util.Collections;
import java.util.List;

public final class c0 extends a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: h  reason: collision with root package name */
    public static final List<c> f3182h = Collections.emptyList();

    /* renamed from: i  reason: collision with root package name */
    public static final t f3183i = new t();
    public t e;

    /* renamed from: f  reason: collision with root package name */
    public List<c> f3184f;

    /* renamed from: g  reason: collision with root package name */
    public String f3185g;

    public c0(t tVar, List<c> list, String str) {
        this.e = tVar;
        this.f3184f = list;
        this.f3185g = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return q.b((Object) this.e, (Object) c0Var.e) && q.b((Object) this.f3184f, (Object) c0Var.f3184f) && q.b((Object) this.f3185g, (Object) c0Var.f3185g);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, (Parcelable) this.e, i2, false);
        q.a(parcel, 2, this.f3184f, false);
        q.a(parcel, 3, this.f3185g, false);
        q.m(parcel, a);
    }
}
