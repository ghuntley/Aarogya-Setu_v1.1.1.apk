package i.c.a.b.d;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new q();

    /* renamed from: i  reason: collision with root package name */
    public static final b f3013i = new b(0);
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3014f;

    /* renamed from: g  reason: collision with root package name */
    public final PendingIntent f3015g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3016h;

    public b(int i2) {
        this.e = 1;
        this.f3014f = i2;
        this.f3015g = null;
        this.f3016h = null;
    }

    public static String a(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean d() {
        return this.f3014f == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3014f == bVar.f3014f && q.b((Object) this.f3015g, (Object) bVar.f3015g) && q.b((Object) this.f3016h, (Object) bVar.f3016h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3014f), this.f3015g, this.f3016h});
    }

    public final String toString() {
        q.a c = q.c((Object) this);
        c.a("statusCode", a(this.f3014f));
        c.a("resolution", this.f3015g);
        c.a("message", this.f3016h);
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f3014f);
        q.a(parcel, 3, (Parcelable) this.f3015g, i2, false);
        q.a(parcel, 4, this.f3016h, false);
        q.m(parcel, a);
    }

    public b(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.e = i2;
        this.f3014f = i3;
        this.f3015g = pendingIntent;
        this.f3016h = str;
    }

    public b(int i2, PendingIntent pendingIntent) {
        this.e = 1;
        this.f3014f = i2;
        this.f3015g = pendingIntent;
        this.f3016h = null;
    }
}
