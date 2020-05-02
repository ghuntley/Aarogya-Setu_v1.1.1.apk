package i.c.a.b.d.l;

import android.content.Context;
import android.content.res.Resources;
import i.c.a.b.d.i;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class v {
    public final Resources a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3152b;

    public v(Context context) {
        q.a(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.f3152b = resources.getResourcePackageName(i.common_google_play_services_unknown_issue);
    }

    @Nullable
    public String a(String str) {
        int identifier = this.a.getIdentifier(str, "string", this.f3152b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
