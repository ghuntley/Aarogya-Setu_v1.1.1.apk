package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import i.c.e.q;
import i.c.e.r;
import i.c.e.u.a;
import i.c.e.v.b;
import i.c.e.v.c;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class TimeTypeAdapter extends q<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final r f742b = new r() {
        public <T> q<T> a(Gson gson, a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };
    public final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    public synchronized Time a(i.c.e.v.a aVar) {
        if (aVar.C() == b.NULL) {
            aVar.z();
            return null;
        }
        try {
            return new Time(this.a.parse(aVar.A()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    public synchronized void a(c cVar, Time time) {
        cVar.d(time == null ? null : this.a.format(time));
    }
}
