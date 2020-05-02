package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i.c.a.b.d.k.f;
import i.c.a.b.d.k.j;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class Status extends a implements f, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new j();

    /* renamed from: i  reason: collision with root package name */
    public static final Status f472i = new Status(0);

    /* renamed from: j  reason: collision with root package name */
    public static final Status f473j = new Status(14);

    /* renamed from: k  reason: collision with root package name */
    public static final Status f474k = new Status(15);

    /* renamed from: l  reason: collision with root package name */
    public static final Status f475l = new Status(16);
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f476f;

    /* renamed from: g  reason: collision with root package name */
    public final String f477g;

    /* renamed from: h  reason: collision with root package name */
    public final PendingIntent f478h;

    static {
        new Status(8);
        new Status(17);
        new Status(18);
    }

    public Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.e = i2;
        this.f476f = i3;
        this.f477g = str;
        this.f478h = pendingIntent;
    }

    public final Status c() {
        return this;
    }

    public final boolean d() {
        return this.f476f <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.e != status.e || this.f476f != status.f476f || !q.b((Object) this.f477g, (Object) status.f477g) || !q.b((Object) this.f478h, (Object) status.f478h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.f476f), this.f477g, this.f478h});
    }

    public final String toString() {
        q.a c = q.c((Object) this);
        String str = this.f477g;
        if (str == null) {
            int i2 = this.f476f;
            switch (i2) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unknown status code: ");
                    sb.append(i2);
                    str = sb.toString();
                    break;
            }
        }
        c.a("statusCode", str);
        c.a("resolution", this.f478h);
        return c.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.f476f);
        q.a(parcel, 2, this.f477g, false);
        q.a(parcel, 3, (Parcelable) this.f478h, i2, false);
        q.a(parcel, (int) AnswersRetryFilesSender.BACKOFF_MS, this.e);
        q.m(parcel, a);
    }

    public Status(int i2) {
        this(1, i2, (String) null, (PendingIntent) null);
    }

    public Status(int i2, String str) {
        this(1, i2, str, (PendingIntent) null);
    }
}
