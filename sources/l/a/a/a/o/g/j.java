package l.a.a.a.o.g;

import com.crashlytics.android.beta.BuildConfig;
import l.a.a.a.o.b.k;
import l.a.a.a.o.b.v;
import l.a.a.a.o.d.b;
import org.json.JSONObject;

/* compiled from: DefaultSettingsJsonTransform */
public class j {
    public s a(k kVar, JSONObject jSONObject) {
        c cVar;
        long currentTimeMillis;
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("app");
        String string = jSONObject3.getString("identifier");
        String string2 = jSONObject3.getString("status");
        String string3 = jSONObject3.getString("url");
        String string4 = jSONObject3.getString("reports_url");
        String string5 = jSONObject3.getString("ndk_reports_url");
        boolean optBoolean = jSONObject3.optBoolean("update_required", false);
        if (!jSONObject3.has("icon") || !jSONObject3.getJSONObject("icon").has("hash")) {
            cVar = null;
        } else {
            JSONObject jSONObject4 = jSONObject3.getJSONObject("icon");
            cVar = new c(jSONObject4.getString("hash"), jSONObject4.getInt("width"), jSONObject4.getInt("height"));
        }
        e eVar = new e(string, string2, string3, string4, string5, optBoolean, cVar);
        JSONObject jSONObject5 = jSONObject2.getJSONObject("session");
        o oVar = new o(jSONObject5.optInt("log_buffer_size", 64000), jSONObject5.optInt("max_chained_exception_depth", 8), jSONObject5.optInt("max_custom_exception_events", 64), jSONObject5.optInt("max_custom_key_value_pairs", 64), jSONObject5.optInt("identifier_mask", 255), jSONObject5.optBoolean("send_session_without_crash", false), jSONObject5.optInt("max_complete_sessions_count", 4));
        JSONObject jSONObject6 = jSONObject2.getJSONObject("prompt");
        n nVar = new n(jSONObject6.optString("title", "Send Crash Report?"), jSONObject6.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jSONObject6.optString("send_button_title", "Send"), jSONObject6.optBoolean("show_cancel_button", true), jSONObject6.optString("cancel_button_title", "Don't Send"), jSONObject6.optBoolean("show_always_send_button", true), jSONObject6.optString("always_send_button_title", "Always Send"));
        JSONObject jSONObject7 = jSONObject2.getJSONObject("features");
        l lVar = new l(jSONObject7.optBoolean("prompt_enabled", false), jSONObject7.optBoolean("collect_logged_exceptions", true), jSONObject7.optBoolean("collect_reports", true), jSONObject7.optBoolean("collect_analytics", false), jSONObject7.optBoolean("firebase_crashlytics_enabled", false));
        JSONObject jSONObject8 = jSONObject2.getJSONObject("analytics");
        b bVar = new b(jSONObject8.optString("url", "https://e.crashlytics.com/spi/v2/events"), jSONObject8.optInt("flush_interval_secs", 600), jSONObject8.optInt("max_byte_size_per_file", b.MAX_BYTE_SIZE_PER_FILE), jSONObject8.optInt("max_file_count_per_send", 1), jSONObject8.optInt("max_pending_send_file_count", 100), jSONObject8.optBoolean("forward_to_google_analytics", false), jSONObject8.optBoolean("include_purchase_events_in_forwarded_events", false), jSONObject8.optBoolean("track_custom_events", true), jSONObject8.optBoolean("track_predefined_events", true), jSONObject8.optInt("sampling_rate", 1), jSONObject8.optBoolean("flush_on_background", true));
        JSONObject jSONObject9 = jSONObject2.getJSONObject(BuildConfig.ARTIFACT_ID);
        f fVar = new f(jSONObject9.optString("update_endpoint", (String) null), jSONObject9.optInt("update_suspend_duration", 3600));
        long j2 = (long) optInt2;
        if (jSONObject2.has("expires_at")) {
            currentTimeMillis = jSONObject2.getLong("expires_at");
        } else if (((v) kVar) != null) {
            currentTimeMillis = (j2 * 1000) + System.currentTimeMillis();
        } else {
            throw null;
        }
        return new s(currentTimeMillis, eVar, oVar, nVar, lVar, bVar, fVar, optInt, optInt2);
    }
}
