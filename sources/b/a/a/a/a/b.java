package b.a.a.a.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import b.a.a.e;
import h.l.d.c;
import java.util.HashMap;
import n.m.c.f;
import nic.goi.aarogyasetu.R;

/* compiled from: SyncDataConsentDialog.kt */
public final class b extends c {
    public C0004b n0;
    public String o0;
    public HashMap p0;

    /* compiled from: java-style lambda group */
    public static final class a implements View.OnClickListener {
        public final /* synthetic */ int e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f409f;

        public a(int i2, Object obj) {
            this.e = i2;
            this.f409f = obj;
        }

        public final void onClick(View view) {
            int i2 = this.e;
            if (i2 == 0) {
                b bVar = (b) this.f409f;
                C0004b bVar2 = bVar.n0;
                if (bVar2 != null) {
                    String str = bVar.o0;
                    if (str == null) {
                        str = "being_tested";
                    }
                    bVar2.e(str);
                }
                Bundle bundle = new Bundle();
                bundle.putString("uploadType", ((b) this.f409f).o0);
                b.a.a.l.b.a("submitUploadConsent", bundle);
                ((b) this.f409f).H();
            } else if (i2 == 1) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("uploadType", ((b) this.f409f).o0);
                b.a.a.l.b.a("consentCancelled", bundle2);
                ((b) this.f409f).H();
            } else {
                throw null;
            }
        }
    }

    /* renamed from: b.a.a.a.a.b$b  reason: collision with other inner class name */
    /* compiled from: SyncDataConsentDialog.kt */
    public interface C0004b {
        void e(String str);
    }

    public void a(Context context) {
        if (context != null) {
            super.a(context);
            if (context instanceof C0004b) {
                this.n0 = (C0004b) context;
                return;
            }
            return;
        }
        f.a("context");
        throw null;
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        a(0, 2131820971);
        Bundle bundle2 = this.f232j;
        this.o0 = bundle2 != null ? bundle2.getString("upload_type") : null;
    }

    public View d(int i2) {
        if (this.p0 == null) {
            this.p0 = new HashMap();
        }
        View view = (View) this.p0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = this.K;
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.p0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public /* synthetic */ void y() {
        super.y();
        HashMap hashMap = this.p0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(R.layout.dialog_sync_data_consent, viewGroup, false);
            f.a((Object) inflate, "inflater.inflate(R.layou…onsent, container, false)");
            return inflate;
        }
        f.a("inflater");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        if (view != null) {
            TextView textView = (TextView) d(e.tv_sync_consent_detail);
            f.a((Object) textView, "tv_sync_consent_detail");
            textView.setText(i.c.d.p.e.a(k(), (int) R.string.sync_data_user_consent));
            Button button = (Button) d(e.btn_confirm_and_proceed);
            f.a((Object) button, "btn_confirm_and_proceed");
            button.setText(i.c.d.p.e.a(k(), (int) R.string.confirm_and_proceed));
            ((Button) d(e.btn_confirm_and_proceed)).setOnClickListener(new a(0, this));
            ((ImageView) d(e.close)).setOnClickListener(new a(1, this));
            Bundle bundle2 = new Bundle();
            bundle2.putString("uploadType", this.o0);
            b.a.a.l.b.a("uploadConsentScreen", bundle2);
            return;
        }
        f.a("view");
        throw null;
    }

    public static final b a(String str) {
        if (str != null) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("upload_type", str);
            bVar.e(bundle);
            return bVar;
        }
        f.a("uploadType");
        throw null;
    }
}
