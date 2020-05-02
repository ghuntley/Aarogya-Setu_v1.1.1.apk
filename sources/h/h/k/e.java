package h.h.k;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: TextUtilsCompat */
public final class e {
    public static final Locale a = new Locale("", "");

    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
