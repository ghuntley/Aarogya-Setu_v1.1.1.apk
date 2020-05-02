package h.b.p;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RatingBar;

/* compiled from: AppCompatRatingBar */
public class s extends RatingBar {
    public final q e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = h.b.a.ratingBarStyle
            r1.<init>(r2, r3, r0)
            android.content.Context r2 = r1.getContext()
            h.b.p.s0.a((android.view.View) r1, (android.content.Context) r2)
            h.b.p.q r2 = new h.b.p.q
            r2.<init>(r1)
            r1.e = r2
            r2.a((android.util.AttributeSet) r3, (int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.p.s.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = this.e.f1456b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
