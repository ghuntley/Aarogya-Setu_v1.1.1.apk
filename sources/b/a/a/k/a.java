package b.a.a.k;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: SharedPref */
public class a {
    public static SharedPreferences a;

    public static SharedPreferences a(Context context) {
        if (a == null) {
            a = context.getSharedPreferences("FightCorona_prefs", 0);
        }
        return a;
    }

    public static void b(Context context, String str, String str2) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public static String a(Context context, String str, String str2) {
        return a(context).getString(str, str2);
    }

    public static void a(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = a(context).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }
}
