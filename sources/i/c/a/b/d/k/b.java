package i.c.a.b.d.k;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import h.e.c;
import i.c.a.b.d.k.a;
import i.c.a.b.d.k.a.d;
import i.c.a.b.d.k.h.a0;
import i.c.a.b.d.k.h.c0;
import i.c.a.b.d.k.h.g;
import i.c.a.b.d.k.h.n;
import i.c.a.b.d.k.h.q0;
import i.c.a.b.d.l.d;
import i.c.a.b.d.l.q;
import i.c.a.b.l.h;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class b<O extends a.d> {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final a<O> f3025b;
    public final O c;
    public final i.c.a.b.d.k.h.b<O> d;
    public final Looper e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3026f;

    /* renamed from: g  reason: collision with root package name */
    public final c f3027g;

    /* renamed from: h  reason: collision with root package name */
    public final i.c.a.b.d.k.h.a f3028h;

    /* renamed from: i  reason: collision with root package name */
    public final g f3029i;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static class a {
        public static final a c = new a(new i.c.a.b.d.k.h.a(), (Account) null, Looper.getMainLooper());
        public final i.c.a.b.d.k.h.a a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f3030b;

        public /* synthetic */ a(i.c.a.b.d.k.h.a aVar, Account account, Looper looper) {
            this.a = aVar;
            this.f3030b = looper;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public b(Context context, a<O> aVar, O o2, i.c.a.b.d.k.h.a aVar2) {
        this(context, aVar, o2, new a(aVar2, (Account) null, Looper.getMainLooper()));
        q.a(aVar2, (Object) "StatusExceptionMapper must not be null.");
    }

    public final <TResult, A extends a.b> i.c.a.b.l.g<TResult> a(int i2, n<A, TResult> nVar) {
        h hVar = new h();
        g gVar = this.f3029i;
        i.c.a.b.d.k.h.a aVar = this.f3028h;
        if (gVar != null) {
            q0 q0Var = new q0(i2, nVar, hVar, aVar);
            Handler handler = gVar.f3053m;
            handler.sendMessage(handler.obtainMessage(4, new c0(q0Var, gVar.f3048h.get(), this)));
            return hVar.a;
        }
        throw null;
    }

    public b(Context context, a<O> aVar, O o2, a aVar2) {
        q.a(context, (Object) "Null context is not permitted.");
        q.a(aVar, (Object) "Api must not be null.");
        q.a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        this.f3025b = aVar;
        this.c = o2;
        this.e = aVar2.f3030b;
        this.d = new i.c.a.b.d.k.h.b<>(aVar, o2);
        this.f3027g = new a0(this);
        g a2 = g.a(this.a);
        this.f3029i = a2;
        this.f3026f = a2.f3047g.getAndIncrement();
        this.f3028h = aVar2.a;
        Handler handler = this.f3029i.f3053m;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public d.a a() {
        Set<Scope> set;
        GoogleSignInAccount a2;
        GoogleSignInAccount a3;
        d.a aVar = new d.a();
        O o2 = this.c;
        Account account = null;
        if (!(o2 instanceof a.d.b) || (a3 = ((a.d.b) o2).a()) == null) {
            O o3 = this.c;
            if (o3 instanceof a.d.C0109a) {
                account = ((a.d.C0109a) o3).e();
            }
        } else if (a3.f461h != null) {
            account = new Account(a3.f461h, "com.google");
        }
        aVar.a = account;
        O o4 = this.c;
        if (!(o4 instanceof a.d.b) || (a2 = ((a.d.b) o4).a()) == null) {
            set = Collections.emptySet();
        } else {
            set = a2.d();
        }
        if (aVar.f3113b == null) {
            aVar.f3113b = new c<>();
        }
        aVar.f3113b.addAll(set);
        aVar.e = this.a.getClass().getName();
        aVar.d = this.a.getPackageName();
        return aVar;
    }
}
