package i.c.a.b.d.l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public abstract class i {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static i f3129b;

    public static i a(Context context) {
        synchronized (a) {
            if (f3129b == null) {
                f3129b = new k0(context.getApplicationContext());
            }
        }
        return f3129b;
    }

    public abstract boolean a(a aVar, ServiceConnection serviceConnection, String str);

    public abstract void b(a aVar, ServiceConnection serviceConnection, String str);

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        public static final Uri f3130f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3131b;
        public final ComponentName c = null;
        public final int d;
        public final boolean e;

        public a(String str, String str2, int i2) {
            q.b(str);
            this.a = str;
            q.b(str2);
            this.f3131b = str2;
            this.d = i2;
            this.e = false;
        }

        public final Intent a(Context context) {
            if (this.a == null) {
                return new Intent().setComponent(this.c);
            }
            Intent intent = null;
            if (this.e) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", this.a);
                Bundle call = context.getContentResolver().call(f3130f, "serviceIntentCall", (String) null, bundle);
                if (call != null) {
                    intent = (Intent) call.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    String valueOf = String.valueOf(this.a);
                    Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new String("Dynamic lookup for intent failed for action: "));
                }
            }
            if (intent == null) {
                return new Intent(this.a).setPackage(this.f3131b);
            }
            return intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return q.b((Object) this.a, (Object) aVar.a) && q.b((Object) this.f3131b, (Object) aVar.f3131b) && q.b((Object) this.c, (Object) aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.f3131b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e)});
        }

        public final String toString() {
            String str = this.a;
            return str == null ? this.c.flattenToString() : str;
        }

        public a(String str, String str2, int i2, boolean z) {
            q.b(str);
            this.a = str;
            q.b(str2);
            this.f3131b = str2;
            this.d = i2;
            this.e = z;
        }
    }
}
