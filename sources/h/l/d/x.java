package h.l.d;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: FragmentState */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2031f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2032g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2033h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2034i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2035j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2036k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2037l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2038m;

    /* renamed from: n  reason: collision with root package name */
    public final Bundle f2039n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f2040o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2041p;

    /* renamed from: q  reason: collision with root package name */
    public Bundle f2042q;

    /* compiled from: FragmentState */
    public static class a implements Parcelable.Creator<x> {
        public Object createFromParcel(Parcel parcel) {
            return new x(parcel);
        }

        public Object[] newArray(int i2) {
            return new x[i2];
        }
    }

    public x(Fragment fragment) {
        this.e = fragment.getClass().getName();
        this.f2031f = fragment.f231i;
        this.f2032g = fragment.f239q;
        this.f2033h = fragment.z;
        this.f2034i = fragment.A;
        this.f2035j = fragment.B;
        this.f2036k = fragment.E;
        this.f2037l = fragment.f238p;
        this.f2038m = fragment.D;
        this.f2039n = fragment.f232j;
        this.f2040o = fragment.C;
        this.f2041p = fragment.T.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.e);
        sb.append(" (");
        sb.append(this.f2031f);
        sb.append(")}:");
        if (this.f2032g) {
            sb.append(" fromLayout");
        }
        if (this.f2034i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2034i));
        }
        String str = this.f2035j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2035j);
        }
        if (this.f2036k) {
            sb.append(" retainInstance");
        }
        if (this.f2037l) {
            sb.append(" removing");
        }
        if (this.f2038m) {
            sb.append(" detached");
        }
        if (this.f2040o) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.e);
        parcel.writeString(this.f2031f);
        parcel.writeInt(this.f2032g ? 1 : 0);
        parcel.writeInt(this.f2033h);
        parcel.writeInt(this.f2034i);
        parcel.writeString(this.f2035j);
        parcel.writeInt(this.f2036k ? 1 : 0);
        parcel.writeInt(this.f2037l ? 1 : 0);
        parcel.writeInt(this.f2038m ? 1 : 0);
        parcel.writeBundle(this.f2039n);
        parcel.writeInt(this.f2040o ? 1 : 0);
        parcel.writeBundle(this.f2042q);
        parcel.writeInt(this.f2041p);
    }

    public x(Parcel parcel) {
        this.e = parcel.readString();
        this.f2031f = parcel.readString();
        boolean z = true;
        this.f2032g = parcel.readInt() != 0;
        this.f2033h = parcel.readInt();
        this.f2034i = parcel.readInt();
        this.f2035j = parcel.readString();
        this.f2036k = parcel.readInt() != 0;
        this.f2037l = parcel.readInt() != 0;
        this.f2038m = parcel.readInt() != 0;
        this.f2039n = parcel.readBundle();
        this.f2040o = parcel.readInt() == 0 ? false : z;
        this.f2042q = parcel.readBundle();
        this.f2041p = parcel.readInt();
    }
}
