package com.bumptech.glide.load.engine;

import android.util.Log;
import i.b.a.n.e;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class GlideException extends Exception {

    /* renamed from: j  reason: collision with root package name */
    public static final StackTraceElement[] f449j = new StackTraceElement[0];
    public final List<Throwable> e;

    /* renamed from: f  reason: collision with root package name */
    public e f450f;

    /* renamed from: g  reason: collision with root package name */
    public i.b.a.n.a f451g;

    /* renamed from: h  reason: collision with root package name */
    public Class<?> f452h;

    /* renamed from: i  reason: collision with root package name */
    public String f453i;

    public GlideException(String str) {
        List<Throwable> emptyList = Collections.emptyList();
        this.f453i = str;
        setStackTrace(f449j);
        this.e = emptyList;
    }

    public void a(String str) {
        ArrayList arrayList = new ArrayList();
        a((Throwable) this, (List<Throwable>) arrayList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder a2 = i.a.a.a.a.a("Root cause (");
            int i3 = i2 + 1;
            a2.append(i3);
            a2.append(" of ");
            a2.append(size);
            a2.append(")");
            Log.i(str, a2.toString(), (Throwable) arrayList.get(i2));
            i2 = i3;
        }
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f453i);
        String str3 = "";
        if (this.f452h != null) {
            StringBuilder a2 = i.a.a.a.a.a(", ");
            a2.append(this.f452h);
            str = a2.toString();
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.f451g != null) {
            StringBuilder a3 = i.a.a.a.a.a(", ");
            a3.append(this.f451g);
            str2 = a3.toString();
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.f450f != null) {
            StringBuilder a4 = i.a.a.a.a.a(", ");
            a4.append(this.f450f);
            str3 = a4.toString();
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a((Throwable) this, (List<Throwable>) arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void printStackTrace() {
        a((Appendable) System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        a((Appendable) printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        a((Appendable) printWriter);
    }

    public static final class a implements Appendable {
        public final Appendable e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f454f = true;

        public a(Appendable appendable) {
            this.e = appendable;
        }

        public Appendable append(char c) {
            boolean z = false;
            if (this.f454f) {
                this.f454f = false;
                this.e.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f454f = z;
            this.e.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public Appendable append(CharSequence charSequence, int i2, int i3) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.f454f) {
                this.f454f = false;
                this.e.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i3 - 1) == 10) {
                z = true;
            }
            this.f454f = z;
            this.e.append(charSequence, i2, i3);
            return this;
        }
    }

    public final void a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable a2 : ((GlideException) th).e) {
                a(a2, list);
            }
            return;
        }
        list.add(th);
    }

    public GlideException(String str, Throwable th) {
        List<Throwable> singletonList = Collections.singletonList(th);
        this.f453i = str;
        setStackTrace(f449j);
        this.e = singletonList;
    }

    public GlideException(String str, List<Throwable> list) {
        this.f453i = str;
        setStackTrace(f449j);
        this.e = list;
    }

    public final void a(Appendable appendable) {
        a((Throwable) this, appendable);
        try {
            a(this.e, (Appendable) new a(appendable));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public static void a(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof GlideException) {
                ((GlideException) th).a(appendable);
            } else {
                a(th, appendable);
            }
            i2 = i3;
        }
    }
}
