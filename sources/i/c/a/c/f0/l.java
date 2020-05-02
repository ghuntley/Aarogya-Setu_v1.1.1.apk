package i.c.a.c.f0;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar */
public class l implements SwipeDismissBehavior.b {
    public final /* synthetic */ BaseTransientBottomBar a;

    public l(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public void a(View view) {
        view.setVisibility(8);
        this.a.a(0);
    }
}
