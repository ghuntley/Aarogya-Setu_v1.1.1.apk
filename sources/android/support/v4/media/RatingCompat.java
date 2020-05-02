package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final float f11f;

    public static class a implements Parcelable.Creator<RatingCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public Object[] newArray(int i2) {
            return new RatingCompat[i2];
        }
    }

    public RatingCompat(int i2, float f2) {
        this.e = i2;
        this.f11f = f2;
    }

    public int describeContents() {
        return this.e;
    }

    public String toString() {
        String str;
        StringBuilder a2 = i.a.a.a.a.a("Rating:style=");
        a2.append(this.e);
        a2.append(" rating=");
        float f2 = this.f11f;
        if (f2 < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f2);
        }
        a2.append(str);
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f11f);
    }
}
