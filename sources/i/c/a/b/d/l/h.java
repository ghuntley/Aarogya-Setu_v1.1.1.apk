package i.c.a.b.d.l;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.api.Scope;
import i.c.a.b.d.f;
import i.c.a.b.d.k.a;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class h<T extends IInterface> extends b<T> implements a.f {
    public final Set<Scope> w;
    public final Account x;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r10, android.os.Looper r11, int r12, i.c.a.b.d.l.d r13, i.c.a.b.d.k.h.f r14, i.c.a.b.d.k.h.l r15) {
        /*
            r9 = this;
            i.c.a.b.d.l.i r3 = i.c.a.b.d.l.i.a(r10)
            i.c.a.b.d.e r4 = i.c.a.b.d.e.d
            i.c.a.b.d.l.q.a(r14)
            i.c.a.b.d.k.h.f r14 = (i.c.a.b.d.k.h.f) r14
            i.c.a.b.d.l.q.a(r15)
            i.c.a.b.d.k.h.l r15 = (i.c.a.b.d.k.h.l) r15
            r0 = 0
            if (r14 != 0) goto L_0x0015
            r6 = r0
            goto L_0x001b
        L_0x0015:
            i.c.a.b.d.l.a0 r1 = new i.c.a.b.d.l.a0
            r1.<init>(r14)
            r6 = r1
        L_0x001b:
            if (r15 != 0) goto L_0x001f
            r7 = r0
            goto L_0x0025
        L_0x001f:
            i.c.a.b.d.l.b0 r14 = new i.c.a.b.d.l.b0
            r14.<init>(r15)
            r7 = r14
        L_0x0025:
            java.lang.String r8 = r13.f3110f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            android.accounts.Account r10 = r13.a
            r9.x = r10
            java.util.Set<com.google.android.gms.common.api.Scope> r10 = r13.c
            java.util.Iterator r11 = r10.iterator()
        L_0x0038:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0053
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L_0x004b
            goto L_0x0038
        L_0x004b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L_0x0053:
            r9.w = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.d.l.h.<init>(android.content.Context, android.os.Looper, int, i.c.a.b.d.l.d, i.c.a.b.d.k.h.f, i.c.a.b.d.k.h.l):void");
    }

    public Set<Scope> e() {
        return h() ? this.w : Collections.emptySet();
    }

    public int j() {
        return f.a;
    }

    public final Account m() {
        return this.x;
    }

    public final Set<Scope> p() {
        return this.w;
    }
}
