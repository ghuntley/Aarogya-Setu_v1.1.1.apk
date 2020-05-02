package i.c.d.o;

import android.graphics.Bitmap;
import android.util.Log;
import i.c.a.b.l.g;
import java.io.Closeable;
import java.io.InputStream;
import java.net.URL;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final class o implements Closeable {
    public final URL e;

    /* renamed from: f  reason: collision with root package name */
    public g<Bitmap> f4767f;

    /* renamed from: g  reason: collision with root package name */
    public volatile InputStream f4768g;

    public o(URL url) {
        this.e = url;
    }

    public final void close() {
        try {
            i.c.a.b.g.e.g.a(this.f4768g);
        } catch (NullPointerException e2) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e2);
        }
    }
}
