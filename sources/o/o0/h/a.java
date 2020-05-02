package o.o0.h;

import java.util.Collections;
import java.util.List;
import o.a0;
import o.f0;
import o.i0;
import o.j0;
import o.o0.e;
import o.p;
import o.q;
import o.x;
import o.z;
import p.o;
import p.v;

/* compiled from: BridgeInterceptor */
public final class a implements z {

    /* renamed from: b  reason: collision with root package name */
    public final q f5444b;

    public a(q qVar) {
        this.f5444b = qVar;
    }

    public j0 a(z.a aVar) {
        boolean z;
        f fVar = (f) aVar;
        f0 f0Var = fVar.e;
        if (f0Var != null) {
            f0.a aVar2 = new f0.a(f0Var);
            i0 i0Var = f0Var.d;
            if (i0Var != null) {
                a0 b2 = i0Var.b();
                if (b2 != null) {
                    aVar2.a("Content-Type", b2.a);
                }
                long a = i0Var.a();
                if (a != -1) {
                    aVar2.a("Content-Length", Long.toString(a));
                    aVar2.c.a("Transfer-Encoding");
                } else {
                    aVar2.a("Transfer-Encoding", "chunked");
                    aVar2.c.a("Content-Length");
                }
            }
            if (f0Var.c.a("Host") == null) {
                aVar2.a("Host", e.a(f0Var.a, false));
            }
            if (f0Var.c.a("Connection") == null) {
                aVar2.a("Connection", "Keep-Alive");
            }
            if (f0Var.c.a("Accept-Encoding") == null && f0Var.c.a("Range") == null) {
                aVar2.a("Accept-Encoding", "gzip");
                z = true;
            } else {
                z = false;
            }
            if (((q.a) this.f5444b) != null) {
                List emptyList = Collections.emptyList();
                if (!emptyList.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    int size = emptyList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (i2 > 0) {
                            sb.append("; ");
                        }
                        p pVar = (p) emptyList.get(i2);
                        sb.append(pVar.a);
                        sb.append('=');
                        sb.append(pVar.f5607b);
                    }
                    aVar2.a("Cookie", sb.toString());
                }
                if (f0Var.c.a(l.a.a.a.o.b.a.HEADER_USER_AGENT) == null) {
                    aVar2.a(l.a.a.a.o.b.a.HEADER_USER_AGENT, "okhttp/3.14.7");
                }
                j0 a2 = fVar.a(aVar2.a(), fVar.f5447b, fVar.c);
                e.a(this.f5444b, f0Var.a, a2.f5329j);
                j0.a aVar3 = new j0.a(a2);
                aVar3.a = f0Var;
                if (z) {
                    String a3 = a2.f5329j.a("Content-Encoding");
                    if (a3 == null) {
                        a3 = null;
                    }
                    if ("gzip".equalsIgnoreCase(a3) && e.b(a2)) {
                        o oVar = new o(a2.f5330k.h());
                        x.a a4 = a2.f5329j.a();
                        a4.a("Content-Encoding");
                        a4.a("Content-Length");
                        List<String> list = a4.a;
                        x.a aVar4 = new x.a();
                        Collections.addAll(aVar4.a, (String[]) list.toArray(new String[list.size()]));
                        aVar3.f5338f = aVar4;
                        String a5 = a2.f5329j.a("Content-Type");
                        if (a5 == null) {
                            a5 = null;
                        }
                        aVar3.f5339g = new g(a5, -1, new v(oVar));
                    }
                }
                return aVar3.a();
            }
            throw null;
        }
        throw null;
    }
}
