package com.google.firebase.messaging;

import i.c.d.o.b;
import i.c.d.o.e;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public class FirebaseMessagingService extends e {

    /* renamed from: j  reason: collision with root package name */
    public static final Queue<String> f709j = new ArrayDeque(10);

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Intent r14) {
        /*
            r13 = this;
            java.lang.String r0 = r14.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r3 = "FirebaseMessaging"
            if (r1 != 0) goto L_0x005b
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L_0x0017
            goto L_0x005b
        L_0x0017:
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x002b
            boolean r0 = i.c.d.o.q.a(r14)
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "_nd"
            i.c.d.o.q.a((java.lang.String) r0, (android.content.Intent) r14)
            return
        L_0x002b:
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "token"
            java.lang.String r14 = r14.getStringExtra(r0)
            r13.a((java.lang.String) r14)
            return
        L_0x003d:
            java.lang.String r0 = "Unknown intent action: "
            java.lang.String r14 = r14.getAction()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r1 = r14.length()
            if (r1 == 0) goto L_0x0052
            java.lang.String r14 = r0.concat(r14)
            goto L_0x0057
        L_0x0052:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r0)
        L_0x0057:
            android.util.Log.d(r3, r14)
        L_0x005a:
            return
        L_0x005b:
            java.lang.String r0 = "google.message_id"
            java.lang.String r1 = r14.getStringExtra(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            r5 = 0
            if (r4 == 0) goto L_0x006d
            i.c.a.b.l.g r4 = i.c.a.b.d.l.q.b(r5)
            goto L_0x0086
        L_0x006d:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putString(r0, r1)
            i.c.d.k.g r6 = i.c.d.k.g.a((android.content.Context) r13)
            i.c.d.k.q r7 = new i.c.d.k.q
            int r8 = r6.a()
            r7.<init>(r8, r4)
            i.c.a.b.l.g r4 = r6.a(r7)
        L_0x0086:
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            r7 = 3
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L_0x0090
            goto L_0x00cd
        L_0x0090:
            java.util.Queue<java.lang.String> r6 = f709j
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x00b9
            boolean r6 = android.util.Log.isLoggable(r3, r7)
            if (r6 == 0) goto L_0x00b7
            java.lang.String r6 = "Received duplicate message: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r10 = r1.length()
            if (r10 == 0) goto L_0x00af
            java.lang.String r1 = r6.concat(r1)
            goto L_0x00b4
        L_0x00af:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
        L_0x00b4:
            android.util.Log.d(r3, r1)
        L_0x00b7:
            r1 = 1
            goto L_0x00ce
        L_0x00b9:
            java.util.Queue<java.lang.String> r6 = f709j
            int r6 = r6.size()
            r10 = 10
            if (r6 < r10) goto L_0x00c8
            java.util.Queue<java.lang.String> r6 = f709j
            r6.remove()
        L_0x00c8:
            java.util.Queue<java.lang.String> r6 = f709j
            r6.add(r1)
        L_0x00cd:
            r1 = 0
        L_0x00ce:
            if (r1 != 0) goto L_0x0212
            java.lang.String r1 = "message_type"
            java.lang.String r1 = r14.getStringExtra(r1)
            java.lang.String r6 = "gcm"
            if (r1 != 0) goto L_0x00db
            r1 = r6
        L_0x00db:
            r10 = -1
            int r11 = r1.hashCode()
            r12 = 2
            switch(r11) {
                case -2062414158: goto L_0x0101;
                case 102161: goto L_0x00f9;
                case 814694033: goto L_0x00ef;
                case 814800675: goto L_0x00e5;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            goto L_0x010a
        L_0x00e5:
            java.lang.String r6 = "send_event"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x010a
            r10 = 2
            goto L_0x010a
        L_0x00ef:
            java.lang.String r6 = "send_error"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x010a
            r10 = 3
            goto L_0x010a
        L_0x00f9:
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x010a
            r10 = 0
            goto L_0x010a
        L_0x0101:
            java.lang.String r6 = "deleted_messages"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x010a
            r10 = 1
        L_0x010a:
            if (r10 == 0) goto L_0x0147
            if (r10 == r9) goto L_0x0212
            if (r10 == r12) goto L_0x0142
            if (r10 == r7) goto L_0x012a
            java.lang.String r14 = "Received message with unknown type: "
            int r0 = r1.length()
            if (r0 == 0) goto L_0x011f
            java.lang.String r14 = r14.concat(r1)
            goto L_0x0125
        L_0x011f:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r14)
            r14 = r0
        L_0x0125:
            android.util.Log.w(r3, r14)
            goto L_0x0212
        L_0x012a:
            java.lang.String r0 = r14.getStringExtra(r0)
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = "message_id"
            r14.getStringExtra(r0)
        L_0x0135:
            com.google.firebase.messaging.SendException r0 = new com.google.firebase.messaging.SendException
            java.lang.String r1 = "error"
            java.lang.String r14 = r14.getStringExtra(r1)
            r0.<init>(r14)
            goto L_0x0212
        L_0x0142:
            r14.getStringExtra(r0)
            goto L_0x0212
        L_0x0147:
            boolean r0 = i.c.d.o.q.a(r14)
            if (r0 == 0) goto L_0x0150
            i.c.d.o.q.a((android.content.Intent) r14, (i.c.a.a.f<java.lang.String>) r5)
        L_0x0150:
            java.lang.String r0 = r14.getAction()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x015b
            goto L_0x01a8
        L_0x015b:
            java.lang.String r0 = "delivery_metrics_exported_to_big_query_enabled"
            com.google.firebase.FirebaseApp.getInstance()     // Catch:{ IllegalStateException -> 0x01a3 }
            com.google.firebase.FirebaseApp r1 = com.google.firebase.FirebaseApp.getInstance()
            r1.a()
            android.content.Context r1 = r1.a
            java.lang.String r2 = "com.google.firebase.messaging"
            android.content.SharedPreferences r2 = r1.getSharedPreferences(r2, r8)
            java.lang.String r5 = "export_to_big_query"
            boolean r6 = r2.contains(r5)
            if (r6 == 0) goto L_0x017c
            boolean r8 = r2.getBoolean(r5, r8)
            goto L_0x01a8
        L_0x017c:
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01a1 }
            if (r2 == 0) goto L_0x01a8
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x01a1 }
            r5 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r5)     // Catch:{ NameNotFoundException -> 0x01a1 }
            if (r1 == 0) goto L_0x01a8
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x01a1 }
            if (r2 == 0) goto L_0x01a8
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x01a1 }
            boolean r2 = r2.containsKey(r0)     // Catch:{ NameNotFoundException -> 0x01a1 }
            if (r2 == 0) goto L_0x01a8
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x01a1 }
            boolean r8 = r1.getBoolean(r0, r8)     // Catch:{ NameNotFoundException -> 0x01a1 }
            goto L_0x01a8
        L_0x01a1:
            goto L_0x01a8
        L_0x01a3:
            java.lang.String r0 = "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
            android.util.Log.i(r3, r0)
        L_0x01a8:
            if (r8 == 0) goto L_0x01c8
            i.c.a.a.g r0 = com.google.firebase.messaging.FirebaseMessaging.a
            if (r0 == 0) goto L_0x01c3
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            i.c.a.a.b r2 = new i.c.a.a.b
            java.lang.String r5 = "json"
            r2.<init>(r5)
            i.c.a.a.e r5 = i.c.d.o.m.a
            java.lang.String r6 = "FCM_CLIENT_EVENT_LOGGING"
            i.c.a.a.f r0 = r0.a(r6, r1, r2, r5)
            i.c.d.o.q.a((android.content.Intent) r14, (i.c.a.a.f<java.lang.String>) r0)
            goto L_0x01c8
        L_0x01c3:
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r3, r0)
        L_0x01c8:
            android.os.Bundle r0 = r14.getExtras()
            if (r0 != 0) goto L_0x01d3
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x01d3:
            java.lang.String r1 = "androidx.contentpager.content.wakelockid"
            r0.remove(r1)
            boolean r1 = i.c.d.o.p.a((android.os.Bundle) r0)
            if (r1 == 0) goto L_0x020a
            i.c.d.o.p r1 = new i.c.d.o.p
            r1.<init>(r0)
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            i.c.d.o.f r5 = new i.c.d.o.f
            r5.<init>(r13, r1, r2)
            boolean r1 = r5.a()     // Catch:{ all -> 0x0205 }
            if (r1 == 0) goto L_0x01f6
            r2.shutdown()
            goto L_0x0212
        L_0x01f6:
            r2.shutdown()
            boolean r1 = i.c.d.o.q.a(r14)
            if (r1 == 0) goto L_0x020a
            java.lang.String r1 = "_nf"
            i.c.d.o.q.a((java.lang.String) r1, (android.content.Intent) r14)
            goto L_0x020a
        L_0x0205:
            r14 = move-exception
            r2.shutdown()
            throw r14
        L_0x020a:
            i.c.d.o.b r14 = new i.c.d.o.b
            r14.<init>(r0)
            r13.a((i.c.d.o.b) r14)
        L_0x0212:
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x0224, InterruptedException -> 0x0222, TimeoutException -> 0x0220 }
            r0 = 1
            long r0 = r14.toMillis(r0)     // Catch:{ ExecutionException -> 0x0224, InterruptedException -> 0x0222, TimeoutException -> 0x0220 }
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x0224, InterruptedException -> 0x0222, TimeoutException -> 0x0220 }
            i.c.a.b.d.l.q.a(r4, (long) r0, (java.util.concurrent.TimeUnit) r14)     // Catch:{ ExecutionException -> 0x0224, InterruptedException -> 0x0222, TimeoutException -> 0x0220 }
            return
        L_0x0220:
            r14 = move-exception
            goto L_0x0225
        L_0x0222:
            r14 = move-exception
            goto L_0x0225
        L_0x0224:
            r14 = move-exception
        L_0x0225:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r0 = r14.length()
            int r0 = r0 + 20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Message ack failed: "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            android.util.Log.w(r3, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.a(android.content.Intent):void");
    }

    public void a(b bVar) {
    }

    public void a(String str) {
    }
}
