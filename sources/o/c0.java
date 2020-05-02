package o;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import o.j;
import o.o0.e;
import o.o0.k.f;
import o.o0.m.c;
import o.o0.m.d;
import o.u;
import o.x;

/* compiled from: OkHttpClient */
public class c0 implements Cloneable, j.a {
    public static final List<d0> G = e.a((T[]) new d0[]{d0.HTTP_2, d0.HTTP_1_1});
    public static final List<o> H = e.a((T[]) new o[]{o.f5375g, o.f5376h});
    public final boolean A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final r e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final Proxy f5261f;

    /* renamed from: g  reason: collision with root package name */
    public final List<d0> f5262g;

    /* renamed from: h  reason: collision with root package name */
    public final List<o> f5263h;

    /* renamed from: i  reason: collision with root package name */
    public final List<z> f5264i;

    /* renamed from: j  reason: collision with root package name */
    public final List<z> f5265j;

    /* renamed from: k  reason: collision with root package name */
    public final u.b f5266k;

    /* renamed from: l  reason: collision with root package name */
    public final ProxySelector f5267l;

    /* renamed from: m  reason: collision with root package name */
    public final q f5268m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public final h f5269n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    public final o.o0.f.e f5270o;

    /* renamed from: p  reason: collision with root package name */
    public final SocketFactory f5271p;

    /* renamed from: q  reason: collision with root package name */
    public final SSLSocketFactory f5272q;
    public final c r;
    public final HostnameVerifier s;
    public final l t;
    public final g u;
    public final g v;
    public final n w;
    public final t x;
    public final boolean y;
    public final boolean z;

    /* compiled from: OkHttpClient */
    public class a extends o.o0.c {
        public void a(x.a aVar, String str, String str2) {
            aVar.a.add(str);
            aVar.a.add(str2.trim());
        }
    }

    /* compiled from: OkHttpClient */
    public static final class b {
        public int A;
        public r a = new r();
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public Proxy f5273b;
        public List<d0> c = c0.G;
        public List<o> d = c0.H;
        public final List<z> e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public final List<z> f5274f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        public u.b f5275g = new d(u.a);

        /* renamed from: h  reason: collision with root package name */
        public ProxySelector f5276h;

        /* renamed from: i  reason: collision with root package name */
        public q f5277i;
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        public o.o0.f.e f5278j;

        /* renamed from: k  reason: collision with root package name */
        public SocketFactory f5279k;
        @Nullable

        /* renamed from: l  reason: collision with root package name */
        public SSLSocketFactory f5280l;
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        public c f5281m;

        /* renamed from: n  reason: collision with root package name */
        public HostnameVerifier f5282n;

        /* renamed from: o  reason: collision with root package name */
        public l f5283o;

        /* renamed from: p  reason: collision with root package name */
        public g f5284p;

        /* renamed from: q  reason: collision with root package name */
        public g f5285q;
        public n r;
        public t s;
        public boolean t;
        public boolean u;
        public boolean v;
        public int w;
        public int x;
        public int y;
        public int z;

        public b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f5276h = proxySelector;
            if (proxySelector == null) {
                this.f5276h = new o.o0.l.a();
            }
            this.f5277i = q.a;
            this.f5279k = SocketFactory.getDefault();
            this.f5282n = d.a;
            this.f5283o = l.c;
            g gVar = g.a;
            this.f5284p = gVar;
            this.f5285q = gVar;
            this.r = new n();
            this.s = t.a;
            this.t = true;
            this.u = true;
            this.v = true;
            this.w = 0;
            this.x = l.a.a.a.o.b.a.DEFAULT_TIMEOUT;
            this.y = l.a.a.a.o.b.a.DEFAULT_TIMEOUT;
            this.z = l.a.a.a.o.b.a.DEFAULT_TIMEOUT;
            this.A = 0;
        }
    }

    static {
        o.o0.c.a = new a();
    }

    public c0() {
        this(new b());
    }

    public j a(f0 f0Var) {
        e0 e0Var = new e0(this, f0Var, false);
        e0Var.f5300f = new o.o0.g.j(this, e0Var);
        return e0Var;
    }

    public c0(b bVar) {
        boolean z2;
        this.e = bVar.a;
        this.f5261f = bVar.f5273b;
        this.f5262g = bVar.c;
        this.f5263h = bVar.d;
        this.f5264i = e.a(bVar.e);
        this.f5265j = e.a(bVar.f5274f);
        this.f5266k = bVar.f5275g;
        this.f5267l = bVar.f5276h;
        this.f5268m = bVar.f5277i;
        this.f5269n = null;
        this.f5270o = bVar.f5278j;
        this.f5271p = bVar.f5279k;
        Iterator<o> it = this.f5263h.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                o next = it.next();
                if (z2 || next.a) {
                    z2 = true;
                }
            }
        }
        if (bVar.f5280l != null || !z2) {
            this.f5272q = bVar.f5280l;
            this.r = bVar.f5281m;
        } else {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                try {
                    SSLContext a2 = f.a.a();
                    a2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                    this.f5272q = a2.getSocketFactory();
                    this.r = f.a.a(x509TrustManager);
                } catch (GeneralSecurityException e2) {
                    throw new AssertionError("No System TLS", e2);
                }
            } catch (GeneralSecurityException e3) {
                throw new AssertionError("No System TLS", e3);
            }
        }
        SSLSocketFactory sSLSocketFactory = this.f5272q;
        if (sSLSocketFactory != null) {
            f.a.a(sSLSocketFactory);
        }
        this.s = bVar.f5282n;
        l lVar = bVar.f5283o;
        c cVar = this.r;
        this.t = !Objects.equals(lVar.f5349b, cVar) ? new l(lVar.a, cVar) : lVar;
        this.u = bVar.f5284p;
        this.v = bVar.f5285q;
        this.w = bVar.r;
        this.x = bVar.s;
        this.y = bVar.t;
        this.z = bVar.u;
        this.A = bVar.v;
        this.B = bVar.w;
        this.C = bVar.x;
        this.D = bVar.y;
        this.E = bVar.z;
        this.F = bVar.A;
        if (this.f5264i.contains((Object) null)) {
            StringBuilder a3 = i.a.a.a.a.a("Null interceptor: ");
            a3.append(this.f5264i);
            throw new IllegalStateException(a3.toString());
        } else if (this.f5265j.contains((Object) null)) {
            StringBuilder a4 = i.a.a.a.a.a("Null network interceptor: ");
            a4.append(this.f5265j);
            throw new IllegalStateException(a4.toString());
        }
    }
}
