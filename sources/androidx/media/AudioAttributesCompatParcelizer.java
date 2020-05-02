package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
import h.q.a;
import h.y.b;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.a;
        if (versionedParcel.a(1)) {
            obj = versionedParcel.c();
        }
        audioAttributesCompat.a = (a) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        if (versionedParcel != null) {
            a aVar = audioAttributesCompat.a;
            versionedParcel.b(1);
            versionedParcel.a((b) aVar);
            return;
        }
        throw null;
    }
}
