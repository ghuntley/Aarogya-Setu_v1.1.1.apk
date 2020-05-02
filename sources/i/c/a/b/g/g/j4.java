package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public class j4 {
    public volatile f5 a;

    /* renamed from: b  reason: collision with root package name */
    public volatile u2 f3324b;

    static {
        i3.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.c.a.b.g.g.f5 a(i.c.a.b.g.g.f5 r2) {
        /*
            r1 = this;
            i.c.a.b.g.g.f5 r0 = r1.a
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            i.c.a.b.g.g.f5 r0 = r1.a     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.a = r2     // Catch:{ zzfo -> 0x0012 }
            i.c.a.b.g.g.u2 r0 = i.c.a.b.g.g.u2.f3471f     // Catch:{ zzfo -> 0x0012 }
            r1.f3324b = r0     // Catch:{ zzfo -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.a = r2     // Catch:{ all -> 0x001a }
            i.c.a.b.g.g.u2 r2 = i.c.a.b.g.g.u2.f3471f     // Catch:{ all -> 0x001a }
            r1.f3324b = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            i.c.a.b.g.g.f5 r2 = r1.a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.j4.a(i.c.a.b.g.g.f5):i.c.a.b.g.g.f5");
    }

    public final u2 b() {
        if (this.f3324b != null) {
            return this.f3324b;
        }
        synchronized (this) {
            if (this.f3324b != null) {
                u2 u2Var = this.f3324b;
                return u2Var;
            }
            if (this.a == null) {
                this.f3324b = u2.f3471f;
            } else {
                this.f3324b = this.a.c();
            }
            u2 u2Var2 = this.f3324b;
            return u2Var2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        f5 f5Var = this.a;
        f5 f5Var2 = j4Var.a;
        if (f5Var == null && f5Var2 == null) {
            return b().equals(j4Var.b());
        }
        if (f5Var != null && f5Var2 != null) {
            return f5Var.equals(f5Var2);
        }
        if (f5Var != null) {
            return f5Var.equals(j4Var.a(f5Var.h()));
        }
        return a(f5Var2.h()).equals(f5Var2);
    }

    public int hashCode() {
        return 1;
    }

    public final int a() {
        if (this.f3324b != null) {
            return this.f3324b.a();
        }
        if (this.a != null) {
            return this.a.e();
        }
        return 0;
    }
}
