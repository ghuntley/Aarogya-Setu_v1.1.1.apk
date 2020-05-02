package com.crashlytics.android.core;

import android.os.AsyncTask;
import android.util.Log;
import i.a.a.a.a;
import l.a.a.a.c;
import l.a.a.a.f;

public class CrashTest {
    private void privateMethodThatThrowsException(String str) {
        throw new RuntimeException(str);
    }

    public void crashAsyncTask(final long j2) {
        new AsyncTask<Void, Void, Void>() {
            public Void doInBackground(Void... voidArr) {
                try {
                    Thread.sleep(j2);
                } catch (InterruptedException unused) {
                }
                CrashTest.this.throwRuntimeException("Background thread crash");
                return null;
            }
        }.execute(new Void[]{null});
    }

    public void indexOutOfBounds() {
        int i2 = new int[2][10];
        c a = f.a();
        String b2 = a.b("Out of bounds value: ", i2);
        if (a.a(CrashlyticsCore.TAG, 3)) {
            Log.d(CrashlyticsCore.TAG, b2, (Throwable) null);
        }
    }

    public int stackOverflow() {
        return stackOverflow() + ((int) Math.random());
    }

    public void throwFiveChainedExceptions() {
        try {
            privateMethodThatThrowsException("1");
        } catch (Exception e) {
            throw new RuntimeException("2", e);
        } catch (Exception e2) {
            try {
                throw new RuntimeException("3", e2);
            } catch (Exception e3) {
                try {
                    throw new RuntimeException("4", e3);
                } catch (Exception e4) {
                    throw new RuntimeException("5", e4);
                }
            }
        }
    }

    public void throwRuntimeException(String str) {
        throw new RuntimeException(str);
    }
}
