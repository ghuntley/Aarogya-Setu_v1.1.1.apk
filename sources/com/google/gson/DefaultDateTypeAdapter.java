package com.google.gson;

import i.a.a.a.a;
import i.c.d.p.e;
import i.c.e.q;
import i.c.e.t.o;
import i.c.e.v.b;
import i.c.e.v.c;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class DefaultDateTypeAdapter extends q<Date> {
    public final Class<? extends Date> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<DateFormat> f714b = new ArrayList();

    public DefaultDateTypeAdapter(Class<? extends Date> cls, int i2, int i3) {
        a(cls);
        this.a = cls;
        this.f714b.add(DateFormat.getDateTimeInstance(i2, i3, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f714b.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (o.a >= 9) {
            this.f714b.add(e.a(i2, i3));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f714b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder a2 = a.a("DefaultDateTypeAdapter(");
            a2.append(((SimpleDateFormat) dateFormat).toPattern());
            a2.append(')');
            return a2.toString();
        }
        StringBuilder a3 = a.a("DefaultDateTypeAdapter(");
        a3.append(dateFormat.getClass().getSimpleName());
        a3.append(')');
        return a3.toString();
    }

    public static Class<? extends Date> a(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    public void a(c cVar, Date date) {
        if (date == null) {
            cVar.q();
            return;
        }
        synchronized (this.f714b) {
            cVar.d(this.f714b.get(0).format(date));
        }
    }

    public Object a(i.c.e.v.a aVar) {
        Object date;
        if (aVar.C() == b.NULL) {
            aVar.z();
            return null;
        }
        Date a2 = a(aVar.A());
        Class<? extends Date> cls = this.a;
        if (cls == Date.class) {
            return a2;
        }
        if (cls == Timestamp.class) {
            date = new Timestamp(a2.getTime());
        } else if (cls == java.sql.Date.class) {
            date = new java.sql.Date(a2.getTime());
        } else {
            throw new AssertionError();
        }
        return date;
    }

    public final Date a(String str) {
        synchronized (this.f714b) {
            for (DateFormat parse : this.f714b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date a2 = i.c.e.t.y.d.a.a(str, new ParsePosition(0));
                return a2;
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }
}
