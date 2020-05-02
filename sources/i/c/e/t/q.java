package i.c.e.t;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber */
public final class q extends Number {
    public final String e;

    public q(String str) {
        this.e = str;
    }

    public double doubleValue() {
        return Double.parseDouble(this.e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        String str = this.e;
        String str2 = ((q) obj).e;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    public float floatValue() {
        return Float.parseFloat(this.e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.e).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.e     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.e     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.e
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.e.t.q.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.e);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.e).longValue();
        }
    }

    public String toString() {
        return this.e;
    }
}
