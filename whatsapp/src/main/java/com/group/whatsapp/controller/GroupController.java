package com.group.whatsapp.controller;

import com.group.whatsapp.bean.Group;
import com.group.whatsapp.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping("/group")
    public Group group(@RequestParam(value = "groupId") Long groupId) {
        return groupService.getGroupById(groupId);
    }
}
