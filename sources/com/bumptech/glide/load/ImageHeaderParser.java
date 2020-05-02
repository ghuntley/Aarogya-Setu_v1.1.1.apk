package com.bumptech.glide.load;

import i.b.a.n.m.b0.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        public final boolean e;

        /* access modifiers changed from: public */
        ImageType(boolean z) {
            this.e = z;
        }

        public boolean hasAlpha() {
            return this.e;
        }
    }

    int a(InputStream inputStream, b bVar);

    ImageType a(InputStream inputStream);

    ImageType a(ByteBuffer byteBuffer);
}
