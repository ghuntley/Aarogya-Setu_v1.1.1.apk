package l.a.a.a.o.b;

/* compiled from: DeliveryMechanism */
public enum m {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    public final int e;

    /* access modifiers changed from: public */
    m(int i2) {
        this.e = i2;
    }

    public static m a(String str) {
        if ("io.crash.air".equals(str)) {
            return TEST_DISTRIBUTION;
        }
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    public String toString() {
        return Integer.toString(this.e);
    }
}
