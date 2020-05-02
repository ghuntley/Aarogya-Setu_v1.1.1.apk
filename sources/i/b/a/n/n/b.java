package i.b.a.n.n;

import i.b.a.n.g;
import i.b.a.n.l.d;
import i.b.a.n.n.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader */
public class b<Data> implements n<byte[], Data> {
    public final C0090b<Data> a;

    /* compiled from: ByteArrayLoader */
    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: i.b.a.n.n.b$a$a  reason: collision with other inner class name */
        /* compiled from: ByteArrayLoader */
        public class C0089a implements C0090b<ByteBuffer> {
            public C0089a(a aVar) {
            }

            public Object a(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }

            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }
        }

        public n<byte[], ByteBuffer> a(r rVar) {
            return new b(new C0089a(this));
        }
    }

    /* renamed from: i.b.a.n.n.b$b  reason: collision with other inner class name */
    /* compiled from: ByteArrayLoader */
    public interface C0090b<Data> {
        Class<Data> a();

        Data a(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader */
    public static class d implements o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader */
        public class a implements C0090b<InputStream> {
            public a(d dVar) {
            }

            public Object a(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }
        }

        public n<byte[], InputStream> a(r rVar) {
            return new b(new a(this));
        }
    }

    public b(C0090b<Data> bVar) {
        this.a = bVar;
    }

    public n.a a(Object obj, int i2, int i3, g gVar) {
        byte[] bArr = (byte[]) obj;
        return new n.a(new i.b.a.s.d(bArr), new c(bArr, this.a));
    }

    /* compiled from: ByteArrayLoader */
    public static class c<Data> implements i.b.a.n.l.d<Data> {
        public final byte[] e;

        /* renamed from: f  reason: collision with root package name */
        public final C0090b<Data> f2678f;

        public c(byte[] bArr, C0090b<Data> bVar) {
            this.e = bArr;
            this.f2678f = bVar;
        }

        public void a(i.b.a.g gVar, d.a<? super Data> aVar) {
            aVar.a(this.f2678f.a(this.e));
        }

        public void b() {
        }

        public i.b.a.n.a c() {
            return i.b.a.n.a.LOCAL;
        }

        public void cancel() {
        }

        public Class<Data> a() {
            return this.f2678f.a();
        }
    }

    public boolean a(Object obj) {
        byte[] bArr = (byte[]) obj;
        return true;
    }
}
