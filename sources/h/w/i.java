package h.w;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import h.e.e;
import h.h.m.m;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Transition */
public abstract class i implements Cloneable {
    public static final int[] J = {2, 1, 3, 4};
    public static final e K = new a();
    public static ThreadLocal<h.e.a<Animator, b>> L = new ThreadLocal<>();
    public ArrayList<Animator> A = new ArrayList<>();
    public int B = 0;
    public boolean C = false;
    public boolean D = false;
    public ArrayList<d> E = null;
    public ArrayList<Animator> F = new ArrayList<>();
    public n G;
    public c H;
    public e I = K;
    public String e = getClass().getName();

    /* renamed from: f  reason: collision with root package name */
    public long f2274f = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f2275g = -1;

    /* renamed from: h  reason: collision with root package name */
    public TimeInterpolator f2276h = null;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<Integer> f2277i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<View> f2278j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<String> f2279k = null;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<Class<?>> f2280l = null;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<Integer> f2281m = null;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<View> f2282n = null;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<Class<?>> f2283o = null;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<String> f2284p = null;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<Integer> f2285q = null;
    public ArrayList<View> r = null;
    public ArrayList<Class<?>> s = null;
    public r t = new r();
    public r u = new r();
    public o v = null;
    public int[] w = J;
    public ArrayList<q> x;
    public ArrayList<q> y;
    public boolean z = false;

    /* compiled from: Transition */
    public static class a extends e {
        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* compiled from: Transition */
    public static class b {
        public View a;

        /* renamed from: b  reason: collision with root package name */
        public String f2286b;
        public q c;
        public f0 d;
        public i e;

        public b(View view, String str, i iVar, f0 f0Var, q qVar) {
            this.a = view;
            this.f2286b = str;
            this.c = qVar;
            this.d = f0Var;
            this.e = iVar;
        }
    }

    /* compiled from: Transition */
    public static abstract class c {
    }

    /* compiled from: Transition */
    public interface d {
        void a(i iVar);

        void b(i iVar);

        void c(i iVar);

        void d(i iVar);

        void e(i iVar);
    }

    public static h.e.a<Animator, b> g() {
        h.e.a<Animator, b> aVar = L.get();
        if (aVar != null) {
            return aVar;
        }
        h.e.a<Animator, b> aVar2 = new h.e.a<>();
        L.set(aVar2);
        return aVar2;
    }

    public Animator a(ViewGroup viewGroup, q qVar, q qVar2) {
        return null;
    }

    public i a(long j2) {
        this.f2275g = j2;
        return this;
    }

    public abstract void a(q qVar);

    public i b(long j2) {
        this.f2274f = j2;
        return this;
    }

    public void b(q qVar) {
    }

    public q c(View view, boolean z2) {
        o oVar = this.v;
        if (oVar != null) {
            return oVar.c(view, z2);
        }
        return (z2 ? this.t : this.u).a.getOrDefault(view, null);
    }

    public abstract void c(q qVar);

    public String[] c() {
        return null;
    }

    public void cancel() {
        for (int size = this.A.size() - 1; size >= 0; size--) {
            this.A.get(size).cancel();
        }
        ArrayList<d> arrayList = this.E;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.E.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((d) arrayList2.get(i2)).d(this);
            }
        }
    }

    public void d() {
        e();
        h.e.a<Animator, b> g2 = g();
        Iterator<Animator> it = this.F.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (g2.containsKey(next)) {
                e();
                if (next != null) {
                    next.addListener(new j(this, g2));
                    long j2 = this.f2275g;
                    if (j2 >= 0) {
                        next.setDuration(j2);
                    }
                    long j3 = this.f2274f;
                    if (j3 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f2276h;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new k(this));
                    next.start();
                }
            }
        }
        this.F.clear();
        b();
    }

    public void e(View view) {
        if (this.C) {
            if (!this.D) {
                h.e.a<Animator, b> g2 = g();
                int i2 = g2.f1570g;
                f0 c2 = v.c(view);
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    b e2 = g2.e(i3);
                    if (e2.a != null && c2.equals(e2.d)) {
                        g2.c(i3).resume();
                    }
                }
                ArrayList<d> arrayList = this.E;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.E.clone();
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((d) arrayList2.get(i4)).b(this);
                    }
                }
            }
            this.C = false;
        }
    }

    public String toString() {
        return a("");
    }

    public i a(TimeInterpolator timeInterpolator) {
        this.f2276h = timeInterpolator;
        return this;
    }

    public boolean b(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f2281m;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f2282n;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f2283o;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f2283o.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f2284p != null && m.q(view) != null && this.f2284p.contains(view.getTransitionName())) {
            return false;
        }
        if ((this.f2277i.size() == 0 && this.f2278j.size() == 0 && (((arrayList = this.f2280l) == null || arrayList.isEmpty()) && ((arrayList2 = this.f2279k) == null || arrayList2.isEmpty()))) || this.f2277i.contains(Integer.valueOf(id)) || this.f2278j.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f2279k;
        if (arrayList6 != null && arrayList6.contains(m.q(view))) {
            return true;
        }
        if (this.f2280l != null) {
            for (int i3 = 0; i3 < this.f2280l.size(); i3++) {
                if (this.f2280l.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public i clone() {
        try {
            i iVar = (i) super.clone();
            iVar.F = new ArrayList<>();
            iVar.t = new r();
            iVar.u = new r();
            iVar.x = null;
            iVar.y = null;
            return iVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void a(ViewGroup viewGroup, r rVar, r rVar2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        int i2;
        Animator animator;
        q qVar;
        View view;
        q qVar2;
        Animator animator2;
        h.e.a<Animator, b> g2 = g();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            q qVar3 = arrayList.get(i3);
            q qVar4 = arrayList2.get(i3);
            if (qVar3 != null && !qVar3.c.contains(this)) {
                qVar3 = null;
            }
            if (qVar4 != null && !qVar4.c.contains(this)) {
                qVar4 = null;
            }
            if (!(qVar3 == null && qVar4 == null)) {
                if (qVar3 == null || qVar4 == null || a(qVar3, qVar4)) {
                    Animator a2 = a(viewGroup, qVar3, qVar4);
                    if (a2 != null) {
                        if (qVar4 != null) {
                            View view2 = qVar4.f2291b;
                            String[] c2 = c();
                            if (c2 != null && c2.length > 0) {
                                qVar2 = new q(view2);
                                q qVar5 = rVar2.a.get(view2);
                                if (qVar5 != null) {
                                    int i4 = 0;
                                    while (i4 < c2.length) {
                                        qVar2.a.put(c2[i4], qVar5.a.get(c2[i4]));
                                        i4++;
                                        a2 = a2;
                                        size = size;
                                        qVar5 = qVar5;
                                    }
                                }
                                Animator animator3 = a2;
                                i2 = size;
                                int i5 = g2.f1570g;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= i5) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    b bVar = g2.get(g2.c(i6));
                                    if (bVar.c != null && bVar.a == view2 && bVar.f2286b.equals(this.e) && bVar.c.equals(qVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                r rVar3 = rVar2;
                                i2 = size;
                                animator2 = a2;
                                qVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            qVar = qVar2;
                        } else {
                            r rVar4 = rVar2;
                            i2 = size;
                            view = qVar3.f2291b;
                            animator = a2;
                            qVar = null;
                        }
                        if (animator != null) {
                            g2.put(animator, new b(view, this.e, this, v.c(viewGroup), qVar));
                            this.F.add(animator);
                        }
                        i3++;
                        size = i2;
                    }
                    r rVar5 = rVar2;
                    i2 = size;
                    i3++;
                    size = i2;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            r rVar52 = rVar2;
            i2 = size;
            i3++;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator4 = this.F.get(sparseIntArray.keyAt(i7));
                animator4.setStartDelay(animator4.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - RecyclerView.FOREVER_NS));
            }
        }
    }

    public void c(View view) {
        if (!this.D) {
            h.e.a<Animator, b> g2 = g();
            int i2 = g2.f1570g;
            f0 c2 = v.c(view);
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                b e2 = g2.e(i3);
                if (e2.a != null && c2.equals(e2.d)) {
                    g2.c(i3).pause();
                }
            }
            ArrayList<d> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((d) arrayList2.get(i4)).a(this);
                }
            }
            this.C = true;
        }
    }

    public void e() {
        if (this.B == 0) {
            ArrayList<d> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).c(this);
                }
            }
            this.D = false;
        }
        this.B++;
    }

    public i d(View view) {
        this.f2278j.remove(view);
        return this;
    }

    public q b(View view, boolean z2) {
        o oVar = this.v;
        if (oVar != null) {
            return oVar.b(view, z2);
        }
        ArrayList<q> arrayList = z2 ? this.x : this.y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            q qVar = arrayList.get(i3);
            if (qVar == null) {
                return null;
            }
            if (qVar.f2291b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return null;
        }
        return (z2 ? this.y : this.x).get(i2);
    }

    public void b() {
        int i2 = this.B - 1;
        this.B = i2;
        if (i2 == 0) {
            ArrayList<d> arrayList = this.E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.E.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((d) arrayList2.get(i3)).e(this);
                }
            }
            for (int i4 = 0; i4 < this.t.c.d(); i4++) {
                View a2 = this.t.c.a(i4);
                if (a2 != null) {
                    m.b(a2, false);
                }
            }
            for (int i5 = 0; i5 < this.u.c.d(); i5++) {
                View a3 = this.u.c.a(i5);
                if (a3 != null) {
                    m.b(a3, false);
                }
            }
            this.D = true;
        }
    }

    public i a(View view) {
        this.f2278j.add(view);
        return this;
    }

    public void a(ViewGroup viewGroup, boolean z2) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        a(z2);
        if ((this.f2277i.size() > 0 || this.f2278j.size() > 0) && (((arrayList = this.f2279k) == null || arrayList.isEmpty()) && ((arrayList2 = this.f2280l) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f2277i.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.f2277i.get(i2).intValue());
                if (findViewById != null) {
                    q qVar = new q(findViewById);
                    if (z2) {
                        c(qVar);
                    } else {
                        a(qVar);
                    }
                    qVar.c.add(this);
                    b(qVar);
                    if (z2) {
                        a(this.t, findViewById, qVar);
                    } else {
                        a(this.u, findViewById, qVar);
                    }
                }
            }
            for (int i3 = 0; i3 < this.f2278j.size(); i3++) {
                View view = this.f2278j.get(i3);
                q qVar2 = new q(view);
                if (z2) {
                    c(qVar2);
                } else {
                    a(qVar2);
                }
                qVar2.c.add(this);
                b(qVar2);
                if (z2) {
                    a(this.t, view, qVar2);
                } else {
                    a(this.u, view, qVar2);
                }
            }
            return;
        }
        a((View) viewGroup, z2);
    }

    public i b(d dVar) {
        ArrayList<d> arrayList = this.E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.E.size() == 0) {
            this.E = null;
        }
        return this;
    }

    public static void a(r rVar, View view, q qVar) {
        rVar.a.put(view, qVar);
        int id = view.getId();
        if (id >= 0) {
            if (rVar.f2292b.indexOfKey(id) >= 0) {
                rVar.f2292b.put(id, (Object) null);
            } else {
                rVar.f2292b.put(id, view);
            }
        }
        String q2 = m.q(view);
        if (q2 != null) {
            if (rVar.d.a((Object) q2) >= 0) {
                rVar.d.put(q2, null);
            } else {
                rVar.d.put(q2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                e<View> eVar = rVar.c;
                if (eVar.e) {
                    eVar.c();
                }
                if (h.e.d.a(eVar.f1551f, eVar.f1553h, itemIdAtPosition) >= 0) {
                    View a2 = rVar.c.a(itemIdAtPosition);
                    if (a2 != null) {
                        a2.setHasTransientState(false);
                        rVar.c.c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                rVar.c.c(itemIdAtPosition, view);
            }
        }
    }

    public void a(boolean z2) {
        if (z2) {
            this.t.a.clear();
            this.t.f2292b.clear();
            this.t.c.b();
            return;
        }
        this.u.a.clear();
        this.u.f2292b.clear();
        this.u.c.b();
    }

    public final void a(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f2281m;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f2282n;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f2283o;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            if (!this.f2283o.get(i2).isInstance(view)) {
                                i2++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        q qVar = new q(view);
                        if (z2) {
                            c(qVar);
                        } else {
                            a(qVar);
                        }
                        qVar.c.add(this);
                        b(qVar);
                        if (z2) {
                            a(this.t, view, qVar);
                        } else {
                            a(this.u, view, qVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f2285q;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.r;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.s;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        if (!this.s.get(i3).isInstance(view)) {
                                            i3++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    a(viewGroup.getChildAt(i4), z2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean a(q qVar, q qVar2) {
        if (qVar == null || qVar2 == null) {
            return false;
        }
        String[] c2 = c();
        if (c2 != null) {
            int length = c2.length;
            int i2 = 0;
            while (i2 < length) {
                if (!a(qVar, qVar2, c2[i2])) {
                    i2++;
                }
            }
            return false;
        }
        for (String a2 : qVar.a.keySet()) {
            if (a(qVar, qVar2, a2)) {
            }
        }
        return false;
        return true;
    }

    public static boolean a(q qVar, q qVar2, String str) {
        Object obj = qVar.a.get(str);
        Object obj2 = qVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public i a(d dVar) {
        if (this.E == null) {
            this.E = new ArrayList<>();
        }
        this.E.add(dVar);
        return this;
    }

    public void a(e eVar) {
        if (eVar == null) {
            this.I = K;
        } else {
            this.I = eVar;
        }
    }

    public void a(c cVar) {
        this.H = cVar;
    }

    public void a(n nVar) {
        this.G = nVar;
    }

    public String a(String str) {
        StringBuilder a2 = i.a.a.a.a.a(str);
        a2.append(getClass().getSimpleName());
        a2.append("@");
        a2.append(Integer.toHexString(hashCode()));
        a2.append(": ");
        String sb = a2.toString();
        if (this.f2275g != -1) {
            StringBuilder a3 = i.a.a.a.a.a(sb, "dur(");
            a3.append(this.f2275g);
            a3.append(") ");
            sb = a3.toString();
        }
        if (this.f2274f != -1) {
            StringBuilder a4 = i.a.a.a.a.a(sb, "dly(");
            a4.append(this.f2274f);
            a4.append(") ");
            sb = a4.toString();
        }
        if (this.f2276h != null) {
            StringBuilder a5 = i.a.a.a.a.a(sb, "interp(");
            a5.append(this.f2276h);
            a5.append(") ");
            sb = a5.toString();
        }
        if (this.f2277i.size() <= 0 && this.f2278j.size() <= 0) {
            return sb;
        }
        String b2 = i.a.a.a.a.b(sb, "tgts(");
        if (this.f2277i.size() > 0) {
            for (int i2 = 0; i2 < this.f2277i.size(); i2++) {
                if (i2 > 0) {
                    b2 = i.a.a.a.a.b(b2, ", ");
                }
                StringBuilder a6 = i.a.a.a.a.a(b2);
                a6.append(this.f2277i.get(i2));
                b2 = a6.toString();
            }
        }
        if (this.f2278j.size() > 0) {
            for (int i3 = 0; i3 < this.f2278j.size(); i3++) {
                if (i3 > 0) {
                    b2 = i.a.a.a.a.b(b2, ", ");
                }
                StringBuilder a7 = i.a.a.a.a.a(b2);
                a7.append(this.f2278j.get(i3));
                b2 = a7.toString();
            }
        }
        return i.a.a.a.a.b(b2, ")");
    }
}
