package com.questGlobal.listener;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.questGlobal.event.EmailEvent;

@Component
public class EmailListener {

    @Async //default synchronous
    @EventListener 
    void sendMsgEvent(EmailEvent emailEvent) {
        System.out.println("==EmailListener 1 ==="+emailEvent.getMessage());
    }

    @Async
    @EventListener
    void sendMsgEvent(String message) {
        System.out.println("==EmailListener 2 ==="+message);
    }

}
