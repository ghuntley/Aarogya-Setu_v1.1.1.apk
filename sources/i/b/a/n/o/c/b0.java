package i.b.a.n.o.c;

import android.media.MediaDataSource;
import i.b.a.n.o.c.a0;
import java.nio.ByteBuffer;

/* compiled from: VideoDecoder */
public class b0 extends MediaDataSource {
    public final /* synthetic */ ByteBuffer e;

    public b0(a0.d dVar, ByteBuffer byteBuffer) {
        this.e = byteBuffer;
    }

    public void close() {
    }

    public long getSize() {
        return (long) this.e.limit();
    }

    public int readAt(long j2, byte[] bArr, int i2, int i3) {
        if (j2 >= ((long) this.e.limit())) {
            return -1;
        }
        this.e.position((int) j2);
        int min = Math.min(i3, this.e.remaining());
        this.e.get(bArr, i2, min);
        return min;
    }
}
