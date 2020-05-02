package i.c.d.h.g;

import i.c.d.h.a;
import java.io.Writer;

/* compiled from: com.google.firebase:firebase-encoders-json@@16.0.0 */
public class c implements a {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    public void a(Object obj, Writer writer) {
        d dVar = this.a;
        e eVar = new e(writer, dVar.a, dVar.f4672b);
        eVar.a(obj);
        eVar.a();
        eVar.c.flush();
    }
}
