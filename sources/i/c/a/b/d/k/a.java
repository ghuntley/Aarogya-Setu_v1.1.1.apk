package i.c.a.b.d.k;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import i.c.a.b.d.k.a.d;
import i.c.a.b.d.k.c;
import i.c.a.b.d.k.h.l;
import i.c.a.b.d.l.b;
import i.c.a.b.d.l.q;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class a<O extends d> {
    public final C0108a<?, O> a;

    /* renamed from: b  reason: collision with root package name */
    public final g<?> f3024b;
    public final String c;

    /* renamed from: i.c.a.b.d.k.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class C0108a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, i.c.a.b.d.l.d dVar, O o2, c.a aVar, c.b bVar) {
            return a(context, looper, dVar, o2, (i.c.a.b.d.k.h.f) aVar, (l) bVar);
        }

        public T a(Context context, Looper looper, i.c.a.b.d.l.d dVar, O o2, i.c.a.b.d.k.h.f fVar, l lVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface b {
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class c<C extends b> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface d {

        /* renamed from: i.c.a.b.d.k.a$d$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface C0109a extends c, e {
            Account e();
        }

        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface b extends c {
            GoogleSignInAccount a();
        }

        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface c extends d {
        }

        /* renamed from: i.c.a.b.d.k.a$d$d  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static final class C0110d implements e {
        }

        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface e extends d {
        }

        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public interface f extends c, e {
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class e<T extends b, O> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface f extends b {
        void a(b.c cVar);

        void a(b.e eVar);

        void a(i.c.a.b.d.l.l lVar, Set<Scope> set);

        boolean a();

        i.c.a.b.d.d[] b();

        boolean c();

        String d();

        Set<Scope> e();

        void f();

        boolean h();

        boolean i();

        int j();
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, C0108a<C, O> aVar, g<C> gVar) {
        q.a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        q.a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = aVar;
        this.f3024b = gVar;
    }
}
