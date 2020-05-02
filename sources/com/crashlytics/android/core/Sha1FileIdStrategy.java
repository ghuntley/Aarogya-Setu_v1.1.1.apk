package com.crashlytics.android.core;

import com.crashlytics.android.core.BinaryImagesConverter;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import l.a.a.a.o.b.i;

public class Sha1FileIdStrategy implements BinaryImagesConverter.FileIdStrategy {
    public static String getFileSHA(String str) {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String a = i.a((InputStream) bufferedInputStream2);
                i.a((Closeable) bufferedInputStream2);
                return a;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                i.a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i.a((Closeable) bufferedInputStream);
            throw th;
        }
    }

    public String createId(File file) {
        return getFileSHA(file.getPath());
    }
}
