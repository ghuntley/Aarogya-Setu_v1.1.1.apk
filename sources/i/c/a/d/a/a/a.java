package i.c.a.d.a.a;

import android.app.PendingIntent;

public final class a {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f4289b;
    public final PendingIntent c;

    public a(String str, int i2, int i3, int i4, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        this.a = i3;
        this.f4289b = pendingIntent;
        this.c = pendingIntent2;
    }

    public final boolean a(int i2) {
        return i2 == 0 ? this.c != null : i2 == 1 && this.f4289b != null;
    }
}
