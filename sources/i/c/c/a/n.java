package i.c.c.a;

import i.c.c.a.z.p2;
import i.c.c.a.z.y1;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PrimitiveSet */
public final class n<P> {
    public static final Charset c = Charset.forName("UTF-8");
    public ConcurrentMap<String, List<a<P>>> a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public a<P> f4367b;

    /* compiled from: PrimitiveSet */
    public static final class a<P> {
        public final P a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f4368b;

        public a(P p2, byte[] bArr, y1 y1Var, p2 p2Var) {
            this.a = p2;
            this.f4368b = Arrays.copyOf(bArr, bArr.length);
        }

        public final byte[] a() {
            byte[] bArr = this.f4368b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public List<a<P>> a(byte[] bArr) {
        List<a<P>> list = (List) this.a.get(new String(bArr, c));
        return list != null ? list : Collections.emptyList();
    }
}
