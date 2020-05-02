package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f14f;

    /* renamed from: g  reason: collision with root package name */
    public int f15g;

    /* renamed from: h  reason: collision with root package name */
    public int f16h;

    /* renamed from: i  reason: collision with root package name */
    public int f17i;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public Object[] newArray(int i2) {
            return new ParcelableVolumeInfo[i2];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.e = parcel.readInt();
        this.f15g = parcel.readInt();
        this.f16h = parcel.readInt();
        this.f17i = parcel.readInt();
        this.f14f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.f15g);
        parcel.writeInt(this.f16h);
        parcel.writeInt(this.f17i);
        parcel.writeInt(this.f14f);
    }
}
