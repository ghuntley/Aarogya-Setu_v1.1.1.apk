package androidx.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import h.o.h;
import h.o.i;
import h.o.u;
import h.o.v;

public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (!i.a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new i.a());
        }
        Context context2 = getContext();
        u uVar = u.f2063m;
        if (uVar != null) {
            uVar.f2067i = new Handler();
            uVar.f2068j.a(h.a.ON_CREATE);
            ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new v(uVar));
            return true;
        }
        throw null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
