package i.c.a.a.i.b;

import i.a.a.a.a;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class i extends s {
    public final long a;

    public i(long j2) {
        this.a = j2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s) || this.a != ((i) ((s) obj)).a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j2 = this.a;
        return 1000003 ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder a2 = a.a("LogResponse{nextRequestWaitMillis=");
        a2.append(this.a);
        a2.append("}");
        return a2.toString();
    }
}
