package b.a.a.l;

import android.content.Context;
import nic.goi.aarogyasetu.views.MainActivity;

/* compiled from: CorUtility.kt */
public final class t implements Runnable {
    public final /* synthetic */ Context e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MainActivity.b f439f;

    public t(Context context, MainActivity.b bVar) {
        this.e = context;
        this.f439f = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if ((r7 == null || r7.length() == 0) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if ((r7.length() == 0) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b0, code lost:
        if ((r7.length() == 0) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bd, code lost:
        if ((r7.length() == 0) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ca, code lost:
        if ((r7.length() == 0) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cc, code lost:
        r1 = nic.goi.aarogyasetu.CoronaApplication.f5224g;
        n.m.c.f.a((java.lang.Object) r1, "nic.goi.aarogyasetu.Coro…Application.getInstance()");
        r7 = android.provider.Settings.Secure.getString(r1.getContentResolver(), "bluetooth_address");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = b.a.a.l.h.b()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0013
            boolean r0 = n.q.d.b(r0)
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            if (r0 == 0) goto L_0x0017
            return
        L_0x0017:
            b.a.a.l.o$a r0 = b.a.a.l.o.f436b
            android.content.Context r4 = r1.e
            nic.goi.aarogyasetu.views.MainActivity$b r5 = r1.f439f
            if (r4 == 0) goto L_0x017f
            if (r5 == 0) goto L_0x0178
            java.lang.String r7 = ""
            q.e0 r8 = i.c.d.p.e.a((boolean) r2, (boolean) r2, (boolean) r3, (java.lang.String) r7)
            nic.goi.aarogyasetu.models.network.RegisterationData r9 = new nic.goi.aarogyasetu.models.network.RegisterationData
            android.bluetooth.BluetoothAdapter r10 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            java.lang.String r11 = "BluetoothAdapter.getDefaultAdapter()"
            n.m.c.f.a((java.lang.Object) r10, (java.lang.String) r11)
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "bluetooth_address"
            java.lang.String r12 = "nic.goi.aarogyasetu.Coro…Application.getInstance()"
            android.bluetooth.BluetoothAdapter r13 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            int r14 = android.os.Build.VERSION.SDK_INT
            java.lang.String r15 = "bluetoothAdapter"
            r6 = 23
            if (r14 < r6) goto L_0x00da
            java.lang.Class r6 = r13.getClass()     // Catch:{ NoSuchFieldException -> 0x00c0, NoSuchMethodException -> 0x00b3, IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x0099, all -> 0x0082 }
            java.lang.String r14 = "mService"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r14)     // Catch:{ NoSuchFieldException -> 0x00c0, NoSuchMethodException -> 0x00b3, IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x0099, all -> 0x0082 }
            java.lang.String r14 = "bluetoothAdapter.javaCla…DeclaredField(\"mService\")"
            n.m.c.f.a((java.lang.Object) r6, (java.lang.String) r14)     // Catch:{ NoSuchFieldException -> 0x00c0, NoSuchMethodException -> 0x00b3, IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x0099, all -> 0x0082 }
            r6.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x00c0, NoSuchMethodException -> 0x00b3, IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x0099, all -> 0x0082 }
            java.lang.Object r6 = r6.get(r13)     // Catch:{ NoSuchFieldException -> 0x00c0, NoSuchMethodException -> 0x00b3, IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x0099, all -> 0x0082 }
            if (r6 == 0) goto L_0x0073
            java.lang.Class r14 = r6.getClass()     // Catch:{ NoSuchFieldException -> 0x00c0, NoSuchMethodException -> 0x00b3, IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x0099, all -> 0x0082 }
            java.lang.String r3 = "getAddress"
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ NoSuchFieldException -> 0x00c0, NoSuchMethodException -> 0x00b3, IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x0099, all -> 0x0082 }
            java.lang.reflect.Method r1 = r14.getMethod(r3, r1)     // Catch:{ NoSuchFieldException -> 0x00c0, NoSuchMethodException -> 0x00b3, IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x0099, all -> 0x0082 }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ NoSuchFieldException -> 0x00c0, NoSuchMethodException -> 0x00b3, IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x0099, all -> 0x0082 }
            java.lang.Object r1 = r1.invoke(r6, r3)     // Catch:{ NoSuchFieldException -> 0x00c0, NoSuchMethodException -> 0x00b3, IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x0099, all -> 0x0082 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NoSuchFieldException -> 0x00c0, NoSuchMethodException -> 0x00b3, IllegalAccessException -> 0x00a6, InvocationTargetException -> 0x0099, all -> 0x0082 }
            r7 = r1
        L_0x0073:
            if (r7 == 0) goto L_0x007e
            int r1 = r7.length()
            if (r1 != 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r1 = 0
            goto L_0x007f
        L_0x007e:
            r1 = 1
        L_0x007f:
            if (r1 == 0) goto L_0x00e1
            goto L_0x00cc
        L_0x0082:
            r0 = move-exception
            int r1 = r7.length()
            if (r1 != 0) goto L_0x008a
            r2 = 1
        L_0x008a:
            if (r2 == 0) goto L_0x0098
            nic.goi.aarogyasetu.CoronaApplication r1 = nic.goi.aarogyasetu.CoronaApplication.f5224g
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r12)
            android.content.ContentResolver r1 = r1.getContentResolver()
            android.provider.Settings.Secure.getString(r1, r11)
        L_0x0098:
            throw r0
        L_0x0099:
            int r1 = r7.length()
            if (r1 != 0) goto L_0x00a2
            r1 = 1
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            if (r1 == 0) goto L_0x00e1
            goto L_0x00cc
        L_0x00a6:
            int r1 = r7.length()
            if (r1 != 0) goto L_0x00af
            r1 = 1
            goto L_0x00b0
        L_0x00af:
            r1 = 0
        L_0x00b0:
            if (r1 == 0) goto L_0x00e1
            goto L_0x00cc
        L_0x00b3:
            int r1 = r7.length()
            if (r1 != 0) goto L_0x00bc
            r1 = 1
            goto L_0x00bd
        L_0x00bc:
            r1 = 0
        L_0x00bd:
            if (r1 == 0) goto L_0x00e1
            goto L_0x00cc
        L_0x00c0:
            int r1 = r7.length()
            if (r1 != 0) goto L_0x00c9
            r1 = 1
            goto L_0x00ca
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            if (r1 == 0) goto L_0x00e1
        L_0x00cc:
            nic.goi.aarogyasetu.CoronaApplication r1 = nic.goi.aarogyasetu.CoronaApplication.f5224g
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r12)
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r7 = android.provider.Settings.Secure.getString(r1, r11)
            goto L_0x00e1
        L_0x00da:
            n.m.c.f.a((java.lang.Object) r13, (java.lang.String) r15)
            java.lang.String r7 = r13.getAddress()
        L_0x00e1:
            if (r7 == 0) goto L_0x00ec
            int r1 = r7.length()
            if (r1 != 0) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            r1 = 0
            goto L_0x00ed
        L_0x00ec:
            r1 = 1
        L_0x00ed:
            if (r1 == 0) goto L_0x00f6
            n.m.c.f.a((java.lang.Object) r13, (java.lang.String) r15)
            java.lang.String r7 = r13.getAddress()
        L_0x00f6:
            com.google.firebase.iid.FirebaseInstanceId r1 = com.google.firebase.iid.FirebaseInstanceId.g()
            com.google.firebase.FirebaseApp r3 = r1.f701b
            com.google.firebase.iid.FirebaseInstanceId.a((com.google.firebase.FirebaseApp) r3)
            i.c.d.k.d0 r3 = r1.a()
            boolean r6 = r1.a((i.c.d.k.d0) r3)
            if (r6 == 0) goto L_0x010c
            r1.e()
        L_0x010c:
            java.lang.String r1 = i.c.d.k.d0.a((i.c.d.k.d0) r3)
            r9.<init>(r10, r7, r1)
            nic.goi.aarogyasetu.CoronaApplication r1 = nic.goi.aarogyasetu.CoronaApplication.f5224g
            java.lang.String r3 = "CoronaApplication.instance"
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r3)
            boolean r1 = r0.d(r1)
            r9.setBlAllowed(r1)
            nic.goi.aarogyasetu.CoronaApplication r1 = nic.goi.aarogyasetu.CoronaApplication.f5224g
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r3)
            boolean r1 = r0.f(r1)
            r9.setLocAllowed(r1)
            boolean r1 = r0.b()
            r9.setBlOn(r1)
            nic.goi.aarogyasetu.CoronaApplication r1 = nic.goi.aarogyasetu.CoronaApplication.f5224g
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r3)
            boolean r1 = r0.e(r1)
            r9.setLocOn(r1)
            java.lang.String r1 = r9.getLat()
            if (r1 == 0) goto L_0x014f
            boolean r1 = n.q.d.b(r1)
            if (r1 == 0) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            r3 = 0
            goto L_0x0150
        L_0x014f:
            r3 = 1
        L_0x0150:
            if (r3 != 0) goto L_0x0155
            java.lang.String r1 = "registerWithLoc"
            goto L_0x0157
        L_0x0155:
            java.lang.String r1 = "registerWithoutLoc"
        L_0x0157:
            r3 = 12
            java.lang.String r6 = "permissionScreen"
            r7 = 0
            b.a.a.l.b.a(r1, r6, r7, r7, r3)
            java.lang.Class<b.a.a.j.c> r1 = b.a.a.j.c.class
            java.lang.Object r1 = r8.a(r1)
            b.a.a.j.c r1 = (b.a.a.j.c) r1
            java.util.Map r0 = r0.a((boolean) r2)
            q.d r0 = r1.a((java.util.Map<java.lang.String, java.lang.String>) r0, (nic.goi.aarogyasetu.models.network.RegisterationData) r9)
            b.a.a.l.s r1 = new b.a.a.l.s
            r1.<init>(r5, r4)
            r0.a(r1)
            return
        L_0x0178:
            java.lang.String r0 = "listener"
            n.m.c.f.a((java.lang.String) r0)
            r0 = 0
            throw r0
        L_0x017f:
            r0 = 0
            java.lang.String r1 = "context"
            n.m.c.f.a((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.l.t.run():void");
    }
}
