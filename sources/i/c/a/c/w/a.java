package i.c.a.c.w;

import android.content.Context;
import i.c.a.b.d.l.q;
import i.c.a.c.b;

/* compiled from: ElevationOverlayProvider */
public class a {
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4239b;
    public final int c;
    public final float d;

    public a(Context context) {
        this.a = q.a(context, b.elevationOverlayEnabled, false);
        this.f4239b = q.a(context, b.elevationOverlayColor, 0);
        this.c = q.a(context, b.colorSurface, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }
}
