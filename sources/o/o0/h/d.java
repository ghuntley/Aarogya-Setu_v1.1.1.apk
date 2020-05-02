package o.o0.h;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o.o0.e;

/* compiled from: HttpDate */
public final class d {
    public static final ThreadLocal<DateFormat> a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f5446b;
    public static final DateFormat[] c;

    /* compiled from: HttpDate */
    public class a extends ThreadLocal<DateFormat> {
        public Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(e.f5383h);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f5446b = strArr;
        c = new DateFormat[strArr.length];
    }

    public static Date a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f5446b) {
            int length = f5446b.length;
            for (int i2 = 0; i2 < length; i2++) {
                DateFormat dateFormat = c[i2];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f5446b[i2], Locale.US);
                    dateFormat.setTimeZone(e.f5383h);
                    c[i2] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
