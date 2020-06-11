package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddLogisticsOrdertraceGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsOrdertraceGetResponse;

public class PddLogisticsOrderTraceGetDemo {

    public static void main(String[] args) throws Exception {

        PopClient client = PopClientBuilder.builder();
        /**
         * pdd.logistics.ordertrace.get轨迹查询接口
         * 更新时间：2019-08-28 12:10:37
         * ¥免费不需用户授权
         * 查询单个运单详情
         * https://open.pinduoduo.com/application/document/api?id=pdd.logistics.ordertrace.get
         */
        PddLogisticsOrdertraceGetRequest request = new PddLogisticsOrdertraceGetRequest();
        request.setCompanyCode("ZTO");
        request.setMailNo("3568568521");
        request.setCache(true);
        PddLogisticsOrdertraceGetResponse response = client.syncInvoke(request);
        System.out.println(JsonUtil.transferToJson(response));

    }
}
