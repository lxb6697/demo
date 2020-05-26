package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddOrderListGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderListGetResponse;

public class PddOrderListGetDemo {

    public static void main(String[] args) throws Exception {

        PopClient client = PopClientBuilder.builder();
        /**
         * pdd.order.list.get（订单列表查询接口（根据成交时间））
         * ¥免费
         * 必须用户授权
         * 根据成团时间查询订单列表，注：虚拟订单充值手机号信息无法通过此接口获取，请联系虚拟类目运营人员。
         * https://open.pinduoduo.com/#/apidocument/port?portId=pdd.order.list.get
         */
        PddOrderListGetRequest request = new PddOrderListGetRequest();
        request.setOrderStatus(1);
        request.setRefundStatus(1);
        request.setStartConfirmAt(1L);
        request.setEndConfirmAt(1L);
        request.setPage(1);
        request.setPageSize(1);
        request.setTradeType(1);
        request.setUseHasNext(true);
        PddOrderListGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));

    }
}