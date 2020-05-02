package o.o0.i;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import o.c0;
import o.f0;
import o.i0;
import o.j0;
import o.o0.h.i;
import o.x;
import o.y;
import p.a0;
import p.b0;
import p.h;
import p.m;
import p.z;

/* compiled from: Http1ExchangeCodec */
public final class a implements o.o0.h.c {
    public final c0 a;

    /* renamed from: b  reason: collision with root package name */
    public final o.o0.g.f f5458b;
    public final h c;
    public final p.g d;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f5459f = 262144;

    /* renamed from: g  reason: collision with root package name */
    public x f5460g;

    /* compiled from: Http1ExchangeCodec */
    public abstract class b implements a0 {
        public final m e = new m(a.this.c.c());

        /* renamed from: f  reason: collision with root package name */
        public boolean f5461f;

        public /* synthetic */ b(C0152a aVar) {
        }

        public final void a() {
            a aVar = a.this;
            int i2 = aVar.e;
            if (i2 != 6) {
                if (i2 == 5) {
                    a.a(aVar, this.e);
                    a.this.e = 6;
                    return;
                }
                StringBuilder a = i.a.a.a.a.a("state: ");
                a.append(a.this.e);
                throw new IllegalStateException(a.toString());
            }
        }

        public long b(p.f fVar, long j2) {
            try {
                return a.this.c.b(fVar, j2);
            } catch (IOException e2) {
                a.this.f5458b.b();
                a();
                throw e2;
            }
        }

        public b0 c() {
            return this.e;
        }
    }

    /* compiled from: Http1ExchangeCodec */
    public final class c implements z {
        public final m e = new m(a.this.d.c());

        /* renamed from: f  reason: collision with root package name */
        public boolean f5463f;

        public c() {
        }

        public void a(p.f fVar, long j2) {
            if (this.f5463f) {
                throw new IllegalStateException("closed");
            } else if (j2 != 0) {
                a.this.d.a(j2);
                a.this.d.a("\r\n");
                a.this.d.a(fVar, j2);
                a.this.d.a("\r\n");
            }
        }

        public b0 c() {
            return this.e;
        }

        public synchronized void close() {
            if (!this.f5463f) {
                this.f5463f = true;
                a.this.d.a("0\r\n\r\n");
                a.a(a.this, this.e);
                a.this.e = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f5463f) {
                a.this.d.flush();
            }
        }
    }

    /* compiled from: Http1ExchangeCodec */
    public class d extends b {

        /* renamed from: h  reason: collision with root package name */
        public final y f5465h;

        /* renamed from: i  reason: collision with root package name */
        public long f5466i = -1;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5467j = true;

        public d(y yVar) {
            super((C0152a) null);
            this.f5465h = yVar;
        }

        public long b(p.f fVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (this.f5461f) {
                throw new IllegalStateException("closed");
            } else if (!this.f5467j) {
                return -1;
            } else {
                long j3 = this.f5466i;
                if (j3 == 0 || j3 == -1) {
                    if (this.f5466i != -1) {
                        a.this.c.i();
                    }
                    try {
                        this.f5466i = a.this.c.n();
                        String trim = a.this.c.i().trim();
                        if (this.f5466i < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f5466i + trim + "\"");
                        }
                        if (this.f5466i == 0) {
                            this.f5467j = false;
                            a aVar = a.this;
                            aVar.f5460g = aVar.e();
                            a aVar2 = a.this;
                            o.o0.h.e.a(aVar2.a.f5268m, this.f5465h, aVar2.f5460g);
                            a();
                        }
                        if (!this.f5467j) {
                            return -1;
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long b2 = super.b(fVar, Math.min(j2, this.f5466i));
                if (b2 != -1) {
                    this.f5466i -= b2;
                    return b2;
                }
                a.this.f5458b.b();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
        }

        public void close() {
            if (!this.f5461f) {
                if (this.f5467j && !o.o0.e.a((a0) this, 100, TimeUnit.MILLISECONDS)) {
                    a.this.f5458b.b();
                    a();
                }
                this.f5461f = true;
            }
        }
    }

    /* compiled from: Http1ExchangeCodec */
    public class e extends b {

        /* renamed from: h  reason: collision with root package name */
        public long f5469h;

        public e(long j2) {
            super((C0152a) null);
            this.f5469h = j2;
            if (j2 == 0) {
                a();
            }
        }

        public long b(p.f fVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (!this.f5461f) {
                long j3 = this.f5469h;
                if (j3 == 0) {
                    return -1;
                }
                long b2 = super.b(fVar, Math.min(j3, j2));
                if (b2 != -1) {
                    long j4 = this.f5469h - b2;
                    this.f5469h = j4;
                    if (j4 == 0) {
                        a();
                    }
                    return b2;
                }
                a.this.f5458b.b();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!this.f5461f) {
                if (this.f5469h != 0 && !o.o0.e.a((a0) this, 100, TimeUnit.MILLISECONDS)) {
                    a.this.f5458b.b();
                    a();
                }
                this.f5461f = true;
            }
        }
    }

    /* compiled from: Http1ExchangeCodec */
    public final class f implements z {
        public final m e = new m(a.this.d.c());

        /* renamed from: f  reason: collision with root package name */
        public boolean f5471f;

        public /* synthetic */ f(C0152a aVar) {
        }

        public void a(p.f fVar, long j2) {
            if (!this.f5471f) {
                o.o0.e.a(fVar.f5646f, 0, j2);
                a.this.d.a(fVar, j2);
                return;
            }
            throw new IllegalStateException("closed");
        }

        public b0 c() {
            return this.e;
        }

        public void close() {
            if (!this.f5471f) {
                this.f5471f = true;
                a.a(a.this, this.e);
                a.this.e = 3;
            }
        }

        public void flush() {
            if (!this.f5471f) {
                a.this.d.flush();
            }
        }
    }

    /* compiled from: Http1ExchangeCodec */
    public class g extends b {

        /* renamed from: h  reason: collision with root package name */
        public boolean f5473h;

        public /* synthetic */ g(a aVar, C0152a aVar2) {
            super((C0152a) null);
        }

        public long b(p.f fVar, long j2) {
            if (j2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (this.f5461f) {
                throw new IllegalStateException("closed");
            } else if (this.f5473h) {
                return -1;
            } else {
                long b2 = super.b(fVar, j2);
                if (b2 != -1) {
                    return b2;
                }
                this.f5473h = true;
                a();
                return -1;
            }
        }

        public void close() {
            if (!this.f5461f) {
                if (!this.f5473h) {
                    a();
                }
                this.f5461f = true;
            }
        }
    }

    public a(c0 c0Var, o.o0.g.f fVar, h hVar, p.g gVar) {
        this.a = c0Var;
        this.f5458b = fVar;
        this.c = hVar;
        this.d = gVar;
    }

    public static /* synthetic */ void a(a aVar, m mVar) {
        if (aVar != null) {
            b0 b0Var = mVar.e;
            mVar.e = b0.d;
            b0Var.a();
            b0Var.b();
            return;
        }
        throw null;
    }

    public a0 b(j0 j0Var) {
        if (!o.o0.h.e.b(j0Var)) {
            return a(0);
        }
        String a2 = j0Var.f5329j.a("Transfer-Encoding");
        if (a2 == null) {
            a2 = null;
        }
        if ("chunked".equalsIgnoreCase(a2)) {
            y yVar = j0Var.e.a;
            if (this.e == 4) {
                this.e = 5;
                return new d(yVar);
            }
            StringBuilder a3 = i.a.a.a.a.a("state: ");
            a3.append(this.e);
            throw new IllegalStateException(a3.toString());
        }
        long a4 = o.o0.h.e.a(j0Var);
        if (a4 != -1) {
            return a(a4);
        }
        if (this.e == 4) {
            this.e = 5;
            this.f5458b.b();
            return new g(this, (C0152a) null);
        }
        StringBuilder a5 = i.a.a.a.a.a("state: ");
        a5.append(this.e);
        throw new IllegalStateException(a5.toString());
    }

    public o.o0.g.f c() {
        return this.f5458b;
    }

    public void cancel() {
        o.o0.g.f fVar = this.f5458b;
        if (fVar != null) {
            o.o0.e.a(fVar.d);
        }
    }

    public final String d() {
        String c2 = this.c.c(this.f5459f);
        this.f5459f -= (long) c2.length();
        return c2;
    }

    public final x e() {
        x.a aVar = new x.a();
        while (true) {
            String d2 = d();
            if (d2.length() == 0) {
                return new x(aVar);
            }
            if (((c0.a) o.o0.c.a) != null) {
                int indexOf = d2.indexOf(":", 1);
                if (indexOf != -1) {
                    aVar.b(d2.substring(0, indexOf), d2.substring(indexOf + 1));
                } else if (d2.startsWith(":")) {
                    String substring = d2.substring(1);
                    aVar.a.add("");
                    aVar.a.add(substring.trim());
                } else {
                    aVar.a.add("");
                    aVar.a.add(d2.trim());
                }
            } else {
                throw null;
            }
        }
    }

    public z a(f0 f0Var, long j2) {
        i0 i0Var = f0Var.d;
        if (i0Var != null && i0Var == null) {
            throw null;
        } else if ("chunked".equalsIgnoreCase(f0Var.c.a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new c();
            }
            StringBuilder a2 = i.a.a.a.a.a("state: ");
            a2.append(this.e);
            throw new IllegalStateException(a2.toString());
        } else if (j2 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.e == 1) {
            this.e = 2;
            return new f((C0152a) null);
        } else {
            StringBuilder a3 = i.a.a.a.a.a("state: ");
            a3.append(this.e);
            throw new IllegalStateException(a3.toString());
        }
    }

    public void b() {
        this.d.flush();
    }

    public void a(f0 f0Var) {
        Proxy.Type type = this.f5458b.c.f5367b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(f0Var.f5307b);
        sb.append(' ');
        if (!f0Var.a.a.equals("https") && type == Proxy.Type.HTTP) {
            sb.append(f0Var.a);
        } else {
            sb.append(i.c.d.p.e.a(f0Var.a));
        }
        sb.append(" HTTP/1.1");
        a(f0Var.c, sb.toString());
    }

    public long a(j0 j0Var) {
        if (!o.o0.h.e.b(j0Var)) {
            return 0;
        }
        String a2 = j0Var.f5329j.a("Transfer-Encoding");
        if (a2 == null) {
            a2 = null;
        }
        if ("chunked".equalsIgnoreCase(a2)) {
            return -1;
        }
        return o.o0.h.e.a(j0Var);
    }

    public void a() {
        this.d.flush();
    }

    public void a(x xVar, String str) {
        if (this.e == 0) {
            this.d.a(str).a("\r\n");
            int b2 = xVar.b();
            for (int i2 = 0; i2 < b2; i2++) {
                this.d.a(xVar.a(i2)).a(": ").a(xVar.b(i2)).a("\r\n");
            }
            this.d.a("\r\n");
            this.e = 1;
            return;
        }
        StringBuilder a2 = i.a.a.a.a.a("state: ");
        a2.append(this.e);
        throw new IllegalStateException(a2.toString());
    }

    public j0.a a(boolean z) {
        int i2 = this.e;
        if (i2 == 1 || i2 == 3) {
            try {
                i a2 = i.a(d());
                j0.a aVar = new j0.a();
                aVar.f5337b = a2.a;
                aVar.c = a2.f5457b;
                aVar.d = a2.c;
                aVar.a(e());
                if (z && a2.f5457b == 100) {
                    return null;
                }
                if (a2.f5457b == 100) {
                    this.e = 3;
                    return aVar;
                }
                this.e = 4;
                return aVar;
            } catch (EOFException e2) {
                o.o0.g.f fVar = this.f5458b;
                throw new IOException(i.a.a.a.a.b("unexpected end of stream on ", fVar != null ? fVar.c.a.a.f() : "unknown"), e2);
            }
        } else {
            StringBuilder a3 = i.a.a.a.a.a("state: ");
            a3.append(this.e);
            throw new IllegalStateException(a3.toString());
        }
    }

    public final a0 a(long j2) {
        if (this.e == 4) {
            this.e = 5;
            return new e(j2);
        }
        StringBuilder a2 = i.a.a.a.a.a("state: ");
        a2.append(this.e);
        throw new IllegalStateException(a2.toString());
    }
}
