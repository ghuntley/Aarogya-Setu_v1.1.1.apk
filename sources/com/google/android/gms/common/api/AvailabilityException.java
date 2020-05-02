package com.google.android.gms.common.api;

import android.text.TextUtils;
import h.e.a;
import i.c.a.b.d.k.h.b;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class AvailabilityException extends Exception {
    public final a<b<?>, i.c.a.b.d.b> e;

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (b next : this.e.keySet()) {
            i.c.a.b.d.b bVar = this.e.get(next);
            if (bVar.d()) {
                z = false;
            }
            String str = next.c.c;
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + i.a.a.a.a.a(str, 2));
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
