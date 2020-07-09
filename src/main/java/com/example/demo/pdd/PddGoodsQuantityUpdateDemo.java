package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsQuantityUpdateRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsQuantityUpdateResponse;

/**
 * @author liuxiaobin
 * @date 2020/6/28 11:52
 */
public class PddGoodsQuantityUpdateDemo {

    public static void main(String[] args) throws Exception {
        PopClient client = PopClientBuilder.builder();

        /**
         * https://open.pinduoduo.com/application/document/api?id=pdd.goods.quantity.update
         * pdd.goods.quantity.update商品库存更新接口
         * 更新时间：2018-10-24 20:06:46
         * ¥免费
         * 必须用户授权
         * 修改商品sku库存，在资源位上的商品不能减少库存
         */
        PddGoodsQuantityUpdateRequest request = new PddGoodsQuantityUpdateRequest();
        request.setGoodsId(126050052488L);
        request.setQuantity(10L);
        request.setSkuId(564681354544L);
        request.setOuterId("str");
        request.setUpdateType(2);
        PddGoodsQuantityUpdateResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));
    }
}
