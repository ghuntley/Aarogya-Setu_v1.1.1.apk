package com.crashlytics.android.core;

import android.util.Log;
import i.a.a.a.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.a.a.a.c;
import l.a.a.a.f;

public final class ProcMapEntryParser {
    public static final Pattern MAP_REGEX = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    public static ProcMapEntry parse(String str) {
        Matcher matcher = MAP_REGEX.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        try {
            long longValue = Long.valueOf(matcher.group(1), 16).longValue();
            return new ProcMapEntry(longValue, Long.valueOf(matcher.group(2), 16).longValue() - longValue, matcher.group(3), matcher.group(4));
        } catch (Exception unused) {
            c a = f.a();
            String b2 = a.b("Could not parse map entry: ", str);
            if (a.a(CrashlyticsCore.TAG, 3)) {
                Log.d(CrashlyticsCore.TAG, b2, (Throwable) null);
            }
            return null;
        }
    }
}
