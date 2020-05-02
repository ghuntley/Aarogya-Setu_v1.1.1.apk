package com.crashlytics.android.answers;

import l.a.a.a.o.c.m.d;

public class RetryManager {
    public static final long NANOSECONDS_IN_MS = 1000000;
    public long lastRetry;
    public d retryState;

    public RetryManager(d dVar) {
        if (dVar != null) {
            this.retryState = dVar;
            return;
        }
        throw new NullPointerException("retryState must not be null");
    }

    public boolean canRetry(long j2) {
        d dVar = this.retryState;
        return j2 - this.lastRetry >= dVar.f5147b.getDelayMillis(dVar.a) * NANOSECONDS_IN_MS;
    }

    public void recordRetry(long j2) {
        this.lastRetry = j2;
        d dVar = this.retryState;
        this.retryState = new d(dVar.a + 1, dVar.f5147b, dVar.c);
    }

    public void reset() {
        this.lastRetry = 0;
        d dVar = this.retryState;
        this.retryState = new d(dVar.f5147b, dVar.c);
    }
}
