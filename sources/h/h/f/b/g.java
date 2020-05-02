package h.h.f.b;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: ResourcesCompat */
public abstract class g {

    /* compiled from: ResourcesCompat */
    public class a implements Runnable {
        public final /* synthetic */ Typeface e;

        public a(Typeface typeface) {
            this.e = typeface;
        }

        public void run() {
            g.this.a(this.e);
        }
    }

    /* compiled from: ResourcesCompat */
    public class b implements Runnable {
        public final /* synthetic */ int e;

        public b(int i2) {
            this.e = i2;
        }

        public void run() {
            g.this.a(this.e);
        }
    }

    public abstract void a(int i2);

    public abstract void a(Typeface typeface);

    public final void a(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new a(typeface));
    }

    public final void a(int i2, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new b(i2));
    }
}
