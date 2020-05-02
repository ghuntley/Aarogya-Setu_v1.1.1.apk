package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final MediaDescriptionCompat f1f;

    public static class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        public Object createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        public Object[] newArray(int i2) {
            return new MediaBrowserCompat$MediaItem[i2];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.e = parcel.readInt();
        this.f1f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.e + ", mDescription=" + this.f1f + '}';
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e);
        this.f1f.writeToParcel(parcel, i2);
    }
}
