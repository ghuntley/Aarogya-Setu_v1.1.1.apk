package i.c.a.a.j;

import i.a.a.a.a;
import i.c.a.a.b;
import java.util.Arrays;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class e {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2946b;

    public e(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.a = bVar;
            this.f2946b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.a.equals(eVar.a)) {
            return false;
        }
        return Arrays.equals(this.f2946b, eVar.f2946b);
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2946b);
    }

    public String toString() {
        StringBuilder a2 = a.a("EncodedPayload{encoding=");
        a2.append(this.a);
        a2.append(", bytes=[...]}");
        return a2.toString();
    }
}
