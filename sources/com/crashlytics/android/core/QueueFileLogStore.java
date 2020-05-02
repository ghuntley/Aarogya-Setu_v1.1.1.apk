package com.crashlytics.android.core;

import android.util.Log;
import i.a.a.a.a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import l.a.a.a.c;
import l.a.a.a.f;
import l.a.a.a.o.b.i;
import l.a.a.a.o.b.u;

public class QueueFileLogStore implements FileLogStore {
    public u logFile;
    public final int maxLogSize;
    public final File workingFile;

    public class LogBytes {
        public final byte[] bytes;
        public final int offset;

        public LogBytes(byte[] bArr, int i2) {
            this.bytes = bArr;
            this.offset = i2;
        }
    }

    public QueueFileLogStore(File file, int i2) {
        this.workingFile = file;
        this.maxLogSize = i2;
    }

    private void doWriteToLog(long j2, String str) {
        if (this.logFile != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i2 = this.maxLogSize / 4;
                if (str.length() > i2) {
                    str = "..." + str.substring(str.length() - i2);
                }
                byte[] bytes = String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes("UTF-8");
                u uVar = this.logFile;
                if (uVar != null) {
                    uVar.a(bytes, 0, bytes.length);
                    while (!this.logFile.f() && this.logFile.j() > this.maxLogSize) {
                        this.logFile.h();
                    }
                    return;
                }
                throw null;
            } catch (IOException e) {
                if (f.a().a(CrashlyticsCore.TAG, 6)) {
                    Log.e(CrashlyticsCore.TAG, "There was a problem writing to the Crashlytics log.", e);
                }
            }
        }
    }

    private LogBytes getLogBytes() {
        if (!this.workingFile.exists()) {
            return null;
        }
        openLogFile();
        u uVar = this.logFile;
        if (uVar == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[uVar.j()];
        try {
            this.logFile.a(new u.d() {
                public void read(InputStream inputStream, int i2) {
                    try {
                        inputStream.read(bArr, iArr[0], i2);
                        int[] iArr = iArr;
                        iArr[0] = iArr[0] + i2;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e) {
            if (f.a().a(CrashlyticsCore.TAG, 6)) {
                Log.e(CrashlyticsCore.TAG, "A problem occurred while reading the Crashlytics log file.", e);
            }
        }
        return new LogBytes(bArr, iArr[0]);
    }

    private void openLogFile() {
        if (this.logFile == null) {
            try {
                this.logFile = new u(this.workingFile);
            } catch (IOException e) {
                c a = f.a();
                StringBuilder a2 = a.a("Could not open log file: ");
                a2.append(this.workingFile);
                String sb = a2.toString();
                if (a.a(CrashlyticsCore.TAG, 6)) {
                    Log.e(CrashlyticsCore.TAG, sb, e);
                }
            }
        }
    }

    public void closeLogFile() {
        i.a((Closeable) this.logFile, "There was a problem closing the Crashlytics log file.");
        this.logFile = null;
    }

    public void deleteLogFile() {
        closeLogFile();
        this.workingFile.delete();
    }

    public ByteString getLogAsByteString() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        return ByteString.copyFrom(logBytes.bytes, 0, logBytes.offset);
    }

    public byte[] getLogAsBytes() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        return logBytes.bytes;
    }

    public void writeToLog(long j2, String str) {
        openLogFile();
        doWriteToLog(j2, str);
    }
}
