package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddOrderNumberListIncrementGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderNumberListIncrementGetResponse;

public class PddOrderNumberListIncrementGetDemo {

    public static void main(String[] args) throws Exception {

        PopClient client = PopClientBuilder.builder();
        /**
         * pdd.order.number.list.increment.get（订单增量接口）
         * ¥免费
         * 必须用户授权
         * 查询订单增量，注：虚拟订单充值手机号信息无法通过此接口获取，请联系虚拟类目运营人员。 拉取卖家已卖出的增量交易数据（只能获取到成交时间三个月以内的交易信息） ①. 一次请求只能查询时间跨度为30分钟的增量交易记录，即end_updated_at - start_updated_at<= 30min。 ②. 通过从后往前翻页的方式以及结束时间不小于拼多多系统时间前3min可以避免漏单问题。
         * https://open.pinduoduo.com/#/apidocument/port?portId=pdd.order.number.list.increment.get
         */
        PddOrderNumberListIncrementGetRequest request = new PddOrderNumberListIncrementGetRequest();
        request.setIsLuckyFlag(1);
        request.setOrderStatus(1);
        request.setStartUpdatedAt(1L);
        request.setEndUpdatedAt(1L);
        request.setPageSize(1);
        request.setPage(1);
        request.setRefundStatus(1);
        request.setTradeType(1);
        request.setUseHasNext(false);
        PddOrderNumberListIncrementGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));

    }
}