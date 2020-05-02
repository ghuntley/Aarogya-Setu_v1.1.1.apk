package i.c.a.a.j.p;

import i.c.a.a.j.f;
import java.util.Arrays;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class a extends f {
    public final Iterable<f> a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2951b;

    public /* synthetic */ a(Iterable iterable, byte[] bArr, C0104a aVar) {
        this.a = iterable;
        this.f2951b = bArr;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        a aVar = (a) fVar;
        if (this.a.equals(aVar.a)) {
            byte[] bArr2 = this.f2951b;
            if (fVar instanceof a) {
                bArr = aVar.f2951b;
            } else {
                bArr = aVar.f2951b;
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2951b);
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("BackendRequest{events=");
        a2.append(this.a);
        a2.append(", extras=");
        a2.append(Arrays.toString(this.f2951b));
        a2.append("}");
        return a2.toString();
    }
}
