package i.c.a.a.j.p;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public abstract class g {

    /* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public static g a() {
        return new b(a.FATAL_ERROR, -1);
    }
}
