package b.a.a.l;

import android.content.Context;
import i.c.e.j;
import nic.goi.aarogyasetu.views.MainActivity;
import q.d;
import q.f;

/* compiled from: CorUtility.kt */
public final class n implements f<j> {
    public final /* synthetic */ Context a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity.b f435b;

    public n(Context context, MainActivity.b bVar) {
        this.a = context;
        this.f435b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(q.d<i.c.e.j> r5, q.d0<i.c.e.j> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x00b0
            if (r6 == 0) goto L_0x00aa
            boolean r5 = r6.a()
            if (r5 == 0) goto L_0x00a9
            T r5 = r6.f5713b
            if (r5 == 0) goto L_0x00a9
            if (r5 == 0) goto L_0x00a5
            java.lang.String r6 = "response.body()!!"
            n.m.c.f.a((java.lang.Object) r5, (java.lang.String) r6)
            i.c.e.j r5 = (i.c.e.j) r5
            i.c.e.l r5 = r5.d()
            java.lang.String r6 = "p"
            boolean r0 = r5.b(r6)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0042
            i.c.e.j r0 = r5.a(r6)
            java.lang.String r3 = "jsonObject.get(\n        …                        )"
            n.m.c.f.a((java.lang.Object) r0, (java.lang.String) r3)
            int r0 = r0.c()
            if (r0 != r2) goto L_0x0042
            android.content.Context r0 = r4.a
            b.a.a.k.a.a((android.content.Context) r0, (java.lang.String) r6, (boolean) r2)
            b.a.a.l.o$a r6 = b.a.a.l.o.f436b
            android.content.Context r0 = r4.a
            r6.h(r0)
            goto L_0x0047
        L_0x0042:
            android.content.Context r0 = r4.a
            b.a.a.k.a.a((android.content.Context) r0, (java.lang.String) r6, (boolean) r1)
        L_0x0047:
            java.lang.String r6 = "did"
            boolean r0 = r5.b(r6)
            java.lang.String r3 = "unique_id"
            if (r0 == 0) goto L_0x0068
            nic.goi.aarogyasetu.CoronaApplication r0 = nic.goi.aarogyasetu.CoronaApplication.f5224g
            i.c.e.j r5 = r5.a(r6)
            java.lang.String r6 = "jsonObject.get(nic.goi.a…lity.Constants.UNIQUE_ID)"
            n.m.c.f.a((java.lang.Object) r5, (java.lang.String) r6)
            java.lang.String r5 = r5.f()
            b.a.a.k.a.b(r0, r3, r5)
            nic.goi.aarogyasetu.views.MainActivity$b r5 = r4.f435b
            r5.a()
        L_0x0068:
            android.content.Context r5 = r4.a
            java.lang.String r6 = ""
            java.lang.String r5 = b.a.a.k.a.a((android.content.Context) r5, (java.lang.String) r3, (java.lang.String) r6)
            if (r5 == 0) goto L_0x0078
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0079
        L_0x0078:
            r1 = 1
        L_0x0079:
            if (r1 == 0) goto L_0x00a9
            android.content.Context r5 = r4.a
            h.a0.x.j r5 = h.a0.x.j.a((android.content.Context) r5)
            java.lang.String r6 = "WorkManager.getInstance(context)"
            n.m.c.f.a((java.lang.Object) r5, (java.lang.String) r6)
            h.a0.p$a r6 = new h.a0.p$a
            java.lang.Class<nic.goi.aarogyasetu.background.StatusCheckCall> r0 = nic.goi.aarogyasetu.background.StatusCheckCall.class
            r1 = 16
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            r6.<init>(r0, r1, r3)
            h.a0.v r6 = r6.a()
            java.lang.String r0 = "PeriodicWorkRequest.Buil…                ).build()"
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r0)
            h.a0.p r6 = (h.a0.p) r6
            r5.a(r6)
            nic.goi.aarogyasetu.views.MainActivity$b r5 = r4.f435b
            r5.b()
            goto L_0x00a9
        L_0x00a5:
            n.m.c.f.a()
            throw r0
        L_0x00a9:
            return
        L_0x00aa:
            java.lang.String r5 = "response"
            n.m.c.f.a((java.lang.String) r5)
            throw r0
        L_0x00b0:
            java.lang.String r5 = "call"
            n.m.c.f.a((java.lang.String) r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.l.n.a(q.d, q.d0):void");
    }

    public void a(d<j> dVar, Throwable th) {
        if (dVar == null) {
            n.m.c.f.a("call");
            throw null;
        } else if (th != null) {
            this.f435b.b();
        } else {
            n.m.c.f.a("t");
            throw null;
        }
    }
}
