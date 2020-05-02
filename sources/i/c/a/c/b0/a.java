package i.c.a.c.b0;

import android.graphics.Typeface;
import i.c.a.c.z.b;

/* compiled from: CancelableFontCallback */
public final class a extends d {
    public final Typeface a;

    /* renamed from: b  reason: collision with root package name */
    public final C0116a f4026b;
    public boolean c;

    /* renamed from: i.c.a.c.b0.a$a  reason: collision with other inner class name */
    /* compiled from: CancelableFontCallback */
    public interface C0116a {
    }

    public a(C0116a aVar, Typeface typeface) {
        this.a = typeface;
        this.f4026b = aVar;
    }

    public void a(Typeface typeface, boolean z) {
        a(typeface);
    }

    public void a(int i2) {
        a(this.a);
    }

    public final void a(Typeface typeface) {
        if (!this.c) {
            b bVar = ((i.c.a.c.z.a) this.f4026b).a;
            a aVar = bVar.v;
            boolean z = true;
            if (aVar != null) {
                aVar.c = true;
            }
            if (bVar.s != typeface) {
                bVar.s = typeface;
            } else {
                z = false;
            }
            if (z) {
                bVar.e();
            }
        }
    }
}
