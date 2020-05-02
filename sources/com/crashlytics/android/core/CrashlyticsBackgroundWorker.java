package com.crashlytics.android.core;

import android.os.Looper;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import l.a.a.a.f;

public class CrashlyticsBackgroundWorker {
    public final ExecutorService executorService;

    public CrashlyticsBackgroundWorker(ExecutorService executorService2) {
        this.executorService = executorService2;
    }

    public Future<?> submit(final Runnable runnable) {
        try {
            return this.executorService.submit(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        if (f.a().a(CrashlyticsCore.TAG, 6)) {
                            Log.e(CrashlyticsCore.TAG, "Failed to execute task.", e);
                        }
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            if (f.a().a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, "Executor is shut down because we're handling a fatal crash.", (Throwable) null);
            }
            return null;
        }
    }

    public <T> T submitAndWait(Callable<T> callable) {
        try {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                return this.executorService.submit(callable).get(4, TimeUnit.SECONDS);
            }
            return this.executorService.submit(callable).get();
        } catch (RejectedExecutionException unused) {
            if (f.a().a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, "Executor is shut down because we're handling a fatal crash.", (Throwable) null);
            }
            return null;
        } catch (Exception e) {
            if (f.a().a(CrashlyticsCore.TAG, 6)) {
                Log.e(CrashlyticsCore.TAG, "Failed to execute task.", e);
            }
            return null;
        }
    }

    public <T> Future<T> submit(final Callable<T> callable) {
        try {
            return this.executorService.submit(new Callable<T>() {
                public T call() {
                    try {
                        return callable.call();
                    } catch (Exception e) {
                        if (!f.a().a(CrashlyticsCore.TAG, 6)) {
                            return null;
                        }
                        Log.e(CrashlyticsCore.TAG, "Failed to execute task.", e);
                        return null;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            if (f.a().a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, "Executor is shut down because we're handling a fatal crash.", (Throwable) null);
            }
            return null;
        }
    }
}
