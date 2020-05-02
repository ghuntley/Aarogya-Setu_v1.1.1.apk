package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i.c.a.b.d.k.i;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new i();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final String f471f;

    public Scope(int i2, String str) {
        q.a(str, (Object) "scopeUri must not be null or empty");
        this.e = i2;
        this.f471f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f471f.equals(((Scope) obj).f471f);
    }

    public final int hashCode() {
        return this.f471f.hashCode();
    }

    public final String toString() {
        return this.f471f;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f471f, false);
        q.m(parcel, a);
    }

    public Scope(String str) {
        q.a(str, (Object) "scopeUri must not be null or empty");
        this.e = 1;
        this.f471f = str;
    }
}
