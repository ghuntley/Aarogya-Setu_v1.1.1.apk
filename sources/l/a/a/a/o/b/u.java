package l.a.a.a.o.b;

import com.crashlytics.android.core.CodedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: QueueFile */
public class u implements Closeable {

    /* renamed from: k  reason: collision with root package name */
    public static final Logger f5107k = Logger.getLogger(u.class.getName());
    public final RandomAccessFile e;

    /* renamed from: f  reason: collision with root package name */
    public int f5108f;

    /* renamed from: g  reason: collision with root package name */
    public int f5109g;

    /* renamed from: h  reason: collision with root package name */
    public b f5110h;

    /* renamed from: i  reason: collision with root package name */
    public b f5111i;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f5112j = new byte[16];

    /* compiled from: QueueFile */
    public class a implements d {
        public boolean a = true;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StringBuilder f5113b;

        public a(u uVar, StringBuilder sb) {
            this.f5113b = sb;
        }

        public void read(InputStream inputStream, int i2) {
            if (this.a) {
                this.a = false;
            } else {
                this.f5113b.append(", ");
            }
            this.f5113b.append(i2);
        }
    }

    /* compiled from: QueueFile */
    public static class b {
        public static final b c = new b(0, 0);
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5114b;

        public b(int i2, int i3) {
            this.a = i2;
            this.f5114b = i3;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position = " + this.a + ", length = " + this.f5114b + "]";
        }
    }

    /* compiled from: QueueFile */
    public interface d {
        void read(InputStream inputStream, int i2);
    }

    /* JADX INFO: finally extract failed */
    public u(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096);
                randomAccessFile.seek(0);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    b(bArr, i2, iArr[i3]);
                    i2 += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.e = randomAccessFile2;
        randomAccessFile2.seek(0);
        this.e.readFully(this.f5112j);
        int a2 = a(this.f5112j, 0);
        this.f5108f = a2;
        if (((long) a2) <= this.e.length()) {
            this.f5109g = a(this.f5112j, 4);
            int a3 = a(this.f5112j, 8);
            int a4 = a(this.f5112j, 12);
            this.f5110h = c(a3);
            this.f5111i = c(a4);
            return;
        }
        StringBuilder a5 = i.a.a.a.a.a("File is truncated. Expected length: ");
        a5.append(this.f5108f);
        a5.append(", Actual length: ");
        a5.append(this.e.length());
        throw new IOException(a5.toString());
    }

    public static int a(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    public static void b(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    public final b c(int i2) {
        if (i2 == 0) {
            return b.c;
        }
        this.e.seek((long) i2);
        return new b(i2, this.e.readInt());
    }

    public synchronized void close() {
        this.e.close();
    }

    public final int d(int i2) {
        int i3 = this.f5108f;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    public synchronized boolean f() {
        return this.f5109g == 0;
    }

    public synchronized void h() {
        if (f()) {
            throw new NoSuchElementException();
        } else if (this.f5109g == 1) {
            a();
        } else {
            int d2 = d(this.f5110h.a + 4 + this.f5110h.f5114b);
            a(d2, this.f5112j, 0, 4);
            int a2 = a(this.f5112j, 0);
            a(this.f5108f, this.f5109g - 1, d2, this.f5111i.a);
            this.f5109g--;
            this.f5110h = new b(d2, a2);
        }
    }

    public int j() {
        if (this.f5109g == 0) {
            return 16;
        }
        b bVar = this.f5111i;
        int i2 = bVar.a;
        int i3 = this.f5110h.a;
        if (i2 >= i3) {
            return (i2 - i3) + 4 + bVar.f5114b + 16;
        }
        return (((i2 + 4) + bVar.f5114b) + this.f5108f) - i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(u.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f5108f);
        sb.append(", size=");
        sb.append(this.f5109g);
        sb.append(", first=");
        sb.append(this.f5110h);
        sb.append(", last=");
        sb.append(this.f5111i);
        sb.append(", element lengths=[");
        try {
            a(new a(this, sb));
        } catch (IOException e2) {
            f5107k.log(Level.WARNING, "read error", e2);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final void a(int i2, int i3, int i4, int i5) {
        byte[] bArr = this.f5112j;
        int[] iArr = {i2, i3, i4, i5};
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            b(bArr, i6, iArr[i7]);
            i6 += 4;
        }
        this.e.seek(0);
        this.e.write(this.f5112j);
    }

    public final void b(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.f5108f;
        if (i2 >= i5) {
            i2 = (i2 + 16) - i5;
        }
        int i6 = i2 + i4;
        int i7 = this.f5108f;
        if (i6 <= i7) {
            this.e.seek((long) i2);
            this.e.write(bArr, i3, i4);
            return;
        }
        int i8 = i7 - i2;
        this.e.seek((long) i2);
        this.e.write(bArr, i3, i8);
        this.e.seek(16);
        this.e.write(bArr, i3 + i8, i4 - i8);
    }

    public static /* synthetic */ int a(u uVar, int i2) {
        int i3 = uVar.f5108f;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    /* compiled from: QueueFile */
    public final class c extends InputStream {
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f5115f;

        public /* synthetic */ c(b bVar, a aVar) {
            int i2 = bVar.a + 4;
            int i3 = u.this.f5108f;
            this.e = i2 >= i3 ? (i2 + 16) - i3 : i2;
            this.f5115f = bVar.f5114b;
        }

        public int read(byte[] bArr, int i2, int i3) {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                int i4 = this.f5115f;
                if (i4 <= 0) {
                    return -1;
                }
                if (i3 > i4) {
                    i3 = i4;
                }
                u.this.a(this.e, bArr, i2, i3);
                this.e = u.a(u.this, this.e + i3);
                this.f5115f -= i3;
                return i3;
            }
        }

        public int read() {
            if (this.f5115f == 0) {
                return -1;
            }
            u.this.e.seek((long) this.e);
            int read = u.this.e.read();
            this.e = u.a(u.this, this.e + 1);
            this.f5115f--;
            return read;
        }
    }

    public final void a(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.f5108f;
        if (i2 >= i5) {
            i2 = (i2 + 16) - i5;
        }
        int i6 = i2 + i4;
        int i7 = this.f5108f;
        if (i6 <= i7) {
            this.e.seek((long) i2);
            this.e.readFully(bArr, i3, i4);
            return;
        }
        int i8 = i7 - i2;
        this.e.seek((long) i2);
        this.e.readFully(bArr, i3, i8);
        this.e.seek(16);
        this.e.readFully(bArr, i3 + i8, i4 - i8);
    }

    public final void b(int i2) {
        int i3 = i2 + 4;
        int j2 = this.f5108f - j();
        if (j2 < i3) {
            int i4 = this.f5108f;
            do {
                j2 += i4;
                i4 <<= 1;
            } while (j2 < i3);
            this.e.setLength((long) i4);
            this.e.getChannel().force(true);
            b bVar = this.f5111i;
            int d2 = d(bVar.a + 4 + bVar.f5114b);
            if (d2 < this.f5110h.a) {
                FileChannel channel = this.e.getChannel();
                channel.position((long) this.f5108f);
                long j3 = (long) (d2 - 4);
                if (channel.transferTo(16, j3, channel) != j3) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i5 = this.f5111i.a;
            int i6 = this.f5110h.a;
            if (i5 < i6) {
                int i7 = (this.f5108f + i5) - 16;
                a(i4, this.f5109g, i6, i7);
                this.f5111i = new b(i7, this.f5111i.f5114b);
            } else {
                a(i4, this.f5109g, i6, i5);
            }
            this.f5108f = i4;
        }
    }

    public synchronized void a(byte[] bArr, int i2, int i3) {
        int i4;
        if (bArr == null) {
            throw new NullPointerException("buffer");
        } else if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        } else {
            b(i3);
            boolean f2 = f();
            if (f2) {
                i4 = 16;
            } else {
                i4 = d(this.f5111i.a + 4 + this.f5111i.f5114b);
            }
            b bVar = new b(i4, i3);
            b(this.f5112j, 0, i3);
            b(bVar.a, this.f5112j, 0, 4);
            b(bVar.a + 4, bArr, i2, i3);
            a(this.f5108f, this.f5109g + 1, f2 ? bVar.a : this.f5110h.a, bVar.a);
            this.f5111i = bVar;
            this.f5109g++;
            if (f2) {
                this.f5110h = bVar;
            }
        }
    }

    public synchronized void a(d dVar) {
        int i2 = this.f5110h.a;
        for (int i3 = 0; i3 < this.f5109g; i3++) {
            b c2 = c(i2);
            dVar.read(new c(c2, (a) null), c2.f5114b);
            i2 = d(c2.a + 4 + c2.f5114b);
        }
    }

    public synchronized void a() {
        a((int) CodedOutputStream.DEFAULT_BUFFER_SIZE, 0, 0, 0);
        this.f5109g = 0;
        this.f5110h = b.c;
        this.f5111i = b.c;
        if (this.f5108f > 4096) {
            this.e.setLength((long) CodedOutputStream.DEFAULT_BUFFER_SIZE);
            this.e.getChannel().force(true);
        }
        this.f5108f = CodedOutputStream.DEFAULT_BUFFER_SIZE;
    }
}
