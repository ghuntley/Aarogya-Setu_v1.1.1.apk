package b.a.a.l;

import android.content.Context;
import i.b.a.c;
import i.b.a.g;
import i.b.a.i;
import i.b.a.j;
import i.b.a.n.e;
import i.b.a.n.f;
import i.b.a.n.m.k;
import i.b.a.r.a;
import i.b.a.r.d;
import java.util.ArrayList;

/* compiled from: GlideRequest */
public class z<TranscodeType> extends i<TranscodeType> implements Cloneable {
    public z(c cVar, j jVar, Class<TranscodeType> cls, Context context) {
        super(cVar, jVar, cls, context);
    }

    public a a(k kVar) {
        return (z) super.a(kVar);
    }

    public a b(boolean z) {
        return (z) super.b(z);
    }

    public a d() {
        return (z) super.d();
    }

    public a e() {
        return (z) super.e();
    }

    public a g() {
        return (z) super.g();
    }

    public a a(g gVar) {
        return (z) super.a(gVar);
    }

    public a a(boolean z) {
        return (z) super.a(z);
    }

    public i a(d dVar) {
        if (dVar != null) {
            if (this.K == null) {
                this.K = new ArrayList();
            }
            this.K.add(dVar);
        }
        return this;
    }

    public z<TranscodeType> clone() {
        return (z) super.clone();
    }

    public a a(int i2, int i3) {
        return (z) super.a(i2, i3);
    }

    public a a(e eVar) {
        return (z) super.a(eVar);
    }

    public a a(f fVar, Object obj) {
        return (z) super.a(fVar, obj);
    }

    public a a(Class cls) {
        return (z) super.a((Class<?>) cls);
    }

    public a a(i.b.a.n.o.c.k kVar) {
        return (z) super.a(kVar);
    }

    public i a(Object obj) {
        this.J = obj;
        this.M = true;
        return this;
    }

    public i a(a aVar) {
        return (z) super.a((a<?>) aVar);
    }

    /* renamed from: a  reason: collision with other method in class */
    public a m2a(a aVar) {
        return (z) super.a((a<?>) aVar);
    }

    public i a(Integer num) {
        return (z) super.a(num);
    }
}
