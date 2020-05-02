package h.b.p;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import h.b.f;
import h.i.a.c;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* compiled from: SuggestionsAdapter */
public class r0 extends c implements View.OnClickListener {
    public int A = -1;
    public int B = -1;
    public int C = -1;

    /* renamed from: p  reason: collision with root package name */
    public final SearchView f1465p;

    /* renamed from: q  reason: collision with root package name */
    public final SearchableInfo f1466q;
    public final Context r;
    public final WeakHashMap<String, Drawable.ConstantState> s;
    public final int t;
    public boolean u = false;
    public int v = 1;
    public ColorStateList w;
    public int x = -1;
    public int y = -1;
    public int z = -1;

    /* compiled from: SuggestionsAdapter */
    public static final class a {
        public final TextView a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1467b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.f1467b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(f.edit_query);
        }
    }

    public r0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1465p = searchView;
        this.f1466q = searchableInfo;
        this.t = searchView.getSuggestionCommitIconResId();
        this.r = context;
        this.s = weakHashMap;
    }

    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f1863o.inflate(this.f1861m, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(f.edit_query)).setImageResource(this.t);
        return inflate;
    }

    public CharSequence b(Cursor cursor) {
        String a2;
        String a3;
        if (cursor == null) {
            return null;
        }
        String a4 = a(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (a4 != null) {
            return a4;
        }
        if (this.f1466q.shouldRewriteQueryFromData() && (a3 = a(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return a3;
        }
        if (!this.f1466q.shouldRewriteQueryFromText() || (a2 = a(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return a2;
    }

    public final void c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            if (!this.e) {
                return null;
            }
            this.f1855g.moveToPosition(i2);
            if (view == null) {
                view = this.f1863o.inflate(this.f1862n, viewGroup, false);
            }
            a(view, this.f1856h, this.f1855g);
            return view;
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.f1863o.inflate(this.f1862n, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).a.setText(e.toString());
            }
            return inflate;
        }
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a2 = a(this.f1856h, this.f1855g, viewGroup);
            if (a2 != null) {
                ((a) a2.getTag()).a.setText(e.toString());
            }
            return a2;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        c(this.f1855g);
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        c(this.f1855g);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1465p.a((CharSequence) tag);
        }
    }

    public void a(Cursor cursor) {
        if (this.u) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.x = cursor.getColumnIndex("suggest_text_1");
                this.y = cursor.getColumnIndex("suggest_text_2");
                this.z = cursor.getColumnIndex("suggest_text_2_url");
                this.A = cursor.getColumnIndex("suggest_icon_1");
                this.B = cursor.getColumnIndex("suggest_icon_2");
                this.C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r19, android.content.Context r20, android.database.Cursor r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r21
            java.lang.Object r0 = r19.getTag()
            r3 = r0
            h.b.p.r0$a r3 = (h.b.p.r0.a) r3
            int r0 = r1.C
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            android.widget.TextView r0 = r3.a
            r7 = 8
            if (r0 == 0) goto L_0x0036
            int r0 = r1.x
            java.lang.String r0 = a((android.database.Cursor) r2, (int) r0)
            android.widget.TextView r8 = r3.a
            r8.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0033
            r8.setVisibility(r7)
            goto L_0x0036
        L_0x0033:
            r8.setVisibility(r4)
        L_0x0036:
            android.widget.TextView r0 = r3.f1467b
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00be
            int r0 = r1.z
            java.lang.String r0 = a((android.database.Cursor) r2, (int) r0)
            if (r0 == 0) goto L_0x0087
            android.content.res.ColorStateList r10 = r1.w
            if (r10 != 0) goto L_0x0066
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r1.f1856h
            android.content.res.Resources$Theme r11 = r11.getTheme()
            int r12 = h.b.a.textColorSearchUrl
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r1.f1856h
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r1.w = r10
        L_0x0066:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r1.w
            r16 = 0
            r17 = r11
            r11 = r15
            r5 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r0 = r0.length()
            r11 = 33
            r10.setSpan(r5, r4, r0, r11)
            goto L_0x008d
        L_0x0087:
            int r0 = r1.y
            java.lang.String r10 = a((android.database.Cursor) r2, (int) r0)
        L_0x008d:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x00a0
            android.widget.TextView r0 = r3.a
            if (r0 == 0) goto L_0x00ac
            r0.setSingleLine(r4)
            android.widget.TextView r0 = r3.a
            r0.setMaxLines(r8)
            goto L_0x00ac
        L_0x00a0:
            android.widget.TextView r0 = r3.a
            if (r0 == 0) goto L_0x00ac
            r0.setSingleLine(r9)
            android.widget.TextView r0 = r3.a
            r0.setMaxLines(r9)
        L_0x00ac:
            android.widget.TextView r0 = r3.f1467b
            r0.setText(r10)
            boolean r5 = android.text.TextUtils.isEmpty(r10)
            if (r5 == 0) goto L_0x00bb
            r0.setVisibility(r7)
            goto L_0x00be
        L_0x00bb:
            r0.setVisibility(r4)
        L_0x00be:
            android.widget.ImageView r5 = r3.c
            if (r5 == 0) goto L_0x0179
            int r0 = r1.A
            r11 = -1
            if (r0 != r11) goto L_0x00ca
            r0 = 0
            goto L_0x0166
        L_0x00ca:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x00d6
            goto L_0x0166
        L_0x00d6:
            android.app.SearchableInfo r0 = r1.f1466q
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r11 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.s
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x00ff
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.s
            java.lang.Object r0 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f4
            r0 = 0
            goto L_0x0159
        L_0x00f4:
            android.content.Context r11 = r1.r
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r11)
            goto L_0x0159
        L_0x00ff:
            java.lang.String r12 = "SuggestionsAdapter"
            android.content.Context r13 = r1.f1856h
            android.content.pm.PackageManager r13 = r13.getPackageManager()
            r14 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r14 = r13.getActivityInfo(r0, r14)     // Catch:{ NameNotFoundException -> 0x0141 }
            int r15 = r14.getIconResource()
            if (r15 != 0) goto L_0x0114
            goto L_0x014a
        L_0x0114:
            java.lang.String r10 = r0.getPackageName()
            android.content.pm.ApplicationInfo r14 = r14.applicationInfo
            android.graphics.drawable.Drawable r10 = r13.getDrawable(r10, r15, r14)
            if (r10 != 0) goto L_0x014b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "Invalid icon resource "
            r10.append(r13)
            r10.append(r15)
            java.lang.String r13 = " for "
            r10.append(r13)
            java.lang.String r0 = r0.flattenToShortString()
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            android.util.Log.w(r12, r0)
            goto L_0x014a
        L_0x0141:
            r0 = move-exception
            r10 = r0
            java.lang.String r0 = r10.toString()
            android.util.Log.w(r12, r0)
        L_0x014a:
            r10 = 0
        L_0x014b:
            if (r10 != 0) goto L_0x014f
            r0 = 0
            goto L_0x0153
        L_0x014f:
            android.graphics.drawable.Drawable$ConstantState r0 = r10.getConstantState()
        L_0x0153:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.s
            r12.put(r11, r0)
            r0 = r10
        L_0x0159:
            if (r0 == 0) goto L_0x015c
            goto L_0x0166
        L_0x015c:
            android.content.Context r0 = r1.f1856h
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0166:
            r10 = 4
            r5.setImageDrawable(r0)
            if (r0 != 0) goto L_0x0170
            r5.setVisibility(r10)
            goto L_0x0179
        L_0x0170:
            r5.setVisibility(r4)
            r0.setVisible(r4, r4)
            r0.setVisible(r9, r4)
        L_0x0179:
            android.widget.ImageView r0 = r3.d
            if (r0 == 0) goto L_0x019e
            int r5 = r1.B
            r10 = -1
            if (r5 != r10) goto L_0x0184
            r10 = 0
            goto L_0x018c
        L_0x0184:
            java.lang.String r2 = r2.getString(r5)
            android.graphics.drawable.Drawable r10 = r1.a((java.lang.String) r2)
        L_0x018c:
            r0.setImageDrawable(r10)
            if (r10 != 0) goto L_0x0195
            r0.setVisibility(r7)
            goto L_0x019e
        L_0x0195:
            r0.setVisibility(r4)
            r10.setVisible(r4, r4)
            r10.setVisible(r9, r4)
        L_0x019e:
            int r0 = r1.v
            if (r0 == r8) goto L_0x01af
            if (r0 != r9) goto L_0x01a9
            r0 = r6 & 1
            if (r0 == 0) goto L_0x01a9
            goto L_0x01af
        L_0x01a9:
            android.widget.ImageView r0 = r3.e
            r0.setVisibility(r7)
            goto L_0x01c4
        L_0x01af:
            android.widget.ImageView r0 = r3.e
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r3.e
            android.widget.TextView r2 = r3.a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.e
            r0.setOnClickListener(r1)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.p.r0.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x009f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            r1 = 0
            if (r8 == 0) goto L_0x013b
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x013b
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0015
            goto L_0x013b
        L_0x0015:
            int r2 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = "android.resource://"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.content.Context r4 = r7.r     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.s     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            if (r4 != 0) goto L_0x0044
            r4 = r1
            goto L_0x0048
        L_0x0044:
            android.graphics.drawable.Drawable r4 = r4.newDrawable()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
        L_0x0048:
            if (r4 == 0) goto L_0x004b
            return r4
        L_0x004b:
            android.content.Context r4 = r7.r     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable r2 = h.h.f.a.c(r4, r2)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            if (r2 == 0) goto L_0x005c
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.s     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r5 = r2.getConstantState()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r4.put(r3, r5)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
        L_0x005c:
            return r2
        L_0x005d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon resource not found: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.w(r0, r8)
            return r1
        L_0x0072:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r2 = r7.s
            java.lang.Object r2 = r2.get(r8)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L_0x007f
            r2 = r1
            goto L_0x0083
        L_0x007f:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L_0x0083:
            if (r2 == 0) goto L_0x0086
            return r2
        L_0x0086:
            android.net.Uri r2 = android.net.Uri.parse(r8)
            java.lang.String r3 = "Error closing icon stream for "
            java.lang.String r4 = r2.getScheme()     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r5 = "android.resource"
            boolean r4 = r5.equals(r4)     // Catch:{ FileNotFoundException -> 0x010f }
            if (r4 == 0) goto L_0x00b6
            android.graphics.drawable.Drawable r0 = r7.a((android.net.Uri) r2)     // Catch:{ NotFoundException -> 0x009f }
            r1 = r0
            goto L_0x0130
        L_0x009f:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010f }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r5 = "Resource does not exist: "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x010f }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x010f }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x010f }
            throw r3     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x00b6:
            android.content.Context r4 = r7.r     // Catch:{ FileNotFoundException -> 0x010f }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x010f }
            java.io.InputStream r4 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            if (r4 == 0) goto L_0x00f8
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r4, r1)     // Catch:{ all -> 0x00df }
            r4.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00dd
        L_0x00ca:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010f }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x010f }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x010f }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x010f }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x00dd:
            r1 = r5
            goto L_0x0130
        L_0x00df:
            r5 = move-exception
            r4.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00f7
        L_0x00e4:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010f }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x010f }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x010f }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x010f }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x00f7:
            throw r5     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x00f8:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010f }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r5 = "Failed to open "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x010f }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x010f }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x010f }
            throw r3     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x010f:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Icon not found: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
        L_0x0130:
            if (r1 == 0) goto L_0x013b
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r7.s
            android.graphics.drawable.Drawable$ConstantState r2 = r1.getConstantState()
            r0.put(r8, r2)
        L_0x013b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.p.r0.a(java.lang.String):android.graphics.drawable.Drawable");
    }

    public static String a(Cursor cursor, String str) {
        return a(cursor, cursor.getColumnIndex(str));
    }

    public static String a(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public Drawable a(Uri uri) {
        int i2;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1856h.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i2 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(i.a.a.a.a.a("Single path segment is not a resource ID: ", uri));
                        }
                    } else if (size == 2) {
                        i2 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(i.a.a.a.a.a("More than two path segments: ", uri));
                    }
                    if (i2 != 0) {
                        return resourcesForApplication.getDrawable(i2);
                    }
                    throw new FileNotFoundException(i.a.a.a.a.a("No resource found for: ", uri));
                }
                throw new FileNotFoundException(i.a.a.a.a.a("No path: ", uri));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(i.a.a.a.a.a("No package found for authority: ", uri));
            }
        } else {
            throw new FileNotFoundException(i.a.a.a.a.a("No authority: ", uri));
        }
    }

    public Cursor a(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f1856h.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }
}
