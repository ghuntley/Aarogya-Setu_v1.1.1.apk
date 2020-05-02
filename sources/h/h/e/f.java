package h.h.e;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* compiled from: NotificationCompat */
public class f {
    public final Bundle a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f1714b;
    public final n[] c;
    public final n[] d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1715f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1716g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1717h;
    @Deprecated

    /* renamed from: i  reason: collision with root package name */
    public int f1718i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1719j;

    /* renamed from: k  reason: collision with root package name */
    public PendingIntent f1720k;

    public f(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        int i3;
        IconCompat a2 = i2 == 0 ? null : IconCompat.a((Resources) null, "", i2);
        Bundle bundle = new Bundle();
        this.f1715f = true;
        this.f1714b = a2;
        if (a2 != null) {
            int i4 = -1;
            if (a2.a != -1 || (i3 = Build.VERSION.SDK_INT) < 23) {
                i4 = a2.a;
            } else {
                Icon icon = (Icon) a2.f211b;
                if (i3 >= 28) {
                    i4 = icon.getType();
                } else {
                    try {
                        i4 = ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
                    } catch (IllegalAccessException e2) {
                        Log.e("IconCompat", "Unable to get icon type " + icon, e2);
                    } catch (InvocationTargetException e3) {
                        Log.e("IconCompat", "Unable to get icon type " + icon, e3);
                    } catch (NoSuchMethodException e4) {
                        Log.e("IconCompat", "Unable to get icon type " + icon, e4);
                    }
                }
            }
            if (i4 == 2) {
                this.f1718i = a2.a();
            }
        }
        this.f1719j = i.c(charSequence);
        this.f1720k = pendingIntent;
        this.a = bundle;
        this.c = null;
        this.d = null;
        this.e = true;
        this.f1716g = 0;
        this.f1715f = true;
        this.f1717h = false;
    }

    public IconCompat a() {
        int i2;
        if (this.f1714b == null && (i2 = this.f1718i) != 0) {
            this.f1714b = IconCompat.a((Resources) null, "", i2);
        }
        return this.f1714b;
    }
}
