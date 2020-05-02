package h.h.m.w;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import com.crashlytics.android.core.CodedOutputStream;
import com.crashlytics.android.core.LogFileManager;
import h.h.m.w.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityNodeInfoCompat */
public class b {
    public static int d;
    public final AccessibilityNodeInfo a;

    /* renamed from: b  reason: collision with root package name */
    public int f1824b = -1;
    public int c = -1;

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class a {
        public static final a e = new a(16, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f1825f = new a(CodedOutputStream.DEFAULT_BUFFER_SIZE, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f1826g = new a(8192, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f1827h = new a(262144, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f1828i = new a(524288, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f1829j = new a(1048576, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f1830k = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (d) null, (Class<? extends d.a>) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f1831l = new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
        public final Object a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1832b;
        public final Class<? extends d.a> c;
        public final d d;

        static {
            Class<d.c> cls = d.c.class;
            Class<d.b> cls2 = d.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(1, (CharSequence) null);
            new a(2, (CharSequence) null);
            new a(4, (CharSequence) null);
            new a(8, (CharSequence) null);
            new a(32, (CharSequence) null);
            new a(64, (CharSequence) null);
            new a(128, (CharSequence) null);
            new a(256, (CharSequence) null, cls2);
            new a(512, (CharSequence) null, cls2);
            new a(1024, (CharSequence) null, cls);
            new a(2048, (CharSequence) null, cls);
            new a(16384, (CharSequence) null);
            new a(32768, (CharSequence) null);
            new a(LogFileManager.MAX_LOG_SIZE, (CharSequence) null);
            new a(131072, (CharSequence) null, d.g.class);
            new a(2097152, (CharSequence) null, d.h.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (d) null, d.e.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (d) null, d.f.class);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (d) null, d.C0052d.class);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a(accessibilityAction, 16908357, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
        }

        public a(int i2, CharSequence charSequence) {
            this((Object) null, i2, charSequence, (d) null, (Class<? extends d.a>) null);
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.a;
            if (obj2 == null) {
                if (aVar.a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i2, CharSequence charSequence, Class<? extends d.a> cls) {
            this((Object) null, i2, charSequence, (d) null, cls);
        }

        public a(Object obj, int i2, CharSequence charSequence, d dVar, Class<? extends d.a> cls) {
            this.f1832b = i2;
            this.d = dVar;
            if (obj == null) {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.a = obj;
            }
            this.c = cls;
        }
    }

    /* renamed from: h.h.m.w.b$b  reason: collision with other inner class name */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0051b {
        public final Object a;

        public C0051b(Object obj) {
            this.a = obj;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class c {
        public final Object a;

        public c(Object obj) {
            this.a = obj;
        }

        public static c a(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z, z2));
        }
    }

    public b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static String a(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case CodedOutputStream.DEFAULT_BUFFER_SIZE:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case LogFileManager.MAX_LOG_SIZE:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i2) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static ClickableSpan[] b(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public final List<Integer> a(String str) {
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public CharSequence c() {
        if (!(!a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.a.getText();
        }
        List<Integer> a2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> a5 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i2 = 0; i2 < a2.size(); i2++) {
            spannableString.setSpan(new a(a5.get(i2).intValue(), this, b().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), a2.get(i2).intValue(), a3.get(i2).intValue(), a4.get(i2).intValue());
        }
        return spannableString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (bVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.a)) {
            return false;
        }
        return this.c == bVar.c && this.f1824b == bVar.f1824b;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String toString() {
        ArrayList arrayList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.a.getPackageName());
        sb.append("; className: ");
        sb.append(this.a.getClassName());
        sb.append("; text: ");
        sb.append(c());
        sb.append("; contentDescription: ");
        sb.append(a());
        sb.append("; viewId: ");
        sb.append(this.a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.a.isFocused());
        sb.append("; selected: ");
        sb.append(this.a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.a.isEnabled());
        sb.append("; password: ");
        sb.append(this.a.isPassword());
        sb.append("; scrollable: " + this.a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        if (actionList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(new a(actionList.get(i2), 0, (CharSequence) null, (d) null, (Class<? extends d.a>) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            a aVar = (a) arrayList.get(i3);
            String a2 = a(aVar.a());
            if (a2.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) aVar.a).getLabel() != null) {
                a2 = ((AccessibilityNodeInfo.AccessibilityAction) aVar.a).getLabel().toString();
            }
            sb.append(a2);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void b(Object obj) {
        this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).a);
    }

    public void a(a aVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public Bundle b() {
        return this.a.getExtras();
    }

    public CharSequence a() {
        return this.a.getContentDescription();
    }

    public void a(Object obj) {
        this.a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0051b) obj).a);
    }

    public void a(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setHintText(charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public final void a(int i2, boolean z) {
        Bundle b2 = b();
        if (b2 != null) {
            int i3 = b2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z) {
                i2 = 0;
            }
            b2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }
}
