package p;

import i.a.a.a.a;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* compiled from: Okio */
public final class s extends c {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Socket f5666k;

    public s(Socket socket) {
        this.f5666k = socket;
    }

    public IOException a(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public void h() {
        try {
            this.f5666k.close();
        } catch (Exception e) {
            Logger logger = r.a;
            Level level = Level.WARNING;
            StringBuilder a = a.a("Failed to close timed out socket ");
            a.append(this.f5666k);
            logger.log(level, a.toString(), e);
        } catch (AssertionError e2) {
            if (r.a(e2)) {
                Logger logger2 = r.a;
                Level level2 = Level.WARNING;
                StringBuilder a2 = a.a("Failed to close timed out socket ");
                a2.append(this.f5666k);
                logger2.log(level2, a2.toString(), e2);
                return;
            }
            throw e2;
        }
    }
}
