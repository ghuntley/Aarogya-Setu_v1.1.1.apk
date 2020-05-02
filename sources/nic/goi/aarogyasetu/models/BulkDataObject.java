package nic.goi.aarogyasetu.models;

import i.c.e.s.b;
import java.util.List;

public class BulkDataObject {
    @b("d")
    public String d;
    @b("data")
    public List<DataPoint> data;
    @b("upload_type")
    public String uploadType;

    public String getD() {
        return this.d;
    }

    public List<DataPoint> getData() {
        return this.data;
    }

    public String getUploadType() {
        return this.uploadType;
    }

    public void setD(String str) {
        this.d = str;
    }

    public void setData(List<DataPoint> list) {
        this.data = list;
    }

    public void setUploadType(String str) {
        this.uploadType = str;
    }
}
