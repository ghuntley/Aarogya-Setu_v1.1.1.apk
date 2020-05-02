package nic.goi.aarogyasetu.models.network;

import i.c.e.s.b;

public class TokenValidationResponse {
    @b("auth_token")
    public String authToken;
    @b("refresh_token")
    public String refreshToken;

    public String getAuthToken() {
        return this.authToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }
}
