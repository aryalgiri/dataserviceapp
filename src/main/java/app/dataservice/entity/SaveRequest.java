package app.dataservice.entity;


public class SaveRequest {
	private String url;
	public SaveRequest()
	{
		
	}
public SaveRequest(String reqUrl) {
	this.url=reqUrl;
}
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
