package o.o0.h;

import o.j0;
import o.p;
import o.q;
import o.x;
import o.y;
import p.i;

/* compiled from: HttpHeaders */
public final class e {
    static {
        i.d("\"\\");
        i.d("\t ,=");
    }

    public static long a(j0 j0Var) {
        String a = j0Var.f5329j.a("Content-Length");
        if (a == null) {
            return -1;
        }
        try {
            return Long.parseLong(a);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean b(j0 j0Var) {
        if (j0Var.e.f5307b.equals("HEAD")) {
            return false;
        }
        int i2 = j0Var.f5326g;
        if (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && a(j0Var) == -1) {
            String a = j0Var.f5329j.a("Transfer-Encoding");
            if (a == null) {
                a = null;
            }
            if ("chunked".equalsIgnoreCase(a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void a(q qVar, y yVar, x xVar) {
        if (qVar != q.a && !p.a(yVar, xVar).isEmpty() && ((q.a) qVar) == null) {
            throw null;
        }
    }

    public static int a(String str, int i2, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }

    public static int a(String str, int i2) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }
}
