package i.c.d.f;

import com.google.firebase.components.DependencyCycleException;
import com.google.firebase.components.MissingDependencyException;
import i.c.a.b.d.l.q;
import i.c.d.i.c;
import i.c.d.i.d;
import i.c.d.l.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public class m extends a {
    public static final a<Set<Object>> e = l.a;
    public final Map<d<?>, t<?>> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, t<?>> f4663b = new HashMap();
    public final Map<Class<?>, t<Set<?>>> c = new HashMap();
    public final s d;

    public m(Executor executor, Iterable<i> iterable, d<?>... dVarArr) {
        Set<o> set;
        this.d = new s(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.a(this.d, s.class, d.class, c.class));
        for (i components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        for (d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            o oVar = new o(dVar2);
            Iterator<Class<? super T>> it2 = dVar2.a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class next = it2.next();
                    p pVar = new p(next, !dVar2.a(), (n) null);
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(pVar);
                    if (set2.isEmpty() || pVar.f4665b) {
                        set2.add(oVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next}));
                    }
                }
            }
        }
        for (Set<o> it3 : hashMap.values()) {
            for (o oVar2 : it3) {
                for (q next2 : oVar2.a.f4658b) {
                    if ((next2.c == 0) && (set = (Set) hashMap.get(new p(next2.a, next2.a(), (n) null))) != null) {
                        for (o oVar3 : set) {
                            oVar2.f4664b.add(oVar3);
                            oVar3.c.add(oVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it4 = hashSet.iterator();
        while (it4.hasNext()) {
            o oVar4 = (o) it4.next();
            if (oVar4.a()) {
                hashSet2.add(oVar4);
            }
        }
        int i2 = 0;
        while (!hashSet2.isEmpty()) {
            o oVar5 = (o) hashSet2.iterator().next();
            hashSet2.remove(oVar5);
            i2++;
            for (o next3 : oVar5.f4664b) {
                next3.c.remove(oVar5);
                if (next3.a()) {
                    hashSet2.add(next3);
                }
            }
        }
        if (i2 == arrayList.size()) {
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                d dVar3 = (d) it5.next();
                this.a.put(dVar3, new t(new j(this, dVar3)));
            }
            for (Map.Entry next4 : this.a.entrySet()) {
                d dVar4 = (d) next4.getKey();
                if (dVar4.a()) {
                    t tVar = (t) next4.getValue();
                    for (Class<? super T> put : dVar4.a) {
                        this.f4663b.put(put, tVar);
                    }
                }
            }
            for (d next5 : this.a.keySet()) {
                Iterator<q> it6 = next5.f4658b.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        q next6 = it6.next();
                        if ((next6.f4666b == 1) && !this.f4663b.containsKey(next6.a)) {
                            throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next5, next6.a}));
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            for (Map.Entry next7 : this.a.entrySet()) {
                d dVar5 = (d) next7.getKey();
                if (!dVar5.a()) {
                    t tVar2 = (t) next7.getValue();
                    for (Class next8 : dVar5.a) {
                        if (!hashMap2.containsKey(next8)) {
                            hashMap2.put(next8, new HashSet());
                        }
                        ((Set) hashMap2.get(next8)).add(tVar2);
                    }
                }
            }
            for (Map.Entry entry : hashMap2.entrySet()) {
                this.c.put((Class) entry.getKey(), new t(new k((Set) entry.getValue())));
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            o oVar6 = (o) it7.next();
            if (!oVar6.a() && !oVar6.f4664b.isEmpty()) {
                arrayList2.add(oVar6.a);
            }
        }
        throw new DependencyCycleException(arrayList2);
    }

    public <T> a<T> b(Class<T> cls) {
        q.a(cls, "Null interface requested.");
        return this.f4663b.get(cls);
    }

    public <T> a<Set<T>> d(Class<T> cls) {
        t tVar = this.c.get(cls);
        if (tVar != null) {
            return tVar;
        }
        return e;
    }

    public static /* synthetic */ Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((t) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
