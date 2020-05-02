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

/* compiled from: SyncDataDialog.kt */
public final class a extends c {
    public b n0;
    public HashMap o0;

    /* renamed from: b.a.a.a.a.a$a  reason: collision with other inner class name */
    /* compiled from: java-style lambda group */
    public static final class C0003a implements View.OnClickListener {
        public final /* synthetic */ int e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f408f;

        public C0003a(int i2, Object obj) {
            this.e = i2;
            this.f408f = obj;
        }

        public final void onClick(View view) {
            int i2 = this.e;
            if (i2 == 0) {
                b bVar = ((a) this.f408f).n0;
                if (bVar != null) {
                    bVar.c("being_tested");
                }
                ((a) this.f408f).H();
            } else if (i2 == 1) {
                b bVar2 = ((a) this.f408f).n0;
                if (bVar2 != null) {
                    bVar2.c("tested_positive_consent");
                }
                ((a) this.f408f).H();
            } else if (i2 == 2) {
                ((a) this.f408f).H();
            } else {
                throw null;
            }
        }
    }

    /* compiled from: SyncDataDialog.kt */
    public interface b {
        void c(String str);
    }

    public void a(Context context) {
        if (context != null) {
            super.a(context);
            if (context instanceof b) {
                this.n0 = (b) context;
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
    }

    public View d(int i2) {
        if (this.o0 == null) {
            this.o0 = new HashMap();
        }
        View view = (View) this.o0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = this.K;
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.o0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public /* synthetic */ void y() {
        super.y();
        HashMap hashMap = this.o0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(R.layout.dialog_sync_data, viewGroup, false);
            f.a((Object) inflate, "inflater.inflate(R.layou…c_data, container, false)");
            return inflate;
        }
        f.a("inflater");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        if (view != null) {
            TextView textView = (TextView) d(e.tv_sync_data_detail);
            f.a((Object) textView, "tv_sync_data_detail");
            textView.setText(i.c.d.p.e.a(k(), (int) R.string.sync_data_detail));
            TextView textView2 = (TextView) d(e.btn_being_tested);
            f.a((Object) textView2, "btn_being_tested");
            textView2.setText(i.c.d.p.e.a(k(), (int) R.string.sample_collected_for_testing));
            ((TextView) d(e.btn_being_tested)).setOnClickListener(new C0003a(0, this));
            Button button = (Button) d(e.btn_tested_positive);
            f.a((Object) button, "btn_tested_positive");
            button.setText(i.c.d.p.e.a(k(), (int) R.string.tested_positive));
            ((Button) d(e.btn_tested_positive)).setOnClickListener(new C0003a(1, this));
            ((ImageView) d(e.close)).setOnClickListener(new C0003a(2, this));
            return;
        }
        f.a("view");
        throw null;
    }
}
