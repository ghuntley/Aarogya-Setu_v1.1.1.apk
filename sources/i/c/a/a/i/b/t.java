package i.c.a.a.i.b;

import android.util.SparseArray;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public abstract class t {

    /* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    public enum a {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        
        public static final SparseArray<a> A = null;
        public final int e;

        /* access modifiers changed from: public */
        static {
            UNKNOWN_MOBILE_SUBTYPE = new a("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            GPRS = new a("GPRS", 1, 1);
            EDGE = new a("EDGE", 2, 2);
            UMTS = new a("UMTS", 3, 3);
            CDMA = new a("CDMA", 4, 4);
            EVDO_0 = new a("EVDO_0", 5, 5);
            EVDO_A = new a("EVDO_A", 6, 6);
            RTT = new a("RTT", 7, 7);
            HSDPA = new a("HSDPA", 8, 8);
            HSUPA = new a("HSUPA", 9, 9);
            HSPA = new a("HSPA", 10, 10);
            IDEN = new a("IDEN", 11, 11);
            EVDO_B = new a("EVDO_B", 12, 12);
            LTE = new a("LTE", 13, 13);
            EHRPD = new a("EHRPD", 14, 14);
            HSPAP = new a("HSPAP", 15, 15);
            GSM = new a("GSM", 16, 16);
            TD_SCDMA = new a("TD_SCDMA", 17, 17);
            IWLAN = new a("IWLAN", 18, 18);
            LTE_CA = new a("LTE_CA", 19, 19);
            COMBINED = new a("COMBINED", 20, 100);
            SparseArray<a> sparseArray = new SparseArray<>();
            A = sparseArray;
            sparseArray.put(0, UNKNOWN_MOBILE_SUBTYPE);
            A.put(1, GPRS);
            A.put(2, EDGE);
            A.put(3, UMTS);
            A.put(4, CDMA);
            A.put(5, EVDO_0);
            A.put(6, EVDO_A);
            A.put(7, RTT);
            A.put(8, HSDPA);
            A.put(9, HSUPA);
            A.put(10, HSPA);
            A.put(11, IDEN);
            A.put(12, EVDO_B);
            A.put(13, LTE);
            A.put(14, EHRPD);
            A.put(15, HSPAP);
            A.put(16, GSM);
            A.put(17, TD_SCDMA);
            A.put(18, IWLAN);
            A.put(19, LTE_CA);
        }

        /* access modifiers changed from: public */
        a(int i2) {
            this.e = i2;
        }
    }

    /* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
    public enum b {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        
        public static final SparseArray<b> y = null;
        public final int e;

        /* access modifiers changed from: public */
        static {
            MOBILE = new b("MOBILE", 0, 0);
            WIFI = new b("WIFI", 1, 1);
            MOBILE_MMS = new b("MOBILE_MMS", 2, 2);
            MOBILE_SUPL = new b("MOBILE_SUPL", 3, 3);
            MOBILE_DUN = new b("MOBILE_DUN", 4, 4);
            MOBILE_HIPRI = new b("MOBILE_HIPRI", 5, 5);
            WIMAX = new b("WIMAX", 6, 6);
            BLUETOOTH = new b("BLUETOOTH", 7, 7);
            DUMMY = new b("DUMMY", 8, 8);
            ETHERNET = new b("ETHERNET", 9, 9);
            MOBILE_FOTA = new b("MOBILE_FOTA", 10, 10);
            MOBILE_IMS = new b("MOBILE_IMS", 11, 11);
            MOBILE_CBS = new b("MOBILE_CBS", 12, 12);
            WIFI_P2P = new b("WIFI_P2P", 13, 13);
            MOBILE_IA = new b("MOBILE_IA", 14, 14);
            MOBILE_EMERGENCY = new b("MOBILE_EMERGENCY", 15, 15);
            PROXY = new b("PROXY", 16, 16);
            VPN = new b("VPN", 17, 17);
            NONE = new b("NONE", 18, -1);
            SparseArray<b> sparseArray = new SparseArray<>();
            y = sparseArray;
            sparseArray.put(0, MOBILE);
            y.put(1, WIFI);
            y.put(2, MOBILE_MMS);
            y.put(3, MOBILE_SUPL);
            y.put(4, MOBILE_DUN);
            y.put(5, MOBILE_HIPRI);
            y.put(6, WIMAX);
            y.put(7, BLUETOOTH);
            y.put(8, DUMMY);
            y.put(9, ETHERNET);
            y.put(10, MOBILE_FOTA);
            y.put(11, MOBILE_IMS);
            y.put(12, MOBILE_CBS);
            y.put(13, WIFI_P2P);
            y.put(14, MOBILE_IA);
            y.put(15, MOBILE_EMERGENCY);
            y.put(16, PROXY);
            y.put(17, VPN);
            y.put(-1, NONE);
        }

        /* access modifiers changed from: public */
        b(int i2) {
            this.e = i2;
        }
    }
}
