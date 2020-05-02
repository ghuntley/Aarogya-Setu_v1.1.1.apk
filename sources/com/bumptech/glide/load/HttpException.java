package com.bumptech.glide.load;

import i.a.a.a.a;
import java.io.IOException;

public final class HttpException extends IOException {
    public HttpException(int i2) {
        super(a.b("Http request failed with status code: ", i2), (Throwable) null);
    }

    public HttpException(String str) {
        super(str, (Throwable) null);
    }

    public HttpException(String str, int i2) {
        super(str, (Throwable) null);
    }
}
