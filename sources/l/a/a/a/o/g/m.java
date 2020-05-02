package l.a.a.a.o.g;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Log;
import l.a.a.a.f;
import l.a.a.a.o.b.i;

/* compiled from: IconRequest */
public class m {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5180b;
    public final int c;
    public final int d;

    public m(String str, int i2, int i3, int i4) {
        this.a = str;
        this.f5180b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static m a(Context context, String str) {
        if (str == null) {
            return null;
        }
        try {
            int c2 = i.c(context);
            String str2 = "App icon resource ID is " + c2;
            if (f.a().a("Fabric", 3)) {
                Log.d("Fabric", str2, (Throwable) null);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(context.getResources(), c2, options);
            return new m(str, c2, options.outWidth, options.outHeight);
        } catch (Exception e) {
            if (!f.a().a("Fabric", 6)) {
                return null;
            }
            Log.e("Fabric", "Failed to load icon", e);
            return null;
        }
    }
}
