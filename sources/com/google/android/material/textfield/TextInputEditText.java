package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import h.b.p.k;
import i.a.a.a.a;
import i.c.a.c.b;
import i.c.a.c.d;
import i.c.a.c.j;
import i.c.a.c.z.i;
import java.util.Locale;

public class TextInputEditText extends k {

    /* renamed from: h  reason: collision with root package name */
    public final Rect f661h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f662i;

    public TextInputEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f662i && rect != null) {
            textInputLayout.getFocusedRect(this.f661h);
            rect.bottom = this.f661h.bottom;
        }
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || !this.f662i || rect == null)) {
            textInputLayout.getGlobalVisibleRect(this.f661h, point);
            rect.bottom = this.f661h.bottom;
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.E) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.E && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            Editable text = getText();
            CharSequence hint = textInputLayout.getHint();
            CharSequence helperText = textInputLayout.getHelperText();
            CharSequence error = textInputLayout.getError();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            String str = "";
            String charSequence = z2 ? hint.toString() : str;
            StringBuilder a = a.a(charSequence);
            a.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : str);
            StringBuilder a2 = a.a(a.toString());
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = str;
            }
            a2.append(helperText);
            String sb = a2.toString();
            if (z) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                if (!TextUtils.isEmpty(sb)) {
                    str = a.b(", ", sb);
                }
                sb2.append(str);
                str = sb2.toString();
            } else if (!TextUtils.isEmpty(sb)) {
                str = sb;
            }
            accessibilityNodeInfo.setText(str);
        }
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f662i) {
            this.f661h.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(d.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f661h, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f662i = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.editTextStyle);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i2) {
        super(i.c.a.c.j0.a.a.a(context, attributeSet, i2, 0), attributeSet, i2);
        this.f661h = new Rect();
        TypedArray b2 = i.b(context, attributeSet, i.c.a.c.k.TextInputEditText, i2, j.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(b2.getBoolean(i.c.a.c.k.TextInputEditText_textInputLayoutFocusedRectEnabled, false));
        b2.recycle();
    }
}
