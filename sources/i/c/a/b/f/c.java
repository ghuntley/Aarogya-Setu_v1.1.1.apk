package i.c.a.b.f;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class c implements DynamiteModule.a {
    public final DynamiteModule.a.C0014a a(Context context, String str, DynamiteModule.a.b bVar) {
        DynamiteModule.a.C0014a aVar = new DynamiteModule.a.C0014a();
        int a = bVar.a(context, str);
        aVar.a = a;
        if (a != 0) {
            aVar.f506b = bVar.a(context, str, false);
        } else {
            aVar.f506b = bVar.a(context, str, true);
        }
        if (aVar.a == 0 && aVar.f506b == 0) {
            aVar.c = 0;
        } else if (aVar.a >= aVar.f506b) {
            aVar.c = -1;
        } else {
            aVar.c = 1;
        }
        return aVar;
    }
}
