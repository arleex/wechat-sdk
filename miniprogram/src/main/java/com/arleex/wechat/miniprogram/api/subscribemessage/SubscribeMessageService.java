package com.arleex.wechat.miniprogram.api.subscribemessage;

import com.arleex.wechat.miniprogram.api.subscribemessage.request.SubscribeMessage;

import java.util.List;

/**
 * @author cat
 */
public interface SubscribeMessageService {

    /**
     * <pre>
     * 组合模板并添加至帐号下的个人模板库
     *
     * 详情：<a href="https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.addTemplate.html">组合模板并添加至帐号下的个人模板库</a>
     * </pre>
     *
     * @param tid       模板标题 id，可通过接口获取，也可登录小程序后台查看获取
     * @param kidList   开发者自行组合好的模板关键词列表，关键词顺序可以自由搭配（例如 [3,5,4] 或 [4,5,3]），最多支持5个，最少2个关键词组合
     * @param sceneDesc 服务场景描述，15个字以内
     * @return 添加至帐号下的模板id，发送小程序订阅消息时所需
     */
    public String addTemplate(String tid, List<Integer> kidList, String sceneDesc);

    /**
     * <pre>
     * 删除帐号下的个人模板
     *
     * 详情:<a href="https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.deleteTemplate.html">删除帐号下的个人模板</a>
     * </pre>
     *
     * @param priTmplId  要删除的模板id
     * @return 删除结果
     */
    public String deleteTemplate(String priTmplId);

    /**
     * <pre>
     * 获取小程序账号的类目
     *
     * 详情: <a href="https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.getCategory.html">获取小程序账号的类目</a>
     * </pre>
     *
     * @return 小程序账号的类目
     */
    public String getCategory();

    /**
     * <pre>
     * 获取模板标题下的关键词列表
     *
     * 详情: <a href="https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.getPubTemplateKeyWordsById.html">获取模板标题下的关键词列表</a>
     * </pre>
     *
     * @param tid 模板标题 id，可通过接口获取
     * @return 获取模板标题下的关键词列表
     */
    public String getPubTemplateKeyWordsById(String tid);

    /**
     *
     * <pre>
     * 获取帐号所属类目下的公共模板标题
     *
     * 详情: <a href="https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.getPubTemplateTitleList.html">获取帐号所属类目下的公共模板标题</a>
     * </pre>
     *
     * @param ids 类目 id，多个用逗号隔开
     * @param start 用于分页，表示从 start 开始。从 0 开始计数
     * @param limit 用于分页，表示拉取 limit 条记录。最大为 30
     * @return 获取帐号所属类目下的公共模板标题
     */
    public String getPubTemplateTitleList(String ids, String start, String limit);

    /**
     * <pre>
     * 获取当前帐号下的个人模板列表
     *
     * 详情:<a href="https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.getTemplateList.html">获取当前帐号下的个人模板列表</a>
     * </pre>
     *
     * @return 当前帐号下的个人模板列表
     */
    public String getTemplateList();


    /**
     * <pre>
     * 发送订阅消息
     *
     * 详情:<a href="https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/subscribe-message/subscribeMessage.send.html">发送订阅消息</a>
     * </pre>
     *
     * @param message 消息内容
     * @return 发送订阅消息
     */
    public String send(SubscribeMessage message);
}
