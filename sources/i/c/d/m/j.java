package i.c.d.m;

import i.c.a.b.l.h;
import i.c.d.m.o.a;
import i.c.d.m.o.c;
import i.c.d.m.o.d;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public class j implements m {
    public final h<String> a;

    public j(h<String> hVar) {
        this.a = hVar;
    }

    public boolean a(d dVar) {
        if (!dVar.c()) {
            if (!(((a) dVar).f4733b == c.a.REGISTERED) && !dVar.a()) {
                return false;
            }
        }
        this.a.a(((a) dVar).a);
        return true;
    }

    public boolean a(d dVar, Exception exc) {
        return false;
    }
}
