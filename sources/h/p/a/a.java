package h.p.a;

import h.o.d0;
import h.o.l;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager */
public abstract class a {
    public static <T extends l & d0> a a(T t) {
        return new b(t, ((d0) t).h());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
