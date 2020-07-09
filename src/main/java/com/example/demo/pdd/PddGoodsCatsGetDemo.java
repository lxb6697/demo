package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsCatsGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsCatsGetResponse;

/**
 * @author liuxiaobin
 * @date 2020/6/28 10:33
 */
public class PddGoodsCatsGetDemo {

    public static void main(String[] args) throws Exception {
        PopClient client = PopClientBuilder.builder();

        /**
         * https://open.pinduoduo.com/application/document/api?id=pdd.goods.cats.get
         * pdd.goods.cats.get商品标准类目接口
         * 更新时间：2018-10-24 15:27:26
         * ¥免费
         * 不需用户授权
         * 获取拼多多标准商品类目信息（请使用pdd.goods.authorization.cats接口获取商家可发布类目）
         */
        PddGoodsCatsGetRequest request = new PddGoodsCatsGetRequest();
        request.setParentCatId(0L);
        PddGoodsCatsGetResponse response = client.syncInvoke(request);
        System.out.println(JsonUtil.transferToJson(response));
    }
}
