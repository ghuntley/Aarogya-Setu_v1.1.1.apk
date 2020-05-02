package com.crashlytics.android.core;

import android.content.Context;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import l.a.a.a.o.b.i;

public final class NativeFileUtils {
    public static byte[] binaryImagesJsonFromBinaryLibsFile(File file, Context context) {
        byte[] readFile = readFile(file);
        if (readFile == null || readFile.length == 0) {
            return null;
        }
        return processBinaryImages(context, new String(readFile));
    }

    public static byte[] binaryImagesJsonFromDirectory(File file, Context context) {
        File filter = filter(file, ".maps");
        if (filter != null) {
            return binaryImagesJsonFromMapsFile(filter, context);
        }
        File filter2 = filter(file, ".binary_libs");
        if (filter2 != null) {
            return binaryImagesJsonFromBinaryLibsFile(filter2, context);
        }
        return null;
    }

    public static byte[] binaryImagesJsonFromMapsFile(File file, Context context) {
        BufferedReader bufferedReader = null;
        if (!file.exists()) {
            return null;
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            try {
                byte[] convert = new BinaryImagesConverter(context, new Sha1FileIdStrategy()).convert(bufferedReader2);
                i.a((Closeable) bufferedReader2);
                return convert;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                i.a((Closeable) bufferedReader);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i.a((Closeable) bufferedReader);
            throw th;
        }
    }

    public static File filter(File file, String str) {
        for (File file2 : file.listFiles()) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    public static byte[] metadataJsonFromDirectory(File file) {
        File filter = filter(file, ".device_info");
        if (filter == null) {
            return null;
        }
        return readFile(filter);
    }

    public static byte[] minidumpFromDirectory(File file) {
        File filter = filter(file, ".dmp");
        if (filter == null) {
            return new byte[0];
        }
        return minidumpFromFile(filter);
    }

    public static byte[] minidumpFromFile(File file) {
        return readFile(file);
    }

    public static byte[] processBinaryImages(Context context, String str) {
        return new BinaryImagesConverter(context, new Sha1FileIdStrategy()).convert(str);
    }

    public static byte[] readBytes(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static byte[] readFile(File file) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] readBytes = readBytes(fileInputStream);
                i.a((Closeable) fileInputStream);
                return readBytes;
            } catch (FileNotFoundException unused) {
                i.a((Closeable) fileInputStream);
                return null;
            } catch (IOException unused2) {
                i.a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                i.a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
            i.a((Closeable) fileInputStream);
            return null;
        } catch (IOException unused4) {
            fileInputStream = null;
            i.a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            i.a((Closeable) fileInputStream2);
            throw th;
        }
    }
}
