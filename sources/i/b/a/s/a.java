package i.b.a.s;

import android.content.Context;
import i.b.a.n.e;
import i.b.a.t.j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: AndroidResourceSignature */
public final class a implements e {

    /* renamed from: b  reason: collision with root package name */
    public final int f2858b;
    public final e c;

    public a(int i2, e eVar) {
        this.f2858b = i2;
        this.c = eVar;
    }

    public static e a(Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.a(context));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2858b != aVar.f2858b || !this.c.equals(aVar.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return j.a((Object) this.c, this.f2858b);
    }

    public void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f2858b).array());
    }
}
