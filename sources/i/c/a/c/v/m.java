package i.c.a.c.v;

import android.content.Context;
import android.content.res.TypedArray;
import h.l.d.c;
import i.c.a.b.d.l.q;
import i.c.a.c.b;

/* compiled from: MaterialDatePicker */
public final class m<S> extends c {
    public static boolean b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q.a(context, b.materialCalendarStyle, f.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
