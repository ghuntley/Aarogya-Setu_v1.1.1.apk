package h.b.o.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import com.crashlytics.android.core.CodedOutputStream;
import h.h.h.a.b;
import h.h.m.b;

/* compiled from: MenuItemImpl */
public final class i implements b {
    public h.h.m.b A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;
    public ContextMenu.ContextMenuInfo D;
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1303b;
    public final int c;
    public final int d;
    public CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f1304f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f1305g;

    /* renamed from: h  reason: collision with root package name */
    public char f1306h;

    /* renamed from: i  reason: collision with root package name */
    public int f1307i = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* renamed from: j  reason: collision with root package name */
    public char f1308j;

    /* renamed from: k  reason: collision with root package name */
    public int f1309k = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f1310l;

    /* renamed from: m  reason: collision with root package name */
    public int f1311m = 0;

    /* renamed from: n  reason: collision with root package name */
    public g f1312n;

    /* renamed from: o  reason: collision with root package name */
    public r f1313o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f1314p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f1315q;
    public CharSequence r;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public int y = 0;
    public View z;

    /* compiled from: MenuItemImpl */
    public class a implements b.a {
        public a() {
        }
    }

    public i(g gVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f1312n = gVar;
        this.a = i3;
        this.f1303b = i2;
        this.c = i4;
        this.d = i5;
        this.e = charSequence;
        this.y = i6;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public char b() {
        return this.f1312n.f() ? this.f1308j : this.f1306h;
    }

    public boolean c(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 0 : 8) | (i2 & -9);
        this.x = i3;
        if (i2 != i3) {
            return true;
        }
        return false;
    }

    public boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1312n.a(this);
        }
        return false;
    }

    public boolean d() {
        return (this.x & 32) == 32;
    }

    public boolean e() {
        return (this.x & 4) != 0;
    }

    public boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1312n.b(this);
        }
        return false;
    }

    public boolean f() {
        return this.f1312n.g() && b() != 0;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        h.h.m.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View a2 = bVar.a((MenuItem) this);
        this.z = a2;
        return a2;
    }

    public int getAlphabeticModifiers() {
        return this.f1309k;
    }

    public char getAlphabeticShortcut() {
        return this.f1308j;
    }

    public CharSequence getContentDescription() {
        return this.f1315q;
    }

    public int getGroupId() {
        return this.f1303b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1310l;
        if (drawable != null) {
            return a(drawable);
        }
        int i2 = this.f1311m;
        if (i2 == 0) {
            return null;
        }
        Drawable c2 = h.b.l.a.a.c(this.f1312n.a, i2);
        this.f1311m = 0;
        this.f1310l = c2;
        return a(c2);
    }

    public ColorStateList getIconTintList() {
        return this.s;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    public Intent getIntent() {
        return this.f1305g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    public int getNumericModifiers() {
        return this.f1307i;
    }

    public char getNumericShortcut() {
        return this.f1306h;
    }

    public int getOrder() {
        return this.c;
    }

    public SubMenu getSubMenu() {
        return this.f1313o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1304f;
        return charSequence != null ? charSequence : this.e;
    }

    public CharSequence getTooltipText() {
        return this.r;
    }

    public boolean hasSubMenu() {
        return this.f1313o != null;
    }

    public boolean isActionViewExpanded() {
        return this.C;
    }

    public boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    public boolean isChecked() {
        return (this.x & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    public boolean isVisible() {
        h.h.m.b bVar = this.A;
        if (bVar == null || !bVar.b()) {
            if ((this.x & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.x & 8) != 0 || !this.A.a()) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f1308j == c2) {
            return this;
        }
        this.f1308j = Character.toLowerCase(c2);
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        int i2 = this.x;
        boolean z3 = z2 | (i2 & true);
        this.x = z3 ? 1 : 0;
        if (i2 != z3) {
            this.f1312n.b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        if ((this.x & 4) != 0) {
            g gVar = this.f1312n;
            if (gVar != null) {
                int groupId = getGroupId();
                int size = gVar.f1289f.size();
                gVar.j();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = gVar.f1289f.get(i2);
                    if (iVar.f1303b == groupId && iVar.e() && iVar.isCheckable()) {
                        iVar.a(iVar == this);
                    }
                }
                gVar.i();
            } else {
                throw null;
            }
        } else {
            a(z2);
        }
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1315q = charSequence;
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1311m = 0;
        this.f1310l = drawable;
        this.w = true;
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1305g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        if (this.f1306h == c2) {
            return this;
        }
        this.f1306h = c2;
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1314p = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f1306h = c2;
        this.f1308j = Character.toLowerCase(c3);
        this.f1312n.b(false);
        return this;
    }

    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.y = i2;
            this.f1312n.h();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.f1312n.b(false);
        r rVar = this.f1313o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1304f = charSequence;
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        if (c(z2)) {
            g gVar = this.f1312n;
            gVar.f1291h = true;
            gVar.b(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final Drawable a(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = g.a.a.b.a.c(drawable).mutate();
            if (this.u) {
                drawable.setTintList(this.s);
            }
            if (this.v) {
                drawable.setTintMode(this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    public void b(boolean z2) {
        if (z2) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    public h.h.h.a.b setActionView(View view) {
        int i2;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        this.f1312n.h();
        return this;
    }

    public boolean c() {
        h.h.m.b bVar;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null && (bVar = this.A) != null) {
            this.z = bVar.a((MenuItem) this);
        }
        if (this.z != null) {
            return true;
        }
        return false;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public h.h.h.a.b m9setContentDescription(CharSequence charSequence) {
        this.f1315q = charSequence;
        this.f1312n.b(false);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public h.h.h.a.b m10setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f1308j == c2 && this.f1309k == i2) {
            return this;
        }
        this.f1308j = Character.toLowerCase(c2);
        this.f1309k = KeyEvent.normalizeMetaState(i2);
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f1306h == c2 && this.f1307i == i2) {
            return this;
        }
        this.f1306h = c2;
        this.f1307i = KeyEvent.normalizeMetaState(i2);
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1306h = c2;
        this.f1307i = KeyEvent.normalizeMetaState(i2);
        this.f1308j = Character.toLowerCase(c3);
        this.f1309k = KeyEvent.normalizeMetaState(i3);
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f1310l = null;
        this.f1311m = i2;
        this.w = true;
        this.f1312n.b(false);
        return this;
    }

    public MenuItem setTitle(int i2) {
        setTitle((CharSequence) this.f1312n.a.getString(i2));
        return this;
    }

    public MenuItem setActionView(int i2) {
        Context context = this.f1312n.a;
        setActionView(LayoutInflater.from(context).inflate(i2, new LinearLayout(context), false));
        return this;
    }

    public void a(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 2 : 0) | (i2 & -3);
        this.x = i3;
        if (i2 != i3) {
            this.f1312n.b(false);
        }
    }

    public h.h.m.b a() {
        return this.A;
    }

    public h.h.h.a.b a(h.h.m.b bVar) {
        h.h.m.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.a = null;
        }
        this.z = null;
        this.A = bVar;
        this.f1312n.b(true);
        h.h.m.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.a((b.a) new a());
        }
        return this;
    }
}
