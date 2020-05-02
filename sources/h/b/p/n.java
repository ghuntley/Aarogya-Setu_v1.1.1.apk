package h.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* compiled from: AppCompatImageView */
public class n extends ImageView {
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final m f1443f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        u0.a(context);
        s0.a((View) this, getContext());
        e eVar = new e(this);
        this.e = eVar;
        eVar.a(attributeSet, i2);
        m mVar = new m(this);
        this.f1443f = mVar;
        mVar.a(attributeSet, i2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.e;
        if (eVar != null) {
            eVar.a();
        }
        m mVar = this.f1443f;
        if (mVar != null) {
            mVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        v0 v0Var;
        m mVar = this.f1443f;
        if (mVar == null || (v0Var = mVar.f1442b) == null) {
            return null;
        }
        return v0Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        v0 v0Var;
        m mVar = this.f1443f;
        if (mVar == null || (v0Var = mVar.f1442b) == null) {
            return null;
        }
        return v0Var.f1477b;
    }

    public boolean hasOverlappingRendering() {
        if (!(!(this.f1443f.a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.e;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.e;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m mVar = this.f1443f;
        if (mVar != null) {
            mVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m mVar = this.f1443f;
        if (mVar != null) {
            mVar.a();
        }
    }

    public void setImageResource(int i2) {
        m mVar = this.f1443f;
        if (mVar != null) {
            mVar.a(i2);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m mVar = this.f1443f;
        if (mVar != null) {
            mVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        m mVar = this.f1443f;
        if (mVar != null) {
            mVar.a(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        m mVar = this.f1443f;
        if (mVar != null) {
            mVar.a(mode);
        }
    }
}
