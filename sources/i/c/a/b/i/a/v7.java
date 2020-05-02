package i.c.a.b.i.a;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final /* synthetic */ class v7 implements Runnable {
    public final t7 e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3915f;

    /* renamed from: g  reason: collision with root package name */
    public final Exception f3916g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f3917h;

    /* renamed from: i  reason: collision with root package name */
    public final Map f3918i;

    public v7(t7 t7Var, int i2, Exception exc, byte[] bArr, Map map) {
        this.e = t7Var;
        this.f3915f = i2;
        this.f3916g = exc;
        this.f3917h = bArr;
        this.f3918i = map;
    }

    public final void run() {
        List<ResolveInfo> queryIntentActivities;
        t7 t7Var = this.e;
        int i2 = this.f3915f;
        Exception exc = this.f3916g;
        byte[] bArr = this.f3917h;
        s5 s5Var = t7Var.f3883f.a;
        boolean z = true;
        if (!((i2 == 200 || i2 == 204 || i2 == 304) && exc == null)) {
            s5Var.n().f3761i.a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), exc);
            return;
        }
        s5Var.i().z.a(true);
        if (bArr.length == 0) {
            s5Var.n().f3765m.a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                s5Var.n().f3765m.a("Deferred Deep Link is empty.");
                return;
            }
            ca p2 = s5Var.p();
            p2.a();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = p2.a.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                s5Var.n().f3761i.a("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            s5Var.f3870p.a("auto", "_cmp", bundle);
            ca p3 = s5Var.p();
            if (!TextUtils.isEmpty(optString) && p3.a(optString, optDouble)) {
                p3.a.a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (JSONException e2) {
            s5Var.n().f3758f.a("Failed to parse the Deferred Deep Link response. exception", e2);
        }
    }
}
