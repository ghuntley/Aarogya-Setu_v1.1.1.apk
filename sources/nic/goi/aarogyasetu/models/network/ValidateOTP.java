package nic.goi.aarogyasetu.models.network;

public class ValidateOTP {
    public String passcode;
    public String primaryId;

    public ValidateOTP(String str, String str2) {
        this.primaryId = str;
        this.passcode = str2;
    }
}
