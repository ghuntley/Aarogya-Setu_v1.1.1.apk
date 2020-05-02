package i.b.a.n.o.e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import i.a.a.a.a;
import i.b.a.n.g;
import i.b.a.n.i;
import i.b.a.n.m.v;
import java.util.List;

/* compiled from: ResourceDrawableDecoder */
public class d implements i<Uri, Drawable> {
    public final Context a;

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    public /* bridge */ /* synthetic */ v a(Object obj, int i2, int i3, g gVar) {
        return a((Uri) obj);
    }

    public boolean a(Object obj, g gVar) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    public v a(Uri uri) {
        Context context;
        int i2;
        String authority = uri.getAuthority();
        if (authority.equals(this.a.getPackageName())) {
            context = this.a;
        } else {
            try {
                context = this.a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (authority.contains(this.a.getPackageName())) {
                    context = this.a;
                } else {
                    throw new IllegalArgumentException(a.a("Failed to obtain context or unrecognized Uri format for: ", uri), e);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            i2 = context.getResources().getIdentifier(str2, str, authority2);
            if (i2 == 0) {
                i2 = Resources.getSystem().getIdentifier(str2, str, l.a.a.a.o.b.a.ANDROID_CLIENT_TYPE);
            }
            if (i2 == 0) {
                throw new IllegalArgumentException(a.a("Failed to find resource id for: ", uri));
            }
        } else if (pathSegments.size() == 1) {
            try {
                i2 = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(a.a("Unrecognized Uri format: ", uri), e2);
            }
        } else {
            throw new IllegalArgumentException(a.a("Unrecognized Uri format: ", uri));
        }
        Drawable a2 = a.a(this.a, context, i2, (Resources.Theme) null);
        if (a2 != null) {
            return new c(a2);
        }
        return null;
    }
}
