package h.b.p;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: ListPopupWindow */
public class j0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ k0 e;

    public j0(k0 k0Var) {
        this.e = k0Var;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        f0 f0Var;
        if (i2 != -1 && (f0Var = this.e.f1430g) != null) {
            f0Var.setListSelectionHidden(false);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
