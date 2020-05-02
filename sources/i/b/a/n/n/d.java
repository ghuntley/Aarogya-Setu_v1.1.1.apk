package i.b.a.n.n;

import android.util.Log;
import i.b.a.n.g;
import i.b.a.n.l.d;
import i.b.a.n.n.n;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferFileLoader */
public class d implements n<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader */
    public static class b implements o<File, ByteBuffer> {
        public n<File, ByteBuffer> a(r rVar) {
            return new d();
        }
    }

    public n.a a(Object obj, int i2, int i3, g gVar) {
        File file = (File) obj;
        return new n.a(new i.b.a.s.d(file), new a(file));
    }

    public boolean a(Object obj) {
        File file = (File) obj;
        return true;
    }

    /* compiled from: ByteBufferFileLoader */
    public static final class a implements i.b.a.n.l.d<ByteBuffer> {
        public final File e;

        public a(File file) {
            this.e = file;
        }

        public void a(i.b.a.g gVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.a(i.b.a.t.a.a(this.e));
            } catch (IOException e2) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                }
                aVar.a((Exception) e2);
            }
        }

        public void b() {
        }

        public i.b.a.n.a c() {
            return i.b.a.n.a.LOCAL;
        }

        public void cancel() {
        }

        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }
    }
}
