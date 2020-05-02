package i.c.d.q;

import android.util.Log;
import com.google.firebase.abt.AbtException;
import i.c.a.b.l.a;
import i.c.a.b.l.g;
import i.c.d.q.m.f;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public final /* synthetic */ class b implements a {
    public final g a;

    public b(g gVar) {
        this.a = gVar;
    }

    public Object a(g gVar) {
        boolean z;
        g gVar2 = this.a;
        if (gVar2 != null) {
            if (gVar.d()) {
                gVar2.d.a();
                if (gVar.b() != null) {
                    JSONArray jSONArray = ((f) gVar.b()).d;
                    if (gVar2.f4774b != null) {
                        try {
                            gVar2.f4774b.a(g.a(jSONArray));
                        } catch (JSONException e) {
                            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e);
                        } catch (AbtException e2) {
                            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
                        }
                    }
                } else {
                    Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
                }
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        throw null;
    }
}
