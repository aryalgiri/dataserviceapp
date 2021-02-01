package app.dataservice.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

import app.dataservice.entity.DataServiceApi;
import app.dataservice.entity.DataServiceEntity;
import app.dataservice.entity.SaveRequest;
import app.dataservice.service.DataServiceAPIComponent;
import app.dataservice.service.JsonAppData;

@RestController
@RequestMapping("/dataservice/api")
public class DataServiceAPIController {
	DataServiceAPIComponent  dataServiceAPIComponent;

	@Autowired
	public DataServiceAPIController(DataServiceAPIComponent dataServiceAPIComponent) {
		super();
		this.dataServiceAPIComponent = dataServiceAPIComponent;
	}

	@GetMapping("/getData/{Id}" )
	public DataServiceApi getData(@PathVariable Long Id) {
		//Logger log=Logger.getLogger(DataServiceAPIController.class);
		//log.info("in getDataMethod Start::");
		System.out.println("Start::getData::with ID="+Id);
		return dataServiceAPIComponent.getData(Id);
		
	}
	
	@PostMapping("/save" )
	public String saveDataService(@RequestBody SaveRequest saveReq) {
		System.out.println("SaveDataServiceStart");
		System.out.println("SaveDataServiceStart::saveReq:"+saveReq.getUrl());
		try {
		String jsonRes=performGetRestRequestWithPureJava(saveReq.getUrl());
		ObjectMapper mapper=new ObjectMapper();

	mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	mapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
		JsonAppData dataObj=mapper.readValue(jsonRes, JsonAppData.class);
		//Testing purpose read file from local as calling external API taking more time
		//File file = ResourceUtils.getFile("classpath:static/data.json");
		//JsonAppData dataObj=mapper.readValue(file, JsonAppData.class);
		System.out.println(dataObj.getDisplayFieldName());
		//System.out.println("lenght:"+(dataObj.getFeatures()[0]));
		System.out.println("::::savedata start");
		dataServiceAPIComponent.saveData(dataObj);
		System.out.println("::::savedata end");
		}catch(Exception e){
			e.printStackTrace();
			return "ERROR"+"::error Details:"+e.getMessage();
			
		}
		
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
}
