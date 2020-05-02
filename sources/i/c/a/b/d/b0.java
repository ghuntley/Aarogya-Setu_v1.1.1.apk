package i.c.a.b.d;

import i.c.a.b.d.o.a;
import i.c.a.b.d.o.d;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class b0 {
    public static final b0 d = new b0(true, (String) null, (Throwable) null);
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3017b;
    public final Throwable c;

    public b0(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.a = z;
        this.f3017b = str;
        this.c = th;
    }

    public static b0 a(Callable<String> callable) {
        return new d0(callable, (e0) null);
    }

    public static b0 a(String str) {
        return new b0(false, str, (Throwable) null);
    }

    @Nullable
    public String a() {
        return this.f3017b;
    }

    public static String a(String str, t tVar, boolean z, boolean z2) {
        Object[] objArr = new Object[5];
        objArr[0] = z2 ? "debug cert rejected" : "not whitelisted";
        objArr[1] = str;
        byte[] digest = a.a("SHA-1").digest(tVar.g());
        char[] cArr = new char[(digest.length << 1)];
        int i2 = 0;
        for (byte b2 : digest) {
            byte b3 = b2 & 255;
            int i3 = i2 + 1;
            char[] cArr2 = d.f3159b;
            cArr[i2] = cArr2[b3 >>> 4];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b3 & 15];
        }
        objArr[2] = new String(cArr);
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = "12451009.false";
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", objArr);
    }
}
