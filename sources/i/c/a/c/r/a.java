package i.c.a.c.r;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import i.c.a.c.b;
import i.c.a.c.e0.j;
import i.c.a.c.e0.n;

/* compiled from: MaterialCardView */
public class a extends h.d.a.a implements Checkable, n {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4194k = {16842911};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f4195l = {16842912};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f4196m = {b.state_dragged};

    /* renamed from: h  reason: collision with root package name */
    public boolean f4197h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4198i;

    /* renamed from: j  reason: collision with root package name */
    public C0122a f4199j;

    /* renamed from: i.c.a.c.r.a$a  reason: collision with other inner class name */
    /* compiled from: MaterialCardView */
    public interface C0122a {
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
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

    public float getProgress() {
        throw null;
    }

    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public j getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public boolean isChecked() {
        return this.f4197h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (this.f4197h) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f4195l);
        }
        if (this.f4198i) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f4196m);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f4197h);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f4197h);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i2) {
        ColorStateList.valueOf(i2);
        throw null;
    }

    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    public void setChecked(boolean z) {
        boolean z2 = this.f4197h;
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconResource(int i2) {
        h.b.l.a.a.c(getContext(), i2);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        throw null;
    }

    public void setDragged(boolean z) {
        if (this.f4198i != z) {
            this.f4198i = z;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT <= 26) {
                invalidate();
                return;
            }
            throw null;
        }
    }

    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        throw null;
    }

    public void setOnCheckedChangeListener(C0122a aVar) {
        this.f4199j = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(float f2) {
        throw null;
    }

    public void setRadius(float f2) {
        super.setRadius(f2);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i2) {
        h.b.l.a.a.b(getContext(), i2);
        throw null;
    }

    public void setShapeAppearanceModel(j jVar) {
        throw null;
    }

    public void setStrokeColor(int i2) {
        ColorStateList.valueOf(i2);
        throw null;
    }

    public void setStrokeWidth(int i2) {
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    public void toggle() {
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }
}
