package okhttp3.internal.http2;

import java.io.IOException;
import o.o0.j.a;

public final class StreamResetException extends IOException {
    public final a e;

    public StreamResetException(a aVar) {
        super("stream was reset: " + aVar);
        this.e = aVar;
    }
}
