package i.c.a.c.v;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: CalendarConstraints */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0124a();
    public final n e;

    /* renamed from: f  reason: collision with root package name */
    public final n f4206f;

    /* renamed from: g  reason: collision with root package name */
    public final n f4207g;

    /* renamed from: h  reason: collision with root package name */
    public final b f4208h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4209i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4210j;

    /* renamed from: i.c.a.c.v.a$a  reason: collision with other inner class name */
    /* compiled from: CalendarConstraints */
    public static class C0124a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel parcel) {
            return new a((n) parcel.readParcelable(n.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), (b) parcel.readParcelable(b.class.getClassLoader()), (C0124a) null);
        }

        public Object[] newArray(int i2) {
            return new a[i2];
        }
    }

    /* compiled from: CalendarConstraints */
    public interface b extends Parcelable {
        boolean e(long j2);
    }

    public /* synthetic */ a(n nVar, n nVar2, n nVar3, b bVar, C0124a aVar) {
        this.e = nVar;
        this.f4206f = nVar2;
        this.f4207g = nVar3;
        this.f4208h = bVar;
        if (nVar.e.compareTo(nVar3.e) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (nVar3.e.compareTo(nVar2.e) <= 0) {
            this.f4210j = nVar.b(nVar2) + 1;
            this.f4209i = (nVar2.f4229h - nVar.f4229h) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.e.equals(aVar.e) || !this.f4206f.equals(aVar.f4206f) || !this.f4207g.equals(aVar.f4207g) || !this.f4208h.equals(aVar.f4208h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f4206f, this.f4207g, this.f4208h});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.f4206f, 0);
        parcel.writeParcelable(this.f4207g, 0);
        parcel.writeParcelable(this.f4208h, 0);
    }
}
