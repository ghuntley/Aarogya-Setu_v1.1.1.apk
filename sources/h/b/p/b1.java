package h.b.p;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import h.b.f;
import h.b.g;
import h.b.i;

/* compiled from: TooltipPopup */
public class b1 {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1366b;
    public final TextView c;
    public final WindowManager.LayoutParams d = new WindowManager.LayoutParams();
    public final Rect e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1367f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1368g = new int[2];

    public b1(Context context) {
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(g.abc_tooltip, (ViewGroup) null);
        this.f1366b = inflate;
        this.c = (TextView) inflate.findViewById(f.message);
        this.d.setTitle(b1.class.getSimpleName());
        this.d.packageName = this.a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.f1366b.getParent() != null) {
            ((WindowManager) this.a.getSystemService("window")).removeView(this.f1366b);
        }
    }
}
