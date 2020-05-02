package i.c.e;

import com.google.gson.internal.bind.TypeAdapters;
import i.c.e.v.c;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement */
public abstract class j {
    public int c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public l d() {
        if (this instanceof l) {
            return (l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public m e() {
        if (this instanceof m) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.f4926j = true;
            TypeAdapters.X.a(cVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
