package i.c.c.a.x.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import i.c.a.b.d.l.q;
import java.io.IOException;

/* compiled from: SharedPrefKeysetReader */
public final class c {
    public final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4378b;

    public c(Context context, String str, String str2) {
        if (str != null) {
            this.f4378b = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
            } else {
                this.a = applicationContext.getSharedPreferences(str2, 0);
            }
        } else {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    public final byte[] a() {
        try {
            String string = this.a.getString(this.f4378b, (String) null);
            if (string != null) {
                return q.d(string);
            }
            throw new IOException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.f4378b}));
        } catch (ClassCastException | IllegalArgumentException e) {
            throw new IOException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.f4378b}), e);
        }
    }
}
