package i.c.d.d.c;

import android.content.Context;
import i.c.d.d.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public class a {
    public final Map<String, b> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Context f4644b;
    public final i.c.d.e.a.a c;

    public a(Context context, i.c.d.e.a.a aVar) {
        this.f4644b = context;
        this.c = aVar;
    }

    public synchronized b a(String str) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, new b(this.c, str));
        }
        return this.a.get(str);
    }
}
