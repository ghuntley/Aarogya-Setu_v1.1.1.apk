package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import o.o0.e;

/* compiled from: ConnectionSpec */
public final class o {
    public static final m[] e = {m.f5366q, m.r, m.s, m.f5360k, m.f5362m, m.f5361l, m.f5363n, m.f5365p, m.f5364o};

    /* renamed from: f  reason: collision with root package name */
    public static final m[] f5374f = {m.f5366q, m.r, m.s, m.f5360k, m.f5362m, m.f5361l, m.f5363n, m.f5365p, m.f5364o, m.f5358i, m.f5359j, m.f5356g, m.f5357h, m.e, m.f5355f, m.d};

    /* renamed from: g  reason: collision with root package name */
    public static final o f5375g;

    /* renamed from: h  reason: collision with root package name */
    public static final o f5376h = new o(new a(false));
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5377b;
    @Nullable
    public final String[] c;
    @Nullable
    public final String[] d;

    static {
        a aVar = new a(true);
        aVar.a(e);
        aVar.a(n0.TLS_1_3, n0.TLS_1_2);
        aVar.a(true);
        new o(aVar);
        a aVar2 = new a(true);
        aVar2.a(f5374f);
        aVar2.a(n0.TLS_1_3, n0.TLS_1_2);
        aVar2.a(true);
        f5375g = new o(aVar2);
        a aVar3 = new a(true);
        aVar3.a(f5374f);
        aVar3.a(n0.TLS_1_3, n0.TLS_1_2, n0.TLS_1_1, n0.TLS_1_0);
        aVar3.a(true);
        new o(aVar3);
    }

    public o(a aVar) {
        this.a = aVar.a;
        this.c = aVar.f5378b;
        this.d = aVar.c;
        this.f5377b = aVar.d;
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !e.b(e.f5384i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.c;
        if (strArr2 == null || e.b(m.f5354b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        o oVar = (o) obj;
        boolean z = this.a;
        if (z != oVar.a) {
            return false;
        }
        return !z || (Arrays.equals(this.c, oVar.c) && Arrays.equals(this.d, oVar.d) && this.f5377b == oVar.f5377b);
    }

    public int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + (this.f5377b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        List list;
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder a2 = i.a.a.a.a.a("ConnectionSpec(cipherSuites=");
        String[] strArr = this.c;
        List list2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String a3 : strArr) {
                arrayList.add(m.a(a3));
            }
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        a2.append(Objects.toString(list, "[all enabled]"));
        a2.append(", tlsVersions=");
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String a4 : strArr2) {
                arrayList2.add(n0.a(a4));
            }
            list2 = Collections.unmodifiableList(arrayList2);
        }
        a2.append(Objects.toString(list2, "[all enabled]"));
        a2.append(", supportsTlsExtensions=");
        a2.append(this.f5377b);
        a2.append(")");
        return a2.toString();
    }

    /* compiled from: ConnectionSpec */
    public static final class a {
        public boolean a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String[] f5378b;
        @Nullable
        public String[] c;
        public boolean d;

        public a(boolean z) {
            this.a = z;
        }

        public a a(m... mVarArr) {
            if (this.a) {
                String[] strArr = new String[mVarArr.length];
                for (int i2 = 0; i2 < mVarArr.length; i2++) {
                    strArr[i2] = mVarArr[i2].a;
                }
                a(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public a(o oVar) {
            this.a = oVar.a;
            this.f5378b = oVar.c;
            this.c = oVar.d;
            this.d = oVar.f5377b;
        }

        public a a(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f5378b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public a a(n0... n0VarArr) {
            if (this.a) {
                String[] strArr = new String[n0VarArr.length];
                for (int i2 = 0; i2 < n0VarArr.length; i2++) {
                    strArr[i2] = n0VarArr[i2].e;
                }
                b(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(boolean z) {
            if (this.a) {
                this.d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
    }
}
