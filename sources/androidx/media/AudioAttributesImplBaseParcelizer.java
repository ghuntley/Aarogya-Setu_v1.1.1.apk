package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
import h.q.c;

public final class AudioAttributesImplBaseParcelizer {
    public static c read(VersionedParcel versionedParcel) {
        c cVar = new c();
        cVar.a = versionedParcel.a(cVar.a, 1);
        cVar.f2082b = versionedParcel.a(cVar.f2082b, 2);
        cVar.c = versionedParcel.a(cVar.c, 3);
        cVar.d = versionedParcel.a(cVar.d, 4);
        return cVar;
    }

    public static void write(c cVar, VersionedParcel versionedParcel) {
        if (versionedParcel != null) {
            versionedParcel.b(cVar.a, 1);
            versionedParcel.b(cVar.f2082b, 2);
            versionedParcel.b(cVar.c, 3);
            versionedParcel.b(cVar.d, 4);
            return;
        }
        throw null;
    }
}
