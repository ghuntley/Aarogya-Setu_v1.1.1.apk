package h.s.n;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: CopyLock */
public class a {
    public static final Map<String, Lock> e = new HashMap();
    public final File a;

    /* renamed from: b  reason: collision with root package name */
    public final Lock f2217b;
    public final boolean c;
    public FileChannel d;

    public a(String str, File file, boolean z) {
        File file2 = new File(file, i.a.a.a.a.b(str, ".lck"));
        this.a = file2;
        this.f2217b = a(file2.getAbsolutePath());
        this.c = z;
    }

    public void a() {
        FileChannel fileChannel = this.d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f2217b.unlock();
    }

    public static Lock a(String str) {
        Lock lock;
        synchronized (e) {
            lock = e.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                e.put(str, lock);
            }
        }
        return lock;
    }
}
