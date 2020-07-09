package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsLogisticsTemplateGetRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsLogisticsTemplateGetResponse;

/**
 * @author liuxiaobin
 * @date 2020/6/28 13:24
 */
public class PddGoodsLogisticsTemplateGetDemo {

    public static void main(String[] args) throws Exception {
        PopClient client = PopClientBuilder.builder();

        /**
         * https://open.pinduoduo.com/application/document/api?id=pdd.goods.logistics.template.get
         * pdd.goods.logistics.template.get商品运费模版接口
         * 更新时间：2018-12-25 22:52:09
         * ¥免费
         * 必须用户授权
         * 获取拼多多商家的物流运费模板信息
         */
        PddGoodsLogisticsTemplateGetRequest request = new PddGoodsLogisticsTemplateGetRequest();
        request.setPage(1);
        request.setPageSize(10);
        PddGoodsLogisticsTemplateGetResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));
        //{"goods_logistics_template_get_response":{"total_count":2,"logistics_template_list":[{"sf_free_type":0,"cost_template_list":[],"template_id":142769062418478,"template_name":"非偏远包邮默认模板-20200518101619","cost_type":0,"free_province_list":[{"province_id":2,"province":"北京市"},{"province_id":3,"province":"安徽省"},{"province_id":4,"province":"福建省"},{"province_id":6,"province":"广东省"},{"province_id":7,"province":"广西壮族自治区"},{"province_id":8,"province":"贵州省"},{"province_id":10,"province":"河北省"},{"province_id":11,"province":"河南省"},{"province_id":12,"province":"黑龙江省"},{"province_id":13,"province":"湖北省"},{"province_id":14,"province":"湖南省"},{"province_id":15,"province":"吉林省"},{"province_id":16,"province":"江苏省"},{"province_id":17,"province":"江西省"},{"province_id":18,"province":"辽宁省"},{"province_id":22,"province":"山东省"},{"province_id":23,"province":"山西省"},{"province_id":24,"province":"陕西省"},{"province_id":25,"province":"上海市"},{"province_id":26,"province":"四川省"},{"province_id":27,"province":"天津市"},{"province_id":30,"province":"云南省"},{"province_id":31,"province":"浙江省"},{"province_id":32,"province":"重庆市"}]},{"sf_free_type":0,"cost_template_list":[],"template_id":142737988918318,"template_name":"包邮默认模板-20200518101619","cost_type":0,"free_province_list":[{"province_id":2,"province":"北京市"},{"province_id":3,"province":"安徽省"},{"province_id":4,"province":"福建省"},{"province_id":5,"province":"甘肃省"},{"province_id":6,"province":"广东省"},{"province_id":7,"province":"广西壮族自治区"},{"province_id":8,"province":"贵州省"},{"province_id":9,"province":"海南省"},{"province_id":10,"province":"河北省"},{"province_id":11,"province":"河南省"},{"province_id":12,"province":"黑龙江省"},{"province_id":13,"province":"湖北省"},{"province_id":14,"province":"湖南省"},{"province_id":15,"province":"吉林省"},{"province_id":16,"province":"江苏省"},{"province_id":17,"province":"江西省"},{"province_id":18,"province":"辽宁省"},{"province_id":19,"province":"内蒙古自治区"},{"province_id":20,"province":"宁夏回族自治区"},{"province_id":21,"province":"青海省"},{"province_id":22,"province":"山东省"},{"province_id":23,"province":"山西省"},{"province_id":24,"province":"陕西省"},{"province_id":25,"province":"上海市"},{"province_id":26,"province":"四川省"},{"province_id":27,"province":"天津市"},{"province_id":28,"province":"西藏自治区"},{"province_id":29,"province":"新疆维吾尔自治区"},{"province_id":30,"province":"云南省"},{"province_id":31,"province":"浙江省"},{"province_id":32,"province":"重庆市"}]}]}}
    }
}
