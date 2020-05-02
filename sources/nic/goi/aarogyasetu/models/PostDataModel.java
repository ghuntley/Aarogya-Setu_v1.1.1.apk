package nic.goi.aarogyasetu.models;

import i.c.e.s.b;
import java.util.List;

public class PostDataModel {
    @b("d")
    public String d;
    @b("data")
    public List<DataPoint> data = null;

    public String getD() {
        return this.d;
    }

    public List<DataPoint> getData() {
        return this.data;
    }

    public void setD(String str) {
        this.d = str;
    }

    public void setData(List<DataPoint> list) {
        this.data = list;
    }
}
