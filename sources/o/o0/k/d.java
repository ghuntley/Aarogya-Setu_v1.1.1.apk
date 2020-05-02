package o.o0.k;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import o.d0;
import o.o0.e;

/* compiled from: Jdk8WithJettyBootPlatform */
public class d extends f {
    public final Method c;
    public final Method d;
    public final Method e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f5599f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f5600g;

    /* compiled from: Jdk8WithJettyBootPlatform */
    public static class a implements InvocationHandler {
        public final List<String> a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5601b;
        public String c;

        public a(List<String> list) {
            this.a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = e.f5380b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f5601b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = (String) list.get(i2);
                        if (this.a.contains(str)) {
                            this.c = str;
                            return str;
                        }
                    }
                    String str2 = this.a.get(0);
                    this.c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    public d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f5599f = cls;
        this.f5600g = cls2;
    }

    public void a(SSLSocket sSLSocket, String str, List<d0> list) {
        List<String> a2 = f.a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f5599f, this.f5600g}, new a(a2));
            this.c.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Nullable
    public String b(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.d.invoke((Object) null, new Object[]{sSLSocket}));
            if (!aVar.f5601b && aVar.c == null) {
                f.a.a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (aVar.f5601b) {
                return null;
            } else {
                return aVar.c;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    public void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    public static f b() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, (ClassLoader) null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, (ClassLoader) null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, (ClassLoader) null);
            Class[] clsArr = {SSLSocket.class};
            return new d(cls.getMethod("put", new Class[]{SSLSocket.class, cls2}), cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", clsArr), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }
}
