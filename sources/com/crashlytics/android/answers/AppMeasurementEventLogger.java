package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

public class AppMeasurementEventLogger implements EventLogger {
    public static final String ANALYTIC_CLASS = "com.google.android.gms.measurement.AppMeasurement";
    public static final String GET_INSTANCE_METHOD = "getInstance";
    public static final String LOG_METHOD = "logEventInternal";
    public final Object logEventInstance;
    public final Method logEventMethod;

    public AppMeasurementEventLogger(Object obj, Method method) {
        this.logEventInstance = obj;
        this.logEventMethod = method;
    }

    public static Class getClass(Context context) {
        try {
            return context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
        } catch (Exception unused) {
            return null;
        }
    }

    public static EventLogger getEventLogger(Context context) {
        Object instance;
        Method logEventMethod2;
        Class cls = getClass(context);
        if (cls == null || (instance = getInstance(context, cls)) == null || (logEventMethod2 = getLogEventMethod(context, cls)) == null) {
            return null;
        }
        return new AppMeasurementEventLogger(instance, logEventMethod2);
    }

    public static Object getInstance(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        } catch (Exception unused) {
            return null;
        }
    }

    public static Method getLogEventMethod(Context context, Class cls) {
        Class<String> cls2 = String.class;
        try {
            return cls.getDeclaredMethod(LOG_METHOD, new Class[]{cls2, cls2, Bundle.class});
        } catch (Exception unused) {
            return null;
        }
    }

    public void logEvent(String str, Bundle bundle) {
        logEvent("fab", str, bundle);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        try {
            this.logEventMethod.invoke(this.logEventInstance, new Object[]{str, str2, bundle});
        } catch (Exception unused) {
        }
    }
}
