package i.c.a.c.q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import i.c.a.b.d.l.q;
import i.c.a.c.b;
import i.c.a.c.e0.g;
import i.c.a.c.e0.j;
import i.c.a.c.e0.n;

/* compiled from: MaterialButtonHelper */
public class a {
    public final MaterialButton a;

    /* renamed from: b  reason: collision with root package name */
    public j f4181b;
    public int c;
    public int d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f4182f;

    /* renamed from: g  reason: collision with root package name */
    public int f4183g;

    /* renamed from: h  reason: collision with root package name */
    public int f4184h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f4185i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f4186j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f4187k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f4188l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f4189m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4190n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4191o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4192p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4193q;
    public LayerDrawable r;

    public a(MaterialButton materialButton, j jVar) {
        this.a = materialButton;
        this.f4181b = jVar;
    }

    public final g a(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    public g b() {
        return a(false);
    }

    public final g c() {
        return a(true);
    }

    public final void d() {
        g b2 = b();
        g c2 = c();
        if (b2 != null) {
            b2.a((float) this.f4184h, this.f4187k);
            if (c2 != null) {
                c2.a((float) this.f4184h, this.f4190n ? q.a((View) this.a, b.colorSurface) : 0);
            }
        }
    }

    public n a() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.r.getNumberOfLayers() > 2) {
            return (n) this.r.getDrawable(2);
        }
        return (n) this.r.getDrawable(1);
    }

    public void a(j jVar) {
        this.f4181b = jVar;
        if (b() != null) {
            g b2 = b();
            b2.e.a = jVar;
            b2.invalidateSelf();
        }
        if (c() != null) {
            g c2 = c();
            c2.e.a = jVar;
            c2.invalidateSelf();
        }
        if (a() != null) {
            a().setShapeAppearanceModel(jVar);
        }
    }
}
