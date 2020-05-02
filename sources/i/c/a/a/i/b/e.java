package i.c.a.a.i.b;

import i.a.a.a.a;
import java.util.List;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class e extends k {
    public final List<q> a;

    public e(List<q> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return this.a.equals(((e) ((k) obj)).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder a2 = a.a("BatchedLogRequest{logRequests=");
        a2.append(this.a);
        a2.append("}");
        return a2.toString();
    }
}
