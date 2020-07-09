package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsSizespecTemplateGetRequest;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsSizespecTemplatesGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSizespecTemplateGetResponse;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSizespecTemplatesGetResponse;

/**
 * @author liuxiaobin
 * @date 2020/7/1 18:41
 */
public class PddGoodsSizespecTemplateGetDemo {

    public static void main(String[] args) throws Exception {
        PopClient client = PopClientBuilder.builder();

        /**
         * https://open.pinduoduo.com/application/document/api?id=pdd.goods.sizespec.template.get
         * pdd.goods.sizespec.template.get根据尺码表模板id查询自定义尺码表模版
         * 更新时间：2020-03-04 15:18:00
         * ¥免费
         * 必须用户授权
         * 管理尺码表模板时需要单独查询尺码表模板
         */
        PddGoodsSizespecTemplateGetRequest request = new PddGoodsSizespecTemplateGetRequest();
        request.setId(1L);
        PddGoodsSizespecTemplateGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));
    }

}
