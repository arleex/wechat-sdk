package com.arleex.wechat.work.grouprobot.message;

import com.arleex.wechat.work.grouprobot.Message;

public class Text implements Message {


    @Override
    public String type() {
        return "text";
    }

}
