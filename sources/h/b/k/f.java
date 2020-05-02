package h.b.k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController */
public class f implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f1121f;

    public f(AlertController.b bVar, AlertController alertController) {
        this.f1121f = bVar;
        this.e = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f1121f.r.onClick(this.e.f40b, i2);
        if (!this.f1121f.t) {
            this.e.f40b.dismiss();
        }
    }
}
