package h.b.o.i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import h.b.o.i.m;
import h.b.o.i.n;
import h.b.p.c;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter */
public abstract class b implements m {
    public Context e;

    /* renamed from: f  reason: collision with root package name */
    public Context f1250f;

    /* renamed from: g  reason: collision with root package name */
    public g f1251g;

    /* renamed from: h  reason: collision with root package name */
    public LayoutInflater f1252h;

    /* renamed from: i  reason: collision with root package name */
    public m.a f1253i;

    /* renamed from: j  reason: collision with root package name */
    public int f1254j;

    /* renamed from: k  reason: collision with root package name */
    public int f1255k;

    /* renamed from: l  reason: collision with root package name */
    public n f1256l;

    public b(Context context, int i2, int i3) {
        this.e = context;
        this.f1252h = LayoutInflater.from(context);
        this.f1254j = i2;
        this.f1255k = i3;
    }

    public void a(boolean z) {
        int i2;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f1256l;
        if (viewGroup != null) {
            g gVar = this.f1251g;
            if (gVar != null) {
                gVar.a();
                ArrayList<i> d = this.f1251g.d();
                int size = d.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar = d.get(i3);
                    if (iVar.d()) {
                        View childAt = viewGroup.getChildAt(i2);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View a = a(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f1256l).addView(a, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == ((c) this).f1369m) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i2);
                    z2 = true;
                }
                if (!z2) {
                    i2++;
                }
            }
        }
    }

    public boolean a(g gVar, i iVar) {
        return false;
    }

    public boolean b(g gVar, i iVar) {
        return false;
    }

    public void a(m.a aVar) {
        this.f1253i = aVar;
    }

    public View a(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar;
        if (view instanceof n.a) {
            aVar = (n.a) view;
        } else {
            aVar = (n.a) this.f1252h.inflate(this.f1255k, viewGroup, false);
        }
        c cVar = (c) this;
        aVar.a(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) cVar.f1256l);
        if (cVar.A == null) {
            cVar.A = new c.b();
        }
        actionMenuItemView.setPopupCallback(cVar.A);
        return (View) aVar;
    }

    public boolean a(r rVar) {
        m.a aVar = this.f1253i;
        if (aVar != null) {
            return aVar.a(rVar);
        }
        return false;
    }
}
