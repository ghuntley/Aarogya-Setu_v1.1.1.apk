package i.c.f;

import com.google.protobuf.CodedOutputStream;
import i.c.f.a;
import i.c.f.a.C0140a;
import i.c.f.f;
import i.c.f.o;
import java.io.IOException;

/* compiled from: AbstractMessageLite */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0140a<MessageType, BuilderType>> implements o {
    public int e = 0;

    /* renamed from: i.c.f.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractMessageLite */
    public static abstract class C0140a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0140a<MessageType, BuilderType>> implements o.a {
    }

    public f a() {
        try {
            f.e d = f.d(c());
            a(d.a);
            if (d.a.a() == 0) {
                return new f.g(d.f4936b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException(a("ByteString"), e2);
        }
    }

    public byte[] b() {
        try {
            byte[] bArr = new byte[c()];
            CodedOutputStream a = CodedOutputStream.a(bArr);
            a(a);
            if (a.a() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException(a("byte array"), e2);
        }
    }

    public final String a(String str) {
        StringBuilder a = i.a.a.a.a.a("Serializing ");
        a.append(getClass().getName());
        a.append(" to a ");
        a.append(str);
        a.append(" threw an IOException (should never happen).");
        return a.toString();
    }
}
