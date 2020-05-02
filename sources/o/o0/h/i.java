package o.o0.h;

import i.a.a.a.a;
import java.net.ProtocolException;
import o.d0;

/* compiled from: StatusLine */
public final class i {
    public final d0 a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5457b;
    public final String c;

    public i(d0 d0Var, int i2, String str) {
        this.a = d0Var;
        this.f5457b = i2;
        this.c = str;
    }

    public static i a(String str) {
        d0 d0Var;
        String str2;
        int i2 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(a.b("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                d0Var = d0.HTTP_1_0;
            } else if (charAt == 1) {
                d0Var = d0.HTTP_1_1;
            } else {
                throw new ProtocolException(a.b("Unexpected status line: ", str));
            }
        } else if (str.startsWith("ICY ")) {
            d0Var = d0.HTTP_1_0;
            i2 = 4;
        } else {
            throw new ProtocolException(a.b("Unexpected status line: ", str));
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (str.length() <= i3) {
                    str2 = "";
                } else if (str.charAt(i3) == ' ') {
                    str2 = str.substring(i2 + 4);
                } else {
                    throw new ProtocolException(a.b("Unexpected status line: ", str));
                }
                return new i(d0Var, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(a.b("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(a.b("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == d0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f5457b);
        if (this.c != null) {
            sb.append(' ');
            sb.append(this.c);
        }
        return sb.toString();
    }
}
