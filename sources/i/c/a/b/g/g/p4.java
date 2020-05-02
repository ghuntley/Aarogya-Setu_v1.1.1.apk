package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class p4 extends o4 {
    public /* synthetic */ p4(n4 n4Var) {
        super((n4) null);
    }

    public static <E> d4<E> b(Object obj, long j2) {
        return (d4) l6.f(obj, j2);
    }

    public final void a(Object obj, long j2) {
        b(obj, j2).l();
    }

    public final <E> void a(Object obj, Object obj2, long j2) {
        d4 b2 = b(obj, j2);
        d4 b3 = b(obj2, j2);
        int size = b2.size();
        int size2 = b3.size();
        if (size > 0 && size2 > 0) {
            if (!b2.a()) {
                b2 = b2.a(size2 + size);
            }
            b2.addAll(b3);
        }
        if (size > 0) {
            b3 = b2;
        }
        l6.a(obj, j2, (Object) b3);
    }
}
