package com.example.demo.pdd;

import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.PopHttpClient;

public class PopClientBuilder {

    private static final String clientId = "1ff407086074496cb5f3be18ac10df1f";
    private static final String clientSecret = "75cef2f5c01a8041c76bee39af566e299ad748ad";
    public static final String accessToken = "7c7a10b29dc6445ba462a090e202545e63dd0afb";

    public static PopClient builder() {
        PopClient client = new PopHttpClient(clientId, clientSecret);
        return  client;
    }
}