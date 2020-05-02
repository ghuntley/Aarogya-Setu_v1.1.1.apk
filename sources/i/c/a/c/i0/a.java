package i.c.a.c.i0;

import android.view.View;
import android.widget.AdapterView;
import h.b.p.k0;

/* compiled from: MaterialAutoCompleteTextView */
public class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ b e;

    public a(b bVar) {
        this.e = bVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        Object obj;
        View view2 = null;
        if (i2 < 0) {
            k0 k0Var = this.e.f4144h;
            if (!k0Var.b()) {
                obj = null;
            } else {
                obj = k0Var.f1430g.getSelectedItem();
            }
        } else {
            obj = this.e.getAdapter().getItem(i2);
        }
        this.e.setText(this.e.convertSelectionToString(obj), false);
        AdapterView.OnItemClickListener onItemClickListener = this.e.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i2 < 0) {
                k0 k0Var2 = this.e.f4144h;
                if (k0Var2.b()) {
                    view2 = k0Var2.f1430g.getSelectedView();
                }
                view = view2;
                k0 k0Var3 = this.e.f4144h;
                if (!k0Var3.b()) {
                    i2 = -1;
                } else {
                    i2 = k0Var3.f1430g.getSelectedItemPosition();
                }
                k0 k0Var4 = this.e.f4144h;
                if (!k0Var4.b()) {
                    j2 = Long.MIN_VALUE;
                } else {
                    j2 = k0Var4.f1430g.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(this.e.f4144h.f1430g, view, i2, j2);
        }
        this.e.f4144h.dismiss();
    }
}
