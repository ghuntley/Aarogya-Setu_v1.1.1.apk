package o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import o.o0.e;
import p.h;

/* compiled from: ResponseBody */
public abstract class l0 implements Closeable {
    @Nullable
    public Reader e;

    /* compiled from: ResponseBody */
    public static final class a extends Reader {
        public final h e;

        /* renamed from: f  reason: collision with root package name */
        public final Charset f5351f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5352g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public Reader f5353h;

        public a(h hVar, Charset charset) {
            this.e = hVar;
            this.f5351f = charset;
        }

        public void close() {
            this.f5352g = true;
            Reader reader = this.f5353h;
            if (reader != null) {
                reader.close();
            } else {
                this.e.close();
            }
        }

        public int read(char[] cArr, int i2, int i3) {
            if (!this.f5352g) {
                Reader reader = this.f5353h;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.e.p(), e.a(this.e, this.f5351f));
                    this.f5353h = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i2, i3);
            }
            throw new IOException("Stream closed");
        }
    }

    public static /* synthetic */ void a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    public abstract long a();

    public void close() {
        e.a((Closeable) h());
    }

    @Nullable
    public abstract a0 f();

    public abstract h h();

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String j() {
        /*
            r3 = this;
            p.h r0 = r3.h()
            o.a0 r1 = r3.f()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0011
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0020 }
            java.nio.charset.Charset r1 = r1.a((java.nio.charset.Charset) r2)     // Catch:{ all -> 0x0020 }
            goto L_0x0013
        L_0x0011:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0020 }
        L_0x0013:
            java.nio.charset.Charset r1 = o.o0.e.a((p.h) r0, (java.nio.charset.Charset) r1)     // Catch:{ all -> 0x0020 }
            java.lang.String r1 = r0.a((java.nio.charset.Charset) r1)     // Catch:{ all -> 0x0020 }
            r2 = 0
            a(r2, r0)
            return r1
        L_0x0020:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r2 = move-exception
            if (r0 == 0) goto L_0x0028
            a(r1, r0)
        L_0x0028:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.l0.j():java.lang.String");
    }
}
