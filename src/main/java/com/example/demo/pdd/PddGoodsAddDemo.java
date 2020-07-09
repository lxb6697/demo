package com.example.demo.pdd;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.sdk.http.PopClient;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsAddRequest;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsAddRequest.CarouselVideoItem;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsAddRequest.ElecGoodsAttributes;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsAddRequest.GoodsPropertiesItem;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsAddRequest.GoodsTradeAttr;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsAddRequest.GoodsTradeAttrBookingNotes;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsAddRequest.GoodsTravelAttr;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsAddRequest.SkuListItem;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsAddRequest.OverseaGoods;
import com.pdd.pop.sdk.http.api.pop.request.PddGoodsAddRequest.SkuListItemOverseaSku;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsAddResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuxiaobin
 * @date 2020/6/28 17:31
 */
public class PddGoodsAddDemo {


    public static void main(String[] args) throws Exception {
        PopClient client = PopClientBuilder.builder();

        /**
         * https://open.pinduoduo.com/application/document/api?id=pdd.goods.add
         * pdd.goods.add商品新增接口
         * 更新时间：2020-05-13 22:43:10
         * ¥免费
         * 必须用户授权
         * 单个商品发布，需要配合pdd.goods.image.upload上传主图及商品详情图片，每个店铺一天可调用1200次，3次/秒。
         */
        PddGoodsAddRequest request = new PddGoodsAddRequest();
//        request.setBadFruitClaim(0);
//        request.setBuyLimit(0L);
        List<String> carouselGallery = new ArrayList<>();
        carouselGallery.add("http://t00img.yangkeduo.com/openapi/images/2020-06-28/f0cafea648a9abe909de0a2de87e3b2b.png");
        request.setCarouselGallery(carouselGallery);
        List<PddGoodsAddRequest.CarouselVideoItem> carouselVideo = new ArrayList<>();

//        CarouselVideoItem item = new CarouselVideoItem();
//        item.setFileId(0L);
//        item.setVideoUrl("str");
//        carouselVideo.add(item);
//        request.setCarouselVideo(carouselVideo);
//        request.setCarouselVideoUrl("str");
        request.setCatId(435L);
        request.setCostTemplateId(142769062418478L);
        request.setCountryId(48);
//        request.setCustomerNum(0L);
//        request.setCustoms("str");
//        request.setDeliveryOneDay(0);
        List<String> detailGallery = new ArrayList<>();
        detailGallery.add("http://t00img.yangkeduo.com/openapi/images/2020-06-28/f0cafea648a9abe909de0a2de87e3b2b.png");
        request.setDetailGallery(detailGallery);

//        ElecGoodsAttributes elecGoodsAttributes = new ElecGoodsAttributes();
//        elecGoodsAttributes.setBeginTime(0L);
//        elecGoodsAttributes.setDaysTime(0);
//        elecGoodsAttributes.setEndTime(0L);
//        elecGoodsAttributes.setTimeType(0);
//        request.setElecGoodsAttributes(elecGoodsAttributes);
        request.setGoodsDesc("新包装，保证产品的口感和新鲜度。单颗独立小包装，双重营养，1斤家庭分享装，更实惠新疆一级骏枣夹核桃仁");
        request.setGoodsName("新疆特产 红满疆枣夹核桃500g");
//        List<GoodsPropertiesItem> goodsProperties = new ArrayList<>();

//        GoodsPropertiesItem item1 = new GoodsPropertiesItem();
//        item1.setGroupId(0);
//        item1.setImgUrl("str");
//        item1.setNote("str");
//        item1.setParentSpecId(0L);
//        item1.setRefPid(0L);
//        item1.setSpecId(0L);
//        item1.setTemplatePid(0L);
//        item1.setValue("str");
//        item1.setValueUnit("str");
//        item1.setVid(0L);
//        goodsProperties.add(item1);
//        request.setGoodsProperties(goodsProperties);

//        GoodsTradeAttr goodsTradeAttr = new GoodsTradeAttr();
//        goodsTradeAttr.setAdvancesDays(0);
//
//        GoodsTradeAttrBookingNotes bookingNotes = new GoodsTradeAttrBookingNotes();
//        bookingNotes.setUrl("str");
//        goodsTradeAttr.setBookingNotes(bookingNotes);
//        goodsTradeAttr.setLifeSpan(0);
//        request.setGoodsTradeAttr(goodsTradeAttr);

//        GoodsTravelAttr goodsTravelAttr = new GoodsTravelAttr();
//        goodsTravelAttr.setNeedTourist(false);
//        goodsTravelAttr.setType(0);
//        request.setGoodsTravelAttr(goodsTravelAttr);
        request.setGoodsType(1);
//        request.setImageUrl("str");
//        request.setInvoiceStatus(false);
//        request.setIsCustoms(false);
        request.setIsFolt(false);
        request.setIsPreSale(false);
        request.setIsRefundable(false);
//        request.setLackOfWeightClaim(0);
//        request.setMaiJiaZiTi("str");
        request.setMarketPrice(399999L);
//        request.setOrderLimit(0);
//        request.setOriginCountryId(0);
        request.setOutGoodsId("outGoodsId_100001");

//        OverseaGoods overseaGoods = new OverseaGoods();
//        overseaGoods.setBondedWarehouseKey("str");
//        overseaGoods.setConsumptionTaxRate(0);
//        overseaGoods.setCustomsBroker("str");
//        overseaGoods.setHsCode("str");
//        overseaGoods.setValueAddedTaxRate(0);
//        request.setOverseaGoods(overseaGoods);
//        request.setOverseaType(0);
//        request.setPreSaleTime(0L);
//        request.setQuanGuoLianBao(0);
        request.setSecondHand(false);
//        request.setShangMenAnZhuang("str");
        request.setShipmentLimitSecond(48 * 60 * 60L);
//        request.setSizeSpecId(0L);
        List<SkuListItem> skuList = new ArrayList<>();

        SkuListItem item2 = new SkuListItem();
        item2.setIsOnsale(0);
//        item2.setLength(0L);
        item2.setLimitQuantity(999L);
        item2.setMultiPrice(299999L);
        item2.setOutSkuSn("outSkuSn_100001");

//        SkuListItemOverseaSku overseaSku = new SkuListItemOverseaSku();
//        overseaSku.setMeasurementCode("str");
//        overseaSku.setSpecifications("str");
//        overseaSku.setTaxation(0);
//        item2.setOverseaSku(overseaSku);
        item2.setPrice(399999L);
        item2.setQuantity(10L);
        item2.setSpecIdList("[54780,218376]");
        item2.setThumbUrl("http://t00img.yangkeduo.com/openapi/images/2020-06-28/f0cafea648a9abe909de0a2de87e3b2b.png");
        item2.setWeight(100L);
        skuList.add(item2);
        request.setSkuList(skuList);
//        request.setSkuType(0);
//        request.setSongHuoAnZhuang("str");
//        request.setSongHuoRuHu("str");
//        request.setTinyName("str");
//        request.setWarehouse("str");
//        request.setWarmTips("str");
//        request.setZhiHuanBuXiu(0);
        PddGoodsAddResponse response = client.syncInvoke(request, PopClientBuilder.accessToken);
        System.out.println(JsonUtil.transferToJson(response));
    }
}
