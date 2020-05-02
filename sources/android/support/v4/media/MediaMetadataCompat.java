package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final h.e.a<String, Integer> f10f;
    public final Bundle e;

    public static class a implements Parcelable.Creator<MediaMetadataCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public Object[] newArray(int i2) {
            return new MediaMetadataCompat[i2];
        }
    }

    static {
        h.e.a<String, Integer> aVar = new h.e.a<>();
        f10f = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        f10f.put("android.media.metadata.ARTIST", 1);
        f10f.put("android.media.metadata.DURATION", 0);
        f10f.put("android.media.metadata.ALBUM", 1);
        f10f.put("android.media.metadata.AUTHOR", 1);
        f10f.put("android.media.metadata.WRITER", 1);
        f10f.put("android.media.metadata.COMPOSER", 1);
        f10f.put("android.media.metadata.COMPILATION", 1);
        f10f.put("android.media.metadata.DATE", 1);
        f10f.put("android.media.metadata.YEAR", 0);
        f10f.put("android.media.metadata.GENRE", 1);
        f10f.put("android.media.metadata.TRACK_NUMBER", 0);
        f10f.put("android.media.metadata.NUM_TRACKS", 0);
        f10f.put("android.media.metadata.DISC_NUMBER", 0);
        f10f.put("android.media.metadata.ALBUM_ARTIST", 1);
        f10f.put("android.media.metadata.ART", 2);
        f10f.put("android.media.metadata.ART_URI", 1);
        f10f.put("android.media.metadata.ALBUM_ART", 2);
        f10f.put("android.media.metadata.ALBUM_ART_URI", 1);
        f10f.put("android.media.metadata.USER_RATING", 3);
        f10f.put("android.media.metadata.RATING", 3);
        f10f.put("android.media.metadata.DISPLAY_TITLE", 1);
        f10f.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        f10f.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        f10f.put("android.media.metadata.DISPLAY_ICON", 2);
        f10f.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        f10f.put("android.media.metadata.MEDIA_ID", 1);
        f10f.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        f10f.put("android.media.metadata.MEDIA_URI", 1);
        f10f.put("android.media.metadata.ADVERTISEMENT", 0);
        f10f.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.e);
    }
}
