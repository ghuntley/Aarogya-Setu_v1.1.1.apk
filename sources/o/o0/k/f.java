package o.o0.k;

import i.a.a.a.a;
import java.io.EOFException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o.c0;
import o.d0;
import o.o0.m.b;
import o.o0.m.c;
import o.o0.m.e;

/* compiled from: Platform */
public class f {
    public static final f a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f5602b = Logger.getLogger(c0.class.getName());

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    static {
        /*
            o.o0.k.f r0 = o.o0.k.a.b()
            if (r0 == 0) goto L_0x0008
            goto L_0x00a6
        L_0x0008:
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NoClassDefFoundError -> 0x000c }
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            goto L_0x0066
        L_0x0012:
            java.lang.String r1 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class r5 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0066 }
            java.lang.String r1 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class r6 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0066 }
            java.lang.String r1 = "setUseSessionTickets"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0051 }
            r4[r0] = r7     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.reflect.Method r7 = r6.getDeclaredMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.String r1 = "setHostname"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r4[r0] = r8     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.reflect.Method r8 = r6.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.String r1 = "getAlpnSelectedProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.reflect.Method r9 = r6.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.String r1 = "setAlpnProtocols"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.Class<byte[]> r10 = byte[].class
            r4[r0] = r10     // Catch:{ NoSuchMethodException -> 0x0051 }
            java.lang.reflect.Method r10 = r6.getMethod(r1, r4)     // Catch:{ NoSuchMethodException -> 0x0051 }
            o.o0.k.b r1 = new o.o0.k.b     // Catch:{ NoSuchMethodException -> 0x0051 }
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ NoSuchMethodException -> 0x0051 }
            goto L_0x0067
        L_0x0051:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected Android API level 21+ but was "
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0066:
            r1 = r3
        L_0x0067:
            if (r1 == 0) goto L_0x006b
            r0 = r1
            goto L_0x00a6
        L_0x006b:
            java.lang.String r1 = "okhttp.platform"
            java.lang.String r1 = o.o0.e.a((java.lang.String) r1, (java.lang.String) r3)
            java.lang.String r3 = "conscrypt"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x007a
            goto L_0x008a
        L_0x007a:
            java.security.Provider[] r1 = java.security.Security.getProviders()
            r0 = r1[r0]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "Conscrypt"
            boolean r2 = r1.equals(r0)
        L_0x008a:
            if (r2 == 0) goto L_0x0093
            o.o0.k.c r0 = o.o0.k.c.c()
            if (r0 == 0) goto L_0x0093
            goto L_0x00a6
        L_0x0093:
            o.o0.k.e r0 = o.o0.k.e.b()
            if (r0 == 0) goto L_0x009a
            goto L_0x00a6
        L_0x009a:
            o.o0.k.f r0 = o.o0.k.d.b()
            if (r0 == 0) goto L_0x00a1
            goto L_0x00a6
        L_0x00a1:
            o.o0.k.f r0 = new o.o0.k.f
            r0.<init>()
        L_0x00a6:
            a = r0
            java.lang.Class<o.c0> r0 = o.c0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f5602b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.k.f.<clinit>():void");
    }

    public static byte[] b(List<d0> list) {
        p.f fVar = new p.f();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            d0 d0Var = list.get(i2);
            if (d0Var != d0.HTTP_1_0) {
                fVar.writeByte(d0Var.e.length());
                fVar.a(d0Var.e);
            }
        }
        try {
            return fVar.i(fVar.f5646f);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        socket.connect(inetSocketAddress, i2);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void a(SSLSocket sSLSocket, @Nullable String str, List<d0> list) {
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
    }

    @Nullable
    public String b(SSLSocket sSLSocket) {
        return null;
    }

    public boolean b(String str) {
        return true;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public void a(int i2, String str, @Nullable Throwable th) {
        f5602b.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    @Nullable
    public Object a(String str) {
        if (f5602b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            str = a.b(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        a(5, str, (Throwable) obj);
    }

    public static List<String> a(List<d0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            d0 d0Var = list.get(i2);
            if (d0Var != d0.HTTP_1_0) {
                arrayList.add(d0Var.e);
            }
        }
        return arrayList;
    }

    public e b(X509TrustManager x509TrustManager) {
        return new b(x509TrustManager.getAcceptedIssuers());
    }

    public c a(X509TrustManager x509TrustManager) {
        return new o.o0.m.a(b(x509TrustManager));
    }

    public SSLContext a() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }
}
