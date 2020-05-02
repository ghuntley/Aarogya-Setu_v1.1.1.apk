package i.b.a.n.o.g;

import android.util.Log;
import i.b.a.n.c;
import i.b.a.n.g;
import i.b.a.n.j;
import i.b.a.n.m.v;
import i.b.a.t.a;
import java.io.File;
import java.io.IOException;

/* compiled from: GifDrawableEncoder */
public class d implements j<c> {
    public boolean a(Object obj, File file, g gVar) {
        try {
            a.a(((c) ((v) obj).get()).e.a.a.g().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    public c a(g gVar) {
        return c.SOURCE;
    }
}
