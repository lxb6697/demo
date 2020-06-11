package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddLogisticsAddressGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsAddressGetResponse;

public class PddLogisticsAddressGetDemo {

    public static void main(String[] args) throws Exception {

        PopClient client = PopClientBuilder.builder();
        /**
         * pdd.logistics.address.get获取拼多多标准国家地址库
         * 更新时间：2018-10-31 20:51:44
         * ¥免费不需用户授权
         * 获取拼多多标准国家地址库
         * https://open.pinduoduo.com/application/document/api?id=pdd.logistics.address.get
         */
        PddLogisticsAddressGetRequest request = new PddLogisticsAddressGetRequest();
        PddLogisticsAddressGetResponse response = client.syncInvoke(request);
        System.out.println(JsonUtil.transferToJson(response));

    }
}
