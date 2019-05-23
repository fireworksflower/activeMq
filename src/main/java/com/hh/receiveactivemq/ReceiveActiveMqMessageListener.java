package com.hh.receiveactivemq;

import org.springframework.core.task.TaskExecutor;
import org.springframework.util.StringUtils;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by IntelliJ IDEA.
 *
 * @author lijing
 * @date 2019/5/22 18:11
 **/
public class ReceiveActiveMqMessageListener implements MessageListener {
    private TaskExecutor taskExecutor;
    @Override
    public void onMessage(Message message) {
        if(message instanceof TextMessage){
            TextMessage tm = (TextMessage) message;

            String text = null;
            try {
                text = tm.getText();
                if(!StringUtils.isEmpty(text)){
                    System.out.println("接受到的消息是"+text);
                }
            } catch (JMSException e) {
                e.printStackTrace();
            }

        }
    }

    public void setTaskExecutor(TaskExecutor taskExecutor){
        this.taskExecutor = taskExecutor;
    }
}
