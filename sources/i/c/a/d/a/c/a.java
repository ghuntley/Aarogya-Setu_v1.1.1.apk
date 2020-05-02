package i.c.a.d.a.c;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

public class a {
    public final String a;

    public a(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static String a(String str, String str2, Object... objArr) {
        String a2 = i.a.a.a.a.a(i.a.a.a.a.a(str2, i.a.a.a.a.a(str, 3)), str, " : ", str2);
        if (objArr == null || objArr.length <= 0) {
            return a2;
        }
        try {
            return String.format(Locale.US, a2, objArr);
        } catch (IllegalFormatException e) {
            String valueOf = String.valueOf(a2);
            Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e);
            String valueOf2 = String.valueOf(a2);
            String join = TextUtils.join(", ", objArr);
            StringBuilder sb = new StringBuilder(i.a.a.a.a.a(join, valueOf2.length() + 3));
            sb.append(valueOf2);
            sb.append(" [");
            sb.append(join);
            sb.append("]");
            return sb.toString();
        }
    }

    public final int a(int i2, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i2)) {
            return Log.i("PlayCore", a(this.a, str, objArr));
        }
        return 0;
    }

    public int a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", a(this.a, str, objArr), th);
        }
        return 0;
    }
}
