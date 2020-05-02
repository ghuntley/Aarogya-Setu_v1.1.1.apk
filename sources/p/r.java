package p;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* compiled from: Okio */
public final class r {
    public static final Logger a = Logger.getLogger(r.class.getName());

    /* compiled from: Okio */
    public class a implements a0 {
        public final /* synthetic */ b0 e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ InputStream f5665f;

        public a(b0 b0Var, InputStream inputStream) {
            this.e = b0Var;
            this.f5665f = inputStream;
        }

        public long b(f fVar, long j2) {
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j2);
            } else if (i2 == 0) {
                return 0;
            } else {
                try {
                    this.e.e();
                    w b2 = fVar.b(1);
                    int read = this.f5665f.read(b2.a, b2.c, (int) Math.min(j2, (long) (8192 - b2.c)));
                    if (read == -1) {
                        return -1;
                    }
                    b2.c += read;
                    long j3 = (long) read;
                    fVar.f5646f += j3;
                    return j3;
                } catch (AssertionError e2) {
                    if (r.a(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }
        }

        public b0 c() {
            return this.e;
        }

        public void close() {
            this.f5665f.close();
        }

        public String toString() {
            StringBuilder a = i.a.a.a.a.a("source(");
            a.append(this.f5665f);
            a.append(")");
            return a.toString();
        }
    }

    public static h a(a0 a0Var) {
        return new v(a0Var);
    }

    public static a0 b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            s sVar = new s(socket);
            return new b(sVar, a(socket.getInputStream(), sVar));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    public static g a(z zVar) {
        return new u(zVar);
    }

    public static z a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            s sVar = new s(socket);
            OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return new a(sVar, new q(sVar, outputStream));
            }
            throw new IllegalArgumentException("out == null");
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static a0 a(InputStream inputStream) {
        return a(inputStream, new b0());
    }

    public static a0 a(InputStream inputStream, b0 b0Var) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (b0Var != null) {
            return new a(b0Var, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
