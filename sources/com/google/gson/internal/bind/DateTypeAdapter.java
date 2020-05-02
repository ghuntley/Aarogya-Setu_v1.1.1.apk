package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import i.c.d.p.e;
import i.c.e.q;
import i.c.e.r;
import i.c.e.t.o;
import i.c.e.u.a;
import i.c.e.v.b;
import i.c.e.v.c;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DateTypeAdapter extends q<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final r f731b = new r() {
        public <T> q<T> a(Gson gson, a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    public final List<DateFormat> a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (o.a >= 9) {
            this.a.add(e.a(2, 2));
        }
    }

    public Object a(i.c.e.v.a aVar) {
        if (aVar.C() != b.NULL) {
            return a(aVar.A());
        }
        aVar.z();
        return null;
    }

    public final synchronized Date a(String str) {
        for (DateFormat parse : this.a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return i.c.e.t.y.d.a.a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    public synchronized void a(c cVar, Date date) {
        if (date == null) {
            cVar.q();
        } else {
            cVar.d(this.a.get(0).format(date));
        }
    }
}
