package h.a0.x.n.c;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import h.a0.l;

/* compiled from: SystemJobInfoConverter */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String f1016b = l.a("SystemJobInfoConverter");
    public final ComponentName a;

    public a(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
