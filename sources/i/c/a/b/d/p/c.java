package i.c.a.b.d.p;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public static c f3166b = new c();
    public b a = null;

    public static b b(Context context) {
        return f3166b.a(context);
    }

    public final synchronized b a(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new b(context);
        }
        return this.a;
    }
}
