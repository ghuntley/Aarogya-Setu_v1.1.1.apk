package h.w;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import h.h.m.m;
import h.l.d.m0;
import h.w.i;
import h.w.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* compiled from: FragmentTransitionSupport */
public class d extends m0 {

    /* compiled from: FragmentTransitionSupport */
    public class a extends i.c {
        public a(d dVar, Rect rect) {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    public class b implements i.d {
        public final /* synthetic */ View a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2266b;

        public b(d dVar, View view, ArrayList arrayList) {
            this.a = view;
            this.f2266b = arrayList;
        }

        public void a(i iVar) {
        }

        public void b(i iVar) {
        }

        public void c(i iVar) {
        }

        public void d(i iVar) {
        }

        public void e(i iVar) {
            iVar.b((i.d) this);
            this.a.setVisibility(8);
            int size = this.f2266b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f2266b.get(i2)).setVisibility(0);
            }
        }
    }

    /* compiled from: FragmentTransitionSupport */
    public class c extends l {
        public final /* synthetic */ Object a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2267b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2268f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.f2267b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f2268f = arrayList3;
        }

        public void c(i iVar) {
            Object obj = this.a;
            if (obj != null) {
                d.this.a(obj, (ArrayList<View>) this.f2267b, (ArrayList<View>) null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                d.this.a(obj2, (ArrayList<View>) this.d, (ArrayList<View>) null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                d.this.a(obj3, (ArrayList<View>) this.f2268f, (ArrayList<View>) null);
            }
        }

        public void e(i iVar) {
            iVar.b((i.d) this);
        }
    }

    /* renamed from: h.w.d$d  reason: collision with other inner class name */
    /* compiled from: FragmentTransitionSupport */
    public class C0073d extends i.c {
        public C0073d(d dVar, Rect rect) {
        }
    }

    public boolean a(Object obj) {
        return obj instanceof i;
    }

    public Object b(Object obj) {
        if (obj != null) {
            return ((i) obj).clone();
        }
        return null;
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        o oVar = new o();
        oVar.a((i) obj);
        return oVar;
    }

    public void a(Object obj, ArrayList<View> arrayList) {
        i iVar = (i) obj;
        if (iVar != null) {
            int i2 = 0;
            if (iVar instanceof o) {
                o oVar = (o) iVar;
                int size = oVar.M.size();
                while (i2 < size) {
                    a((Object) oVar.a(i2), arrayList);
                    i2++;
                }
            } else if (!a(iVar) && m0.a((List) iVar.f2278j)) {
                int size2 = arrayList.size();
                while (i2 < size2) {
                    iVar.a(arrayList.get(i2));
                    i2++;
                }
            }
        }
    }

    public void b(Object obj, View view, ArrayList<View> arrayList) {
        o oVar = (o) obj;
        ArrayList<View> arrayList2 = oVar.f2278j;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m0.a((List<View>) arrayList2, arrayList.get(i2));
        }
        arrayList2.add(view);
        arrayList.add(view);
        a((Object) oVar, arrayList);
    }

    public void c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            a(view, rect);
            ((i) obj).a((i.c) new a(this, rect));
        }
    }

    public Object b(Object obj, Object obj2, Object obj3) {
        o oVar = new o();
        if (obj != null) {
            oVar.a((i) obj);
        }
        if (obj2 != null) {
            oVar.a((i) obj2);
        }
        if (obj3 != null) {
            oVar.a((i) obj3);
        }
        return oVar;
    }

    public void a(Object obj, View view, ArrayList<View> arrayList) {
        ((i) obj).a((i.d) new b(this, view, arrayList));
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        i iVar3 = (i) obj3;
        if (iVar != null && iVar2 != null) {
            o oVar = new o();
            oVar.a(iVar);
            oVar.a(iVar2);
            oVar.b(1);
            iVar = oVar;
        } else if (iVar == null) {
            iVar = iVar2 != null ? iVar2 : null;
        }
        if (iVar3 == null) {
            return iVar;
        }
        o oVar2 = new o();
        if (iVar != null) {
            oVar2.a(iVar);
        }
        oVar2.a(iVar3);
        return oVar2;
    }

    public void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        o oVar = (o) obj;
        if (oVar != null) {
            oVar.f2278j.clear();
            oVar.f2278j.addAll(arrayList2);
            a((Object) oVar, arrayList, arrayList2);
        }
    }

    public void b(Object obj, View view) {
        if (obj != null) {
            ((i) obj).d(view);
        }
    }

    public void a(ViewGroup viewGroup, Object obj) {
        i iVar = (i) obj;
        if (!m.c.contains(viewGroup) && m.x(viewGroup)) {
            m.c.add(viewGroup);
            if (iVar == null) {
                iVar = m.a;
            }
            i clone = iVar.clone();
            ArrayList orDefault = m.a().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator it = orDefault.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).c((View) viewGroup);
                }
            }
            if (clone != null) {
                clone.a(viewGroup, true);
            }
            if (((h) viewGroup.getTag(f.transition_current_scene)) == null) {
                viewGroup.setTag(f.transition_current_scene, (Object) null);
                if (clone != null) {
                    m.a aVar = new m.a(clone, viewGroup);
                    viewGroup.addOnAttachStateChangeListener(aVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((i) obj).a((i.d) new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i2;
        i iVar = (i) obj;
        int i3 = 0;
        if (iVar instanceof o) {
            o oVar = (o) iVar;
            int size = oVar.M.size();
            while (i3 < size) {
                a((Object) oVar.a(i3), arrayList, arrayList2);
                i3++;
            }
        } else if (!a(iVar)) {
            ArrayList<View> arrayList3 = iVar.f2278j;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i2 = 0;
                } else {
                    i2 = arrayList2.size();
                }
                while (i3 < i2) {
                    iVar.a(arrayList2.get(i3));
                    i3++;
                }
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        iVar.d(arrayList.get(size2));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((i) obj).a(view);
        }
    }

    public void a(Object obj, Rect rect) {
        if (obj != null) {
            ((i) obj).a((i.c) new C0073d(this, rect));
        }
    }

    public static boolean a(i iVar) {
        return !m0.a((List) iVar.f2277i) || !m0.a((List) iVar.f2279k) || !m0.a((List) iVar.f2280l);
    }
}
