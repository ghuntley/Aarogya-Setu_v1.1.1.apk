package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import i.c.a.a.j.b;
import i.c.a.a.j.h;
import i.c.a.a.j.m;
import i.c.a.a.j.r.h.g;
import i.c.a.a.j.r.h.l;
import i.c.a.a.j.u.a;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static /* synthetic */ void a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        m.a(context);
        h.a a = h.a();
        a.a(queryParameter);
        a.a(a.a(intValue));
        if (queryParameter2 != null) {
            ((b.C0103b) a).f2934b = Base64.decode(queryParameter2, 0);
        }
        l lVar = m.a().d;
        lVar.e.execute(new g(lVar, a.a(), i2, i.c.a.a.j.r.h.a.e));
    }
}
