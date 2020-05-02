package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import h.y.a;
import h.y.b;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.a;
        if (versionedParcel.a(1)) {
            obj = versionedParcel.c();
        }
        remoteActionCompat.a = (IconCompat) obj;
        remoteActionCompat.f208b = versionedParcel.a(remoteActionCompat.f208b, 2);
        remoteActionCompat.c = versionedParcel.a(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) versionedParcel.a(remoteActionCompat.d, 4);
        remoteActionCompat.e = versionedParcel.a(remoteActionCompat.e, 5);
        remoteActionCompat.f209f = versionedParcel.a(remoteActionCompat.f209f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        if (versionedParcel != null) {
            IconCompat iconCompat = remoteActionCompat.a;
            versionedParcel.b(1);
            versionedParcel.a((b) iconCompat);
            CharSequence charSequence = remoteActionCompat.f208b;
            versionedParcel.b(2);
            a aVar = (a) versionedParcel;
            TextUtils.writeToParcel(charSequence, aVar.e, 0);
            CharSequence charSequence2 = remoteActionCompat.c;
            versionedParcel.b(3);
            TextUtils.writeToParcel(charSequence2, aVar.e, 0);
            versionedParcel.b((Parcelable) remoteActionCompat.d, 4);
            boolean z = remoteActionCompat.e;
            versionedParcel.b(5);
            aVar.e.writeInt(z ? 1 : 0);
            boolean z2 = remoteActionCompat.f209f;
            versionedParcel.b(6);
            aVar.e.writeInt(z2 ? 1 : 0);
            return;
        }
        throw null;
    }
}
