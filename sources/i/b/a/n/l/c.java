package i.b.a.n.l;

import com.crashlytics.android.core.LogFileManager;
import i.b.a.n.m.b0.b;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream */
public final class c extends OutputStream {
    public final OutputStream e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f2503f;

    /* renamed from: g  reason: collision with root package name */
    public b f2504g;

    /* renamed from: h  reason: collision with root package name */
    public int f2505h;

    public c(OutputStream outputStream, b bVar) {
        this.e = outputStream;
        this.f2504g = bVar;
        this.f2503f = (byte[]) bVar.b(LogFileManager.MAX_LOG_SIZE, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.e.close();
            byte[] bArr = this.f2503f;
            if (bArr != null) {
                this.f2504g.put(bArr);
                this.f2503f = null;
            }
        } catch (Throwable th) {
            this.e.close();
            throw th;
        }
    }

    public void flush() {
        int i2 = this.f2505h;
        if (i2 > 0) {
            this.e.write(this.f2503f, 0, i2);
            this.f2505h = 0;
        }
        this.e.flush();
    }

    public void write(int i2) {
        byte[] bArr = this.f2503f;
        int i3 = this.f2505h;
        int i4 = i3 + 1;
        this.f2505h = i4;
        bArr[i3] = (byte) i2;
        if (i4 == bArr.length && i4 > 0) {
            this.e.write(bArr, 0, i4);
            this.f2505h = 0;
        }
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            if (this.f2505h != 0 || i5 < this.f2503f.length) {
                int min = Math.min(i5, this.f2503f.length - this.f2505h);
                System.arraycopy(bArr, i6, this.f2503f, this.f2505h, min);
                int i7 = this.f2505h + min;
                this.f2505h = i7;
                i4 += min;
                byte[] bArr2 = this.f2503f;
                if (i7 == bArr2.length && i7 > 0) {
                    this.e.write(bArr2, 0, i7);
                    this.f2505h = 0;
                    continue;
                }
            } else {
                this.e.write(bArr, i6, i5);
                return;
            }
        } while (i4 < i3);
    }
}
