package i.c.a.a.i.b;

import android.util.SparseArray;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public enum b {
    DEFAULT,
    UNMETERED_ONLY,
    UNMETERED_OR_DAILY,
    FAST_IF_RADIO_AWAKE,
    NEVER,
    UNRECOGNIZED;
    

    /* renamed from: k  reason: collision with root package name */
    public static final SparseArray<b> f2884k = null;

    /* access modifiers changed from: public */
    static {
        DEFAULT = new b("DEFAULT", 0);
        UNMETERED_ONLY = new b("UNMETERED_ONLY", 1);
        UNMETERED_OR_DAILY = new b("UNMETERED_OR_DAILY", 2);
        FAST_IF_RADIO_AWAKE = new b("FAST_IF_RADIO_AWAKE", 3);
        NEVER = new b("NEVER", 4);
        UNRECOGNIZED = new b("UNRECOGNIZED", 5);
        SparseArray<b> sparseArray = new SparseArray<>();
        f2884k = sparseArray;
        sparseArray.put(0, DEFAULT);
        f2884k.put(1, UNMETERED_ONLY);
        f2884k.put(2, UNMETERED_OR_DAILY);
        f2884k.put(3, FAST_IF_RADIO_AWAKE);
        f2884k.put(4, NEVER);
        f2884k.put(-1, UNRECOGNIZED);
    }
}
