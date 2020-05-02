package i.c.d.o;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final class d {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARNING: Removed duplicated region for block: B:112:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02f3 A[SYNTHETIC, Splitter:B:118:0x02f3] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0323 A[SYNTHETIC, Splitter:B:124:0x0323] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f A[SYNTHETIC, Splitter:B:12:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x042b A[SYNTHETIC, Splitter:B:164:0x042b] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0479 A[SYNTHETIC, Splitter:B:173:0x0479] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x058a  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0594  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0252  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i.c.d.o.c a(android.content.Context r14, i.c.d.o.p r15) {
        /*
            java.lang.String r0 = "Couldn't get own application info: "
            java.lang.String r1 = "FirebaseMessaging"
            android.content.pm.PackageManager r2 = r14.getPackageManager()
            java.lang.String r3 = r14.getPackageName()
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x001b }
            if (r2 == 0) goto L_0x0038
            android.os.Bundle r3 = r2.metaData     // Catch:{ NameNotFoundException -> 0x001b }
            if (r3 == 0) goto L_0x0038
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x001b }
            goto L_0x003a
        L_0x001b:
            r2 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            int r3 = r3 + 35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r1, r2)
        L_0x0038:
            android.os.Bundle r2 = android.os.Bundle.EMPTY
        L_0x003a:
            java.lang.String r3 = r14.getPackageName()
            java.lang.String r4 = "gcm.n.android_channel_id"
            java.lang.String r4 = r15.a((java.lang.String) r4)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            r7 = 3
            r8 = 0
            r9 = 0
            if (r5 >= r6) goto L_0x004f
            goto L_0x00d8
        L_0x004f:
            android.content.pm.PackageManager r5 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00d8 }
            java.lang.String r10 = r14.getPackageName()     // Catch:{ NameNotFoundException -> 0x00d8 }
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r10, r9)     // Catch:{ NameNotFoundException -> 0x00d8 }
            int r5 = r5.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x00d8 }
            if (r5 >= r6) goto L_0x0061
            goto L_0x00d8
        L_0x0061:
            java.lang.Class<android.app.NotificationManager> r5 = android.app.NotificationManager.class
            java.lang.Object r5 = r14.getSystemService(r5)
            android.app.NotificationManager r5 = (android.app.NotificationManager) r5
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x0095
            android.app.NotificationChannel r6 = r5.getNotificationChannel(r4)
            if (r6 == 0) goto L_0x0076
            goto L_0x00d9
        L_0x0076:
            r6 = 122(0x7a, float:1.71E-43)
            int r6 = i.a.a.a.a.a((java.lang.String) r4, (int) r6)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            java.lang.String r6 = "Notification Channel requested ("
            r10.append(r6)
            r10.append(r4)
            java.lang.String r4 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            android.util.Log.w(r1, r4)
        L_0x0095:
            java.lang.String r4 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r4 = r2.getString(r4)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x00ae
            android.app.NotificationChannel r6 = r5.getNotificationChannel(r4)
            if (r6 == 0) goto L_0x00a8
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r4 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            android.util.Log.w(r1, r4)
            goto L_0x00b3
        L_0x00ae:
            java.lang.String r4 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            android.util.Log.w(r1, r4)
        L_0x00b3:
            java.lang.String r4 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r6 = r5.getNotificationChannel(r4)
            if (r6 != 0) goto L_0x00d9
            android.content.res.Resources r6 = r14.getResources()
            java.lang.String r10 = r14.getPackageName()
            java.lang.String r11 = "fcm_fallback_notification_channel_label"
            java.lang.String r12 = "string"
            int r6 = r6.getIdentifier(r11, r12, r10)
            android.app.NotificationChannel r10 = new android.app.NotificationChannel
            java.lang.String r6 = r14.getString(r6)
            r10.<init>(r4, r6, r7)
            r5.createNotificationChannel(r10)
            goto L_0x00d9
        L_0x00d8:
            r4 = r8
        L_0x00d9:
            android.content.res.Resources r5 = r14.getResources()
            android.content.pm.PackageManager r6 = r14.getPackageManager()
            h.h.e.i r10 = new h.h.e.i
            r10.<init>(r14, r4)
            java.lang.String r4 = "gcm.n.title"
            java.lang.String r4 = r15.a(r5, r3, r4)
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 != 0) goto L_0x00f5
            r10.b(r4)
        L_0x00f5:
            java.lang.String r4 = "gcm.n.body"
            java.lang.String r4 = r15.a(r5, r3, r4)
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 != 0) goto L_0x010f
            r10.a((java.lang.CharSequence) r4)
            h.h.e.h r11 = new h.h.e.h
            r11.<init>()
            r11.a((java.lang.CharSequence) r4)
            r10.a((h.h.e.j) r11)
        L_0x010f:
            java.lang.String r4 = "gcm.n.icon"
            java.lang.String r4 = r15.a((java.lang.String) r4)
            boolean r11 = android.text.TextUtils.isEmpty(r4)
            if (r11 != 0) goto L_0x0158
            java.lang.String r11 = "drawable"
            int r11 = r5.getIdentifier(r4, r11, r3)
            if (r11 == 0) goto L_0x012a
            boolean r12 = a((android.content.res.Resources) r5, (int) r11)
            if (r12 == 0) goto L_0x012a
            goto L_0x0197
        L_0x012a:
            java.lang.String r11 = "mipmap"
            int r11 = r5.getIdentifier(r4, r11, r3)
            if (r11 == 0) goto L_0x0139
            boolean r12 = a((android.content.res.Resources) r5, (int) r11)
            if (r12 == 0) goto L_0x0139
            goto L_0x0197
        L_0x0139:
            r11 = 61
            int r11 = i.a.a.a.a.a((java.lang.String) r4, (int) r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "Icon resource "
            r12.append(r11)
            r12.append(r4)
            java.lang.String r4 = " not found. Notification will use default icon."
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            android.util.Log.w(r1, r4)
        L_0x0158:
            java.lang.String r4 = "com.google.firebase.messaging.default_notification_icon"
            int r4 = r2.getInt(r4, r9)
            if (r4 == 0) goto L_0x0166
            boolean r11 = a((android.content.res.Resources) r5, (int) r4)
            if (r11 != 0) goto L_0x018b
        L_0x0166:
            android.content.pm.ApplicationInfo r11 = r6.getApplicationInfo(r3, r9)     // Catch:{ NameNotFoundException -> 0x016e }
            int r0 = r11.icon     // Catch:{ NameNotFoundException -> 0x016e }
            r11 = r0
            goto L_0x018c
        L_0x016e:
            r11 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r11)
            int r12 = r11.length()
            int r12 = r12 + 35
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r12)
            r13.append(r0)
            r13.append(r11)
            java.lang.String r0 = r13.toString()
            android.util.Log.w(r1, r0)
        L_0x018b:
            r11 = r4
        L_0x018c:
            if (r11 == 0) goto L_0x0194
            boolean r0 = a((android.content.res.Resources) r5, (int) r11)
            if (r0 != 0) goto L_0x0197
        L_0x0194:
            r11 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x0197:
            android.app.Notification r0 = r10.O
            r0.icon = r11
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r0 = r15.a((java.lang.String) r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x01ad
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r0 = r15.a((java.lang.String) r0)
        L_0x01ad:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            r11 = 2
            if (r4 == 0) goto L_0x01b6
            r0 = r8
            goto L_0x01f2
        L_0x01b6:
            java.lang.String r4 = "default"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x01ee
            java.lang.String r4 = "raw"
            int r4 = r5.getIdentifier(r0, r4, r3)
            if (r4 == 0) goto L_0x01ee
            r4 = 24
            int r4 = i.a.a.a.a.a((java.lang.String) r3, (int) r4)
            int r4 = i.a.a.a.a.a((java.lang.String) r0, (int) r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "android.resource://"
            r5.append(r4)
            r5.append(r3)
            java.lang.String r4 = "/raw/"
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x01f2
        L_0x01ee:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r11)
        L_0x01f2:
            if (r0 == 0) goto L_0x01f7
            r10.a((android.net.Uri) r0)
        L_0x01f7:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r0 = r15.a((java.lang.String) r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x0211
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0)
            r4.setPackage(r3)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r4.setFlags(r0)
            goto L_0x024a
        L_0x0211:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r0 = r15.a((java.lang.String) r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x0223
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r0 = r15.a((java.lang.String) r0)
        L_0x0223:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x022e
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x022f
        L_0x022e:
            r0 = r8
        L_0x022f:
            if (r0 == 0) goto L_0x023f
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.VIEW"
            r4.<init>(r5)
            r4.setPackage(r3)
            r4.setData(r0)
            goto L_0x024a
        L_0x023f:
            android.content.Intent r4 = r6.getLaunchIntentForPackage(r3)
            if (r4 != 0) goto L_0x024a
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r1, r0)
        L_0x024a:
            java.lang.String r0 = "google.c.a.e"
            r3 = 1
            if (r4 != 0) goto L_0x0252
            r4 = r8
            goto L_0x02c4
        L_0x0252:
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            r4.addFlags(r5)
            android.os.Bundle r5 = new android.os.Bundle
            android.os.Bundle r6 = r15.a
            r5.<init>(r6)
            android.os.Bundle r6 = r15.a
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0268:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x0296
            java.lang.Object r12 = r6.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "google.c."
            boolean r13 = r12.startsWith(r13)
            if (r13 != 0) goto L_0x028f
            java.lang.String r13 = "gcm.n."
            boolean r13 = r12.startsWith(r13)
            if (r13 != 0) goto L_0x028f
            java.lang.String r13 = "gcm.notification."
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L_0x028d
            goto L_0x028f
        L_0x028d:
            r13 = 0
            goto L_0x0290
        L_0x028f:
            r13 = 1
        L_0x0290:
            if (r13 == 0) goto L_0x0268
            r5.remove(r12)
            goto L_0x0268
        L_0x0296:
            r4.putExtras(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = a
            int r5 = r5.incrementAndGet()
            r6 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r4 = android.app.PendingIntent.getActivity(r14, r5, r4, r6)
            boolean r5 = r15.b(r0)
            if (r5 == 0) goto L_0x02c4
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            r5.<init>(r6)
            android.os.Bundle r6 = r15.a()
            android.content.Intent r5 = r5.putExtras(r6)
            java.lang.String r6 = "pending_intent"
            android.content.Intent r4 = r5.putExtra(r6, r4)
            android.app.PendingIntent r4 = a((android.content.Context) r14, (android.content.Intent) r4)
        L_0x02c4:
            r10.f1723f = r4
            boolean r0 = r15.b(r0)
            if (r0 != 0) goto L_0x02ce
            r0 = r8
            goto L_0x02e1
        L_0x02ce:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r4 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r0.<init>(r4)
            android.os.Bundle r4 = r15.a()
            android.content.Intent r0 = r0.putExtras(r4)
            android.app.PendingIntent r0 = a((android.content.Context) r14, (android.content.Intent) r0)
        L_0x02e1:
            if (r0 == 0) goto L_0x02e7
            android.app.Notification r4 = r10.O
            r4.deleteIntent = r0
        L_0x02e7:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r0 = r15.a((java.lang.String) r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x031b
            int r4 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x02fc }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x02fc }
            goto L_0x0332
        L_0x02fc:
            r4 = 56
            int r4 = i.a.a.a.a.a((java.lang.String) r0, (int) r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Color is invalid: "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = ". Notification will use default color."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.w(r1, r0)
        L_0x031b:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r2.getInt(r0, r9)
            if (r0 == 0) goto L_0x0331
            int r14 = h.h.f.a.a((android.content.Context) r14, (int) r0)     // Catch:{ NotFoundException -> 0x032c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ NotFoundException -> 0x032c }
            goto L_0x0332
        L_0x032c:
            java.lang.String r14 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r1, r14)
        L_0x0331:
            r14 = r8
        L_0x0332:
            if (r14 == 0) goto L_0x033a
            int r14 = r14.intValue()
            r10.C = r14
        L_0x033a:
            java.lang.String r14 = "gcm.n.sticky"
            boolean r14 = r15.b(r14)
            r14 = r14 ^ r3
            r0 = 16
            r10.a(r0, r14)
            java.lang.String r14 = "gcm.n.local_only"
            boolean r14 = r15.b(r14)
            r10.x = r14
            java.lang.String r14 = "gcm.n.ticker"
            java.lang.String r14 = r15.a((java.lang.String) r14)
            if (r14 == 0) goto L_0x035e
            android.app.Notification r0 = r10.O
            java.lang.CharSequence r14 = h.h.e.i.c(r14)
            r0.tickerText = r14
        L_0x035e:
            java.lang.String r14 = "gcm.n.notification_priority"
            java.lang.Integer r14 = r15.c(r14)
            r0 = -2
            if (r14 != 0) goto L_0x0368
            goto L_0x0397
        L_0x0368:
            int r2 = r14.intValue()
            if (r2 < r0) goto L_0x0374
            int r2 = r14.intValue()
            if (r2 <= r11) goto L_0x0398
        L_0x0374:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r2 = r14.length()
            int r2 = r2 + 72
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            java.lang.String r2 = "notificationPriority is invalid "
            r4.append(r2)
            r4.append(r14)
            java.lang.String r14 = ". Skipping setting notificationPriority."
            r4.append(r14)
            java.lang.String r14 = r4.toString()
            android.util.Log.w(r1, r14)
        L_0x0397:
            r14 = r8
        L_0x0398:
            if (r14 == 0) goto L_0x03a0
            int r14 = r14.intValue()
            r10.f1729l = r14
        L_0x03a0:
            java.lang.String r14 = "gcm.n.visibility"
            java.lang.Integer r14 = r15.c(r14)
            java.lang.String r2 = "NotificationParams"
            if (r14 != 0) goto L_0x03ab
            goto L_0x03db
        L_0x03ab:
            int r4 = r14.intValue()
            r5 = -1
            if (r4 < r5) goto L_0x03b8
            int r4 = r14.intValue()
            if (r4 <= r3) goto L_0x03dc
        L_0x03b8:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r4 = r14.length()
            int r4 = r4 + 53
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "visibility is invalid: "
            r5.append(r4)
            r5.append(r14)
            java.lang.String r14 = ". Skipping setting visibility."
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            android.util.Log.w(r2, r14)
        L_0x03db:
            r14 = r8
        L_0x03dc:
            if (r14 == 0) goto L_0x03e4
            int r14 = r14.intValue()
            r10.D = r14
        L_0x03e4:
            java.lang.String r14 = "gcm.n.notification_count"
            java.lang.Integer r14 = r15.c(r14)
            if (r14 != 0) goto L_0x03ed
            goto L_0x0416
        L_0x03ed:
            int r4 = r14.intValue()
            if (r4 >= 0) goto L_0x0417
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r4 = r14.length()
            int r4 = r4 + 67
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "notificationCount is invalid: "
            r5.append(r4)
            r5.append(r14)
            java.lang.String r14 = ". Skipping setting notificationCount."
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            android.util.Log.w(r1, r14)
        L_0x0416:
            r14 = r8
        L_0x0417:
            if (r14 == 0) goto L_0x041f
            int r14 = r14.intValue()
            r10.f1728k = r14
        L_0x041f:
            java.lang.String r14 = "gcm.n.event_time"
            java.lang.String r1 = r15.a((java.lang.String) r14)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x0463
            long r4 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0434 }
            java.lang.Long r14 = java.lang.Long.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0434 }
            goto L_0x0464
        L_0x0434:
            java.lang.String r14 = i.c.d.o.p.e(r14)
            r4 = 38
            int r4 = i.a.a.a.a.a((java.lang.String) r14, (int) r4)
            int r4 = i.a.a.a.a.a((java.lang.String) r1, (int) r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Couldn't parse value of "
            r5.append(r4)
            r5.append(r14)
            java.lang.String r14 = "("
            r5.append(r14)
            r5.append(r1)
            java.lang.String r14 = ") into a long"
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            android.util.Log.w(r2, r14)
        L_0x0463:
            r14 = r8
        L_0x0464:
            if (r14 == 0) goto L_0x0470
            r10.f1730m = r3
            long r4 = r14.longValue()
            android.app.Notification r14 = r10.O
            r14.when = r4
        L_0x0470:
            java.lang.String r14 = "gcm.n.vibrate_timings"
            org.json.JSONArray r14 = r15.d(r14)
            if (r14 != 0) goto L_0x0479
            goto L_0x04bc
        L_0x0479:
            int r1 = r14.length()     // Catch:{ NumberFormatException | JSONException -> 0x0499 }
            if (r1 <= r3) goto L_0x0491
            int r1 = r14.length()     // Catch:{ NumberFormatException | JSONException -> 0x0499 }
            long[] r4 = new long[r1]     // Catch:{ NumberFormatException | JSONException -> 0x0499 }
            r5 = 0
        L_0x0486:
            if (r5 >= r1) goto L_0x04bd
            long r12 = r14.optLong(r5)     // Catch:{ NumberFormatException | JSONException -> 0x0499 }
            r4[r5] = r12     // Catch:{ NumberFormatException | JSONException -> 0x0499 }
            int r5 = r5 + 1
            goto L_0x0486
        L_0x0491:
            org.json.JSONException r1 = new org.json.JSONException     // Catch:{ NumberFormatException | JSONException -> 0x0499 }
            java.lang.String r4 = "vibrateTimings have invalid length"
            r1.<init>(r4)     // Catch:{ NumberFormatException | JSONException -> 0x0499 }
            throw r1     // Catch:{ NumberFormatException | JSONException -> 0x0499 }
        L_0x0499:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r1 = r14.length()
            int r1 = r1 + 74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "User defined vibrateTimings is invalid: "
            r4.append(r1)
            r4.append(r14)
            java.lang.String r14 = ". Skipping setting vibrateTimings."
            r4.append(r14)
            java.lang.String r14 = r4.toString()
            android.util.Log.w(r2, r14)
        L_0x04bc:
            r4 = r8
        L_0x04bd:
            if (r4 == 0) goto L_0x04c3
            android.app.Notification r14 = r10.O
            r14.vibrate = r4
        L_0x04c3:
            java.lang.String r14 = ". Skipping setting LightSettings"
            java.lang.String r1 = "LightSettings is invalid: "
            java.lang.String r4 = "gcm.n.light_settings"
            org.json.JSONArray r4 = r15.d(r4)
            if (r4 != 0) goto L_0x04d1
            goto L_0x0555
        L_0x04d1:
            int[] r5 = new int[r7]
            int r6 = r4.length()     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
            if (r6 != r7) goto L_0x04fd
            java.lang.String r6 = r4.optString(r9)     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
            int r6 = android.graphics.Color.parseColor(r6)     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r6 == r7) goto L_0x04f5
            r5[r9] = r6     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
            int r6 = r4.optInt(r3)     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
            r5[r3] = r6     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
            int r6 = r4.optInt(r11)     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
            r5[r11] = r6     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
            r8 = r5
            goto L_0x0555
        L_0x04f5:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
            java.lang.String r6 = "Transparent color is invalid"
            r5.<init>(r6)     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
            throw r5     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
        L_0x04fd:
            org.json.JSONException r5 = new org.json.JSONException     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
            java.lang.String r6 = "lightSettings don't have all three fields"
            r5.<init>(r6)     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
            throw r5     // Catch:{ JSONException -> 0x0536, IllegalArgumentException -> 0x0505 }
        L_0x0505:
            r5 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = r5.getMessage()
            int r6 = r4.length()
            int r6 = r6 + 60
            int r6 = i.a.a.a.a.a((java.lang.String) r5, (int) r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r1)
            r7.append(r4)
            java.lang.String r1 = ". "
            r7.append(r1)
            r7.append(r5)
            r7.append(r14)
            java.lang.String r14 = r7.toString()
            android.util.Log.w(r2, r14)
            goto L_0x0555
        L_0x0536:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            int r5 = r5 + 58
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r1)
            r6.append(r4)
            r6.append(r14)
            java.lang.String r14 = r6.toString()
            android.util.Log.w(r2, r14)
        L_0x0555:
            if (r8 == 0) goto L_0x0572
            r14 = r8[r9]
            r1 = r8[r3]
            r2 = r8[r11]
            android.app.Notification r4 = r10.O
            r4.ledARGB = r14
            r4.ledOnMS = r1
            r4.ledOffMS = r2
            if (r1 == 0) goto L_0x056a
            if (r2 == 0) goto L_0x056a
            r9 = 1
        L_0x056a:
            android.app.Notification r14 = r10.O
            int r1 = r14.flags
            r0 = r0 & r1
            r0 = r0 | r9
            r14.flags = r0
        L_0x0572:
            java.lang.String r14 = "gcm.n.default_sound"
            boolean r14 = r15.b(r14)
            java.lang.String r0 = "gcm.n.default_vibrate_timings"
            boolean r0 = r15.b(r0)
            if (r0 == 0) goto L_0x0582
            r14 = r14 | 2
        L_0x0582:
            java.lang.String r0 = "gcm.n.default_light_settings"
            boolean r0 = r15.b(r0)
            if (r0 == 0) goto L_0x058c
            r14 = r14 | 4
        L_0x058c:
            android.app.Notification r0 = r10.O
            r0.defaults = r14
            r14 = r14 & 4
            if (r14 == 0) goto L_0x0599
            int r14 = r0.flags
            r14 = r14 | r3
            r0.flags = r14
        L_0x0599:
            i.c.d.o.c r14 = new i.c.d.o.c
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r15 = r15.a((java.lang.String) r0)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x05a8
            goto L_0x05bf
        L_0x05a8:
            long r0 = android.os.SystemClock.uptimeMillis()
            r15 = 37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r15)
            java.lang.String r15 = "FCM-Notification:"
            r2.append(r15)
            r2.append(r0)
            java.lang.String r15 = r2.toString()
        L_0x05bf:
            r14.<init>(r10, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.o.d.a(android.content.Context, i.c.d.o.p):i.c.d.o.c");
    }

    @TargetApi(26)
    public static boolean a(Resources resources, int i2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i2, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i2);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i2);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    public static PendingIntent a(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, a.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }
}
