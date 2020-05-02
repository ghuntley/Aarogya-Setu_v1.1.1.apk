package h.h.m;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import h.h.m.w.b;
import h.h.m.w.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityDelegateCompat */
public class a {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f1810b;

    /* renamed from: h.h.m.a$a  reason: collision with other inner class name */
    /* compiled from: AccessibilityDelegateCompat */
    public static final class C0050a extends View.AccessibilityDelegate {
        public final a a;

        public C0050a(a aVar) {
            this.a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            c a2 = this.a.a(view);
            if (a2 != null) {
                return (AccessibilityNodeProvider) a2.a;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z;
            int i2;
            View view2 = view;
            b bVar = new b(accessibilityNodeInfo);
            boolean A = m.A(view);
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.a.setScreenReaderFocusable(A);
            } else {
                bVar.a(1, A);
            }
            Boolean bool = (Boolean) new p(h.h.c.tag_accessibility_heading, Boolean.class, 28).b(view2);
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.a.setHeading(z);
            } else {
                bVar.a(2, z);
            }
            CharSequence charSequence = (CharSequence) new o(h.h.c.tag_accessibility_pane_title, CharSequence.class, 8, 28).b(view2);
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.a.setPaneTitle(charSequence);
            } else {
                bVar.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
            }
            this.a.a(view2, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (Build.VERSION.SDK_INT < 26) {
                bVar.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                bVar.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                bVar.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                bVar.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view2.getTag(h.h.c.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                        if (((WeakReference) sparseArray.valueAt(i3)).get() == null) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        sparseArray.remove(((Integer) arrayList.get(i4)).intValue());
                    }
                }
                ClickableSpan[] b2 = b.b(text);
                if (b2 != null && b2.length > 0) {
                    bVar.b().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", h.h.c.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view2.getTag(h.h.c.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view2.setTag(h.h.c.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i5 = 0; i5 < b2.length; i5++) {
                        ClickableSpan clickableSpan = b2[i5];
                        int i6 = 0;
                        while (true) {
                            if (i6 >= sparseArray2.size()) {
                                i2 = b.d;
                                b.d = i2 + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i6)).get())) {
                                i2 = sparseArray2.keyAt(i6);
                                break;
                            } else {
                                i6++;
                            }
                        }
                        sparseArray2.put(i2, new WeakReference(b2[i5]));
                        ClickableSpan clickableSpan2 = b2[i5];
                        Spanned spanned = (Spanned) text;
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
                    }
                }
            }
            List list = (List) view2.getTag(h.h.c.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i7 = 0; i7 < list.size(); i7++) {
                bVar.a((b.a) list.get(i7));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.a.a(view, i2, bundle);
        }

        public void sendAccessibilityEvent(View view, int i2) {
            this.a.a(view, i2);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.d(view, accessibilityEvent);
        }
    }

    public a() {
        this.a = c;
        this.f1810b = new C0050a(this);
    }

    public void a(View view, int i2) {
        this.a.sendAccessibilityEvent(view, i2);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, b bVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.f1810b = new C0050a(this);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public c a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new c(accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            int r0 = h.h.c.tag_accessibility_actions
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x000e
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x000e:
            r1 = 0
            r2 = 0
        L_0x0010:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x006f
            java.lang.Object r3 = r0.get(r2)
            h.h.m.w.b$a r3 = (h.h.m.w.b.a) r3
            int r4 = r3.a()
            if (r4 != r10) goto L_0x006c
            h.h.m.w.d r0 = r3.d
            if (r0 == 0) goto L_0x006f
            java.lang.Class<? extends h.h.m.w.d$a> r0 = r3.c
            r2 = 0
            if (r0 == 0) goto L_0x0065
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x003f }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r4)     // Catch:{ Exception -> 0x003f }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x003f }
            java.lang.Object r0 = r0.newInstance(r4)     // Catch:{ Exception -> 0x003f }
            h.h.m.w.d$a r0 = (h.h.m.w.d.a) r0     // Catch:{ Exception -> 0x003f }
            if (r0 == 0) goto L_0x003c
            goto L_0x0064
        L_0x003c:
            throw r2     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            r2 = move-exception
            goto L_0x0043
        L_0x003f:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x0043:
            java.lang.Class<? extends h.h.m.w.d$a> r4 = r3.c
            if (r4 != 0) goto L_0x004a
            java.lang.String r4 = "null"
            goto L_0x004e
        L_0x004a:
            java.lang.String r4 = r4.getName()
        L_0x004e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r2)
        L_0x0064:
            r2 = r0
        L_0x0065:
            h.h.m.w.d r0 = r3.d
            boolean r0 = r0.a(r9, r2)
            goto L_0x0070
        L_0x006c:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x006f:
            r0 = 0
        L_0x0070:
            if (r0 != 0) goto L_0x0078
            android.view.View$AccessibilityDelegate r0 = r8.a
            boolean r0 = r0.performAccessibilityAction(r9, r10, r11)
        L_0x0078:
            if (r0 != 0) goto L_0x00c7
            int r2 = h.h.c.accessibility_action_clickable_span
            if (r10 != r2) goto L_0x00c7
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            int r11 = h.h.c.tag_accessibility_clickable_spans
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto L_0x00c6
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto L_0x00c6
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto L_0x00bf
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = h.h.m.w.b.b((java.lang.CharSequence) r11)
            r2 = 0
        L_0x00ad:
            if (r11 == 0) goto L_0x00bf
            int r3 = r11.length
            if (r2 >= r3) goto L_0x00bf
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x00bc
            r11 = 1
            goto L_0x00c0
        L_0x00bc:
            int r2 = r2 + 1
            goto L_0x00ad
        L_0x00bf:
            r11 = 0
        L_0x00c0:
            if (r11 == 0) goto L_0x00c6
            r10.onClick(r9)
            r1 = 1
        L_0x00c6:
            r0 = r1
        L_0x00c7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.h.m.a.a(android.view.View, int, android.os.Bundle):boolean");
    }
}
