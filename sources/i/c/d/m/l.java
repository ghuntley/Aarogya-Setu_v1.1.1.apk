package i.c.d.m;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public class l {
    public static final byte a = Byte.parseByte("01110000", 2);

    /* renamed from: b  reason: collision with root package name */
    public static final byte f4732b = Byte.parseByte("00001111", 2);

    public String a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        array[16] = array[0];
        array[0] = (byte) ((f4732b & array[0]) | a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
