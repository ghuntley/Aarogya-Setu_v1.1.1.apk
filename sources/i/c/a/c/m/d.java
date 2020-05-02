package i.c.a.c.m;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import h.h.m.w.d;

/* compiled from: AppBarLayout */
public class d implements h.h.m.w.d {
    public final /* synthetic */ AppBarLayout a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f4156b;

    public d(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.f4156b = z;
    }

    public boolean a(View view, d.a aVar) {
        this.a.setExpanded(this.f4156b);
        return true;
    }
}
