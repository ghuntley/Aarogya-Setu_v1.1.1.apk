package h.a0;

import android.app.Notification;

/* compiled from: ForegroundInfo */
public final class h {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f917b;
    public final Notification c;

    public h(int i2, Notification notification, int i3) {
        this.a = i2;
        this.c = notification;
        this.f917b = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a == hVar.a && this.f917b == hVar.f917b) {
            return this.c.equals(hVar.c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.f917b) * 31);
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.a + ", mForegroundServiceType=" + this.f917b + ", mNotification=" + this.c + '}';
    }
}
