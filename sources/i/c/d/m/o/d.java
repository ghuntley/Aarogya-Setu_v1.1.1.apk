package i.c.d.m.o;

import i.c.d.m.o.a;
import i.c.d.m.o.c;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public abstract class d {

    /* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
    public static abstract class a {
        public abstract a a(long j2);

        public abstract a a(c.a aVar);

        public abstract d a();

        public abstract a b(long j2);
    }

    static {
        a.b bVar = new a.b();
        bVar.b(0);
        bVar.a(c.a.ATTEMPT_MIGRATION);
        bVar.a(0);
        bVar.a();
    }

    public static a e() {
        a.b bVar = new a.b();
        bVar.b(0);
        bVar.a(c.a.ATTEMPT_MIGRATION);
        bVar.a(0);
        return bVar;
    }

    public boolean a() {
        return ((a) this).f4733b == c.a.REGISTER_ERROR;
    }

    public boolean b() {
        c.a aVar = ((a) this).f4733b;
        return aVar == c.a.NOT_GENERATED || aVar == c.a.ATTEMPT_MIGRATION;
    }

    public boolean c() {
        return ((a) this).f4733b == c.a.UNREGISTERED;
    }

    public abstract a d();
}
