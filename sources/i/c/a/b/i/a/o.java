package i.c.a.b.i.a;

import android.content.Context;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import com.crashlytics.android.core.LogFileManager;
import i.c.a.b.g.g.c1;
import i.c.a.b.g.g.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l.a.a.a.o.b.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class o {
    public static f4<Long> A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, t0.a);
    public static f4<Boolean> A0 = a("measurement.app_launch.event_ordering_fix", true, true, a3.a);
    public static f4<Long> B = a("measurement.upload.retry_time", 1800000L, 1800000L, w0.a);
    public static f4<Boolean> B0 = a("measurement.sdk.collection.last_deep_link_referrer2", true, true, z2.a);
    public static f4<Integer> C = a("measurement.upload.retry_count", 6, 6, v0.a);
    public static f4<Boolean> C0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, d3.a);
    public static f4<Long> D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, y0.a);
    public static f4<Boolean> D0 = a("measurement.sdk.collection.last_gclid_from_referrer2", false, false, b3.a);
    public static f4<Integer> E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, x0.a);
    public static f4<Boolean> E0 = a("measurement.sdk.collection.worker_thread_referrer", true, true, f3.a);
    public static f4<Integer> F = a("measurement.audience.filter_result_max_count", 200, 200, z0.a);
    public static f4<Boolean> F0 = a("measurement.sdk.collection.enable_extend_user_property_size", true, true, h3.a);
    public static f4<Integer> G = a("measurement.upload.max_public_user_properties", 25, 25, (d4) null);
    public static f4<Boolean> G0 = a("measurement.upload.file_lock_state_check", false, false, g3.a);
    public static f4<Integer> H = a("measurement.upload.max_event_name_cardinality", 500, 500, (d4) null);
    public static f4<Boolean> H0 = a("measurement.sampling.calculate_bundle_timestamp_before_sampling", true, true, j3.a);
    public static f4<Integer> I = a("measurement.upload.max_public_event_params", 25, 25, (d4) null);
    public static f4<Boolean> I0 = a("measurement.ga.ga_app_id", false, false, i3.a);
    public static f4<Long> J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, d1.a);
    public static f4<Boolean> J0 = a("measurement.lifecycle.app_backgrounded_tracking", true, true, l3.a);
    public static f4<Boolean> K = a("measurement.test.boolean_flag", false, false, c1.a);
    public static f4<Boolean> K0 = a("measurement.lifecycle.app_in_background_parameter", false, false, k3.a);
    public static f4<String> L = a("measurement.test.string_flag", "---", "---", f1.a);
    public static f4<Boolean> L0 = a("measurement.integration.disable_firebase_instance_id", false, false, n3.a);
    public static f4<Long> M = a("measurement.test.long_flag", -1L, -1L, e1.a);
    public static f4<Boolean> M0 = a("measurement.lifecycle.app_backgrounded_engagement", false, false, m3.a);
    public static f4<Integer> N = a("measurement.test.int_flag", -2, -2, h1.a);
    public static f4<Boolean> N0 = a("measurement.service.fix_gmp_version", true, true, p3.a);
    public static f4<Double> O;
    public static f4<Boolean> O0 = a("measurement.collection.service.update_with_analytics_fix", false, false, o3.a);
    public static f4<Integer> P = a("measurement.experiment.max_ids", 50, 50, j1.a);
    public static f4<Boolean> P0 = a("measurement.service.disable_install_state_reporting", true, true, q3.a);
    public static f4<Integer> Q = a("measurement.max_bundles_per_iteration", 1, 1, i1.a);
    public static f4<Boolean> Q0 = a("measurement.service.use_appinfo_modified", false, false, t3.a);
    public static f4<Boolean> R = a("measurement.validation.internal_limits_internal_event_params", false, false, l1.a);
    public static f4<Boolean> R0 = a("measurement.client.firebase_feature_rollout.v1.enable", true, true, s3.a);
    public static f4<Boolean> S = a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", true, true, n1.a);
    public static f4<Boolean> S0 = a("measurement.client.sessions.check_on_reset_and_enable", false, false, v3.a);
    public static f4<Boolean> T = a("measurement.client.sessions.session_id_enabled", true, true, m1.a);
    public static f4<Boolean> T0 = a("measurement.config.string.always_update_disk_on_set", true, true, u3.a);
    public static f4<Boolean> U = a("measurement.service.sessions.session_number_enabled", true, true, p1.a);
    public static f4<Boolean> U0 = a("measurement.scheduler.task_thread.cleanup_on_exit", false, false, x3.a);
    public static f4<Boolean> V = a("measurement.client.sessions.background_sessions_enabled", true, true, o1.a);
    public static f4<Boolean> V0 = a("measurement.upload.file_truncate_fix", false, false, w3.a);
    public static f4<Boolean> W = a("measurement.client.sessions.remove_expired_session_properties_enabled", true, true, r1.a);
    public static f4<Boolean> W0 = a("measurement.engagement_time_main_thread", true, true, z3.a);
    public static f4<Boolean> X = a("measurement.service.sessions.session_number_backfill_enabled", true, true, q1.a);
    public static f4<Boolean> X0 = a("measurement.sdk.referrer.delayed_install_referrer_api", false, false, y3.a);
    public static f4<Boolean> Y = a("measurement.service.sessions.remove_disabled_session_number", true, true, t1.a);
    public static f4<Boolean> Y0 = a("measurement.logging.improved_messaging_q4_2019_client", true, true, b4.a);
    public static f4<Boolean> Z = a("measurement.client.sessions.start_session_before_view_screen", true, true, s1.a);
    public static f4<Boolean> Z0 = a("measurement.logging.improved_messaging_q4_2019_service", true, true, s.a);
    public static List<f4<?>> a = Collections.synchronizedList(new ArrayList());
    public static f4<Boolean> a0 = a("measurement.client.sessions.check_on_startup", true, true, v1.a);
    public static f4<Boolean> a1 = a("measurement.gold.enhanced_ecommerce.format_logs", false, false, v.a);

    /* renamed from: b  reason: collision with root package name */
    public static f4<Long> f3801b = a("measurement.ad_id_cache_time", 10000L, 10000L, r.a);
    public static f4<Boolean> b0 = a("measurement.collection.firebase_global_collection_flag_enabled", true, true, u1.a);
    public static f4<Boolean> b1 = a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", false, false, u.a);
    public static f4<Long> c = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, q.a);
    public static f4<Boolean> c0 = a("measurement.collection.efficient_engagement_reporting_enabled_2", false, false, w1.a);
    public static f4<Boolean> c1 = a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", false, false, x.a);
    public static f4<Long> d = a("measurement.config.cache_time", 86400000L, 3600000L, n0.a);
    public static f4<Boolean> d0 = a("measurement.collection.redundant_engagement_removal_enabled", false, false, z1.a);
    public static f4<Boolean> d1 = a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", false, false, w.a);
    public static f4<String> e = a("measurement.config.url_scheme", "https", "https", b1.a);
    public static f4<Boolean> e0 = a("measurement.personalized_ads_signals_collection_enabled", true, true, y1.a);
    public static f4<Boolean> e1 = a("measurement.gold.enhanced_ecommerce.updated_schema.client", false, false, a0.a);

    /* renamed from: f  reason: collision with root package name */
    public static f4<String> f3802f = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", k1.a);
    public static f4<Boolean> f0 = a("measurement.personalized_ads_property_translation_enabled", true, true, c2.a);
    public static f4<Boolean> f1 = a("measurement.gold.enhanced_ecommerce.updated_schema.service", false, false, y.a);

    /* renamed from: g  reason: collision with root package name */
    public static f4<Integer> f3803g = a("measurement.upload.max_bundles", 100, 100, x1.a);
    public static f4<Boolean> g0 = a("measurement.experiment.enable_experiment_reporting", true, true, a2.a);
    public static f4<Boolean> g1 = a("measurement.service.configurable_service_limits", false, false, b0.a);

    /* renamed from: h  reason: collision with root package name */
    public static f4<Integer> f3804h;
    public static f4<Boolean> h0 = a("measurement.collection.log_event_and_bundle_v2", true, true, e2.a);
    public static f4<Boolean> h1 = a("measurement.client.configurable_service_limits", false, false, e0.a);

    /* renamed from: i  reason: collision with root package name */
    public static f4<Integer> f3805i;
    public static f4<Boolean> i0 = a("measurement.quality.checksum", false, false, (d4) null);
    public static f4<Boolean> i1 = a("measurement.androidId.delete_feature", true, true, g0.a);

    /* renamed from: j  reason: collision with root package name */
    public static f4<Integer> f3806j;
    public static f4<Boolean> j0 = a("measurement.sdk.dynamite.use_dynamite3", false, false, g2.a);

    /* renamed from: k  reason: collision with root package name */
    public static f4<Integer> f3807k = a("measurement.upload.max_events_per_day", 100000, 100000, r3.a);
    public static f4<Boolean> k0 = a("measurement.sdk.dynamite.allow_remote_dynamite", false, false, f2.a);

    /* renamed from: l  reason: collision with root package name */
    public static f4<Integer> f3808l;
    public static f4<Boolean> l0 = a("measurement.sdk.collection.validate_param_names_alphabetical", true, true, i2.a);

    /* renamed from: m  reason: collision with root package name */
    public static f4<Integer> f3809m = a("measurement.upload.max_public_events_per_day", 50000, 50000, d0.a);
    public static f4<Boolean> m0 = a("measurement.collection.event_safelist", true, true, k2.a);

    /* renamed from: n  reason: collision with root package name */
    public static f4<Integer> f3810n;
    public static f4<Boolean> n0 = a("measurement.service.audience.scoped_filters_v27", true, true, j2.a);

    /* renamed from: o  reason: collision with root package name */
    public static f4<Integer> f3811o = a("measurement.upload.max_realtime_events_per_day", 10, 10, i0.a);
    public static f4<Boolean> o0 = a("measurement.service.audience.session_scoped_event_aggregates", true, true, m2.a);

    /* renamed from: p  reason: collision with root package name */
    public static f4<Integer> f3812p = a("measurement.store.max_stored_events_per_app", 100000, 100000, h0.a);
    public static f4<Boolean> p0 = a("measurement.service.audience.session_scoped_user_engagement", true, true, l2.a);

    /* renamed from: q  reason: collision with root package name */
    public static f4<String> f3813q = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", k0.a);
    public static f4<Boolean> q0 = a("measurement.service.audience.scoped_engagement_removal_when_session_expired", true, true, o2.a);
    public static f4<Long> r = a("measurement.upload.backoff_period", 43200000L, 43200000L, j0.a);
    public static f4<Boolean> r0 = a("measurement.client.audience.scoped_engagement_removal_when_session_expired", true, true, n2.a);
    public static f4<Long> s = a("measurement.upload.window_interval", 3600000L, 3600000L, m0.a);
    public static f4<Boolean> s0 = a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", false, false, q2.a);
    public static f4<Long> t = a("measurement.upload.interval", 3600000L, 3600000L, l0.a);
    public static f4<Boolean> t0 = a("measurement.service.audience.use_bundle_timestamp_for_property_filters", true, true, p2.a);
    public static f4<Long> u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, o0.a);
    public static f4<Boolean> u0 = a("measurement.service.audience.fix_prepending_previous_sequence_timestamp", true, true, s2.a);
    public static f4<Long> v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, q0.a);
    public static f4<Boolean> v0 = a("measurement.service.audience.fix_skip_audience_with_failed_filters", true, true, t2.a);
    public static f4<Long> w = a("measurement.upload.minimum_delay", 500L, 500L, p0.a);
    public static f4<Boolean> w0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, w2.a);
    public static f4<Long> x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, s0.a);
    public static f4<Boolean> x0 = a("measurement.audience.refresh_event_count_filters_timestamp", false, false, v2.a);
    public static f4<Long> y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, r0.a);
    public static f4<Boolean> y0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, y2.a);
    public static f4<Long> z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, u0.a);
    public static f4<Boolean> z0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, x2.a);

    static {
        Collections.synchronizedSet(new HashSet());
        Integer valueOf = Integer.valueOf(LogFileManager.MAX_LOG_SIZE);
        f3804h = a("measurement.upload.max_batch_size", valueOf, valueOf, h2.a);
        f3805i = a("measurement.upload.max_bundle_size", valueOf, valueOf, u2.a);
        Integer valueOf2 = Integer.valueOf(AnswersRetryFilesSender.BACKOFF_MS);
        f3806j = a("measurement.upload.max_events_per_bundle", valueOf2, valueOf2, e3.a);
        f3808l = a("measurement.upload.max_error_events_per_day", valueOf2, valueOf2, t.a);
        Integer valueOf3 = Integer.valueOf(a.DEFAULT_TIMEOUT);
        f3810n = a("measurement.upload.max_conversions_per_day", valueOf3, valueOf3, f0.a);
        Double valueOf4 = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf4, valueOf4, g1.a);
        a("measurement.module.collection.conditionally_omit_admob_app_id", true, true, d2.a);
        a("measurement.service.audience.invalidate_config_cache_after_app_unisntall", true, true, r2.a);
        a("measurement.collection.synthetic_data_mitigation", false, false, c0.a);
    }

    public static Map<String, String> a(Context context) {
        c1 a2 = c1.a(context.getContentResolver(), p1.a("com.google.android.gms.measurement"));
        return a2 == null ? Collections.emptyMap() : a2.a();
    }

    public static <V> f4<V> a(String str, V v2, V v3, d4<V> d4Var) {
        f4 f4Var = new f4(str, v2, v3, d4Var, (a4) null);
        a.add(f4Var);
        return f4Var;
    }
}
