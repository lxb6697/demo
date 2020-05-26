package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsDetailGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsDetailGetResponse;

public class PddGoodsDetailGetDemo {

    public static void main(String[] args) throws Exception {
        PopClient client = PopClientBuilder.builder();

        /**
         * pdd.goods.detail.get（商品明细）
         * ¥免费
         * 必须用户授权
         * 新增商品或者修改商品的时候
         * https://open.pinduoduo.com/#/apidocument/port?portId=pdd.goods.detail.get
         */
        PddGoodsDetailGetRequest request = new PddGoodsDetailGetRequest();
        request.setGoodsId(126050052488L);
        PddGoodsDetailGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));
    }
}