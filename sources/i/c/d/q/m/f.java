package i.c.d.q.m;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class f {
    public static final Date e = new Date(0);
    public JSONObject a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f4791b;
    public Date c;
    public JSONArray d;

    /* compiled from: com.google.firebase:firebase-config@@19.1.3 */
    public static class b {
        public JSONObject a = new JSONObject();

        /* renamed from: b  reason: collision with root package name */
        public Date f4792b = f.e;
        public JSONArray c = new JSONArray();

        public /* synthetic */ b(a aVar) {
        }

        public f a() {
            return new f(this.a, this.f4792b, this.c);
        }
    }

    public f(JSONObject jSONObject, Date date, JSONArray jSONArray) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs_key", jSONObject);
        jSONObject2.put("fetch_time_key", date.getTime());
        jSONObject2.put("abt_experiments_key", jSONArray);
        this.f4791b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.a = jSONObject2;
    }

    public static f a(JSONObject jSONObject) {
        return new f(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.a.toString().equals(((f) obj).toString());
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    public static b a() {
        return new b((a) null);
    }
}
