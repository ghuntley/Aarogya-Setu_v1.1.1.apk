package i.b.a.n.o.g;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import g.a.a.b.a;
import i.b.a.n.g;
import i.b.a.n.i;
import i.b.a.n.m.b0.b;
import i.b.a.n.m.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: StreamGifDecoder */
public class j implements i<InputStream, c> {
    public final List<ImageHeaderParser> a;

    /* renamed from: b  reason: collision with root package name */
    public final i<ByteBuffer, c> f2797b;
    public final b c;

    public j(List<ImageHeaderParser> list, i<ByteBuffer, c> iVar, b bVar) {
        this.a = list;
        this.f2797b = iVar;
        this.c = bVar;
    }

    public v a(Object obj, int i2, int i3, g gVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f2797b.a(ByteBuffer.wrap(bArr), i2, i3, gVar);
    }

    public boolean a(Object obj, g gVar) {
        return !((Boolean) gVar.a(i.f2796b)).booleanValue() && a.b(this.a, (InputStream) obj, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}
