package i.c.a.c.m;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import h.h.m.w.d;

/* compiled from: AppBarLayout */
public class c implements d {
    public final /* synthetic */ CoordinatorLayout a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f4155b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ AppBarLayout.BaseBehavior e;

    public c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
        this.e = baseBehavior;
        this.a = coordinatorLayout;
        this.f4155b = appBarLayout;
        this.c = view;
        this.d = i2;
    }

    public boolean a(View view, d.a aVar) {
        this.e.a(this.a, this.f4155b, this.c, this.d, new int[]{0, 0});
        return true;
    }
}
