package o.o0.k;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import o.d0;
import o.o0.m.e;

/* compiled from: AndroidPlatform */
public class b extends f {
    public final Class<?> c;
    public final Method d;
    public final Method e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f5593f;

    /* renamed from: g  reason: collision with root package name */
    public final Method f5594g;

    /* renamed from: h  reason: collision with root package name */
    public final C0154b f5595h;

    /* compiled from: AndroidPlatform */
    public static final class a extends o.o0.m.c {
        public final Object a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f5596b;

        public a(Object obj, Method method) {
            this.a = obj;
            this.f5596b = method;
        }

        public List<Certificate> a(List<Certificate> list, String str) {
            try {
                return (List) this.f5596b.invoke(this.a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: o.o0.k.b$b  reason: collision with other inner class name */
    /* compiled from: AndroidPlatform */
    public static final class C0154b {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f5597b;
        public final Method c;

        public C0154b(Method method, Method method2, Method method3) {
            this.a = method;
            this.f5597b = method2;
            this.c = method3;
        }
    }

    /* compiled from: AndroidPlatform */
    public static final class c implements e {
        public final X509TrustManager a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f5598b;

        public c(X509TrustManager x509TrustManager, Method method) {
            this.f5598b = method;
            this.a = x509TrustManager;
        }

        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f5598b.invoke(this.a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.a.equals(cVar.a) || !this.f5598b.equals(cVar.f5598b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f5598b.hashCode() * 31) + this.a.hashCode();
        }
    }

    public b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            Class<?> cls3 = Class.forName("dalvik.system.CloseGuard");
            Method method8 = cls3.getMethod("get", new Class[0]);
            method5 = cls3.getMethod("open", new Class[]{String.class});
            method6 = cls3.getMethod("warnIfOpen", new Class[0]);
            method7 = method8;
        } catch (Exception unused) {
            method6 = null;
            method5 = null;
        }
        this.f5595h = new C0154b(method7, method5, method6);
        this.c = cls2;
        this.d = method;
        this.e = method2;
        this.f5593f = method3;
        this.f5594g = method4;
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (AssertionError e2) {
            if (o.o0.e.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e3);
            }
            throw e3;
        }
    }

    @Nullable
    public String b(SSLSocket sSLSocket) {
        if (!this.c.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f5593f.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return a(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            throw new AssertionError("unable to determine cleartext support", e2);
        }
    }

    public void a(SSLSocket sSLSocket, String str, List<d0> list) {
        if (this.c.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.d.invoke(sSLSocket, new Object[]{true});
                    this.e.invoke(sSLSocket, new Object[]{str});
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new AssertionError(e2);
                }
            }
            this.f5594g.invoke(sSLSocket, new Object[]{f.b(list)});
        }
    }

    public e b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new o.o0.m.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    public void a(int i2, String str, @Nullable Throwable th) {
        int min;
        int i3 = 5;
        if (i2 != 5) {
            i3 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int i4 = 0;
        int length = str.length();
        while (i4 < length) {
            int indexOf = str.indexOf(10, i4);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i4 + 4000);
                Log.println(i3, "OkHttp", str.substring(i4, min));
                if (min >= indexOf) {
                    break;
                }
                i4 = min;
            }
            i4 = min + 1;
        }
    }

    @Nullable
    public Object a(String str) {
        C0154b bVar = this.f5595h;
        Method method = bVar.a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, new Object[0]);
            bVar.f5597b.invoke(invoke, new Object[]{str});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(String str, Object obj) {
        C0154b bVar = this.f5595h;
        if (bVar != null) {
            boolean z = false;
            if (obj != null) {
                try {
                    bVar.c.invoke(obj, new Object[0]);
                    z = true;
                } catch (Exception unused) {
                }
            }
            if (!z) {
                a(5, str, (Throwable) null);
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return ((java.lang.Boolean) r7.getMethod("isCleartextTrafficPermitted", new java.lang.Class[0]).invoke(r8, new java.lang.Object[0])).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r6, java.lang.Class<?> r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.String r0 = "isCleartextTrafficPermitted"
            r1 = 0
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r1] = r4     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.reflect.Method r3 = r7.getMethod(r0, r3)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            r4[r1] = r6     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object r6 = r3.invoke(r8, r4)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ NoSuchMethodException -> 0x001d }
            boolean r6 = r6.booleanValue()     // Catch:{ NoSuchMethodException -> 0x001d }
            return r6
        L_0x001d:
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.reflect.Method r6 = r7.getMethod(r0, r6)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object r6 = r6.invoke(r8, r7)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ NoSuchMethodException -> 0x002f }
            boolean r2 = r6.booleanValue()     // Catch:{ NoSuchMethodException -> 0x002f }
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.k.b.a(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    public o.o0.m.c a(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return new o.o0.m.a(b(x509TrustManager));
        }
    }

    public SSLContext a() {
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }
}
