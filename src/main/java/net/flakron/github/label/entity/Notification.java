package net.flakron.github.label.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Notification {

    private String color;

    private String message;

    private Boolean notify;

    @JsonProperty("message_format")
    private String messageFormat;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getNotify() {
        return notify;
    }

    public void setNotify(Boolean notify) {
        this.notify = notify;
    }

    public String getMessageFormat() {
        return messageFormat;
    }

    public void setMessageFormat(String messageFormat) {
        this.messageFormat = messageFormat;
    }
}
