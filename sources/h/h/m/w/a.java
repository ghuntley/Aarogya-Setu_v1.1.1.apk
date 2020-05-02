package h.h.m.w;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat */
public final class a extends ClickableSpan {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final b f1822f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1823g;

    public a(int i2, b bVar, int i3) {
        this.e = i2;
        this.f1822f = bVar;
        this.f1823g = i3;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.e);
        b bVar = this.f1822f;
        bVar.a.performAction(this.f1823g, bundle);
    }
}
