package h.b.p;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

/* compiled from: AppCompatSeekBar */
public class t extends SeekBar {
    public final u e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = h.b.a.seekBarStyle
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            h.b.p.s0.a((android.view.View) r1, (android.content.Context) r2)
            h.b.p.u r2 = new h.b.p.u
            r2.<init>(r1)
            r1.e = r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.p.t.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.e;
        Drawable drawable = uVar.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(uVar.d.getDrawableState())) {
            uVar.d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.e.a(canvas);
    }
}
