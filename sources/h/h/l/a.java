package h.h.l;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* compiled from: LogWriter */
public class a extends Writer {
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public StringBuilder f1807f = new StringBuilder(128);

    public a(String str) {
        this.e = str;
    }

    public final void a() {
        if (this.f1807f.length() > 0) {
            Log.d(this.e, this.f1807f.toString());
            StringBuilder sb = this.f1807f;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c = cArr[i2 + i4];
            if (c == 10) {
                a();
            } else {
                this.f1807f.append(c);
            }
        }
    }
}
