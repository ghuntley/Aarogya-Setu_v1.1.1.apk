package i.c.a.a.i.b;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public abstract class s {
    public static s a(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new i(Long.parseLong(jsonReader.nextString()));
                } else {
                    i iVar = new i(jsonReader.nextLong());
                    jsonReader.close();
                    return iVar;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }
}
