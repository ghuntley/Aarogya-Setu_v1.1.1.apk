package i.c.a.c.l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: ImageMatrixProperty */
public class e extends Property<ImageView, Matrix> {
    public final Matrix a = new Matrix();

    public e() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public Object get(Object obj) {
        this.a.set(((ImageView) obj).getImageMatrix());
        return this.a;
    }

    public void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
