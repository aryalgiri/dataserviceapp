package app.dataservice.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

import app.dataservice.entity.DataServiceEntity;
import app.dataservice.entity.SaveRequest;
import app.dataservice.service.DataServiceComponent;
import app.dataservice.service.JsonAppData;

@RestController
@RequestMapping("/dataservice")
public class DataServiceController {
	DataServiceComponent dataServiceComponent;
	
	@Autowired
	public DataServiceController(DataServiceComponent dataServiceComponent) {
		//super();
		this.dataServiceComponent = dataServiceComponent;
	}

	static {
		System.out.println("classloaded");
	}


@PostMapping("/save" )
public String saveDataService(@RequestBody SaveRequest saveReq) {
	System.out.println("SaveDataServiceStart");
	System.out.println("SaveDataServiceStart::saveReq:"+saveReq.getUrl());
	try {
	//String jsonRes=performGetRestRequestWithPureJava(saveReq.getUrl());
	
	DataServiceEntity entity=new DataServiceEntity();
	entity.setId(2L);
	//String test="TESTING1";
	ObjectMapper mapper=new ObjectMapper();

mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
mapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
	//JsonAppData dataObj=mapper.readValue(jsonRes, JsonAppData.class);
	File file = ResourceUtils.getFile("classpath:static/data.json");
	JsonAppData dataObj=mapper.readValue(file, JsonAppData.class);
	System.out.println(dataObj.getDisplayFieldName());
	//System.out.println("lenght:"+(dataObj.getFeatures().getAttributes()[0]));
	//entity.setData(jsonRes);
	//entity.setData(test);
	System.out.println("::::savedata start");
	dataServiceComponent.saveData(entity);
	System.out.println("::::savedata end");
	}catch(Exception e){
		e.printStackTrace();
		return "ERROR";
		
	}
	/*System.out.println("calling thread");
	MyThread thread=new MyThread();
	thread.url=saveReq.getUrl();
	thread.start();
	System.out.println("return success");*/
	return "Success";
	
	
}
public String performGetRestRequestWithPureJava(String endPoint) throws Exception {
    URLConnection connection = new URL(endPoint).openConnection();
    String CHARSET="UTF-8";
    connection.setRequestProperty("Accept-Charset", CHARSET);
    connection.setRequestProperty("Accept", "application/json");

    String inputLine;
    StringBuilder sb = new StringBuilder();

    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(),CHARSET));
    while ((inputLine = in.readLine()) != null) {
    	System.out.println(inputLine);
        sb.append(inputLine);
    }
    in.close();

    return sb.toString();
}

class MyThread extends Thread{
	String url;
	public void run()
	{
		System.out.println("In thread start");
		//WebClient cleint=WebClient.create(url);
		try {
		//String jsonRes=performGetRestRequestWithPureJava(url);
		/*ObjectMapper mapper= new ObjectMapper();
		TypeReference <ArrayList<String>> ref=new TypeReference <ArrayList<String>>() {};
		ArrayList<String> data1=mapper.readValue(jsonRes,ref );
		
		System.out.println("size"+data1.size());
		System.out.println(data1.get(0));*/
		
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		//RestTemplate externalAPICall=new RestTemplate();
		//Response responseFromAPI=externalAPICall.getForObject(url, Response.class);
		//URL url1=new URL(url);
		//HttpURLConnection con=(HttpURLConnection)url.openConnection();
		//Log for internal testing 
	//	System.out.println(responseFromAPI.toString());
		System.out.println("End");
		
	}
	
}
	

}
