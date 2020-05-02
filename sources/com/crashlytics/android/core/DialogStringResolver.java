package com.crashlytics.android.core;

import android.content.Context;
import l.a.a.a.o.b.i;
import l.a.a.a.o.g.n;

public class DialogStringResolver {
    public static final String PROMPT_MESSAGE_RES_NAME = "com.crashlytics.CrashSubmissionPromptMessage";
    public static final String PROMPT_TITLE_RES_NAME = "com.crashlytics.CrashSubmissionPromptTitle";
    public static final String SUBMISSION_ALWAYS_SEND_RES_NAME = "com.crashlytics.CrashSubmissionAlwaysSendTitle";
    public static final String SUBMISSION_CANCEL_RES_NAME = "com.crashlytics.CrashSubmissionCancelTitle";
    public static final String SUBMISSION_SEND_RES_NAME = "com.crashlytics.CrashSubmissionSendTitle";
    public final Context context;
    public final n promptData;

    public DialogStringResolver(Context context2, n nVar) {
        this.context = context2;
        this.promptData = nVar;
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    private String resourceOrFallbackValue(String str, String str2) {
        return stringOrFallback(i.a(this.context, str), str2);
    }

    private String stringOrFallback(String str, String str2) {
        return isNullOrEmpty(str) ? str2 : str;
    }

    public String getAlwaysSendButtonTitle() {
        return resourceOrFallbackValue(SUBMISSION_ALWAYS_SEND_RES_NAME, this.promptData.f5183g);
    }

    public String getCancelButtonTitle() {
        return resourceOrFallbackValue(SUBMISSION_CANCEL_RES_NAME, this.promptData.e);
    }

    public String getMessage() {
        return resourceOrFallbackValue(PROMPT_MESSAGE_RES_NAME, this.promptData.f5181b);
    }

    public String getSendButtonTitle() {
        return resourceOrFallbackValue(SUBMISSION_SEND_RES_NAME, this.promptData.c);
    }

    public String getTitle() {
        return resourceOrFallbackValue(PROMPT_TITLE_RES_NAME, this.promptData.a);
    }
}
