package h.d.a;

import android.content.res.ColorStateList;
import android.graphics.Rect;

/* compiled from: CardViewApi21Impl */
public class b implements d {
    public void a(c cVar, float f2) {
        e a = a(cVar);
        boolean a2 = cVar.a();
        boolean c = cVar.c();
        if (f2 != a.f1535b || a.c != a2 || a.d != c) {
            a.f1535b = f2;
            a.c = a2;
            a.d = c;
            a.a((Rect) null);
            throw null;
        } else if (!cVar.a()) {
            cVar.a(0, 0, 0, 0);
        } else {
            float f3 = a(cVar).f1535b;
            float f4 = a(cVar).a;
            int ceil = (int) Math.ceil((double) f.a(f3, f4, cVar.c()));
            int ceil2 = (int) Math.ceil((double) f.b(f3, f4, cVar.c()));
            cVar.a(ceil, ceil2, ceil, ceil2);
        }
    }

    public float b(c cVar) {
        return a(cVar).f1535b;
    }

    public float c(c cVar) {
        return a(cVar).a;
    }

    public void a(c cVar, ColorStateList colorStateList) {
        e a = a(cVar);
        if (a != null) {
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            a.e = colorStateList;
            colorStateList.getColorForState(a.getState(), a.e.getDefaultColor());
            throw null;
        }
        throw null;
    }

    public final e a(c cVar) {
        return (e) cVar.b();
    }
}
