package i.c.d.j;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public interface c {

    /* compiled from: com.google.firebase:firebase-common@@19.3.0 */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        public final int e;

        /* access modifiers changed from: public */
        a(int i2) {
            this.e = i2;
        }
    }

    a a(String str);
}
