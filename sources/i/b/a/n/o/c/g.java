package i.b.a.n.o.c;

import android.graphics.Bitmap;
import i.b.a.n.i;
import i.b.a.n.m.v;
import i.b.a.t.a;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapDecoder */
public class g implements i<ByteBuffer, Bitmap> {
    public final l a;

    public g(l lVar) {
        this.a = lVar;
    }

    public v a(Object obj, int i2, int i3, i.b.a.n.g gVar) {
        return this.a.a(a.b((ByteBuffer) obj), i2, i3, gVar, l.f2744k);
    }

    public boolean a(Object obj, i.b.a.n.g gVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (this.a != null) {
            return true;
        }
        throw null;
    }
}
