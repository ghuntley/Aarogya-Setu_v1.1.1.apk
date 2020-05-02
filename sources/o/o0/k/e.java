package o.o0.k;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import o.d0;

/* compiled from: Jdk9Platform */
public final class e extends f {
    public final Method c;
    public final Method d;

    public e(Method method, Method method2) {
        this.c = method;
        this.d = method2;
    }

    public void a(SSLSocket sSLSocket, String str, List<d0> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> a = f.a(list);
            Method method = this.c;
            Object[] objArr = new Object[1];
            ArrayList arrayList = (ArrayList) a;
            objArr[0] = arrayList.toArray(new String[arrayList.size()]);
            method.invoke(sSLParameters, objArr);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        }
    }

    @Nullable
    public String b(SSLSocket sSLSocket) {
        try {
            String str = (String) this.d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }

    public static e b() {
        try {
            return new e(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
