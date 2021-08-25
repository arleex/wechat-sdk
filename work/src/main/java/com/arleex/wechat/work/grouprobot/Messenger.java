package com.arleex.wechat.work.grouprobot;

import java.util.Objects;

public class Messenger {

    protected Message message;

    protected String groupKey;

    protected Client client;

    public Messenger(Client client) {
        this.client = client;
    }

    public Messenger message(Message message) {
        this.message = message;

        return this;
    }

    public Messenger toGroup(String groupKey) {
        this.groupKey = groupKey;

        return this;
    }

    public void send() {
        if (Objects.isNull(this.message)) {
            throw new RuntimeException("No message to send.");
        }
        if (Objects.isNull(this.groupKey)) {
            throw new RuntimeException("No group key specified.");
        }

        this.client.send(this.groupKey,this.message);
    }
}

