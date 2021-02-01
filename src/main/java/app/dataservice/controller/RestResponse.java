package app.dataservice.controller;

import java.util.Arrays;

public class RestResponse {
	private String[] messages;
	//private Result result;

	public String[] getMessages() {
		return messages;
	}

	public void setMessages(String[] messages) {
		this.messages = messages;
	}
public RestResponse()
{
	
}
public String toString()
{
	return Arrays.deepToString(messages);
}
}
