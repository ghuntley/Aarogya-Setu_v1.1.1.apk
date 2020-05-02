package i.c.a.c.e0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import i.c.a.c.d0.a;
import i.c.a.c.e0.m;
import java.util.List;

/* compiled from: ShapePath */
public class l extends m.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f4094b;
    public final /* synthetic */ Matrix c;

    public l(m mVar, List list, Matrix matrix) {
        this.f4094b = list;
        this.c = matrix;
    }

    public void a(Matrix matrix, a aVar, int i2, Canvas canvas) {
        for (m.f a : this.f4094b) {
            a.a(this.c, aVar, i2, canvas);
        }
    }
}
