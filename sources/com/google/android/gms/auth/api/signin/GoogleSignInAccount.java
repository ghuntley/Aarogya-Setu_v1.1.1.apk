package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i.c.a.b.b.a.b.b;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import i.c.a.b.d.o.c;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b();
    public static i.c.a.b.d.o.b r = c.a;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public String f459f;

    /* renamed from: g  reason: collision with root package name */
    public String f460g;

    /* renamed from: h  reason: collision with root package name */
    public String f461h;

    /* renamed from: i  reason: collision with root package name */
    public String f462i;

    /* renamed from: j  reason: collision with root package name */
    public Uri f463j;

    /* renamed from: k  reason: collision with root package name */
    public String f464k;

    /* renamed from: l  reason: collision with root package name */
    public long f465l;

    /* renamed from: m  reason: collision with root package name */
    public String f466m;

    /* renamed from: n  reason: collision with root package name */
    public List<Scope> f467n;

    /* renamed from: o  reason: collision with root package name */
    public String f468o;

    /* renamed from: p  reason: collision with root package name */
    public String f469p;

    /* renamed from: q  reason: collision with root package name */
    public Set<Scope> f470q = new HashSet();

    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.e = i2;
        this.f459f = str;
        this.f460g = str2;
        this.f461h = str3;
        this.f462i = str4;
        this.f463j = uri;
        this.f464k = str5;
        this.f465l = j2;
        this.f466m = str6;
        this.f467n = list;
        this.f468o = str7;
        this.f469p = str8;
    }

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", (String) null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.optString("tokenId", (String) null);
        String optString4 = jSONObject.optString("email", (String) null);
        String optString5 = jSONObject.optString("displayName", (String) null);
        String optString6 = jSONObject.optString("givenName", (String) null);
        String optString7 = jSONObject.optString("familyName", (String) null);
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            if (((c) r) != null) {
                valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
            } else {
                throw null;
            }
        }
        long longValue = valueOf.longValue();
        q.b(string);
        q.a(hashSet);
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, (String) null, longValue, string, new ArrayList(hashSet), optString6, optString7);
        GoogleSignInAccount googleSignInAccount3 = googleSignInAccount;
        googleSignInAccount3.f464k = jSONObject.optString("serverAuthCode", (String) null);
        return googleSignInAccount3;
    }

    public Set<Scope> d() {
        HashSet hashSet = new HashSet(this.f467n);
        hashSet.addAll(this.f470q);
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f466m.equals(this.f466m)) {
            if (((AbstractSet) googleSignInAccount.d()).equals(d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((AbstractSet) d()).hashCode() + ((this.f466m.hashCode() + 527) * 31);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f459f, false);
        q.a(parcel, 3, this.f460g, false);
        q.a(parcel, 4, this.f461h, false);
        q.a(parcel, 5, this.f462i, false);
        q.a(parcel, 6, (Parcelable) this.f463j, i2, false);
        q.a(parcel, 7, this.f464k, false);
        q.a(parcel, 8, this.f465l);
        q.a(parcel, 9, this.f466m, false);
        q.a(parcel, 10, this.f467n, false);
        q.a(parcel, 11, this.f468o, false);
        q.a(parcel, 12, this.f469p, false);
        q.m(parcel, a);
    }
}
