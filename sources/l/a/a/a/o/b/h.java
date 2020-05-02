package l.a.a.a.o.b;

import android.os.Process;

/* compiled from: BackgroundPriorityRunnable */
public abstract class h implements Runnable {
    public abstract void onRun();

    public final void run() {
        Process.setThreadPriority(10);
        onRun();
    }
}
