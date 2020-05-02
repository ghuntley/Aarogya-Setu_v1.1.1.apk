package i.c.d;

import android.content.Context;
import android.text.TextUtils;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.v;
import i.c.a.b.d.o.f;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public final class c {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4636b;
    public final String c;
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4637f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4638g;

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        q.b(!f.a(str), (Object) "ApplicationId must be set.");
        this.f4636b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f4637f = str6;
        this.f4638g = str7;
    }

    public static c a(Context context) {
        v vVar = new v(context);
        String a2 = vVar.a("google_app_id");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        return new c(a2, vVar.a("google_api_key"), vVar.a("firebase_database_url"), vVar.a("ga_trackingId"), vVar.a("gcm_defaultSenderId"), vVar.a("google_storage_bucket"), vVar.a("project_id"));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!q.b((Object) this.f4636b, (Object) cVar.f4636b) || !q.b((Object) this.a, (Object) cVar.a) || !q.b((Object) this.c, (Object) cVar.c) || !q.b((Object) this.d, (Object) cVar.d) || !q.b((Object) this.e, (Object) cVar.e) || !q.b((Object) this.f4637f, (Object) cVar.f4637f) || !q.b((Object) this.f4638g, (Object) cVar.f4638g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4636b, this.a, this.c, this.d, this.e, this.f4637f, this.f4638g});
    }

    public String toString() {
        q.a c2 = q.c((Object) this);
        c2.a("applicationId", this.f4636b);
        c2.a("apiKey", this.a);
        c2.a("databaseUrl", this.c);
        c2.a("gcmSenderId", this.e);
        c2.a("storageBucket", this.f4637f);
        c2.a("projectId", this.f4638g);
        return c2.toString();
    }
}
