package o.o0.j;

import i.a.a.a.a;
import java.io.IOException;
import o.o0.e;
import p.i;

/* compiled from: Http2 */
public final class d {
    public static final i a = i.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f5501b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] c = new String[64];
    public static final String[] d = new String[256];

    static {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = d;
            if (i3 >= strArr.length) {
                break;
            }
            strArr[i3] = e.a("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
            i3++;
        }
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i4 = 0; i4 < 1; i4++) {
            int i5 = iArr[i4];
            c[i5 | 8] = a.a(new StringBuilder(), c[i5], "|PADDED");
        }
        String[] strArr3 = c;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            for (int i8 = 0; i8 < 1; i8++) {
                int i9 = iArr[i8];
                String[] strArr4 = c;
                int i10 = i9 | i7;
                strArr4[i10] = c[i9] + '|' + c[i7];
                StringBuilder sb = new StringBuilder();
                sb.append(c[i9]);
                sb.append('|');
                c[i10 | 8] = a.a(sb, c[i7], "|PADDED");
            }
        }
        while (true) {
            String[] strArr5 = c;
            if (i2 < strArr5.length) {
                if (strArr5[i2] == null) {
                    strArr5[i2] = d[i2];
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(e.a(str, objArr));
    }

    public static IOException b(String str, Object... objArr) {
        throw new IOException(e.a(str, objArr));
    }

    public static String a(boolean z, int i2, int i3, byte b2, byte b3) {
        String str;
        String[] strArr = f5501b;
        String a2 = b2 < strArr.length ? strArr[b2] : e.a("0x%02x", Byte.valueOf(b2));
        if (b3 == 0) {
            str = "";
        } else {
            if (!(b2 == 2 || b2 == 3)) {
                if (b2 == 4 || b2 == 6) {
                    str = b3 == 1 ? "ACK" : d[b3];
                } else if (!(b2 == 7 || b2 == 8)) {
                    String[] strArr2 = c;
                    String str2 = b3 < strArr2.length ? strArr2[b3] : d[b3];
                    str = (b2 != 5 || (b3 & 4) == 0) ? (b2 != 0 || (b3 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            str = d[b3];
        }
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = a2;
        objArr[4] = str;
        return e.a("%s 0x%08x %5d %-13s %s", objArr);
    }
}
