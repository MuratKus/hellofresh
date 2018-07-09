/**
 * 
 */
package com.demo.nicolas.mori.modelclass;

/**
 * @author nicolasmori
 *
 */
public class Info {

	public String messages;

	/**
	 * 
	 */
	public Info() {
		super();
	}

	/**
	 * @description
	 * @user nicolasmori 2018-07-06 messages String
	 * @return the messages
	 */
	public String getMessages() {
		return messages;
	}

	/**
	 * @param messages
	 *            the messages to set
	 */
	public void setMessages(String messages) {
		this.messages = messages;
	}

	/**
	 * @param messages
	 */
	public Info(String messages) {
		super();
		this.messages = messages;
	}

}
