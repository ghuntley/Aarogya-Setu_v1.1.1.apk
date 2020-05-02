package i.c.a.a.j;

import i.c.a.a.d;
import i.c.a.a.j.h;
import java.util.Arrays;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class b extends h {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2933b;
    public final d c;

    public /* synthetic */ b(String str, byte[] bArr, d dVar, a aVar) {
        this.a = str;
        this.f2933b = bArr;
        this.c = dVar;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a.equals(((b) hVar).a)) {
            byte[] bArr2 = this.f2933b;
            if (hVar instanceof b) {
                bArr = ((b) hVar).f2933b;
            } else {
                bArr = ((b) hVar).f2933b;
            }
            if (!Arrays.equals(bArr2, bArr) || !this.c.equals(((b) hVar).c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2933b)) * 1000003) ^ this.c.hashCode();
    }

    /* renamed from: i.c.a.a.j.b$b  reason: collision with other inner class name */
    /* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public static final class C0103b extends h.a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f2934b;
        public d c;

        public h.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public h.a a(d dVar) {
            if (dVar != null) {
                this.c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }

        public h a() {
            String str = this.a == null ? " backendName" : "";
            if (this.c == null) {
                str = i.a.a.a.a.b(str, " priority");
            }
            if (str.isEmpty()) {
                return new b(this.a, this.f2934b, this.c, (a) null);
            }
            throw new IllegalStateException(i.a.a.a.a.b("Missing required properties:", str));
        }
    }
}
