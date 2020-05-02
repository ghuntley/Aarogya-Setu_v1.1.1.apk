package nic.goi.aarogyasetu.utility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.TypeCastException;
import n.m.c.f;

/* compiled from: SmsRetriever.kt */
public final class SmsReceiver extends BroadcastReceiver {
    public a a;

    /* compiled from: SmsRetriever.kt */
    public interface a {
        void a();

        void a(String str);
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        a aVar;
        a aVar2;
        Integer num = null;
        if (context == null) {
            f.a("context");
            throw null;
        } else if (intent == null) {
            f.a("intent");
            throw null;
        } else if (f.a((Object) "com.google.android.gms.auth.api.phone.SMS_RETRIEVED", (Object) intent.getAction()) && (extras = intent.getExtras()) != null) {
            Object obj = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            if (!(obj instanceof Status)) {
                obj = null;
            }
            Status status = (Status) obj;
            if (status != null) {
                num = Integer.valueOf(status.f476f);
            }
            if (num != null && num.intValue() == 0) {
                Object obj2 = extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                if (obj2 != null) {
                    Matcher matcher = Pattern.compile("\\d{6}").matcher((String) obj2);
                    if (matcher.find() && (aVar2 = this.a) != null) {
                        aVar2.a(matcher.group(0));
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            } else if (num != null && num.intValue() == 15 && (aVar = this.a) != null) {
                aVar.a();
            }
        }
    }
}
