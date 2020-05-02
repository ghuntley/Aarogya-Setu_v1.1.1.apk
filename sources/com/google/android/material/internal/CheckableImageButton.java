package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import h.b.p.l;
import h.h.m.m;

public class CheckableImageButton extends l implements Checkable {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f632j = {16842912};

    /* renamed from: g  reason: collision with root package name */
    public boolean f633g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f634h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f635i;

    public class a extends h.h.m.a {
        public a() {
        }

        public void a(View view, h.h.m.w.b bVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
            bVar.a.setCheckable(CheckableImageButton.this.f634h);
            bVar.a.setChecked(CheckableImageButton.this.f633g);
        }

        public void b(View view, AccessibilityEvent accessibilityEvent) {
            this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.f633g);
        }
    }

    public static class b extends h.j.a.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public boolean f636g;

        public static class a implements Parcelable.ClassLoaderCreator<b> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            public Object[] newArray(int i2) {
                return new b[i2];
            }

            public Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.e, i2);
            parcel.writeInt(this.f636g ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f636g = parcel.readInt() != 1 ? false : true;
        }
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean isChecked() {
        return this.f633g;
    }

    public int[] onCreateDrawableState(int i2) {
        if (this.f633g) {
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + f632j.length), f632j);
        }
        return super.onCreateDrawableState(i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.e);
        setChecked(bVar.f636g);
    }

    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f636g = this.f633g;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f634h != z) {
            this.f634h = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f634h && this.f633g != z) {
            this.f633g = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f635i = z;
    }

    public void setPressed(boolean z) {
        if (this.f635i) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f633g);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f634h = true;
        this.f635i = true;
        m.a((View) this, (h.h.m.a) new a());
    }
}
