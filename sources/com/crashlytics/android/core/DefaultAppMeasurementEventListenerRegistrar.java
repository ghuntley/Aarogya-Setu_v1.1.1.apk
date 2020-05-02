package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import i.a.a.a.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.a.a.a.c;
import l.a.a.a.f;
import org.json.JSONException;
import org.json.JSONObject;

public class DefaultAppMeasurementEventListenerRegistrar implements AppMeasurementEventListenerRegistrar {
    public static final String ANALYTIC_CLASS = "com.google.android.gms.measurement.AppMeasurement";
    public static final String ANALYTIC_CLASS_ON_EVENT_LISTENER = "com.google.android.gms.measurement.AppMeasurement$OnEventListener";
    public static final String CRASH_ORIGIN = "crash";
    public static final String ERROR_PREFIX = "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: ";
    public static final String GET_INSTANCE_METHOD = "getInstance";
    public static final String METHOD_EQUALS = "equals";
    public static final String METHOD_HASHCODE = "hashCode";
    public static final String METHOD_ONEVENT = "onEvent";
    public static final String METHOD_TOSTRING = "toString";
    public static final String NAME = "name";
    public static final List<Class<?>> ONEVENT_EXPECTED_ARGTYPES;
    public static final String PARAMETERS = "parameters";
    public static final String REGISTER_METHOD = "registerOnMeasurementEventListener";
    public final CrashlyticsCore crashlyticsCore;
    public Object eventListenerProxy;

    static {
        Class<String> cls = String.class;
        ONEVENT_EXPECTED_ARGTYPES = Collections.unmodifiableList(Arrays.asList(new Class[]{cls, cls, Bundle.class, Long.class}));
    }

    public DefaultAppMeasurementEventListenerRegistrar(CrashlyticsCore crashlyticsCore2) {
        this.crashlyticsCore = crashlyticsCore2;
    }

    private Class<?> getClass(String str) {
        try {
            return this.crashlyticsCore.getContext().getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private Object getInstance(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{this.crashlyticsCore.getContext()});
        } catch (Exception unused) {
            return null;
        }
    }

    public static String serializeEvent(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(NAME, str);
        jSONObject.put(PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }

    public static boolean validateOnEventArgTypes(Object[] objArr) {
        if (objArr.length != ONEVENT_EXPECTED_ARGTYPES.size()) {
            return false;
        }
        Iterator<Class<?>> it = ONEVENT_EXPECTED_ARGTYPES.iterator();
        for (Object obj : objArr) {
            if (!obj.getClass().equals(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static void writeEventToUserLog(CrashlyticsCore crashlyticsCore2, String str, Bundle bundle) {
        try {
            crashlyticsCore2.log("$A$:" + serializeEvent(str, bundle));
        } catch (JSONException unused) {
            c a = f.a();
            String b2 = a.b("Unable to serialize Firebase Analytics event; ", str);
            if (a.a(CrashlyticsCore.TAG, 5)) {
                Log.w(CrashlyticsCore.TAG, b2, (Throwable) null);
            }
        }
    }

    public synchronized Object getOnEventListenerProxy(Class cls) {
        if (this.eventListenerProxy == null) {
            this.eventListenerProxy = Proxy.newProxyInstance(this.crashlyticsCore.getContext().getClassLoader(), new Class[]{cls}, new InvocationHandler() {
                public boolean equalsImpl(Object obj, Object obj2) {
                    if (obj == obj2) {
                        return true;
                    }
                    if (obj2 == null || !Proxy.isProxyClass(obj2.getClass()) || !super.equals(Proxy.getInvocationHandler(obj2))) {
                        return false;
                    }
                    return true;
                }

                public Object invoke(Object obj, Method method, Object[] objArr) {
                    String name = method.getName();
                    if (objArr == null) {
                        objArr = new Object[0];
                    }
                    if (objArr.length == 1 && name.equals(DefaultAppMeasurementEventListenerRegistrar.METHOD_EQUALS)) {
                        return Boolean.valueOf(equalsImpl(obj, objArr[0]));
                    }
                    if (objArr.length == 0 && name.equals(DefaultAppMeasurementEventListenerRegistrar.METHOD_HASHCODE)) {
                        return Integer.valueOf(super.hashCode());
                    }
                    if (objArr.length == 0 && name.equals(DefaultAppMeasurementEventListenerRegistrar.METHOD_TOSTRING)) {
                        return super.toString();
                    }
                    if (objArr.length == 4 && name.equals(DefaultAppMeasurementEventListenerRegistrar.METHOD_ONEVENT) && DefaultAppMeasurementEventListenerRegistrar.validateOnEventArgTypes(objArr)) {
                        String str = (String) objArr[0];
                        String str2 = (String) objArr[1];
                        Bundle bundle = (Bundle) objArr[2];
                        if (str != null && !str.equals("crash")) {
                            DefaultAppMeasurementEventListenerRegistrar.writeEventToUserLog(DefaultAppMeasurementEventListenerRegistrar.this.crashlyticsCore, str2, bundle);
                            return null;
                        }
                    }
                    StringBuilder sb = new StringBuilder(a.a("Unexpected method invoked on AppMeasurement.EventListener: ", name, "("));
                    for (int i2 = 0; i2 < objArr.length; i2++) {
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(objArr[i2].getClass().getName());
                    }
                    sb.append("); returning null");
                    c a = f.a();
                    String sb2 = sb.toString();
                    if (a.a(CrashlyticsCore.TAG, 6)) {
                        Log.e(CrashlyticsCore.TAG, sb2, (Throwable) null);
                    }
                    return null;
                }
            });
        }
        return this.eventListenerProxy;
    }

    public boolean register() {
        Class<?> cls = getClass("com.google.android.gms.measurement.AppMeasurement");
        if (cls == null) {
            if (f.a().a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.", (Throwable) null);
            }
            return false;
        }
        Object instance = getInstance(cls);
        if (instance == null) {
            if (f.a().a(CrashlyticsCore.TAG, 5)) {
                Log.w(CrashlyticsCore.TAG, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not create an instance of Firebase Analytics.", (Throwable) null);
            }
            return false;
        }
        Class<?> cls2 = getClass(ANALYTIC_CLASS_ON_EVENT_LISTENER);
        if (cls2 == null) {
            if (f.a().a(CrashlyticsCore.TAG, 5)) {
                Log.w(CrashlyticsCore.TAG, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener", (Throwable) null);
            }
            return false;
        }
        try {
            cls.getDeclaredMethod(REGISTER_METHOD, new Class[]{cls2}).invoke(instance, new Object[]{getOnEventListenerProxy(cls2)});
        } catch (NoSuchMethodException e) {
            if (f.a().a(CrashlyticsCore.TAG, 5)) {
                Log.w(CrashlyticsCore.TAG, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Method registerOnMeasurementEventListener not found.", e);
            }
            return false;
        } catch (Exception e2) {
            c a = f.a();
            StringBuilder a2 = a.a(ERROR_PREFIX);
            a2.append(e2.getMessage());
            String sb = a2.toString();
            if (a.a(CrashlyticsCore.TAG, 5)) {
                Log.w(CrashlyticsCore.TAG, sb, e2);
            }
        }
        return true;
    }
}
