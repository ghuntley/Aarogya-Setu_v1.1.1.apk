package i.c.d.p;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public static volatile d f4771b;
    public final Set<f> a = new HashSet();

    public static d b() {
        d dVar = f4771b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f4771b;
                if (dVar == null) {
                    dVar = new d();
                    f4771b = dVar;
                }
            }
        }
        return dVar;
    }

    public Set<f> a() {
        Set<f> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
