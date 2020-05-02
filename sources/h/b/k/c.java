package h.b.k;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController */
public class c implements Runnable {
    public final /* synthetic */ View e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f1116f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AlertController f1117g;

    public c(AlertController alertController, View view, View view2) {
        this.f1117g = alertController;
        this.e = view;
        this.f1116f = view2;
    }

    public void run() {
        AlertController.a(this.f1117g.A, this.e, this.f1116f);
    }
}
