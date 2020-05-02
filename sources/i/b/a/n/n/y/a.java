package i.b.a.n.n.y;

import i.b.a.n.f;
import i.b.a.n.l.j;
import i.b.a.n.n.g;
import i.b.a.n.n.m;
import i.b.a.n.n.n;
import i.b.a.n.n.o;
import i.b.a.n.n.r;
import java.io.InputStream;

/* compiled from: HttpGlideUrlLoader */
public class a implements n<g, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final f<Integer> f2707b = f.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    public final m<g, g> a;

    /* renamed from: i.b.a.n.n.y.a$a  reason: collision with other inner class name */
    /* compiled from: HttpGlideUrlLoader */
    public static class C0092a implements o<g, InputStream> {
        public final m<g, g> a = new m<>(500);

        public n<g, InputStream> a(r rVar) {
            return new a(this.a);
        }
    }

    public a(m<g, g> mVar) {
        this.a = mVar;
    }

    public n.a a(Object obj, int i2, int i3, i.b.a.n.g gVar) {
        g gVar2 = (g) obj;
        m<g, g> mVar = this.a;
        if (mVar != null) {
            m.b a2 = m.b.a(gVar2, 0, 0);
            B a3 = mVar.a.a(a2);
            a2.a();
            g gVar3 = (g) a3;
            if (gVar3 == null) {
                m<g, g> mVar2 = this.a;
                if (mVar2 != null) {
                    mVar2.a.b(m.b.a(gVar2, 0, 0), gVar2);
                } else {
                    throw null;
                }
            } else {
                gVar2 = gVar3;
            }
        }
        return new n.a(gVar2, new j(gVar2, ((Integer) gVar.a(f2707b)).intValue()));
    }

    public boolean a(Object obj) {
        g gVar = (g) obj;
        return true;
    }
}
