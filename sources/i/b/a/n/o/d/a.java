package i.b.a.n.o.d;

import i.b.a.n.l.e;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder */
public class a implements e<ByteBuffer> {
    public final ByteBuffer a;

    public a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public Object a() {
        this.a.position(0);
        return this.a;
    }

    public void b() {
    }

    /* renamed from: i.b.a.n.o.d.a$a  reason: collision with other inner class name */
    /* compiled from: ByteBufferRewinder */
    public static class C0095a implements e.a<ByteBuffer> {
        public e a(Object obj) {
            return new a((ByteBuffer) obj);
        }

        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }
    }
}
