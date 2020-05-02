package h.l.d;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import h.e.a;

/* compiled from: FragmentTransition */
public final class f0 implements Runnable {
    public final /* synthetic */ Fragment e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Fragment f1962f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f1963g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f1964h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ View f1965i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ m0 f1966j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Rect f1967k;

    public f0(Fragment fragment, Fragment fragment2, boolean z, a aVar, View view, m0 m0Var, Rect rect) {
        this.e = fragment;
        this.f1962f = fragment2;
        this.f1963g = z;
        this.f1964h = aVar;
        this.f1965i = view;
        this.f1966j = m0Var;
        this.f1967k = rect;
    }

    public void run() {
        h0.a(this.e, this.f1962f, this.f1963g, (a<String, View>) this.f1964h, false);
        View view = this.f1965i;
        if (view != null) {
            this.f1966j.a(view, this.f1967k);
        }
    }
}
