package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.Keep;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;
import i.c.a.b.i.a.r6;
import i.c.a.b.i.a.s5;
import i.c.a.b.i.a.s7;
import i.c.a.b.i.a.t6;
import i.c.a.b.i.a.w7;
import i.c.a.b.i.a.y7;
import i.c.a.b.i.a.z;
import i.c.a.b.i.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public class AppMeasurement {
    public static volatile AppMeasurement d;
    public final s5 a;

    /* renamed from: b  reason: collision with root package name */
    public final s7 f521b;
    public final boolean c;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public static /* synthetic */ Bundle a(ConditionalUserProperty conditionalUserProperty) {
            if (conditionalUserProperty != null) {
                Bundle bundle = new Bundle();
                String str = conditionalUserProperty.mAppId;
                if (str != null) {
                    bundle.putString("app_id", str);
                }
                String str2 = conditionalUserProperty.mOrigin;
                if (str2 != null) {
                    bundle.putString("origin", str2);
                }
                String str3 = conditionalUserProperty.mName;
                if (str3 != null) {
                    bundle.putString(DefaultAppMeasurementEventListenerRegistrar.NAME, str3);
                }
                Object obj = conditionalUserProperty.mValue;
                if (obj != null) {
                    q.a(bundle, obj);
                }
                String str4 = conditionalUserProperty.mTriggerEventName;
                if (str4 != null) {
                    bundle.putString("trigger_event_name", str4);
                }
                bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
                String str5 = conditionalUserProperty.mTimedOutEventName;
                if (str5 != null) {
                    bundle.putString("timed_out_event_name", str5);
                }
                Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
                if (bundle2 != null) {
                    bundle.putBundle("timed_out_event_params", bundle2);
                }
                String str6 = conditionalUserProperty.mTriggeredEventName;
                if (str6 != null) {
                    bundle.putString("triggered_event_name", str6);
                }
                Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
                if (bundle3 != null) {
                    bundle.putBundle("triggered_event_params", bundle3);
                }
                bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
                String str7 = conditionalUserProperty.mExpiredEventName;
                if (str7 != null) {
                    bundle.putString("expired_event_name", str7);
                }
                Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
                if (bundle4 != null) {
                    bundle.putBundle("expired_event_params", bundle4);
                }
                bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
                bundle.putBoolean("active", conditionalUserProperty.mActive);
                bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
                return bundle;
            }
            throw null;
        }

        public /* synthetic */ ConditionalUserProperty(Bundle bundle, b bVar) {
            Class cls = Long.class;
            Class cls2 = String.class;
            q.a(bundle);
            this.mAppId = (String) q.a(bundle, "app_id", cls2, null);
            this.mOrigin = (String) q.a(bundle, "origin", cls2, null);
            this.mName = (String) q.a(bundle, DefaultAppMeasurementEventListenerRegistrar.NAME, cls2, null);
            this.mValue = q.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) q.a(bundle, "trigger_event_name", cls2, null);
            this.mTriggerTimeout = ((Long) q.a(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) q.a(bundle, "timed_out_event_name", cls2, null);
            this.mTimedOutEventParams = (Bundle) q.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) q.a(bundle, "triggered_event_name", cls2, null);
            this.mTriggeredEventParams = (Bundle) q.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) q.a(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) q.a(bundle, "expired_event_name", cls2, null);
            this.mExpiredEventParams = (Bundle) q.a(bundle, "expired_event_params", Bundle.class, null);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
    public interface OnEventListener extends r6 {
        void onEvent(String str, String str2, Bundle bundle, long j2);
    }

    public AppMeasurement(s5 s5Var) {
        q.a(s5Var);
        this.a = s5Var;
        this.f521b = null;
        this.c = false;
    }

    public static AppMeasurement a(Context context) {
        if (d == null) {
            synchronized (AppMeasurement.class) {
                if (d == null) {
                    s7 b2 = b(context, (Bundle) null);
                    if (b2 != null) {
                        d = new AppMeasurement(b2);
                    } else {
                        d = new AppMeasurement(s5.a(context, (Bundle) null));
                    }
                }
            }
        }
        return d;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i.c.a.b.i.a.s7 b(android.content.Context r8, android.os.Bundle r9) {
        /*
            r0 = 0
            java.lang.String r1 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0027 }
            java.lang.String r2 = "getScionFrontendApiImplementation"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch:{  }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{  }
            r2[r6] = r8     // Catch:{  }
            r2[r7] = r9     // Catch:{  }
            java.lang.Object r8 = r1.invoke(r0, r2)     // Catch:{  }
            i.c.a.b.i.a.s7 r8 = (i.c.a.b.i.a.s7) r8     // Catch:{  }
            return r8
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.b(android.content.Context, android.os.Bundle):i.c.a.b.i.a.s7");
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return a(context);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.c) {
            this.f521b.a(str);
            return;
        }
        z w = this.a.w();
        if (((c) this.a.f3868n) != null) {
            w.a(str, SystemClock.elapsedRealtime());
            return;
        }
        throw null;
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.c) {
            this.f521b.a(str, str2, bundle);
            return;
        }
        t6 o2 = this.a.o();
        o2.a();
        o2.a((String) null, str, str2, bundle);
    }

    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (!this.c) {
            t6 o2 = this.a.o();
            if (o2 != null) {
                q.b(str);
                o2.m();
                throw null;
            }
            throw null;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.c) {
            this.f521b.c(str);
            return;
        }
        z w = this.a.w();
        if (((c) this.a.f3868n) != null) {
            w.b(str, SystemClock.elapsedRealtime());
            return;
        }
        throw null;
    }

    @Keep
    public long generateEventId() {
        if (this.c) {
            return this.f521b.e();
        }
        return this.a.p().t();
    }

    @Keep
    public String getAppInstanceId() {
        if (this.c) {
            return this.f521b.c();
        }
        t6 o2 = this.a.o();
        o2.a();
        return o2.f3881g.get();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> list;
        int i2;
        if (this.c) {
            list = this.f521b.a(str, str2);
        } else {
            t6 o2 = this.a.o();
            o2.a();
            list = o2.a((String) null, str, str2);
        }
        if (list == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        ArrayList arrayList = new ArrayList(i2);
        for (Bundle conditionalUserProperty : list) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty, (b) null));
        }
        return arrayList;
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (!this.c) {
            t6 o2 = this.a.o();
            if (o2 != null) {
                q.b(str);
                o2.m();
                throw null;
            }
            throw null;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Keep
    public String getCurrentScreenClass() {
        if (this.c) {
            return this.f521b.b();
        }
        y7 s = this.a.o().a.s();
        s.a();
        w7 w7Var = s.d;
        if (w7Var != null) {
            return w7Var.f3927b;
        }
        return null;
    }

    @Keep
    public String getCurrentScreenName() {
        if (this.c) {
            return this.f521b.a();
        }
        y7 s = this.a.o().a.s();
        s.a();
        w7 w7Var = s.d;
        if (w7Var != null) {
            return w7Var.a;
        }
        return null;
    }

    @Keep
    public String getGmpAppId() {
        if (this.c) {
            return this.f521b.d();
        }
        return this.a.o().B();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.c) {
            return this.f521b.b(str);
        }
        this.a.o();
        q.b(str);
        return 25;
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        if (this.c) {
            return this.f521b.a(str, str2, z);
        }
        t6 o2 = this.a.o();
        o2.a();
        return o2.a((String) null, str, str2, z);
    }

    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (!this.c) {
            t6 o2 = this.a.o();
            if (o2 != null) {
                q.b(str);
                o2.m();
                throw null;
            }
            throw null;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.c) {
            this.f521b.b(str, str2, bundle);
        } else {
            this.a.o().a(str, str2, bundle);
        }
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        if (this.c) {
            this.f521b.a((r6) onEventListener);
        } else {
            this.a.o().a((r6) onEventListener);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        q.a(conditionalUserProperty);
        if (this.c) {
            this.f521b.a(ConditionalUserProperty.a(conditionalUserProperty));
            return;
        }
        t6 o2 = this.a.o();
        Bundle a2 = ConditionalUserProperty.a(conditionalUserProperty);
        if (((c) o2.a.f3868n) != null) {
            o2.a(a2, System.currentTimeMillis());
            return;
        }
        throw null;
    }

    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        q.a(conditionalUserProperty);
        if (!this.c) {
            t6 o2 = this.a.o();
            Bundle a2 = ConditionalUserProperty.a(conditionalUserProperty);
            if (o2 != null) {
                q.a(a2);
                q.b(a2.getString("app_id"));
                o2.m();
                throw null;
            }
            throw null;
        }
        throw new IllegalStateException("Unexpected call on client side");
    }

    public AppMeasurement(s7 s7Var) {
        q.a(s7Var);
        this.f521b = s7Var;
        this.a = null;
        this.c = true;
    }

    public static AppMeasurement a(Context context, Bundle bundle) {
        if (d == null) {
            synchronized (AppMeasurement.class) {
                if (d == null) {
                    s7 b2 = b(context, bundle);
                    if (b2 != null) {
                        d = new AppMeasurement(b2);
                    } else {
                        d = new AppMeasurement(s5.a(context, bundle));
                    }
                }
            }
        }
        return d;
    }
}
