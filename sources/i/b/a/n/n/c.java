package i.b.a.n.n;

import android.util.Log;
import i.b.a.n.d;
import i.b.a.n.g;
import i.b.a.t.a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferEncoder */
public class c implements d<ByteBuffer> {
    public boolean a(Object obj, File file, g gVar) {
        try {
            a.a((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
