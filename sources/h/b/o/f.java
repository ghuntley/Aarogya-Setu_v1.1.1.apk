package h.b.o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.crashlytics.android.core.CodedOutputStream;
import h.b.o.i.i;
import h.b.o.i.j;
import h.b.p.e0;
import h.b.p.x0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater */
public class f extends MenuInflater {
    public static final Class<?>[] e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f1218f;
    public final Object[] a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f1219b;
    public Context c;
    public Object d;

    /* compiled from: SupportMenuInflater */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Method f1220b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1220b = cls.getMethod(str, c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1220b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1220b.invoke(this.a, new Object[]{menuItem})).booleanValue();
                }
                this.f1220b.invoke(this.a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            e = r0
            f1218f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.o.f.<clinit>():void");
    }

    public f(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.f1219b = objArr;
    }

    public final void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        char c2;
        char c3;
        AttributeSet attributeSet2 = attributeSet;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(i.a.a.a.a.b("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            str = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals("group")) {
                            bVar.f1221b = 0;
                            bVar.c = 0;
                            bVar.d = 0;
                            bVar.e = 0;
                            bVar.f1222f = true;
                            bVar.f1223g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f1224h) {
                                h.h.m.b bVar2 = bVar.A;
                                if (bVar2 == null || !((j.a) bVar2).f1316b.hasSubMenu()) {
                                    bVar.f1224h = true;
                                    bVar.a(bVar.a.add(bVar.f1221b, bVar.f1225i, bVar.f1226j, bVar.f1227k));
                                } else {
                                    bVar.a();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            z = true;
                            eventType = xmlPullParser.next();
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.c.obtainStyledAttributes(attributeSet2, h.b.j.MenuGroup);
                        bVar.f1221b = obtainStyledAttributes.getResourceId(h.b.j.MenuGroup_android_id, 0);
                        bVar.c = obtainStyledAttributes.getInt(h.b.j.MenuGroup_android_menuCategory, 0);
                        bVar.d = obtainStyledAttributes.getInt(h.b.j.MenuGroup_android_orderInCategory, 0);
                        bVar.e = obtainStyledAttributes.getInt(h.b.j.MenuGroup_android_checkableBehavior, 0);
                        bVar.f1222f = obtainStyledAttributes.getBoolean(h.b.j.MenuGroup_android_visible, true);
                        bVar.f1223g = obtainStyledAttributes.getBoolean(h.b.j.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        x0 a2 = x0.a(f.this.c, attributeSet2, h.b.j.MenuItem);
                        bVar.f1225i = a2.f(h.b.j.MenuItem_android_id, 0);
                        bVar.f1226j = (a2.d(h.b.j.MenuItem_android_menuCategory, bVar.c) & -65536) | (a2.d(h.b.j.MenuItem_android_orderInCategory, bVar.d) & 65535);
                        bVar.f1227k = a2.e(h.b.j.MenuItem_android_title);
                        bVar.f1228l = a2.e(h.b.j.MenuItem_android_titleCondensed);
                        bVar.f1229m = a2.f(h.b.j.MenuItem_android_icon, 0);
                        String d2 = a2.d(h.b.j.MenuItem_android_alphabeticShortcut);
                        if (d2 == null) {
                            c2 = 0;
                        } else {
                            c2 = d2.charAt(0);
                        }
                        bVar.f1230n = c2;
                        bVar.f1231o = a2.d(h.b.j.MenuItem_alphabeticModifiers, CodedOutputStream.DEFAULT_BUFFER_SIZE);
                        String d3 = a2.d(h.b.j.MenuItem_android_numericShortcut);
                        if (d3 == null) {
                            c3 = 0;
                        } else {
                            c3 = d3.charAt(0);
                        }
                        bVar.f1232p = c3;
                        bVar.f1233q = a2.d(h.b.j.MenuItem_numericModifiers, CodedOutputStream.DEFAULT_BUFFER_SIZE);
                        if (a2.f(h.b.j.MenuItem_android_checkable)) {
                            bVar.r = a2.a(h.b.j.MenuItem_android_checkable, false) ? 1 : 0;
                        } else {
                            bVar.r = bVar.e;
                        }
                        bVar.s = a2.a(h.b.j.MenuItem_android_checked, false);
                        bVar.t = a2.a(h.b.j.MenuItem_android_visible, bVar.f1222f);
                        bVar.u = a2.a(h.b.j.MenuItem_android_enabled, bVar.f1223g);
                        bVar.v = a2.d(h.b.j.MenuItem_showAsAction, -1);
                        bVar.z = a2.d(h.b.j.MenuItem_android_onClick);
                        bVar.w = a2.f(h.b.j.MenuItem_actionLayout, 0);
                        bVar.x = a2.d(h.b.j.MenuItem_actionViewClass);
                        String d4 = a2.d(h.b.j.MenuItem_actionProviderClass);
                        bVar.y = d4;
                        boolean z3 = d4 != null;
                        if (z3 && bVar.w == 0 && bVar.x == null) {
                            bVar.A = (h.h.m.b) bVar.a(bVar.y, f1218f, f.this.f1219b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.A = null;
                        }
                        bVar.B = a2.e(h.b.j.MenuItem_contentDescription);
                        bVar.C = a2.e(h.b.j.MenuItem_tooltipText);
                        if (a2.f(h.b.j.MenuItem_iconTintMode)) {
                            bVar.E = e0.a(a2.d(h.b.j.MenuItem_iconTintMode, -1), bVar.E);
                        } else {
                            bVar.E = null;
                        }
                        if (a2.f(h.b.j.MenuItem_iconTint)) {
                            bVar.D = a2.a(h.b.j.MenuItem_iconTint);
                        } else {
                            bVar.D = null;
                        }
                        a2.f1492b.recycle();
                        bVar.f1224h = false;
                    } else {
                        if (name3.equals("menu")) {
                            a(xmlPullParser, attributeSet2, bVar.a());
                        } else {
                            XmlPullParser xmlPullParser5 = xmlPullParser;
                            z2 = true;
                            str = name3;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser6 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof h.h.h.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.c.getResources().getLayout(i2);
            a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* compiled from: SupportMenuInflater */
    public class b {
        public h.h.m.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;
        public Menu a;

        /* renamed from: b  reason: collision with root package name */
        public int f1221b;
        public int c;
        public int d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1222f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1223g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1224h;

        /* renamed from: i  reason: collision with root package name */
        public int f1225i;

        /* renamed from: j  reason: collision with root package name */
        public int f1226j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f1227k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f1228l;

        /* renamed from: m  reason: collision with root package name */
        public int f1229m;

        /* renamed from: n  reason: collision with root package name */
        public char f1230n;

        /* renamed from: o  reason: collision with root package name */
        public int f1231o;

        /* renamed from: p  reason: collision with root package name */
        public char f1232p;

        /* renamed from: q  reason: collision with root package name */
        public int f1233q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.a = menu;
            this.f1221b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f1222f = true;
            this.f1223g = true;
        }

        public final void a(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.f1228l).setIcon(this.f1229m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!f.this.c.isRestricted()) {
                    f fVar = f.this;
                    if (fVar.d == null) {
                        fVar.d = fVar.a(fVar.c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.d, this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof i) {
                    i iVar = (i) menuItem;
                    iVar.x = (iVar.x & -5) | 4;
                } else if (menuItem instanceof j) {
                    j jVar = (j) menuItem;
                    try {
                        if (jVar.e == null) {
                            jVar.e = jVar.d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        jVar.e.invoke(jVar.d, new Object[]{true});
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) a(str, f.e, f.this.a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            h.h.m.b bVar = this.A;
            if (bVar != null) {
                if (menuItem instanceof h.h.h.a.b) {
                    ((h.h.h.a.b) menuItem).a(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.B;
            boolean z3 = menuItem instanceof h.h.h.a.b;
            if (z3) {
                ((h.h.h.a.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z3) {
                ((h.h.h.a.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.f1230n;
            int i4 = this.f1231o;
            if (z3) {
                ((h.h.h.a.b) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.f1232p;
            int i5 = this.f1233q;
            if (z3) {
                ((h.h.h.a.b) menuItem).setNumericShortcut(c3, i5);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                if (z3) {
                    ((h.h.h.a.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList == null) {
                return;
            }
            if (z3) {
                ((h.h.h.a.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }

        public SubMenu a() {
            this.f1224h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.f1221b, this.f1225i, this.f1226j, this.f1227k);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }
}
