package h.j.a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AbsSavedState */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final a f1864f = new C0055a();
    public final Parcelable e;

    /* renamed from: h.j.a.a$a  reason: collision with other inner class name */
    /* compiled from: AbsSavedState */
    public static class C0055a extends a {
        public C0055a() {
            super((C0055a) null);
        }
    }

    public /* synthetic */ a(C0055a aVar) {
        this.e = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.e, i2);
    }

    /* compiled from: AbsSavedState */
    public static class b implements Parcelable.ClassLoaderCreator<a> {
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return a.f1864f;
            }
            throw new IllegalStateException("superState must be null");
        }

        public Object[] newArray(int i2) {
            return new a[i2];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f1864f;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.e = parcelable == f1864f ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.e = readParcelable == null ? f1864f : readParcelable;
    }
}
