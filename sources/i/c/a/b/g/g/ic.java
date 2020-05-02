package i.c.a.b.g.g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.e.a;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class ic extends a implements ma {
    public ic(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j2) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeLong(j2);
        b(23, g2);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        q.a(g2, (Parcelable) bundle);
        b(9, g2);
    }

    public final void endAdUnitExposure(String str, long j2) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeLong(j2);
        b(24, g2);
    }

    public final void generateEventId(nb nbVar) {
        Parcel g2 = g();
        q.a(g2, (IInterface) nbVar);
        b(22, g2);
    }

    public final void getAppInstanceId(nb nbVar) {
        Parcel g2 = g();
        q.a(g2, (IInterface) nbVar);
        b(20, g2);
    }

    public final void getCachedAppInstanceId(nb nbVar) {
        Parcel g2 = g();
        q.a(g2, (IInterface) nbVar);
        b(19, g2);
    }

    public final void getConditionalUserProperties(String str, String str2, nb nbVar) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        q.a(g2, (IInterface) nbVar);
        b(10, g2);
    }

    public final void getCurrentScreenClass(nb nbVar) {
        Parcel g2 = g();
        q.a(g2, (IInterface) nbVar);
        b(17, g2);
    }

    public final void getCurrentScreenName(nb nbVar) {
        Parcel g2 = g();
        q.a(g2, (IInterface) nbVar);
        b(16, g2);
    }

    public final void getGmpAppId(nb nbVar) {
        Parcel g2 = g();
        q.a(g2, (IInterface) nbVar);
        b(21, g2);
    }

    public final void getMaxUserProperties(String str, nb nbVar) {
        Parcel g2 = g();
        g2.writeString(str);
        q.a(g2, (IInterface) nbVar);
        b(6, g2);
    }

    public final void getTestFlag(nb nbVar, int i2) {
        Parcel g2 = g();
        q.a(g2, (IInterface) nbVar);
        g2.writeInt(i2);
        b(38, g2);
    }

    public final void getUserProperties(String str, String str2, boolean z, nb nbVar) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        q.a(g2, z);
        q.a(g2, (IInterface) nbVar);
        b(5, g2);
    }

    public final void initForTests(Map map) {
        Parcel g2 = g();
        g2.writeMap(map);
        b(37, g2);
    }

    public final void initialize(a aVar, pc pcVar, long j2) {
        Parcel g2 = g();
        q.a(g2, (IInterface) aVar);
        q.a(g2, (Parcelable) pcVar);
        g2.writeLong(j2);
        b(1, g2);
    }

    public final void isDataCollectionEnabled(nb nbVar) {
        Parcel g2 = g();
        q.a(g2, (IInterface) nbVar);
        b(40, g2);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        q.a(g2, (Parcelable) bundle);
        g2.writeInt(z ? 1 : 0);
        g2.writeInt(z2 ? 1 : 0);
        g2.writeLong(j2);
        b(2, g2);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, nb nbVar, long j2) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        q.a(g2, (Parcelable) bundle);
        q.a(g2, (IInterface) nbVar);
        g2.writeLong(j2);
        b(3, g2);
    }

    public final void logHealthData(int i2, String str, a aVar, a aVar2, a aVar3) {
        Parcel g2 = g();
        g2.writeInt(i2);
        g2.writeString(str);
        q.a(g2, (IInterface) aVar);
        q.a(g2, (IInterface) aVar2);
        q.a(g2, (IInterface) aVar3);
        b(33, g2);
    }

    public final void onActivityCreated(a aVar, Bundle bundle, long j2) {
        Parcel g2 = g();
        q.a(g2, (IInterface) aVar);
        q.a(g2, (Parcelable) bundle);
        g2.writeLong(j2);
        b(27, g2);
    }

    public final void onActivityDestroyed(a aVar, long j2) {
        Parcel g2 = g();
        q.a(g2, (IInterface) aVar);
        g2.writeLong(j2);
        b(28, g2);
    }

    public final void onActivityPaused(a aVar, long j2) {
        Parcel g2 = g();
        q.a(g2, (IInterface) aVar);
        g2.writeLong(j2);
        b(29, g2);
    }

    public final void onActivityResumed(a aVar, long j2) {
        Parcel g2 = g();
        q.a(g2, (IInterface) aVar);
        g2.writeLong(j2);
        b(30, g2);
    }

    public final void onActivitySaveInstanceState(a aVar, nb nbVar, long j2) {
        Parcel g2 = g();
        q.a(g2, (IInterface) aVar);
        q.a(g2, (IInterface) nbVar);
        g2.writeLong(j2);
        b(31, g2);
    }

    public final void onActivityStarted(a aVar, long j2) {
        Parcel g2 = g();
        q.a(g2, (IInterface) aVar);
        g2.writeLong(j2);
        b(25, g2);
    }

    public final void onActivityStopped(a aVar, long j2) {
        Parcel g2 = g();
        q.a(g2, (IInterface) aVar);
        g2.writeLong(j2);
        b(26, g2);
    }

    public final void performAction(Bundle bundle, nb nbVar, long j2) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) bundle);
        q.a(g2, (IInterface) nbVar);
        g2.writeLong(j2);
        b(32, g2);
    }

    public final void registerOnMeasurementEventListener(mc mcVar) {
        Parcel g2 = g();
        q.a(g2, (IInterface) mcVar);
        b(35, g2);
    }

    public final void resetAnalyticsData(long j2) {
        Parcel g2 = g();
        g2.writeLong(j2);
        b(12, g2);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j2) {
        Parcel g2 = g();
        q.a(g2, (Parcelable) bundle);
        g2.writeLong(j2);
        b(8, g2);
    }

    public final void setCurrentScreen(a aVar, String str, String str2, long j2) {
        Parcel g2 = g();
        q.a(g2, (IInterface) aVar);
        g2.writeString(str);
        g2.writeString(str2);
        g2.writeLong(j2);
        b(15, g2);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel g2 = g();
        q.a(g2, z);
        b(39, g2);
    }

    public final void setEventInterceptor(mc mcVar) {
        Parcel g2 = g();
        q.a(g2, (IInterface) mcVar);
        b(34, g2);
    }

    public final void setInstanceIdProvider(nc ncVar) {
        Parcel g2 = g();
        q.a(g2, (IInterface) ncVar);
        b(18, g2);
    }

    public final void setMeasurementEnabled(boolean z, long j2) {
        Parcel g2 = g();
        q.a(g2, z);
        g2.writeLong(j2);
        b(11, g2);
    }

    public final void setMinimumSessionDuration(long j2) {
        Parcel g2 = g();
        g2.writeLong(j2);
        b(13, g2);
    }

    public final void setSessionTimeoutDuration(long j2) {
        Parcel g2 = g();
        g2.writeLong(j2);
        b(14, g2);
    }

    public final void setUserId(String str, long j2) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeLong(j2);
        b(7, g2);
    }

    public final void setUserProperty(String str, String str2, a aVar, boolean z, long j2) {
        Parcel g2 = g();
        g2.writeString(str);
        g2.writeString(str2);
        q.a(g2, (IInterface) aVar);
        g2.writeInt(z ? 1 : 0);
        g2.writeLong(j2);
        b(4, g2);
    }

    public final void unregisterOnMeasurementEventListener(mc mcVar) {
        Parcel g2 = g();
        q.a(g2, (IInterface) mcVar);
        b(36, g2);
    }
}
