package i.b.a.r.h;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: BitmapImageViewTarget */
public class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    public void a(Object obj) {
        ((ImageView) this.e).setImageBitmap((Bitmap) obj);
    }
}
