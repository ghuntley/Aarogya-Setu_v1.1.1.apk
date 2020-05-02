package nic.goi.aarogyasetu.models;

public class LanguageDTO {
    public String mLanguageCode;
    public String mLanguageTitle;

    public LanguageDTO(String str, String str2) {
        this.mLanguageCode = str;
        this.mLanguageTitle = str2;
    }

    public String getLanguageCode() {
        return this.mLanguageCode;
    }

    public String getLanguageTitle() {
        return this.mLanguageTitle;
    }
}
