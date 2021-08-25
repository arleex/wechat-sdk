package com.arleex.wechat.work.grouprobot.message;

import com.arleex.wechat.work.grouprobot.Message;

public class Markdown implements Message {

    @Override
    public String type() {
        return "markdown";
    }


}
