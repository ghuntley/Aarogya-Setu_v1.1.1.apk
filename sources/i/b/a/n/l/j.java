package i.b.a.n.l;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import i.b.a.n.l.d;
import i.b.a.n.n.g;
import i.b.a.t.c;
import i.b.a.t.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher */
public class j implements d<InputStream> {

    /* renamed from: k  reason: collision with root package name */
    public static final b f2511k = new a();
    public final g e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2512f;

    /* renamed from: g  reason: collision with root package name */
    public final b f2513g;

    /* renamed from: h  reason: collision with root package name */
    public HttpURLConnection f2514h;

    /* renamed from: i  reason: collision with root package name */
    public InputStream f2515i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f2516j;

    /* compiled from: HttpUrlFetcher */
    public static class a implements b {
    }

    /* compiled from: HttpUrlFetcher */
    public interface b {
    }

    public j(g gVar, int i2) {
        b bVar = f2511k;
        this.e = gVar;
        this.f2512f = i2;
        this.f2513g = bVar;
    }

    public void a(i.b.a.g gVar, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        long a2 = f.a();
        try {
            aVar.a(a(this.e.b(), 0, (URL) null, this.e.f2683b.a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(f.a(a2));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e2) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
            }
            aVar.a((Exception) e2);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder a3 = i.a.a.a.a.a("Finished http url fetcher fetch in ");
                a3.append(f.a(a2));
                Log.v("HttpUrlFetcher", a3.toString());
            }
            throw th;
        }
    }

    public void b() {
        InputStream inputStream = this.f2515i;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2514h;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2514h = null;
    }

    public i.b.a.n.a c() {
        return i.b.a.n.a.REMOTE;
    }

    public void cancel() {
        this.f2516j = true;
    }

    public final InputStream a(URL url, int i2, URL url2, Map<String, String> map) {
        if (i2 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            if (((a) this.f2513g) != null) {
                this.f2514h = (HttpURLConnection) url.openConnection();
                for (Map.Entry next : map.entrySet()) {
                    this.f2514h.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                this.f2514h.setConnectTimeout(this.f2512f);
                this.f2514h.setReadTimeout(this.f2512f);
                boolean z = false;
                this.f2514h.setUseCaches(false);
                this.f2514h.setDoInput(true);
                this.f2514h.setInstanceFollowRedirects(false);
                this.f2514h.connect();
                this.f2515i = this.f2514h.getInputStream();
                if (this.f2516j) {
                    return null;
                }
                int responseCode = this.f2514h.getResponseCode();
                int i3 = responseCode / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection = this.f2514h;
                    if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                        this.f2515i = new c(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
                    } else {
                        if (Log.isLoggable("HttpUrlFetcher", 3)) {
                            StringBuilder a2 = i.a.a.a.a.a("Got non empty content encoding: ");
                            a2.append(httpURLConnection.getContentEncoding());
                            Log.d("HttpUrlFetcher", a2.toString());
                        }
                        this.f2515i = httpURLConnection.getInputStream();
                    }
                    return this.f2515i;
                }
                if (i3 == 3) {
                    z = true;
                }
                if (z) {
                    String headerField = this.f2514h.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        URL url3 = new URL(url, headerField);
                        b();
                        return a(url3, i2 + 1, url, map);
                    }
                    throw new HttpException("Received empty or null redirect url");
                } else if (responseCode == -1) {
                    throw new HttpException(responseCode);
                } else {
                    throw new HttpException(this.f2514h.getResponseMessage(), responseCode);
                }
            } else {
                throw null;
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!");
        }
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }
}
