package o;

import i.a.a.a.a;
import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* compiled from: Route */
public final class m0 {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f5367b;
    public final InetSocketAddress c;

    public m0(e eVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (eVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.a = eVar;
            this.f5367b = proxy;
            this.c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public boolean a() {
        return this.a.f5297i != null && this.f5367b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            return m0Var.a.equals(this.a) && m0Var.f5367b.equals(this.f5367b) && m0Var.c.equals(this.c);
        }
    }

    public int hashCode() {
        int hashCode = this.f5367b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a2 = a.a("Route{");
        a2.append(this.c);
        a2.append("}");
        return a2.toString();
    }
}
