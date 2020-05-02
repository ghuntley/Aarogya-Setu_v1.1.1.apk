package o.o0.g;

import java.io.IOException;
import java.net.ProtocolException;
import javax.annotation.Nullable;
import o.c0;
import o.f0;
import o.j;
import o.j0;
import o.o0.h.c;
import o.u;
import p.a0;
import p.f;
import p.k;
import p.l;
import p.z;

/* compiled from: Exchange */
public final class d {
    public final j a;

    /* renamed from: b  reason: collision with root package name */
    public final j f5393b;
    public final u c;
    public final e d;
    public final c e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5394f;

    /* compiled from: Exchange */
    public final class b extends l {

        /* renamed from: f  reason: collision with root package name */
        public final long f5400f;

        /* renamed from: g  reason: collision with root package name */
        public long f5401g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5402h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5403i;

        public b(a0 a0Var, long j2) {
            super(a0Var);
            this.f5400f = j2;
            if (j2 == 0) {
                a((IOException) null);
            }
        }

        @Nullable
        public IOException a(@Nullable IOException iOException) {
            if (this.f5402h) {
                return iOException;
            }
            this.f5402h = true;
            return d.this.a(this.f5401g, true, false, iOException);
        }

        public long b(f fVar, long j2) {
            if (!this.f5403i) {
                try {
                    long b2 = this.e.b(fVar, j2);
                    if (b2 == -1) {
                        a((IOException) null);
                        return -1;
                    }
                    long j3 = this.f5401g + b2;
                    if (this.f5400f != -1) {
                        if (j3 > this.f5400f) {
                            throw new ProtocolException("expected " + this.f5400f + " bytes but received " + j3);
                        }
                    }
                    this.f5401g = j3;
                    if (j3 == this.f5400f) {
                        a((IOException) null);
                    }
                    return b2;
                } catch (IOException e) {
                    throw a(e);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!this.f5403i) {
                this.f5403i = true;
                try {
                    this.e.close();
                    a((IOException) null);
                } catch (IOException e) {
                    throw a(e);
                }
            }
        }
    }

    public d(j jVar, j jVar2, u uVar, e eVar, c cVar) {
        this.a = jVar;
        this.f5393b = jVar2;
        this.c = uVar;
        this.d = eVar;
        this.e = cVar;
    }

    public f a() {
        return this.e.c();
    }

    public void b() {
        try {
            this.e.b();
        } catch (IOException e2) {
            if (this.c != null) {
                this.d.d();
                this.e.c().a(e2);
                throw e2;
            }
            throw null;
        }
    }

    public z a(f0 f0Var, boolean z) {
        this.f5394f = z;
        long a2 = f0Var.d.a();
        if (this.c != null) {
            return new a(this.e.a(f0Var, a2), a2);
        }
        throw null;
    }

    /* compiled from: Exchange */
    public final class a extends k {

        /* renamed from: f  reason: collision with root package name */
        public boolean f5395f;

        /* renamed from: g  reason: collision with root package name */
        public long f5396g;

        /* renamed from: h  reason: collision with root package name */
        public long f5397h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5398i;

        public a(z zVar, long j2) {
            super(zVar);
            this.f5396g = j2;
        }

        public void a(f fVar, long j2) {
            if (!this.f5398i) {
                long j3 = this.f5396g;
                if (j3 == -1 || this.f5397h + j2 <= j3) {
                    try {
                        this.e.a(fVar, j2);
                        this.f5397h += j2;
                    } catch (IOException e) {
                        throw a(e);
                    }
                } else {
                    StringBuilder a = i.a.a.a.a.a("expected ");
                    a.append(this.f5396g);
                    a.append(" bytes but received ");
                    a.append(this.f5397h + j2);
                    throw new ProtocolException(a.toString());
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() {
            if (!this.f5398i) {
                this.f5398i = true;
                long j2 = this.f5396g;
                if (j2 == -1 || this.f5397h == j2) {
                    try {
                        this.e.close();
                        a((IOException) null);
                    } catch (IOException e) {
                        throw a(e);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() {
            try {
                this.e.flush();
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Nullable
        public final IOException a(@Nullable IOException iOException) {
            if (this.f5395f) {
                return iOException;
            }
            this.f5395f = true;
            return d.this.a(this.f5397h, false, true, iOException);
        }
    }

    @Nullable
    public j0.a a(boolean z) {
        try {
            j0.a a2 = this.e.a(z);
            if (a2 != null) {
                if (((c0.a) o.o0.c.a) != null) {
                    a2.f5345m = this;
                } else {
                    throw null;
                }
            }
            return a2;
        } catch (IOException e2) {
            if (this.c != null) {
                this.d.d();
                this.e.c().a(e2);
                throw e2;
            }
            throw null;
        }
    }

    @Nullable
    public IOException a(long j2, boolean z, boolean z2, @Nullable IOException iOException) {
        if (iOException != null) {
            this.d.d();
            this.e.c().a(iOException);
        }
        if (z2) {
            if (iOException != null) {
                if (this.c == null) {
                    throw null;
                }
            } else if (this.c == null) {
                throw null;
            }
        }
        if (z) {
            if (iOException != null) {
                if (this.c == null) {
                    throw null;
                }
            } else if (this.c == null) {
                throw null;
            }
        }
        return this.a.a(this, z2, z, iOException);
    }
}
