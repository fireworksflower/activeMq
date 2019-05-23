package com.hh.sendactivemq;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import javax.jms.*;

public class JmsUtil {
    public static void sendMessage(JmsTemplate jmsTemplate, Destination destination, final String message) {

        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
    }
}

