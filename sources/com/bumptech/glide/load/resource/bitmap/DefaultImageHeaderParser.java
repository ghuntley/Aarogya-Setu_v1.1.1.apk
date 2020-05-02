package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class DefaultImageHeaderParser implements ImageHeaderParser {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f455b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int a(byte[] bArr, int i2);

        short b();

        long skip(long j2);
    }

    public static final class a implements Reader {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public int a() {
            return (b() << 8) | b();
        }

        public short b() {
            if (this.a.remaining() >= 1) {
                return (short) (this.a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        public long skip(long j2) {
            int min = (int) Math.min((long) this.a.remaining(), j2);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        public int a(byte[] bArr, int i2) {
            int min = Math.min(i2, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }
    }

    public static final class b {
        public final ByteBuffer a;

        public b(byte[] bArr, int i2) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
        }

        public short a(int i2) {
            if (this.a.remaining() - i2 >= 2) {
                return this.a.getShort(i2);
            }
            return -1;
        }

        public int b(int i2) {
            if (this.a.remaining() - i2 >= 4) {
                return this.a.getInt(i2);
            }
            return -1;
        }
    }

    public static final class c implements Reader {
        public final InputStream a;

        public c(InputStream inputStream) {
            this.a = inputStream;
        }

        public int a() {
            return (b() << 8) | b();
        }

        public short b() {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        public long skip(long j2) {
            if (j2 < 0) {
                return 0;
            }
            long j3 = j2;
            while (j3 > 0) {
                long skip = this.a.skip(j3);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j3 -= skip;
            }
            return j2 - j3;
        }

        public int a(byte[] bArr, int i2) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2 && (i4 = this.a.read(bArr, i3, i2 - i3)) != -1) {
                i3 += i4;
            }
            if (i3 != 0 || i4 != -1) {
                return i3;
            }
            throw new Reader.EndOfFileException();
        }
    }

    public ImageHeaderParser.ImageType a(InputStream inputStream) {
        g.a.a.b.a.a(inputStream, "Argument must not be null");
        return a((Reader) new c(inputStream));
    }

    public final int b(Reader reader) {
        short b2;
        int a2;
        long j2;
        long skip;
        do {
            short b3 = reader.b();
            if (b3 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + b3);
                }
                return -1;
            }
            b2 = reader.b();
            if (b2 == 218) {
                return -1;
            }
            if (b2 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a2 = reader.a() - 2;
            if (b2 == 225) {
                return a2;
            }
            j2 = (long) a2;
            skip = reader.skip(j2);
        } while (skip == j2);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + b2 + ", wanted to skip: " + a2 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        g.a.a.b.a.a(byteBuffer, "Argument must not be null");
        return a((Reader) new a(byteBuffer));
    }

    public int a(InputStream inputStream, i.b.a.n.m.b0.b bVar) {
        byte[] bArr;
        g.a.a.b.a.a(inputStream, "Argument must not be null");
        c cVar = new c(inputStream);
        g.a.a.b.a.a(bVar, "Argument must not be null");
        try {
            int a2 = cVar.a();
            if ((a2 & 65496) == 65496 || a2 == 19789 || a2 == 18761) {
                int b2 = b(cVar);
                if (b2 != -1) {
                    bArr = (byte[]) bVar.b(b2, byte[].class);
                    int a3 = a(cVar, bArr, b2);
                    bVar.put(bArr);
                    return a3;
                } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                } else {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                return -1;
            } else {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a2);
                return -1;
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        } catch (Throwable th) {
            bVar.put(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType a(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r6) {
        /*
            r5 = this;
            int r0 = r6.a()     // Catch:{ EndOfFileException -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.b()     // Catch:{ EndOfFileException -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.b()     // Catch:{ EndOfFileException -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00a0 }
            short r6 = r6.b()     // Catch:{ EndOfFileException -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ EndOfFileException -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00a0 }
            int r2 = r6.a()     // Catch:{ EndOfFileException -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.a()     // Catch:{ EndOfFileException -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.a()     // Catch:{ EndOfFileException -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.a()     // Catch:{ EndOfFileException -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00a0 }
            short r6 = r6.b()     // Catch:{ EndOfFileException -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00a0 }
            short r6 = r6.b()     // Catch:{ EndOfFileException -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.a(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public final int a(Reader reader, byte[] bArr, int i2) {
        ByteOrder byteOrder;
        int a2 = reader.a(bArr, i2);
        if (a2 != i2) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i2 + ", actually read: " + a2);
            }
            return -1;
        }
        boolean z = bArr != null && i2 > a.length;
        if (z) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i3 >= bArr2.length) {
                    break;
                } else if (bArr[i3] != bArr2[i3]) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (z) {
            b bVar = new b(bArr, i2);
            short a3 = bVar.a(6);
            if (a3 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (a3 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + a3);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            bVar.a.order(byteOrder);
            int b2 = bVar.b(10) + 6;
            short a4 = bVar.a(b2);
            for (int i4 = 0; i4 < a4; i4++) {
                int i5 = (i4 * 12) + b2 + 2;
                short a5 = bVar.a(i5);
                if (a5 == 274) {
                    short a6 = bVar.a(i5 + 2);
                    if (a6 >= 1 && a6 <= 12) {
                        int b3 = bVar.b(i5 + 4);
                        if (b3 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got tagIndex=" + i4 + " tagType=" + a5 + " formatCode=" + a6 + " componentCount=" + b3);
                            }
                            int i6 = b3 + f455b[a6];
                            if (i6 <= 4) {
                                int i7 = i5 + 8;
                                if (i7 < 0 || i7 > bVar.a.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i7 + " tagType=" + a5);
                                    }
                                } else if (i6 >= 0 && i6 + i7 <= bVar.a.remaining()) {
                                    return bVar.a(i7);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a5);
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a6);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + a6);
                    }
                }
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }
}
