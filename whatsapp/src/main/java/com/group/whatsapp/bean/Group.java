package com.group.whatsapp.bean;

import java.util.List;

public class Group {
    private Long groupId;
    private String groupName;
    private String groupDescription;
    private String pictureLocation;
    private List<Contact> contacts;

    public Long getGroupId() { return groupId; }
    public void setGroupId(Long groupId) { this.groupId = groupId; }

    public String getGroupName() { return groupName; }
    public void setGroupName(String groupName) { this.groupName = groupName; }

    public String getGroupDescription() { return groupDescription; }
    public void setGroupDescription(String groupDescription) { this.groupDescription = groupDescription; }

    public String getPictureLocation() { return pictureLocation; }
    public void setPictureLocation(String pictureLocation) { this.pictureLocation = pictureLocation; }

    public List<Contact> getContacts() { return contacts; }
    public void setContacts(List<Contact> contacts) { this.contacts = contacts; }
}
