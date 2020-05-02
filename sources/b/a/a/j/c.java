package b.a.a.j;

import i.c.e.j;
import java.util.Map;
import nic.goi.aarogyasetu.models.BulkDataObject;
import nic.goi.aarogyasetu.models.network.FCMTokenObject;
import nic.goi.aarogyasetu.models.network.GenerateOTP;
import nic.goi.aarogyasetu.models.network.RegisterationData;
import nic.goi.aarogyasetu.models.network.TokenValidationResponse;
import nic.goi.aarogyasetu.models.network.ValidateOTP;
import org.json.JSONObject;
import q.d;
import q.k0.a;
import q.k0.e;
import q.k0.h;
import q.k0.i;
import q.k0.m;

/* compiled from: PostDataInterface */
public interface c {
    @e("refreshToken")
    d<TokenValidationResponse> a(@h("Authorization") String str);

    @e("/api/v1/users/status")
    d<j> a(@i Map<String, String> map);

    @m("/api/v3/users/data/")
    d<JSONObject> a(@i Map<String, String> map, @a BulkDataObject bulkDataObject);

    @m("/api/v1/users/fcm/")
    d<JSONObject> a(@i Map<String, String> map, @a FCMTokenObject fCMTokenObject);

    @m("generateOTP")
    d<JSONObject> a(@i Map<String, String> map, @a GenerateOTP generateOTP);

    @m("/api/v1/users/register/")
    d<j> a(@i Map<String, String> map, @a RegisterationData registerationData);

    @m("validateOTP")
    d<TokenValidationResponse> a(@i Map<String, String> map, @a ValidateOTP validateOTP);

    @e("/api/v1/app/config")
    d<j> b(@i Map<String, String> map);
}
