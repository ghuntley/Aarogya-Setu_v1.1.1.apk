package i.c.a.c.e0;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize */
public final class b implements c {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4046b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).a;
            f2 += ((b) cVar).f4046b;
        }
        this.a = cVar;
        this.f4046b = f2;
    }

    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.f4046b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.a.equals(bVar.a) || this.f4046b != bVar.f4046b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.f4046b)});
    }
}
