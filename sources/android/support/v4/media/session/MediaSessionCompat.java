package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        public final MediaDescriptionCompat e;

        /* renamed from: f  reason: collision with root package name */
        public final long f12f;

        public static class a implements Parcelable.Creator<QueueItem> {
            public Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public Object[] newArray(int i2) {
                return new QueueItem[i2];
            }
        }

        public QueueItem(Parcel parcel) {
            this.e = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f12f = parcel.readLong();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("MediaSession.QueueItem {Description=");
            a2.append(this.e);
            a2.append(", Id=");
            a2.append(this.f12f);
            a2.append(" }");
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            this.e.writeToParcel(parcel, i2);
            parcel.writeLong(this.f12f);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        public ResultReceiver e;

        public static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public Object[] newArray(int i2) {
                return new ResultReceiverWrapper[i2];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.e = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            this.e.writeToParcel(parcel, i2);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        public final Object e;

        /* renamed from: f  reason: collision with root package name */
        public g.a.a.b.b.a f13f = null;

        public static class a implements Parcelable.Creator<Token> {
            public Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            public Object[] newArray(int i2) {
                return new Token[i2];
            }
        }

        public Token(Object obj) {
            this.e = obj;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.e;
            if (obj2 != null) {
                Object obj3 = token.e;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.e == null) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            Object obj = this.e;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable((Parcelable) this.e, i2);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
