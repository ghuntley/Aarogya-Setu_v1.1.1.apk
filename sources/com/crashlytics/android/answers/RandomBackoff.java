package com.crashlytics.android.answers;

import java.util.Random;
import l.a.a.a.o.c.m.a;

public class RandomBackoff implements a {
    public final a backoff;
    public final double jitterPercent;
    public final Random random;

    public RandomBackoff(a aVar, double d) {
        this(aVar, d, new Random());
    }

    public long getDelayMillis(int i2) {
        return (long) (randomJitter() * ((double) this.backoff.getDelayMillis(i2)));
    }

    public double randomJitter() {
        double d = this.jitterPercent;
        double d2 = 1.0d - d;
        return (((d + 1.0d) - d2) * this.random.nextDouble()) + d2;
    }

    public RandomBackoff(a aVar, double d, Random random2) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (aVar == null) {
            throw new NullPointerException("backoff must not be null");
        } else if (random2 != null) {
            this.backoff = aVar;
            this.jitterPercent = d;
            this.random = random2;
        } else {
            throw new NullPointerException("random must not be null");
        }
    }
}
