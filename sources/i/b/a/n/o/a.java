package i.b.a.n.o;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import i.b.a.n.b;
import i.b.a.n.g;
import i.b.a.n.h;
import i.b.a.n.i;
import i.b.a.n.m.v;
import i.b.a.n.o.c.d;
import i.b.a.n.o.c.e;
import i.b.a.n.o.c.k;
import i.b.a.n.o.c.l;
import i.b.a.n.o.c.q;

/* compiled from: ImageDecoderResourceDecoder */
public abstract class a<T> implements i<ImageDecoder.Source, T> {
    public final q a = q.b();

    /* renamed from: i.b.a.n.o.a$a  reason: collision with other inner class name */
    /* compiled from: ImageDecoderResourceDecoder */
    public class C0093a implements ImageDecoder.OnHeaderDecodedListener {
        public final /* synthetic */ int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f2721b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ b d;
        public final /* synthetic */ k e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h f2722f;

        /* renamed from: i.b.a.n.o.a$a$a  reason: collision with other inner class name */
        /* compiled from: ImageDecoderResourceDecoder */
        public class C0094a implements ImageDecoder.OnPartialImageListener {
            public C0094a(C0093a aVar) {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        public C0093a(int i2, int i3, boolean z, b bVar, k kVar, h hVar) {
            this.a = i2;
            this.f2721b = i3;
            this.c = z;
            this.d = bVar;
            this.e = kVar;
            this.f2722f = hVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            boolean z = false;
            if (a.this.a.a(this.a, this.f2721b, this.c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.d == b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0094a(this));
            Size size = imageInfo.getSize();
            int i2 = this.a;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getWidth();
            }
            int i3 = this.f2721b;
            if (i3 == Integer.MIN_VALUE) {
                i3 = size.getHeight();
            }
            float b2 = this.e.b(size.getWidth(), size.getHeight(), i2, i3);
            int round = Math.round(((float) size.getWidth()) * b2);
            int round2 = Math.round(((float) size.getHeight()) * b2);
            if (Log.isLoggable("ImageDecoder", 2)) {
                StringBuilder a2 = i.a.a.a.a.a("Resizing from [");
                a2.append(size.getWidth());
                a2.append("x");
                a2.append(size.getHeight());
                a2.append("] to [");
                a2.append(round);
                a2.append("x");
                a2.append(round2);
                a2.append("] scaleFactor: ");
                a2.append(b2);
                Log.v("ImageDecoder", a2.toString());
            }
            imageDecoder.setTargetSize(round, round2);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                if (this.f2722f == h.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i4 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }

    public boolean a(Object obj, g gVar) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    public final v<T> a(ImageDecoder.Source source, int i2, int i3, g gVar) {
        d dVar = (d) this;
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new C0093a(i2, i3, gVar.a(l.f2742i) != null && ((Boolean) gVar.a(l.f2742i)).booleanValue(), (b) gVar.a(l.f2739f), (k) gVar.a(k.f2735f), (h) gVar.a(l.f2740g)));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder a2 = i.a.a.a.a.a("Decoded [");
            a2.append(decodeBitmap.getWidth());
            a2.append("x");
            a2.append(decodeBitmap.getHeight());
            a2.append("] for [");
            a2.append(i2);
            a2.append("x");
            a2.append(i3);
            a2.append("]");
            Log.v("BitmapImageDecoder", a2.toString());
        }
        return new e(decodeBitmap, dVar.f2730b);
    }
}
