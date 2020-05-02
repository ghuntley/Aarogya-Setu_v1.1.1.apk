package h.b.o.i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import h.e.h;
import h.h.h.a.b;

/* compiled from: BaseMenuWrapper */
public abstract class c {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public h<b, MenuItem> f1257b;
    public h<h.h.h.a.c, SubMenu> c;

    public c(Context context) {
        this.a = context;
    }

    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f1257b == null) {
            this.f1257b = new h<>();
        }
        MenuItem orDefault = this.f1257b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        j jVar = new j(this.a, bVar);
        this.f1257b.put(bVar, jVar);
        return jVar;
    }

    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof h.h.h.a.c)) {
            return subMenu;
        }
        h.h.h.a.c cVar = (h.h.h.a.c) subMenu;
        if (this.c == null) {
            this.c = new h<>();
        }
        SubMenu subMenu2 = this.c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, cVar);
        this.c.put(cVar, sVar);
        return sVar;
    }
}
