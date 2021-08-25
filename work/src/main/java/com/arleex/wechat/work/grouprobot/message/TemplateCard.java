package com.arleex.wechat.work.grouprobot.message;

import com.arleex.wechat.work.grouprobot.Message;

public class TemplateCard  implements Message {
    @Override
    public String type() {
        return "template_card";
    }


}
