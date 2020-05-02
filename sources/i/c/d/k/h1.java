package i.c.d.k;

import android.os.Bundle;
import android.util.Log;
import com.crashlytics.android.core.CrashlyticsController;
import i.c.a.b.l.a;
import i.c.a.b.l.g;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class h1 implements a<Bundle, String> {
    public final /* synthetic */ d1 a;

    public h1(d1 d1Var) {
        this.a = d1Var;
    }

    public final /* synthetic */ Object a(g gVar) {
        Bundle bundle = (Bundle) gVar.a(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString(CrashlyticsController.EVENT_TYPE_LOGGED);
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
