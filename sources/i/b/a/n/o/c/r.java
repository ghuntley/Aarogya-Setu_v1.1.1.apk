package i.b.a.n.o.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import i.b.a.n.l.k;
import i.b.a.n.l.m;
import java.io.InputStream;
import java.util.List;

/* compiled from: ImageReader */
public interface r {

    /* compiled from: ImageReader */
    public static final class a implements r {
        public final k a;

        /* renamed from: b  reason: collision with root package name */
        public final i.b.a.n.m.b0.b f2753b;
        public final List<ImageHeaderParser> c;

        public a(InputStream inputStream, List<ImageHeaderParser> list, i.b.a.n.m.b0.b bVar) {
            g.a.a.b.a.a(bVar, "Argument must not be null");
            this.f2753b = bVar;
            g.a.a.b.a.a(list, "Argument must not be null");
            this.c = list;
            this.a = new k(inputStream, bVar);
        }

        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.a.a(), (Rect) null, options);
        }

        public void b() {
            this.a.a.a();
        }

        public int c() {
            return g.a.a.b.a.a(this.c, this.a.a(), this.f2753b);
        }

        public ImageHeaderParser.ImageType a() {
            return g.a.a.b.a.b(this.c, this.a.a(), this.f2753b);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    ImageHeaderParser.ImageType a();

    void b();

    int c();

    /* compiled from: ImageReader */
    public static final class b implements r {
        public final i.b.a.n.m.b0.b a;

        /* renamed from: b  reason: collision with root package name */
        public final List<ImageHeaderParser> f2754b;
        public final m c;

        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, i.b.a.n.m.b0.b bVar) {
            g.a.a.b.a.a(bVar, "Argument must not be null");
            this.a = bVar;
            g.a.a.b.a.a(list, "Argument must not be null");
            this.f2754b = list;
            this.c = new m(parcelFileDescriptor);
        }

        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), (Rect) null, options);
        }

        public void b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0040 A[SYNTHETIC, Splitter:B:19:0x0040] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int c() {
            /*
                r11 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r11.f2754b
                i.b.a.n.l.m r1 = r11.c
                i.b.a.n.m.b0.b r2 = r11.a
                int r3 = r0.size()
                r4 = 0
            L_0x000b:
                r5 = -1
                if (r4 >= r3) goto L_0x0047
                java.lang.Object r6 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r6 = (com.bumptech.glide.load.ImageHeaderParser) r6
                r7 = 0
                i.b.a.n.o.c.v r8 = new i.b.a.n.o.c.v     // Catch:{ all -> 0x003d }
                java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ all -> 0x003d }
                android.os.ParcelFileDescriptor r10 = r1.a()     // Catch:{ all -> 0x003d }
                java.io.FileDescriptor r10 = r10.getFileDescriptor()     // Catch:{ all -> 0x003d }
                r9.<init>(r10)     // Catch:{ all -> 0x003d }
                r8.<init>(r9, r2)     // Catch:{ all -> 0x003d }
                int r6 = r6.a(r8, r2)     // Catch:{ all -> 0x003a }
                r8.close()     // Catch:{ IOException -> 0x002f }
                goto L_0x0030
            L_0x002f:
            L_0x0030:
                r1.a()
                if (r6 == r5) goto L_0x0037
                r5 = r6
                goto L_0x0047
            L_0x0037:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x003a:
                r0 = move-exception
                r7 = r8
                goto L_0x003e
            L_0x003d:
                r0 = move-exception
            L_0x003e:
                if (r7 == 0) goto L_0x0043
                r7.close()     // Catch:{ IOException -> 0x0043 }
            L_0x0043:
                r1.a()
                throw r0
            L_0x0047:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.o.c.r.b.c():int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0040 A[SYNTHETIC, Splitter:B:17:0x0040] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType a() {
            /*
                r10 = this;
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r10.f2754b
                i.b.a.n.l.m r1 = r10.c
                i.b.a.n.m.b0.b r2 = r10.a
                int r3 = r0.size()
                r4 = 0
            L_0x000b:
                if (r4 >= r3) goto L_0x0047
                java.lang.Object r5 = r0.get(r4)
                com.bumptech.glide.load.ImageHeaderParser r5 = (com.bumptech.glide.load.ImageHeaderParser) r5
                r6 = 0
                i.b.a.n.o.c.v r7 = new i.b.a.n.o.c.v     // Catch:{ all -> 0x003d }
                java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x003d }
                android.os.ParcelFileDescriptor r9 = r1.a()     // Catch:{ all -> 0x003d }
                java.io.FileDescriptor r9 = r9.getFileDescriptor()     // Catch:{ all -> 0x003d }
                r8.<init>(r9)     // Catch:{ all -> 0x003d }
                r7.<init>(r8, r2)     // Catch:{ all -> 0x003d }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.a((java.io.InputStream) r7)     // Catch:{ all -> 0x003a }
                r7.close()     // Catch:{ IOException -> 0x002e }
                goto L_0x002f
            L_0x002e:
            L_0x002f:
                r1.a()
                com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
                if (r5 == r6) goto L_0x0037
                goto L_0x0049
            L_0x0037:
                int r4 = r4 + 1
                goto L_0x000b
            L_0x003a:
                r0 = move-exception
                r6 = r7
                goto L_0x003e
            L_0x003d:
                r0 = move-exception
            L_0x003e:
                if (r6 == 0) goto L_0x0043
                r6.close()     // Catch:{ IOException -> 0x0043 }
            L_0x0043:
                r1.a()
                throw r0
            L_0x0047:
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            L_0x0049:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.o.c.r.b.a():com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }
}
