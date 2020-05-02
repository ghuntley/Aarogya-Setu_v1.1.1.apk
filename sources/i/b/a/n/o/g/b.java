package i.b.a.n.o.g;

import i.b.a.m.a;
import i.b.a.n.m.b0.d;

/* compiled from: GifBitmapProvider */
public final class b implements a.C0079a {
    public final d a;

    /* renamed from: b  reason: collision with root package name */
    public final i.b.a.n.m.b0.b f2768b;

    public b(d dVar, i.b.a.n.m.b0.b bVar) {
        this.a = dVar;
        this.f2768b = bVar;
    }

    public byte[] a(int i2) {
        i.b.a.n.m.b0.b bVar = this.f2768b;
        if (bVar == null) {
            return new byte[i2];
        }
        return (byte[]) bVar.b(i2, byte[].class);
    }
}
