package o.o0.f;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import o.o0.e;
import p.a0;
import p.b0;
import p.f;
import p.g;
import p.h;

/* compiled from: CacheInterceptor */
public class a implements a0 {
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f5387f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c f5388g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g f5389h;

    public a(b bVar, h hVar, c cVar, g gVar) {
        this.f5387f = hVar;
        this.f5388g = cVar;
        this.f5389h = gVar;
    }

    public long b(f fVar, long j2) {
        try {
            long b2 = this.f5387f.b(fVar, j2);
            if (b2 == -1) {
                if (!this.e) {
                    this.e = true;
                    this.f5389h.close();
                }
                return -1;
            }
            fVar.a(this.f5389h.b(), fVar.f5646f - b2, b2);
            this.f5389h.g();
            return b2;
        } catch (IOException e2) {
            if (!this.e) {
                this.e = true;
                this.f5388g.a();
            }
            throw e2;
        }
    }

    public b0 c() {
        return this.f5387f.c();
    }

    public void close() {
        if (!this.e && !e.a((a0) this, 100, TimeUnit.MILLISECONDS)) {
            this.e = true;
            this.f5388g.a();
        }
        this.f5387f.close();
    }
}
