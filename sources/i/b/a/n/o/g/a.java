package i.b.a.n.o.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import i.b.a.m.c;
import i.b.a.m.e;
import i.b.a.n.g;
import i.b.a.n.i;
import i.b.a.n.m.b0.d;
import i.b.a.n.m.v;
import i.b.a.t.f;
import i.b.a.t.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/* compiled from: ByteBufferGifDecoder */
public class a implements i<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0096a f2765f = new C0096a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f2766g = new b();
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f2767b;
    public final b c;
    public final C0096a d;
    public final b e;

    /* renamed from: i.b.a.n.o.g.a$a  reason: collision with other inner class name */
    /* compiled from: ByteBufferGifDecoder */
    public static class C0096a {
    }

    public a(Context context, List<ImageHeaderParser> list, d dVar, i.b.a.n.m.b0.b bVar) {
        b bVar2 = f2766g;
        C0096a aVar = f2765f;
        this.a = context.getApplicationContext();
        this.f2767b = list;
        this.d = aVar;
        this.e = new b(dVar, bVar);
        this.c = bVar2;
    }

    public v a(Object obj, int i2, int i3, g gVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        i.b.a.m.d a2 = this.c.a(byteBuffer);
        try {
            return a(byteBuffer, i2, i3, a2, gVar);
        } finally {
            this.c.a(a2);
        }
    }

    /* compiled from: ByteBufferGifDecoder */
    public static class b {
        public final Queue<i.b.a.m.d> a = j.a(0);

        public synchronized void a(i.b.a.m.d dVar) {
            dVar.f2472b = null;
            dVar.c = null;
            this.a.offer(dVar);
        }

        public synchronized i.b.a.m.d a(ByteBuffer byteBuffer) {
            i.b.a.m.d poll;
            poll = this.a.poll();
            if (poll == null) {
                poll = new i.b.a.m.d();
            }
            poll.f2472b = null;
            Arrays.fill(poll.a, (byte) 0);
            poll.c = new c();
            poll.d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            poll.f2472b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            poll.f2472b.order(ByteOrder.LITTLE_ENDIAN);
            return poll;
        }
    }

    public boolean a(Object obj, g gVar) {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) gVar.a(i.f2796b)).booleanValue()) {
            return false;
        }
        List<ImageHeaderParser> list = this.f2767b;
        if (byteBuffer == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
                ImageHeaderParser.ImageType a2 = list.get(i2).a(byteBuffer);
                if (a2 != ImageHeaderParser.ImageType.UNKNOWN) {
                    imageType = a2;
                    break;
                }
                i2++;
            }
        }
        if (imageType == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }

    public static int a(c cVar, int i2, int i3) {
        int i4;
        int min = Math.min(cVar.f2465g / i3, cVar.f2464f / i2);
        if (min == 0) {
            i4 = 0;
        } else {
            i4 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i4);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i2 + "x" + i3 + "], actual dimens: [" + cVar.f2464f + "x" + cVar.f2465g + "]");
        }
        return max;
    }

    public final e a(ByteBuffer byteBuffer, int i2, int i3, i.b.a.m.d dVar, g gVar) {
        Bitmap.Config config;
        long a2 = f.a();
        try {
            c b2 = dVar.b();
            if (b2.c > 0) {
                if (b2.f2463b == 0) {
                    if (gVar.a(i.a) == i.b.a.n.b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    int a3 = a(b2, i2, i3);
                    C0096a aVar = this.d;
                    b bVar = this.e;
                    if (aVar != null) {
                        e eVar = new e(bVar, b2, byteBuffer, a3);
                        eVar.a(config);
                        eVar.d();
                        Bitmap c2 = eVar.c();
                        if (c2 == null) {
                            if (Log.isLoggable("BufferGifDecoder", 2)) {
                                StringBuilder a4 = i.a.a.a.a.a("Decoded GIF from stream in ");
                                a4.append(f.a(a2));
                                Log.v("BufferGifDecoder", a4.toString());
                            }
                            return null;
                        }
                        e eVar2 = new e(new c(this.a, eVar, (i.b.a.n.o.b) i.b.a.n.o.b.f2724b, i2, i3, c2));
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder a5 = i.a.a.a.a.a("Decoded GIF from stream in ");
                            a5.append(f.a(a2));
                            Log.v("BufferGifDecoder", a5.toString());
                        }
                        return eVar2;
                    }
                    throw null;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder a6 = i.a.a.a.a.a("Decoded GIF from stream in ");
                a6.append(f.a(a2));
                Log.v("BufferGifDecoder", a6.toString());
            }
        }
    }
}
