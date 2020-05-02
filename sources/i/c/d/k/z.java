package i.c.d.k;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import h.e.a;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class z {
    public final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4720b;
    public final Map<String, Long> c = new a();

    public z(Context context) {
        this.f4720b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(h.h.f.a.a(this.f4720b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !c()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    b();
                    FirebaseInstanceId.g().c();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    public static String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i.a.a.a.a.a(str3, i.a.a.a.a.a(str2, i.a.a.a.a.a(str, 4))));
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    public final synchronized String a() {
        return this.a.getString("topic_operation_queue", "");
    }

    public final synchronized boolean c() {
        return this.a.getAll().isEmpty();
    }

    public final synchronized void a(String str) {
        this.a.edit().putString("topic_operation_queue", str).apply();
    }

    public final synchronized void b() {
        this.c.clear();
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.a.edit();
        for (String next : this.a.getAll().keySet()) {
            if (next.startsWith(concat)) {
                edit.remove(next);
            }
        }
        edit.commit();
    }

    public static String a(String str, String str2) {
        return i.a.a.a.a.a(i.a.a.a.a.a(str2, i.a.a.a.a.a(str, 3)), str, "|S|", str2);
    }

    public final synchronized d0 a(String str, String str2, String str3) {
        return d0.a(this.a.getString(b(str, str2, str3), (String) null));
    }

    public final synchronized long b(String str) {
        long currentTimeMillis;
        currentTimeMillis = System.currentTimeMillis();
        if (!this.a.contains(a(str, "cre"))) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(a(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
        } else {
            String string = this.a.getString(a(str, "cre"), (String) null);
            if (string != null) {
                try {
                    currentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
            currentTimeMillis = 0;
        }
        this.c.put(str, Long.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String a2 = d0.a(str4, str5, System.currentTimeMillis());
        if (a2 != null) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(b(str, str2, str3), a2);
            edit.commit();
        }
    }
}
