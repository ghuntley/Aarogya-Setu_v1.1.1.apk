package h.l.d;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: FragmentManagerState */
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();
    public ArrayList<x> e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<String> f2022f;

    /* renamed from: g  reason: collision with root package name */
    public b[] f2023g;

    /* renamed from: h  reason: collision with root package name */
    public int f2024h;

    /* renamed from: i  reason: collision with root package name */
    public String f2025i = null;

    /* compiled from: FragmentManagerState */
    public static class a implements Parcelable.Creator<u> {
        public Object createFromParcel(Parcel parcel) {
            return new u(parcel);
        }

        public Object[] newArray(int i2) {
            return new u[i2];
        }
    }

    public u() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.e);
        parcel.writeStringList(this.f2022f);
        parcel.writeTypedArray(this.f2023g, i2);
        parcel.writeInt(this.f2024h);
        parcel.writeString(this.f2025i);
    }

    public u(Parcel parcel) {
        this.e = parcel.createTypedArrayList(x.CREATOR);
        this.f2022f = parcel.createStringArrayList();
        this.f2023g = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f2024h = parcel.readInt();
        this.f2025i = parcel.readString();
    }
}
