package h.h.e;

import android.app.Notification;
import android.graphics.Bitmap;

/* compiled from: NotificationCompat */
public class g extends j {
    public Bitmap d;
    public Bitmap e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1721f;

    public void a(e eVar) {
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(((k) eVar).a).setBigContentTitle(this.f1735b).bigPicture(this.d);
        if (this.f1721f) {
            bigPicture.bigLargeIcon(this.e);
        }
        if (this.c) {
            bigPicture.setSummaryText((CharSequence) null);
        }
    }
}
