package com.arleex.wechat.miniprogram.api.subscribemessage;

import com.arleex.wechat.miniprogram.api.subscribemessage.request.SubscribeMessageRequest;

import java.util.List;

/**
 * @author spaco
 */
public class SubscribeMessageServiceImpl implements SubscribeMessageService{
    @Override
    public String addTemplate(String tid, List<Integer> kidList, String sceneDesc) {
        return null;
    }

    @Override
    public String deleteTemplate(String priTmplId) {
        return null;
    }

    @Override
    public String getCategory() {
        return null;
    }

    @Override
    public String getPubTemplateKeyWordsById(String tid) {
        return null;
    }

    @Override
    public String getPubTemplateTitleList(String ids, String start, String limit) {
        return null;
    }

    @Override
    public String getTemplateList() {
        return null;
    }

    @Override
    public String send(SubscribeMessageRequest message) {
        return null;
    }
}
