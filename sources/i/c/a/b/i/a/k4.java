package i.c.a.b.i.a;

import android.os.Bundle;
import i.a.a.a.a;
import i.c.a.b.d.l.q;
import i.c.a.b.g.g.e8;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class k4 extends n6 {
    public static final AtomicReference<String[]> c = new AtomicReference<>();
    public static final AtomicReference<String[]> d = new AtomicReference<>();
    public static final AtomicReference<String[]> e = new AtomicReference<>();

    public k4(s5 s5Var) {
        super(s5Var);
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        if (!t()) {
            return str;
        }
        return a(str, o6.f3816b, o6.a, c);
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        if (!t()) {
            return str;
        }
        return a(str, q6.f3846b, q6.a, d);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!t()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return a(str, p6.f3831b, p6.a, e);
        }
        return "experiment_id" + "(" + str + ")";
    }

    public final boolean r() {
        return false;
    }

    public final boolean t() {
        s5 s5Var = this.a;
        oa oaVar = s5Var.f3860f;
        return s5Var.r() && this.a.n().a(3);
    }

    public static String a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        q.a(strArr);
        q.a(strArr2);
        q.a(atomicReference);
        q.a(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (ca.c(str, strArr[i2])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i2] == null) {
                        strArr3[i2] = strArr2[i2] + "(" + strArr[i2] + ")";
                    }
                    str2 = strArr3[i2];
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(m mVar) {
        if (mVar == null) {
            return null;
        }
        if (!t()) {
            return mVar.toString();
        }
        StringBuilder a = a.a("origin=");
        a.append(mVar.f3756g);
        a.append(",name=");
        a.append(a(mVar.e));
        a.append(",params=");
        a.append(a(mVar.f3755f));
        return a.toString();
    }

    public final String a(j jVar) {
        if (jVar == null) {
            return null;
        }
        if (!t()) {
            return jVar.toString();
        }
        StringBuilder a = a.a("Event{appId='");
        a.append(jVar.a);
        a.append("', name='");
        a.append(a(jVar.f3722b));
        a.append("', params=");
        a.append(a(jVar.f3723f));
        a.append("}");
        return a.toString();
    }

    public final String a(l lVar) {
        if (lVar == null) {
            return null;
        }
        if (!t()) {
            return lVar.toString();
        }
        return a(lVar.b());
    }

    public final String a(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!t()) {
            return bundle.toString();
        }
        StringBuilder a = a.a("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (a.length() != 8) {
                a.append(", ");
            }
            a.append(b(str2));
            a.append("=");
            if (!e8.b() || !this.a.f3861g.a(o.a1)) {
                a.append(bundle.get(str2));
            } else {
                Object obj = bundle.get(str2);
                if (obj instanceof Bundle) {
                    str = a(new Object[]{obj});
                } else if (obj instanceof Object[]) {
                    str = a((Object[]) obj);
                } else if (obj instanceof ArrayList) {
                    str = a(((ArrayList) obj).toArray());
                } else {
                    str = String.valueOf(obj);
                }
                a.append(str);
            }
        }
        a.append("}]");
        return a.toString();
    }

    public final String a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder a = a.a("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = a(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (a.length() != 1) {
                    a.append(", ");
                }
                a.append(str);
            }
        }
        a.append("]");
        return a.toString();
    }
}
