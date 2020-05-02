package p;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource */
public interface h extends a0, ReadableByteChannel {
    int a(t tVar);

    long a(byte b2);

    long a(z zVar);

    String a(Charset charset);

    @Deprecated
    f b();

    i b(long j2);

    String c(long j2);

    boolean d(long j2);

    short e();

    void g(long j2);

    f getBuffer();

    String i();

    byte[] i(long j2);

    int k();

    boolean l();

    long n();

    InputStream p();

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j2);
}
