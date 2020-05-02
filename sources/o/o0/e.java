package o.o0;

import androidx.recyclerview.widget.RecyclerView;
import i.a.a.a.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.a0;
import o.k0;
import o.l0;
import o.o0.j.b;
import o.x;
import o.y;
import p.f;
import p.h;
import p.i;
import p.t;

/* compiled from: Util */
public final class e {
    public static final byte[] a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f5380b = new String[0];
    public static final x c = x.a(new String[0]);
    public static final l0 d;
    public static final t e = t.a(i.c("efbbbf"), i.c("feff"), i.c("fffe"), i.c("0000ffff"), i.c("ffff0000"));

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f5381f = Charset.forName("UTF-32BE");

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f5382g = Charset.forName("UTF-32LE");

    /* renamed from: h  reason: collision with root package name */
    public static final TimeZone f5383h = TimeZone.getTimeZone("GMT");

    /* renamed from: i  reason: collision with root package name */
    public static final Comparator<String> f5384i = a.e;

    /* renamed from: j  reason: collision with root package name */
    public static final Method f5385j;

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f5386k = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        byte[] bArr = a;
        f fVar = new f();
        fVar.write(bArr);
        Method method = null;
        d = new k0((a0) null, (long) bArr.length, fVar);
        byte[] bArr2 = a;
        a((long) bArr2.length, (long) 0, (long) bArr2.length);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f5385j = method;
    }

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    public static void a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean b(p.a0 a0Var, int i2, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c2 = a0Var.c().d() ? a0Var.c().c() - nanoTime : Long.MAX_VALUE;
        a0Var.c().a(Math.min(c2, timeUnit.toNanos((long) i2)) + nanoTime);
        try {
            f fVar = new f();
            while (a0Var.b(fVar, 8192) != -1) {
                fVar.h();
            }
            if (c2 == RecyclerView.FOREVER_NS) {
                a0Var.c().a();
            } else {
                a0Var.c().a(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == RecyclerView.FOREVER_NS) {
                a0Var.c().a();
            } else {
                a0Var.c().a(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == RecyclerView.FOREVER_NS) {
                a0Var.c().a();
            } else {
                a0Var.c().a(nanoTime + c2);
            }
            throw th;
        }
    }

    public static int c(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static String d(String str, int i2, int i3) {
        int b2 = b(str, i2, i3);
        return str.substring(b2, c(str, b2, i3));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!a(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean a(p.a0 a0Var, int i2, TimeUnit timeUnit) {
        try {
            return b(a0Var, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @SafeVarargs
    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static ThreadFactory a(String str, boolean z) {
        return new b(str, z);
    }

    public static /* synthetic */ Thread a(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int b(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int b(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static x b(List<b> list) {
        x.a aVar = new x.a();
        for (b next : list) {
            c.a.a(aVar, next.a.m(), next.f5490b.m());
        }
        return new x(aVar);
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (comparator.compare(strArr[i2], str) == 0) {
                return i2;
            }
        }
        return -1;
    }

    public static int a(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int a(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String a(String str) {
        InetAddress inetAddress;
        int i2 = -1;
        boolean z = true;
        int i3 = 0;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = a(str, 0, str.length());
            } else {
                inetAddress = a(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    if (i7 > i5 && i7 >= 4) {
                        i2 = i4;
                        i5 = i7;
                    }
                    i4 = i6 + 2;
                }
                f fVar = new f();
                while (i3 < address.length) {
                    if (i3 == i2) {
                        fVar.writeByte(58);
                        i3 += i5;
                        if (i3 == 16) {
                            fVar.writeByte(58);
                        }
                    } else {
                        if (i3 > 0) {
                            fVar.writeByte(58);
                        }
                        fVar.a((long) (((address[i3] & 255) << 8) | (address[i3 + 1] & 255)));
                        i3 += 2;
                    }
                }
                return fVar.s();
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError(a.a("Invalid IPv6 address: '", str, "'"));
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                int i8 = 0;
                while (true) {
                    if (i8 >= lowerCase.length()) {
                        z = false;
                        break;
                    }
                    char charAt = lowerCase.charAt(i8);
                    if (charAt <= 31) {
                        break;
                    } else if (charAt >= 127) {
                        break;
                    } else if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (z) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset a(h hVar, Charset charset) {
        int a2 = hVar.a(e);
        if (a2 == -1) {
            return charset;
        }
        if (a2 == 0) {
            return StandardCharsets.UTF_8;
        }
        if (a2 == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (a2 == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (a2 == 3) {
            return f5381f;
        }
        if (a2 == 4) {
            return f5382g;
        }
        throw new AssertionError();
    }

    public static String a(y yVar, boolean z) {
        String str;
        if (yVar.d.contains(":")) {
            str = a.a(a.a("["), yVar.d, "]");
        } else {
            str = yVar.d;
        }
        if (!z && yVar.e == y.b(yVar.a)) {
            return str;
        }
        StringBuilder a2 = a.a(str, ":");
        a2.append(yVar.e);
        return a2.toString();
    }

    public static boolean a(y yVar, y yVar2) {
        return yVar.d.equals(yVar2.d) && yVar.e == yVar2.e && yVar.a.equals(yVar2.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d7, code lost:
        if (r7 == 16) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00da, code lost:
        if (r8 != -1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dd, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ef, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f5, code lost:
        throw new java.lang.AssertionError();
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.InetAddress a(java.lang.String r16, int r17, int r18) {
        /*
            r0 = r16
            r1 = r18
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r17
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00d5
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            r13 = 4
            if (r11 > r1) goto L_0x0032
            r14 = 2
            java.lang.String r15 = "::"
            boolean r14 = r0.regionMatches(r6, r15, r5, r14)
            if (r14 == 0) goto L_0x0032
            if (r8 == r4) goto L_0x0028
            return r10
        L_0x0028:
            int r7 = r7 + 2
            r8 = r7
            if (r11 != r1) goto L_0x002f
            goto L_0x00d5
        L_0x002f:
            r9 = r11
            goto L_0x00a2
        L_0x0032:
            if (r7 == 0) goto L_0x00a1
            r11 = 1
            java.lang.String r14 = ":"
            boolean r14 = r0.regionMatches(r6, r14, r5, r11)
            if (r14 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00a1
        L_0x0041:
            java.lang.String r14 = "."
            boolean r6 = r0.regionMatches(r6, r14, r5, r11)
            if (r6 == 0) goto L_0x00a0
            int r6 = r7 + -2
            r14 = r6
        L_0x004c:
            if (r9 >= r1) goto L_0x0094
            if (r14 != r2) goto L_0x0051
            goto L_0x0097
        L_0x0051:
            if (r14 == r6) goto L_0x005e
            char r15 = r0.charAt(r9)
            r11 = 46
            if (r15 == r11) goto L_0x005c
            goto L_0x0097
        L_0x005c:
            int r9 = r9 + 1
        L_0x005e:
            r11 = r9
            r15 = 0
        L_0x0060:
            if (r11 >= r1) goto L_0x0082
            char r5 = r0.charAt(r11)
            r2 = 48
            if (r5 < r2) goto L_0x0082
            r4 = 57
            if (r5 <= r4) goto L_0x006f
            goto L_0x0082
        L_0x006f:
            if (r15 != 0) goto L_0x0074
            if (r9 == r11) goto L_0x0074
            goto L_0x0097
        L_0x0074:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r12) goto L_0x007b
            goto L_0x0097
        L_0x007b:
            int r11 = r11 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0060
        L_0x0082:
            int r2 = r11 - r9
            if (r2 != 0) goto L_0x0087
            goto L_0x0097
        L_0x0087:
            int r2 = r14 + 1
            byte r4 = (byte) r15
            r3[r14] = r4
            r14 = r2
            r9 = r11
            r2 = 16
            r4 = -1
            r5 = 0
            r11 = 1
            goto L_0x004c
        L_0x0094:
            int r6 = r6 + r13
            if (r14 == r6) goto L_0x0099
        L_0x0097:
            r11 = 0
            goto L_0x009a
        L_0x0099:
            r11 = 1
        L_0x009a:
            if (r11 != 0) goto L_0x009d
            return r10
        L_0x009d:
            int r7 = r7 + 2
            goto L_0x00d5
        L_0x00a0:
            return r10
        L_0x00a1:
            r9 = r6
        L_0x00a2:
            r6 = r9
            r2 = 0
        L_0x00a4:
            if (r6 >= r1) goto L_0x00b8
            char r4 = r0.charAt(r6)
            int r4 = a((char) r4)
            r5 = -1
            if (r4 != r5) goto L_0x00b2
            goto L_0x00b8
        L_0x00b2:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00b8:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00d4
            if (r4 <= r13) goto L_0x00bf
            goto L_0x00d4
        L_0x00bf:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r12
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00d4:
            return r10
        L_0x00d5:
            r0 = 16
            if (r7 == r0) goto L_0x00eb
            r1 = -1
            if (r8 != r1) goto L_0x00dd
            return r10
        L_0x00dd:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00eb:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)     // Catch:{ UnknownHostException -> 0x00f0 }
            return r0
        L_0x00f0:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.e.a(java.lang.String, int, int):java.net.InetAddress");
    }

    public static String a(String str, @Nullable String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
            return str2;
        }
    }
}
