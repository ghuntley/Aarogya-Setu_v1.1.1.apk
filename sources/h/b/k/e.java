package h.b.k;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController */
public class e implements Runnable {
    public final /* synthetic */ View e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f1119f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AlertController f1120g;

    public e(AlertController alertController, View view, View view2) {
        this.f1120g = alertController;
        this.e = view;
        this.f1119f = view2;
    }

    public void run() {
        AlertController.a(this.f1120g.f42g, this.e, this.f1119f);
    }
}
