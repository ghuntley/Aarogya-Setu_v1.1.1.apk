package h.h.e;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: NotificationCompatJellybean */
public class l {
    public static final Object a = new Object();

    public static Bundle a(f fVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat a2 = fVar.a();
        bundle2.putInt("icon", a2 != null ? a2.a() : 0);
        bundle2.putCharSequence("title", fVar.f1719j);
        bundle2.putParcelable("actionIntent", fVar.f1720k);
        if (fVar.a != null) {
            bundle = new Bundle(fVar.a);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", fVar.e);
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", a(fVar.c));
        bundle2.putBoolean("showsUserInterface", fVar.f1715f);
        bundle2.putInt("semanticAction", fVar.f1716g);
        return bundle2;
    }

    public static Bundle[] a(n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[nVarArr.length];
        if (nVarArr.length <= 0) {
            return bundleArr;
        }
        n nVar = nVarArr[0];
        new Bundle();
        throw null;
    }
}
