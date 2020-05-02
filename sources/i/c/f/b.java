package i.c.f;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import i.c.f.o;

/* compiled from: AbstractParser */
public abstract class b<MessageType extends o> implements q<MessageType> {
    static {
        i.a();
    }

    public Object a(f fVar, i iVar) {
        UninitializedMessageException uninitializedMessageException;
        try {
            g c = fVar.c();
            o oVar = (o) a(c, iVar);
            c.a(0);
            if (oVar == null || oVar.h()) {
                return oVar;
            }
            if (oVar instanceof a) {
                a aVar = (a) oVar;
                uninitializedMessageException = new UninitializedMessageException();
            } else {
                uninitializedMessageException = new UninitializedMessageException();
            }
            throw new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }
}
