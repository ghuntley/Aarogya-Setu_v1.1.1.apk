package b.a.a.a;

import android.content.Context;
import android.content.IntentFilter;
import i.c.a.b.l.e;
import nic.goi.aarogyasetu.utility.SmsReceiver;

/* compiled from: LoginBottomSheet.kt */
public final class z<TResult> implements e<Void> {
    public final /* synthetic */ b0 a;

    public z(b0 b0Var) {
        this.a = b0Var;
    }

    public void a(Object obj) {
        Void voidR = (Void) obj;
        b0 b0Var = this.a;
        if (b0Var.r0 == null) {
            SmsReceiver smsReceiver = new SmsReceiver();
            b0Var.r0 = smsReceiver;
            smsReceiver.a = b0Var.t0;
            Context k2 = b0Var.k();
            if (k2 != null) {
                k2.registerReceiver(b0Var.r0, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
            }
        }
    }
}
