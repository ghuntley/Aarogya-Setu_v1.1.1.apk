package p;

import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink */
public interface g extends z, WritableByteChannel {
    g a(int i2);

    g a(long j2);

    g a(String str);

    g a(i iVar);

    f b();

    void flush();

    g g();

    g h(long j2);

    g write(byte[] bArr);

    g write(byte[] bArr, int i2, int i3);

    g writeByte(int i2);

    g writeInt(int i2);

    g writeShort(int i2);
}
