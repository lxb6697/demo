package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsCommitDetailGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsCommitDetailGetResponse;

/**
 * @author liuxiaobin
 * @date 2020/7/27 14:01
 */
public class pddGoodsCommitDetailGetDemo {

    public static void main(String[] args) throws Exception {
        PopClient client = PopClientBuilder.builder();

        /**
         * pdd.goods.commit.detail.get获取商品提交的商品详情
         * 更新时间：2020-05-13 22:50:09
         * ¥免费
         * 必须用户授权
         * 商品编辑或者提交之后，可以通过此接口查询提交后的编辑信息
         * https://open.pinduoduo.com/application/document/api?id=pdd.goods.commit.detail.get
         */
        PddGoodsCommitDetailGetRequest request = new PddGoodsCommitDetailGetRequest();
        request.setGoodsCommitId(48822768671L);
        request.setGoodsId(158285240499L);
        PddGoodsCommitDetailGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));
    }

}
