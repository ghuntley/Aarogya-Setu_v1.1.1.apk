package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
import h.y.a;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = versionedParcel.a(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (versionedParcel.a(2)) {
            a aVar = (a) versionedParcel;
            int readInt = aVar.e.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                aVar.e.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = versionedParcel.a(iconCompat.d, 3);
        iconCompat.e = versionedParcel.a(iconCompat.e, 4);
        iconCompat.f212f = versionedParcel.a(iconCompat.f212f, 5);
        iconCompat.f213g = (ColorStateList) versionedParcel.a(iconCompat.f213g, 6);
        String str = iconCompat.f215i;
        if (versionedParcel.a(7)) {
            str = ((a) versionedParcel).e.readString();
        }
        iconCompat.f215i = str;
        iconCompat.f214h = PorterDuff.Mode.valueOf(str);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.f211b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 == null) {
                    byte[] bArr3 = iconCompat.c;
                    iconCompat.f211b = bArr3;
                    iconCompat.a = 3;
                    iconCompat.e = 0;
                    iconCompat.f212f = bArr3.length;
                    break;
                } else {
                    iconCompat.f211b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                iconCompat.f211b = new String(iconCompat.c, Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f211b = iconCompat.c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        if (versionedParcel != null) {
            iconCompat.f215i = iconCompat.f214h.name();
            switch (iconCompat.a) {
                case -1:
                    iconCompat.d = (Parcelable) iconCompat.f211b;
                    break;
                case 1:
                case 5:
                    iconCompat.d = (Parcelable) iconCompat.f211b;
                    break;
                case 2:
                    iconCompat.c = ((String) iconCompat.f211b).getBytes(Charset.forName("UTF-16"));
                    break;
                case 3:
                    iconCompat.c = (byte[]) iconCompat.f211b;
                    break;
                case 4:
                case 6:
                    iconCompat.c = iconCompat.f211b.toString().getBytes(Charset.forName("UTF-16"));
                    break;
            }
            int i2 = iconCompat.a;
            if (-1 != i2) {
                versionedParcel.b(i2, 1);
            }
            byte[] bArr = iconCompat.c;
            if (bArr != null) {
                versionedParcel.b(2);
                a aVar = (a) versionedParcel;
                if (bArr != null) {
                    aVar.e.writeInt(bArr.length);
                    aVar.e.writeByteArray(bArr);
                } else {
                    aVar.e.writeInt(-1);
                }
            }
            Parcelable parcelable = iconCompat.d;
            if (parcelable != null) {
                versionedParcel.b(parcelable, 3);
            }
            int i3 = iconCompat.e;
            if (i3 != 0) {
                versionedParcel.b(i3, 4);
            }
            int i4 = iconCompat.f212f;
            if (i4 != 0) {
                versionedParcel.b(i4, 5);
            }
            ColorStateList colorStateList = iconCompat.f213g;
            if (colorStateList != null) {
                versionedParcel.b((Parcelable) colorStateList, 6);
            }
            String str = iconCompat.f215i;
            if (str != null) {
                versionedParcel.b(7);
                ((a) versionedParcel).e.writeString(str);
                return;
            }
            return;
        }
        throw null;
    }
}
