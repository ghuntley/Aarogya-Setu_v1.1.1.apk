package nic.goi.aarogyasetu;

import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import b.a.a.j.c;
import b.a.a.k.a;
import b.a.a.l.h;
import b.a.a.l.l;
import b.a.a.l.o;
import b.a.a.l.r;
import com.google.firebase.messaging.FirebaseMessagingService;
import h.h.e.i;
import h.h.e.j;
import h.h.e.m;
import i.c.d.o.b;
import i.c.d.p.e;
import java.util.Map;
import n.m.c.f;
import nic.goi.aarogyasetu.models.network.FCMTokenObject;
import nic.goi.aarogyasetu.views.WebViewActivity;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    public void a(String str) {
        o.a aVar = o.f436b;
        if (str != null) {
            String b2 = h.b();
            if (!(b2 == null || b2.length() == 0)) {
                ((c) e.a(false, false, true, "").a(c.class)).a(aVar.a(false), new FCMTokenObject(str)).a(new r());
                return;
            }
            return;
        }
        f.a("token");
        throw null;
    }

    public void a(b bVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String str;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        String str2 = "";
        String a = a.a((Context) CoronaApplication.f5224g, "unique_id", str2);
        if (o.f436b.d(CoronaApplication.f5224g) && defaultAdapter != null && !a.isEmpty()) {
            defaultAdapter.setName(a);
        }
        if (bVar.f4757f == null) {
            Bundle bundle = bVar.e;
            h.e.a aVar = new h.e.a();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    String str4 = (String) obj;
                    if (!str3.startsWith("google.") && !str3.startsWith("gcm.") && !str3.equals("from") && !str3.equals("message_type") && !str3.equals("collapse_key")) {
                        aVar.put(str3, str4);
                    }
                }
            }
            bVar.f4757f = aVar;
        }
        Map<String, String> map = bVar.f4757f;
        if (!map.isEmpty()) {
            if ((map.containsKey("p") && "1".equals(map.get("p"))) || (map.containsKey("push_consent") && "1".equals(map.get("push_consent")))) {
                o.f436b.h(this);
            }
            String str5 = (!map.containsKey("target") || TextUtils.isEmpty(map.get("target"))) ? "https://web.swaraksha.gov.in/ncv19/" : map.get("target");
            if (!TextUtils.isEmpty(str5)) {
                Intent a2 = WebViewActivity.a(str5, (!map.containsKey("pageTitle") || TextUtils.isEmpty(map.get("pageTitle"))) ? str2 : map.get("pageTitle"), this);
                boolean z = true;
                if (map.containsKey("push_consent") && "1".equals(map.get("push_consent"))) {
                    if (!map.containsKey("upload_type") || TextUtils.isEmpty(map.get("upload_type"))) {
                        str = "push_consent";
                    } else {
                        str = map.get("upload_type");
                    }
                    a2.putExtra("upload_type", str);
                    a2.putExtra("push_consent", true);
                }
                PendingIntent activities = PendingIntent.getActivities(this, 0, new Intent[]{a2}, 134217728);
                if (Build.VERSION.SDK_INT >= 26) {
                    o.a aVar2 = o.f436b;
                    str2 = "cor_notification_channel";
                }
                i iVar = new i(this, str2);
                h.h.e.h hVar = new h.h.e.h();
                if (map.containsKey("body")) {
                    charSequence = map.get("body");
                } else {
                    charSequence = l.a;
                }
                hVar.a(charSequence);
                iVar.a((j) hVar);
                if (map.containsKey("title")) {
                    charSequence2 = map.get("title");
                } else {
                    charSequence2 = getResources().getString(R.string.app_name);
                }
                iVar.b(charSequence2);
                if (map.containsKey("body")) {
                    charSequence3 = map.get("body");
                } else {
                    charSequence3 = l.a;
                }
                iVar.a(charSequence3);
                iVar.f1723f = activities;
                iVar.A = "social";
                iVar.C = getResources().getColor(R.color.colorPrimary);
                iVar.a(16, true);
                iVar.O.icon = R.drawable.notification_icon;
                Notification a3 = iVar.a();
                m mVar = new m(this);
                Bundle bundle2 = a3.extras;
                if (bundle2 == null || !bundle2.getBoolean("android.support.useSideChannel")) {
                    z = false;
                }
                if (z) {
                    mVar.a((m.d) new m.a(mVar.a.getPackageName(), 888, (String) null, a3));
                    mVar.f1742b.cancel((String) null, 888);
                    return;
                }
                mVar.f1742b.notify((String) null, 888, a3);
            }
        }
    }
}
