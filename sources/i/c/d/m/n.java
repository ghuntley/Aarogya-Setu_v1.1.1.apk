package i.c.d.m;

import android.text.TextUtils;
import i.c.d.m.o.a;
import i.c.d.m.o.d;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public class n {
    public static final long a = TimeUnit.HOURS.toSeconds(1);

    public boolean a(d dVar) {
        if (TextUtils.isEmpty(((a) dVar).c)) {
            return true;
        }
        a aVar = (a) dVar;
        if (aVar.f4734f + aVar.e < a() + a) {
            return true;
        }
        return false;
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }
}
