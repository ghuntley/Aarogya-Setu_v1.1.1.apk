package h.f.a.h;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ResolutionNode */
public class l {
    public HashSet<l> a = new HashSet<>(2);

    /* renamed from: b  reason: collision with root package name */
    public int f1673b = 0;

    public void a() {
        this.f1673b = 1;
        Iterator<l> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public void b() {
        this.f1673b = 0;
        Iterator<l> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public boolean c() {
        return this.f1673b == 1;
    }

    public void d() {
    }
}
