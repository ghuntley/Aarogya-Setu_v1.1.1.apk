package i.c.a.c.f0;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: Snackbar */
public class o implements View.OnClickListener {
    public final /* synthetic */ View.OnClickListener e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Snackbar f4111f;

    public o(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f4111f = snackbar;
        this.e = onClickListener;
    }

    public void onClick(View view) {
        this.e.onClick(view);
        this.f4111f.a(1);
    }
}
