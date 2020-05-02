package i.c.a.b.d.k.h;

import com.google.android.gms.common.api.Status;
import i.c.a.b.d.k.a;
import i.c.a.b.d.k.d;
import i.c.a.b.d.k.f;
import i.c.a.b.d.k.h.d;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class o0<A extends d<? extends f, a.b>> extends e0 {
    public final A a;

    public o0(int i2, A a2) {
        super(i2);
        this.a = a2;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(i.c.a.b.d.k.h.g.a<?> r7) {
        /*
            r6 = this;
            A r0 = r6.a     // Catch:{ RuntimeException -> 0x0036 }
            i.c.a.b.d.k.a$f r7 = r7.f3054b     // Catch:{ RuntimeException -> 0x0036 }
            r1 = 0
            if (r0 == 0) goto L_0x0035
            boolean r2 = r7 instanceof i.c.a.b.d.l.u     // Catch:{ RuntimeException -> 0x0036 }
            if (r2 == 0) goto L_0x0012
            i.c.a.b.d.l.u r7 = (i.c.a.b.d.l.u) r7     // Catch:{ RuntimeException -> 0x0036 }
            if (r7 == 0) goto L_0x0011
            r7 = r1
            goto L_0x0012
        L_0x0011:
            throw r1     // Catch:{ RuntimeException -> 0x0036 }
        L_0x0012:
            r2 = 8
            r3 = 1
            r0.a(r7)     // Catch:{ DeadObjectException -> 0x0027, RemoteException -> 0x0019 }
            goto L_0x0026
        L_0x0019:
            r7 = move-exception
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x0036 }
            java.lang.String r7 = r7.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x0036 }
            r4.<init>(r3, r2, r7, r1)     // Catch:{ RuntimeException -> 0x0036 }
            r0.b(r4)     // Catch:{ RuntimeException -> 0x0036 }
        L_0x0026:
            return
        L_0x0027:
            r7 = move-exception
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status     // Catch:{ RuntimeException -> 0x0036 }
            java.lang.String r5 = r7.getLocalizedMessage()     // Catch:{ RuntimeException -> 0x0036 }
            r4.<init>(r3, r2, r5, r1)     // Catch:{ RuntimeException -> 0x0036 }
            r0.b(r4)     // Catch:{ RuntimeException -> 0x0036 }
            throw r7     // Catch:{ RuntimeException -> 0x0036 }
        L_0x0035:
            throw r1     // Catch:{ RuntimeException -> 0x0036 }
        L_0x0036:
            r7 = move-exception
            r6.a((java.lang.RuntimeException) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.d.k.h.o0.a(i.c.a.b.d.k.h.g$a):void");
    }

    public final void a(Status status) {
        this.a.b(status);
    }

    public final void a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        this.a.b(new Status(10, i.a.a.a.a.a(i.a.a.a.a.a(localizedMessage, simpleName.length() + 2), simpleName, ": ", localizedMessage)));
    }

    public final void a(x0 x0Var, boolean z) {
        A a2 = this.a;
        x0Var.a.put(a2, Boolean.valueOf(z));
        a2.a((d.a) new q(x0Var, a2));
    }
}
