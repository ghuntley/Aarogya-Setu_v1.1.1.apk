package i.c.a.a.j;

import android.util.Base64;
import i.c.a.a.d;
import i.c.a.a.j.b;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public abstract class h {

    /* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public static abstract class a {
        public abstract a a(d dVar);

        public abstract a a(String str);

        public abstract h a();
    }

    public static a a() {
        b.C0103b bVar = new b.C0103b();
        bVar.a(d.DEFAULT);
        return bVar;
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        b bVar = (b) this;
        objArr[0] = bVar.a;
        objArr[1] = bVar.c;
        byte[] bArr = bVar.f2933b;
        if (bArr == null) {
            str = "";
        } else {
            str = Base64.encodeToString(bArr, 2);
        }
        objArr[2] = str;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
