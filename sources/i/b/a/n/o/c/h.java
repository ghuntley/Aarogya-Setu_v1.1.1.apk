package i.b.a.n.o.c;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import i.b.a.n.g;
import i.b.a.n.i;
import i.b.a.n.m.v;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder */
public final class h implements i<ByteBuffer, Bitmap> {
    public final d a = new d();

    public v a(Object obj, int i2, int i3, g gVar) {
        return this.a.a(ImageDecoder.createSource((ByteBuffer) obj), i2, i3, gVar);
    }

    public boolean a(Object obj, g gVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }
}
