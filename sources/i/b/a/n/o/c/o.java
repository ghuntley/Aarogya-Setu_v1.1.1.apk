package i.b.a.n.o.c;

import com.bumptech.glide.load.ImageHeaderParser;
import h.k.a.a;
import i.b.a.n.m.b0.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ExifInterfaceImageHeaderParser */
public final class o implements ImageHeaderParser {
    public ImageHeaderParser.ImageType a(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public int a(InputStream inputStream, b bVar) {
        a aVar = new a(inputStream);
        a.b b2 = aVar.b("Orientation");
        int i2 = 1;
        if (b2 != null) {
            try {
                i2 = b2.b(aVar.f1899f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i2 == 0) {
            return -1;
        }
        return i2;
    }
}
