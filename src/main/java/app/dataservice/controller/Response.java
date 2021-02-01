package app.dataservice.controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty
	private RestResponse RestResponse;
	
	public RestResponse getRestResponse()
	{
		return RestResponse;
	}
	
	public void setResponse(RestResponse restResponse)
	{
		this.RestResponse=restResponse;
	}
	
	public Response()
	{
		
	}
	
	public String toString()
	{
		return RestResponse+" =Response";
	}
}
