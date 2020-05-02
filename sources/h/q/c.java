package h.q;

import androidx.media.AudioAttributesCompat;
import java.util.Arrays;

/* compiled from: AudioAttributesImplBase */
public class c implements a {
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2082b = 0;
    public int c = 0;
    public int d = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2082b != cVar.f2082b) {
            return false;
        }
        int i2 = this.c;
        int i3 = cVar.c;
        int i4 = cVar.d;
        if (i4 == -1) {
            i4 = AudioAttributesCompat.a(false, i3, cVar.a);
        }
        if (i4 == 6) {
            i3 |= 4;
        } else if (i4 == 7) {
            i3 |= 1;
        }
        if (i2 == (i3 & 273) && this.a == cVar.a && this.d == cVar.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2082b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.a(this.a));
        sb.append(" content=");
        sb.append(this.f2082b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }
}
