package h.r.d;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DefaultItemAnimator */
public class k extends v {
    public static TimeInterpolator s;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<RecyclerView.d0> f2098h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<RecyclerView.d0> f2099i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<b> f2100j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<a> f2101k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.d0>> f2102l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ArrayList<b>> f2103m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<ArrayList<a>> f2104n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<RecyclerView.d0> f2105o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<RecyclerView.d0> f2106p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<RecyclerView.d0> f2107q = new ArrayList<>();
    public ArrayList<RecyclerView.d0> r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator */
    public static class a {
        public RecyclerView.d0 a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.d0 f2108b;
        public int c;
        public int d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f2109f;

        public a(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i2, int i3, int i4, int i5) {
            this.a = d0Var;
            this.f2108b = d0Var2;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f2109f = i5;
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("ChangeInfo{oldHolder=");
            a2.append(this.a);
            a2.append(", newHolder=");
            a2.append(this.f2108b);
            a2.append(", fromX=");
            a2.append(this.c);
            a2.append(", fromY=");
            a2.append(this.d);
            a2.append(", toX=");
            a2.append(this.e);
            a2.append(", toY=");
            a2.append(this.f2109f);
            a2.append('}');
            return a2.toString();
        }
    }

    /* compiled from: DefaultItemAnimator */
    public static class b {
        public RecyclerView.d0 a;

        /* renamed from: b  reason: collision with root package name */
        public int f2110b;
        public int c;
        public int d;
        public int e;

        public b(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
            this.a = d0Var;
            this.f2110b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public boolean a(RecyclerView.d0 d0Var, int i2, int i3, int i4, int i5) {
        View view = d0Var.e;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) d0Var.e.getTranslationY());
        e(d0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            a(d0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.f2100j.add(new b(d0Var, translationX, translationY, i4, i5));
        return true;
    }

    public void b(RecyclerView.d0 d0Var) {
        View view = d0Var.e;
        view.animate().cancel();
        int size = this.f2100j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2100j.get(size).a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                a(d0Var);
                this.f2100j.remove(size);
            }
        }
        a((List<a>) this.f2101k, d0Var);
        if (this.f2098h.remove(d0Var)) {
            view.setAlpha(1.0f);
            a(d0Var);
        }
        if (this.f2099i.remove(d0Var)) {
            view.setAlpha(1.0f);
            a(d0Var);
        }
        for (int size2 = this.f2104n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f2104n.get(size2);
            a((List<a>) arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f2104n.remove(size2);
            }
        }
        for (int size3 = this.f2103m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f2103m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((b) arrayList2.get(size4)).a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    a(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2103m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2102l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f2102l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                a(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f2102l.remove(size5);
                }
            }
        }
        this.f2107q.remove(d0Var);
        this.f2105o.remove(d0Var);
        this.r.remove(d0Var);
        this.f2106p.remove(d0Var);
        d();
    }

    public boolean c() {
        return !this.f2099i.isEmpty() || !this.f2101k.isEmpty() || !this.f2100j.isEmpty() || !this.f2098h.isEmpty() || !this.f2106p.isEmpty() || !this.f2107q.isEmpty() || !this.f2105o.isEmpty() || !this.r.isEmpty() || !this.f2103m.isEmpty() || !this.f2102l.isEmpty() || !this.f2104n.isEmpty();
    }

    public void d() {
        if (!c()) {
            a();
        }
    }

    public final void e(RecyclerView.d0 d0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        d0Var.e.animate().setInterpolator(s);
        b(d0Var);
    }

    public final void a(List<a> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = list.get(size);
            if (a(aVar, d0Var) && aVar.a == null && aVar.f2108b == null) {
                list.remove(aVar);
            }
        }
    }

    public final boolean a(a aVar, RecyclerView.d0 d0Var) {
        if (aVar.f2108b == d0Var) {
            aVar.f2108b = null;
        } else if (aVar.a != d0Var) {
            return false;
        } else {
            aVar.a = null;
        }
        d0Var.e.setAlpha(1.0f);
        d0Var.e.setTranslationX(0.0f);
        d0Var.e.setTranslationY(0.0f);
        a(d0Var);
        return true;
    }

    public void a(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).e.animate().cancel();
        }
    }

    public boolean a(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.a(d0Var, list);
    }

    public void b() {
        int size = this.f2100j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.f2100j.get(size);
            View view = bVar.a.e;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            a(bVar.a);
            this.f2100j.remove(size);
        }
        int size2 = this.f2098h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            a(this.f2098h.get(size2));
            this.f2098h.remove(size2);
        }
        int size3 = this.f2099i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.f2099i.get(size3);
            d0Var.e.setAlpha(1.0f);
            a(d0Var);
            this.f2099i.remove(size3);
        }
        int size4 = this.f2101k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.f2101k.get(size4);
            RecyclerView.d0 d0Var2 = aVar.a;
            if (d0Var2 != null) {
                a(aVar, d0Var2);
            }
            RecyclerView.d0 d0Var3 = aVar.f2108b;
            if (d0Var3 != null) {
                a(aVar, d0Var3);
            }
        }
        this.f2101k.clear();
        if (c()) {
            int size5 = this.f2103m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f2103m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        b bVar2 = (b) arrayList.get(size6);
                        View view2 = bVar2.a.e;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        a(bVar2.a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f2103m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f2102l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = this.f2102l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.d0 d0Var4 = (RecyclerView.d0) arrayList2.get(size8);
                        d0Var4.e.setAlpha(1.0f);
                        a(d0Var4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f2102l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f2104n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f2104n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            a aVar2 = (a) arrayList3.get(size10);
                            RecyclerView.d0 d0Var5 = aVar2.a;
                            if (d0Var5 != null) {
                                a(aVar2, d0Var5);
                            }
                            RecyclerView.d0 d0Var6 = aVar2.f2108b;
                            if (d0Var6 != null) {
                                a(aVar2, d0Var6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f2104n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    a(this.f2107q);
                    a(this.f2106p);
                    a(this.f2105o);
                    a(this.r);
                    a();
                    return;
                }
            }
        }
    }
}
