package h.l.d;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* compiled from: FragmentTransition */
public final class e0 implements Runnable {
    public final /* synthetic */ Object e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m0 f1955f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ View f1956g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Fragment f1957h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1958i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1959j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1960k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f1961l;

    public e0(Object obj, m0 m0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.e = obj;
        this.f1955f = m0Var;
        this.f1956g = view;
        this.f1957h = fragment;
        this.f1958i = arrayList;
        this.f1959j = arrayList2;
        this.f1960k = arrayList3;
        this.f1961l = obj2;
    }

    public void run() {
        Object obj = this.e;
        if (obj != null) {
            this.f1955f.b(obj, this.f1956g);
            this.f1959j.addAll(h0.a(this.f1955f, this.e, this.f1957h, (ArrayList<View>) this.f1958i, this.f1956g));
        }
        if (this.f1960k != null) {
            if (this.f1961l != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f1956g);
                this.f1955f.a(this.f1961l, (ArrayList<View>) this.f1960k, (ArrayList<View>) arrayList);
            }
            this.f1960k.clear();
            this.f1960k.add(this.f1956g);
        }
    }
}
