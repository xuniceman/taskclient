package com.gcexe.monitor.taskclient;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
public class JMSMessageListener implements MessageListener {

	
	public void onMessage(Message message) {
		ObjectMessage msg = (ObjectMessage) message;
		try {

			System.out.println("ipclient1消息内容："+ msg.getObject()+"========="+message.getJMSRedelivered());
		} catch (JMSException e) {
		
			e.printStackTrace();
		}
	}

}
