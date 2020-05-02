package okhttp3.internal.publicsuffix;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase {
    public static final byte[] e = {42};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f5633f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f5634g = {"*"};

    /* renamed from: h  reason: collision with root package name */
    public static final PublicSuffixDatabase f5635h = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f5636b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r0 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0095 A[LOOP:4: B:50:0x0095->B:55:0x00a3, LOOP_START, PHI: r1 
  PHI: (r1v2 int) = (r1v0 int), (r1v3 int) binds: [B:49:0x0093, B:55:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] a(java.lang.String[] r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.a
            boolean r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.a
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x003d
            r0 = 0
        L_0x0013:
            r8.a()     // Catch:{ InterruptedIOException -> 0x002e, IOException -> 0x0022 }
            if (r0 == 0) goto L_0x004a
        L_0x0018:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x004a
        L_0x0020:
            r9 = move-exception
            goto L_0x0033
        L_0x0022:
            r3 = move-exception
            o.o0.k.f r4 = o.o0.k.f.a     // Catch:{ all -> 0x0020 }
            r5 = 5
            java.lang.String r6 = "Failed to read public suffix list"
            r4.a((int) r5, (java.lang.String) r6, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x004a
            goto L_0x0018
        L_0x002e:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0020 }
            r0 = 1
            goto L_0x0013
        L_0x0033:
            if (r0 == 0) goto L_0x003c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x003c:
            throw r9
        L_0x003d:
            java.util.concurrent.CountDownLatch r0 = r8.f5636b     // Catch:{ InterruptedException -> 0x0043 }
            r0.await()     // Catch:{ InterruptedException -> 0x0043 }
            goto L_0x004a
        L_0x0043:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x004a:
            monitor-enter(r8)
            byte[] r0 = r8.c     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00e4
            monitor-exit(r8)     // Catch:{ all -> 0x00ec }
            int r0 = r9.length
            byte[][] r3 = new byte[r0][]
            r4 = 0
        L_0x0054:
            int r5 = r9.length
            if (r4 >= r5) goto L_0x0064
            r5 = r9[r4]
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r5.getBytes(r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L_0x0054
        L_0x0064:
            r9 = 0
        L_0x0065:
            r4 = 0
            if (r9 >= r0) goto L_0x0074
            byte[] r5 = r8.c
            java.lang.String r5 = a(r5, r3, r9)
            if (r5 == 0) goto L_0x0071
            goto L_0x0075
        L_0x0071:
            int r9 = r9 + 1
            goto L_0x0065
        L_0x0074:
            r5 = r4
        L_0x0075:
            if (r0 <= r2) goto L_0x0092
            java.lang.Object r9 = r3.clone()
            byte[][] r9 = (byte[][]) r9
            r6 = 0
        L_0x007e:
            int r7 = r9.length
            int r7 = r7 - r2
            if (r6 >= r7) goto L_0x0092
            byte[] r7 = e
            r9[r6] = r7
            byte[] r7 = r8.c
            java.lang.String r7 = a(r7, r9, r6)
            if (r7 == 0) goto L_0x008f
            goto L_0x0093
        L_0x008f:
            int r6 = r6 + 1
            goto L_0x007e
        L_0x0092:
            r7 = r4
        L_0x0093:
            if (r7 == 0) goto L_0x00a6
        L_0x0095:
            int r9 = r0 + -1
            if (r1 >= r9) goto L_0x00a6
            byte[] r9 = r8.d
            java.lang.String r9 = a(r9, r3, r1)
            if (r9 == 0) goto L_0x00a3
            r4 = r9
            goto L_0x00a6
        L_0x00a3:
            int r1 = r1 + 1
            goto L_0x0095
        L_0x00a6:
            if (r4 == 0) goto L_0x00c0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "!"
            r9.append(r0)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "\\."
            java.lang.String[] r9 = r9.split(r0)
            return r9
        L_0x00c0:
            if (r5 != 0) goto L_0x00c7
            if (r7 != 0) goto L_0x00c7
            java.lang.String[] r9 = f5634g
            return r9
        L_0x00c7:
            if (r5 == 0) goto L_0x00d0
            java.lang.String r9 = "\\."
            java.lang.String[] r9 = r5.split(r9)
            goto L_0x00d2
        L_0x00d0:
            java.lang.String[] r9 = f5633f
        L_0x00d2:
            if (r7 == 0) goto L_0x00db
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r7.split(r0)
            goto L_0x00dd
        L_0x00db:
            java.lang.String[] r0 = f5633f
        L_0x00dd:
            int r1 = r9.length
            int r2 = r0.length
            if (r1 <= r2) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r9 = r0
        L_0x00e3:
            return r9
        L_0x00e4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ec }
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            r9.<init>(r0)     // Catch:{ all -> 0x00ec }
            throw r9     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00ec }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String[]):java.lang.String[]");
    }

    public static String a(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        boolean z;
        byte b2;
        int i4;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr3[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i3 = i7 + i8;
                if (bArr3[i3] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i3 - i7;
            int i10 = i2;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    b2 = 46;
                    z = false;
                } else {
                    z = z2;
                    b2 = bArr4[i10][i11] & 255;
                }
                i4 = b2 - (bArr3[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    } else if (bArr4[i10].length != i11) {
                        z2 = z;
                    } else if (i10 == bArr4.length - 1) {
                        break;
                    } else {
                        i10++;
                        z2 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr4[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr3, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i3 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r3 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            p.o r1 = new p.o
            p.a0 r0 = p.r.a((java.io.InputStream) r0)
            r1.<init>(r0)
            p.v r0 = new p.v
            r0.<init>(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x003d }
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x003d }
            r0.a((byte[]) r1)     // Catch:{ all -> 0x003d }
            int r2 = r0.readInt()     // Catch:{ all -> 0x003d }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x003d }
            r0.a((byte[]) r2)     // Catch:{ all -> 0x003d }
            r0.close()
            monitor-enter(r3)
            r3.c = r1     // Catch:{ all -> 0x003a }
            r3.d = r2     // Catch:{ all -> 0x003a }
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            java.util.concurrent.CountDownLatch r0 = r3.f5636b
            r0.countDown()
            return
        L_0x003a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            throw r0
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0048:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a():void");
    }
}
