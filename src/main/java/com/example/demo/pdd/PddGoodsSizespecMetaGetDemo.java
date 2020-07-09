package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsSizespecMetaGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSizespecMetaGetResponse;

/**
 * @author liuxiaobin
 * @date 2020/6/28 11:17
 */
public class PddGoodsSizespecMetaGetDemo {

    public static void main(String[] args) throws Exception {
        PopClient client = PopClientBuilder.builder();

        /**
         * https://open.pinduoduo.com/application/document/api?id=pdd.goods.sizespec.meta.get
         * pdd.goods.sizespec.meta.get尺码组和尺码参数查询
         * 更新时间：2020-03-04 15:18:24
         * ¥免费
         * 必须用户授权
         * 创建尺码表需要查询尺码表分类支持的尺码组和尺码参数（元数据）
         */
        PddGoodsSizespecMetaGetRequest request = new PddGoodsSizespecMetaGetRequest();
        request.setClassId(5);
        PddGoodsSizespecMetaGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));
        //{"response":{"error_code":1000000,"result":{"batchable_element_ids":[],"elements":[{"id":10001,"name":"肩宽(cm)"},{"id":10002,"name":"胸围(cm)"},{"id":10003,"name":"臀围(cm)"},{"id":10004,"name":"身高(cm)"},{"id":10005,"name":"体重(kg)"},{"id":10006,"name":"腰围(cm)"}],"groups":[{"id":1,"name":"通用"},{"id":2,"name":"中国码"},{"id":3,"name":"欧码"},{"id":6,"name":"英码"},{"id":4,"name":"美码"},{"id":7,"name":"德码"},{"id":5,"name":"均码"}]},"success":true}}
    }
}
