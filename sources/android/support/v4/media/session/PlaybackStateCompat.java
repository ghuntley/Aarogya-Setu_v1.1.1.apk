package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final long f18f;

    /* renamed from: g  reason: collision with root package name */
    public final long f19g;

    /* renamed from: h  reason: collision with root package name */
    public final float f20h;

    /* renamed from: i  reason: collision with root package name */
    public final long f21i;

    /* renamed from: j  reason: collision with root package name */
    public final int f22j;

    /* renamed from: k  reason: collision with root package name */
    public final CharSequence f23k;

    /* renamed from: l  reason: collision with root package name */
    public final long f24l;

    /* renamed from: m  reason: collision with root package name */
    public List<CustomAction> f25m;

    /* renamed from: n  reason: collision with root package name */
    public final long f26n;

    /* renamed from: o  reason: collision with root package name */
    public final Bundle f27o;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final CharSequence f28f;

        /* renamed from: g  reason: collision with root package name */
        public final int f29g;

        /* renamed from: h  reason: collision with root package name */
        public final Bundle f30h;

        public static class a implements Parcelable.Creator<CustomAction> {
            public Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public Object[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        public CustomAction(Parcel parcel) {
            this.e = parcel.readString();
            this.f28f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f29g = parcel.readInt();
            this.f30h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("Action:mName='");
            a2.append(this.f28f);
            a2.append(", mIcon=");
            a2.append(this.f29g);
            a2.append(", mExtras=");
            a2.append(this.f30h);
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.e);
            TextUtils.writeToParcel(this.f28f, parcel, i2);
            parcel.writeInt(this.f29g);
            parcel.writeBundle(this.f30h);
        }
    }

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public Object[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.e = parcel.readInt();
        this.f18f = parcel.readLong();
        this.f20h = parcel.readFloat();
        this.f24l = parcel.readLong();
        this.f19g = parcel.readLong();
        this.f21i = parcel.readLong();
        this.f23k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f25m = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f26n = parcel.readLong();
        this.f27o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f22j = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.e + ", position=" + this.f18f + ", buffered position=" + this.f19g + ", speed=" + this.f20h + ", updated=" + this.f24l + ", actions=" + this.f21i + ", error code=" + this.f22j + ", error message=" + this.f23k + ", custom actions=" + this.f25m + ", active item id=" + this.f26n + "}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.e);
        parcel.writeLong(this.f18f);
        parcel.writeFloat(this.f20h);
        parcel.writeLong(this.f24l);
        parcel.writeLong(this.f19g);
        parcel.writeLong(this.f21i);
        TextUtils.writeToParcel(this.f23k, parcel, i2);
        parcel.writeTypedList(this.f25m);
        parcel.writeLong(this.f26n);
        parcel.writeBundle(this.f27o);
        parcel.writeInt(this.f22j);
    }
}
