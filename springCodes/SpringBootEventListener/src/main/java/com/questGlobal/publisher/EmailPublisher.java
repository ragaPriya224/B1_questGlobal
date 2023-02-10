package com.questGlobal.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.questGlobal.event.EmailEvent;

@Component
public class EmailPublisher {

    private final ApplicationEventPublisher eventPublisher;

    EmailPublisher(ApplicationEventPublisher publisher) {
        this.eventPublisher = publisher;
    }
//publishing method 
    public void publishEmailEvent(EmailEvent event) {
        eventPublisher.publishEvent(event);
    }

    public void publishMsgEvent(String msg) {
        eventPublisher.publishEvent(msg);
    }
}
