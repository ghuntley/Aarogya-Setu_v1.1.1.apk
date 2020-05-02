package h.a0.x.o.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import h.a0.l;
import h.a0.x.r.p.a;

/* compiled from: StorageNotLowTracker */
public class f extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f1035i = l.a("StorageNotLowTracker");

    public f(Context context, a aVar) {
        super(context, aVar);
    }

    public Object a() {
        Context context = this.f1029b;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, intentFilter);
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return true;
        }
        String action = registerReceiver.getAction();
        char c = 65535;
        int hashCode = action.hashCode();
        if (hashCode != -1181163412) {
            if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c = 0;
            }
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return null;
        }
        return false;
    }

    public IntentFilter d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    public void a(Context context, Intent intent) {
        if (intent.getAction() != null) {
            l.a().a(f1035i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
            }
            if (c == 0) {
                a(true);
            } else if (c == 1) {
                a(false);
            }
        }
    }
}
