package i.c.e;

import java.lang.reflect.Field;
import java.util.Locale;

/* compiled from: FieldNamingPolicy */
public enum c implements d {
    IDENTITY {
        public String a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        public String a(Field field) {
            return c.a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        public String a(Field field) {
            return c.a(c.a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        public String a(Field field) {
            return c.a(field.getName(), l.a.a.a.o.d.b.ROLL_OVER_FILE_NAME_SEPARATOR).toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        public String a(Field field) {
            return c.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        public String a(Field field) {
            return c.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String a(String str) {
        int length = str.length() - 1;
        int i2 = 0;
        while (!Character.isLetter(str.charAt(i2)) && i2 < length) {
            i2++;
        }
        char charAt = str.charAt(i2);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i2 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
    }
}
