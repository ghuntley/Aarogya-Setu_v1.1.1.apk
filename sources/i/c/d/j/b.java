package i.c.d.j;

import android.content.Context;
import i.c.d.j.c;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public class b implements c {
    public d a;

    public b(Context context) {
        this.a = d.a(context);
    }

    public c.a a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean a2 = this.a.a(str, currentTimeMillis);
        boolean a3 = this.a.a(currentTimeMillis);
        if (a2 && a3) {
            return c.a.COMBINED;
        }
        if (a3) {
            return c.a.GLOBAL;
        }
        if (a2) {
            return c.a.SDK;
        }
        return c.a.NONE;
    }
}
