package nic.goi.aarogyasetu.views;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import b.a.a.a.h0;
import b.a.a.a.j0;
import b.a.a.a.m0;
import b.a.a.a.n0;
import b.a.a.a.v0;
import b.a.a.e;
import b.a.a.l.o;
import b.a.a.l.q;
import b.a.a.l.u;
import h.b.k.g;
import h.b.k.h;
import h.l.d.r;
import h.o.a0;
import h.o.b0;
import java.util.HashMap;
import n.m.c.f;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.R;
import nic.goi.aarogyasetu.background.BluetoothScanningService;

/* compiled from: MainActivity.kt */
public final class MainActivity extends h implements v0.a {
    public g u;
    public b.a.a.m.b v;
    public HashMap w;

    /* compiled from: java-style lambda group */
    public static final class a implements View.OnClickListener {
        public final /* synthetic */ int e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f5249f;

        public a(int i2, Object obj) {
            this.e = i2;
            this.f5249f = obj;
        }

        public final void onClick(View view) {
            int i2 = this.e;
            if (i2 == 0) {
                v0.a(((MainActivity) this.f5249f).k(), true);
            } else if (i2 == 1) {
                MainActivity.d((MainActivity) this.f5249f);
            } else {
                throw null;
            }
        }
    }

    /* compiled from: MainActivity.kt */
    public interface b {
        void a();

        void b();
    }

    /* compiled from: MainActivity.kt */
    public static final class c extends n.m.c.g implements n.m.b.b<Boolean, n.h> {
        public final /* synthetic */ MainActivity e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(MainActivity mainActivity) {
            super(1);
            this.e = mainActivity;
        }

        public Object a(Object obj) {
            ((Boolean) obj).booleanValue();
            if (this.e.p()) {
                this.e.q();
            }
            return n.h.a;
        }
    }

    /* compiled from: MainActivity.kt */
    public static final class d implements DialogInterface.OnClickListener {
        public final /* synthetic */ MainActivity e;

        public d(MainActivity mainActivity) {
            this.e = mainActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            MainActivity.c(this.e);
        }
    }

    public static final /* synthetic */ void c(MainActivity mainActivity) {
        if (mainActivity != null) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", mainActivity.getPackageName(), (String) null));
            try {
                mainActivity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
            }
        } else {
            throw null;
        }
    }

    public static final /* synthetic */ void d(MainActivity mainActivity) {
        if (mainActivity != null) {
            String c2 = o.f436b.c(mainActivity);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", c2);
            mainActivity.startActivity(Intent.createChooser(intent, ""));
            b.a.a.l.b.a("shareClicked", "permissionScreen", (String) null, (Bundle) null, 12);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void f(MainActivity mainActivity) {
        if (mainActivity == null) {
            throw null;
        } else if (o.f436b.a((Context) mainActivity)) {
            String a2 = b.a.a.k.a.a((Context) CoronaApplication.f5224g, "unique_id", "");
            f.a((Object) a2, "uniqueId");
            if ((a2.length() > 0) && !mainActivity.isFinishing()) {
                Intent intent = new Intent(mainActivity, BluetoothScanningService.class);
                if (Build.VERSION.SDK_INT >= 26) {
                    mainActivity.startForegroundService(intent);
                } else {
                    mainActivity.startService(intent);
                }
            }
            o.f436b.c();
            Intent a3 = WebViewActivity.a("https://web.swaraksha.gov.in/ncv19/", "", mainActivity);
            a3.putExtra("need_permissions", true);
            a3.putExtra("do_not_show_back", true);
            mainActivity.startActivity(a3);
            mainActivity.finish();
        } else {
            mainActivity.r();
        }
    }

    public View c(int i2) {
        if (this.w == null) {
            this.w = new HashMap();
        }
        View view = (View) this.w.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.w.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public void g() {
        finish();
        startActivity(getIntent());
    }

    public final void o() {
        if (!o.f436b.a((Context) this)) {
            o.f436b.a((Activity) this, 642);
        } else if (!o.f436b.e(this)) {
            o.f436b.a((Context) this, (n.m.b.b<? super Boolean, n.h>) new c(this));
        } else if (p()) {
            q();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 123) {
            o();
        } else if (i2 == 1245) {
            o();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        a0 a2 = new b0(this).a(b.a.a.m.b.class);
        f.a((Object) a2, "ViewModelProvider(this).…ingViewModel::class.java)");
        this.v = (b.a.a.m.b) a2;
        View findViewById = findViewById(R.id.language_change);
        View findViewById2 = findViewById(R.id.share);
        findViewById.setOnClickListener(new a(0, this));
        findViewById2.setOnClickListener(new a(1, this));
        TextView textView = (TextView) c(e.tv_permissions_title);
        f.a((Object) textView, "tv_permissions_title");
        textView.setText(i.c.d.p.e.a((Context) this, (int) R.string.permissions_title));
        TextView textView2 = (TextView) c(e.tv_permissions_detail);
        f.a((Object) textView2, "tv_permissions_detail");
        textView2.setText(i.c.d.p.e.a((Context) this, (int) R.string.permissions_detail));
        TextView textView3 = (TextView) c(e.tv_device_location);
        f.a((Object) textView3, "tv_device_location");
        textView3.setText(g.a.a.b.a.a(i.c.d.p.e.a((Context) this, (int) R.string.device_location), 63));
        TextView textView4 = (TextView) c(e.tv_location_text);
        f.a((Object) textView4, "tv_location_text");
        textView4.setText(i.c.d.p.e.a((Context) this, (int) R.string.location_text));
        TextView textView5 = (TextView) c(e.tv_bluetooth);
        f.a((Object) textView5, "tv_bluetooth");
        textView5.setText(g.a.a.b.a.a(i.c.d.p.e.a((Context) this, (int) R.string.bluetooth), 63));
        TextView textView6 = (TextView) c(e.tv_bluetooth_text);
        f.a((Object) textView6, "tv_bluetooth_text");
        textView6.setText(i.c.d.p.e.a((Context) this, (int) R.string.monitors_your_device_s_proximity_within_6_feet_range));
        TextView textView7 = (TextView) c(e.tv_data_sharing);
        f.a((Object) textView7, "tv_data_sharing");
        textView7.setText(g.a.a.b.a.a(i.c.d.p.e.a((Context) this, (int) R.string.data_sharing_with_the_ministry), 63));
        TextView textView8 = (TextView) c(e.tv_data_sharing_text);
        f.a((Object) textView8, "tv_data_sharing_text");
        textView8.setText(i.c.d.p.e.a((Context) this, (int) R.string.tracks_an_individual_s_touch_points_so_can_easily_find_others_who_came_in_close_contact));
        Spanned a3 = g.a.a.b.a.a(i.c.d.p.e.a((Context) this, (int) R.string.permission_info_tnc_text), 63);
        f.a((Object) a3, "HtmlCompat.fromHtml(\n   …ML_MODE_COMPACT\n        )");
        o.a aVar = o.f436b;
        TextView textView9 = (TextView) c(e.tv_tnc_text);
        f.a((Object) textView9, "tv_tnc_text");
        h0 h0Var = new h0(this);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a3);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, a3.length(), URLSpan.class);
        f.a((Object) uRLSpanArr, "urls");
        for (URLSpan uRLSpan : uRLSpanArr) {
            o.a aVar2 = o.f436b;
            f.a((Object) uRLSpan, "it");
            spannableStringBuilder.setSpan(new q(h0Var, uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        b.a.a.l.c.c.a(new u(textView9, spannableStringBuilder));
        if (BluetoothScanningService.f5231p) {
            Button button = (Button) c(e.btn_start);
            f.a((Object) button, "btn_start");
            button.setText(i.c.d.p.e.a((Context) this, (int) R.string.sharing));
        } else {
            Button button2 = (Button) c(e.btn_start);
            f.a((Object) button2, "btn_start");
            button2.setText(i.c.d.p.e.a((Context) this, (int) R.string.contribute_to_a_safer_india));
        }
        b.a.a.m.b bVar = this.v;
        if (bVar != null) {
            bVar.e.a(this, new j0(this));
            b.a.a.m.b bVar2 = this.v;
            if (bVar2 != null) {
                bVar2.c.a(this, new m0(this));
                b.a.a.m.b bVar3 = this.v;
                if (bVar3 != null) {
                    bVar3.d.a(this, new n0(this));
                    o.a aVar3 = o.f436b;
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (defaultAdapter != null && !defaultAdapter.isEnabled()) {
                        defaultAdapter.enable();
                    }
                    b.a.a.l.b.a("permissionScreen", (Bundle) null, 2);
                    return;
                }
                f.b("onBoardingViewModel");
                throw null;
            }
            f.b("onBoardingViewModel");
            throw null;
        }
        f.b("onBoardingViewModel");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        g gVar = this.u;
        if (gVar == null) {
            return;
        }
        if (gVar == null) {
            f.a();
            throw null;
        } else if (gVar.isShowing()) {
            g gVar2 = this.u;
            if (gVar2 != null) {
                gVar2.dismiss();
            } else {
                f.a();
                throw null;
            }
        }
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (strArr == null) {
            f.a("permissions");
            throw null;
        } else if (iArr != null) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
            boolean z = true;
            if (!(iArr.length == 0)) {
                int length = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    String str = strArr[i3];
                    if (iArr[i3] != -1) {
                        i3++;
                    } else if (!shouldShowRequestPermissionRationale(str)) {
                        r();
                    }
                }
            }
            z = false;
            if (z) {
                o();
            }
        } else {
            f.a("grantResults");
            throw null;
        }
    }

    public final boolean p() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            Toast.makeText(CoronaApplication.f5224g, "No Bluetooth on this handset", 0).show();
            return true;
        } else if (!defaultAdapter.isEnabled()) {
            try {
                startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 123);
            } catch (Exception unused) {
            }
            return false;
        } else if (defaultAdapter.getScanMode() == 23) {
            return true;
        } else {
            try {
                Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_DISCOVERABLE");
                intent.putExtra("android.bluetooth.adapter.extra.DISCOVERABLE_DURATION", 300000);
                startActivityForResult(intent, 123);
            } catch (Exception unused2) {
            }
            return false;
        }
    }

    public final void q() {
        CoronaApplication.h();
        b.a.a.a.b0 b0Var = new b.a.a.a.b0();
        b0Var.d(false);
        r k2 = k();
        if (k2 != null) {
            h.l.d.a aVar = new h.l.d.a(k2);
            f.a((Object) aVar, "supportFragmentManager.beginTransaction()");
            aVar.a(0, b0Var, "LOGIN", 1);
            aVar.a();
            return;
        }
        throw null;
    }

    public final void r() {
        g gVar;
        g.a aVar = new g.a(this);
        String a2 = i.c.d.p.e.a((Context) this, (int) R.string.permission_alert_message);
        AlertController.b bVar = aVar.a;
        bVar.f57h = a2;
        bVar.f62m = false;
        d dVar = new d(this);
        AlertController.b bVar2 = aVar.a;
        bVar2.f58i = "OK";
        bVar2.f59j = dVar;
        this.u = aVar.a();
        if (!isFinishing() && (gVar = this.u) != null) {
            gVar.show();
        }
    }
}
