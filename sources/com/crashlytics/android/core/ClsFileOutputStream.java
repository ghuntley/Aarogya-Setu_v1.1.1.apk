package com.crashlytics.android.core;

import i.a.a.a.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

public class ClsFileOutputStream extends FileOutputStream {
    public static final String IN_PROGRESS_SESSION_FILE_EXTENSION = ".cls_temp";
    public static final String SESSION_FILE_EXTENSION = ".cls";
    public static final FilenameFilter TEMP_FILENAME_FILTER = new FilenameFilter() {
        public boolean accept(File file, String str) {
            return str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION);
        }
    };
    public boolean closed;
    public File complete;
    public File inProgress;
    public final String root;

    public ClsFileOutputStream(String str, String str2) {
        this(new File(str), str2);
    }

    public synchronized void close() {
        if (!this.closed) {
            this.closed = true;
            super.flush();
            super.close();
            File file = new File(this.root + SESSION_FILE_EXTENSION);
            if (this.inProgress.renameTo(file)) {
                this.inProgress = null;
                this.complete = file;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.inProgress.exists()) {
                str = " (source does not exist)";
            }
            throw new IOException("Could not rename temp file: " + this.inProgress + " -> " + file + str);
        }
    }

    public void closeInProgressStream() {
        if (!this.closed) {
            this.closed = true;
            super.flush();
            super.close();
        }
    }

    public File getCompleteFile() {
        return this.complete;
    }

    public File getInProgressFile() {
        return this.inProgress;
    }

    public ClsFileOutputStream(File file, String str) {
        super(new File(file, a.b(str, IN_PROGRESS_SESSION_FILE_EXTENSION)));
        this.closed = false;
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        this.root = a.a(sb, File.separator, str);
        this.inProgress = new File(a.a(new StringBuilder(), this.root, IN_PROGRESS_SESSION_FILE_EXTENSION));
    }
}
