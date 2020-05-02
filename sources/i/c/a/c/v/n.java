package i.c.a.c.v;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* compiled from: Month */
public final class n implements Comparable<n>, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();
    public final Calendar e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4227f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4228g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4229h = this.e.get(1);

    /* renamed from: i  reason: collision with root package name */
    public final int f4230i = this.e.getMaximum(7);

    /* renamed from: j  reason: collision with root package name */
    public final int f4231j = this.e.getActualMaximum(5);

    /* compiled from: Month */
    public static class a implements Parcelable.Creator<n> {
        public Object createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Calendar d = q.d();
            d.set(1, readInt);
            d.set(2, readInt2);
            return new n(d);
        }

        public Object[] newArray(int i2) {
            return new n[i2];
        }
    }

    public n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a2 = q.a(calendar);
        this.e = a2;
        this.f4228g = a2.get(2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(q.b());
        this.f4227f = simpleDateFormat.format(this.e.getTime());
        this.e.getTimeInMillis();
    }

    /* renamed from: a */
    public int compareTo(n nVar) {
        return this.e.compareTo(nVar.e);
    }

    public int b(n nVar) {
        if (this.e instanceof GregorianCalendar) {
            return (nVar.f4228g - this.f4228g) + ((nVar.f4229h - this.f4229h) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f4228g == nVar.f4228g && this.f4229h == nVar.f4229h) {
            return true;
        }
        return false;
    }

    public int f() {
        int firstDayOfWeek = this.e.get(7) - this.e.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f4230i : firstDayOfWeek;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4228g), Integer.valueOf(this.f4229h)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4229h);
        parcel.writeInt(this.f4228g);
    }

    public n a(int i2) {
        Calendar a2 = q.a(this.e);
        a2.add(2, i2);
        return new n(a2);
    }
}
