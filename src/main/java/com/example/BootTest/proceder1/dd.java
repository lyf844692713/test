package com.example.BootTest.proceder1;

import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author carzy
 * @date 2018/08/01
 */
@RestController
public class dd {

//    private JmsMessagingTemplate jmsTemplate;
//
//    @Autowired
//    public void setJmsTemplate(JmsMessagingTemplate jmsTemplate) {
//        this.jmsTemplate = jmsTemplate;
//    }
//
//    @GetMapping("jms/queue")
//    public void jmsQueueTemplate(@RequestParam String value) {
//        Destination destination = new ActiveMQQueue("queueTest");
//        this.jmsTemplate.convertAndSend(destination, value);
//    }
//
//    @GetMapping("jms/topic")
//    public void jmsTopicTemplate(@RequestParam String value) {
//        // 可以将以下步骤封装进service 层, 并暴露出一个 destinationName 和 message 出来
//        Destination destination = new ActiveMQTopic("topicTest");
//        this.jmsTemplate.convertAndSend(destination, value);
//    }

}