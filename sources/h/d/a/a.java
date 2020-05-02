package h.d.a;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;

/* compiled from: CardView */
public class a extends FrameLayout {

    /* renamed from: g  reason: collision with root package name */
    public static final d f1533g = new b();
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1534f;

    public ColorStateList getCardBackgroundColor() {
        b bVar = (b) f1533g;
        throw null;
    }

    public float getCardElevation() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        return ((b) f1533g).b((c) null);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1534f;
    }

    public float getRadius() {
        return ((b) f1533g).c((c) null);
    }

    public boolean getUseCompatPadding() {
        return this.e;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        ((b) f1533g).a((c) null, ColorStateList.valueOf(i2));
        throw null;
    }

    public void setCardElevation(float f2) {
        throw null;
    }

    public void setMaxCardElevation(float f2) {
        ((b) f1533g).a((c) null, f2);
    }

    public void setMinimumHeight(int i2) {
        super.setMinimumHeight(i2);
    }

    public void setMinimumWidth(int i2) {
        super.setMinimumWidth(i2);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1534f) {
            this.f1534f = z;
            b bVar = (b) f1533g;
            throw null;
        }
    }

    public void setRadius(float f2) {
        b bVar = (b) f1533g;
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.e != z) {
            this.e = z;
            b bVar = (b) f1533g;
            throw null;
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ((b) f1533g).a((c) null, colorStateList);
        throw null;
    }
}
