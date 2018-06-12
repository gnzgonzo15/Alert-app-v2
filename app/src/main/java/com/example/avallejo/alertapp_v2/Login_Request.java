package com.example.avallejo.alertapp_v2;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class Login_Request extends StringRequest {

    private static final String LOGIN_REQUEST_URL = "http://192.168.1.23:8090/App_BD/App_login.php";
    private Map<String, String> params;

    public Login_Request(String APP_USER, String APP_PASS, Response.Listener<String> listener) {


        super(Method.POST, LOGIN_REQUEST_URL, listener, null);

        params = new HashMap<>();
        params.put("APP_USER", APP_USER);
        params.put("APP_PASS", APP_PASS);

    }

    public Map<String, String> getParams() {return params;}

}
