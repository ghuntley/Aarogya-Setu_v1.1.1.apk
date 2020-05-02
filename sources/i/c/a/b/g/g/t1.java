package i.c.a.b.g.g;

import android.util.Log;
import i.a.a.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class t1 extends o1<Boolean> {
    public t1(u1 u1Var, String str, Boolean bool) {
        super(u1Var, str, bool, (q1) null);
    }

    public final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (b1.c.matcher(str).matches()) {
                return true;
            }
            if (b1.d.matcher(str).matches()) {
                return false;
            }
        }
        String a = super.a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + a.a(a, 28));
        sb.append("Invalid boolean value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
