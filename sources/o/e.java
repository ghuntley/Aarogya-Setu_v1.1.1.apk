package o;

import i.a.a.a.a;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o.y;

/* compiled from: Address */
public final class e {
    public final y a;

    /* renamed from: b  reason: collision with root package name */
    public final t f5293b;
    public final SocketFactory c;
    public final g d;
    public final List<d0> e;

    /* renamed from: f  reason: collision with root package name */
    public final List<o> f5294f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f5295g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final Proxy f5296h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final SSLSocketFactory f5297i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public final HostnameVerifier f5298j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final l f5299k;

    public e(String str, int i2, t tVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable l lVar, g gVar, @Nullable Proxy proxy, List<d0> list, List<o> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i3 = i2;
        t tVar2 = tVar;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        g gVar2 = gVar;
        ProxySelector proxySelector2 = proxySelector;
        y.a aVar = new y.a();
        String str3 = sSLSocketFactory2 != null ? "https" : "http";
        if (str3.equalsIgnoreCase("http")) {
            aVar.a = "http";
        } else if (str3.equalsIgnoreCase("https")) {
            aVar.a = "https";
        } else {
            throw new IllegalArgumentException(a.b("unexpected scheme: ", str3));
        }
        if (str2 != null) {
            String a2 = y.a.a(str, 0, str.length());
            if (a2 != null) {
                aVar.d = a2;
                if (i3 <= 0 || i3 > 65535) {
                    throw new IllegalArgumentException(a.b("unexpected port: ", i2));
                }
                aVar.e = i3;
                this.a = aVar.a();
                if (tVar2 != null) {
                    this.f5293b = tVar2;
                    if (socketFactory2 != null) {
                        this.c = socketFactory2;
                        if (gVar2 != null) {
                            this.d = gVar2;
                            if (list != null) {
                                this.e = o.o0.e.a(list);
                                if (list2 != null) {
                                    this.f5294f = o.o0.e.a(list2);
                                    if (proxySelector2 != null) {
                                        this.f5295g = proxySelector2;
                                        this.f5296h = proxy;
                                        this.f5297i = sSLSocketFactory2;
                                        this.f5298j = hostnameVerifier;
                                        this.f5299k = lVar;
                                        return;
                                    }
                                    throw new NullPointerException("proxySelector == null");
                                }
                                throw new NullPointerException("connectionSpecs == null");
                            }
                            throw new NullPointerException("protocols == null");
                        }
                        throw new NullPointerException("proxyAuthenticator == null");
                    }
                    throw new NullPointerException("socketFactory == null");
                }
                throw new NullPointerException("dns == null");
            }
            throw new IllegalArgumentException(a.b("unexpected host: ", str));
        }
        throw new NullPointerException("host == null");
    }

    public boolean a(e eVar) {
        return this.f5293b.equals(eVar.f5293b) && this.d.equals(eVar.d) && this.e.equals(eVar.e) && this.f5294f.equals(eVar.f5294f) && this.f5295g.equals(eVar.f5295g) && Objects.equals(this.f5296h, eVar.f5296h) && Objects.equals(this.f5297i, eVar.f5297i) && Objects.equals(this.f5298j, eVar.f5298j) && Objects.equals(this.f5299k, eVar.f5299k) && this.a.e == eVar.a.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && a(eVar);
        }
    }

    public int hashCode() {
        int hashCode = this.f5293b.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.f5294f.hashCode();
        int hashCode5 = this.f5295g.hashCode();
        int hashCode6 = Objects.hashCode(this.f5296h);
        int hashCode7 = Objects.hashCode(this.f5297i);
        int hashCode8 = Objects.hashCode(this.f5298j);
        return Objects.hashCode(this.f5299k) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a2 = a.a("Address{");
        a2.append(this.a.d);
        a2.append(":");
        a2.append(this.a.e);
        if (this.f5296h != null) {
            a2.append(", proxy=");
            a2.append(this.f5296h);
        } else {
            a2.append(", proxySelector=");
            a2.append(this.f5295g);
        }
        a2.append("}");
        return a2.toString();
    }
}
