package nic.goi.aarogyasetu.models;

import i.c.e.s.b;

public class Dl {
    @b("d")
    public String d;
    @b("dist")
    public Integer dist;
    @b("tx_level")
    public String txLevel;
    @b("tx_power")
    public String txPower;

    public Dl(String str, Integer num, String str2, String str3) {
        this.d = str;
        this.dist = num;
        this.txPower = str3;
        this.txLevel = str2;
    }

    public String getD() {
        return this.d;
    }

    public void setD(String str) {
        this.d = str;
    }
}
