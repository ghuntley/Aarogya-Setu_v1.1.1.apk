package h.a0.x;

import android.text.TextUtils;
import h.a0.g;
import h.a0.l;
import h.a0.o;
import h.a0.s;
import h.a0.v;
import h.a0.x.r.d;
import h.a0.x.r.p.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WorkContinuationImpl */
public class f extends s {

    /* renamed from: j  reason: collision with root package name */
    public static final String f946j = l.a("WorkContinuationImpl");
    public final j a;

    /* renamed from: b  reason: collision with root package name */
    public final String f947b;
    public final g c;
    public final List<? extends v> d;
    public final List<String> e = new ArrayList(this.d.size());

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f948f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final List<f> f949g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f950h;

    /* renamed from: i  reason: collision with root package name */
    public o f951i;

    public f(j jVar, String str, g gVar, List<? extends v> list, List<f> list2) {
        this.a = jVar;
        this.f947b = str;
        this.c = gVar;
        this.d = list;
        this.f949g = list2;
        if (list2 != null) {
            for (f fVar : list2) {
                this.f948f.addAll(fVar.f948f);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a2 = ((v) list.get(i2)).a();
            this.e.add(a2);
            this.f948f.add(a2);
        }
    }

    public static boolean a(f fVar, Set<String> set) {
        set.addAll(fVar.e);
        Set<String> a2 = a(fVar);
        for (String contains : set) {
            if (((HashSet) a2).contains(contains)) {
                return true;
            }
        }
        List<f> list = fVar.f949g;
        if (list != null && !list.isEmpty()) {
            for (f a3 : list) {
                if (a(a3, set)) {
                    return true;
                }
            }
        }
        set.removeAll(fVar.e);
        return false;
    }

    public o a() {
        if (!this.f950h) {
            d dVar = new d(this);
            ((b) this.a.d).a.execute(dVar);
            this.f951i = dVar.f1087f;
        } else {
            l.a().d(f946j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.e)}), new Throwable[0]);
        }
        return this.f951i;
    }

    public static Set<String> a(f fVar) {
        HashSet hashSet = new HashSet();
        List<f> list = fVar.f949g;
        if (list != null && !list.isEmpty()) {
            for (f fVar2 : list) {
                hashSet.addAll(fVar2.e);
            }
        }
        return hashSet;
    }
}
