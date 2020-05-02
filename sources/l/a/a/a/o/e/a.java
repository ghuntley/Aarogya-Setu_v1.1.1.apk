package l.a.a.a.o.e;

import android.util.Log;
import com.crashlytics.android.core.CrashlyticsPinningInfoProvider;
import i.c.d.p.e;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import l.a.a.a.c;

/* compiled from: DefaultHttpRequestFactory */
public class a implements c {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public CrashlyticsPinningInfoProvider f5152b;
    public SSLSocketFactory c;
    public boolean d;

    public a() {
        this.a = new c();
    }

    public HttpRequest a(b bVar, String str, Map<String, String> map) {
        HttpRequest httpRequest;
        SSLSocketFactory a2;
        HttpRequest httpRequest2;
        int ordinal = bVar.ordinal();
        boolean z = true;
        if (ordinal == 0) {
            httpRequest2 = new HttpRequest(HttpRequest.b(HttpRequest.a((CharSequence) str, (Map<?, ?>) map)), "GET");
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                httpRequest = new HttpRequest(str, "PUT");
            } else if (ordinal == 3) {
                httpRequest = new HttpRequest(str, "DELETE");
            } else {
                throw new IllegalArgumentException("Unsupported HTTP method!");
            }
            if (str == null || !str.toLowerCase(Locale.US).startsWith("https")) {
                z = false;
            }
            if (!(!z || this.f5152b == null || (a2 = a()) == null)) {
                ((HttpsURLConnection) httpRequest.d()).setSSLSocketFactory(a2);
            }
            return httpRequest;
        } else {
            httpRequest2 = new HttpRequest(HttpRequest.b(HttpRequest.a((CharSequence) str, (Map<?, ?>) map)), "POST");
        }
        httpRequest = httpRequest2;
        z = false;
        ((HttpsURLConnection) httpRequest.d()).setSSLSocketFactory(a2);
        return httpRequest;
    }

    public final synchronized SSLSocketFactory b() {
        SSLSocketFactory a2;
        this.d = true;
        try {
            a2 = e.a(this.f5152b);
            if (this.a.a("Fabric", 3)) {
                Log.d("Fabric", "Custom SSL pinning enabled", (Throwable) null);
            }
        } catch (Exception e) {
            if (this.a.a("Fabric", 6)) {
                Log.e("Fabric", "Exception while validating pinned certs", e);
            }
            return null;
        }
        return a2;
    }

    public final synchronized void c() {
        this.d = false;
        this.c = null;
    }

    public a(c cVar) {
        this.a = cVar;
    }

    public final synchronized SSLSocketFactory a() {
        if (this.c == null && !this.d) {
            this.c = b();
        }
        return this.c;
    }
}
