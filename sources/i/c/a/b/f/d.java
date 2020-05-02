package i.c.a.b.f;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class d implements DynamiteModule.a {
    public final DynamiteModule.a.C0014a a(Context context, String str, DynamiteModule.a.b bVar) {
        DynamiteModule.a.C0014a aVar = new DynamiteModule.a.C0014a();
        aVar.a = bVar.a(context, str);
        int a = bVar.a(context, str, true);
        aVar.f506b = a;
        if (aVar.a == 0 && a == 0) {
            aVar.c = 0;
        } else if (aVar.f506b >= aVar.a) {
            aVar.c = 1;
        } else {
            aVar.c = -1;
        }
        return aVar;
    }
}
