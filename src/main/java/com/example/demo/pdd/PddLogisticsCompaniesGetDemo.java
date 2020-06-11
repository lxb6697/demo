package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddLogisticsCompaniesGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsCompaniesGetResponse;

public class PddLogisticsCompaniesGetDemo {

    public static void main(String[] args) throws Exception {

        PopClient client = PopClientBuilder.builder();
        /**
         * pdd.logistics.companies.get快递公司查看接口
         * 更新时间：2019-07-02 11:18:02
         * ¥免费不需用户授权
         * 获取快递公司名称
         * https://open.pinduoduo.com/application/document/api?id=pdd.logistics.companies.get
         */
        PddLogisticsCompaniesGetRequest request = new PddLogisticsCompaniesGetRequest();
        PddLogisticsCompaniesGetResponse response = client.syncInvoke(request);
        System.out.println(JsonUtil.transferToJson(response));

    }
}
