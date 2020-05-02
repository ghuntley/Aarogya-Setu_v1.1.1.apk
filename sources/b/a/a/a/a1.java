package b.a.a.a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import b.a.a.l.c;
import b.a.a.l.o;
import b.a.a.l.x;
import i.c.d.p.e;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import n.h;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.views.WebViewActivity;

/* compiled from: WebViewActivity */
public class a1 extends WebViewClient {
    public final /* synthetic */ WebViewActivity a;

    public a1(WebViewActivity webViewActivity) {
        this.a = webViewActivity;
    }

    public /* synthetic */ h a() {
        try {
            this.a.z.setVisibility(8);
            this.a.g(this.a.p());
            return null;
        } catch (Exception e) {
            e.a(e);
            return null;
        }
    }

    public /* synthetic */ h b() {
        if (this.a.isFinishing()) {
            return null;
        }
        this.a.z.setVisibility(8);
        return null;
    }

    public /* synthetic */ void c() {
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= 3) {
                break;
            }
            try {
                if (WebViewActivity.b(this.a)) {
                    z = true;
                    break;
                }
                i2++;
            } catch (IOException unused) {
                b.a.a.l.h.a((Context) CoronaApplication.f5224g, true);
                c.c.a(new i(this));
                return;
            }
        }
        if (z) {
            c.c.a(new k(this));
            return;
        }
        throw new IOException();
    }

    public void onPageFinished(WebView webView, String str) {
        this.a.z.setVisibility(8);
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        boolean z;
        if (str.startsWith("tel:")) {
            this.a.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
        } else if (!str.startsWith("http:") && !str.startsWith("https:")) {
        } else {
            if (!o.b(this.a)) {
                this.a.h(str);
                return;
            }
            this.a.z.setVisibility(0);
            this.a.B.clearHistory();
            WebViewActivity webViewActivity = this.a;
            if (webViewActivity != null) {
                try {
                    if (webViewActivity.w.isEmpty()) {
                        z = false;
                    } else {
                        URL url = new URL(str);
                        URL url2 = new URL(webViewActivity.w.peek());
                        z = (url.getProtocol() + "://" + url.getHost() + url.getPath()).equalsIgnoreCase(url2.getProtocol() + "://" + url2.getHost() + url2.getPath());
                    }
                } catch (MalformedURLException unused) {
                    z = true;
                }
                if (!z) {
                    this.a.w.push(str);
                }
                super.onPageStarted(webView, str, bitmap);
                if (this.a.w.isEmpty() || (this.a.w.size() == 1 && this.a.y)) {
                    this.a.x.setVisibility(8);
                } else {
                    this.a.x.setVisibility(0);
                }
            } else {
                throw null;
            }
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceResponse.getStatusCode() == 401) {
            this.a.z.setVisibility(0);
            x.a().execute(new j(this));
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("tel:")) {
            try {
                this.a.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            } catch (ActivityNotFoundException unused) {
            }
        } else {
            boolean equals = "web.swaraksha.gov.in".equals(Uri.parse(str).getHost());
            if (!o.b(this.a)) {
                WebViewActivity webViewActivity = this.a;
                if (!equals) {
                    str = "";
                }
                webViewActivity.h(str);
                this.a.z.setVisibility(8);
            } else if (equals) {
                return false;
            } else {
                this.a.z.setVisibility(8);
                try {
                    this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Exception unused2) {
                    if (!this.a.isFinishing()) {
                        Toast.makeText(this.a, "Select any other app to open this url", 1).show();
                    }
                }
                return true;
            }
        }
        this.a.z.setVisibility(8);
        return true;
    }
}
