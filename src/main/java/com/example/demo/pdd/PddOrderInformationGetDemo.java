package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddOrderInformationGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderInformationGetResponse;

public class PddOrderInformationGetDemo {

    public static void main(String[] args) throws Exception {

        PopClient client = PopClientBuilder.builder();
        /**
         * pdd.order.information.get（订单详情）
         * ¥免费
         * 必须用户授权
         * 查询单个订单详情，注：虚拟订单充值手机号信息无法通过此接口获取，请联系虚拟类目运营人员。
         * https://open.pinduoduo.com/#/apidocument/port?portId=pdd.order.information.get
         */
        PddOrderInformationGetRequest request = new PddOrderInformationGetRequest();
        request.setOrderSn("1");
        PddOrderInformationGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));

    }
}