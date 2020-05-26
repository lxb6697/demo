package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddRefundListIncrementGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddRefundListIncrementGetResponse;

public class PddRefundListIncrementGetDemo {

    public static void main(String[] args) throws Exception {

        PopClient client = PopClientBuilder.builder();
        /**
         * pdd.refund.list.increment.get（售后列表接口）
         * ¥免费
         * 必须用户授权
         * 售后列表增量查询
         * https://open.pinduoduo.com/#/apidocument/port?portId=pdd.refund.list.increment.get
         */
        PddRefundListIncrementGetRequest request = new PddRefundListIncrementGetRequest();
        request.setAfterSalesStatus(1);
        request.setAfterSalesType(1);
        request.setEndUpdatedAt(1551612046L);
        request.setPage(1);
        request.setPageSize(100);
        request.setStartUpdatedAt(1551612046L);
        PddRefundListIncrementGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));

    }
}