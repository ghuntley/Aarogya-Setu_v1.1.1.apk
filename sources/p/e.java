package p;

import java.io.OutputStream;

/* compiled from: Buffer */
public class e extends OutputStream {
    public final /* synthetic */ f e;

    public e(f fVar) {
        this.e = fVar;
    }

    public void close() {
    }

    public void flush() {
    }

    public String toString() {
        return this.e + ".outputStream()";
    }

    public void write(int i2) {
        this.e.writeByte((int) (byte) i2);
    }

    public void write(byte[] bArr, int i2, int i3) {
        this.e.write(bArr, i2, i3);
    }
}
