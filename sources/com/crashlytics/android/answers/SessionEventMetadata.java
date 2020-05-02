package com.crashlytics.android.answers;

import i.a.a.a.a;

public final class SessionEventMetadata {
    public final String appBundleId;
    public final String appVersionCode;
    public final String appVersionName;
    public final String betaDeviceToken;
    public final String buildId;
    public final String deviceModel;
    public final String executionId;
    public final String installationId;
    public final Boolean limitAdTrackingEnabled;
    public final String osVersion;
    public String stringRepresentation;

    public SessionEventMetadata(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.appBundleId = str;
        this.executionId = str2;
        this.installationId = str3;
        this.limitAdTrackingEnabled = bool;
        this.betaDeviceToken = str4;
        this.buildId = str5;
        this.osVersion = str6;
        this.deviceModel = str7;
        this.appVersionCode = str8;
        this.appVersionName = str9;
    }

    public String toString() {
        if (this.stringRepresentation == null) {
            StringBuilder a = a.a("appBundleId=");
            a.append(this.appBundleId);
            a.append(", executionId=");
            a.append(this.executionId);
            a.append(", installationId=");
            a.append(this.installationId);
            a.append(", limitAdTrackingEnabled=");
            a.append(this.limitAdTrackingEnabled);
            a.append(", betaDeviceToken=");
            a.append(this.betaDeviceToken);
            a.append(", buildId=");
            a.append(this.buildId);
            a.append(", osVersion=");
            a.append(this.osVersion);
            a.append(", deviceModel=");
            a.append(this.deviceModel);
            a.append(", appVersionCode=");
            a.append(this.appVersionCode);
            a.append(", appVersionName=");
            a.append(this.appVersionName);
            this.stringRepresentation = a.toString();
        }
        return this.stringRepresentation;
    }
}
