package i.c.a.c.h0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import i.c.a.c.e0.j;

/* compiled from: CutoutDrawable */
public class g extends i.c.a.c.e0.g {
    public final Paint C;
    public final RectF D;
    public int E;

    public g() {
        this((j) null);
    }

    public void a(float f2, float f3, float f4, float f5) {
        RectF rectF = this.D;
        if (f2 != rectF.left || f3 != rectF.top || f4 != rectF.right || f5 != rectF.bottom) {
            this.D.set(f2, f3, f4, f5);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
            }
        } else {
            this.E = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        }
        super.draw(canvas);
        canvas.drawRect(this.D, this.C);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.E);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(j jVar) {
        super(jVar == null ? new j() : jVar);
        Paint paint = new Paint(1);
        this.C = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.C.setColor(-1);
        this.C.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.D = new RectF();
    }
}
