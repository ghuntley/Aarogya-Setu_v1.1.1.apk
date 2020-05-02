package i.c.a.a.i;

import android.util.Log;
import com.google.firebase.encoders.EncodingException;
import g.a.a.b.a;
import i.c.a.a.i.b.i;
import i.c.a.a.i.b.s;
import i.c.a.a.i.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final /* synthetic */ class c {
    public final e a;

    public c(e eVar) {
        this.a = eVar;
    }

    public Object a(Object obj) {
        GZIPOutputStream gZIPOutputStream;
        InputStream inputStream;
        e eVar = this.a;
        e.a aVar = (e.a) obj;
        if (eVar != null) {
            a.a("CctTransportBackend", "Making request to: %s", (Object) aVar.a);
            HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(eVar.f2926f);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty(l.a.a.a.o.b.a.HEADER_USER_AGENT, String.format("datatransport/%s android/", new Object[]{"2.2.0"}));
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.setRequestProperty("Content-Type", l.a.a.a.o.b.a.ACCEPT_JSON_VALUE);
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            String str = aVar.c;
            if (str != null) {
                httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
            }
            WritableByteChannel newChannel = Channels.newChannel(httpURLConnection.getOutputStream());
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    ((i.c.d.h.g.c) eVar.a).a(aVar.f2927b, new OutputStreamWriter(gZIPOutputStream));
                    gZIPOutputStream.close();
                    newChannel.write(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
                    int responseCode = httpURLConnection.getResponseCode();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Status Code: ");
                    sb.append(responseCode);
                    a.a("CctTransportBackend", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Content-Type: ");
                    sb2.append(httpURLConnection.getHeaderField("Content-Type"));
                    a.a("CctTransportBackend", sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Content-Encoding: ");
                    sb3.append(httpURLConnection.getHeaderField("Content-Encoding"));
                    a.a("CctTransportBackend", sb3.toString());
                    if (!(responseCode == 302 || responseCode == 301)) {
                        if (responseCode != 307) {
                            if (responseCode != 200) {
                                e.b bVar = new e.b(responseCode, (URL) null, 0);
                                newChannel.close();
                                return bVar;
                            }
                            String headerField = httpURLConnection.getHeaderField("Content-Encoding");
                            if (headerField == null || !headerField.equals("gzip")) {
                                inputStream = httpURLConnection.getInputStream();
                            } else {
                                inputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                            }
                            e.b bVar2 = new e.b(responseCode, (URL) null, ((i) s.a(new InputStreamReader(inputStream))).a);
                            inputStream.close();
                            newChannel.close();
                            return bVar2;
                        }
                    }
                    e.b bVar3 = new e.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0);
                    newChannel.close();
                    return bVar3;
                } catch (EncodingException | IOException e) {
                    Log.e(a.c("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
                    e.b bVar4 = new e.b(400, (URL) null, 0);
                    gZIPOutputStream.close();
                    newChannel.close();
                    return bVar4;
                }
            } catch (Throwable th) {
                newChannel.close();
                throw th;
            }
        } else {
            throw null;
        }
    }
}
