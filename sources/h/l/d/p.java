package h.l.d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import h.l.c;
import i.a.a.a.a;

/* compiled from: FragmentLayoutInflaterFactory */
public class p implements LayoutInflater.Factory2 {
    public final r e;

    public p(r rVar) {
        this.e = rVar;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (l.class.getName().equals(str)) {
            return new l(context, attributeSet, this.e);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !n.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.e.b(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.e.b(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.e.b(id);
        }
        if (r.c(2)) {
            StringBuilder a = a.a("onCreateView: id=0x");
            a.append(Integer.toHexString(resourceId));
            a.append(" fname=");
            a.append(attributeValue);
            a.append(" existing=");
            a.append(fragment);
            Log.v("FragmentManager", a.toString());
        }
        if (fragment == null) {
            fragment = this.e.g().a(context.getClassLoader(), attributeValue);
            fragment.f239q = true;
            fragment.z = resourceId != 0 ? resourceId : id;
            fragment.A = id;
            fragment.B = string;
            fragment.r = true;
            r rVar = this.e;
            fragment.v = rVar;
            o<?> oVar = rVar.f2014n;
            fragment.w = oVar;
            Context context2 = oVar.f2001f;
            fragment.a(attributeSet, fragment.f228f);
            this.e.a(fragment);
            r rVar2 = this.e;
            rVar2.a(fragment, rVar2.f2013m);
        } else if (!fragment.r) {
            fragment.r = true;
            o<?> oVar2 = this.e.f2014n;
            fragment.w = oVar2;
            Context context3 = oVar2.f2001f;
            fragment.a(attributeSet, fragment.f228f);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        r rVar3 = this.e;
        if (rVar3.f2013m >= 1 || !fragment.f239q) {
            r rVar4 = this.e;
            rVar4.a(fragment, rVar4.f2013m);
        } else {
            rVar3.a(fragment, 1);
        }
        View view2 = fragment.K;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.K.getTag() == null) {
                fragment.K.setTag(string);
            }
            return fragment.K;
        }
        throw new IllegalStateException(a.a("Fragment ", attributeValue, " did not create a view."));
    }
}
