package i.c.a.b.g.g;

import android.util.Log;
import i.a.a.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class q1 extends o1<Long> {
    public q1(u1 u1Var, String str, Long l2) {
        super(u1Var, str, l2, (q1) null);
    }

    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a = super.a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + a.a(a, 25));
        sb.append("Invalid long value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
