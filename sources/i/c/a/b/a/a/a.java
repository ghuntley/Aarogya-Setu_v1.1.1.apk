package i.c.a.b.a.a;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public final class a extends Thread {
    public final /* synthetic */ Map e;

    public a(Map map) {
        this.e = map;
    }

    public final void run() {
        StringBuilder sb;
        String str;
        String str2;
        Exception exc;
        HttpURLConnection httpURLConnection;
        Map map = this.e;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str3 : map.keySet()) {
            buildUpon.appendQueryParameter(str3, (String) map.get(str3));
        }
        String uri = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(uri);
                Log.w("HttpUrlPinger", sb2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e2) {
            str2 = e2.getMessage();
            sb = new StringBuilder(i.a.a.a.a.a(str2, i.a.a.a.a.a(uri, 32)));
            str = "Error while parsing ping URL: ";
            exc = e2;
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(str2);
            Log.w("HttpUrlPinger", sb.toString(), exc);
        } catch (IOException | RuntimeException e3) {
            str2 = e3.getMessage();
            sb = new StringBuilder(i.a.a.a.a.a(str2, i.a.a.a.a.a(uri, 27)));
            str = "Error while pinging URL: ";
            exc = e3;
            sb.append(str);
            sb.append(uri);
            sb.append(". ");
            sb.append(str2);
            Log.w("HttpUrlPinger", sb.toString(), exc);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
