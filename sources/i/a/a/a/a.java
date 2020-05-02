package i.a.a.a;

import android.net.Uri;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Type;
import n.m.c.f;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: outline */
public class a {
    public static int a(String str, int i2) {
        return String.valueOf(str).length() + i2;
    }

    public static long a(long j2, long j3, long j4, long j5) {
        return ((j2 * j3) + j4) * j5;
    }

    public static View a(View view, int i2, String str, String str2) {
        View findViewById = view.findViewById(i2);
        f.a((Object) findViewById, str);
        View rootView = findViewById.getRootView();
        f.a((Object) rootView, str2);
        return rootView;
    }

    public static String a(int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String a(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String a(Class cls, StringBuilder sb, String str, String str2) {
        sb.append(cls.getSimpleName());
        sb.append(str);
        sb.append(cls.getSimpleName());
        sb.append(str2);
        return sb.toString();
    }

    public static String a(String str, Uri uri) {
        return str + uri;
    }

    public static String a(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String a(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String a(String str, Type type) {
        return str + type;
    }

    public static String a(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String a(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void a(StringBuilder sb, Fragment fragment, String str) {
        sb.append(fragment);
        Log.d(str, sb.toString());
    }

    public static String b(String str, int i2) {
        return str + i2;
    }

    public static String b(String str, String str2) {
        return str + str2;
    }
}
