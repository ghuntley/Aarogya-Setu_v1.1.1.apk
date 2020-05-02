package i.b.a.n.o.h;

import android.graphics.Bitmap;
import i.b.a.n.g;
import i.b.a.n.m.v;
import i.b.a.n.o.d.b;
import java.io.ByteArrayOutputStream;

/* compiled from: BitmapBytesTranscoder */
public class a implements e<Bitmap, byte[]> {
    public final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b  reason: collision with root package name */
    public final int f2798b = 100;

    public v<byte[]> a(v<Bitmap> vVar, g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.a, this.f2798b, byteArrayOutputStream);
        vVar.d();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
