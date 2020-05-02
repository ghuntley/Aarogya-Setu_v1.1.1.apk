package i.c.d.p;

import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public class c implements g {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4770b;

    public c(Set<f> set, d dVar) {
        this.a = a(set);
        this.f4770b = dVar;
    }

    public String a() {
        if (this.f4770b.a().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + a(this.f4770b.a());
    }

    public static String a(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.a);
            sb.append('/');
            sb.append(aVar.f4769b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
