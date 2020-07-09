package com.example.demo.pdd;

import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.PopHttpClient;

public class PopClientBuilder {

    private static final String clientId = "1ff407086074496cb5f3be18ac10df1f";
    private static final String clientSecret = "75cef2f5c01a8041c76bee39af566e299ad748ad";
    public static final String accessToken = "ec6ef2be8d824e9490c0d294f50ba10839fdc341";

    public static PopClient builder() {
        PopClient client = new PopHttpClient(clientId, clientSecret);
        return  client;
    }
}