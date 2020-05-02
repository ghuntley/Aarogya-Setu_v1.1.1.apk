package i.c.a.b.g.g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class oc extends a implements mc {
    public oc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final void a(String str, String str2, Bundle bundle, long j2) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        q.a(g2, (Parcelable) bundle);
        g2.writeLong(j2);
        b(1, g2);
    }

    public final int a() {
        Parcel a = a(2, g());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
