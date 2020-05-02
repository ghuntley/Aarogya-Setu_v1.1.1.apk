package h.y;

import android.os.Parcel;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel */
public class a extends VersionedParcel {
    public final SparseIntArray d;
    public final Parcel e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2362f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2363g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2364h;

    /* renamed from: i  reason: collision with root package name */
    public int f2365i;

    /* renamed from: j  reason: collision with root package name */
    public int f2366j;

    /* renamed from: k  reason: collision with root package name */
    public int f2367k;

    public a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new h.e.a(), new h.e.a(), new h.e.a());
    }

    public boolean a(int i2) {
        while (this.f2366j < this.f2363g) {
            int i3 = this.f2367k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.f2366j);
            int readInt = this.e.readInt();
            this.f2367k = this.e.readInt();
            this.f2366j += readInt;
        }
        if (this.f2367k == i2) {
            return true;
        }
        return false;
    }

    public void b(int i2) {
        a();
        this.f2365i = i2;
        this.d.put(i2, this.e.dataPosition());
        this.e.writeInt(0);
        this.e.writeInt(i2);
    }

    public a(Parcel parcel, int i2, int i3, String str, h.e.a<String, Method> aVar, h.e.a<String, Method> aVar2, h.e.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.d = new SparseIntArray();
        this.f2365i = -1;
        this.f2366j = 0;
        this.f2367k = -1;
        this.e = parcel;
        this.f2362f = i2;
        this.f2363g = i3;
        this.f2366j = i2;
        this.f2364h = str;
    }

    public VersionedParcel b() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f2366j;
        if (i2 == this.f2362f) {
            i2 = this.f2363g;
        }
        return new a(parcel, dataPosition, i2, i.a.a.a.a.a(new StringBuilder(), this.f2364h, "  "), this.a, this.f365b, this.c);
    }

    public void a() {
        int i2 = this.f2365i;
        if (i2 >= 0) {
            int i3 = this.d.get(i2);
            int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(i3);
            this.e.writeInt(dataPosition - i3);
            this.e.setDataPosition(dataPosition);
        }
    }
}
