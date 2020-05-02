package i.c.a.b.d.l;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import h.e.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class d {
    public final Account a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Scope> f3109b;
    public final Set<Scope> c;
    public final Map<i.c.a.b.d.k.a<?>, b> d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3110f;

    /* renamed from: g  reason: collision with root package name */
    public final i.c.a.b.j.a f3111g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f3112h;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class a {
        public Account a;

        /* renamed from: b  reason: collision with root package name */
        public c<Scope> f3113b;
        public int c = 0;
        public String d;
        public String e;

        /* renamed from: f  reason: collision with root package name */
        public i.c.a.b.j.a f3114f = i.c.a.b.j.a.f3978j;

        public final d a() {
            return new d(this.a, this.f3113b, (Map<i.c.a.b.d.k.a<?>, b>) null, this.c, (View) null, this.d, this.e, this.f3114f, false);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class b {
        public final Set<Scope> a;
    }

    public d(Account account, Set<Scope> set, Map<i.c.a.b.d.k.a<?>, b> map, int i2, View view, String str, String str2, i.c.a.b.j.a aVar, boolean z) {
        this.a = account;
        this.f3109b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.d = map == null ? Collections.emptyMap() : map;
        this.e = str;
        this.f3110f = str2;
        this.f3111g = aVar;
        HashSet hashSet = new HashSet(this.f3109b);
        for (b bVar : this.d.values()) {
            hashSet.addAll(bVar.a);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}
