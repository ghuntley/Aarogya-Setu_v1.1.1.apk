package i.c.d.o;

import android.content.Intent;
import i.c.a.b.d.l.q;
import i.c.d.h.d;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final class a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f4756b;

    /* renamed from: i.c.d.o.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
    public static class C0135a implements i.c.d.h.c<a> {
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
            if ("normal".equals(r6) != false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0156, code lost:
            if (r0.isEmpty() != false) goto L_0x0158;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00e0  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x010d  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0135  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x015b  */
        /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void a(java.lang.Object r6, java.lang.Object r7) {
            /*
                r5 = this;
                i.c.d.o.a r6 = (i.c.d.o.a) r6
                i.c.d.h.d r7 = (i.c.d.h.d) r7
                android.content.Intent r0 = r6.f4756b
                android.os.Bundle r1 = r0.getExtras()
                java.lang.String r2 = "google.ttl"
                java.lang.Object r1 = r1.get(r2)
                boolean r2 = r1 instanceof java.lang.Integer
                r3 = 0
                if (r2 == 0) goto L_0x001c
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                goto L_0x0049
            L_0x001c:
                boolean r2 = r1 instanceof java.lang.String
                if (r2 == 0) goto L_0x0048
                r2 = r1
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x0028 }
                int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0028 }
                goto L_0x0049
            L_0x0028:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r1.length()
                int r2 = r2 + 13
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r2)
                java.lang.String r2 = "Invalid TTL: "
                r4.append(r2)
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                java.lang.String r2 = "FirebaseMessaging"
                android.util.Log.w(r2, r1)
            L_0x0048:
                r1 = 0
            L_0x0049:
                java.lang.String r2 = "ttl"
                r7.a((java.lang.String) r2, (int) r1)
                java.lang.String r6 = r6.a
                java.lang.String r1 = "event"
                r7.a((java.lang.String) r1, (java.lang.Object) r6)
                com.google.firebase.FirebaseApp r6 = com.google.firebase.FirebaseApp.getInstance()
                com.google.firebase.iid.FirebaseInstanceId r6 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r6)
                com.google.firebase.FirebaseApp r1 = r6.f701b
                com.google.firebase.iid.FirebaseInstanceId.a((com.google.firebase.FirebaseApp) r1)
                r6.d()
                java.lang.String r6 = r6.f()
                java.lang.String r1 = "instanceId"
                r7.a((java.lang.String) r1, (java.lang.Object) r6)
                java.lang.String r6 = "google.delivered_priority"
                java.lang.String r6 = r0.getStringExtra(r6)
                r1 = 2
                r2 = 1
                if (r6 != 0) goto L_0x008d
                java.lang.String r6 = "google.priority_reduced"
                java.lang.String r6 = r0.getStringExtra(r6)
                java.lang.String r4 = "1"
                boolean r6 = r4.equals(r6)
                if (r6 == 0) goto L_0x0087
                goto L_0x009f
            L_0x0087:
                java.lang.String r6 = "google.priority"
                java.lang.String r6 = r0.getStringExtra(r6)
            L_0x008d:
                java.lang.String r4 = "high"
                boolean r4 = r4.equals(r6)
                if (r4 == 0) goto L_0x0097
                r3 = 1
                goto L_0x00a0
            L_0x0097:
                java.lang.String r4 = "normal"
                boolean r6 = r4.equals(r6)
                if (r6 == 0) goto L_0x00a0
            L_0x009f:
                r3 = 2
            L_0x00a0:
                java.lang.String r6 = "priority"
                r7.a((java.lang.String) r6, (int) r3)
                com.google.firebase.FirebaseApp r6 = com.google.firebase.FirebaseApp.getInstance()
                r6.a()
                android.content.Context r6 = r6.a
                java.lang.String r6 = r6.getPackageName()
                java.lang.String r3 = "packageName"
                r7.a((java.lang.String) r3, (java.lang.Object) r6)
                java.lang.String r6 = "sdkPlatform"
                java.lang.String r3 = "ANDROID"
                r7.a((java.lang.String) r6, (java.lang.Object) r3)
                android.os.Bundle r6 = r0.getExtras()
                if (r6 == 0) goto L_0x00d1
                android.os.Bundle r6 = r0.getExtras()
                boolean r6 = i.c.d.o.p.a((android.os.Bundle) r6)
                if (r6 == 0) goto L_0x00d1
                java.lang.String r6 = "DISPLAY_NOTIFICATION"
                goto L_0x00d3
            L_0x00d1:
                java.lang.String r6 = "DATA_MESSAGE"
            L_0x00d3:
                java.lang.String r3 = "messageType"
                r7.a((java.lang.String) r3, (java.lang.Object) r6)
                java.lang.String r6 = "google.message_id"
                java.lang.String r6 = r0.getStringExtra(r6)
                if (r6 != 0) goto L_0x00e6
                java.lang.String r6 = "message_id"
                java.lang.String r6 = r0.getStringExtra(r6)
            L_0x00e6:
                if (r6 == 0) goto L_0x00ed
                java.lang.String r3 = "messageId"
                r7.a((java.lang.String) r3, (java.lang.Object) r6)
            L_0x00ed:
                java.lang.String r6 = i.c.d.o.q.b(r0)
                if (r6 == 0) goto L_0x00f8
                java.lang.String r3 = "topic"
                r7.a((java.lang.String) r3, (java.lang.Object) r6)
            L_0x00f8:
                java.lang.String r6 = "collapse_key"
                java.lang.String r6 = r0.getStringExtra(r6)
                if (r6 == 0) goto L_0x0105
                java.lang.String r3 = "collapseKey"
                r7.a((java.lang.String) r3, (java.lang.Object) r6)
            L_0x0105:
                java.lang.String r6 = "google.c.a.m_l"
                java.lang.String r3 = r0.getStringExtra(r6)
                if (r3 == 0) goto L_0x0116
                java.lang.String r6 = r0.getStringExtra(r6)
                java.lang.String r3 = "analyticsLabel"
                r7.a((java.lang.String) r3, (java.lang.Object) r6)
            L_0x0116:
                java.lang.String r6 = "google.c.a.c_l"
                java.lang.String r3 = r0.getStringExtra(r6)
                if (r3 == 0) goto L_0x0127
                java.lang.String r6 = r0.getStringExtra(r6)
                java.lang.String r0 = "composerLabel"
                r7.a((java.lang.String) r0, (java.lang.Object) r6)
            L_0x0127:
                com.google.firebase.FirebaseApp r6 = com.google.firebase.FirebaseApp.getInstance()
                r6.a()
                i.c.d.c r0 = r6.c
                java.lang.String r0 = r0.e
                if (r0 == 0) goto L_0x0135
                goto L_0x0159
            L_0x0135:
                r6.a()
                i.c.d.c r6 = r6.c
                java.lang.String r0 = r6.f4636b
                java.lang.String r6 = "1:"
                boolean r6 = r0.startsWith(r6)
                if (r6 != 0) goto L_0x0145
                goto L_0x0159
            L_0x0145:
                java.lang.String r6 = ":"
                java.lang.String[] r6 = r0.split(r6)
                int r0 = r6.length
                r3 = 0
                if (r0 >= r1) goto L_0x0150
                goto L_0x0158
            L_0x0150:
                r0 = r6[r2]
                boolean r6 = r0.isEmpty()
                if (r6 == 0) goto L_0x0159
            L_0x0158:
                r0 = r3
            L_0x0159:
                if (r0 == 0) goto L_0x0160
                java.lang.String r6 = "projectNumber"
                r7.a((java.lang.String) r6, (java.lang.Object) r0)
            L_0x0160:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.c.d.o.a.C0135a.a(java.lang.Object, java.lang.Object):void");
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
    public static final class b implements i.c.d.h.c<c> {
        public final /* synthetic */ void a(Object obj, Object obj2) {
            ((d) obj2).a("messaging_client_event", (Object) ((c) obj).a);
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
    public static final class c {
        public final a a;

        public c(a aVar) {
            q.a(aVar);
            this.a = aVar;
        }
    }

    public a(String str, Intent intent) {
        q.a(str, (Object) "evenType must be non-null");
        this.a = str;
        q.a(intent, (Object) "intent must be non-null");
        this.f4756b = intent;
    }
}
