package i.c.a.a.i.b;

import i.c.a.a.i.b.o;
import java.util.Arrays;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class g extends o {
    public final long a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2890b;
    public final long c;
    public final byte[] d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2891f;

    /* renamed from: g  reason: collision with root package name */
    public final t f2892g;

    /* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    public static final class a extends o.a {
        public Long a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f2893b;
        public Long c;
        public byte[] d;
        public String e;

        /* renamed from: f  reason: collision with root package name */
        public Long f2894f;

        /* renamed from: g  reason: collision with root package name */
        public t f2895g;

        public o.a a(int i2) {
            this.f2893b = Integer.valueOf(i2);
            return this;
        }
    }

    public /* synthetic */ g(long j2, int i2, long j3, byte[] bArr, String str, long j4, t tVar) {
        this.a = j2;
        this.f2890b = i2;
        this.c = j3;
        this.d = bArr;
        this.e = str;
        this.f2891f = j4;
        this.f2892g = tVar;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        g gVar = (g) oVar;
        if (this.a == gVar.a && this.f2890b == gVar.f2890b && this.c == gVar.c) {
            byte[] bArr2 = this.d;
            if (oVar instanceof g) {
                bArr = gVar.d;
            } else {
                bArr = gVar.d;
            }
            if (Arrays.equals(bArr2, bArr) && ((str = this.e) != null ? str.equals(gVar.e) : gVar.e == null) && this.f2891f == gVar.f2891f) {
                t tVar = this.f2892g;
                if (tVar == null) {
                    if (gVar.f2892g == null) {
                        return true;
                    }
                } else if (tVar.equals(gVar.f2892g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.c;
        int hashCode = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f2890b) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int i2 = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j4 = this.f2891f;
        int i3 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        t tVar = this.f2892g;
        if (tVar != null) {
            i2 = tVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("LogEvent{eventTimeMs=");
        a2.append(this.a);
        a2.append(", eventCode=");
        a2.append(this.f2890b);
        a2.append(", eventUptimeMs=");
        a2.append(this.c);
        a2.append(", sourceExtension=");
        a2.append(Arrays.toString(this.d));
        a2.append(", sourceExtensionJsonProto3=");
        a2.append(this.e);
        a2.append(", timezoneOffsetSeconds=");
        a2.append(this.f2891f);
        a2.append(", networkConnectionInfo=");
        a2.append(this.f2892g);
        a2.append("}");
        return a2.toString();
    }
}
