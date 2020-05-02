package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import h.q.b;

public final class AudioAttributesImplApi21Parcelizer {
    public static b read(VersionedParcel versionedParcel) {
        b bVar = new b();
        bVar.a = (AudioAttributes) versionedParcel.a(bVar.a, 1);
        bVar.f2081b = versionedParcel.a(bVar.f2081b, 2);
        return bVar;
    }

    public static void write(b bVar, VersionedParcel versionedParcel) {
        if (versionedParcel != null) {
            versionedParcel.b((Parcelable) bVar.a, 1);
            versionedParcel.b(bVar.f2081b, 2);
            return;
        }
        throw null;
    }
}
