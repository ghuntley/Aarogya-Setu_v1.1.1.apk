package l.a.a.a.o.g;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import l.a.a.a.f;
import l.a.a.a.k;
import l.a.a.a.o.b.g;
import l.a.a.a.o.b.i;
import l.a.a.a.o.b.l;
import l.a.a.a.o.b.m;
import l.a.a.a.o.b.s;
import l.a.a.a.o.b.v;
import l.a.a.a.o.e.c;

/* compiled from: Settings */
public class p {
    public final AtomicReference<s> a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f5185b = new CountDownLatch(1);
    public r c;
    public boolean d = false;

    /* compiled from: Settings */
    public static class b {
        public static final p a = new p((a) null);
    }

    public /* synthetic */ p(a aVar) {
    }

    public synchronized p a(k kVar, s sVar, c cVar, String str, String str2, String str3, l lVar) {
        k kVar2 = kVar;
        s sVar2 = sVar;
        synchronized (this) {
            if (this.d) {
                return this;
            }
            if (this.c == null) {
                Context context = kVar.getContext();
                String str4 = sVar2.f5091f;
                String c2 = new g().c(context);
                String d2 = sVar.d();
                v vVar = new v();
                j jVar = new j();
                h hVar = new h(kVar2);
                String b2 = i.b(context);
                String str5 = str3;
                k kVar3 = new k(kVar2, str5, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{str4}), cVar);
                String e = sVar.e();
                String a2 = sVar2.a(Build.VERSION.INCREMENTAL);
                String str6 = a2;
                this.c = new i(kVar, new t(c2, e, str6, sVar2.a(Build.VERSION.RELEASE), sVar.b(), i.a(i.j(context)), str2, str, m.a(d2).e, b2), vVar, jVar, hVar, kVar3, lVar);
            }
            this.d = true;
            return this;
        }
    }

    public synchronized boolean b() {
        s b2;
        i iVar = (i) this.c;
        if (iVar != null) {
            b2 = iVar.b(q.USE_CACHE);
            this.a.set(b2);
            this.f5185b.countDown();
        } else {
            throw null;
        }
        return b2 != null;
    }

    public synchronized boolean c() {
        s b2;
        b2 = ((i) this.c).b(q.SKIP_CACHE_LOOKUP);
        this.a.set(b2);
        this.f5185b.countDown();
        if (b2 == null && f.a().a("Fabric", 6)) {
            Log.e("Fabric", "Failed to force reload of settings from Crashlytics.", (Throwable) null);
        }
        return b2 != null;
    }

    public s a() {
        try {
            this.f5185b.await();
            return this.a.get();
        } catch (InterruptedException unused) {
            if (f.a().a("Fabric", 6)) {
                Log.e("Fabric", "Interrupted while waiting for settings data.", (Throwable) null);
            }
            return null;
        }
    }
}
