package i.c.c.a.x.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import i.c.c.a.j;

/* compiled from: SharedPrefKeysetWriter */
public final class d implements j {
    public final SharedPreferences.Editor a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4379b;

    public d(Context context, String str, String str2) {
        if (str != null) {
            this.f4379b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                this.a = applicationContext.getSharedPreferences(str2, 0).edit();
            }
        } else {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }
}
