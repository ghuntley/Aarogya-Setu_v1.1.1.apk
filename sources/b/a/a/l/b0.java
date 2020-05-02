package b.a.a.l;

import i.a.a.a.a;
import n.m.c.f;

/* compiled from: CorUtility.kt */
public final class b0 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f423b;

    public b0(String str, String str2) {
        if (str == null) {
            f.a("firstInstallTime");
            throw null;
        } else if (str2 != null) {
            this.a = str;
            this.f423b = str2;
        } else {
            f.a("lastUpdateTime");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return f.a((Object) this.a, (Object) b0Var.a) && f.a((Object) this.f423b, (Object) b0Var.f423b);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f423b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("InstallTimeModel(firstInstallTime=");
        a2.append(this.a);
        a2.append(", lastUpdateTime=");
        return a.a(a2, this.f423b, ")");
    }
}
