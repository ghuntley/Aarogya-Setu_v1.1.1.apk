package retrofit2;

import java.util.Objects;
import q.d0;

public class HttpException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HttpException(d0<?> d0Var) {
        super("HTTP " + d0Var.a.f5326g + " " + d0Var.a.f5327h);
        Objects.requireNonNull(d0Var, "response == null");
        int i2 = d0Var.a.f5326g;
    }
}
