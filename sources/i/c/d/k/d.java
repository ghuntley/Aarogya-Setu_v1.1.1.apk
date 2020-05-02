package i.c.d.k;

import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class d implements Callable {
    public final Intent e;

    public d(Intent intent) {
        this.e = intent;
    }

    public final Object call() {
        Intent intent = this.e;
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                StringBuilder sb = new StringBuilder(valueOf.length() + stringExtra.length() + 21);
                sb.append("Received command: ");
                sb.append(stringExtra);
                sb.append(" - ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.g().c();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId g2 = FirebaseInstanceId.g();
                if (g2 != null) {
                    FirebaseInstanceId.f699k.c("");
                    g2.e();
                } else {
                    throw null;
                }
            }
        }
        return -1;
    }
}
