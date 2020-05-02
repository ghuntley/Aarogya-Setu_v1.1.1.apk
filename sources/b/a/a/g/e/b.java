package b.a.a.g.e;

import h.s.h;
import h.s.l;
import h.v.a.f.f;
import nic.goi.aarogyasetu.models.BluetoothData;
import nic.goi.aarogyasetu.models.Converters;

/* compiled from: BluetoothDataDao_Impl */
public final class b implements a {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final h.s.c<BluetoothData> f420b;
    public final l c;

    /* compiled from: BluetoothDataDao_Impl */
    public class a extends h.s.c<BluetoothData> {
        public a(b bVar, h hVar) {
            super(hVar);
        }

        public void a(f fVar, Object obj) {
            BluetoothData bluetoothData = (BluetoothData) obj;
            fVar.e.bindLong(1, (long) bluetoothData.getId());
            if (bluetoothData.getBluetoothMacAddress() == null) {
                fVar.e.bindNull(2);
            } else {
                fVar.e.bindString(2, bluetoothData.getBluetoothMacAddress());
            }
            if (bluetoothData.getDistance() == null) {
                fVar.e.bindNull(3);
            } else {
                fVar.e.bindLong(3, (long) bluetoothData.getDistance().intValue());
            }
            if (bluetoothData.getTxPower() == null) {
                fVar.e.bindNull(4);
            } else {
                fVar.e.bindString(4, bluetoothData.getTxPower());
            }
            if (bluetoothData.getTxPowerLevel() == null) {
                fVar.e.bindNull(5);
            } else {
                fVar.e.bindString(5, bluetoothData.getTxPowerLevel());
            }
            String fromArrayList = Converters.fromArrayList(bluetoothData.getLatitudeenc());
            if (fromArrayList == null) {
                fVar.e.bindNull(6);
            } else {
                fVar.e.bindString(6, fromArrayList);
            }
            String fromArrayList2 = Converters.fromArrayList(bluetoothData.getLongitudeenc());
            if (fromArrayList2 == null) {
                fVar.e.bindNull(7);
            } else {
                fVar.e.bindString(7, fromArrayList2);
            }
            if (bluetoothData.getTimeStamp() == null) {
                fVar.e.bindNull(8);
                return;
            }
            fVar.e.bindLong(8, (long) bluetoothData.getTimeStamp().intValue());
        }

        public String b() {
            return "INSERT OR ABORT INTO `nearby_devices_info_table` (`id`,`bluetooth_mac_address`,`distance`,`tx_power`,`tx_power_level`,`lat`,`long`,`timestamp`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: b.a.a.g.e.b$b  reason: collision with other inner class name */
    /* compiled from: BluetoothDataDao_Impl */
    public class C0007b extends h.s.b<BluetoothData> {
        public C0007b(b bVar, h hVar) {
            super(hVar);
        }

        public String b() {
            return "DELETE FROM `nearby_devices_info_table` WHERE `timestamp` = ?";
        }
    }

    /* compiled from: BluetoothDataDao_Impl */
    public class c extends l {
        public c(b bVar, h hVar) {
            super(hVar);
        }

        public String b() {
            return "DELETE FROM nearby_devices_info_table WHERE (? - timestamp) >= ?";
        }
    }

    public b(h hVar) {
        this.a = hVar;
        this.f420b = new a(this, hVar);
        new C0007b(this, hVar);
        this.c = new c(this, hVar);
    }
}
