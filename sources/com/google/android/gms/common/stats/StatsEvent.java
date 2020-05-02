package com.google.android.gms.common.stats;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i.c.a.b.d.l.w.a;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public abstract class StatsEvent extends a implements ReflectedParcelable {
    public String toString() {
        String str;
        WakeLockEvent wakeLockEvent = (WakeLockEvent) this;
        long j2 = wakeLockEvent.f487f;
        int i2 = wakeLockEvent.f488g;
        long j3 = wakeLockEvent.t;
        String str2 = wakeLockEvent.f489h;
        int i3 = wakeLockEvent.f492k;
        List<String> list = wakeLockEvent.f493l;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(",", list);
        }
        int i4 = wakeLockEvent.f496o;
        String str4 = wakeLockEvent.f490i;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = wakeLockEvent.f497p;
        if (str5 == null) {
            str5 = str3;
        }
        float f2 = wakeLockEvent.f498q;
        String str6 = wakeLockEvent.f491j;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = wakeLockEvent.s;
        StringBuilder sb = new StringBuilder(str3.length() + str5.length() + str4.length() + i.a.a.a.a.a(str, i.a.a.a.a.a(str2, 51)));
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(i3);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i4);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(f2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(z);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(i.a.a.a.a.a(sb2, 53));
        sb3.append(j2);
        sb3.append("\t");
        sb3.append(i2);
        sb3.append("\t");
        sb3.append(j3);
        sb3.append(sb2);
        return sb3.toString();
    }
}
