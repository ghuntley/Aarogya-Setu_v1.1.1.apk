package h.l.d;

import android.view.View;
import h.h.m.m;
import java.util.ArrayList;

/* compiled from: FragmentTransitionImpl */
public class j0 implements Runnable {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1993f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1994g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1995h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1996i;

    public j0(m0 m0Var, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.e = i2;
        this.f1993f = arrayList;
        this.f1994g = arrayList2;
        this.f1995h = arrayList3;
        this.f1996i = arrayList4;
    }

    public void run() {
        for (int i2 = 0; i2 < this.e; i2++) {
            m.a((View) this.f1993f.get(i2), (String) this.f1994g.get(i2));
            ((View) this.f1995h.get(i2)).setTransitionName((String) this.f1996i.get(i2));
        }
    }
}
