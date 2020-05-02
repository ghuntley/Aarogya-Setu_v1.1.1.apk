package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import h.h.m.m;
import i.c.a.c.f;
import i.c.a.c.f0.n;
import i.c.a.c.k;

public class SnackbarContentLayout extends LinearLayout implements n {
    public TextView e;

    /* renamed from: f  reason: collision with root package name */
    public Button f658f;

    /* renamed from: g  reason: collision with root package name */
    public int f659g;

    /* renamed from: h  reason: collision with root package name */
    public int f660h;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.e.getPaddingTop() == i3 && this.e.getPaddingBottom() == i4) {
            return z;
        }
        TextView textView = this.e;
        if (m.z(textView)) {
            textView.setPaddingRelative(textView.getPaddingStart(), i3, textView.getPaddingEnd(), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public void b(int i2, int i3) {
        this.e.setAlpha(0.0f);
        long j2 = (long) i3;
        long j3 = (long) i2;
        this.e.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
        if (this.f658f.getVisibility() == 0) {
            this.f658f.setAlpha(0.0f);
            this.f658f.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }

    public Button getActionView() {
        return this.f658f;
    }

    public TextView getMessageView() {
        return this.e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.e = (TextView) findViewById(f.snackbar_text);
        this.f658f = (Button) findViewById(f.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (a(1, r0, r0 - r1) != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (a(0, r0, r0) != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f659g
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f659g
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = i.c.a.c.d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = i.c.a.c.d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.e
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f660h
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f658f
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f660h
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.a(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.a(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            if (r3 == 0) goto L_0x0066
            super.onMeasure(r8, r9)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f660h = i2;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.SnackbarLayout);
        this.f659g = obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_android_maxWidth, -1);
        this.f660h = obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    public void a(int i2, int i3) {
        this.e.setAlpha(1.0f);
        long j2 = (long) i3;
        long j3 = (long) i2;
        this.e.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        if (this.f658f.getVisibility() == 0) {
            this.f658f.setAlpha(1.0f);
            this.f658f.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }
}
