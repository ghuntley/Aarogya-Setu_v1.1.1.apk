package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import h.y.b;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();
    public final b e;

    public static class a implements Parcelable.Creator<ParcelImpl> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public Object[] newArray(int i2) {
            return new ParcelImpl[i2];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.e = new h.y.a(parcel).c();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        new h.y.a(parcel).a(this.e);
    }
}
