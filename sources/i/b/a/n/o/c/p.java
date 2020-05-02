package i.b.a.n.o.c;

import android.graphics.Bitmap;
import i.b.a.n.e;
import i.b.a.n.m.b0.d;
import java.security.MessageDigest;

/* compiled from: FitCenter */
public class p extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2749b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(e.a);

    public Bitmap a(d dVar, Bitmap bitmap, int i2, int i3) {
        return y.c(dVar, bitmap, i2, i3);
    }

    public boolean equals(Object obj) {
        return obj instanceof p;
    }

    public int hashCode() {
        return 1572326941;
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(f2749b);
    }
}
