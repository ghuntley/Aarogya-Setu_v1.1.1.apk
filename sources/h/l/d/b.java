package h.l.d;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import h.l.d.a0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: BackStackState */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final int[] e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<String> f1931f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1932g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f1933h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1934i;

    /* renamed from: j  reason: collision with root package name */
    public final String f1935j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1936k;

    /* renamed from: l  reason: collision with root package name */
    public final int f1937l;

    /* renamed from: m  reason: collision with root package name */
    public final CharSequence f1938m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1939n;

    /* renamed from: o  reason: collision with root package name */
    public final CharSequence f1940o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<String> f1941p;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList<String> f1942q;
    public final boolean r;

    /* compiled from: BackStackState */
    public static class a implements Parcelable.Creator<b> {
        public Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public Object[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(a aVar) {
        int size = aVar.a.size();
        this.e = new int[(size * 5)];
        if (aVar.f1917g) {
            this.f1931f = new ArrayList<>(size);
            this.f1932g = new int[size];
            this.f1933h = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                a0.a aVar2 = aVar.a.get(i2);
                int i4 = i3 + 1;
                this.e[i3] = aVar2.a;
                ArrayList<String> arrayList = this.f1931f;
                Fragment fragment = aVar2.f1927b;
                arrayList.add(fragment != null ? fragment.f231i : null);
                int[] iArr = this.e;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.e;
                iArr[i7] = aVar2.f1928f;
                this.f1932g[i2] = aVar2.f1929g.ordinal();
                this.f1933h[i2] = aVar2.f1930h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f1934i = aVar.f1916f;
            this.f1935j = aVar.f1918h;
            this.f1936k = aVar.s;
            this.f1937l = aVar.f1919i;
            this.f1938m = aVar.f1920j;
            this.f1939n = aVar.f1921k;
            this.f1940o = aVar.f1922l;
            this.f1941p = aVar.f1923m;
            this.f1942q = aVar.f1924n;
            this.r = aVar.f1925o;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.e);
        parcel.writeStringList(this.f1931f);
        parcel.writeIntArray(this.f1932g);
        parcel.writeIntArray(this.f1933h);
        parcel.writeInt(this.f1934i);
        parcel.writeString(this.f1935j);
        parcel.writeInt(this.f1936k);
        parcel.writeInt(this.f1937l);
        TextUtils.writeToParcel(this.f1938m, parcel, 0);
        parcel.writeInt(this.f1939n);
        TextUtils.writeToParcel(this.f1940o, parcel, 0);
        parcel.writeStringList(this.f1941p);
        parcel.writeStringList(this.f1942q);
        parcel.writeInt(this.r ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.e = parcel.createIntArray();
        this.f1931f = parcel.createStringArrayList();
        this.f1932g = parcel.createIntArray();
        this.f1933h = parcel.createIntArray();
        this.f1934i = parcel.readInt();
        this.f1935j = parcel.readString();
        this.f1936k = parcel.readInt();
        this.f1937l = parcel.readInt();
        this.f1938m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1939n = parcel.readInt();
        this.f1940o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1941p = parcel.createStringArrayList();
        this.f1942q = parcel.createStringArrayList();
        this.r = parcel.readInt() != 0;
    }
}
