package h.b.k;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController */
public class d implements AbsListView.OnScrollListener {
    public final /* synthetic */ View a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1118b;

    public d(AlertController alertController, View view, View view2) {
        this.a = view;
        this.f1118b = view2;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        AlertController.a(absListView, this.a, this.f1118b);
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}
