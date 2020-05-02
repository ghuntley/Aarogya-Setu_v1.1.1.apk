package b.a.a.l;

import android.database.Cursor;
import android.os.CancellationSignal;
import b.a.a.g.e.b;
import b.a.a.j.c;
import b.a.a.l.o;
import h.s.j;
import i.c.d.p.e;
import nic.goi.aarogyasetu.db.FightCovidDB;
import nic.goi.aarogyasetu.models.BulkDataObject;
import org.json.JSONObject;
import q.d0;

/* compiled from: UploadDataUtil.kt */
public final class e0 {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public FightCovidDB f425b;
    public int c;
    public final String d;
    public final a e;

    /* compiled from: UploadDataUtil.kt */
    public interface a {
        void d(String str);

        void e();
    }

    public e0() {
        this.d = null;
        this.e = null;
        this.a = 500;
        this.f425b = FightCovidDB.j();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: n.i.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: n.i.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: n.i.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: n.i.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: n.i.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: n.i.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: n.i.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final nic.goi.aarogyasetu.models.BulkDataObject a() {
        /*
            r18 = this;
            r1 = r18
            nic.goi.aarogyasetu.models.BulkDataObject r0 = new nic.goi.aarogyasetu.models.BulkDataObject
            r0.<init>()
            int r2 = r1.c
            java.lang.String r5 = "timestamp"
            java.lang.String r6 = "long"
            java.lang.String r7 = "lat"
            java.lang.String r8 = "tx_power_level"
            java.lang.String r9 = "tx_power"
            java.lang.String r10 = "distance"
            java.lang.String r11 = "bluetooth_mac_address"
            java.lang.String r12 = "id"
            r13 = 1
            if (r2 != 0) goto L_0x00e2
            nic.goi.aarogyasetu.db.FightCovidDB r2 = r1.f425b
            if (r2 == 0) goto L_0x00dc
            b.a.a.g.e.a r2 = r2.i()
            if (r2 == 0) goto L_0x00dc
            int r14 = r1.a
            b.a.a.g.e.b r2 = (b.a.a.g.e.b) r2
            java.lang.String r15 = "SELECT * FROM nearby_devices_info_table LIMIT ?"
            h.s.j r15 = h.s.j.a(r15, r13)
            long r3 = (long) r14
            r15.bindLong(r13, r3)
            h.s.h r3 = r2.a
            r3.b()
            h.s.h r2 = r2.a
            r3 = 0
            r4 = 0
            android.database.Cursor r2 = h.s.n.b.a(r2, r15, r3, r4)
            int r3 = g.a.a.b.a.a((android.database.Cursor) r2, (java.lang.String) r12)     // Catch:{ all -> 0x00d4 }
            int r4 = g.a.a.b.a.a((android.database.Cursor) r2, (java.lang.String) r11)     // Catch:{ all -> 0x00d4 }
            int r10 = g.a.a.b.a.a((android.database.Cursor) r2, (java.lang.String) r10)     // Catch:{ all -> 0x00d4 }
            int r9 = g.a.a.b.a.a((android.database.Cursor) r2, (java.lang.String) r9)     // Catch:{ all -> 0x00d4 }
            int r8 = g.a.a.b.a.a((android.database.Cursor) r2, (java.lang.String) r8)     // Catch:{ all -> 0x00d4 }
            int r7 = g.a.a.b.a.a((android.database.Cursor) r2, (java.lang.String) r7)     // Catch:{ all -> 0x00d4 }
            int r6 = g.a.a.b.a.a((android.database.Cursor) r2, (java.lang.String) r6)     // Catch:{ all -> 0x00d4 }
            int r5 = g.a.a.b.a.a((android.database.Cursor) r2, (java.lang.String) r5)     // Catch:{ all -> 0x00d4 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x00d4 }
            int r12 = r2.getCount()     // Catch:{ all -> 0x00d4 }
            r11.<init>(r12)     // Catch:{ all -> 0x00d4 }
        L_0x006a:
            boolean r12 = r2.moveToNext()     // Catch:{ all -> 0x00d4 }
            if (r12 == 0) goto L_0x00cd
            java.lang.String r12 = r2.getString(r4)     // Catch:{ all -> 0x00d4 }
            boolean r13 = r2.isNull(r10)     // Catch:{ all -> 0x00d4 }
            if (r13 == 0) goto L_0x007c
            r13 = 0
            goto L_0x0084
        L_0x007c:
            int r13 = r2.getInt(r10)     // Catch:{ all -> 0x00d4 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00d4 }
        L_0x0084:
            java.lang.String r14 = r2.getString(r9)     // Catch:{ all -> 0x00d4 }
            r16 = r4
            java.lang.String r4 = r2.getString(r8)     // Catch:{ all -> 0x00d4 }
            r17 = r8
            nic.goi.aarogyasetu.models.BluetoothData r8 = new nic.goi.aarogyasetu.models.BluetoothData     // Catch:{ all -> 0x00d4 }
            r8.<init>(r12, r13, r14, r4)     // Catch:{ all -> 0x00d4 }
            int r4 = r2.getInt(r3)     // Catch:{ all -> 0x00d4 }
            r8.setId(r4)     // Catch:{ all -> 0x00d4 }
            java.lang.String r4 = r2.getString(r7)     // Catch:{ all -> 0x00d4 }
            nic.goi.aarogyasetu.models.EncryptedInfo r4 = nic.goi.aarogyasetu.models.Converters.fromString(r4)     // Catch:{ all -> 0x00d4 }
            r8.setLatitudeenc(r4)     // Catch:{ all -> 0x00d4 }
            java.lang.String r4 = r2.getString(r6)     // Catch:{ all -> 0x00d4 }
            nic.goi.aarogyasetu.models.EncryptedInfo r4 = nic.goi.aarogyasetu.models.Converters.fromString(r4)     // Catch:{ all -> 0x00d4 }
            r8.setLongitudeenc(r4)     // Catch:{ all -> 0x00d4 }
            boolean r4 = r2.isNull(r5)     // Catch:{ all -> 0x00d4 }
            if (r4 == 0) goto L_0x00ba
            r4 = 0
            goto L_0x00c2
        L_0x00ba:
            int r4 = r2.getInt(r5)     // Catch:{ all -> 0x00d4 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00d4 }
        L_0x00c2:
            r8.setTimeStamp(r4)     // Catch:{ all -> 0x00d4 }
            r11.add(r8)     // Catch:{ all -> 0x00d4 }
            r4 = r16
            r8 = r17
            goto L_0x006a
        L_0x00cd:
            r2.close()
            r15.f()
            goto L_0x00de
        L_0x00d4:
            r0 = move-exception
            r2.close()
            r15.f()
            throw r0
        L_0x00dc:
            n.i.b r11 = n.i.b.e
        L_0x00de:
            r17 = r0
            goto L_0x01a8
        L_0x00e2:
            nic.goi.aarogyasetu.db.FightCovidDB r2 = r1.f425b
            if (r2 == 0) goto L_0x01a4
            b.a.a.g.e.a r2 = r2.i()
            if (r2 == 0) goto L_0x01a4
            int r3 = r1.a
            int r4 = r1.c
            b.a.a.g.e.b r2 = (b.a.a.g.e.b) r2
            r14 = 2
            java.lang.String r15 = "SELECT * FROM nearby_devices_info_table  LIMIT ? OFFSET ?"
            h.s.j r15 = h.s.j.a(r15, r14)
            r17 = r0
            long r0 = (long) r3
            r15.bindLong(r13, r0)
            long r0 = (long) r4
            r15.bindLong(r14, r0)
            h.s.h r0 = r2.a
            r0.b()
            h.s.h r0 = r2.a
            r1 = 0
            r4 = 0
            android.database.Cursor r1 = h.s.n.b.a(r0, r15, r1, r4)
            int r0 = g.a.a.b.a.a((android.database.Cursor) r1, (java.lang.String) r12)     // Catch:{ all -> 0x019c }
            int r2 = g.a.a.b.a.a((android.database.Cursor) r1, (java.lang.String) r11)     // Catch:{ all -> 0x019c }
            int r3 = g.a.a.b.a.a((android.database.Cursor) r1, (java.lang.String) r10)     // Catch:{ all -> 0x019c }
            int r9 = g.a.a.b.a.a((android.database.Cursor) r1, (java.lang.String) r9)     // Catch:{ all -> 0x019c }
            int r8 = g.a.a.b.a.a((android.database.Cursor) r1, (java.lang.String) r8)     // Catch:{ all -> 0x019c }
            int r7 = g.a.a.b.a.a((android.database.Cursor) r1, (java.lang.String) r7)     // Catch:{ all -> 0x019c }
            int r6 = g.a.a.b.a.a((android.database.Cursor) r1, (java.lang.String) r6)     // Catch:{ all -> 0x019c }
            int r5 = g.a.a.b.a.a((android.database.Cursor) r1, (java.lang.String) r5)     // Catch:{ all -> 0x019c }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x019c }
            int r10 = r1.getCount()     // Catch:{ all -> 0x019c }
            r11.<init>(r10)     // Catch:{ all -> 0x019c }
        L_0x0139:
            boolean r10 = r1.moveToNext()     // Catch:{ all -> 0x019c }
            if (r10 == 0) goto L_0x0195
            java.lang.String r10 = r1.getString(r2)     // Catch:{ all -> 0x019c }
            boolean r12 = r1.isNull(r3)     // Catch:{ all -> 0x019c }
            if (r12 == 0) goto L_0x014b
            r12 = r4
            goto L_0x0153
        L_0x014b:
            int r12 = r1.getInt(r3)     // Catch:{ all -> 0x019c }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x019c }
        L_0x0153:
            java.lang.String r13 = r1.getString(r9)     // Catch:{ all -> 0x019c }
            java.lang.String r14 = r1.getString(r8)     // Catch:{ all -> 0x019c }
            nic.goi.aarogyasetu.models.BluetoothData r4 = new nic.goi.aarogyasetu.models.BluetoothData     // Catch:{ all -> 0x019c }
            r4.<init>(r10, r12, r13, r14)     // Catch:{ all -> 0x019c }
            int r10 = r1.getInt(r0)     // Catch:{ all -> 0x019c }
            r4.setId(r10)     // Catch:{ all -> 0x019c }
            java.lang.String r10 = r1.getString(r7)     // Catch:{ all -> 0x019c }
            nic.goi.aarogyasetu.models.EncryptedInfo r10 = nic.goi.aarogyasetu.models.Converters.fromString(r10)     // Catch:{ all -> 0x019c }
            r4.setLatitudeenc(r10)     // Catch:{ all -> 0x019c }
            java.lang.String r10 = r1.getString(r6)     // Catch:{ all -> 0x019c }
            nic.goi.aarogyasetu.models.EncryptedInfo r10 = nic.goi.aarogyasetu.models.Converters.fromString(r10)     // Catch:{ all -> 0x019c }
            r4.setLongitudeenc(r10)     // Catch:{ all -> 0x019c }
            boolean r10 = r1.isNull(r5)     // Catch:{ all -> 0x019c }
            if (r10 == 0) goto L_0x0185
            r10 = 0
            goto L_0x018d
        L_0x0185:
            int r10 = r1.getInt(r5)     // Catch:{ all -> 0x019c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x019c }
        L_0x018d:
            r4.setTimeStamp(r10)     // Catch:{ all -> 0x019c }
            r11.add(r4)     // Catch:{ all -> 0x019c }
            r4 = 0
            goto L_0x0139
        L_0x0195:
            r1.close()
            r15.f()
            goto L_0x01a8
        L_0x019c:
            r0 = move-exception
            r1.close()
            r15.f()
            throw r0
        L_0x01a4:
            r17 = r0
            n.i.b r11 = n.i.b.e
        L_0x01a8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r11.iterator()
        L_0x01b1:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x01fc
            java.lang.Object r2 = r1.next()
            nic.goi.aarogyasetu.models.BluetoothData r2 = (nic.goi.aarogyasetu.models.BluetoothData) r2
            nic.goi.aarogyasetu.models.EncryptedInfo r4 = r2.getLatitudeenc()
            nic.goi.aarogyasetu.models.EncryptedInfo r5 = r2.getLongitudeenc()
            java.lang.String r6 = "dataLatitudeEnc"
            n.m.c.f.a((java.lang.Object) r4, (java.lang.String) r6)
            b.a.a.l.v r6 = new b.a.a.l.v     // Catch:{ Exception -> 0x01d6 }
            r6.<init>()     // Catch:{ Exception -> 0x01d6 }
            java.lang.String r4 = r6.a(r4)     // Catch:{ Exception -> 0x01d6 }
            goto L_0x01d7
        L_0x01d6:
            r4 = r3
        L_0x01d7:
            java.lang.String r6 = "dataLongitudeEnc"
            n.m.c.f.a((java.lang.Object) r5, (java.lang.String) r6)
            b.a.a.l.v r6 = new b.a.a.l.v     // Catch:{ Exception -> 0x01e6 }
            r6.<init>()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r3 = r6.a(r5)     // Catch:{ Exception -> 0x01e6 }
            goto L_0x01e7
        L_0x01e6:
        L_0x01e7:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x01b1
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x01b1
            nic.goi.aarogyasetu.models.DataPoint r5 = new nic.goi.aarogyasetu.models.DataPoint
            r5.<init>(r2, r4, r3)
            r0.add(r5)
            goto L_0x01b1
        L_0x01fc:
            r2 = r17
            r2.setData(r0)
            r1 = r18
            java.lang.String r0 = r1.d
            if (r0 == 0) goto L_0x020a
            r2.setUploadType(r0)
        L_0x020a:
            nic.goi.aarogyasetu.CoronaApplication r0 = nic.goi.aarogyasetu.CoronaApplication.f5224g
            java.lang.String r4 = "unique_id"
            java.lang.String r0 = b.a.a.k.a.a((android.content.Context) r0, (java.lang.String) r4, (java.lang.String) r3)
            r2.setD(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.l.e0.a():nic.goi.aarogyasetu.models.BulkDataObject");
    }

    public final void b() {
        b.a.a.g.e.a i2;
        BulkDataObject a2 = a();
        FightCovidDB fightCovidDB = this.f425b;
        long j2 = 0;
        if (!(fightCovidDB == null || (i2 = fightCovidDB.i()) == null)) {
            b bVar = (b) i2;
            j a3 = j.a("SELECT COUNT(*) FROM nearby_devices_info_table", 0);
            bVar.a.b();
            Cursor a4 = h.s.n.b.a(bVar.a, a3, false, (CancellationSignal) null);
            try {
                if (a4.moveToFirst()) {
                    j2 = a4.getLong(0);
                }
            } finally {
                a4.close();
                a3.f();
            }
        }
        a(a2, j2);
    }

    public e0(String str, a aVar) {
        this.d = str;
        this.e = aVar;
        this.a = 500;
        this.f425b = FightCovidDB.j();
    }

    public final void a(BulkDataObject bulkDataObject, long j2) {
        a aVar;
        d0<JSONObject> d0Var;
        a aVar2;
        try {
            o.a aVar3 = o.f436b;
            int i2 = 0;
            if (!h.c.a()) {
                d0Var = null;
            } else {
                d0Var = ((c) e.a(true, true, true, "").a(c.class)).a(aVar3.a(false), bulkDataObject).f();
            }
            if (d0Var == null) {
                return;
            }
            if (d0Var.a()) {
                if (bulkDataObject.getData() != null) {
                    i2 = bulkDataObject.getData().size();
                }
                int i3 = this.c + i2;
                this.c = i3;
                if (((long) i3) < j2) {
                    a(a(), j2);
                    return;
                }
                a aVar4 = this.e;
                if (aVar4 != null) {
                    aVar4.e();
                    return;
                }
                return;
            }
            String str = this.d;
            if (str != null && (aVar2 = this.e) != null) {
                aVar2.d(str);
            }
        } catch (Exception unused) {
            String str2 = this.d;
            if (str2 != null && (aVar = this.e) != null) {
                aVar.d(str2);
            }
        }
    }
}
