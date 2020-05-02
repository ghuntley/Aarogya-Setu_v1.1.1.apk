package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Build;
import java.util.Map;
import java.util.UUID;
import l.a.a.a.o.b.b;
import l.a.a.a.o.b.i;
import l.a.a.a.o.b.s;

public class SessionMetadataCollector {
    public final Context context;
    public final s idManager;
    public final String versionCode;
    public final String versionName;

    public SessionMetadataCollector(Context context2, s sVar, String str, String str2) {
        this.context = context2;
        this.idManager = sVar;
        this.versionCode = str;
        this.versionName = str2;
    }

    public SessionEventMetadata getMetadata() {
        b a;
        Map<s.a, String> c = this.idManager.c();
        s sVar = this.idManager;
        String str = sVar.f5091f;
        String b2 = sVar.b();
        s sVar2 = this.idManager;
        Boolean valueOf = (!(sVar2.c && !sVar2.f5097l.a(sVar2.e)) || (a = sVar2.a()) == null) ? null : Boolean.valueOf(a.f5058b);
        String str2 = c.get(s.a.FONT_TOKEN);
        String j2 = i.j(this.context);
        s sVar3 = this.idManager;
        if (sVar3 != null) {
            return new SessionEventMetadata(str, UUID.randomUUID().toString(), b2, valueOf, str2, j2, sVar3.a(Build.VERSION.RELEASE) + "/" + sVar3.a(Build.VERSION.INCREMENTAL), this.idManager.e(), this.versionCode, this.versionName);
        }
        throw null;
    }
}
