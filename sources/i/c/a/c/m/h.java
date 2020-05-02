package i.c.a.c.m;

import android.view.View;
import h.h.m.m;

/* compiled from: ViewOffsetHelper */
public class h {
    public final View a;

    /* renamed from: b  reason: collision with root package name */
    public int f4167b;
    public int c;
    public int d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4168f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4169g = true;

    public h(View view) {
        this.a = view;
    }

    public void a() {
        View view = this.a;
        m.e(view, this.d - (view.getTop() - this.f4167b));
        View view2 = this.a;
        m.d(view2, this.e - (view2.getLeft() - this.c));
    }
}
