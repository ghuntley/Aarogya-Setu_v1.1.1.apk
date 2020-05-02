package i.c.a.b.i.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.g.g.a;
import i.c.a.b.g.g.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class g4 extends a implements e4 {
    public g4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void a(m mVar, ea eaVar) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) mVar);
        q.a(g2, (Parcelable) eaVar);
        b(1, g2);
    }

    public final void b(ea eaVar) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) eaVar);
        b(18, g2);
    }

    public final void c(ea eaVar) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) eaVar);
        b(4, g2);
    }

    public final String d(ea eaVar) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) eaVar);
        Parcel a = a(11, g2);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(aa aaVar, ea eaVar) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) aaVar);
        q.a(g2, (Parcelable) eaVar);
        b(2, g2);
    }

    public final void a(m mVar, String str, String str2) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) mVar);
        g2.writeString(str);
        g2.writeString(str2);
        b(5, g2);
    }

    public final void a(ea eaVar) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) eaVar);
        b(6, g2);
    }

    public final List<aa> a(ea eaVar, boolean z) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) eaVar);
        g2.writeInt(z ? 1 : 0);
        Parcel a = a(7, g2);
        ArrayList<aa> createTypedArrayList = a.createTypedArrayList(aa.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final byte[] a(m mVar, String str) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) mVar);
        g2.writeString(str);
        Parcel a = a(9, g2);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }

    public final void a(long j2, String str, String str2, String str3) {
        Parcel g2 = g();
        g2.writeLong(j2);
        g2.writeString(str);
        g2.writeString(str2);
        g2.writeString(str3);
        b(10, g2);
    }

    public final void a(na naVar, ea eaVar) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) naVar);
        q.a(g2, (Parcelable) eaVar);
        b(12, g2);
    }

    public final void a(na naVar) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) naVar);
        b(13, g2);
    }

    public final List<aa> a(String str, String str2, boolean z, ea eaVar) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        q.a(g2, z);
        q.a(g2, (Parcelable) eaVar);
        Parcel a = a(14, g2);
        ArrayList<aa> createTypedArrayList = a.createTypedArrayList(aa.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<aa> a(String str, String str2, String str3, boolean z) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        g2.writeString(str3);
        q.a(g2, z);
        Parcel a = a(15, g2);
        ArrayList<aa> createTypedArrayList = a.createTypedArrayList(aa.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<na> a(String str, String str2, ea eaVar) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        q.a(g2, (Parcelable) eaVar);
        Parcel a = a(16, g2);
        ArrayList<na> createTypedArrayList = a.createTypedArrayList(na.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    public final List<na> a(String str, String str2, String str3) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        g2.writeString(str3);
        Parcel a = a(17, g2);
        ArrayList<na> createTypedArrayList = a.createTypedArrayList(na.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }
}
