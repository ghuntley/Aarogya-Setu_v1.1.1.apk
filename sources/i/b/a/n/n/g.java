package i.b.a.n.n;

import android.net.Uri;
import android.text.TextUtils;
import g.a.a.b.a;
import i.b.a.n.e;
import java.net.URL;
import java.security.MessageDigest;

/* compiled from: GlideUrl */
public class g implements e {

    /* renamed from: b  reason: collision with root package name */
    public final h f2683b;
    public final URL c;
    public final String d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public URL f2684f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f2685g;

    /* renamed from: h  reason: collision with root package name */
    public int f2686h;

    public g(URL url) {
        h hVar = h.a;
        a.a(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        a.a(hVar, "Argument must not be null");
        this.f2683b = hVar;
    }

    public String a() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        a.a(url, "Argument must not be null");
        return url.toString();
    }

    public URL b() {
        if (this.f2684f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String str = this.d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.c;
                    a.a(url, "Argument must not be null");
                    str = url.toString();
                }
                this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f2684f = new URL(this.e);
        }
        return this.f2684f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!a().equals(gVar.a()) || !this.f2683b.equals(gVar.f2683b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f2686h == 0) {
            int hashCode = a().hashCode();
            this.f2686h = hashCode;
            this.f2686h = this.f2683b.hashCode() + (hashCode * 31);
        }
        return this.f2686h;
    }

    public String toString() {
        return a();
    }

    public void a(MessageDigest messageDigest) {
        if (this.f2685g == null) {
            this.f2685g = a().getBytes(e.a);
        }
        messageDigest.update(this.f2685g);
    }

    public g(String str) {
        h hVar = h.a;
        this.c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            a.a(hVar, "Argument must not be null");
            this.f2683b = hVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
