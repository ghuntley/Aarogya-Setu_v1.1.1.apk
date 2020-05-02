package i.c.a.b.d.l;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class j {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3132b;

    public j(String str, String str2) {
        q.a(str, (Object) "log tag cannot be null");
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.a = str;
            if (str2 == null || str2.length() <= 0) {
                this.f3132b = null;
            } else {
                this.f3132b = str2;
            }
        } else {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
    }

    public final boolean a(int i2) {
        return Log.isLoggable(this.a, i2);
    }
}
