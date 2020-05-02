package o.o0.j;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.c0;
import o.d0;
import o.f0;
import o.j0;
import o.o0.e;
import o.o0.g.f;
import o.o0.h.c;
import o.o0.h.i;
import o.o0.j.l;
import o.x;
import o.z;
import p.a0;

/* compiled from: Http2ExchangeCodec */
public final class j implements c {

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f5553g = e.a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f5554h = e.a((T[]) new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final z.a a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5555b;
    public final e c;
    public volatile l d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f5556f;

    public j(c0 c0Var, f fVar, z.a aVar, e eVar) {
        d0 d0Var;
        this.f5555b = fVar;
        this.a = aVar;
        this.c = eVar;
        if (c0Var.f5262g.contains(d0.H2_PRIOR_KNOWLEDGE)) {
            d0Var = d0.H2_PRIOR_KNOWLEDGE;
        } else {
            d0Var = d0.HTTP_2;
        }
        this.e = d0Var;
    }

    public p.z a(f0 f0Var, long j2) {
        return this.d.c();
    }

    public void b() {
        this.c.z.flush();
    }

    public f c() {
        return this.f5555b;
    }

    public void cancel() {
        this.f5556f = true;
        if (this.d != null) {
            this.d.a(a.CANCEL);
        }
    }

    public void a(f0 f0Var) {
        if (this.d == null) {
            boolean z = f0Var.d != null;
            x xVar = f0Var.c;
            ArrayList arrayList = new ArrayList(xVar.b() + 4);
            arrayList.add(new b(b.f5486f, f0Var.f5307b));
            arrayList.add(new b(b.f5487g, i.c.d.p.e.a(f0Var.a)));
            String a2 = f0Var.c.a("Host");
            if (a2 != null) {
                arrayList.add(new b(b.f5489i, a2));
            }
            arrayList.add(new b(b.f5488h, f0Var.a.a));
            int b2 = xVar.b();
            for (int i2 = 0; i2 < b2; i2++) {
                String lowerCase = xVar.a(i2).toLowerCase(Locale.US);
                if (!f5553g.contains(lowerCase) || (lowerCase.equals("te") && xVar.b(i2).equals("trailers"))) {
                    arrayList.add(new b(lowerCase, xVar.b(i2)));
                }
            }
            this.d = this.c.a(0, (List<b>) arrayList, z);
            if (!this.f5556f) {
                this.d.f5570i.a((long) ((o.o0.h.f) this.a).f5450h, TimeUnit.MILLISECONDS);
                this.d.f5571j.a((long) ((o.o0.h.f) this.a).f5451i, TimeUnit.MILLISECONDS);
                return;
            }
            this.d.a(a.CANCEL);
            throw new IOException("Canceled");
        }
    }

    public a0 b(j0 j0Var) {
        return this.d.f5568g;
    }

    public void a() {
        ((l.a) this.d.c()).close();
    }

    public j0.a a(boolean z) {
        x f2 = this.d.f();
        d0 d0Var = this.e;
        ArrayList arrayList = new ArrayList(20);
        int b2 = f2.b();
        i iVar = null;
        for (int i2 = 0; i2 < b2; i2++) {
            String a2 = f2.a(i2);
            String b3 = f2.b(i2);
            if (a2.equals(":status")) {
                iVar = i.a("HTTP/1.1 " + b3);
            } else if (f5554h.contains(a2)) {
                continue;
            } else if (((c0.a) o.o0.c.a) != null) {
                arrayList.add(a2);
                arrayList.add(b3.trim());
            } else {
                throw null;
            }
        }
        if (iVar != null) {
            j0.a aVar = new j0.a();
            aVar.f5337b = d0Var;
            aVar.c = iVar.f5457b;
            aVar.d = iVar.c;
            x.a aVar2 = new x.a();
            Collections.addAll(aVar2.a, (String[]) arrayList.toArray(new String[arrayList.size()]));
            aVar.f5338f = aVar2;
            if (z) {
                if (((c0.a) o.o0.c.a) == null) {
                    throw null;
                } else if (aVar.c == 100) {
                    return null;
                }
            }
            return aVar;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public long a(j0 j0Var) {
        return o.o0.h.e.a(j0Var);
    }
}
