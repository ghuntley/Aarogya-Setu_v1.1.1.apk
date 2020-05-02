package h.q;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import i.a.a.a.a;

@TargetApi(21)
/* compiled from: AudioAttributesImplApi21 */
public class b implements a {
    public AudioAttributes a;

    /* renamed from: b  reason: collision with root package name */
    public int f2081b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.a.equals(((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder a2 = a.a("AudioAttributesCompat: audioattributes=");
        a2.append(this.a);
        return a2.toString();
    }
}
