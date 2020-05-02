package b.a.a.a.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import i.c.d.p.e;
import n.m.c.f;
import nic.goi.aarogyasetu.R;

/* compiled from: SyncDataStateDialog.kt */
public final class c extends h.l.d.c {
    public C0005c n0;
    public b o0 = b.SYNCING;
    public String p0;

    /* compiled from: java-style lambda group */
    public static final class a implements View.OnClickListener {
        public final /* synthetic */ int e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f410f;

        public a(int i2, Object obj) {
            this.e = i2;
            this.f410f = obj;
        }

        public final void onClick(View view) {
            String str;
            C0005c cVar;
            int i2 = this.e;
            if (i2 == 0) {
                c cVar2 = (c) this.f410f;
                b bVar = cVar2.o0;
                if (bVar == b.SYNCING) {
                    C0005c cVar3 = cVar2.n0;
                    if (cVar3 != null) {
                        cVar3.i();
                    }
                } else if (!(bVar != b.FAILURE || (str = cVar2.p0) == null || (cVar = cVar2.n0) == null)) {
                    cVar.b(str);
                }
                ((c) this.f410f).H();
            } else if (i2 == 1) {
                ((c) this.f410f).H();
            } else {
                throw null;
            }
        }
    }

    /* compiled from: SyncDataStateDialog.kt */
    public enum b {
        SYNCING,
        FAILURE,
        SUCCESS
    }

    /* renamed from: b.a.a.a.a.c$c  reason: collision with other inner class name */
    /* compiled from: SyncDataStateDialog.kt */
    public interface C0005c {
        void b(String str);

        void i();
    }

    public void a(Context context) {
        if (context != null) {
            super.a(context);
            if (context instanceof C0005c) {
                this.n0 = (C0005c) context;
                return;
            }
            return;
        }
        f.a("context");
        throw null;
    }

    public void b(Bundle bundle) {
        String str;
        super.b(bundle);
        a(0, 2131820971);
        Bundle bundle2 = this.f232j;
        if (bundle2 == null || (str = bundle2.getString("state")) == null) {
            b bVar = b.SYNCING;
            str = "SYNCING";
        }
        this.o0 = b.valueOf(str);
        Bundle bundle3 = this.f232j;
        this.p0 = bundle3 != null ? bundle3.getString("upload_type") : null;
    }

    public /* synthetic */ void y() {
        super.y();
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(R.layout.dialog_sync_data_state, viewGroup, false);
            f.a((Object) inflate, "inflater.inflate(R.layou…_state, container, false)");
            return inflate;
        }
        f.a("inflater");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        if (view != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.ic_state);
            TextView textView = (TextView) view.findViewById(R.id.tv_sync_title);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_sync_detail);
            Button button = (Button) view.findViewById(R.id.btn_sync);
            int ordinal = this.o0.ordinal();
            if (ordinal == 0) {
                f.a((Object) imageView, "stateIcon");
                f.a((Object) textView, "title");
                f.a((Object) textView2, "detail");
                f.a((Object) button, "syncBtn");
                imageView.setImageResource(R.drawable.ic_syncing);
                textView.setText(e.a(k(), (int) R.string.syncing_data));
                Context k2 = k();
                if (k2 != null) {
                    textView.setTextColor(h.h.f.a.a(k2, (int) R.color.black));
                }
                textView2.setText(e.a(k(), (int) R.string.syncing_data_detail));
                button.setText(e.a(k(), (int) R.string.cancel));
            } else if (ordinal == 1) {
                f.a((Object) imageView, "stateIcon");
                f.a((Object) textView, "title");
                f.a((Object) textView2, "detail");
                f.a((Object) button, "syncBtn");
                imageView.setImageResource(R.drawable.ic_sync_failure);
                textView.setText(e.a(k(), (int) R.string.syncing_data_failed));
                Context k3 = k();
                if (k3 != null) {
                    textView.setTextColor(h.h.f.a.a(k3, (int) R.color.sync_failure));
                }
                textView2.setText(e.a(k(), (int) R.string.syncing_data_failed_detail));
                button.setText(e.a(k(), (int) R.string.retry));
            } else if (ordinal == 2) {
                f.a((Object) imageView, "stateIcon");
                f.a((Object) textView, "title");
                f.a((Object) textView2, "detail");
                f.a((Object) button, "syncBtn");
                imageView.setImageResource(R.drawable.ic_sync_success);
                textView.setText(e.a(k(), (int) R.string.syncing_data_success));
                Context k4 = k();
                if (k4 != null) {
                    textView.setTextColor(h.h.f.a.a(k4, (int) R.color.sync_success));
                }
                textView2.setText(e.a(k(), (int) R.string.syncing_data_success_detail));
                button.setText(e.a(k(), (int) R.string.ok));
            }
            ((Button) view.findViewById(R.id.btn_sync)).setOnClickListener(new a(0, this));
            ((ImageView) view.findViewById(R.id.close)).setOnClickListener(new a(1, this));
            Bundle bundle2 = new Bundle();
            bundle2.putString("uploadType", this.p0);
            b.a.a.l.b.a("uploadChoiceScreen", bundle2);
            return;
        }
        f.a("view");
        throw null;
    }

    public static final c a(b bVar, String str) {
        if (bVar != null) {
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putString("state", bVar.name());
            bundle.putString("upload_type", str);
            cVar.e(bundle);
            return cVar;
        }
        f.a("state");
        throw null;
    }
}
