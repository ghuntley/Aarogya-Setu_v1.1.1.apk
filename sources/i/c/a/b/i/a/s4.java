package i.c.a.b.i.a;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class s4 extends r9 {
    public final SSLSocketFactory d = null;

    public s4(t9 t9Var) {
        super(t9Var);
    }

    public static /* synthetic */ byte[] a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream2 = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream2.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public final boolean p() {
        return false;
    }

    public final boolean t() {
        m();
        NetworkInfo networkInfo = null;
        try {
            networkInfo = ((ConnectivityManager) this.a.a.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public final HttpURLConnection a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.d;
            if (sSLSocketFactory != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }
}
