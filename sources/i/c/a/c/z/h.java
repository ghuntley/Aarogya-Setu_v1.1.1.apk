package i.c.a.c.z;

import android.graphics.Typeface;
import android.text.TextPaint;
import i.c.a.c.b0.d;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper */
public class h {
    public final TextPaint a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final d f4286b = new a();
    public float c;
    public boolean d = true;
    public WeakReference<b> e = new WeakReference<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public i.c.a.c.b0.b f4287f;

    /* compiled from: TextDrawableHelper */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(b bVar) {
        this.e = new WeakReference<>(bVar);
    }

    public float a(String str) {
        float f2;
        if (!this.d) {
            return this.c;
        }
        if (str == null) {
            f2 = 0.0f;
        } else {
            f2 = this.a.measureText(str, 0, str.length());
        }
        this.c = f2;
        this.d = false;
        return f2;
    }

    /* compiled from: TextDrawableHelper */
    public class a extends d {
        public a() {
        }

        public void a(Typeface typeface, boolean z) {
            if (!z) {
                h hVar = h.this;
                hVar.d = true;
                b bVar = (b) hVar.e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }

        public void a(int i2) {
            h hVar = h.this;
            hVar.d = true;
            b bVar = (b) hVar.e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }
}
