package i.c.a.b.g.g;

import android.util.Log;
import i.a.a.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class s1 extends o1<Double> {
    public s1(u1 u1Var, String str, Double d) {
        super(u1Var, str, d, (q1) null);
    }

    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a = super.a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + a.a(a, 27));
        sb.append("Invalid double value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
