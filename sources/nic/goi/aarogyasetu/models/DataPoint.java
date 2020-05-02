package nic.goi.aarogyasetu.models;

import i.c.e.s.b;
import java.util.ArrayList;
import java.util.List;

public class DataPoint {
    @b("dl")
    public List<Dl> dl = null;
    @b("l")
    public LocationObject locationObject;
    @b("ts")
    public String ts;

    public DataPoint(BluetoothData bluetoothData, String str, String str2) {
        this.ts = String.valueOf(bluetoothData.getTimeStamp());
        this.locationObject = new LocationObject(str, str2);
        ArrayList arrayList = new ArrayList();
        this.dl = arrayList;
        arrayList.add(new Dl(bluetoothData.getBluetoothMacAddress(), bluetoothData.getDistance(), bluetoothData.getTxPowerLevel(), bluetoothData.getTxPower()));
    }
}
