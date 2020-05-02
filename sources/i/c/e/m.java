package i.c.e;

import i.c.e.t.q;
import java.math.BigInteger;

/* compiled from: JsonPrimitive */
public final class m extends j {
    public final Object a;

    public m(Boolean bool) {
        if (bool != null) {
            this.a = bool;
            return;
        }
        throw null;
    }

    public static boolean a(m mVar) {
        Object obj = mVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    public int c() {
        return this.a instanceof Number ? i().intValue() : Integer.parseInt(f());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a == null) {
            if (mVar.a == null) {
                return true;
            }
            return false;
        } else if (!a(this) || !a(mVar)) {
            if (!(this.a instanceof Number) || !(mVar.a instanceof Number)) {
                return this.a.equals(mVar.a);
            }
            double doubleValue = i().doubleValue();
            double doubleValue2 = mVar.i().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (i().longValue() == mVar.i().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public String f() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return i().toString();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        }
        return (String) obj;
    }

    public boolean h() {
        Object obj = this.a;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return Boolean.parseBoolean(f());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (a(this)) {
            doubleToLongBits = i().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(i().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public Number i() {
        Object obj = this.a;
        return obj instanceof String ? new q((String) this.a) : (Number) obj;
    }

    public m(Number number) {
        if (number != null) {
            this.a = number;
            return;
        }
        throw null;
    }

    public m(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw null;
    }
}
