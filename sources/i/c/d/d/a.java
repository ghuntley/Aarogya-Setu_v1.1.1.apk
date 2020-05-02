package i.c.d.d;

import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public class a {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f4639g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h  reason: collision with root package name */
    public static final DateFormat f4640h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4641b;
    public final String c;
    public final Date d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4642f;

    public a(String str, String str2, String str3, Date date, long j2, long j3) {
        this.a = str;
        this.f4641b = str2;
        this.c = str3;
        this.d = date;
        this.e = j2;
        this.f4642f = j3;
    }

    public static a a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f4639g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            try {
                return new a(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f4640h.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
            } catch (ParseException e2) {
                throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
            } catch (NumberFormatException e3) {
                throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e3);
            }
        } else {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }
}
