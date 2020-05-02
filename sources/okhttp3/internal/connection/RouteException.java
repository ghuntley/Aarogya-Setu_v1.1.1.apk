package okhttp3.internal.connection;

import java.io.IOException;

public final class RouteException extends RuntimeException {
    public IOException e;

    /* renamed from: f  reason: collision with root package name */
    public IOException f5632f;

    public RouteException(IOException iOException) {
        super(iOException);
        this.e = iOException;
        this.f5632f = iOException;
    }
}
