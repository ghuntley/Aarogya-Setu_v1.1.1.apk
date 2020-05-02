package i.b.a.n.o.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import h.b.o.c;

/* compiled from: DrawableDecoderCompat */
public final class a {
    public static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (a) {
                return h.b.l.a.a.c(theme != null ? new c(context2, theme) : context2, i2);
            }
        } catch (NoClassDefFoundError unused) {
            a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return h.h.f.a.c(context2, i2);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return context2.getResources().getDrawable(i2, theme);
    }
}
