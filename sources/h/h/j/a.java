package h.h.j;

import android.util.Base64;
import java.util.List;

/* compiled from: FontRequest */
public final class a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1776b;
    public final String c;
    public final List<List<byte[]>> d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1777f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.f1776b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (list != null) {
                        this.d = list;
                        this.e = 0;
                        this.f1777f = str + "-" + this.f1776b + "-" + this.c;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder a2 = i.a.a.a.a.a("FontRequest {mProviderAuthority: ");
        a2.append(this.a);
        a2.append(", mProviderPackage: ");
        a2.append(this.f1776b);
        a2.append(", mQuery: ");
        a2.append(this.c);
        a2.append(", mCertificates:");
        sb.append(a2.toString());
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            sb.append(" [");
            List list = this.d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
