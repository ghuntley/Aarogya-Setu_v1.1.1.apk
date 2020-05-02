package o;

import i.a.a.a.a;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* compiled from: MediaType */
public final class a0 {
    public static final Pattern d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5252b;
    @Nullable
    public final String c;

    public a0(String str, String str2, String str3, @Nullable String str4) {
        this.a = str;
        this.f5252b = str2;
        this.c = str4;
    }

    public static a0 a(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = e.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase("charset")) {
                        String group2 = matcher2.group(2);
                        if (group2 == null) {
                            group2 = matcher2.group(3);
                        } else if (group2.startsWith("'") && group2.endsWith("'") && group2.length() > 2) {
                            group2 = group2.substring(1, group2.length() - 1);
                        }
                        if (str2 == null || group2.equalsIgnoreCase(str2)) {
                            str2 = group2;
                        } else {
                            throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group2 + "\" for: \"" + str + '\"');
                        }
                    }
                    end = matcher2.end();
                } else {
                    StringBuilder a2 = a.a("Parameter is not formatted correctly: \"");
                    a2.append(str.substring(end));
                    a2.append("\" for: \"");
                    a2.append(str);
                    a2.append('\"');
                    throw new IllegalArgumentException(a2.toString());
                }
            }
            return new a0(str, lowerCase, lowerCase2, str2);
        }
        throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
    }

    @Nullable
    public static a0 b(String str) {
        try {
            return a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof a0) && ((a0) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }

    @Nullable
    public Charset a(@Nullable Charset charset) {
        try {
            return this.c != null ? Charset.forName(this.c) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
