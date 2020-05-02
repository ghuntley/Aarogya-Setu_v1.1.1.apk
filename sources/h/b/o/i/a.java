package h.b.o.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.crashlytics.android.core.CodedOutputStream;
import h.h.h.a.b;

/* compiled from: ActionMenuItem */
public class a implements b {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1237b;
    public final int c;
    public CharSequence d;
    public CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public Intent f1238f;

    /* renamed from: g  reason: collision with root package name */
    public char f1239g;

    /* renamed from: h  reason: collision with root package name */
    public int f1240h = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* renamed from: i  reason: collision with root package name */
    public char f1241i;

    /* renamed from: j  reason: collision with root package name */
    public int f1242j = CodedOutputStream.DEFAULT_BUFFER_SIZE;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f1243k;

    /* renamed from: l  reason: collision with root package name */
    public Context f1244l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f1245m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f1246n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f1247o = null;

    /* renamed from: p  reason: collision with root package name */
    public PorterDuff.Mode f1248p = null;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1249q = false;
    public boolean r = false;
    public int s = 16;

    public a(Context context, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1244l = context;
        this.a = i3;
        this.f1237b = i2;
        this.c = i4;
        this.d = charSequence;
    }

    public b a(h.h.m.b bVar) {
        throw new UnsupportedOperationException();
    }

    public h.h.m.b a() {
        return null;
    }

    public final void b() {
        if (this.f1243k == null) {
            return;
        }
        if (this.f1249q || this.r) {
            Drawable c2 = g.a.a.b.a.c(this.f1243k);
            this.f1243k = c2;
            Drawable mutate = c2.mutate();
            this.f1243k = mutate;
            if (this.f1249q) {
                mutate.setTintList(this.f1247o);
            }
            if (this.r) {
                this.f1243k.setTintMode(this.f1248p);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1242j;
    }

    public char getAlphabeticShortcut() {
        return this.f1241i;
    }

    public CharSequence getContentDescription() {
        return this.f1245m;
    }

    public int getGroupId() {
        return this.f1237b;
    }

    public Drawable getIcon() {
        return this.f1243k;
    }

    public ColorStateList getIconTintList() {
        return this.f1247o;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1248p;
    }

    public Intent getIntent() {
        return this.f1238f;
    }

    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1240h;
    }

    public char getNumericShortcut() {
        return this.f1239g;
    }

    public int getOrder() {
        return this.c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.e;
        return charSequence != null ? charSequence : this.d;
    }

    public CharSequence getTooltipText() {
        return this.f1246n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f1241i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.s = z | (this.s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.s = (z ? 2 : 0) | (this.s & -3);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1245m = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.s = (z ? 16 : 0) | (this.s & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1243k = drawable;
        b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1247o = colorStateList;
        this.f1249q = true;
        b();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1248p = mode;
        this.r = true;
        b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1238f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f1239g = c2;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f1239g = c2;
        this.f1241i = Character.toLowerCase(c3);
        return this;
    }

    public void setShowAsAction(int i2) {
    }

    public MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1246n = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.s & 8;
        if (z) {
            i2 = 0;
        }
        this.s = i3 | i2;
        return this;
    }

    public MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f1241i = Character.toLowerCase(c2);
        this.f1242j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public b m7setContentDescription(CharSequence charSequence) {
        this.f1245m = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f1239g = c2;
        this.f1240h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.d = this.f1244l.getResources().getString(i2);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public b m8setTooltipText(CharSequence charSequence) {
        this.f1246n = charSequence;
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f1243k = h.h.f.a.c(this.f1244l, i2);
        b();
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1239g = c2;
        this.f1240h = KeyEvent.normalizeMetaState(i2);
        this.f1241i = Character.toLowerCase(c3);
        this.f1242j = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}
