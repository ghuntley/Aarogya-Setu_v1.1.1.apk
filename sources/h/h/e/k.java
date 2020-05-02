package h.h.e;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder */
public class k implements e {
    public final Notification.Builder a;

    /* renamed from: b  reason: collision with root package name */
    public final i f1736b;
    public RemoteViews c;
    public RemoteViews d;
    public final List<Bundle> e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f1737f = new Bundle();

    /* renamed from: g  reason: collision with root package name */
    public int f1738g;

    /* renamed from: h  reason: collision with root package name */
    public RemoteViews f1739h;

    public k(i iVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        i iVar2 = iVar;
        this.f1736b = iVar2;
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new Notification.Builder(iVar2.a, iVar2.I);
        } else {
            this.a = new Notification.Builder(iVar2.a);
        }
        Notification notification = iVar2.O;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, iVar2.f1725h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(iVar2.d).setContentText(iVar2.e).setContentInfo(iVar2.f1727j).setContentIntent(iVar2.f1723f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(iVar2.f1724g, (notification.flags & 128) != 0).setLargeIcon(iVar2.f1726i).setNumber(iVar2.f1728k).setProgress(iVar2.r, iVar2.s, iVar2.t);
        this.a.setSubText(iVar2.f1733p).setUsesChronometer(iVar2.f1731n).setPriority(iVar2.f1729l);
        Iterator<f> it = iVar2.f1722b.iterator();
        while (it.hasNext()) {
            f next = it.next();
            IconCompat a2 = next.a();
            if (Build.VERSION.SDK_INT >= 23) {
                builder = new Notification.Action.Builder(a2 != null ? a2.d() : null, next.f1719j, next.f1720k);
            } else {
                builder = new Notification.Action.Builder(a2 != null ? a2.a() : 0, next.f1719j, next.f1720k);
            }
            n[] nVarArr = next.c;
            if (nVarArr != null) {
                int length = nVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (nVarArr.length <= 0) {
                    for (int i2 = 0; i2 < length; i2++) {
                        builder.addRemoteInput(remoteInputArr[i2]);
                    }
                } else {
                    n nVar = nVarArr[0];
                    throw null;
                }
            }
            if (next.a != null) {
                bundle = new Bundle(next.a);
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", next.e);
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(next.e);
            }
            bundle.putInt("android.support.action.semanticAction", next.f1716g);
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(next.f1716g);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(next.f1717h);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", next.f1715f);
            builder.addExtras(bundle);
            this.a.addAction(builder.build());
        }
        Bundle bundle2 = iVar2.B;
        if (bundle2 != null) {
            this.f1737f.putAll(bundle2);
        }
        this.c = iVar2.F;
        this.d = iVar2.G;
        this.a.setShowWhen(iVar2.f1730m);
        this.a.setLocalOnly(iVar2.x).setGroup(iVar2.u).setGroupSummary(iVar2.v).setSortKey(iVar2.w);
        this.f1738g = iVar2.M;
        this.a.setCategory(iVar2.A).setColor(iVar2.C).setVisibility(iVar2.D).setPublicVersion(iVar2.E).setSound(notification.sound, notification.audioAttributes);
        Iterator<String> it2 = iVar2.Q.iterator();
        while (it2.hasNext()) {
            this.a.addPerson(it2.next());
        }
        this.f1739h = iVar2.H;
        if (iVar2.c.size() > 0) {
            if (iVar2.B == null) {
                iVar2.B = new Bundle();
            }
            Bundle bundle3 = iVar2.B.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < iVar2.c.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), l.a(iVar2.c.get(i3)));
            }
            bundle3.putBundle("invisible_actions", bundle4);
            if (iVar2.B == null) {
                iVar2.B = new Bundle();
            }
            iVar2.B.putBundle("android.car.EXTENSIONS", bundle3);
            this.f1737f.putBundle("android.car.EXTENSIONS", bundle3);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.a.setExtras(iVar2.B).setRemoteInputHistory(iVar2.f1734q);
            RemoteViews remoteViews = iVar2.F;
            if (remoteViews != null) {
                this.a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = iVar2.G;
            if (remoteViews2 != null) {
                this.a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = iVar2.H;
            if (remoteViews3 != null) {
                this.a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setBadgeIconType(iVar2.J).setShortcutId(iVar2.K).setTimeoutAfter(iVar2.L).setGroupAlertBehavior(iVar2.M);
            if (iVar2.z) {
                this.a.setColorized(iVar2.y);
            }
            if (!TextUtils.isEmpty(iVar2.I)) {
                this.a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.setAllowSystemGeneratedContextualActions(iVar2.N);
            this.a.setBubbleMetadata((Notification.BubbleMetadata) null);
        }
        if (iVar2.P) {
            if (this.f1736b.v) {
                this.f1738g = 2;
            } else {
                this.f1738g = 1;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.f1736b.u)) {
                    this.a.setGroup("silent");
                }
                this.a.setGroupAlertBehavior(this.f1738g);
            }
        }
    }

    public final void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i2 = notification.defaults & -2;
        notification.defaults = i2;
        notification.defaults = i2 & -3;
    }
}
