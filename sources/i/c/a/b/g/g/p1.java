package i.c.a.b.g.g;

import android.net.Uri;
import h.e.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class p1 {
    public static final a<String, Uri> a = new a<>();

    public static synchronized Uri a(String str) {
        Uri orDefault;
        synchronized (p1.class) {
            orDefault = a.getOrDefault(str, null);
            if (orDefault == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                orDefault = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                a.put(str, orDefault);
            }
        }
        return orDefault;
    }
}
