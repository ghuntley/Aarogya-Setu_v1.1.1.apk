package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import i.c.a.b.d.l.q;
import i.c.a.b.g.g.pc;
import i.c.a.b.i.a.s5;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public class Analytics {
    public static volatile Analytics a;

    public Analytics(s5 s5Var) {
        q.a(s5Var);
    }

    @Keep
    public static Analytics getInstance(Context context) {
        if (a == null) {
            synchronized (Analytics.class) {
                if (a == null) {
                    a = new Analytics(s5.a(context, (pc) null));
                }
            }
        }
        return a;
    }
}
