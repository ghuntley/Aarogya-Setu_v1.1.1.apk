package h.b.o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import h.b.o.a;
import h.b.o.i.j;
import h.b.o.i.o;
import h.e.h;
import h.h.h.a.b;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper */
public class e extends ActionMode {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1216b;

    public e(Context context, a aVar) {
        this.a = context;
        this.f1216b = aVar;
    }

    public void finish() {
        this.f1216b.a();
    }

    public View getCustomView() {
        return this.f1216b.b();
    }

    public Menu getMenu() {
        return new o(this.a, (h.h.h.a.a) this.f1216b.c());
    }

    public MenuInflater getMenuInflater() {
        return this.f1216b.d();
    }

    public CharSequence getSubtitle() {
        return this.f1216b.e();
    }

    public Object getTag() {
        return this.f1216b.e;
    }

    public CharSequence getTitle() {
        return this.f1216b.f();
    }

    public boolean getTitleOptionalHint() {
        return this.f1216b.f1208f;
    }

    public void invalidate() {
        this.f1216b.g();
    }

    public boolean isTitleOptional() {
        return this.f1216b.h();
    }

    public void setCustomView(View view) {
        this.f1216b.a(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1216b.a(charSequence);
    }

    public void setTag(Object obj) {
        this.f1216b.e = obj;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1216b.b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f1216b.a(z);
    }

    public void setSubtitle(int i2) {
        this.f1216b.a(i2);
    }

    public void setTitle(int i2) {
        this.f1216b.b(i2);
    }

    /* compiled from: SupportActionModeWrapper */
    public static class a implements a.C0035a {
        public final ActionMode.Callback a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f1217b;
        public final ArrayList<e> c = new ArrayList<>();
        public final h<Menu, Menu> d = new h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f1217b = context;
            this.a = callback;
        }

        public boolean a(a aVar, Menu menu) {
            return this.a.onPrepareActionMode(b(aVar), a(menu));
        }

        public boolean b(a aVar, Menu menu) {
            return this.a.onCreateActionMode(b(aVar), a(menu));
        }

        public boolean a(a aVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(b(aVar), new j(this.f1217b, (b) menuItem));
        }

        public ActionMode b(a aVar) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.c.get(i2);
                if (eVar != null && eVar.f1216b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f1217b, aVar);
            this.c.add(eVar2);
            return eVar2;
        }

        public void a(a aVar) {
            this.a.onDestroyActionMode(b(aVar));
        }

        public final Menu a(Menu menu) {
            Menu orDefault = this.d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            o oVar = new o(this.f1217b, (h.h.h.a.a) menu);
            this.d.put(menu, oVar);
            return oVar;
        }
    }
}
