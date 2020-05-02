package h.l.d;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionCompat21 */
public class i0 extends m0 {

    /* compiled from: FragmentTransitionCompat21 */
    public class a extends Transition.EpicenterCallback {
        public final /* synthetic */ Rect a;

        public a(i0 i0Var, Rect rect) {
            this.a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.a;
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    public class b implements Transition.TransitionListener {
        public final /* synthetic */ View a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1985b;

        public b(i0 i0Var, View view, ArrayList arrayList) {
            this.a = view;
            this.f1985b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.a.setVisibility(8);
            int size = this.f1985b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f1985b.get(i2)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    public class c implements Transition.TransitionListener {
        public final /* synthetic */ Object a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1986b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1987f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.f1986b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f1987f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.a;
            if (obj != null) {
                i0.this.a(obj, (ArrayList<View>) this.f1986b, (ArrayList<View>) null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                i0.this.a(obj2, (ArrayList<View>) this.d, (ArrayList<View>) null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                i0.this.a(obj3, (ArrayList<View>) this.f1987f, (ArrayList<View>) null);
            }
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    public class d implements Transition.TransitionListener {
        public final /* synthetic */ Runnable a;

        public d(i0 i0Var, Runnable runnable) {
            this.a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionCompat21 */
    public class e extends Transition.EpicenterCallback {
        public final /* synthetic */ Rect a;

        public e(i0 i0Var, Rect rect) {
            this.a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.a;
        }
    }

    public boolean a(Object obj) {
        return obj instanceof Transition;
    }

    public Object b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public void a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i2 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i2 < transitionCount) {
                    a((Object) transitionSet.getTransitionAt(i2), arrayList);
                    i2++;
                }
            } else if (!a(transition) && m0.a((List) transition.getTargets())) {
                int size = arrayList.size();
                while (i2 < size) {
                    transition.addTarget(arrayList.get(i2));
                    i2++;
                }
            }
        }
    }

    public void b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m0.a((List<View>) targets, arrayList.get(i2));
        }
        targets.add(view);
        arrayList.add(view);
        a((Object) transitionSet, arrayList);
    }

    public void c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            a(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    public Object b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public static boolean a(Transition transition) {
        return !m0.a((List) transition.getTargetIds()) || !m0.a((List) transition.getTargetNames()) || !m0.a((List) transition.getTargetTypes());
    }

    public void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    public void a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view, arrayList));
    }

    public Object a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public void b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    public void a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void a(Fragment fragment, Object obj, h.h.i.a aVar, Runnable runnable) {
        ((Transition) obj).addListener(new d(this, runnable));
    }

    public void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i2;
        Transition transition = (Transition) obj;
        int i3 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i3 < transitionCount) {
                a((Object) transitionSet.getTransitionAt(i3), arrayList, arrayList2);
                i3++;
            }
        } else if (!a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i2 = 0;
            } else {
                i2 = arrayList2.size();
            }
            while (i3 < i2) {
                transition.addTarget(arrayList2.get(i3));
                i3++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public void a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(this, rect));
        }
    }
}
