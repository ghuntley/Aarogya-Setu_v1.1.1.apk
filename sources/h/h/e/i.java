package h.h.e;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import h.h.b;
import java.util.ArrayList;

/* compiled from: NotificationCompat */
public class i {
    public String A;
    public Bundle B;
    public int C = 0;
    public int D = 0;
    public Notification E;
    public RemoteViews F;
    public RemoteViews G;
    public RemoteViews H;
    public String I;
    public int J = 0;
    public String K;
    public long L;
    public int M = 0;
    public boolean N;
    public Notification O;
    public boolean P;
    @Deprecated
    public ArrayList<String> Q;
    public Context a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<f> f1722b = new ArrayList<>();
    public ArrayList<f> c = new ArrayList<>();
    public CharSequence d;
    public CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public PendingIntent f1723f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f1724g;

    /* renamed from: h  reason: collision with root package name */
    public RemoteViews f1725h;

    /* renamed from: i  reason: collision with root package name */
    public Bitmap f1726i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1727j;

    /* renamed from: k  reason: collision with root package name */
    public int f1728k;

    /* renamed from: l  reason: collision with root package name */
    public int f1729l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1730m = true;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1731n;

    /* renamed from: o  reason: collision with root package name */
    public j f1732o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f1733p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence[] f1734q;
    public int r;
    public int s;
    public boolean t;
    public String u;
    public boolean v;
    public String w;
    public boolean x = false;
    public boolean y;
    public boolean z;

    public i(Context context, String str) {
        Notification notification = new Notification();
        this.O = notification;
        this.a = context;
        this.I = str;
        notification.when = System.currentTimeMillis();
        this.O.audioStreamType = -1;
        this.f1729l = 0;
        this.Q = new ArrayList<>();
        this.N = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public i a(CharSequence charSequence) {
        this.e = c(charSequence);
        return this;
    }

    public i b(CharSequence charSequence) {
        this.d = c(charSequence);
        return this;
    }

    public i a(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(b.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(b.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
        }
        this.f1726i = bitmap;
        return this;
    }

    public i a(Uri uri) {
        Notification notification = this.O;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        return this;
    }

    public final void a(int i2, boolean z2) {
        if (z2) {
            Notification notification = this.O;
            notification.flags = i2 | notification.flags;
            return;
        }
        Notification notification2 = this.O;
        notification2.flags = (~i2) & notification2.flags;
    }

    public i a(j jVar) {
        if (this.f1732o != jVar) {
            this.f1732o = jVar;
            if (!(jVar == null || jVar.a == this)) {
                jVar.a = this;
                a(jVar);
            }
        }
        return this;
    }

    public Notification a() {
        Notification notification;
        k kVar = new k(this);
        j jVar = kVar.f1736b.f1732o;
        if (jVar != null) {
            jVar.a(kVar);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            notification = kVar.a.build();
        } else if (i2 >= 24) {
            notification = kVar.a.build();
            if (kVar.f1738g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || kVar.f1738g != 2)) {
                    kVar.a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && kVar.f1738g == 1) {
                    kVar.a(notification);
                }
            }
        } else {
            kVar.a.setExtras(kVar.f1737f);
            notification = kVar.a.build();
            RemoteViews remoteViews = kVar.c;
            if (remoteViews != null) {
                notification.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = kVar.d;
            if (remoteViews2 != null) {
                notification.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = kVar.f1739h;
            if (remoteViews3 != null) {
                notification.headsUpContentView = remoteViews3;
            }
            if (kVar.f1738g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || kVar.f1738g != 2)) {
                    kVar.a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && kVar.f1738g == 1) {
                    kVar.a(notification);
                }
            }
        }
        RemoteViews remoteViews4 = kVar.f1736b.F;
        if (remoteViews4 != null) {
            notification.contentView = remoteViews4;
        }
        if (jVar == null || kVar.f1736b.f1732o != null) {
            if (jVar != null) {
                Bundle bundle = notification.extras;
            }
            return notification;
        }
        throw null;
    }
}
