package i.c.d.q;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import i.c.d.d.b;
import i.c.d.q.m.e;
import i.c.d.q.m.k;
import i.c.d.q.m.l;
import i.c.d.q.m.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class g {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4774b;
    public final Executor c;
    public final e d;
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final e f4775f;

    /* renamed from: g  reason: collision with root package name */
    public final k f4776g;

    /* renamed from: h  reason: collision with root package name */
    public final l f4777h;

    /* renamed from: i  reason: collision with root package name */
    public final m f4778i;

    public g(Context context, FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, b bVar, Executor executor, e eVar, e eVar2, e eVar3, k kVar, l lVar, m mVar) {
        this.a = context;
        this.f4774b = bVar;
        this.c = executor;
        this.d = eVar;
        this.e = eVar2;
        this.f4775f = eVar3;
        this.f4776g = kVar;
        this.f4777h = lVar;
        this.f4778i = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (i.c.d.q.m.l.d.matcher(r0).matches() != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (i.c.d.q.m.l.d.matcher(r1).matches() != false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r6) {
        /*
            r5 = this;
            i.c.d.q.m.l r0 = r5.f4777h
            i.c.d.q.m.e r1 = r0.a
            java.lang.String r1 = i.c.d.q.m.l.b(r1, r6)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0026
            java.util.regex.Pattern r4 = i.c.d.q.m.l.c
            java.util.regex.Matcher r4 = r4.matcher(r1)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L_0x0019
            goto L_0x004e
        L_0x0019:
            java.util.regex.Pattern r4 = i.c.d.q.m.l.d
            java.util.regex.Matcher r1 = r4.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            goto L_0x004d
        L_0x0026:
            i.c.d.q.m.e r0 = r0.f4804b
            java.lang.String r0 = i.c.d.q.m.l.b(r0, r6)
            if (r0 == 0) goto L_0x0048
            java.util.regex.Pattern r1 = i.c.d.q.m.l.c
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x003b
            goto L_0x004e
        L_0x003b:
            java.util.regex.Pattern r1 = i.c.d.q.m.l.d
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0048
            goto L_0x0025
        L_0x0048:
            java.lang.String r0 = "Boolean"
            i.c.d.q.m.l.a((java.lang.String) r6, (java.lang.String) r0)
        L_0x004d:
            r2 = 0
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.q.g.a(java.lang.String):boolean");
    }

    public static List<Map<String, String>> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }
}
