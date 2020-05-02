package i.b.a.n.o.c;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import i.b.a.n.f;
import i.b.a.n.i;
import i.b.a.n.m.v;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: VideoDecoder */
public class a0<T> implements i<T, Bitmap> {
    public static final i.b.a.n.f<Long> d = new i.b.a.n.f<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final i.b.a.n.f<Integer> e = new i.b.a.n.f<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f  reason: collision with root package name */
    public static final e f2726f = new e();
    public final f<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final i.b.a.n.m.b0.d f2727b;
    public final e c;

    /* compiled from: VideoDecoder */
    public class a implements f.b<Long> {
        public final ByteBuffer a = ByteBuffer.allocate(8);

        public void a(byte[] bArr, Long l2, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l2.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder */
    public class b implements f.b<Integer> {
        public final ByteBuffer a = ByteBuffer.allocate(4);

        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.a) {
                    this.a.position(0);
                    messageDigest.update(this.a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* compiled from: VideoDecoder */
    public static final class c implements f<AssetFileDescriptor> {
        public /* synthetic */ c(a aVar) {
        }

        public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* compiled from: VideoDecoder */
    public static final class d implements f<ByteBuffer> {
        public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(new b0(this, (ByteBuffer) obj));
        }
    }

    /* compiled from: VideoDecoder */
    public static class e {
    }

    /* compiled from: VideoDecoder */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* compiled from: VideoDecoder */
    public static final class g implements f<ParcelFileDescriptor> {
        public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        }
    }

    public a0(i.b.a.n.m.b0.d dVar, f<T> fVar) {
        e eVar = f2726f;
        this.f2727b = dVar;
        this.a = fVar;
        this.c = eVar;
    }

    public v<Bitmap> a(T t, int i2, int i3, i.b.a.n.g gVar) {
        long longValue = ((Long) gVar.a(d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) gVar.a(e);
            if (num == null) {
                num = 2;
            }
            k kVar = (k) gVar.a(k.f2735f);
            if (kVar == null) {
                kVar = k.e;
            }
            k kVar2 = kVar;
            if (this.c != null) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    this.a.a(mediaMetadataRetriever, t);
                    Bitmap a2 = a(mediaMetadataRetriever, longValue, num.intValue(), i2, i3, kVar2);
                    mediaMetadataRetriever.release();
                    return e.a(a2, this.f2727b);
                } catch (RuntimeException e2) {
                    throw new IOException(e2);
                } catch (Throwable th) {
                    mediaMetadataRetriever.release();
                    throw th;
                }
            } else {
                throw null;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    public boolean a(T t, i.b.a.n.g gVar) {
        return true;
    }

    public static Bitmap a(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, k kVar) {
        MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
        int i5 = i3;
        int i6 = i4;
        k kVar2 = kVar;
        Bitmap bitmap = null;
        if (!(Build.VERSION.SDK_INT < 27 || i5 == Integer.MIN_VALUE || i6 == Integer.MIN_VALUE || kVar2 == k.d)) {
            try {
                int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (parseInt3 == 90 || parseInt3 == 270) {
                    int i7 = parseInt2;
                    parseInt2 = parseInt;
                    parseInt = i7;
                }
                float b2 = kVar2.b(parseInt, parseInt2, i3, i4);
                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j2, i2, Math.round(((float) parseInt) * b2), Math.round(b2 * ((float) parseInt2)));
            } catch (Throwable th) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
                }
            }
        }
        return bitmap == null ? mediaMetadataRetriever.getFrameAtTime(j2, i2) : bitmap;
    }
}
