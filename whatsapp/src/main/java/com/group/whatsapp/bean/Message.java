package com.group.whatsapp.bean;

import java.util.Date;

public class Message {
    private String body;
    private Date sentDate;
    private Long sentByContactId;

    public Message() {
    }

    public Message(String body, Long sentByContactId) {
        this.body = body;
        this.sentByContactId = sentByContactId;
    }

    public Message(String body, Date sentDate, Long sentByContactId) {
        this.body = body;
        this.sentDate = sentDate;
        this.sentByContactId = sentByContactId;
    }

    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }

    public Date getSentDate() { return sentDate; }
    public void setSentDate(Date sentDate) { this.sentDate = sentDate; }

    public Long getSentByContactId() { return sentByContactId; }
    public void setSentByContactId(Long sentByContactId) { this.sentByContactId = sentByContactId; }
}
