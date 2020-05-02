package i.b.a.n.o.c;

import com.crashlytics.android.core.LogFileManager;
import i.b.a.n.m.b0.b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RecyclableBufferedInputStream */
public class v extends FilterInputStream {
    public volatile byte[] e;

    /* renamed from: f  reason: collision with root package name */
    public int f2756f;

    /* renamed from: g  reason: collision with root package name */
    public int f2757g;

    /* renamed from: h  reason: collision with root package name */
    public int f2758h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f2759i;

    /* renamed from: j  reason: collision with root package name */
    public final b f2760j;

    /* compiled from: RecyclableBufferedInputStream */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public v(InputStream inputStream, b bVar) {
        super(inputStream);
        this.f2760j = bVar;
        this.e = (byte[]) bVar.b(LogFileManager.MAX_LOG_SIZE, byte[].class);
    }

    public static IOException h() {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized void a() {
        this.f2757g = this.e.length;
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.e == null || inputStream == null) {
            h();
            throw null;
        }
        return (this.f2756f - this.f2759i) + inputStream.available();
    }

    public void close() {
        if (this.e != null) {
            this.f2760j.put(this.e);
            this.e = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void f() {
        if (this.e != null) {
            this.f2760j.put(this.e);
            this.e = null;
        }
    }

    public synchronized void mark(int i2) {
        this.f2757g = Math.max(this.f2757g, i2);
        this.f2758h = this.f2759i;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0026=Splitter:B:19:0x0026, B:11:0x0019=Splitter:B:11:0x0019, B:28:0x003b=Splitter:B:28:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.e     // Catch:{ all -> 0x003f }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003f }
            r2 = 0
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r3 = r6.f2759i     // Catch:{ all -> 0x003f }
            int r4 = r6.f2756f     // Catch:{ all -> 0x003f }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.a(r1, r0)     // Catch:{ all -> 0x003f }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.e     // Catch:{ all -> 0x003f }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.e     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            h()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x0026:
            int r1 = r6.f2756f     // Catch:{ all -> 0x003f }
            int r2 = r6.f2759i     // Catch:{ all -> 0x003f }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r6.f2759i     // Catch:{ all -> 0x003f }
            int r2 = r1 + 1
            r6.f2759i = r2     // Catch:{ all -> 0x003f }
            byte r0 = r0[r1]     // Catch:{ all -> 0x003f }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0039:
            monitor-exit(r6)
            return r5
        L_0x003b:
            h()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.o.c.v.read():int");
    }

    public synchronized void reset() {
        if (this.e == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.f2758h) {
            this.f2759i = this.f2758h;
        } else {
            throw new a("Mark has been invalidated, pos: " + this.f2759i + " markLimit: " + this.f2757g);
        }
    }

    public synchronized long skip(long j2) {
        if (j2 < 1) {
            return 0;
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                h();
                throw null;
            } else if (((long) (this.f2756f - this.f2759i)) >= j2) {
                this.f2759i = (int) (((long) this.f2759i) + j2);
                return j2;
            } else {
                long j3 = ((long) this.f2756f) - ((long) this.f2759i);
                this.f2759i = this.f2756f;
                if (this.f2758h == -1 || j2 > ((long) this.f2757g)) {
                    return j3 + inputStream.skip(j2 - j3);
                } else if (a(inputStream, bArr) == -1) {
                    return j3;
                } else {
                    if (((long) (this.f2756f - this.f2759i)) >= j2 - j3) {
                        this.f2759i = (int) ((((long) this.f2759i) + j2) - j3);
                        return j2;
                    }
                    long j4 = (j3 + ((long) this.f2756f)) - ((long) this.f2759i);
                    this.f2759i = this.f2756f;
                    return j4;
                }
            }
        } else {
            h();
            throw null;
        }
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i2;
        int i3 = this.f2758h;
        if (i3 == -1 || this.f2759i - i3 >= (i2 = this.f2757g)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f2758h = -1;
                this.f2759i = 0;
                this.f2756f = read;
            }
            return read;
        }
        if (i3 == 0 && i2 > bArr.length && this.f2756f == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i2) {
                i2 = length;
            }
            byte[] bArr2 = (byte[]) this.f2760j.b(i2, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.e = bArr2;
            this.f2760j.put(bArr);
            bArr = bArr2;
        } else {
            int i4 = this.f2758h;
            if (i4 > 0) {
                System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
            }
        }
        int i5 = this.f2759i - this.f2758h;
        this.f2759i = i5;
        this.f2758h = 0;
        this.f2756f = 0;
        int read2 = inputStream.read(bArr, i5, bArr.length - i5);
        int i6 = this.f2759i;
        if (read2 > 0) {
            i6 += read2;
        }
        this.f2756f = i6;
        return read2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005e, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.e     // Catch:{ all -> 0x009c }
            r1 = 0
            if (r0 == 0) goto L_0x0098
            if (r9 != 0) goto L_0x000b
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x009c }
            if (r2 == 0) goto L_0x0094
            int r3 = r6.f2759i     // Catch:{ all -> 0x009c }
            int r4 = r6.f2756f     // Catch:{ all -> 0x009c }
            if (r3 >= r4) goto L_0x003c
            int r3 = r6.f2756f     // Catch:{ all -> 0x009c }
            int r4 = r6.f2759i     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
            if (r3 < r9) goto L_0x001e
            r3 = r9
            goto L_0x0023
        L_0x001e:
            int r3 = r6.f2756f     // Catch:{ all -> 0x009c }
            int r4 = r6.f2759i     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
        L_0x0023:
            int r4 = r6.f2759i     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x009c }
            int r4 = r6.f2759i     // Catch:{ all -> 0x009c }
            int r4 = r4 + r3
            r6.f2759i = r4     // Catch:{ all -> 0x009c }
            if (r3 == r9) goto L_0x003a
            int r4 = r2.available()     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r8 = r8 + r3
            int r3 = r9 - r3
            goto L_0x003d
        L_0x003a:
            monitor-exit(r6)
            return r3
        L_0x003c:
            r3 = r9
        L_0x003d:
            int r4 = r6.f2758h     // Catch:{ all -> 0x009c }
            r5 = -1
            if (r4 != r5) goto L_0x0052
            int r4 = r0.length     // Catch:{ all -> 0x009c }
            if (r3 < r4) goto L_0x0052
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x0084
            if (r3 != r9) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            int r5 = r9 - r3
        L_0x0050:
            monitor-exit(r6)
            return r5
        L_0x0052:
            int r4 = r6.a(r2, r0)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x005f
            if (r3 != r9) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            int r5 = r9 - r3
        L_0x005d:
            monitor-exit(r6)
            return r5
        L_0x005f:
            byte[] r4 = r6.e     // Catch:{ all -> 0x009c }
            if (r0 == r4) goto L_0x006c
            byte[] r0 = r6.e     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            h()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x006c:
            int r4 = r6.f2756f     // Catch:{ all -> 0x009c }
            int r5 = r6.f2759i     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0075
            r4 = r3
            goto L_0x007a
        L_0x0075:
            int r4 = r6.f2756f     // Catch:{ all -> 0x009c }
            int r5 = r6.f2759i     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
        L_0x007a:
            int r5 = r6.f2759i     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x009c }
            int r5 = r6.f2759i     // Catch:{ all -> 0x009c }
            int r5 = r5 + r4
            r6.f2759i = r5     // Catch:{ all -> 0x009c }
        L_0x0084:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0089
            monitor-exit(r6)
            return r9
        L_0x0089:
            int r5 = r2.available()     // Catch:{ all -> 0x009c }
            if (r5 != 0) goto L_0x0092
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x0092:
            int r8 = r8 + r4
            goto L_0x003d
        L_0x0094:
            h()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x0098:
            h()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x009c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.o.c.v.read(byte[], int, int):int");
    }
}
