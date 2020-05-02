package h.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import h.b.c;
import h.b.e;
import h.b.p.n0;

/* compiled from: AppCompatDrawableManager */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f1424b = PorterDuff.Mode.SRC_IN;
    public static j c;
    public n0 a;

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (c == null) {
                b();
            }
            jVar = c;
        }
        return jVar;
    }

    public static synchronized void b() {
        synchronized (j.class) {
            if (c == null) {
                j jVar = new j();
                c = jVar;
                jVar.a = n0.a();
                c.a.a((n0.e) new a());
            }
        }
    }

    public synchronized Drawable a(Context context, int i2) {
        return this.a.b(context, i2);
    }

    public synchronized Drawable a(Context context, int i2, boolean z) {
        return this.a.a(context, i2, z);
    }

    public synchronized void a(Context context) {
        this.a.a(context);
    }

    public synchronized ColorStateList b(Context context, int i2) {
        return this.a.c(context, i2);
    }

    public static void a(Drawable drawable, v0 v0Var, int[] iArr) {
        n0.a(drawable, v0Var, iArr);
    }

    /* compiled from: AppCompatDrawableManager */
    public static class a implements n0.e {
        public final int[] a = {e.abc_textfield_search_default_mtrl_alpha, e.abc_textfield_default_mtrl_alpha, e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f1425b = {e.abc_ic_commit_search_api_mtrl_alpha, e.abc_seekbar_tick_mark_material, e.abc_ic_menu_share_mtrl_alpha, e.abc_ic_menu_copy_mtrl_am_alpha, e.abc_ic_menu_cut_mtrl_alpha, e.abc_ic_menu_selectall_mtrl_alpha, e.abc_ic_menu_paste_mtrl_am_alpha};
        public final int[] c = {e.abc_textfield_activated_mtrl_alpha, e.abc_textfield_search_activated_mtrl_alpha, e.abc_cab_background_top_mtrl_alpha, e.abc_text_cursor_material, e.abc_text_select_handle_left_mtrl_dark, e.abc_text_select_handle_middle_mtrl_dark, e.abc_text_select_handle_right_mtrl_dark, e.abc_text_select_handle_left_mtrl_light, e.abc_text_select_handle_middle_mtrl_light, e.abc_text_select_handle_right_mtrl_light};
        public final int[] d = {e.abc_popup_background_mtrl_mult, e.abc_cab_background_internal_bg, e.abc_menu_hardkey_panel_mtrl_mult};
        public final int[] e = {e.abc_tab_indicator_material, e.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f1426f = {e.abc_btn_check_material, e.abc_btn_radio_material, e.abc_btn_check_material_anim, e.abc_btn_radio_material_anim};

        public final ColorStateList a(Context context, int i2) {
            int b2 = s0.b(context, h.b.a.colorControlHighlight);
            int a2 = s0.a(context, h.b.a.colorButtonNormal);
            return new ColorStateList(new int[][]{s0.f1468b, s0.d, s0.c, s0.f1469f}, new int[]{a2, h.h.g.a.a(b2, i2), h.h.g.a.a(b2, i2), i2});
        }

        public ColorStateList b(Context context, int i2) {
            if (i2 == e.abc_edit_text_material) {
                return h.b.l.a.a.b(context, c.abc_tint_edittext);
            }
            if (i2 == e.abc_switch_track_mtrl_alpha) {
                return h.b.l.a.a.b(context, c.abc_tint_switch_track);
            }
            if (i2 == e.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList c2 = s0.c(context, h.b.a.colorSwitchThumbNormal);
                if (c2 == null || !c2.isStateful()) {
                    iArr[0] = s0.f1468b;
                    iArr2[0] = s0.a(context, h.b.a.colorSwitchThumbNormal);
                    iArr[1] = s0.e;
                    iArr2[1] = s0.b(context, h.b.a.colorControlActivated);
                    iArr[2] = s0.f1469f;
                    iArr2[2] = s0.b(context, h.b.a.colorSwitchThumbNormal);
                } else {
                    iArr[0] = s0.f1468b;
                    iArr2[0] = c2.getColorForState(iArr[0], 0);
                    iArr[1] = s0.e;
                    iArr2[1] = s0.b(context, h.b.a.colorControlActivated);
                    iArr[2] = s0.f1469f;
                    iArr2[2] = c2.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i2 == e.abc_btn_default_mtrl_shape) {
                return a(context, s0.b(context, h.b.a.colorButtonNormal));
            } else {
                if (i2 == e.abc_btn_borderless_material) {
                    return a(context, 0);
                }
                if (i2 == e.abc_btn_colored_material) {
                    return a(context, s0.b(context, h.b.a.colorAccent));
                }
                if (i2 == e.abc_spinner_mtrl_am_alpha || i2 == e.abc_spinner_textfield_background_material) {
                    return h.b.l.a.a.b(context, c.abc_tint_spinner);
                }
                if (a(this.f1425b, i2)) {
                    return s0.c(context, h.b.a.colorControlNormal);
                }
                if (a(this.e, i2)) {
                    return h.b.l.a.a.b(context, c.abc_tint_default);
                }
                if (a(this.f1426f, i2)) {
                    return h.b.l.a.a.b(context, c.abc_tint_btn_checkable);
                }
                if (i2 == e.abc_seekbar_thumb_material) {
                    return h.b.l.a.a.b(context, c.abc_tint_seek_thumb);
                }
                return null;
            }
        }

        public final void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f1424b;
            }
            drawable.setColorFilter(j.a(i2, mode));
        }

        public final boolean a(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (j.class) {
            a2 = n0.a(i2, mode);
        }
        return a2;
    }
}
