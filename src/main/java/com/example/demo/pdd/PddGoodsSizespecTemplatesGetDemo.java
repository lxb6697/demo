package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsSizespecTemplatesGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSizespecTemplatesGetResponse;

/**
 * @author liuxiaobin
 * @date 2020/6/28 11:25
 */
public class PddGoodsSizespecTemplatesGetDemo {

    public static void main(String[] args) throws Exception {
        PopClient client = PopClientBuilder.builder();

        /**
         * pdd.goods.sizespec.templates.get自定义尺码表模版列表
         * 更新时间：2020-03-04 15:17:54
         * ¥免费
         * 必须用户授权
         * 管理尺码表模板时需要查询尺码表模板列表
         */
        PddGoodsSizespecTemplatesGetRequest request = new PddGoodsSizespecTemplatesGetRequest();
        request.setClassId(5L);
        request.setLimit(10L);
        request.setOffset(0L);
        PddGoodsSizespecTemplatesGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));
    }
}
