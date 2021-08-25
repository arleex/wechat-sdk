package com.arleex.wechat.work.grouprobot.message;

import com.arleex.wechat.work.grouprobot.Message;

public class File implements Message {


    @Override
    public String type() {
        return "file";
    }


}
