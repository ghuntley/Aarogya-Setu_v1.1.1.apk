package i.c.a.c.e0;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize */
public final class h implements c {
    public final float a;

    public h(float f2) {
        this.a = f2;
    }

    public float a(RectF rectF) {
        return rectF.height() * this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.a == ((h) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
