package nic.goi.aarogyasetu.models;

import i.a.a.a.a;
import i.c.e.s.b;
import n.m.c.e;
import n.m.c.f;

/* compiled from: TncDataModel.kt */
public final class TncDataModel {
    @b("c")
    public final String clickText;
    @b("v")
    public final String text;
    @b("t")
    public final int type;
    @b("url")
    public final String url;

    public TncDataModel(int i2, String str, String str2, String str3) {
        if (str != null) {
            this.type = i2;
            this.text = str;
            this.clickText = str2;
            this.url = str3;
            return;
        }
        f.a("text");
        throw null;
    }

    public static /* synthetic */ TncDataModel copy$default(TncDataModel tncDataModel, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = tncDataModel.type;
        }
        if ((i3 & 2) != 0) {
            str = tncDataModel.text;
        }
        if ((i3 & 4) != 0) {
            str2 = tncDataModel.clickText;
        }
        if ((i3 & 8) != 0) {
            str3 = tncDataModel.url;
        }
        return tncDataModel.copy(i2, str, str2, str3);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.clickText;
    }

    public final String component4() {
        return this.url;
    }

    public final TncDataModel copy(int i2, String str, String str2, String str3) {
        if (str != null) {
            return new TncDataModel(i2, str, str2, str3);
        }
        f.a("text");
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TncDataModel)) {
            return false;
        }
        TncDataModel tncDataModel = (TncDataModel) obj;
        return this.type == tncDataModel.type && f.a((Object) this.text, (Object) tncDataModel.text) && f.a((Object) this.clickText, (Object) tncDataModel.clickText) && f.a((Object) this.url, (Object) tncDataModel.url);
    }

    public final String getClickText() {
        return this.clickText;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i2 = this.type * 31;
        String str = this.text;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.clickText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return hashCode2 + i3;
    }

    public String toString() {
        StringBuilder a = a.a("TncDataModel(type=");
        a.append(this.type);
        a.append(", text=");
        a.append(this.text);
        a.append(", clickText=");
        a.append(this.clickText);
        a.append(", url=");
        return a.a(a, this.url, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TncDataModel(int i2, String str, String str2, String str3, int i3, e eVar) {
        this(i2, str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : str3);
    }
}
