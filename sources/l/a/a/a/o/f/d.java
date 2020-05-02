package l.a.a.a.o.f;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PreferenceStoreImpl */
public class d implements c {
    public final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5160b;
    public final Context c;

    public d(Context context, String str) {
        if (context != null) {
            this.c = context;
            this.f5160b = str;
            this.a = context.getSharedPreferences(str, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    public SharedPreferences.Editor a() {
        return this.a.edit();
    }
}
