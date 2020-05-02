package nic.goi.aarogyasetu.models;

import i.c.e.s.b;

public class LocationObject {
    @b("lat")
    public String lat;
    @b("lon")
    public String lon;

    public LocationObject(String str, String str2) {
        this.lat = str;
        this.lon = str2;
    }
}
