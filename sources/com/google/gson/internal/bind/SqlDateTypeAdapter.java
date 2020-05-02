package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import i.c.e.q;
import i.c.e.r;
import i.c.e.u.a;
import i.c.e.v.b;
import i.c.e.v.c;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class SqlDateTypeAdapter extends q<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final r f741b = new r() {
        public <T> q<T> a(Gson gson, a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    public final DateFormat a = new SimpleDateFormat("MMM d, yyyy");

    public synchronized Date a(i.c.e.v.a aVar) {
        if (aVar.C() == b.NULL) {
            aVar.z();
            return null;
        }
        try {
            return new Date(this.a.parse(aVar.A()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    public synchronized void a(c cVar, Date date) {
        cVar.d(date == null ? null : this.a.format(date));
    }
}
