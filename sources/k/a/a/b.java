package k.a.a;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.q;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public final class b extends k<b, a> implements c {

    /* renamed from: i  reason: collision with root package name */
    public static final b f5012i;

    /* renamed from: j  reason: collision with root package name */
    public static volatile q<b> f5013j;

    /* renamed from: h  reason: collision with root package name */
    public String f5014h = "";

    /* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
    public static final class a extends k.b<b, a> implements c {
        public /* synthetic */ a(a aVar) {
            super(b.f5012i);
        }
    }

    static {
        b bVar = new b();
        f5012i = bVar;
        bVar.f();
    }

    public void a(CodedOutputStream codedOutputStream) {
        if (!this.f5014h.isEmpty()) {
            codedOutputStream.a(1, this.f5014h);
        }
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (!this.f5014h.isEmpty()) {
            i3 = 0 + CodedOutputStream.b(1, this.f5014h);
        }
        this.f4950g = i3;
        return i3;
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        switch (jVar.ordinal()) {
            case 0:
                return f5012i;
            case 1:
                b bVar = (b) obj2;
                this.f5014h = ((k.C0142k) obj).a(!this.f5014h.isEmpty(), this.f5014h, true ^ bVar.f5014h.isEmpty(), bVar.f5014h);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int i2 = gVar.i();
                        if (i2 != 0) {
                            if (i2 == 10) {
                                this.f5014h = gVar.h();
                            } else if (!gVar.e(i2)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()));
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new b();
            case 5:
                return new a((a) null);
            case 6:
                break;
            case 7:
                if (f5013j == null) {
                    synchronized (b.class) {
                        if (f5013j == null) {
                            f5013j = new k.c(f5012i);
                        }
                    }
                }
                return f5013j;
            default:
                throw new UnsupportedOperationException();
        }
        return f5012i;
    }
}
