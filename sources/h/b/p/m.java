package h.b.p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import h.b.j;
import h.b.l.a.a;

/* compiled from: AppCompatImageHelper */
public class m {
    public final ImageView a;

    /* renamed from: b  reason: collision with root package name */
    public v0 f1442b;
    public v0 c;

    public m(ImageView imageView) {
        this.a = imageView;
    }

    public void a(AttributeSet attributeSet, int i2) {
        Drawable drawable;
        Drawable drawable2;
        int f2;
        x0 a2 = x0.a(this.a.getContext(), attributeSet, j.AppCompatImageView, i2, 0);
        ImageView imageView = this.a;
        h.h.m.m.a(imageView, imageView.getContext(), j.AppCompatImageView, attributeSet, a2.f1492b, i2, 0);
        try {
            Drawable drawable3 = this.a.getDrawable();
            if (!(drawable3 != null || (f2 = a2.f(j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable3 = a.c(this.a.getContext(), f2)) == null)) {
                this.a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                e0.b(drawable3);
            }
            if (a2.f(j.AppCompatImageView_tint)) {
                ImageView imageView2 = this.a;
                imageView2.setImageTintList(a2.a(j.AppCompatImageView_tint));
                if (!(Build.VERSION.SDK_INT != 21 || (drawable2 = imageView2.getDrawable()) == null || imageView2.getImageTintList() == null)) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable2);
                }
            }
            if (a2.f(j.AppCompatImageView_tintMode)) {
                ImageView imageView3 = this.a;
                imageView3.setImageTintMode(e0.a(a2.d(j.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
                if (!(Build.VERSION.SDK_INT != 21 || (drawable = imageView3.getDrawable()) == null || imageView3.getImageTintList() == null)) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView3.getDrawableState());
                    }
                    imageView3.setImageDrawable(drawable);
                }
            }
            a2.f1492b.recycle();
        } catch (Throwable th) {
            a2.f1492b.recycle();
            throw th;
        }
    }

    public void a(int i2) {
        if (i2 != 0) {
            Drawable c2 = a.c(this.a.getContext(), i2);
            if (c2 != null) {
                e0.b(c2);
            }
            this.a.setImageDrawable(c2);
        } else {
            this.a.setImageDrawable((Drawable) null);
        }
        a();
    }

    public void a(ColorStateList colorStateList) {
        if (this.f1442b == null) {
            this.f1442b = new v0();
        }
        v0 v0Var = this.f1442b;
        v0Var.a = colorStateList;
        v0Var.d = true;
        a();
    }

    public void a(PorterDuff.Mode mode) {
        if (this.f1442b == null) {
            this.f1442b = new v0();
        }
        v0 v0Var = this.f1442b;
        v0Var.f1477b = mode;
        v0Var.c = true;
        a();
    }

    public void a() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i2 <= 21 && i2 == 21) {
                if (this.c == null) {
                    this.c = new v0();
                }
                v0 v0Var = this.c;
                v0Var.a = null;
                v0Var.d = false;
                v0Var.f1477b = null;
                v0Var.c = false;
                ColorStateList imageTintList = this.a.getImageTintList();
                if (imageTintList != null) {
                    v0Var.d = true;
                    v0Var.a = imageTintList;
                }
                PorterDuff.Mode imageTintMode = this.a.getImageTintMode();
                if (imageTintMode != null) {
                    v0Var.c = true;
                    v0Var.f1477b = imageTintMode;
                }
                if (v0Var.d || v0Var.c) {
                    j.a(drawable, v0Var, this.a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            v0 v0Var2 = this.f1442b;
            if (v0Var2 != null) {
                j.a(drawable, v0Var2, this.a.getDrawableState());
            }
        }
    }
}
