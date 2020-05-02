package i.b.a.n.o.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import i.b.a.n.g;
import i.b.a.n.i;
import i.b.a.n.m.v;
import i.b.a.t.a;
import java.io.InputStream;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder */
public final class s implements i<InputStream, Bitmap> {
    public final d a = new d();

    public v a(Object obj, int i2, int i3, g gVar) {
        return this.a.a(ImageDecoder.createSource(a.a((InputStream) obj)), i2, i3, gVar);
    }

    public boolean a(Object obj, g gVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}
