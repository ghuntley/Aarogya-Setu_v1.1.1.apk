package i.b.a.t;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ByteBufferUtil */
public final class a {
    public static final AtomicReference<byte[]> a = new AtomicReference<>();

    /* compiled from: ByteBufferUtil */
    public static final class b {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2862b;
        public final byte[] c;

        public b(byte[] bArr, int i2, int i3) {
            this.c = bArr;
            this.a = i2;
            this.f2862b = i3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|11|12|13) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047 A[SYNTHETIC, Splitter:B:24:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004e A[SYNTHETIC, Splitter:B:28:0x004e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer a(java.io.File r8) {
        /*
            r0 = 0
            long r5 = r8.length()     // Catch:{ all -> 0x0043 }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x003b
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0033
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "r"
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0043 }
            java.nio.channels.FileChannel r0 = r7.getChannel()     // Catch:{ all -> 0x0031 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0031 }
            r3 = 0
            r1 = r0
            java.nio.MappedByteBuffer r8 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0031 }
            java.nio.MappedByteBuffer r8 = r8.load()     // Catch:{ all -> 0x0031 }
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            r7.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            return r8
        L_0x0031:
            r8 = move-exception
            goto L_0x0045
        L_0x0033:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r8.<init>(r1)     // Catch:{ all -> 0x0043 }
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x003b:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "File too large to map into memory"
            r8.<init>(r1)     // Catch:{ all -> 0x0043 }
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r8 = move-exception
            r7 = r0
        L_0x0045:
            if (r0 == 0) goto L_0x004c
            r0.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            if (r7 == 0) goto L_0x0051
            r7.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.t.a.a(java.io.File):java.nio.ByteBuffer");
    }

    public static InputStream b(ByteBuffer byteBuffer) {
        return new C0100a(byteBuffer);
    }

    /* renamed from: i.b.a.t.a$a  reason: collision with other inner class name */
    /* compiled from: ByteBufferUtil */
    public static class C0100a extends InputStream {
        public final ByteBuffer e;

        /* renamed from: f  reason: collision with root package name */
        public int f2861f = -1;

        public C0100a(ByteBuffer byteBuffer) {
            this.e = byteBuffer;
        }

        public int available() {
            return this.e.remaining();
        }

        public synchronized void mark(int i2) {
            this.f2861f = this.e.position();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() {
            if (!this.e.hasRemaining()) {
                return -1;
            }
            return this.e.get() & 255;
        }

        public synchronized void reset() {
            if (this.f2861f != -1) {
                this.e.position(this.f2861f);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public long skip(long j2) {
            if (!this.e.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j2, (long) available());
            ByteBuffer byteBuffer = this.e;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }

        public int read(byte[] bArr, int i2, int i3) {
            if (!this.e.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i3, available());
            this.e.get(bArr, i2, min);
            return min;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:3|4|5|6|7|8|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[SYNTHETIC, Splitter:B:14:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A[SYNTHETIC, Splitter:B:18:0x0030] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.nio.ByteBuffer r4, java.io.File r5) {
        /*
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0025 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x0023 }
            r1.write(r4)     // Catch:{ all -> 0x0023 }
            r1.force(r0)     // Catch:{ all -> 0x0023 }
            r1.close()     // Catch:{ all -> 0x0023 }
            r2.close()     // Catch:{ all -> 0x0023 }
            r1.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            r2.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            return
        L_0x0023:
            r4 = move-exception
            goto L_0x0027
        L_0x0025:
            r4 = move-exception
            r2 = r1
        L_0x0027:
            if (r1 == 0) goto L_0x002e
            r1.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x002e
        L_0x002d:
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.t.a.a(java.nio.ByteBuffer, java.io.File):void");
    }

    public static ByteBuffer a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read >= 0) {
                byteArrayOutputStream.write(andSet, 0, read);
            } else {
                a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
        }
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        b bVar = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (bVar != null && bVar.a == 0 && bVar.f2862b == bVar.c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }
}
