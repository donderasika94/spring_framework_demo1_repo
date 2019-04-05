package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.MessageProvider;

public class MessageRenderer{

	private MessageProvider messageProvider;

	public MessageRenderer(MessageProvider messageProvider){
		this.messageProvider = messageProvider;
		System.out.println("Constructor Injection Using Xml Configuration.....");
	}

	/*public void setMessageProvider(MessageProvider messageProvider){
	
		this.messageProvider = messageProvider;

	}*/

	public void render(){

		System.out.println(messageProvider.getMessage());	
	}
}