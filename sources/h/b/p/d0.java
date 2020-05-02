package h.b.p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import h.b.o.i.m;
import h.h.m.r;

/* compiled from: DecorToolbar */
public interface d0 {
    r a(int i2, long j2);

    void a(int i2);

    void a(Menu menu, m.a aVar);

    void a(q0 q0Var);

    void a(boolean z);

    boolean a();

    void b(int i2);

    void b(boolean z);

    boolean b();

    Context c();

    void c(int i2);

    void collapseActionView();

    boolean d();

    boolean e();

    void f();

    boolean g();

    CharSequence getTitle();

    void h();

    int i();

    ViewGroup j();

    int k();

    void l();

    boolean m();

    void n();

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
