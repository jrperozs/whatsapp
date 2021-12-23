package com.group.whatsapp.service;

import com.group.whatsapp.bean.Contact;
import com.group.whatsapp.bean.Group;
import com.group.whatsapp.bean.GroupMember;
import com.group.whatsapp.bean.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GroupService {

    public GroupService() {}

    public Long sendMessage(Long groupId, Message msg) {
        return 1L;
    }

    public Group getGroupById(Long groupId) {
        Group g = new Group();
        g.setGroupId(groupId);
        g.setGroupName("Friends");
        g.setGroupDescription("Childhood Friends");
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(1L, "+11111111111", "Jonh", "Connor", "jonh1@gmail.com", 1L));
        contacts.add(new Contact(2L, "+12222222222", "Jonh", "Lenon", "jonh2@gmail.com", 1L));
        contacts.add(new Contact(3L, "+13333333333", "Jonh", "Travolta", "jonh3@gmail.com", 1L));
        contacts.add(new Contact(4L, "+14444444444", "Jonh", "Biden", "jonh4@gmail.com", 1L));
        contacts.add(new Contact(5L, "+15555555555", "Jonh", "Kennedy", "jonh5@gmail.com", 1L));
        contacts.add(new Contact(6L, "+16666666666", "Jonh", "Wick", "jonh6@gmail.com", 1L));
        g.setContacts(contacts);
        return g;
    }

    private GroupMember getNewMessagesByContactId(Long contactId) {
        GroupMember gm = new GroupMember();
        gm.setContactId(contactId);
        List<Message> newMessages = new ArrayList<>();
        newMessages.add(new Message("test1", new Date(), contactId));
        newMessages.add(new Message("test2", new Date(), contactId));
        gm.setNewMessages(newMessages);
        return gm;
    }
}
