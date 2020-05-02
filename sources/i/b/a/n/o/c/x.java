package i.b.a.n.o.c;

import android.graphics.Bitmap;
import i.b.a.n.g;
import i.b.a.n.i;
import i.b.a.n.m.b0.b;
import i.b.a.n.m.v;
import i.b.a.n.o.c.l;
import i.b.a.t.d;
import i.b.a.t.h;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamBitmapDecoder */
public class x implements i<InputStream, Bitmap> {
    public final l a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2762b;

    /* compiled from: StreamBitmapDecoder */
    public static class a implements l.b {
        public final v a;

        /* renamed from: b  reason: collision with root package name */
        public final d f2763b;

        public a(v vVar, d dVar) {
            this.a = vVar;
            this.f2763b = dVar;
        }

        public void a() {
            this.a.a();
        }

        public void a(i.b.a.n.m.b0.d dVar, Bitmap bitmap) {
            IOException iOException = this.f2763b.f2866f;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.a(bitmap);
                }
                throw iOException;
            }
        }
    }

    public x(l lVar, b bVar) {
        this.a = lVar;
        this.f2762b = bVar;
    }

    public v a(Object obj, int i2, int i3, g gVar) {
        v vVar;
        boolean z;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof v) {
            vVar = (v) inputStream;
            z = false;
        } else {
            vVar = new v(inputStream, this.f2762b);
            z = true;
        }
        d a2 = d.a(vVar);
        try {
            return this.a.a((InputStream) new h(a2), i2, i3, gVar, (l.b) new a(vVar, a2));
        } finally {
            a2.a();
            if (z) {
                vVar.f();
            }
        }
    }

    public boolean a(Object obj, g gVar) {
        InputStream inputStream = (InputStream) obj;
        if (this.a != null) {
            return true;
        }
        throw null;
    }
}
