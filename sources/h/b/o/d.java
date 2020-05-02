package h.b.o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import h.b.o.a;
import h.b.o.i.g;
import h.b.p.c;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode */
public class d extends a implements g.a {

    /* renamed from: g  reason: collision with root package name */
    public Context f1210g;

    /* renamed from: h  reason: collision with root package name */
    public ActionBarContextView f1211h;

    /* renamed from: i  reason: collision with root package name */
    public a.C0035a f1212i;

    /* renamed from: j  reason: collision with root package name */
    public WeakReference<View> f1213j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1214k;

    /* renamed from: l  reason: collision with root package name */
    public g f1215l;

    public d(Context context, ActionBarContextView actionBarContextView, a.C0035a aVar, boolean z) {
        this.f1210g = context;
        this.f1211h = actionBarContextView;
        this.f1212i = aVar;
        g gVar = new g(actionBarContextView.getContext());
        gVar.f1295l = 1;
        this.f1215l = gVar;
        gVar.e = this;
    }

    public void a(CharSequence charSequence) {
        this.f1211h.setSubtitle(charSequence);
    }

    public void b(CharSequence charSequence) {
        this.f1211h.setTitle(charSequence);
    }

    public Menu c() {
        return this.f1215l;
    }

    public MenuInflater d() {
        return new f(this.f1211h.getContext());
    }

    public CharSequence e() {
        return this.f1211h.getSubtitle();
    }

    public CharSequence f() {
        return this.f1211h.getTitle();
    }

    public void g() {
        this.f1212i.a((a) this, (Menu) this.f1215l);
    }

    public boolean h() {
        return this.f1211h.v;
    }

    public void a(int i2) {
        this.f1211h.setSubtitle(this.f1210g.getString(i2));
    }

    public void b(int i2) {
        this.f1211h.setTitle(this.f1210g.getString(i2));
    }

    public void a(View view) {
        this.f1211h.setCustomView(view);
        this.f1213j = view != null ? new WeakReference<>(view) : null;
    }

    public View b() {
        WeakReference<View> weakReference = this.f1213j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public void a() {
        if (!this.f1214k) {
            this.f1214k = true;
            this.f1211h.sendAccessibilityEvent(32);
            this.f1212i.a(this);
        }
    }

    public void a(boolean z) {
        this.f1208f = z;
        this.f1211h.setTitleOptional(z);
    }

    public boolean a(g gVar, MenuItem menuItem) {
        return this.f1212i.a((a) this, menuItem);
    }

    public void a(g gVar) {
        g();
        c cVar = this.f1211h.f1341h;
        if (cVar != null) {
            cVar.f();
        }
    }
}
