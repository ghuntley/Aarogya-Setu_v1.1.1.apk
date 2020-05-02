package nic.goi.aarogyasetu.views;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import b.a.a.a.a.a;
import b.a.a.a.a.b;
import b.a.a.a.a.c;
import b.a.a.a.a1;
import b.a.a.a.c;
import b.a.a.a.l;
import b.a.a.a.m;
import b.a.a.a.n;
import b.a.a.a.o0;
import b.a.a.a.q;
import b.a.a.a.s;
import b.a.a.a.t;
import b.a.a.a.u;
import b.a.a.a.v;
import b.a.a.a.v0;
import b.a.a.l.c0;
import b.a.a.l.e0;
import b.a.a.l.f0;
import b.a.a.l.o;
import b.a.a.l.p;
import b.a.a.l.x;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import com.crashlytics.android.core.SessionProtobufHelper;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;
import h.b.k.g;
import h.b.k.h;
import h.l.d.r;
import i.c.a.d.a.a.d;
import i.c.a.d.a.a.f;
import i.c.a.d.a.c.j;
import i.c.e.e;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Stack;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.R;

public class WebViewActivity extends h implements v0.a, o0.a, c.b, i.c.a.d.a.b.b, a.b, b.C0004b, c.C0005c, e0.a {
    public static final Integer G = Integer.valueOf(AnswersRetryFilesSender.BACKOFF_MS);
    public static final Integer H = 1001;
    public static i.c.a.d.a.a.b I;
    public o0 A;
    public WebView B;
    public View C;
    public final Object D = new a();
    public c E;
    public BroadcastReceiver F = new b();
    public ActionMode u;
    public e0 v;
    public final Stack<String> w = new Stack<>();
    public View x;
    public boolean y;
    public View z;

    public class a {
        public a() {
        }

        @JavascriptInterface
        public String appInstallTimestamp() {
            return b.a.a.k.a.a(WebViewActivity.this.getBaseContext(), "application_install_time", SessionProtobufHelper.SIGNAL_DEFAULT);
        }

        @JavascriptInterface
        public void backPressed() {
            if (WebViewActivity.this.B.canGoBack()) {
                WebViewActivity.this.B.goBack();
            }
        }

        @JavascriptInterface
        public void backToOnBoarding() {
            WebViewActivity.a(WebViewActivity.this);
        }

        @JavascriptInterface
        public String bluetoothOnTime() {
            return b.a.a.k.a.a(WebViewActivity.this.getBaseContext(), "bluetooth_on_time", SessionProtobufHelper.SIGNAL_DEFAULT);
        }

        @JavascriptInterface
        public void changeLanguage() {
            v0.a(WebViewActivity.this.k(), true);
        }

        @JavascriptInterface
        public void copyToClipboard(String str) {
            ClipboardManager clipboardManager = (ClipboardManager) WebViewActivity.this.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText((CharSequence) null, str));
            }
        }

        @JavascriptInterface
        public String getBlLocStatusData() {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("application_install_time", b.a.a.k.a.a(WebViewActivity.this.getBaseContext(), "application_install_time", SessionProtobufHelper.SIGNAL_DEFAULT));
            arrayMap.put("bluetooth_on_time", b.a.a.k.a.a(WebViewActivity.this.getBaseContext(), "bluetooth_on_time", SessionProtobufHelper.SIGNAL_DEFAULT));
            arrayMap.put("location_on_time", b.a.a.k.a.a(WebViewActivity.this.getBaseContext(), "location_on_time", SessionProtobufHelper.SIGNAL_DEFAULT));
            Gson a2 = new e().a();
            System.currentTimeMillis();
            System.currentTimeMillis();
            Long.valueOf(b.a.a.k.a.a(WebViewActivity.this.getBaseContext(), "application_install_time", SessionProtobufHelper.SIGNAL_DEFAULT)).longValue();
            Long.parseLong(b.a.a.k.a.a(WebViewActivity.this.getBaseContext(), "bluetooth_on_time", SessionProtobufHelper.SIGNAL_DEFAULT));
            Long.parseLong(b.a.a.k.a.a(WebViewActivity.this.getBaseContext(), "location_on_time", SessionProtobufHelper.SIGNAL_DEFAULT));
            a2.a((Object) arrayMap);
            return a2.a((Object) arrayMap);
        }

        @JavascriptInterface
        public String getHeaders() {
            Map<String, String> a2 = o.f436b.a(false);
            Location b2 = CoronaApplication.f5224g.b();
            if (b2 != null) {
                HashMap hashMap = (HashMap) a2;
                hashMap.put("lat", String.valueOf(b2.getLatitude()));
                hashMap.put("lon", String.valueOf(b2.getLongitude()));
            }
            return new e().a().a((Object) a2);
        }

        @JavascriptInterface
        public void hideLoader() {
            View view = WebViewActivity.this.z;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        @JavascriptInterface
        public String locationOnTime() {
            return b.a.a.k.a.a(WebViewActivity.this.getBaseContext(), "location_on_time", SessionProtobufHelper.SIGNAL_DEFAULT);
        }

        @JavascriptInterface
        public void payUsingUpi(String str, String str2, String str3, String str4) {
            WebViewActivity.a(WebViewActivity.this, str, str2, str3, str4);
            b.a.a.l.b.a("upiClicked", "webView");
        }

        @JavascriptInterface
        public void shareApp() {
            String c = o.f436b.c(WebViewActivity.this);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", c);
            WebViewActivity.this.startActivity(Intent.createChooser(intent, ""));
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", RecyclerView.UNDEFINED_DURATION);
                if (intExtra == 10) {
                    WebViewActivity.this.t();
                } else if (intExtra == 12) {
                    WebViewActivity.this.r();
                }
            }
        }
    }

    public class c extends WebChromeClient {
        public WebChromeClient.CustomViewCallback a;

        /* renamed from: b  reason: collision with root package name */
        public int f5250b;
        public int c;
        public View d;

        public /* synthetic */ c(a aVar) {
        }

        public void onHideCustomView() {
            ((FrameLayout) WebViewActivity.this.getWindow().getDecorView()).removeView(this.d);
            this.d = null;
            WebViewActivity.this.getWindow().getDecorView().setSystemUiVisibility(this.c);
            WebViewActivity.this.setRequestedOrientation(this.f5250b);
            this.a.onCustomViewHidden();
            this.a = null;
        }

        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.d != null) {
                onHideCustomView();
                return;
            }
            this.d = view;
            this.c = WebViewActivity.this.getWindow().getDecorView().getSystemUiVisibility();
            this.f5250b = WebViewActivity.this.getRequestedOrientation();
            this.a = customViewCallback;
            ((FrameLayout) WebViewActivity.this.getWindow().getDecorView()).addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            WebViewActivity.this.getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }

    static {
        Class<WebViewActivity> cls = WebViewActivity.class;
    }

    public static /* synthetic */ n.h a(Boolean bool) {
        return null;
    }

    public /* synthetic */ void a(i.c.a.d.a.a.a aVar) {
        if (aVar.a == 2) {
            boolean z2 = o.a;
            if (!z2) {
                ((d) I).a(aVar, 0, this, 1734);
            } else if (z2) {
                try {
                    ((d) I).a(aVar, 1, this, 1736);
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        }
    }

    public /* synthetic */ void b(i.c.a.d.a.a.a aVar) {
        if (aVar.a == 3 && aVar.a(1)) {
            try {
                if (o.a) {
                    ((d) I).a(aVar, 1, this, 1736);
                }
            } catch (IntentSender.SendIntentException unused) {
            }
        }
    }

    public String f(String str) {
        URL url = new URL(str);
        String query = url.getQuery();
        HashMap hashMap = new HashMap();
        String str2 = "";
        if (!TextUtils.isEmpty(query)) {
            for (String split : query.split("&")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    hashMap.put(split2[0], split2.length > 1 ? split2[1] : str2);
                }
            }
        }
        if (hashMap.containsKey("locale")) {
            hashMap.put("locale", b.a.a.k.a.a((Context) CoronaApplication.f5224g, "USER_SELECTED_LANGUAGE_CODE", "en"));
            hashMap.put("lang", b.a.a.k.a.a((Context) CoronaApplication.f5224g, "USER_SELECTED_LANGUAGE_CODE", "en"));
        }
        if (hashMap.containsKey("lang")) {
            hashMap.put("locale", b.a.a.k.a.a((Context) CoronaApplication.f5224g, "USER_SELECTED_LANGUAGE_CODE", "en"));
            hashMap.put("lang", b.a.a.k.a.a((Context) CoronaApplication.f5224g, "USER_SELECTED_LANGUAGE_CODE", "en"));
        }
        if (hashMap.keySet().size() > 0) {
            StringBuilder sb = new StringBuilder("?");
            for (String str3 : hashMap.keySet()) {
                sb.append(str3);
                sb.append("=");
                sb.append((String) hashMap.get(str3));
                sb.append("&");
            }
            str2 = sb.toString().substring(0, sb.toString().length() - 1);
        }
        return url.getProtocol() + "://" + url.getHost() + url.getPath() + str2;
    }

    public final void g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("Authorization", b.a.a.l.h.b());
        hashMap.put("ver", String.valueOf(1045));
        hashMap.put("pt", "9cf23ec2-d83c-4778-aca5-d7fb64ae1b2d");
        hashMap.put("did", b.a.a.k.a.a((Context) CoronaApplication.f5224g, "unique_id", ""));
        this.B.loadUrl(str, hashMap);
    }

    public final void h(String str) {
        o0 o0Var = new o0();
        this.A = o0Var;
        o0Var.d(false);
        this.A.o0 = str;
        r k2 = k();
        if (k2 != null) {
            h.l.d.a aVar = new h.l.d.a(k2);
            o0 o0Var2 = this.A;
            aVar.a(0, o0Var2, o0Var2.B, 1);
            aVar.a();
            return;
        }
        throw null;
    }

    public void i() {
    }

    public final void i(String str) {
        if (((b.a.a.a.a.b) k().b("sync_data_consent_dialog")) == null) {
            b.a.a.a.a.b a2 = b.a.a.a.a.b.a(str);
            a2.d(false);
            r k2 = k();
            if (k2 != null) {
                h.l.d.a aVar = new h.l.d.a(k2);
                aVar.a(0, a2, "sync_data_consent_dialog", 1);
                aVar.a();
                return;
            }
            throw null;
        }
    }

    public final void j(String str) {
        e0 e0Var = new e0(str, this);
        this.v = e0Var;
        x.a().execute(new f0(e0Var));
    }

    public final void o() {
        d dVar = new d(new f(this), this);
        I = dVar;
        dVar.a(this);
        i.c.a.d.a.e.h<i.c.a.d.a.a.a> a2 = ((d) I).a();
        b.a.a.a.h hVar = new b.a.a.a.h(this);
        if (a2 != null) {
            a2.f4320b.a(new i.c.a.d.a.e.c(i.c.a.d.a.e.b.a, hVar));
            a2.a();
            return;
        }
        throw null;
    }

    public void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        this.u = null;
    }

    public void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.u = actionMode;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            super.onActivityResult(r10, r11, r12)
            java.lang.Integer r0 = G
            int r0 = r0.intValue()
            r1 = 0
            if (r10 != r0) goto L_0x004b
            b.a.a.a.o0 r10 = r9.A
            if (r10 == 0) goto L_0x010b
            boolean r10 = r10.t()
            if (r10 == 0) goto L_0x010b
            b.a.a.a.o0 r10 = r9.A
            boolean r10 = r10.D
            if (r10 != 0) goto L_0x010b
            boolean r10 = b.a.a.l.o.b(r9)
            if (r10 == 0) goto L_0x010b
            b.a.a.a.o0 r10 = r9.A
            r10.a((boolean) r1, (boolean) r1)
            b.a.a.a.o0 r10 = r9.A
            java.lang.String r10 = r10.o0
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x010b
            b.a.a.a.o0 r10 = r9.A
            java.lang.String r10 = r10.o0
            boolean r11 = b.a.a.l.o.b(r9)
            if (r11 == 0) goto L_0x0046
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x010b
            r9.g(r10)
            goto L_0x010b
        L_0x0046:
            r9.h(r10)
            goto L_0x010b
        L_0x004b:
            java.lang.Integer r0 = H
            int r0 = r0.intValue()
            if (r10 != r0) goto L_0x0104
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r0 = -1
            if (r0 == r11) goto L_0x005f
            r0 = 11
            if (r11 != r0) goto L_0x006b
        L_0x005f:
            if (r12 == 0) goto L_0x006b
            java.lang.String r11 = "response"
            java.lang.String r11 = r12.getStringExtra(r11)
            r10.add(r11)
            goto L_0x0070
        L_0x006b:
            java.lang.String r11 = "nothing"
            r10.add(r11)
        L_0x0070:
            java.lang.String r11 = "="
            boolean r12 = b.a.a.l.o.b(r9)     // Catch:{ Exception -> 0x00ff }
            if (r12 == 0) goto L_0x010b
            java.lang.String r12 = "discard"
            int r0 = r10.size()     // Catch:{ Exception -> 0x00ff }
            if (r0 <= 0) goto L_0x0087
            java.lang.Object r10 = r10.get(r1)     // Catch:{ Exception -> 0x00ff }
            r12 = r10
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x00ff }
        L_0x0087:
            if (r12 == 0) goto L_0x00f5
            boolean r10 = r12.isEmpty()     // Catch:{ Exception -> 0x00ff }
            if (r10 != 0) goto L_0x00f5
            java.lang.String r10 = "&"
            java.lang.String[] r10 = r12.split(r10)     // Catch:{ Exception -> 0x00ff }
            int r12 = r10.length     // Catch:{ Exception -> 0x00ff }
            java.lang.String r0 = ""
            r3 = r0
            r4 = r3
            r2 = 0
        L_0x009b:
            java.lang.String r5 = "Payment cancelled by user."
            if (r2 >= r12) goto L_0x00cb
            r6 = r10[r2]     // Catch:{ Exception -> 0x00ff }
            boolean r7 = r6.contains(r11)     // Catch:{ Exception -> 0x00ff }
            if (r7 == 0) goto L_0x00c8
            java.lang.String r7 = "[\\s]"
            java.lang.String r6 = r6.replaceAll(r7, r0)     // Catch:{ Exception -> 0x00ff }
            java.lang.String[] r6 = r6.split(r11)     // Catch:{ Exception -> 0x00ff }
            int r7 = r6.length     // Catch:{ Exception -> 0x00ff }
            r8 = 2
            if (r7 < r8) goto L_0x00c7
            r5 = r6[r1]     // Catch:{ Exception -> 0x00ff }
            java.lang.String r7 = "Status"
            boolean r5 = r5.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x00ff }
            if (r5 == 0) goto L_0x00c8
            r3 = 1
            r3 = r6[r3]     // Catch:{ Exception -> 0x00ff }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Exception -> 0x00ff }
            goto L_0x00c8
        L_0x00c7:
            r4 = r5
        L_0x00c8:
            int r2 = r2 + 1
            goto L_0x009b
        L_0x00cb:
            java.lang.String r10 = "success"
            boolean r10 = r3.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x00ff }
            if (r10 == 0) goto L_0x00dd
            java.lang.String r10 = "Transaction successful."
            android.widget.Toast r10 = android.widget.Toast.makeText(r9, r10, r1)     // Catch:{ Exception -> 0x00ff }
            r10.show()     // Catch:{ Exception -> 0x00ff }
            goto L_0x010b
        L_0x00dd:
            boolean r10 = r5.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x00ff }
            if (r10 == 0) goto L_0x00eb
            android.widget.Toast r10 = android.widget.Toast.makeText(r9, r5, r1)     // Catch:{ Exception -> 0x00ff }
            r10.show()     // Catch:{ Exception -> 0x00ff }
            goto L_0x010b
        L_0x00eb:
            java.lang.String r10 = "Transaction failed. Please try again"
            android.widget.Toast r10 = android.widget.Toast.makeText(r9, r10, r1)     // Catch:{ Exception -> 0x00ff }
            r10.show()     // Catch:{ Exception -> 0x00ff }
            goto L_0x010b
        L_0x00f5:
            java.lang.String r10 = "Internet connection is not available. Please check and try again"
            android.widget.Toast r10 = android.widget.Toast.makeText(r9, r10, r1)     // Catch:{ Exception -> 0x00ff }
            r10.show()     // Catch:{ Exception -> 0x00ff }
            goto L_0x010b
        L_0x00ff:
            r10 = move-exception
            i.c.d.p.e.a((java.lang.Exception) r10)
            goto L_0x010b
        L_0x0104:
            r11 = 1736(0x6c8, float:2.433E-42)
            if (r10 != r11) goto L_0x010b
            r9.finish()
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nic.goi.aarogyasetu.views.WebViewActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView((int) R.layout.activity_web_view);
            o();
            this.B = (WebView) findViewById(R.id.webView);
            View findViewById = findViewById(R.id.progress_bar);
            this.z = findViewById;
            findViewById.setVisibility(0);
            this.x = findViewById(R.id.back);
            findViewById(R.id.language_change).setOnClickListener(new b.a.a.a.r(this));
            this.x.setOnClickListener(new s(this));
            registerReceiver(this.F, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            findViewById(R.id.share).setOnClickListener(new q(this));
            View findViewById2 = findViewById(R.id.sync_data);
            this.C = findViewById2;
            findViewById2.setOnClickListener(new v(this));
            this.y = getIntent().getBooleanExtra("do_not_show_back", false);
            this.B.getSettings().setJavaScriptEnabled(true);
            this.B.getSettings().setDomStorageEnabled(true);
            this.B.addJavascriptInterface(this.D, "JSMobileCrm");
            c cVar = new c((a) null);
            this.E = cVar;
            this.B.setWebChromeClient(cVar);
            this.B.setWebViewClient(new a1(this));
            if (!o.b(this)) {
                h(p());
            } else {
                g(p());
            }
            if (getIntent().getBooleanExtra("need_permissions", false)) {
                if (!o.f436b.a((Context) this)) {
                    o.f436b.a((Activity) this, 642);
                } else if (!o.a(this)) {
                    new c0(this).a(p.a);
                }
            }
            b.a.a.l.b.a("webviewScreen", (Bundle) null, 2);
            o.f436b.a((Activity) this);
            if (!b.a.a.h.a.b().a().a("upload_enable") || b.a.a.k.a.a(getBaseContext()).getBoolean("p", false) || !b.a.a.l.h.c.a()) {
                this.C.setVisibility(8);
            }
            if (getIntent() != null && getIntent().hasExtra("push_consent") && getIntent().hasExtra("upload_type")) {
                i(getIntent().getStringExtra("upload_type"));
            }
            if (!b.a.a.k.a.a(this).contains("application_install_time")) {
                b.a.a.k.a.b(this, "application_install_time", String.valueOf(System.currentTimeMillis()));
            }
            CoronaApplication.f5224g.e();
            CoronaApplication.f5224g.f();
        } catch (Exception e) {
            if (e.getMessage() != null && e.getMessage().contains("webview")) {
                Toast.makeText(getApplicationContext(), "WebView issue on your device", 1).show();
            }
            this.F = null;
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.F;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        try {
            if (I != null) {
                ((d) I).b(this);
            }
        } catch (Exception unused) {
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i2 != 4) {
            return super.onKeyDown(i2, keyEvent);
        }
        q();
        return true;
    }

    public void onPause() {
        super.onPause();
        ActionMode actionMode = this.u;
        if (actionMode != null) {
            actionMode.finish();
        }
        r();
    }

    public void onResume() {
        super.onResume();
        if (o.f436b.a((Context) this)) {
            t();
        } else {
            g.a aVar = new g.a(this);
            String a2 = i.c.d.p.e.a((Context) this, (int) R.string.permission_alert_message);
            AlertController.b bVar = aVar.a;
            bVar.f57h = a2;
            bVar.f62m = false;
            b.a.a.a.o oVar = new b.a.a.a.o(this);
            AlertController.b bVar2 = aVar.a;
            bVar2.f58i = "Open settings";
            bVar2.f59j = oVar;
            n nVar = n.e;
            bVar2.f60k = "Remind later";
            bVar2.f61l = nVar;
            g a3 = aVar.a();
            if (!isFinishing()) {
                a3.show();
            }
        }
        if (o.a) {
            i.c.a.d.a.e.h<i.c.a.d.a.a.a> a4 = ((d) I).a();
            l lVar = new l(this);
            if (a4 != null) {
                a4.f4320b.a(new i.c.a.d.a.e.c(i.c.a.d.a.e.b.a, lVar));
                a4.a();
                return;
            }
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        if (!o.a(this)) {
            o.f436b.a((Context) this, (n.m.b.b<? super Boolean, n.h>) m.e);
        }
    }

    public final String p() {
        String str;
        if (getIntent().getData() != null) {
            Uri data = getIntent().getData();
            StringBuilder a2 = i.a.a.a.a.a("");
            a2.append(data.getScheme());
            a2.append("://");
            a2.append(data.getHost());
            a2.append(data.getPath());
            str = a2.toString();
        } else {
            str = getIntent().getStringExtra("URL");
        }
        StringBuilder a3 = i.a.a.a.a.a(str, "?locale=");
        a3.append(b.a.a.k.a.a((Context) CoronaApplication.f5224g, "USER_SELECTED_LANGUAGE_CODE", "en"));
        return a3.toString();
    }

    public final void q() {
        boolean z2;
        c cVar = this.E;
        if (cVar != null) {
            if (cVar.d != null) {
                cVar.onHideCustomView();
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return;
            }
        }
        if (!this.w.isEmpty()) {
            this.w.pop();
        }
        if (this.w.isEmpty()) {
            finish();
            return;
        }
        try {
            g(f(this.w.peek()));
        } catch (MalformedURLException unused) {
            g(this.w.peek());
        }
    }

    public final void r() {
        Fragment b2 = k().b("frag_no_bt_dialog");
        if (b2 != null) {
            r k2 = k();
            if (k2 != null) {
                h.l.d.a aVar = new h.l.d.a(k2);
                aVar.a(b2);
                aVar.a();
                return;
            }
            throw null;
        }
    }

    public /* synthetic */ void s() {
        if (!isFinishing() && !o.b()) {
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 123);
        }
    }

    public final void t() {
        if (!o.b() && ((b.a.a.a.c) k().b("frag_no_bt_dialog")) == null) {
            b.a.a.a.c cVar = new b.a.a.a.c();
            cVar.d(false);
            r k2 = k();
            if (k2 != null) {
                h.l.d.a aVar = new h.l.d.a(k2);
                aVar.a(0, cVar, "frag_no_bt_dialog", 1);
                aVar.a();
                return;
            }
            throw null;
        }
    }

    public /* synthetic */ void c(View view) {
        o();
    }

    public /* synthetic */ void d(View view) {
        v0.a(k(), true);
    }

    public /* synthetic */ void e(View view) {
        q();
    }

    public void c(String str) {
        i(str);
    }

    public void d() {
        o.a();
        new Handler().postDelayed(new t(this), 2000);
    }

    public void e(String str) {
        a(c.b.SYNCING, str);
        j(str);
    }

    public static /* synthetic */ boolean b(WebViewActivity webViewActivity) {
        if (webViewActivity != null) {
            try {
                b.a.a.l.h.c();
                return true;
            } catch (IOException unused) {
                return false;
            }
        } else {
            throw null;
        }
    }

    public /* synthetic */ void a(View view) {
        String c2 = o.f436b.c(this);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", c2);
        startActivity(Intent.createChooser(intent, ""));
        b.a.a.l.b.a("shareClicked", "webView");
    }

    public void d(String str) {
        a(c.b.FAILURE, str);
        this.v = null;
    }

    public void e() {
        a(c.b.SUCCESS, (String) null);
        this.v = null;
    }

    public /* synthetic */ void b(View view) {
        d dVar = (d) I;
        f fVar = dVar.a;
        String packageName = dVar.c.getPackageName();
        if (fVar != null) {
            f.d.a(4, "completeUpdate(%s)", new Object[]{packageName});
            i.c.a.d.a.e.g gVar = new i.c.a.d.a.e.g();
            j<i.c.a.d.a.c.e> jVar = fVar.a;
            i.c.a.d.a.a.g gVar2 = new i.c.a.d.a.a.g(fVar, gVar, gVar, packageName);
            if (jVar != null) {
                jVar.a().post(new i.c.a.d.a.c.l(jVar, gVar2));
                ((d) I).b(this);
                I = null;
                return;
            }
            throw null;
        }
        throw null;
    }

    public void g() {
        if (!this.w.isEmpty()) {
            try {
                g(f(this.w.pop()));
            } catch (MalformedURLException unused) {
            }
        }
    }

    public void a(Object obj) {
        int i2 = ((i.c.a.d.a.b.a) obj).a;
        if (i2 == 11) {
            Snackbar a2 = Snackbar.a(this.B, "Please restart to update", -2);
            a2.a(R.string.restart, new b.a.a.a.p(this));
            a2.f();
        } else if (i2 == 5) {
            Snackbar a3 = Snackbar.a(this.B, "Error while downloading.Please update from Play Store.", -2);
            a3.a(R.string.message_failed_tap_to_retry, new u(this));
            a3.f();
        }
    }

    public static /* synthetic */ void a(WebViewActivity webViewActivity) {
        if (webViewActivity != null) {
            Intent intent = new Intent(webViewActivity, OnboardingActivity.class);
            intent.putExtra("finishbutton", true);
            webViewActivity.startActivity(intent);
            return;
        }
        throw null;
    }

    public void b(String str) {
        a(c.b.SYNCING, str);
        j(str);
    }

    public static Intent a(String str, String str2, Context context) {
        Intent intent = new Intent(context, WebViewActivity.class);
        intent.putExtra("URL", str);
        intent.putExtra("TITLE", str2);
        return intent;
    }

    public void a(String str) {
        if (!o.b(this)) {
            h(str);
        } else if (!TextUtils.isEmpty(str)) {
            g(str);
        }
    }

    public /* synthetic */ void f(View view) {
        if (b.a.a.h.a.b().a().a("disable_sync_choice")) {
            i("self_consent");
        } else if (((b.a.a.a.a.a) k().b("sync_data_dialog")) == null) {
            b.a.a.a.a.a aVar = new b.a.a.a.a.a();
            aVar.d(false);
            r k2 = k();
            if (k2 != null) {
                h.l.d.a aVar2 = new h.l.d.a(k2);
                aVar2.a(0, aVar, "sync_data_dialog", 1);
                aVar2.a();
            } else {
                throw null;
            }
        }
        b.a.a.l.b.a("uploadConsentScreen", "webviewScreen");
    }

    public static /* synthetic */ void a(WebViewActivity webViewActivity, String str, String str2, String str3, String str4) {
        if (webViewActivity != null) {
            Uri.Builder appendQueryParameter = Uri.parse("upi://pay").buildUpon().appendQueryParameter("pa", str2).appendQueryParameter("pn", str3).appendQueryParameter("tn", str4);
            int nextInt = new Random().nextInt(999999);
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("tr", String.format(Locale.getDefault(), "%06d", new Object[]{Integer.valueOf(nextInt)}));
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            Uri build = appendQueryParameter2.appendQueryParameter("am", str).appendQueryParameter("cu", "INR").build();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(build);
            Intent createChooser = Intent.createChooser(intent, "Pay with");
            if (createChooser.resolveActivity(webViewActivity.getPackageManager()) != null) {
                webViewActivity.startActivityForResult(createChooser, H.intValue());
            } else {
                Toast.makeText(webViewActivity, "No UPI app found, please install one to continue", 0).show();
            }
        } else {
            throw null;
        }
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), (String) null));
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    public final void a(c.b bVar, String str) {
        b.a.a.a.a.c cVar = (b.a.a.a.a.c) k().b("syncing_dialog");
        if (cVar != null) {
            cVar.H();
        }
        b.a.a.a.a.c a2 = b.a.a.a.a.c.a(bVar, str);
        a2.d(false);
        r k2 = k();
        if (k2 != null) {
            h.l.d.a aVar = new h.l.d.a(k2);
            aVar.a(0, a2, "syncing_dialog", 1);
            aVar.a();
            return;
        }
        throw null;
    }
}
