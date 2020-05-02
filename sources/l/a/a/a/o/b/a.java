package l.a.a.a.o.b;

import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import l.a.a.a.k;
import l.a.a.a.o.e.b;
import l.a.a.a.o.e.c;

/* compiled from: AbstractSpiCall */
public abstract class a {
    public static final String ACCEPT_JSON_VALUE = "application/json";
    public static final String ANDROID_CLIENT_TYPE = "android";
    public static final String CLS_ANDROID_SDK_DEVELOPER_TOKEN = "470fa2b4ae81cd56ecbcda9735803434cec591fa";
    public static final String CRASHLYTICS_USER_AGENT = "Crashlytics Android SDK/";
    public static final int DEFAULT_TIMEOUT = 10000;
    public static final String HEADER_ACCEPT = "Accept";
    public static final String HEADER_API_KEY = "X-CRASHLYTICS-API-KEY";
    public static final String HEADER_CLIENT_TYPE = "X-CRASHLYTICS-API-CLIENT-TYPE";
    public static final String HEADER_CLIENT_VERSION = "X-CRASHLYTICS-API-CLIENT-VERSION";
    public static final String HEADER_DEVELOPER_TOKEN = "X-CRASHLYTICS-DEVELOPER-TOKEN";
    public static final String HEADER_REQUEST_ID = "X-REQUEST-ID";
    public static final String HEADER_USER_AGENT = "User-Agent";
    public static final Pattern PROTOCOL_AND_HOST_PATTERN = Pattern.compile("http(s?)://[^\\/]+", 2);
    public final k kit;
    public final b method;
    public final String protocolAndHostOverride;
    public final c requestFactory;
    public final String url;

    public a(k kVar, String str, String str2, c cVar, b bVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (cVar != null) {
            this.kit = kVar;
            this.protocolAndHostOverride = str;
            this.url = overrideProtocolAndHost(str2);
            this.requestFactory = cVar;
            this.method = bVar;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    private String overrideProtocolAndHost(String str) {
        return !i.a(this.protocolAndHostOverride) ? PROTOCOL_AND_HOST_PATTERN.matcher(str).replaceFirst(this.protocolAndHostOverride) : str;
    }

    public HttpRequest getHttpRequest() {
        return getHttpRequest(Collections.emptyMap());
    }

    public String getUrl() {
        return this.url;
    }

    public HttpRequest getHttpRequest(Map<String, String> map) {
        HttpRequest a = ((l.a.a.a.o.e.a) this.requestFactory).a(this.method, getUrl(), map);
        a.d().setUseCaches(false);
        a.d().setConnectTimeout(DEFAULT_TIMEOUT);
        a.d().setRequestProperty(HEADER_USER_AGENT, CRASHLYTICS_USER_AGENT + this.kit.getVersion());
        a.d().setRequestProperty(HEADER_DEVELOPER_TOKEN, CLS_ANDROID_SDK_DEVELOPER_TOKEN);
        return a;
    }
}
