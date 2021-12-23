package com.group.whatsapp.bean;

import java.util.List;

public class GroupMember {
    private Long groupId;
    private Long contactId;
    private Long muteNotifications = 0L;
    private String wallpaper;
    private List<Message> newMessages;

    public Long getGroupId() { return groupId; }
    public void setGroupId(Long groupId) { this.groupId = groupId; }

    public Long getContactId() { return contactId; }
    public void setContactId(Long contactId) { this.contactId = contactId; }

    public Long getMuteNotifications() { return muteNotifications; }
    public void setMuteNotifications(Long muteNotifications) { this.muteNotifications = muteNotifications; }

    public String getWallpaper() { return wallpaper; }
    public void setWallpaper(String wallpaper) { this.wallpaper = wallpaper; }

    public List<Message> getNewMessages() { return newMessages; }
    public void setNewMessages(List<Message> newMessages) { this.newMessages = newMessages; }
}
