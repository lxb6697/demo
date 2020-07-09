package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsSpecGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSpecGetResponse;

/**
 * @author liuxiaobin
 * @date 2020/6/28 10:42
 */
public class PddGoodsSpecGetDemo {

    public static void main(String[] args) throws Exception {
        PopClient client = PopClientBuilder.builder();

        /**
         * pdd.goods.spec.get商品属性类目接口
         * 更新时间：2018-10-24 15:20:34
         * ¥免费
         * 必须用户授权
         * 获取商品规格信息
         */
        PddGoodsSpecGetRequest request = new PddGoodsSpecGetRequest();
        request.setCatId(19188L);
        PddGoodsSpecGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));
        //{"goods_spec_get_response":{"goods_spec_list":[{"cat_id":435,"parent_spec_id":1216,"parent_spec_name":"尺寸"},{"cat_id":435,"parent_spec_id":1473,"parent_spec_name":"型号"},{"cat_id":435,"parent_spec_id":1218,"parent_spec_name":"款式"},{"cat_id":435,"parent_spec_id":173120,"parent_spec_name":"器型"},{"cat_id":435,"parent_spec_id":1282,"parent_spec_name":"材质"},{"cat_id":435,"parent_spec_id":1219,"parent_spec_name":"口味"},{"cat_id":435,"parent_spec_id":3203,"parent_spec_name":"色号"},{"cat_id":435,"parent_spec_id":2499,"parent_spec_name":"适用人群"},{"cat_id":435,"parent_spec_id":1287,"parent_spec_name":"容量"},{"cat_id":435,"parent_spec_id":8137,"parent_spec_name":"花型"},{"cat_id":435,"parent_spec_id":1226,"parent_spec_name":"尺码"},{"cat_id":435,"parent_spec_id":61011436,"parent_spec_name":"地点"},{"cat_id":435,"parent_spec_id":1488,"parent_spec_name":"香型"},{"cat_id":435,"parent_spec_id":8277,"parent_spec_name":"货号"},{"cat_id":435,"parent_spec_id":2774,"parent_spec_name":"组合"},{"cat_id":435,"parent_spec_id":174495,"parent_spec_name":"成份"},{"cat_id":435,"parent_spec_id":10593,"parent_spec_name":"版本"},{"cat_id":435,"parent_spec_id":6883,"parent_spec_name":"度数"},{"cat_id":435,"parent_spec_id":175974,"parent_spec_name":"运营商"},{"cat_id":435,"parent_spec_id":4773,"parent_spec_name":"属性"},{"cat_id":435,"parent_spec_id":1253,"parent_spec_name":"重量"},{"cat_id":435,"parent_spec_id":61209667,"parent_spec_name":"地区"},{"cat_id":435,"parent_spec_id":20711,"parent_spec_name":"套餐"},{"cat_id":435,"parent_spec_id":1384,"parent_spec_name":"类别"},{"cat_id":435,"parent_spec_id":3818,"parent_spec_name":"适用年龄"},{"cat_id":435,"parent_spec_id":1900,"parent_spec_name":"功效"},{"cat_id":435,"parent_spec_id":3820,"parent_spec_name":"品类"},{"cat_id":435,"parent_spec_id":61011218,"parent_spec_name":"时间"},{"cat_id":435,"parent_spec_id":1215,"parent_spec_name":"颜色"}]}}
        //{"goods_spec_get_response":{"goods_spec_list":[{"cat_id":19188,"parent_spec_id":1216,"parent_spec_name":"尺寸"},{"cat_id":19188,"parent_spec_id":1473,"parent_spec_name":"型号"},{"cat_id":19188,"parent_spec_id":1218,"parent_spec_name":"款式"},{"cat_id":19188,"parent_spec_id":173120,"parent_spec_name":"器型"},{"cat_id":19188,"parent_spec_id":1282,"parent_spec_name":"材质"},{"cat_id":19188,"parent_spec_id":1219,"parent_spec_name":"口味"},{"cat_id":19188,"parent_spec_id":3203,"parent_spec_name":"色号"},{"cat_id":19188,"parent_spec_id":2499,"parent_spec_name":"适用人群"},{"cat_id":19188,"parent_spec_id":1287,"parent_spec_name":"容量"},{"cat_id":19188,"parent_spec_id":8137,"parent_spec_name":"花型"},{"cat_id":19188,"parent_spec_id":1226,"parent_spec_name":"尺码"},{"cat_id":19188,"parent_spec_id":61011436,"parent_spec_name":"地点"},{"cat_id":19188,"parent_spec_id":1488,"parent_spec_name":"香型"},{"cat_id":19188,"parent_spec_id":8277,"parent_spec_name":"货号"},{"cat_id":19188,"parent_spec_id":2774,"parent_spec_name":"组合"},{"cat_id":19188,"parent_spec_id":174495,"parent_spec_name":"成份"},{"cat_id":19188,"parent_spec_id":10593,"parent_spec_name":"版本"},{"cat_id":19188,"parent_spec_id":6883,"parent_spec_name":"度数"},{"cat_id":19188,"parent_spec_id":175974,"parent_spec_name":"运营商"},{"cat_id":19188,"parent_spec_id":4773,"parent_spec_name":"属性"},{"cat_id":19188,"parent_spec_id":1253,"parent_spec_name":"重量"},{"cat_id":19188,"parent_spec_id":61209667,"parent_spec_name":"地区"},{"cat_id":19188,"parent_spec_id":20711,"parent_spec_name":"套餐"},{"cat_id":19188,"parent_spec_id":1384,"parent_spec_name":"类别"},{"cat_id":19188,"parent_spec_id":3818,"parent_spec_name":"适用年龄"},{"cat_id":19188,"parent_spec_id":1900,"parent_spec_name":"功效"},{"cat_id":19188,"parent_spec_id":3820,"parent_spec_name":"品类"},{"cat_id":19188,"parent_spec_id":61011218,"parent_spec_name":"时间"},{"cat_id":19188,"parent_spec_id":1215,"parent_spec_name":"颜色"}]}}
    }
}
