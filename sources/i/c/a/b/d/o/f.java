package i.c.a.b.d.o;

import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class f {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
