package o.o0.k;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import o.d0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@SuppressLint({"NewApi"})
/* compiled from: Android10Platform */
public class a extends b {
    public a(Class<?> cls) {
        super(cls, (Class<?>) null, (Method) null, (Method) null, (Method) null, (Method) null);
    }

    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public void a(SSLSocket sSLSocket, String str, List<d0> list) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) ((ArrayList) f.a(list)).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Nullable
    @IgnoreJRERequirement
    public String b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }

    @Nullable
    public static f b() {
        int i2;
        try {
            i2 = Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            i2 = 0;
        }
        if (i2 < 29) {
            return null;
        }
        try {
            return new a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
        } catch (ReflectiveOperationException unused2) {
            return null;
        }
    }
}
