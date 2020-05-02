package i.c.a.b.g.g;

import android.os.Bundle;
import android.os.IInterface;
import i.c.a.b.e.a;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public interface ma extends IInterface {
    void beginAdUnitExposure(String str, long j2);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j2);

    void generateEventId(nb nbVar);

    void getAppInstanceId(nb nbVar);

    void getCachedAppInstanceId(nb nbVar);

    void getConditionalUserProperties(String str, String str2, nb nbVar);

    void getCurrentScreenClass(nb nbVar);

    void getCurrentScreenName(nb nbVar);

    void getGmpAppId(nb nbVar);

    void getMaxUserProperties(String str, nb nbVar);

    void getTestFlag(nb nbVar, int i2);

    void getUserProperties(String str, String str2, boolean z, nb nbVar);

    void initForTests(Map map);

    void initialize(a aVar, pc pcVar, long j2);

    void isDataCollectionEnabled(nb nbVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2);

    void logEventAndBundle(String str, String str2, Bundle bundle, nb nbVar, long j2);

    void logHealthData(int i2, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j2);

    void onActivityDestroyed(a aVar, long j2);

    void onActivityPaused(a aVar, long j2);

    void onActivityResumed(a aVar, long j2);

    void onActivitySaveInstanceState(a aVar, nb nbVar, long j2);

    void onActivityStarted(a aVar, long j2);

    void onActivityStopped(a aVar, long j2);

    void performAction(Bundle bundle, nb nbVar, long j2);

    void registerOnMeasurementEventListener(mc mcVar);

    void resetAnalyticsData(long j2);

    void setConditionalUserProperty(Bundle bundle, long j2);

    void setCurrentScreen(a aVar, String str, String str2, long j2);

    void setDataCollectionEnabled(boolean z);

    void setEventInterceptor(mc mcVar);

    void setInstanceIdProvider(nc ncVar);

    void setMeasurementEnabled(boolean z, long j2);

    void setMinimumSessionDuration(long j2);

    void setSessionTimeoutDuration(long j2);

    void setUserId(String str, long j2);

    void setUserProperty(String str, String str2, a aVar, boolean z, long j2);

    void unregisterOnMeasurementEventListener(mc mcVar);
}
