package f.a;

import f.a.a.f;
import f.a.a.h;
import kotlin.TypeCastException;

/* compiled from: JobSupport.kt */
public final class u0 extends f implements l0 {
    public final String a(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("List{");
            sb.append(str);
            sb.append("}[");
            Object d = d();
            if (d != null) {
                boolean z = true;
                for (h hVar = (h) d; !n.m.c.f.a((Object) hVar, (Object) this); hVar = hVar.e()) {
                    if (hVar instanceof r0) {
                        r0 r0Var = (r0) hVar;
                        if (z) {
                            z = false;
                        } else {
                            sb.append(", ");
                        }
                        sb.append(r0Var);
                    }
                }
                sb.append("]");
                String sb2 = sb.toString();
                n.m.c.f.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }
        n.m.c.f.a("state");
        throw null;
    }

    public boolean a() {
        return true;
    }

    public u0 b() {
        return this;
    }

    public String toString() {
        return x.f865b ? a("Active") : super.toString();
    }
}
