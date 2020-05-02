package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.crashlytics.android.core.CodedOutputStream;
import com.crashlytics.android.core.LogFileManager;
import h.b.a;
import h.b.f;
import h.b.g;
import h.b.h;
import h.b.j;
import h.b.o.i.i;
import h.b.o.i.n;
import h.b.p.x0;
import h.h.m.m;

public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    public i e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f78f;

    /* renamed from: g  reason: collision with root package name */
    public RadioButton f79g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f80h;

    /* renamed from: i  reason: collision with root package name */
    public CheckBox f81i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f82j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f83k;

    /* renamed from: l  reason: collision with root package name */
    public ImageView f84l;

    /* renamed from: m  reason: collision with root package name */
    public LinearLayout f85m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f86n;

    /* renamed from: o  reason: collision with root package name */
    public int f87o;

    /* renamed from: p  reason: collision with root package name */
    public Context f88p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f89q;
    public Drawable r;
    public boolean s;
    public LayoutInflater t;
    public boolean u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.t == null) {
            this.t = LayoutInflater.from(getContext());
        }
        return this.t;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f83k;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void a(i iVar, int i2) {
        CharSequence charSequence;
        String str;
        this.e = iVar;
        int i3 = 0;
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (c()) {
            charSequence = iVar.getTitleCondensed();
        } else {
            charSequence = iVar.e;
        }
        setTitle(charSequence);
        setCheckable(iVar.isCheckable());
        boolean f2 = iVar.f();
        iVar.b();
        if (!f2 || !this.e.f()) {
            i3 = 8;
        }
        if (i3 == 0) {
            TextView textView = this.f82j;
            i iVar2 = this.e;
            char b2 = iVar2.b();
            if (b2 == 0) {
                str = "";
            } else {
                Resources resources = iVar2.f1312n.a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(iVar2.f1312n.a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(h.abc_prepend_shortcut_label));
                }
                int i4 = iVar2.f1312n.f() ? iVar2.f1309k : iVar2.f1307i;
                i.a(sb, i4, LogFileManager.MAX_LOG_SIZE, resources.getString(h.abc_menu_meta_shortcut_label));
                i.a(sb, i4, CodedOutputStream.DEFAULT_BUFFER_SIZE, resources.getString(h.abc_menu_ctrl_shortcut_label));
                i.a(sb, i4, 2, resources.getString(h.abc_menu_alt_shortcut_label));
                i.a(sb, i4, 1, resources.getString(h.abc_menu_shift_shortcut_label));
                i.a(sb, i4, 4, resources.getString(h.abc_menu_sym_shortcut_label));
                i.a(sb, i4, 8, resources.getString(h.abc_menu_function_shortcut_label));
                if (b2 == 8) {
                    sb.append(resources.getString(h.abc_menu_delete_shortcut_label));
                } else if (b2 == 10) {
                    sb.append(resources.getString(h.abc_menu_enter_shortcut_label));
                } else if (b2 != ' ') {
                    sb.append(b2);
                } else {
                    sb.append(resources.getString(h.abc_menu_space_shortcut_label));
                }
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f82j.getVisibility() != i3) {
            this.f82j.setVisibility(i3);
        }
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.f1315q);
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f84l;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f84l.getLayoutParams();
            rect.top = this.f84l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.abc_list_menu_item_radio, this, false);
        this.f79g = radioButton;
        LinearLayout linearLayout = this.f85m;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public boolean c() {
        return false;
    }

    public i getItemData() {
        return this.e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        m.a((View) this, this.f86n);
        TextView textView = (TextView) findViewById(f.title);
        this.f80h = textView;
        int i2 = this.f87o;
        if (i2 != -1) {
            textView.setTextAppearance(this.f88p, i2);
        }
        this.f82j = (TextView) findViewById(f.shortcut);
        ImageView imageView = (ImageView) findViewById(f.submenuarrow);
        this.f83k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.r);
        }
        this.f84l = (ImageView) findViewById(f.group_divider);
        this.f85m = (LinearLayout) findViewById(f.content);
    }

    public void onMeasure(int i2, int i3) {
        if (this.f78f != null && this.f89q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f78f.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f79g != null || this.f81i != null) {
            if (this.e.e()) {
                if (this.f79g == null) {
                    b();
                }
                compoundButton2 = this.f79g;
                compoundButton = this.f81i;
            } else {
                if (this.f81i == null) {
                    a();
                }
                compoundButton2 = this.f81i;
                compoundButton = this.f79g;
            }
            if (z) {
                compoundButton2.setChecked(this.e.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f81i;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f79g;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.e.e()) {
            if (this.f79g == null) {
                b();
            }
            compoundButton = this.f79g;
        } else {
            if (this.f81i == null) {
                a();
            }
            compoundButton = this.f81i;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.u = z;
        this.f89q = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f84l;
        if (imageView != null) {
            imageView.setVisibility((this.s || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.e.f1312n.s || this.u;
        if (!z && !this.f89q) {
            return;
        }
        if (this.f78f != null || drawable != null || this.f89q) {
            if (this.f78f == null) {
                ImageView imageView = (ImageView) getInflater().inflate(g.abc_list_menu_item_icon, this, false);
                this.f78f = imageView;
                LinearLayout linearLayout = this.f85m;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            }
            if (drawable != null || this.f89q) {
                ImageView imageView2 = this.f78f;
                if (!z) {
                    drawable = null;
                }
                imageView2.setImageDrawable(drawable);
                if (this.f78f.getVisibility() != 0) {
                    this.f78f.setVisibility(0);
                    return;
                }
                return;
            }
            this.f78f.setVisibility(8);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f80h.setText(charSequence);
            if (this.f80h.getVisibility() != 0) {
                this.f80h.setVisibility(0);
            }
        } else if (this.f80h.getVisibility() != 8) {
            this.f80h.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        x0 a = x0.a(getContext(), attributeSet, j.MenuView, i2, 0);
        this.f86n = a.b(j.MenuView_android_itemBackground);
        this.f87o = a.f(j.MenuView_android_itemTextAppearance, -1);
        this.f89q = a.a(j.MenuView_preserveIconSpacing, false);
        this.f88p = context;
        this.r = a.b(j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, a.dropDownListViewStyle, 0);
        this.s = obtainStyledAttributes.hasValue(0);
        a.f1492b.recycle();
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.abc_list_menu_item_checkbox, this, false);
        this.f81i = checkBox;
        LinearLayout linearLayout = this.f85m;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }
}
