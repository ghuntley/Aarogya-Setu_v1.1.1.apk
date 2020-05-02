package i.c.a.c.g0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h.e.h;

/* compiled from: ExtendableSavedState */
public class a extends h.j.a.a {
    public static final Parcelable.Creator<a> CREATOR = new C0117a();

    /* renamed from: g  reason: collision with root package name */
    public final h<String, Bundle> f4114g;

    /* renamed from: i.c.a.c.g0.a$a  reason: collision with other inner class name */
    /* compiled from: ExtendableSavedState */
    public static class C0117a implements Parcelable.ClassLoaderCreator<a> {
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, (C0117a) null);
        }

        public Object[] newArray(int i2) {
            return new a[i2];
        }

        public Object createFromParcel(Parcel parcel) {
            return new a(parcel, (ClassLoader) null, (C0117a) null);
        }
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f4114g = new h<>();
    }

    public String toString() {
        StringBuilder a = i.a.a.a.a.a("ExtendableSavedState{");
        a.append(Integer.toHexString(System.identityHashCode(this)));
        a.append(" states=");
        a.append(this.f4114g);
        a.append("}");
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.e, i2);
        int i3 = this.f4114g.f1570g;
        parcel.writeInt(i3);
        String[] strArr = new String[i3];
        Bundle[] bundleArr = new Bundle[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            strArr[i4] = this.f4114g.c(i4);
            bundleArr[i4] = this.f4114g.e(i4);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0117a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f4114g = new h<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f4114g.put(strArr[i2], bundleArr[i2]);
        }
    }
}
