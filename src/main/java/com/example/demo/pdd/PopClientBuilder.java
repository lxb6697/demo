package com.example.demo.pdd;

import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.PopHttpClient;

public class PopClientBuilder {

    private static final String clientId = "1ff407086074496cb5f3be18ac10df1f";
    private static final String clientSecret = "75cef2f5c01a8041c76bee39af566e299ad748ad";
    public static final String accessToken = "bba909eabc7a4410bf599e3b1631eb96ff3bc775";

    public static PopClient builder() {
        PopClient client = new PopHttpClient(clientId, clientSecret);
        return  client;
    }
}