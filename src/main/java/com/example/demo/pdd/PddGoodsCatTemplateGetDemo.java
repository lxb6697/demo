package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsCatTemplateGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsCatTemplateGetResponse;

public class PddGoodsCatTemplateGetDemo {

    public static void main(String[] args) throws Exception {
        PopClient client = PopClientBuilder.builder();

        /**
         * pdd.goods.cat.template.get（获取商品类目属性）
         * ¥免费
         * 必须用户授权
         * 商品发布前，需要查询该类目的商品发布需要的属性，获取商品发布需要的模板-属性-属性值
         * https://open.pinduoduo.com/#/apidocument/port?portId=pdd.goods.cat.template.get
         */
        PddGoodsCatTemplateGetRequest request = new PddGoodsCatTemplateGetRequest();
        request.setCatId(435L);
        PddGoodsCatTemplateGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));
    }
}