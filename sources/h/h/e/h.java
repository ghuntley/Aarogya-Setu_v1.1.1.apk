package h.h.e;

import android.app.Notification;

/* compiled from: NotificationCompat */
public class h extends j {
    public CharSequence d;

    public h a(CharSequence charSequence) {
        this.d = i.c(charSequence);
        return this;
    }

    public void a(e eVar) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(((k) eVar).a).setBigContentTitle(this.f1735b).bigText(this.d);
        if (this.c) {
            bigText.setSummaryText((CharSequence) null);
        }
    }
}
