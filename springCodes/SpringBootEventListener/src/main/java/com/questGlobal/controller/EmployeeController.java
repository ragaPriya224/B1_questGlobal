package com.questGlobal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questGlobal.event.EmailEvent;
import com.questGlobal.publisher.EmailPublisher;

@RestController
public class EmployeeController {

    @Autowired
    EmailPublisher emailPublisher;

    @GetMapping("/notify/event")
    public void publishEvent(){
        emailPublisher
                .publishEmailEvent
                    (new EmailEvent("Employee added."));

        emailPublisher
                .publishMsgEvent
                        ("Exception occurred.");
    }
}
