package i.b.a.n.o.c;

import android.graphics.Bitmap;
import i.b.a.n.e;
import i.b.a.n.m.b0.d;
import java.security.MessageDigest;

/* compiled from: CenterInside */
public class j extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2733b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(e.a);

    public Bitmap a(d dVar, Bitmap bitmap, int i2, int i3) {
        return y.b(dVar, bitmap, i2, i3);
    }

    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    public int hashCode() {
        return -670243078;
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(f2733b);
    }
}
