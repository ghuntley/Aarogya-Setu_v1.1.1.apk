package i.c.a.b.g.f;

import android.os.Parcelable;

public final class w implements Parcelable.Creator<v> {
    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
        /*
            r10 = this;
            int r0 = i.c.a.b.d.l.q.b((android.os.Parcel) r11)
            r1 = 0
            r2 = 1
            r5 = r1
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r4 = 1
        L_0x000c:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L_0x0049
            int r1 = r11.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            switch(r2) {
                case 1: goto L_0x0044;
                case 2: goto L_0x003a;
                case 3: goto L_0x0035;
                case 4: goto L_0x002b;
                case 5: goto L_0x0026;
                case 6: goto L_0x0021;
                default: goto L_0x001d;
            }
        L_0x001d:
            i.c.a.b.d.l.q.k(r11, r1)
            goto L_0x000c
        L_0x0021:
            android.os.IBinder r9 = i.c.a.b.d.l.q.g(r11, r1)
            goto L_0x000c
        L_0x0026:
            android.os.IBinder r8 = i.c.a.b.d.l.q.g(r11, r1)
            goto L_0x000c
        L_0x002b:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = i.c.a.b.d.l.q.a((android.os.Parcel) r11, (int) r1, r2)
            r7 = r1
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
            goto L_0x000c
        L_0x0035:
            android.os.IBinder r6 = i.c.a.b.d.l.q.g(r11, r1)
            goto L_0x000c
        L_0x003a:
            android.os.Parcelable$Creator<i.c.a.b.g.f.t> r2 = i.c.a.b.g.f.t.CREATOR
            android.os.Parcelable r1 = i.c.a.b.d.l.q.a((android.os.Parcel) r11, (int) r1, r2)
            r5 = r1
            i.c.a.b.g.f.t r5 = (i.c.a.b.g.f.t) r5
            goto L_0x000c
        L_0x0044:
            int r4 = i.c.a.b.d.l.q.h(r11, r1)
            goto L_0x000c
        L_0x0049:
            i.c.a.b.d.l.q.d((android.os.Parcel) r11, (int) r0)
            i.c.a.b.g.f.v r11 = new i.c.a.b.g.f.v
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.g.f.w.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new v[i2];
    }
}
