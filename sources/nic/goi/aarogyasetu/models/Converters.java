package nic.goi.aarogyasetu.models;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import i.c.e.u.a;
import i.c.e.v.b;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;

public class Converters {
    public static String fromArrayList(EncryptedInfo encryptedInfo) {
        return new Gson().a((Object) encryptedInfo);
    }

    public static EncryptedInfo fromString(String str) {
        Type type = new a<EncryptedInfo>() {
        }.getType();
        Gson gson = new Gson();
        Object obj = null;
        if (str != null) {
            i.c.e.v.a aVar = new i.c.e.v.a(new StringReader(str));
            boolean z = gson.f721j;
            aVar.f4898f = z;
            aVar.f4898f = true;
            try {
                aVar.C();
                obj = gson.a(a.get(type)).a(aVar);
            } catch (EOFException e) {
                if (1 == 0) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IOException e3) {
                throw new JsonSyntaxException((Throwable) e3);
            } catch (AssertionError e4) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e4.getMessage());
                assertionError.initCause(e4);
                throw assertionError;
            } catch (Throwable th) {
                aVar.f4898f = z;
                throw th;
            }
            aVar.f4898f = z;
            if (obj != null) {
                try {
                    if (aVar.C() != b.END_DOCUMENT) {
                        throw new JsonIOException("JSON document was not fully consumed.");
                    }
                } catch (MalformedJsonException e5) {
                    throw new JsonSyntaxException((Throwable) e5);
                } catch (IOException e6) {
                    throw new JsonIOException((Throwable) e6);
                }
            }
        }
        return (EncryptedInfo) obj;
    }
}
