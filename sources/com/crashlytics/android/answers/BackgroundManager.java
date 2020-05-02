package com.crashlytics.android.answers;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l.a.a.a.f;

public class BackgroundManager {
    public static final int BACKGROUND_DELAY = 5000;
    public final AtomicReference<ScheduledFuture<?>> backgroundFutureRef = new AtomicReference<>();
    public final ScheduledExecutorService executorService;
    public volatile boolean flushOnBackground = true;
    public boolean inBackground = true;
    public final List<Listener> listeners = new ArrayList();

    public interface Listener {
        void onBackground();
    }

    public BackgroundManager(ScheduledExecutorService scheduledExecutorService) {
        this.executorService = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public void notifyBackground() {
        for (Listener onBackground : this.listeners) {
            onBackground.onBackground();
        }
    }

    public void onActivityPaused() {
        if (this.flushOnBackground && !this.inBackground) {
            this.inBackground = true;
            try {
                this.backgroundFutureRef.compareAndSet((Object) null, this.executorService.schedule(new Runnable() {
                    public void run() {
                        BackgroundManager.this.backgroundFutureRef.set((Object) null);
                        BackgroundManager.this.notifyBackground();
                    }
                }, 5000, TimeUnit.MILLISECONDS));
            } catch (RejectedExecutionException e) {
                if (f.a().a(Answers.TAG, 3)) {
                    Log.d(Answers.TAG, "Failed to schedule background detector", e);
                }
            }
        }
    }

    public void onActivityResumed() {
        this.inBackground = false;
        ScheduledFuture andSet = this.backgroundFutureRef.getAndSet((Object) null);
        if (andSet != null) {
            andSet.cancel(false);
        }
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
    }

    public void setFlushOnBackground(boolean z) {
        this.flushOnBackground = z;
    }
}
