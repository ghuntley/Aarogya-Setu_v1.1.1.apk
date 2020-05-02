package h.l.d;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import h.e.a;
import h.l.d.h0;
import java.util.ArrayList;

/* compiled from: FragmentTransition */
public final class g0 implements Runnable {
    public final /* synthetic */ m0 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f1969f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f1970g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ h0.b f1971h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1972i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ View f1973j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Fragment f1974k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Fragment f1975l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f1976m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1977n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f1978o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Rect f1979p;

    public g0(m0 m0Var, a aVar, Object obj, h0.b bVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.e = m0Var;
        this.f1969f = aVar;
        this.f1970g = obj;
        this.f1971h = bVar;
        this.f1972i = arrayList;
        this.f1973j = view;
        this.f1974k = fragment;
        this.f1975l = fragment2;
        this.f1976m = z;
        this.f1977n = arrayList2;
        this.f1978o = obj2;
        this.f1979p = rect;
    }

    public void run() {
        a<String, View> a = h0.a(this.e, (a<String, String>) this.f1969f, this.f1970g, this.f1971h);
        if (a != null) {
            this.f1972i.addAll(a.values());
            this.f1972i.add(this.f1973j);
        }
        h0.a(this.f1974k, this.f1975l, this.f1976m, a, false);
        Object obj = this.f1970g;
        if (obj != null) {
            this.e.b(obj, (ArrayList<View>) this.f1977n, (ArrayList<View>) this.f1972i);
            View a2 = h0.a(a, this.f1971h, this.f1978o, this.f1976m);
            if (a2 != null) {
                this.e.a(a2, this.f1979p);
            }
        }
    }
}
