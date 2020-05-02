package i.c.a.b.g.g;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public abstract class l9 extends f1 implements ma {
    public l9() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static ma asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof ma) {
            return (ma) queryLocalInterface;
        }
        return new ic(iBinder);
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v5, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v9, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v14, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v18, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v24, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v28, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v32, types: [i.c.a.b.g.g.nc] */
    /* JADX WARNING: type inference failed for: r4v36, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v40, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v44, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v48, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v52, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v57, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v64, types: [i.c.a.b.g.g.mc] */
    /* JADX WARNING: type inference failed for: r4v68, types: [i.c.a.b.g.g.mc] */
    /* JADX WARNING: type inference failed for: r4v72, types: [i.c.a.b.g.g.mc] */
    /* JADX WARNING: type inference failed for: r4v76, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v80, types: [i.c.a.b.g.g.nb] */
    /* JADX WARNING: type inference failed for: r4v84 */
    /* JADX WARNING: type inference failed for: r4v85 */
    /* JADX WARNING: type inference failed for: r4v86 */
    /* JADX WARNING: type inference failed for: r4v87 */
    /* JADX WARNING: type inference failed for: r4v88 */
    /* JADX WARNING: type inference failed for: r4v89 */
    /* JADX WARNING: type inference failed for: r4v90 */
    /* JADX WARNING: type inference failed for: r4v91 */
    /* JADX WARNING: type inference failed for: r4v92 */
    /* JADX WARNING: type inference failed for: r4v93 */
    /* JADX WARNING: type inference failed for: r4v94 */
    /* JADX WARNING: type inference failed for: r4v95 */
    /* JADX WARNING: type inference failed for: r4v96 */
    /* JADX WARNING: type inference failed for: r4v97 */
    /* JADX WARNING: type inference failed for: r4v98 */
    /* JADX WARNING: type inference failed for: r4v99 */
    /* JADX WARNING: type inference failed for: r4v100 */
    /* JADX WARNING: type inference failed for: r4v101 */
    /* JADX WARNING: type inference failed for: r4v102 */
    /* JADX WARNING: type inference failed for: r4v103 */
    /* JADX WARNING: type inference failed for: r4v104 */
    /* JADX WARNING: type inference failed for: r4v105 */
    /* JADX WARNING: type inference failed for: r4v106 */
    /* JADX WARNING: type inference failed for: r4v107 */
    /* JADX WARNING: type inference failed for: r4v108 */
    /* JADX WARNING: type inference failed for: r4v109 */
    /* JADX WARNING: type inference failed for: r4v110 */
    /* JADX WARNING: type inference failed for: r4v111 */
    /* JADX WARNING: type inference failed for: r4v112 */
    /* JADX WARNING: type inference failed for: r4v113 */
    /* JADX WARNING: type inference failed for: r4v114 */
    /* JADX WARNING: type inference failed for: r4v115 */
    /* JADX WARNING: type inference failed for: r4v116 */
    /* JADX WARNING: type inference failed for: r4v117 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r13, android.os.Parcel r14, android.os.Parcel r15, int r16) {
        /*
            r12 = this;
            r8 = r12
            r0 = r14
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy"
            r9 = 1
            r2 = 0
            java.lang.String r3 = "com.google.android.gms.measurement.api.internal.IBundleReceiver"
            r4 = 0
            switch(r13) {
                case 1: goto L_0x03e8;
                case 2: goto L_0x03b8;
                case 3: goto L_0x0385;
                case 4: goto L_0x0367;
                case 5: goto L_0x033e;
                case 6: goto L_0x031d;
                case 7: goto L_0x0310;
                case 8: goto L_0x02ff;
                case 9: goto L_0x02ea;
                case 10: goto L_0x02c5;
                case 11: goto L_0x02b8;
                case 12: goto L_0x02af;
                case 13: goto L_0x02a6;
                case 14: goto L_0x029d;
                case 15: goto L_0x0283;
                case 16: goto L_0x0266;
                case 17: goto L_0x0249;
                case 18: goto L_0x022a;
                case 19: goto L_0x020d;
                case 20: goto L_0x01f0;
                case 21: goto L_0x01d3;
                case 22: goto L_0x01b6;
                case 23: goto L_0x01a9;
                case 24: goto L_0x019c;
                case 25: goto L_0x018b;
                case 26: goto L_0x017a;
                case 27: goto L_0x0161;
                case 28: goto L_0x0150;
                case 29: goto L_0x013f;
                case 30: goto L_0x012e;
                case 31: goto L_0x0105;
                case 32: goto L_0x00dc;
                case 33: goto L_0x00b6;
                case 34: goto L_0x0099;
                case 35: goto L_0x007c;
                case 36: goto L_0x005f;
                case 37: goto L_0x0054;
                case 38: goto L_0x0033;
                case 39: goto L_0x002a;
                case 40: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            return r2
        L_0x000d:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            goto L_0x0025
        L_0x0014:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof i.c.a.b.g.g.nb
            if (r2 == 0) goto L_0x0020
            r4 = r1
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x0025
        L_0x0020:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r0)
        L_0x0025:
            r12.isDataCollectionEnabled(r4)
            goto L_0x03ff
        L_0x002a:
            boolean r0 = i.c.a.b.g.g.q.a(r14)
            r12.setDataCollectionEnabled(r0)
            goto L_0x03ff
        L_0x0033:
            android.os.IBinder r1 = r14.readStrongBinder()
            if (r1 != 0) goto L_0x003a
            goto L_0x004b
        L_0x003a:
            android.os.IInterface r2 = r1.queryLocalInterface(r3)
            boolean r3 = r2 instanceof i.c.a.b.g.g.nb
            if (r3 == 0) goto L_0x0046
            r4 = r2
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x004b
        L_0x0046:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r1)
        L_0x004b:
            int r0 = r14.readInt()
            r12.getTestFlag(r4, r0)
            goto L_0x03ff
        L_0x0054:
            java.lang.ClassLoader r1 = i.c.a.b.g.g.q.a
            java.util.HashMap r0 = r14.readHashMap(r1)
            r12.initForTests(r0)
            goto L_0x03ff
        L_0x005f:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0066
            goto L_0x0077
        L_0x0066:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof i.c.a.b.g.g.mc
            if (r2 == 0) goto L_0x0072
            r4 = r1
            i.c.a.b.g.g.mc r4 = (i.c.a.b.g.g.mc) r4
            goto L_0x0077
        L_0x0072:
            i.c.a.b.g.g.oc r4 = new i.c.a.b.g.g.oc
            r4.<init>(r0)
        L_0x0077:
            r12.unregisterOnMeasurementEventListener(r4)
            goto L_0x03ff
        L_0x007c:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0083
            goto L_0x0094
        L_0x0083:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof i.c.a.b.g.g.mc
            if (r2 == 0) goto L_0x008f
            r4 = r1
            i.c.a.b.g.g.mc r4 = (i.c.a.b.g.g.mc) r4
            goto L_0x0094
        L_0x008f:
            i.c.a.b.g.g.oc r4 = new i.c.a.b.g.g.oc
            r4.<init>(r0)
        L_0x0094:
            r12.registerOnMeasurementEventListener(r4)
            goto L_0x03ff
        L_0x0099:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x00a0
            goto L_0x00b1
        L_0x00a0:
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof i.c.a.b.g.g.mc
            if (r2 == 0) goto L_0x00ac
            r4 = r1
            i.c.a.b.g.g.mc r4 = (i.c.a.b.g.g.mc) r4
            goto L_0x00b1
        L_0x00ac:
            i.c.a.b.g.g.oc r4 = new i.c.a.b.g.g.oc
            r4.<init>(r0)
        L_0x00b1:
            r12.setEventInterceptor(r4)
            goto L_0x03ff
        L_0x00b6:
            int r1 = r14.readInt()
            java.lang.String r2 = r14.readString()
            android.os.IBinder r3 = r14.readStrongBinder()
            i.c.a.b.e.a r3 = i.c.a.b.e.a.C0113a.a(r3)
            android.os.IBinder r4 = r14.readStrongBinder()
            i.c.a.b.e.a r4 = i.c.a.b.e.a.C0113a.a(r4)
            android.os.IBinder r0 = r14.readStrongBinder()
            i.c.a.b.e.a r5 = i.c.a.b.e.a.C0113a.a(r0)
            r0 = r12
            r0.logHealthData(r1, r2, r3, r4, r5)
            goto L_0x03ff
        L_0x00dc:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = i.c.a.b.g.g.q.a((android.os.Parcel) r14, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            android.os.IBinder r2 = r14.readStrongBinder()
            if (r2 != 0) goto L_0x00eb
            goto L_0x00fc
        L_0x00eb:
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof i.c.a.b.g.g.nb
            if (r4 == 0) goto L_0x00f7
            r4 = r3
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x00fc
        L_0x00f7:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r2)
        L_0x00fc:
            long r2 = r14.readLong()
            r12.performAction(r1, r4, r2)
            goto L_0x03ff
        L_0x0105:
            android.os.IBinder r1 = r14.readStrongBinder()
            i.c.a.b.e.a r1 = i.c.a.b.e.a.C0113a.a(r1)
            android.os.IBinder r2 = r14.readStrongBinder()
            if (r2 != 0) goto L_0x0114
            goto L_0x0125
        L_0x0114:
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof i.c.a.b.g.g.nb
            if (r4 == 0) goto L_0x0120
            r4 = r3
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x0125
        L_0x0120:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r2)
        L_0x0125:
            long r2 = r14.readLong()
            r12.onActivitySaveInstanceState(r1, r4, r2)
            goto L_0x03ff
        L_0x012e:
            android.os.IBinder r1 = r14.readStrongBinder()
            i.c.a.b.e.a r1 = i.c.a.b.e.a.C0113a.a(r1)
            long r2 = r14.readLong()
            r12.onActivityResumed(r1, r2)
            goto L_0x03ff
        L_0x013f:
            android.os.IBinder r1 = r14.readStrongBinder()
            i.c.a.b.e.a r1 = i.c.a.b.e.a.C0113a.a(r1)
            long r2 = r14.readLong()
            r12.onActivityPaused(r1, r2)
            goto L_0x03ff
        L_0x0150:
            android.os.IBinder r1 = r14.readStrongBinder()
            i.c.a.b.e.a r1 = i.c.a.b.e.a.C0113a.a(r1)
            long r2 = r14.readLong()
            r12.onActivityDestroyed(r1, r2)
            goto L_0x03ff
        L_0x0161:
            android.os.IBinder r1 = r14.readStrongBinder()
            i.c.a.b.e.a r1 = i.c.a.b.e.a.C0113a.a(r1)
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            android.os.Parcelable r2 = i.c.a.b.g.g.q.a((android.os.Parcel) r14, r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            long r3 = r14.readLong()
            r12.onActivityCreated(r1, r2, r3)
            goto L_0x03ff
        L_0x017a:
            android.os.IBinder r1 = r14.readStrongBinder()
            i.c.a.b.e.a r1 = i.c.a.b.e.a.C0113a.a(r1)
            long r2 = r14.readLong()
            r12.onActivityStopped(r1, r2)
            goto L_0x03ff
        L_0x018b:
            android.os.IBinder r1 = r14.readStrongBinder()
            i.c.a.b.e.a r1 = i.c.a.b.e.a.C0113a.a(r1)
            long r2 = r14.readLong()
            r12.onActivityStarted(r1, r2)
            goto L_0x03ff
        L_0x019c:
            java.lang.String r1 = r14.readString()
            long r2 = r14.readLong()
            r12.endAdUnitExposure(r1, r2)
            goto L_0x03ff
        L_0x01a9:
            java.lang.String r1 = r14.readString()
            long r2 = r14.readLong()
            r12.beginAdUnitExposure(r1, r2)
            goto L_0x03ff
        L_0x01b6:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x01bd
            goto L_0x01ce
        L_0x01bd:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof i.c.a.b.g.g.nb
            if (r2 == 0) goto L_0x01c9
            r4 = r1
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x01ce
        L_0x01c9:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r0)
        L_0x01ce:
            r12.generateEventId(r4)
            goto L_0x03ff
        L_0x01d3:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x01da
            goto L_0x01eb
        L_0x01da:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof i.c.a.b.g.g.nb
            if (r2 == 0) goto L_0x01e6
            r4 = r1
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x01eb
        L_0x01e6:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r0)
        L_0x01eb:
            r12.getGmpAppId(r4)
            goto L_0x03ff
        L_0x01f0:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x01f7
            goto L_0x0208
        L_0x01f7:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof i.c.a.b.g.g.nb
            if (r2 == 0) goto L_0x0203
            r4 = r1
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x0208
        L_0x0203:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r0)
        L_0x0208:
            r12.getAppInstanceId(r4)
            goto L_0x03ff
        L_0x020d:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0214
            goto L_0x0225
        L_0x0214:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof i.c.a.b.g.g.nb
            if (r2 == 0) goto L_0x0220
            r4 = r1
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x0225
        L_0x0220:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r0)
        L_0x0225:
            r12.getCachedAppInstanceId(r4)
            goto L_0x03ff
        L_0x022a:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0231
            goto L_0x0244
        L_0x0231:
            java.lang.String r1 = "com.google.android.gms.measurement.api.internal.IStringProvider"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof i.c.a.b.g.g.nc
            if (r2 == 0) goto L_0x023f
            r4 = r1
            i.c.a.b.g.g.nc r4 = (i.c.a.b.g.g.nc) r4
            goto L_0x0244
        L_0x023f:
            i.c.a.b.g.g.qc r4 = new i.c.a.b.g.g.qc
            r4.<init>(r0)
        L_0x0244:
            r12.setInstanceIdProvider(r4)
            goto L_0x03ff
        L_0x0249:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0250
            goto L_0x0261
        L_0x0250:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof i.c.a.b.g.g.nb
            if (r2 == 0) goto L_0x025c
            r4 = r1
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x0261
        L_0x025c:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r0)
        L_0x0261:
            r12.getCurrentScreenClass(r4)
            goto L_0x03ff
        L_0x0266:
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x026d
            goto L_0x027e
        L_0x026d:
            android.os.IInterface r1 = r0.queryLocalInterface(r3)
            boolean r2 = r1 instanceof i.c.a.b.g.g.nb
            if (r2 == 0) goto L_0x0279
            r4 = r1
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x027e
        L_0x0279:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r0)
        L_0x027e:
            r12.getCurrentScreenName(r4)
            goto L_0x03ff
        L_0x0283:
            android.os.IBinder r1 = r14.readStrongBinder()
            i.c.a.b.e.a r1 = i.c.a.b.e.a.C0113a.a(r1)
            java.lang.String r2 = r14.readString()
            java.lang.String r3 = r14.readString()
            long r4 = r14.readLong()
            r0 = r12
            r0.setCurrentScreen(r1, r2, r3, r4)
            goto L_0x03ff
        L_0x029d:
            long r0 = r14.readLong()
            r12.setSessionTimeoutDuration(r0)
            goto L_0x03ff
        L_0x02a6:
            long r0 = r14.readLong()
            r12.setMinimumSessionDuration(r0)
            goto L_0x03ff
        L_0x02af:
            long r0 = r14.readLong()
            r12.resetAnalyticsData(r0)
            goto L_0x03ff
        L_0x02b8:
            boolean r1 = i.c.a.b.g.g.q.a(r14)
            long r2 = r14.readLong()
            r12.setMeasurementEnabled(r1, r2)
            goto L_0x03ff
        L_0x02c5:
            java.lang.String r1 = r14.readString()
            java.lang.String r2 = r14.readString()
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x02d4
            goto L_0x02e5
        L_0x02d4:
            android.os.IInterface r3 = r0.queryLocalInterface(r3)
            boolean r4 = r3 instanceof i.c.a.b.g.g.nb
            if (r4 == 0) goto L_0x02e0
            r4 = r3
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x02e5
        L_0x02e0:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r0)
        L_0x02e5:
            r12.getConditionalUserProperties(r1, r2, r4)
            goto L_0x03ff
        L_0x02ea:
            java.lang.String r1 = r14.readString()
            java.lang.String r2 = r14.readString()
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = i.c.a.b.g.g.q.a((android.os.Parcel) r14, r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r12.clearConditionalUserProperty(r1, r2, r0)
            goto L_0x03ff
        L_0x02ff:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = i.c.a.b.g.g.q.a((android.os.Parcel) r14, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r14.readLong()
            r12.setConditionalUserProperty(r1, r2)
            goto L_0x03ff
        L_0x0310:
            java.lang.String r1 = r14.readString()
            long r2 = r14.readLong()
            r12.setUserId(r1, r2)
            goto L_0x03ff
        L_0x031d:
            java.lang.String r1 = r14.readString()
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0328
            goto L_0x0339
        L_0x0328:
            android.os.IInterface r2 = r0.queryLocalInterface(r3)
            boolean r3 = r2 instanceof i.c.a.b.g.g.nb
            if (r3 == 0) goto L_0x0334
            r4 = r2
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x0339
        L_0x0334:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r0)
        L_0x0339:
            r12.getMaxUserProperties(r1, r4)
            goto L_0x03ff
        L_0x033e:
            java.lang.String r1 = r14.readString()
            java.lang.String r2 = r14.readString()
            boolean r5 = i.c.a.b.g.g.q.a(r14)
            android.os.IBinder r0 = r14.readStrongBinder()
            if (r0 != 0) goto L_0x0351
            goto L_0x0362
        L_0x0351:
            android.os.IInterface r3 = r0.queryLocalInterface(r3)
            boolean r4 = r3 instanceof i.c.a.b.g.g.nb
            if (r4 == 0) goto L_0x035d
            r4 = r3
            i.c.a.b.g.g.nb r4 = (i.c.a.b.g.g.nb) r4
            goto L_0x0362
        L_0x035d:
            i.c.a.b.g.g.jc r4 = new i.c.a.b.g.g.jc
            r4.<init>(r0)
        L_0x0362:
            r12.getUserProperties(r1, r2, r5, r4)
            goto L_0x03ff
        L_0x0367:
            java.lang.String r1 = r14.readString()
            java.lang.String r2 = r14.readString()
            android.os.IBinder r3 = r14.readStrongBinder()
            i.c.a.b.e.a r3 = i.c.a.b.e.a.C0113a.a(r3)
            boolean r4 = i.c.a.b.g.g.q.a(r14)
            long r5 = r14.readLong()
            r0 = r12
            r0.setUserProperty(r1, r2, r3, r4, r5)
            goto L_0x03ff
        L_0x0385:
            java.lang.String r1 = r14.readString()
            java.lang.String r2 = r14.readString()
            android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
            android.os.Parcelable r5 = i.c.a.b.g.g.q.a((android.os.Parcel) r14, r5)
            android.os.Bundle r5 = (android.os.Bundle) r5
            android.os.IBinder r6 = r14.readStrongBinder()
            if (r6 != 0) goto L_0x039c
            goto L_0x03ad
        L_0x039c:
            android.os.IInterface r3 = r6.queryLocalInterface(r3)
            boolean r4 = r3 instanceof i.c.a.b.g.g.nb
            if (r4 == 0) goto L_0x03a7
            i.c.a.b.g.g.nb r3 = (i.c.a.b.g.g.nb) r3
            goto L_0x03ac
        L_0x03a7:
            i.c.a.b.g.g.jc r3 = new i.c.a.b.g.g.jc
            r3.<init>(r6)
        L_0x03ac:
            r4 = r3
        L_0x03ad:
            long r6 = r14.readLong()
            r0 = r12
            r3 = r5
            r5 = r6
            r0.logEventAndBundle(r1, r2, r3, r4, r5)
            goto L_0x03ff
        L_0x03b8:
            java.lang.String r1 = r14.readString()
            java.lang.String r3 = r14.readString()
            android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
            android.os.Parcelable r4 = i.c.a.b.g.g.q.a((android.os.Parcel) r14, r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            int r5 = r14.readInt()
            if (r5 == 0) goto L_0x03d0
            r5 = 1
            goto L_0x03d1
        L_0x03d0:
            r5 = 0
        L_0x03d1:
            int r6 = r14.readInt()
            if (r6 == 0) goto L_0x03d9
            r6 = 1
            goto L_0x03da
        L_0x03d9:
            r6 = 0
        L_0x03da:
            long r10 = r14.readLong()
            r0 = r12
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r10
            r0.logEvent(r1, r2, r3, r4, r5, r6)
            goto L_0x03ff
        L_0x03e8:
            android.os.IBinder r1 = r14.readStrongBinder()
            i.c.a.b.e.a r1 = i.c.a.b.e.a.C0113a.a(r1)
            android.os.Parcelable$Creator<i.c.a.b.g.g.pc> r2 = i.c.a.b.g.g.pc.CREATOR
            android.os.Parcelable r2 = i.c.a.b.g.g.q.a((android.os.Parcel) r14, r2)
            i.c.a.b.g.g.pc r2 = (i.c.a.b.g.g.pc) r2
            long r3 = r14.readLong()
            r12.initialize(r1, r2, r3)
        L_0x03ff:
            r15.writeNoException()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.g.l9.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
