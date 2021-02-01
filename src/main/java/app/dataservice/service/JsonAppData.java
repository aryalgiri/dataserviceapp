package app.dataservice.service;

//import java.sql.Date;
import java.util.List;
import java.util.Map;

public class JsonAppData {
	private String displayFieldName;	
	
	
	private String geometryType;
	private SpatialReference spatialReference;
	private Fields[] fields;
	private Boolean exceededTransferLimit;
	private Features[] features;
	private FieldAliases fieldAliases;
	
	public JsonAppData()
	{
		
	}
	public String getDisplayFieldName() {
		return displayFieldName;
	}
	public void setDisplayFieldName(String displayFieldName) {
		this.displayFieldName = displayFieldName;
	}
	public FieldAliases getFieldAliases() {
		return fieldAliases;
	}
	public void setFieldAliases(FieldAliases fieldAliases) {
		this.fieldAliases = fieldAliases;
	}
	public String getGeometryType() {
		return geometryType;
	}
	public void setGeometryType(String geometryType) {
		this.geometryType = geometryType;
	}
	public SpatialReference getSpatialReference() {
		return spatialReference;
	}
	public void setSpatialReference(SpatialReference spatialReference) {
		this.spatialReference = spatialReference;
	}
	public Fields[] getFields() {
		return fields;
	}
	public void setFields(Fields[] fields) {
		this.fields = fields;
	}
	public Boolean getExceededTransferLimit() {
		return exceededTransferLimit;
	}
	public void setExceededTransferLimit(Boolean exceededTransferLimit) {
		this.exceededTransferLimit = exceededTransferLimit;
	}
	public Features[] getFeatures() {
		return features;
	}
	public void setFeatures(Features[] features) {
		this.features = features;
	}
	public JsonAppData(String displayFieldName, FieldAliases fieldAliases,String geometryType,
			SpatialReference spatialReference, Fields[] fields, Boolean exceededTransferLimit, Features[] features) {
		super();
		this.displayFieldName = displayFieldName;
		this.fieldAliases = fieldAliases;
		this.geometryType = geometryType;
		this.spatialReference = spatialReference;
		this.fields = fields;
		this.exceededTransferLimit = exceededTransferLimit;
		this.features = features;
	}
	

}
class Field{
	
	private String name;
	private String  type;
	private String  alias;
	
	public Field()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Field(String name, String type, String alias) {
		super();
		this.name = name;
		this.type = type;
		this.alias = alias;
	}
	
	
}
class Attributes{	
	/*
	 * {"attributes":{"OBJECTID":2,"ENTRY_ID":"ALAMANCEPARCELS8304","ADDR_HN":"4463","ADDR_PD":"","ADDR_PT":"","ADDR_SN":"SPRINGBROOK","ADDR_ST":"DRIVE","ADDR_SD":"","FULL_ADDRESS":"4463 SPRINGBROOK DRIVE ","SUB_HN":null,"APT_UNIT":null,"RES_TYPE":" ","COMMUNITY":null,"ZIPCODE":"27215","PO_NAME":"BURLINGTON","STATE":"NC","COUNTY_NAME":"ALAMANCE","FIPS":1,"STATE_ID":37,"COORSYS":"2264","POINT_X":1867397.48117268,"POINT_Y":812186.97817992,"USNG":"17S PV 39901 82926","DDLat":"35.98075N","DDLon":"079.44818W","PROCESS_ID":"B"},"geometry":{"x":-79.448182477939369,"y":35.980748059662758}},{"attributes":{"OBJECTID":3,"ENTRY_ID":"ALAMANCEPARCELS8347","ADDR_HN":"0","ADDR_PD":"","ADDR_PT":"","ADDR_SN":"HINSHAW SHOP","ADDR_ST":"ROAD","ADDR_SD":"","FULL_ADDRESS":"0 HINSHAW SHOP ROAD ","SUB_HN":null,"APT_UNIT":null,"RES_TYPE":" ","COMMUNITY":null,"ZIPCODE":"27298","PO_NAME":"LIBERTY","STATE":"NC","COUNTY_NAME":"ALAMANCE","FIPS":1,"STATE_ID":37,"COORSYS":"2264","POINT_X":1845560.90115826,"POINT_Y":768834.68069834,"USNG":"17S PV 33517 69581","DDLat":"35.86136N","DDLon":"079.52122W","PROCESS_ID":"B"},"geometry":{"x":-79.521216769280386,"y":35.861360642587442}},{"attributes":{"OBJECTID":4,"ENTRY_ID":"ALAMANCEPARCELS8378","ADDR_HN":"0","ADDR_PD":"","ADDR_PT":"","ADDR_SN":"CLAPP MILL","ADDR_ST":"ROAD","ADDR_SD":"","FULL_ADDRESS":"0 CLAPP MILL ROAD ","SUB_HN":null,"APT_UNIT":null,"RES_TYPE":" ","COMMUNITY":null,"ZIPCODE":"27215","PO_NAME":"BURLINGTON","STATE":"NC","COUNTY_NAME":"ALAMANCE","FIPS":1,"STATE_ID":37,"COORSYS":"2264","POINT_X":1847567.98769526,"POINT_Y":819744.36660843,"USNG":"17S PV 33812 85106","DDLat":"36.00124N","DDLon":"079.51534W","PROCESS_ID":"B"},"geometry":{"x":-79.515335131162786,"y":36.00124430119444}}
	 */
	public Attributes()
{
	
}
	
	private int OBJECTID;

	private String ENTRY_ID;
	private String ADDR_HN;
	private String ADDR_PD;
	private String ADDR_PT;
	private String ADDR_SN;
	private String ADDR_ST;
	private String ADDR_SD;
	private String FULL_ADDRESS;
	private int  SUB_HN;
	private int  APT_UNIT;
	private String RES_TYPE;
	private int  COMMUNITY;
	private String ZIPCODE;
	private String PO_NAME;
	private String STATE;
	private String COUNTY_NAME;
	private int FIPS;
	private int STATE_ID;
	private String COORSYS;
	private double POINT_X;
	private double POINT_Y;
	private String USNG;
	private String DDLat;
	private String DDLon;
	private String PROCESS_ID;
	public int getOBJECTID() {
		return OBJECTID;
	}
	public void setOBJECTID(int oBJECTID) {
		OBJECTID = oBJECTID;
	}
	public String getENTRY_ID() {
		return ENTRY_ID;
	}
	public void setENTRY_ID(String eNTRY_ID) {
		ENTRY_ID = eNTRY_ID;
	}
	public String getADDR_HN() {
		return ADDR_HN;
	}
	public void setADDR_HN(String aDDR_HN) {
		ADDR_HN = aDDR_HN;
	}
	public String getADDR_PD() {
		return ADDR_PD;
	}
	public void setADDR_PD(String aDDR_PD) {
		ADDR_PD = aDDR_PD;
	}
	public String getADDR_PT() {
		return ADDR_PT;
	}
	public void setADDR_PT(String aDDR_PT) {
		ADDR_PT = aDDR_PT;
	}
	public String getADDR_SN() {
		return ADDR_SN;
	}
	public void setADDR_SN(String aDDR_SN) {
		ADDR_SN = aDDR_SN;
	}
	public String getADDR_ST() {
		return ADDR_ST;
	}
	public void setADDR_ST(String aDDR_ST) {
		ADDR_ST = aDDR_ST;
	}
	public String getADDR_SD() {
		return ADDR_SD;
	}
	public void setADDR_SD(String aDDR_SD) {
		ADDR_SD = aDDR_SD;
	}
	public String getFULL_ADDRESS() {
		return FULL_ADDRESS;
	}
	public void setFULL_ADDRESS(String fULL_ADDRESS) {
		FULL_ADDRESS = fULL_ADDRESS;
	}
	public int getSUB_HN() {
		return SUB_HN;
	}
	public void setSUB_HN(int sUB_HN) {
		SUB_HN = sUB_HN;
	}
	public int getAPT_UNIT() {
		return APT_UNIT;
	}
	public void setAPT_UNIT(int aPT_UNIT) {
		APT_UNIT = aPT_UNIT;
	}
	public String getRES_TYPE() {
		return RES_TYPE;
	}
	public void setRES_TYPE(String rES_TYPE) {
		RES_TYPE = rES_TYPE;
	}
	public int getCOMMUNITY() {
		return COMMUNITY;
	}
	public void setCOMMUNITY(int cOMMUNITY) {
		COMMUNITY = cOMMUNITY;
	}
	public String getZIPCODE() {
		return ZIPCODE;
	}
	public void setZIPCODE(String zIPCODE) {
		ZIPCODE = zIPCODE;
	}
	public String getPO_NAME() {
		return PO_NAME;
	}
	public void setPO_NAME(String pO_NAME) {
		PO_NAME = pO_NAME;
	}
	public String getSTATE() {
		return STATE;
	}
	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}
	public String getCOUNTY_NAME() {
		return COUNTY_NAME;
	}
	public void setCOUNTY_NAME(String cOUNTY_NAME) {
		COUNTY_NAME = cOUNTY_NAME;
	}
	public int getFIPS() {
		return FIPS;
	}
	public void setFIPS(int fIPS) {
		FIPS = fIPS;
	}
	public int getSTATE_ID() {
		return STATE_ID;
	}
	public void setSTATE_ID(int sTATE_ID) {
		STATE_ID = sTATE_ID;
	}
	public String getCOORSYS() {
		return COORSYS;
	}
	public void setCOORSYS(String cOORSYS) {
		COORSYS = cOORSYS;
	}
	public double getPOINT_X() {
		return POINT_X;
	}
	public void setPOINT_X(double pOINT_X) {
		POINT_X = pOINT_X;
	}
	public double getPOINT_Y() {
		return POINT_Y;
	}
	public void setPOINT_Y(double pOINT_Y) {
		POINT_Y = pOINT_Y;
	}
	public String getUSNG() {
		return USNG;
	}
	public void setUSNG(String uSNG) {
		USNG = uSNG;
	}
	public String getDDLat() {
		return DDLat;
	}
	public void setDDLat(String dDLat) {
		DDLat = dDLat;
	}
	public String getDDLon() {
		return DDLon;
	}
	public void setDDLon(String dDLon) {
		DDLon = dDLon;
	}
	public String getPROCESS_ID() {
		return PROCESS_ID;
	}
	public void setPROCESS_ID(String pROCESS_ID) {
		PROCESS_ID = pROCESS_ID;
	}
	public Attributes( int oBJECTID, String eNTRY_ID, String aDDR_HN,
			String aDDR_PD, String aDDR_PT, String aDDR_SN, String aDDR_ST, String aDDR_SD, String fULL_ADDRESS,
			int sUB_HN, int aPT_UNIT, String rES_TYPE, int cOMMUNITY, String zIPCODE, String pO_NAME,
			String sTATE, String cOUNTY_NAME, int fIPS, int sTATE_ID, String cOORSYS, double pOINT_X, double pOINT_Y,
			String uSNG, String dDLat, String dDLon, String pROCESS_ID) {
		super();
		OBJECTID = oBJECTID;
		ENTRY_ID = eNTRY_ID;
		ADDR_HN = aDDR_HN;
		ADDR_PD = aDDR_PD;
		ADDR_PT = aDDR_PT;
		ADDR_SN = aDDR_SN;
		ADDR_ST = aDDR_ST;
		ADDR_SD = aDDR_SD;
		FULL_ADDRESS = fULL_ADDRESS;
		SUB_HN = sUB_HN;
		APT_UNIT = aPT_UNIT;
		RES_TYPE = rES_TYPE;
		COMMUNITY = cOMMUNITY;
		ZIPCODE = zIPCODE;
		PO_NAME = pO_NAME;
		STATE = sTATE;
		COUNTY_NAME = cOUNTY_NAME;
		FIPS = fIPS;
		STATE_ID = sTATE_ID;
		COORSYS = cOORSYS;
		POINT_X = pOINT_X;
		POINT_Y = pOINT_Y;
		USNG = uSNG;
		DDLat = dDLat;
		DDLon = dDLon;
		PROCESS_ID = pROCESS_ID;
	}

}
class Features{
	public Features() {
		
	}
	private Map<String,Object> attributes;
	private Map<String,Object> geometry;
	//private Attributes[] attributes;
	public Map<String, Object> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}
	public Map<String, Object> getGeometry() {
		return geometry;
	}
	public void setGeometry(Map<String, Object> geometry) {
		this.geometry = geometry;
	}
	public Features(Map<String, Object> attributes, Map<String, Object> geometry) {
		super();
		this.attributes = attributes;
		this.geometry = geometry;
	}

	
	
	
}
class Geometry{
	public Geometry()
	{
		
	}
	private double x;
	private double y;
	public Geometry(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
}
class Fields{
	public Fields()
	{
		
	}
	
	private String name;
	private String  type;
	private String  alias;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Fields(String name, String type, String alias) {
		super();
		this.name = name;
		this.type = type;
		this.alias = alias;
	}
	
	
	
}
class FieldAliases{
	

	public FieldAliases(String objectid, String entry_ID, String addr_HN, String addr_PD, String addr_PT,
			String addr_SN, String addr_ST, String addr_SD, String full_ADDRESS, String sub_HN, String apt_UNIT,
			String res_TYPE, String community, String zipcode, String po_NAME, String state, String country_NAME,
			String fips, String state_ID, String coorsys, String usng, String ddlat, String ddlon, String process_ID) {
		super();
		this.objectid = objectid;
		this.entry_ID = entry_ID;
		this.addr_HN = addr_HN;
		this.addr_PD = addr_PD;
		this.addr_PT = addr_PT;
		this.addr_SN = addr_SN;
		this.addr_ST = addr_ST;
		this.addr_SD = addr_SD;
		this.full_ADDRESS = full_ADDRESS;
		this.sub_HN = sub_HN;
		this.apt_UNIT = apt_UNIT;
		this.res_TYPE = res_TYPE;
		this.community = community;
		this.zipcode = zipcode;
		this.po_NAME = po_NAME;
		this.state = state;
		this.country_NAME = country_NAME;
		this.fips = fips;
		this.state_ID = state_ID;
		this.coorsys = coorsys;
		this.usng = usng;
		this.ddlat = ddlat;
		this.ddlon = ddlon;
		this.process_ID = process_ID;
	}
	public String getObjectid() {
		return objectid;
	}
	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}
	public String getEntry_ID() {
		return entry_ID;
	}
	public void setEntry_ID(String entry_ID) {
		this.entry_ID = entry_ID;
	}
	public String getAddr_HN() {
		return addr_HN;
	}
	public void setAddr_HN(String addr_HN) {
		this.addr_HN = addr_HN;
	}
	public String getAddr_PD() {
		return addr_PD;
	}
	public void setAddr_PD(String addr_PD) {
		this.addr_PD = addr_PD;
	}
	public String getAddr_PT() {
		return addr_PT;
	}
	public void setAddr_PT(String addr_PT) {
		this.addr_PT = addr_PT;
	}
	public String getAddr_SN() {
		return addr_SN;
	}
	public void setAddr_SN(String addr_SN) {
		this.addr_SN = addr_SN;
	}
	public String getAddr_ST() {
		return addr_ST;
	}
	public void setAddr_ST(String addr_ST) {
		this.addr_ST = addr_ST;
	}
	public String getAddr_SD() {
		return addr_SD;
	}
	public void setAddr_SD(String addr_SD) {
		this.addr_SD = addr_SD;
	}
	public String getFull_ADDRESS() {
		return full_ADDRESS;
	}
	public void setFull_ADDRESS(String full_ADDRESS) {
		this.full_ADDRESS = full_ADDRESS;
	}
	public String getSub_HN() {
		return sub_HN;
	}
	public void setSub_HN(String sub_HN) {
		this.sub_HN = sub_HN;
	}
	public String getApt_UNIT() {
		return apt_UNIT;
	}
	public void setApt_UNIT(String apt_UNIT) {
		this.apt_UNIT = apt_UNIT;
	}
	public String getRes_TYPE() {
		return res_TYPE;
	}
	public void setRes_TYPE(String res_TYPE) {
		this.res_TYPE = res_TYPE;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getPo_NAME() {
		return po_NAME;
	}
	public void setPo_NAME(String po_NAME) {
		this.po_NAME = po_NAME;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry_NAME() {
		return country_NAME;
	}
	public void setCountry_NAME(String country_NAME) {
		this.country_NAME = country_NAME;
	}
	public String getFips() {
		return fips;
	}
	public void setFips(String fips) {
		this.fips = fips;
	}
	public String getState_ID() {
		return state_ID;
	}
	public void setState_ID(String state_ID) {
		this.state_ID = state_ID;
	}
	public String getCoorsys() {
		return coorsys;
	}
	public void setCoorsys(String coorsys) {
		this.coorsys = coorsys;
	}
	public String getUsng() {
		return usng;
	}
	public void setUsng(String usng) {
		this.usng = usng;
	}
	public String getDdlat() {
		return ddlat;
	}
	public void setDdlat(String ddlat) {
		this.ddlat = ddlat;
	}
	public String getDdlon() {
		return ddlon;
	}
	public void setDdlon(String ddlon) {
		this.ddlon = ddlon;
	}
	public String getProcess_ID() {
		return process_ID;
	}
	public void setProcess_ID(String process_ID) {
		this.process_ID = process_ID;
	}
	private String  objectid;

	private String entry_ID;
	private String addr_HN;
	private String addr_PD;
	private String addr_PT;
	private String addr_SN;
	private String addr_ST;
	private String addr_SD;
	private String full_ADDRESS;
	private String sub_HN;
	private String apt_UNIT;
	private String res_TYPE;
	private String community;
	private String zipcode;
	private String po_NAME;
	private String state;
	private String country_NAME;
	private String fips;
	private String  state_ID;
	private String coorsys;
	//private double POINT_X;
	//private double POINT_Y;
	private String usng;
	private String ddlat;
	private String ddlon;
	private String process_ID;
	public FieldAliases()
	{
		System.out.println("aliases");
		
	}
	
	
}
class SpatialReference{
	public SpatialReference()
	{
		
	}
	private Long wkid;
	private Long latestWkid;
	public SpatialReference(Long wkid, Long latestWkid) {
		super();
		this.wkid = wkid;
		this.latestWkid = latestWkid;
	}
	public Long getWkid() {
		return wkid;
	}
	public void setWkid(Long wkid) {
		this.wkid = wkid;
	}
	public Long getLatestWkid() {
		return latestWkid;
	}
	public void setLatestWkid(Long latestWkid) {
		this.latestWkid = latestWkid;
	}
	
	
	
}
