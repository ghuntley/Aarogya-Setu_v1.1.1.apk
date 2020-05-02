package b.a.a.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b.a.a.a.o0;
import b.a.a.e;
import java.util.HashMap;
import n.m.c.f;
import nic.goi.aarogyasetu.R;

/* compiled from: NoBluetoothDialog.kt */
public final class c extends h.l.d.c {
    public b n0;
    public HashMap o0;

    /* compiled from: java-style lambda group */
    public static final class a implements View.OnClickListener {
        public final /* synthetic */ int e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f415f;

        public a(int i2, Object obj) {
            this.e = i2;
            this.f415f = obj;
        }

        public final void onClick(View view) {
            int i2 = this.e;
            if (i2 == 0) {
                b bVar = ((c) this.f415f).n0;
                if (bVar != null) {
                    bVar.d();
                }
                ((c) this.f415f).H();
            } else if (i2 == 1) {
                ((c) this.f415f).H();
            } else {
                throw null;
            }
        }
    }

    /* compiled from: NoBluetoothDialog.kt */
    public interface b {
        void d();
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.dialog_no_bluetooth, viewGroup, false);
        }
        f.a("inflater");
        throw null;
    }

    public /* synthetic */ void y() {
        super.y();
        HashMap hashMap = this.o0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void a(Context context) {
        if (context != null) {
            super.a(context);
            if (context instanceof o0.a) {
                this.n0 = (b) context;
                return;
            }
            return;
        }
        f.a("context");
        throw null;
    }

    public void a(View view, Bundle bundle) {
        View view2 = null;
        if (view != null) {
            int i2 = e.textView2;
            if (this.o0 == null) {
                this.o0 = new HashMap();
            }
            View view3 = (View) this.o0.get(Integer.valueOf(i2));
            if (view3 == null) {
                View view4 = this.K;
                if (view4 != null) {
                    view2 = view4.findViewById(i2);
                    this.o0.put(Integer.valueOf(i2), view2);
                }
            } else {
                view2 = view3;
            }
            TextView textView = (TextView) view2;
            f.a((Object) textView, "textView2");
            textView.setText(i.c.d.p.e.a(k(), (int) R.string.turn_on_bluetooth_all_times));
            view.findViewById(R.id.turn_on).setOnClickListener(new a(0, this));
            view.findViewById(R.id.later).setOnClickListener(new a(1, this));
            return;
        }
        f.a("view");
        throw null;
    }
}
