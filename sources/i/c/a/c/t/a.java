package i.c.a.c.t;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: Chip */
public class a extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public a(Chip chip) {
        this.a = chip;
    }

    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        b bVar = this.a.f597h;
        if (bVar != null) {
            bVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
