package app.dataservice.controller;

import java.util.ArrayList;

public class Data {
	private String displayFieldName;
	
	//fieldAliases
	Feature features;
	

}


class Feature{
	ArrayList<Attributes> attributes;
}

class Attributes{
	int OBJECT_ID;
	String ENTRY_ID;
	String ADDR_HN;
	
}