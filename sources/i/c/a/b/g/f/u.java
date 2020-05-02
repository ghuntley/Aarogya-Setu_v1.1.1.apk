package i.c.a.b.g.f;

import android.os.Parcelable;

public final class u implements Parcelable.Creator<t> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
        /*
            r12 = this;
            int r0 = i.c.a.b.d.l.q.b((android.os.Parcel) r13)
            java.util.List<i.c.a.b.d.l.c> r1 = i.c.a.b.g.f.t.f3191l
            r2 = 0
            r3 = 0
            r6 = r1
            r5 = r3
            r7 = r5
            r11 = r7
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x000f:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L_0x0051
            int r1 = r13.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 1
            if (r2 == r3) goto L_0x0047
            switch(r2) {
                case 5: goto L_0x0040;
                case 6: goto L_0x003b;
                case 7: goto L_0x0036;
                case 8: goto L_0x0031;
                case 9: goto L_0x002c;
                case 10: goto L_0x0027;
                default: goto L_0x0023;
            }
        L_0x0023:
            i.c.a.b.d.l.q.k(r13, r1)
            goto L_0x000f
        L_0x0027:
            java.lang.String r11 = i.c.a.b.d.l.q.b((android.os.Parcel) r13, (int) r1)
            goto L_0x000f
        L_0x002c:
            boolean r10 = i.c.a.b.d.l.q.e((android.os.Parcel) r13, (int) r1)
            goto L_0x000f
        L_0x0031:
            boolean r9 = i.c.a.b.d.l.q.e((android.os.Parcel) r13, (int) r1)
            goto L_0x000f
        L_0x0036:
            boolean r8 = i.c.a.b.d.l.q.e((android.os.Parcel) r13, (int) r1)
            goto L_0x000f
        L_0x003b:
            java.lang.String r7 = i.c.a.b.d.l.q.b((android.os.Parcel) r13, (int) r1)
            goto L_0x000f
        L_0x0040:
            android.os.Parcelable$Creator<i.c.a.b.d.l.c> r2 = i.c.a.b.d.l.c.CREATOR
            java.util.ArrayList r6 = i.c.a.b.d.l.q.c((android.os.Parcel) r13, (int) r1, r2)
            goto L_0x000f
        L_0x0047:
            android.os.Parcelable$Creator<com.google.android.gms.location.LocationRequest> r2 = com.google.android.gms.location.LocationRequest.CREATOR
            android.os.Parcelable r1 = i.c.a.b.d.l.q.a((android.os.Parcel) r13, (int) r1, r2)
            r5 = r1
            com.google.android.gms.location.LocationRequest r5 = (com.google.android.gms.location.LocationRequest) r5
            goto L_0x000f
        L_0x0051:
            i.c.a.b.d.l.q.d((android.os.Parcel) r13, (int) r0)
            i.c.a.b.g.f.t r13 = new i.c.a.b.g.f.t
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.f.u.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new t[i2];
    }
}
