package i.b.a.n.m.c0;

import h.h.l.c;
import i.b.a.n.e;
import i.b.a.t.g;
import i.b.a.t.j;
import i.b.a.t.k.a;
import i.b.a.t.k.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: SafeKeyGenerator */
public class k {
    public final g<e, String> a = new g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final c<b> f2561b = i.b.a.t.k.a.a(10, new a(this));

    /* compiled from: SafeKeyGenerator */
    public class a implements a.b<b> {
        public a(k kVar) {
        }

        public Object a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: SafeKeyGenerator */
    public static final class b implements a.d {
        public final MessageDigest e;

        /* renamed from: f  reason: collision with root package name */
        public final d f2562f = new d.b();

        public b(MessageDigest messageDigest) {
            this.e = messageDigest;
        }

        public d g() {
            return this.f2562f;
        }
    }

    public String a(e eVar) {
        String a2;
        synchronized (this.a) {
            a2 = this.a.a(eVar);
        }
        if (a2 == null) {
            b a3 = this.f2561b.a();
            g.a.a.b.a.a(a3, "Argument must not be null");
            b bVar = a3;
            try {
                eVar.a(bVar.e);
                a2 = j.a(bVar.e.digest());
            } finally {
                this.f2561b.a(bVar);
            }
        }
        synchronized (this.a) {
            this.a.b(eVar, a2);
        }
        return a2;
    }
}
