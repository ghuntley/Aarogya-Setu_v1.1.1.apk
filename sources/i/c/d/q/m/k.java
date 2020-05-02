package i.c.d.q.m;

import android.text.format.DateUtils;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.b;
import i.c.a.b.d.o.c;
import i.c.a.b.l.g;
import i.c.d.k.s;
import i.c.d.q.m.m;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class k {

    /* renamed from: j  reason: collision with root package name */
    public static final long f4796j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4797k = {2, 4, 8, 16, 32, 64, 128, 256};
    public final FirebaseInstanceId a;

    /* renamed from: b  reason: collision with root package name */
    public final i.c.d.e.a.a f4798b;
    public final Executor c;
    public final b d;
    public final Random e;

    /* renamed from: f  reason: collision with root package name */
    public final e f4799f;

    /* renamed from: g  reason: collision with root package name */
    public final ConfigFetchHttpClient f4800g;

    /* renamed from: h  reason: collision with root package name */
    public final m f4801h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, String> f4802i;

    /* compiled from: com.google.firebase:firebase-config@@19.1.3 */
    public static class a {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final f f4803b;
        public final String c;

        public a(Date date, int i2, f fVar, String str) {
            this.a = i2;
            this.f4803b = fVar;
            this.c = str;
        }
    }

    public k(FirebaseInstanceId firebaseInstanceId, i.c.d.e.a.a aVar, Executor executor, b bVar, Random random, e eVar, ConfigFetchHttpClient configFetchHttpClient, m mVar, Map<String, String> map) {
        this.a = firebaseInstanceId;
        this.f4798b = aVar;
        this.c = executor;
        this.d = bVar;
        this.e = random;
        this.f4799f = eVar;
        this.f4800g = configFetchHttpClient;
        this.f4801h = mVar;
        this.f4802i = map;
    }

    public static /* synthetic */ g a(k kVar, long j2, g gVar) {
        g<TContinuationResult> gVar2;
        boolean z;
        Date date = null;
        if (kVar == null) {
            throw null;
        } else if (((c) kVar.d) != null) {
            Date date2 = new Date(System.currentTimeMillis());
            if (gVar.d()) {
                m mVar = kVar.f4801h;
                if (mVar != null) {
                    Date date3 = new Date(mVar.a.getLong("last_fetch_time_in_millis", -1));
                    if (date3.equals(m.d)) {
                        z = false;
                    } else {
                        z = date2.before(new Date(TimeUnit.SECONDS.toMillis(j2) + date3.getTime()));
                    }
                    if (z) {
                        return q.b(new a(date2, 2, (f) null, (String) null));
                    }
                } else {
                    throw null;
                }
            }
            Date date4 = kVar.f4801h.a().f4806b;
            if (date2.before(date4)) {
                date = date4;
            }
            if (date != null) {
                gVar2 = q.a((Exception) new FirebaseRemoteConfigFetchThrottledException(String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date.getTime() - date2.getTime()))}), date.getTime()));
            } else {
                FirebaseInstanceId firebaseInstanceId = kVar.a;
                gVar2 = firebaseInstanceId.a(s.a(firebaseInstanceId.f701b), "*").b(kVar.c, new h(kVar, date2));
            }
            return gVar2.b(kVar.c, new i(kVar, date2));
        } else {
            throw null;
        }
    }

    public static /* synthetic */ g b(k kVar, Date date, g gVar) {
        if (kVar != null) {
            if (gVar.d()) {
                kVar.f4801h.a(date);
            } else {
                Exception a2 = gVar.a();
                if (a2 != null) {
                    if (a2 instanceof FirebaseRemoteConfigFetchThrottledException) {
                        kVar.f4801h.c();
                    } else {
                        kVar.f4801h.b();
                    }
                }
            }
            return gVar;
        }
        throw null;
    }

    public static /* synthetic */ g a(k kVar, Date date, g gVar) {
        if (!gVar.d()) {
            return q.a((Exception) new FirebaseRemoteConfigClientException("Failed to get Firebase Instance ID token for fetch.", gVar.a()));
        }
        i.c.d.k.a aVar = (i.c.d.k.a) gVar.b();
        if (kVar != null) {
            try {
                a a2 = kVar.a(aVar, date);
                if (a2.a != 0) {
                    return q.b(a2);
                }
                return kVar.f4799f.a(a2.f4803b).a(kVar.c, new j(a2));
            } catch (FirebaseRemoteConfigException e2) {
                return q.a((Exception) e2);
            }
        } else {
            throw null;
        }
    }

    public final a a(i.c.d.k.a aVar, Date date) {
        String str;
        boolean z = false;
        try {
            HttpURLConnection a2 = this.f4800g.a();
            ConfigFetchHttpClient configFetchHttpClient = this.f4800g;
            String d2 = aVar.d();
            String a3 = aVar.a();
            HashMap hashMap = new HashMap();
            i.c.d.e.a.a aVar2 = this.f4798b;
            if (aVar2 != null) {
                for (Map.Entry next : aVar2.a(false).entrySet()) {
                    hashMap.put((String) next.getKey(), next.getValue().toString());
                }
            }
            a fetch = configFetchHttpClient.fetch(a2, d2, a3, hashMap, this.f4801h.a.getString("last_fetch_etag", (String) null), this.f4802i, date);
            if (fetch.c != null) {
                this.f4801h.a(fetch.c);
            }
            this.f4801h.a(0, m.e);
            return fetch;
        } catch (FirebaseRemoteConfigServerException e2) {
            int i2 = e2.e;
            if (i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504) {
                int i3 = this.f4801h.a().a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f4797k;
                long millis = timeUnit.toMillis((long) iArr[Math.min(i3, iArr.length) - 1]);
                this.f4801h.a(i3, new Date(date.getTime() + (millis / 2) + ((long) this.e.nextInt((int) millis))));
            }
            m.a a4 = this.f4801h.a();
            int i4 = e2.e;
            if (a4.a > 1 || i4 == 429) {
                z = true;
            }
            if (!z) {
                int i5 = e2.e;
                if (i5 == 401) {
                    str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                } else if (i5 == 403) {
                    str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                } else if (i5 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                } else if (i5 != 500) {
                    switch (i5) {
                        case 502:
                        case 503:
                        case 504:
                            str = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str = "There was an internal server error.";
                }
                throw new FirebaseRemoteConfigServerException(e2.e, i.a.a.a.a.b("Fetch failed: ", str), e2);
            }
            throw new FirebaseRemoteConfigFetchThrottledException(a4.f4806b.getTime());
        }
    }
}
