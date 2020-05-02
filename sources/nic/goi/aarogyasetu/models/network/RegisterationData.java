package nic.goi.aarogyasetu.models.network;

import android.location.Location;
import i.c.e.s.b;
import nic.goi.aarogyasetu.CoronaApplication;

public class RegisterationData {
    @b("d")
    public String d;
    @b("ft")
    public String fcmToken;
    @b("is_bl_allowed")
    public boolean isBlAllowed;
    @b("is_bl_on")
    public boolean isBlOn;
    @b("is_loc_allowed")
    public boolean isLocAllowed;
    @b("is_loc_on")
    public boolean isLocOn;
    @b("lat")
    public String lat;
    @b("lon")
    public String lon;
    @b("n")

    /* renamed from: n  reason: collision with root package name */
    public String f5248n;

    public RegisterationData(String str, String str2, String str3) {
        this.f5248n = str;
        this.d = str2;
        this.fcmToken = str3;
        Location b2 = CoronaApplication.f5224g.b();
        if (b2 != null) {
            this.lat = String.valueOf(b2.getLatitude());
            this.lon = String.valueOf(b2.getLongitude());
        }
    }

    public String getD() {
        return this.d;
    }

    public String getLat() {
        return this.lat;
    }

    public String getLon() {
        return this.lon;
    }

    public String getN() {
        return this.f5248n;
    }

    public boolean isBlAllowed() {
        return this.isBlAllowed;
    }

    public boolean isBlOn() {
        return this.isBlOn;
    }

    public boolean isLocAllowed() {
        return this.isLocAllowed;
    }

    public boolean isLocOn() {
        return this.isLocOn;
    }

    public void setBlAllowed(boolean z) {
        this.isBlAllowed = z;
    }

    public void setBlOn(boolean z) {
        this.isBlOn = z;
    }

    public void setD(String str) {
        this.d = str;
    }

    public void setLocAllowed(boolean z) {
        this.isLocAllowed = z;
    }

    public void setLocOn(boolean z) {
        this.isLocOn = z;
    }

    public void setN(String str) {
        this.f5248n = str;
    }
}
